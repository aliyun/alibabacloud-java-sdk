// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116;

import com.aliyun.tea.*;
import com.aliyun.lhm20250116.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("lhm", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <h2>Operation description</h2>
     * <p>Saves the table-level configuration for a specified data validation task. Use this operation to specify the source and target tables for comparison, the comparison scope (columns, partitions, filter conditions, and grouping), and the data volume comparison threshold.
     * This operation handles both creating new configurations and updating existing ones. After a validation task is created, you must call this operation to write the table-level configuration before the task has any objects to compare and before validation can be triggered.</p>
     * <h2>Request description</h2>
     * <ul>
     * <li><code>taskId</code> is required. It specifies the ID of the validation task to which the configuration belongs. Obtain this value from the response of the operation that creates a data validation task.</li>
     * <li>The source and target table names, columns, partitions, WHERE conditions, GROUP conditions, and hints are provided in pairs to map a source table to a target table and define the rows and columns to compare. You can specify multiple columns separated by commas (,).</li>
     * <li><code>isFullTableCount</code> determines the comparison granularity: <code>0</code> indicates partition-level comparison, and <code>1</code> indicates full-table comparison.</li>
     * <li><code>totalCountThreshold</code> specifies the total data volume comparison threshold, which determines whether the data volume difference between the source and target is within an acceptable range.</li>
     * <li>When the task creation mode is batch creation in the same pattern (<code>taskMode=1</code>), you can submit multiple table configurations at a time by using <code>taskConfigInfo</code>. Separate multiple configurations with a line break (<code>\\n</code>).</li>
     * </ul>
     * <h2>Response description</h2>
     * <p>The response returns a single value. <code>data</code> contains the configuration ID saved in this operation. You can use this ID to query or delete the table-level configuration later.
     * If <code>success</code> is <code>false</code>, use <code>errCode</code> and <code>errMessage</code> to identify the cause of the failure. Use <code>requestId</code> to troubleshoot the call.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates or updates the table-level configuration of a data validation task to specify the tables to validate, the validation scope, and the comparison rules.</p>
     * 
     * @param request AddDataCheckConfigRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddDataCheckConfigResponse
     */
    public AddDataCheckConfigResponse addDataCheckConfigWithOptions(AddDataCheckConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.isFullTableCount)) {
            body.put("isFullTableCount", request.isFullTableCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceColumns)) {
            body.put("sourceColumns", request.sourceColumns);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceGroupClause)) {
            body.put("sourceGroupClause", request.sourceGroupClause);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceHint)) {
            body.put("sourceHint", request.sourceHint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourcePartition)) {
            body.put("sourcePartition", request.sourcePartition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceTable)) {
            body.put("sourceTable", request.sourceTable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceWhereClause)) {
            body.put("sourceWhereClause", request.sourceWhereClause);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetColumns)) {
            body.put("targetColumns", request.targetColumns);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetGroupClause)) {
            body.put("targetGroupClause", request.targetGroupClause);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetHint)) {
            body.put("targetHint", request.targetHint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetPartition)) {
            body.put("targetPartition", request.targetPartition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetTable)) {
            body.put("targetTable", request.targetTable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetWhereClause)) {
            body.put("targetWhereClause", request.targetWhereClause);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskConfigInfo)) {
            body.put("taskConfigInfo", request.taskConfigInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("taskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.totalCountThreshold)) {
            body.put("totalCountThreshold", request.totalCountThreshold);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddDataCheckConfig"),
            new TeaPair("version", "2025-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dataCheck/config/v3/saveConfig"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddDataCheckConfigResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Saves the table-level configuration for a specified data validation task. Use this operation to specify the source and target tables for comparison, the comparison scope (columns, partitions, filter conditions, and grouping), and the data volume comparison threshold.
     * This operation handles both creating new configurations and updating existing ones. After a validation task is created, you must call this operation to write the table-level configuration before the task has any objects to compare and before validation can be triggered.</p>
     * <h2>Request description</h2>
     * <ul>
     * <li><code>taskId</code> is required. It specifies the ID of the validation task to which the configuration belongs. Obtain this value from the response of the operation that creates a data validation task.</li>
     * <li>The source and target table names, columns, partitions, WHERE conditions, GROUP conditions, and hints are provided in pairs to map a source table to a target table and define the rows and columns to compare. You can specify multiple columns separated by commas (,).</li>
     * <li><code>isFullTableCount</code> determines the comparison granularity: <code>0</code> indicates partition-level comparison, and <code>1</code> indicates full-table comparison.</li>
     * <li><code>totalCountThreshold</code> specifies the total data volume comparison threshold, which determines whether the data volume difference between the source and target is within an acceptable range.</li>
     * <li>When the task creation mode is batch creation in the same pattern (<code>taskMode=1</code>), you can submit multiple table configurations at a time by using <code>taskConfigInfo</code>. Separate multiple configurations with a line break (<code>\\n</code>).</li>
     * </ul>
     * <h2>Response description</h2>
     * <p>The response returns a single value. <code>data</code> contains the configuration ID saved in this operation. You can use this ID to query or delete the table-level configuration later.
     * If <code>success</code> is <code>false</code>, use <code>errCode</code> and <code>errMessage</code> to identify the cause of the failure. Use <code>requestId</code> to troubleshoot the call.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates or updates the table-level configuration of a data validation task to specify the tables to validate, the validation scope, and the comparison rules.</p>
     * 
     * @param request AddDataCheckConfigRequest
     * @return AddDataCheckConfigResponse
     */
    public AddDataCheckConfigResponse addDataCheckConfig(AddDataCheckConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addDataCheckConfigWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Creates a data validation task that establishes a data consistency verification scheduling unit between a source data source and a destination data source.
     * The task itself only describes which two data sources to verify and which verification method to use. The specific tables to verify are determined by the table detail configuration. Therefore, after creating a task, you must save the table detail configuration for the task and then trigger the verification to execute.</p>
     * <h2>Request description</h2>
     * <ul>
     * <li><code>taskName</code>, <code>checkType</code>, <code>taskMode</code>, and the data source IDs and types for both the source and destination are required. The task name supports only Chinese characters, English characters, and digits.</li>
     * <li><code>checkType</code> specifies the validation method: <code>0</code>: data volume comparison. <code>1</code>: metric comparison. <code>2</code>: weak content comparison.</li>
     * <li><code>taskMode</code> specifies how the table detail configuration is created: <code>0</code>: table-by-table fine-grained creation. <code>1</code>: batch creation with the same schema. When batch creation is selected, you can submit multiple table configurations at a time when saving the table detail configuration.</li>
     * <li><code>srcDsId</code>/<code>srcDsType</code> and <code>dstDsId</code>/<code>dstDsType</code> specify the source and destination data sources respectively. The values are the IDs and types of existing data sources. <code>srcDsName</code>/<code>dstDsName</code> are the corresponding data source names.</li>
     * <li><code>checkTemplateId</code> references an existing validation template. If not specified, the built-in default template is used.</li>
     * </ul>
     * <h2>Response description</h2>
     * <p>Returns a single-value response. <code>data</code> is create task ID of the newly created task. Use this ID for subsequent operations such as configuring table details, executing validations, querying create task list, or deleting create task.
     * When <code>success</code> is <code>false</code>, use <code>errCode</code> and <code>errMessage</code> to identify the cause of the failure.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a data validation task with specified source and destination data sources, validation type, and scheduling mode.</p>
     * 
     * @param request AddDataCheckTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddDataCheckTaskResponse
     */
    public AddDataCheckTaskResponse addDataCheckTaskWithOptions(AddDataCheckTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.checkTemplateId)) {
            body.put("checkTemplateId", request.checkTemplateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.checkType)) {
            body.put("checkType", request.checkType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dstDsId)) {
            body.put("dstDsId", request.dstDsId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dstDsName)) {
            body.put("dstDsName", request.dstDsName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dstDsType)) {
            body.put("dstDsType", request.dstDsType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcDsId)) {
            body.put("srcDsId", request.srcDsId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcDsName)) {
            body.put("srcDsName", request.srcDsName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcDsType)) {
            body.put("srcDsType", request.srcDsType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskMode)) {
            body.put("taskMode", request.taskMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskName)) {
            body.put("taskName", request.taskName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddDataCheckTask"),
            new TeaPair("version", "2025-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dataCheck/task/v3/add"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddDataCheckTaskResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Creates a data validation task that establishes a data consistency verification scheduling unit between a source data source and a destination data source.
     * The task itself only describes which two data sources to verify and which verification method to use. The specific tables to verify are determined by the table detail configuration. Therefore, after creating a task, you must save the table detail configuration for the task and then trigger the verification to execute.</p>
     * <h2>Request description</h2>
     * <ul>
     * <li><code>taskName</code>, <code>checkType</code>, <code>taskMode</code>, and the data source IDs and types for both the source and destination are required. The task name supports only Chinese characters, English characters, and digits.</li>
     * <li><code>checkType</code> specifies the validation method: <code>0</code>: data volume comparison. <code>1</code>: metric comparison. <code>2</code>: weak content comparison.</li>
     * <li><code>taskMode</code> specifies how the table detail configuration is created: <code>0</code>: table-by-table fine-grained creation. <code>1</code>: batch creation with the same schema. When batch creation is selected, you can submit multiple table configurations at a time when saving the table detail configuration.</li>
     * <li><code>srcDsId</code>/<code>srcDsType</code> and <code>dstDsId</code>/<code>dstDsType</code> specify the source and destination data sources respectively. The values are the IDs and types of existing data sources. <code>srcDsName</code>/<code>dstDsName</code> are the corresponding data source names.</li>
     * <li><code>checkTemplateId</code> references an existing validation template. If not specified, the built-in default template is used.</li>
     * </ul>
     * <h2>Response description</h2>
     * <p>Returns a single-value response. <code>data</code> is create task ID of the newly created task. Use this ID for subsequent operations such as configuring table details, executing validations, querying create task list, or deleting create task.
     * When <code>success</code> is <code>false</code>, use <code>errCode</code> and <code>errMessage</code> to identify the cause of the failure.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a data validation task with specified source and destination data sources, validation type, and scheduling mode.</p>
     * 
     * @param request AddDataCheckTaskRequest
     * @return AddDataCheckTaskResponse
     */
    public AddDataCheckTaskResponse addDataCheckTask(AddDataCheckTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addDataCheckTaskWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Creates a reusable data validation template. This operation allows you to define a set of comparison rules, including metric calculation methods, difference tolerance rates, sampling policies, and null value and precision handling policies. Validation nodes can reference the template by template ID, which eliminates the need to repeatedly configure rules for each node.</p>
     * <h2>Request description</h2>
     * <ul>
     * <li><code>templateName</code> specifies the template name, and <code>templateDesc</code> specifies the template description.</li>
     * <li><code>checkType</code> specifies the comparison type that the template applies to. Valid values: <code>0</code> (data volume comparison), <code>1</code> (metric comparison), <code>2</code> (weak content comparison), <code>3</code> (custom comparison), <code>4</code> (full-text comparison), and <code>5</code> (null rate comparison). Different values correspond to different rule fields. Specify only the rule fields that match the selected type.</li>
     * <li>For metric comparison (<code>checkType=1</code>), use <code>basicMetricRules</code> and <code>metricRules</code> to describe the metric calculation methods (such as SUM, AVG, MIN, and MAX) and difference tolerance rates for each data type. If <code>diffTolerateType</code> is set to <code>0</code> (unified), specify only one value for <code>diffTolerateValues</code>. If <code>diffTolerateType</code> is set to <code>1</code> (custom), specify a value for each metric.</li>
     * <li>For weak content comparison (<code>checkType=2</code>), use <code>weakContentRule</code> to specify the weak content algorithm (such as <code>md5</code> or <code>crc32</code>), the field type filter conditions, and the field name expressions for the fields that participate in the verification.</li>
     * <li>For null rate comparison (<code>checkType=5</code>), use <code>nullRules</code> to configure null values grouped by data type.</li>
     * <li>Row-by-row and column-by-column comparison strategies are controlled by fields with the <code>column</code> prefix, including whether to enable sampling, the sampling method (by row or by percentage) and values, the size comparison type, whether to enable cosine similarity, and whether to ignore differences between null values and 0 values.</li>
     * <li><code>dsEngineRels</code> declares the data source engines associated with the template, including the data source engine configuration ID, the data source type, and the list of verification engine types covered.</li>
     * </ul>
     * <h2>Response description</h2>
     * <p>The response returns a single value. <code>data</code> is the template ID (UUID character string) of the template you create. Reference this ID by using <code>checkTemplateId</code> when you create a validation node.
     * If <code>success</code> is <code>false</code>, use <code>errCode</code> and <code>errMessage</code> to identify the cause of the failed request.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a data validation template that defines reusable comparison rules, which can be referenced by data validation nodes through the template ID.</p>
     * 
     * @param request AddDataCheckTemplateRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddDataCheckTemplateResponse
     */
    public AddDataCheckTemplateResponse addDataCheckTemplateWithOptions(AddDataCheckTemplateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.basicMetricRules)) {
            body.put("basicMetricRules", request.basicMetricRules);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.checkType)) {
            body.put("checkType", request.checkType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.complexMetricRules)) {
            body.put("complexMetricRules", request.complexMetricRules);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dsEngineRels)) {
            body.put("dsEngineRels", request.dsEngineRels);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fulltextRule)) {
            body.put("fulltextRule", request.fulltextRule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricRules)) {
            body.put("metricRules", request.metricRules);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nullRules)) {
            body.put("nullRules", request.nullRules);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            body.put("requestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateDesc)) {
            body.put("templateDesc", request.templateDesc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateName)) {
            body.put("templateName", request.templateName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("tenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.weakContentRule)) {
            body.put("weakContentRule", request.weakContentRule);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddDataCheckTemplate"),
            new TeaPair("version", "2025-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dataCheck/template/v3/create"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddDataCheckTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Creates a reusable data validation template. This operation allows you to define a set of comparison rules, including metric calculation methods, difference tolerance rates, sampling policies, and null value and precision handling policies. Validation nodes can reference the template by template ID, which eliminates the need to repeatedly configure rules for each node.</p>
     * <h2>Request description</h2>
     * <ul>
     * <li><code>templateName</code> specifies the template name, and <code>templateDesc</code> specifies the template description.</li>
     * <li><code>checkType</code> specifies the comparison type that the template applies to. Valid values: <code>0</code> (data volume comparison), <code>1</code> (metric comparison), <code>2</code> (weak content comparison), <code>3</code> (custom comparison), <code>4</code> (full-text comparison), and <code>5</code> (null rate comparison). Different values correspond to different rule fields. Specify only the rule fields that match the selected type.</li>
     * <li>For metric comparison (<code>checkType=1</code>), use <code>basicMetricRules</code> and <code>metricRules</code> to describe the metric calculation methods (such as SUM, AVG, MIN, and MAX) and difference tolerance rates for each data type. If <code>diffTolerateType</code> is set to <code>0</code> (unified), specify only one value for <code>diffTolerateValues</code>. If <code>diffTolerateType</code> is set to <code>1</code> (custom), specify a value for each metric.</li>
     * <li>For weak content comparison (<code>checkType=2</code>), use <code>weakContentRule</code> to specify the weak content algorithm (such as <code>md5</code> or <code>crc32</code>), the field type filter conditions, and the field name expressions for the fields that participate in the verification.</li>
     * <li>For null rate comparison (<code>checkType=5</code>), use <code>nullRules</code> to configure null values grouped by data type.</li>
     * <li>Row-by-row and column-by-column comparison strategies are controlled by fields with the <code>column</code> prefix, including whether to enable sampling, the sampling method (by row or by percentage) and values, the size comparison type, whether to enable cosine similarity, and whether to ignore differences between null values and 0 values.</li>
     * <li><code>dsEngineRels</code> declares the data source engines associated with the template, including the data source engine configuration ID, the data source type, and the list of verification engine types covered.</li>
     * </ul>
     * <h2>Response description</h2>
     * <p>The response returns a single value. <code>data</code> is the template ID (UUID character string) of the template you create. Reference this ID by using <code>checkTemplateId</code> when you create a validation node.
     * If <code>success</code> is <code>false</code>, use <code>errCode</code> and <code>errMessage</code> to identify the cause of the failed request.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a data validation template that defines reusable comparison rules, which can be referenced by data validation nodes through the template ID.</p>
     * 
     * @param request AddDataCheckTemplateRequest
     * @return AddDataCheckTemplateResponse
     */
    public AddDataCheckTemplateResponse addDataCheckTemplate(AddDataCheckTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addDataCheckTemplateWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Creates a metadata data source and registers its type, version, and connection configuration. A data source serves as the foundational input for capabilities such as metadata discovery, workflow migration, and data validation. Related tasks reference the data source created here by data source ID or name.</p>
     * <h2>Request description</h2>
     * <ul>
     * <li><code>dsName</code> specifies the data source name, which must be unique within the same tenant. If the name already exists, the operation returns a data source already exists error.</li>
     * <li><code>dsType</code> and <code>dsVersion</code> specify the data source type and version, such as <code>Hive</code> and <code>3.2.0</code>.</li>
     * <li><code>dsConfig</code> specifies the data source connection configuration, submitted as a JSON string. The content varies by data source type and typically includes the access address and access credentials. Credential fields are masked when returned in query responses.</li>
     * <li><code>componentType</code> identifies the role of the data source in the migration pipeline: <code>0</code> for source, <code>1</code> for destination.</li>
     * <li><code>categoryType</code> specifies the data source category. Valid values: <code>DATASET</code>, <code>WORKFLOW</code>, <code>ENGINE</code>.</li>
     * <li><code>dsId</code> specifies the external ID of the data source. <code>dsStatus</code> specifies the connectivity status. <code>dsDesc</code> specifies the data source description.</li>
     * </ul>
     * <h2>Response description</h2>
     * <p>Returns a single-value response. <code>data</code> contains the ID (long integer) of the newly created data source. Subsequent operations reference this data source by this ID or the data source name.
     * When <code>success</code> is <code>false</code>, use <code>errCode</code> and <code>errMessage</code> to identify the cause of the failure.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a metadata data source and completes connectivity configuration. This is a prerequisite step for starting metadata discovery tasks. The create action does not require authentication, but the duplicate name check within it is authenticated.</p>
     * 
     * @param request AddMetaDataComponentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddMetaDataComponentResponse
     */
    public AddMetaDataComponentResponse addMetaDataComponentWithOptions(AddMetaDataComponentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.categoryType)) {
            body.put("categoryType", request.categoryType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.componentType)) {
            body.put("componentType", request.componentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dsConfig)) {
            body.put("dsConfig", request.dsConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dsDesc)) {
            body.put("dsDesc", request.dsDesc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dsId)) {
            body.put("dsId", request.dsId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dsName)) {
            body.put("dsName", request.dsName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dsStatus)) {
            body.put("dsStatus", request.dsStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dsType)) {
            body.put("dsType", request.dsType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dsVersion)) {
            body.put("dsVersion", request.dsVersion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddMetaDataComponent"),
            new TeaPair("version", "2025-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/meta/data-component"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddMetaDataComponentResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Creates a metadata data source and registers its type, version, and connection configuration. A data source serves as the foundational input for capabilities such as metadata discovery, workflow migration, and data validation. Related tasks reference the data source created here by data source ID or name.</p>
     * <h2>Request description</h2>
     * <ul>
     * <li><code>dsName</code> specifies the data source name, which must be unique within the same tenant. If the name already exists, the operation returns a data source already exists error.</li>
     * <li><code>dsType</code> and <code>dsVersion</code> specify the data source type and version, such as <code>Hive</code> and <code>3.2.0</code>.</li>
     * <li><code>dsConfig</code> specifies the data source connection configuration, submitted as a JSON string. The content varies by data source type and typically includes the access address and access credentials. Credential fields are masked when returned in query responses.</li>
     * <li><code>componentType</code> identifies the role of the data source in the migration pipeline: <code>0</code> for source, <code>1</code> for destination.</li>
     * <li><code>categoryType</code> specifies the data source category. Valid values: <code>DATASET</code>, <code>WORKFLOW</code>, <code>ENGINE</code>.</li>
     * <li><code>dsId</code> specifies the external ID of the data source. <code>dsStatus</code> specifies the connectivity status. <code>dsDesc</code> specifies the data source description.</li>
     * </ul>
     * <h2>Response description</h2>
     * <p>Returns a single-value response. <code>data</code> contains the ID (long integer) of the newly created data source. Subsequent operations reference this data source by this ID or the data source name.
     * When <code>success</code> is <code>false</code>, use <code>errCode</code> and <code>errMessage</code> to identify the cause of the failure.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a metadata data source and completes connectivity configuration. This is a prerequisite step for starting metadata discovery tasks. The create action does not require authentication, but the duplicate name check within it is authenticated.</p>
     * 
     * @param request AddMetaDataComponentRequest
     * @return AddMetaDataComponentResponse
     */
    public AddMetaDataComponentResponse addMetaDataComponent(AddMetaDataComponentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addMetaDataComponentWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Creates an SQL conversion task and immediately triggers the conversion. This operation completes task creation and conversion execution in a single step. It is suitable for scenarios where source scripts are ready and you want to directly obtain target dialect scripts.
     * The returned task ID serves as the entry point for querying conversion progress, retrieving conversion results, and submitting results for execution.</p>
     * <h2>Request description</h2>
     * <ul>
     * <li><code>taskName</code> is required and specifies the task name. <code>taskDescription</code> specifies the task description.</li>
     * <li><code>type</code> specifies the script type: <code>0</code> for DDL, <code>1</code> for DQL.</li>
     * <li><code>sourceDialect</code> and <code>targetDialect</code> specify the source and target SQL dialects. The conversion process rewrites source dialect scripts into target dialect scripts.</li>
     * <li><code>sourceSqlScript</code> is the list of scripts to convert. When creating a task, provide the script name, script ID, and original script content <code>sqlSourceContent</code>. Fields such as <code>sqlResultContent</code>, <code>errorMessage</code>, <code>finishTime</code>, and <code>scriptTransformStatus</code> carry conversion results and statuses and are populated by the server.</li>
     * <li>Valid values of <code>scriptTransformStatus</code>: <code>pass</code> (conversion succeeded), <code>turning</code> (conversion in progress), <code>fail</code> (conversion failed). In some scenarios, the following values are used: <code>success</code> (succeeded), <code>failed</code> (failed), <code>skipped</code> (skipped).</li>
     * <li><code>tableMappingList</code> declares table name mappings from the source to the target, including the source schema and table name, and the target type and table name. During conversion, table names in scripts are rewritten based on these mappings.</li>
     * </ul>
     * <h2>Response description</h2>
     * <p>The <code>data</code> field returns <code>taskId</code>, which is the ID of the conversion task that has been created and started. Use this ID to query conversion progress, retrieve conversion results, or submit conversion results for execution.
     * If <code>success</code> is <code>false</code>, use <code>errCode</code> and <code>errMessage</code> to identify the cause of the failure.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an SQL conversion task and immediately runs the conversion. Returns a task ID for subsequent queries on conversion progress and results.</p>
     * 
     * @param request CreateExecuteSqlConversionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateExecuteSqlConversionResponse
     */
    public CreateExecuteSqlConversionResponse createExecuteSqlConversionWithOptions(CreateExecuteSqlConversionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sourceDialect)) {
            body.put("sourceDialect", request.sourceDialect);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceSqlScript)) {
            body.put("sourceSqlScript", request.sourceSqlScript);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetDialect)) {
            body.put("targetDialect", request.targetDialect);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskDescription)) {
            body.put("taskDescription", request.taskDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskName)) {
            body.put("taskName", request.taskName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateExecuteSqlConversion"),
            new TeaPair("version", "2025-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/bigdata/jobMigrate/sqlTranslator/task/api/createExecute"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateExecuteSqlConversionResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Creates an SQL conversion task and immediately triggers the conversion. This operation completes task creation and conversion execution in a single step. It is suitable for scenarios where source scripts are ready and you want to directly obtain target dialect scripts.
     * The returned task ID serves as the entry point for querying conversion progress, retrieving conversion results, and submitting results for execution.</p>
     * <h2>Request description</h2>
     * <ul>
     * <li><code>taskName</code> is required and specifies the task name. <code>taskDescription</code> specifies the task description.</li>
     * <li><code>type</code> specifies the script type: <code>0</code> for DDL, <code>1</code> for DQL.</li>
     * <li><code>sourceDialect</code> and <code>targetDialect</code> specify the source and target SQL dialects. The conversion process rewrites source dialect scripts into target dialect scripts.</li>
     * <li><code>sourceSqlScript</code> is the list of scripts to convert. When creating a task, provide the script name, script ID, and original script content <code>sqlSourceContent</code>. Fields such as <code>sqlResultContent</code>, <code>errorMessage</code>, <code>finishTime</code>, and <code>scriptTransformStatus</code> carry conversion results and statuses and are populated by the server.</li>
     * <li>Valid values of <code>scriptTransformStatus</code>: <code>pass</code> (conversion succeeded), <code>turning</code> (conversion in progress), <code>fail</code> (conversion failed). In some scenarios, the following values are used: <code>success</code> (succeeded), <code>failed</code> (failed), <code>skipped</code> (skipped).</li>
     * <li><code>tableMappingList</code> declares table name mappings from the source to the target, including the source schema and table name, and the target type and table name. During conversion, table names in scripts are rewritten based on these mappings.</li>
     * </ul>
     * <h2>Response description</h2>
     * <p>The <code>data</code> field returns <code>taskId</code>, which is the ID of the conversion task that has been created and started. Use this ID to query conversion progress, retrieve conversion results, or submit conversion results for execution.
     * If <code>success</code> is <code>false</code>, use <code>errCode</code> and <code>errMessage</code> to identify the cause of the failure.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an SQL conversion task and immediately runs the conversion. Returns a task ID for subsequent queries on conversion progress and results.</p>
     * 
     * @param request CreateExecuteSqlConversionRequest
     * @return CreateExecuteSqlConversionResponse
     */
    public CreateExecuteSqlConversionResponse createExecuteSqlConversion(CreateExecuteSqlConversionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createExecuteSqlConversionWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Submits the conversion results generated by an SQL conversion task in batch to the target for execution. This is used to deploy scripts all at once after dialect conversion is complete.
     * This operation only handles submission and returns the execution job information generated by this submission.</p>
     * <h2>Request description</h2>
     * <ul>
     * <li>taskId specifies the SQL conversion task to submit for execution. The task must already have conversion results.</li>
     * <li>concurrency specifies the concurrency level to control the number of concurrent executions for this submission. This is an optional parameter.</li>
     * </ul>
     * <h2>Response description</h2>
     * <p>The data object returns taskId, execJobId (the execution job ID generated by this submission), success, and message. The inner success field indicates whether the submission action succeeded. If it fails, message provides the reason.
     * The outer success, errCode, and errMessage fields indicate the result of the API call itself. requestId is used to troubleshoot this call.</p>
     * 
     * <b>summary</b> : 
     * <p>Submits SQL conversion results in batch to the target for execution and returns the execution job information for this submission.</p>
     * 
     * @param request CreateSqlExecJobRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSqlExecJobResponse
     */
    public CreateSqlExecJobResponse createSqlExecJobWithOptions(CreateSqlExecJobRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.concurrency)) {
            body.put("concurrency", request.concurrency);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("taskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSqlExecJob"),
            new TeaPair("version", "2025-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/bigdata/sql-translator/execute"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSqlExecJobResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Submits the conversion results generated by an SQL conversion task in batch to the target for execution. This is used to deploy scripts all at once after dialect conversion is complete.
     * This operation only handles submission and returns the execution job information generated by this submission.</p>
     * <h2>Request description</h2>
     * <ul>
     * <li>taskId specifies the SQL conversion task to submit for execution. The task must already have conversion results.</li>
     * <li>concurrency specifies the concurrency level to control the number of concurrent executions for this submission. This is an optional parameter.</li>
     * </ul>
     * <h2>Response description</h2>
     * <p>The data object returns taskId, execJobId (the execution job ID generated by this submission), success, and message. The inner success field indicates whether the submission action succeeded. If it fails, message provides the reason.
     * The outer success, errCode, and errMessage fields indicate the result of the API call itself. requestId is used to troubleshoot this call.</p>
     * 
     * <b>summary</b> : 
     * <p>Submits SQL conversion results in batch to the target for execution and returns the execution job information for this submission.</p>
     * 
     * @param request CreateSqlExecJobRequest
     * @return CreateSqlExecJobResponse
     */
    public CreateSqlExecJobResponse createSqlExecJob(CreateSqlExecJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createSqlExecJobWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Deletes a table-level configuration from a data validation task. After deletion, the configuration no longer participates in subsequent validation scheduling. The task itself is not affected.</p>
     * <h2>Request description</h2>
     * <ul>
     * <li>id is required and specifies the ID of the configuration to delete. You can obtain this ID by calling the query data validation task configuration operation.</li>
     * <li>This operation deletes a single configuration by configuration ID. Each call processes only one configuration.</li>
     * </ul>
     * <h2>Response description</h2>
     * <p>A common response is returned, which contains only success, errCode, errMessage, and requestId. No business data is returned. If success is true, the deletion is successful. If success is false, use errCode and errMessage to identify the cause of the failure.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a specified data validation task configuration. After deletion, the configuration no longer participates in subsequent validation scheduling.</p>
     * 
     * @param request DeleteDataCheckConfigRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDataCheckConfigResponse
     */
    public DeleteDataCheckConfigResponse deleteDataCheckConfigWithOptions(DeleteDataCheckConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDataCheckConfig"),
            new TeaPair("version", "2025-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dataCheck/config/v3/deleteConfig"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDataCheckConfigResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Deletes a table-level configuration from a data validation task. After deletion, the configuration no longer participates in subsequent validation scheduling. The task itself is not affected.</p>
     * <h2>Request description</h2>
     * <ul>
     * <li>id is required and specifies the ID of the configuration to delete. You can obtain this ID by calling the query data validation task configuration operation.</li>
     * <li>This operation deletes a single configuration by configuration ID. Each call processes only one configuration.</li>
     * </ul>
     * <h2>Response description</h2>
     * <p>A common response is returned, which contains only success, errCode, errMessage, and requestId. No business data is returned. If success is true, the deletion is successful. If success is false, use errCode and errMessage to identify the cause of the failure.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a specified data validation task configuration. After deletion, the configuration no longer participates in subsequent validation scheduling.</p>
     * 
     * @param request DeleteDataCheckConfigRequest
     * @return DeleteDataCheckConfigResponse
     */
    public DeleteDataCheckConfigResponse deleteDataCheckConfig(DeleteDataCheckConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteDataCheckConfigWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Batch deletes data validation tasks by using logical deletion. After deletion, tasks are no longer displayed in the task list or scheduled for execution.</p>
     * <h2>Request description</h2>
     * <ul>
     * <li>taskIds is required and specifies the list of task IDs to delete. You can delete multiple tasks in a single request.</li>
     * <li>Deletion is logical, which only changes the visibility and scheduling status of tasks. Tasks that are currently running cannot be deleted.</li>
     * </ul>
     * <h2>Response description</h2>
     * <p>A common response is returned, which contains only success, errCode, errMessage, and requestId. No business data is returned. If success is true, the deletion is successful. If success is false, use errCode and errMessage to identify the cause of the failure.</p>
     * 
     * <b>summary</b> : 
     * <p>Performs a logical deletion of data validation tasks (batch operation supported). Deleted tasks are no longer displayed in the list or scheduled for execution.</p>
     * 
     * @param request DeleteDataCheckTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDataCheckTaskResponse
     */
    public DeleteDataCheckTaskResponse deleteDataCheckTaskWithOptions(DeleteDataCheckTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskIds)) {
            body.put("taskIds", request.taskIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDataCheckTask"),
            new TeaPair("version", "2025-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dataCheck/task/v3/delete"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDataCheckTaskResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Batch deletes data validation tasks by using logical deletion. After deletion, tasks are no longer displayed in the task list or scheduled for execution.</p>
     * <h2>Request description</h2>
     * <ul>
     * <li>taskIds is required and specifies the list of task IDs to delete. You can delete multiple tasks in a single request.</li>
     * <li>Deletion is logical, which only changes the visibility and scheduling status of tasks. Tasks that are currently running cannot be deleted.</li>
     * </ul>
     * <h2>Response description</h2>
     * <p>A common response is returned, which contains only success, errCode, errMessage, and requestId. No business data is returned. If success is true, the deletion is successful. If success is false, use errCode and errMessage to identify the cause of the failure.</p>
     * 
     * <b>summary</b> : 
     * <p>Performs a logical deletion of data validation tasks (batch operation supported). Deleted tasks are no longer displayed in the list or scheduled for execution.</p>
     * 
     * @param request DeleteDataCheckTaskRequest
     * @return DeleteDataCheckTaskResponse
     */
    public DeleteDataCheckTaskResponse deleteDataCheckTask(DeleteDataCheckTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteDataCheckTaskWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Batch deletes data validation templates to clean up templates that are no longer in use. The deletion scope includes the templates themselves and their associated rule configurations and datasource engine relationships.</p>
     * <h2>Request description</h2>
     * <ul>
     * <li>templateIds is the list of template IDs to delete. You can delete multiple templates at a time. If this list is empty, the operation returns a missing parameter error.</li>
     * <li>The delete operation does not verify whether a template is referenced by a validation task. Check whether a template is referenced by a validation task by viewing the reference mark returned by the template list operation before deletion.</li>
     * </ul>
     * <h2>Response description</h2>
     * <p>A common response is returned, which contains only success, errCode, errMessage, and requestId. No business data is returned. A value of true for success indicates that the deletion is successful. A value of false for success indicates a failure. Use errCode and errMessage to identify the cause of the failure.</p>
     * 
     * <b>summary</b> : 
     * <p>Batch deletes data validation templates along with their associated rule configurations and datasource engine relationships.</p>
     * 
     * @param request DeleteDataCheckTemplateRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDataCheckTemplateResponse
     */
    public DeleteDataCheckTemplateResponse deleteDataCheckTemplateWithOptions(DeleteDataCheckTemplateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.templateIds)) {
            body.put("templateIds", request.templateIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDataCheckTemplate"),
            new TeaPair("version", "2025-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dataCheck/template/v3/delete"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDataCheckTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Batch deletes data validation templates to clean up templates that are no longer in use. The deletion scope includes the templates themselves and their associated rule configurations and datasource engine relationships.</p>
     * <h2>Request description</h2>
     * <ul>
     * <li>templateIds is the list of template IDs to delete. You can delete multiple templates at a time. If this list is empty, the operation returns a missing parameter error.</li>
     * <li>The delete operation does not verify whether a template is referenced by a validation task. Check whether a template is referenced by a validation task by viewing the reference mark returned by the template list operation before deletion.</li>
     * </ul>
     * <h2>Response description</h2>
     * <p>A common response is returned, which contains only success, errCode, errMessage, and requestId. No business data is returned. A value of true for success indicates that the deletion is successful. A value of false for success indicates a failure. Use errCode and errMessage to identify the cause of the failure.</p>
     * 
     * <b>summary</b> : 
     * <p>Batch deletes data validation templates along with their associated rule configurations and datasource engine relationships.</p>
     * 
     * @param request DeleteDataCheckTemplateRequest
     * @return DeleteDataCheckTemplateResponse
     */
    public DeleteDataCheckTemplateResponse deleteDataCheckTemplate(DeleteDataCheckTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteDataCheckTemplateWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Edits the configuration of an existing SQL conversion task. The request is submitted through the POP open channel. You can modify the task name, task type, source and target dialects, concurrency, and the test data source associated with a DQL task.</p>
     * <h2>Request description</h2>
     * <ul>
     * <li><code>taskId</code> is required and specifies the conversion task to edit. <code>taskType</code> is required and specifies the task type: <code>1</code> for DDL and <code>2</code> for DQL.</li>
     * <li><code>taskName</code>, <code>sourceDialect</code>, and <code>targetDialect</code> specify the task name, source SQL dialect, and target SQL dialect.</li>
     * <li><code>dqlTestDatasourceName</code> specifies the name of the test data source associated with a DQL task. The server resolves the corresponding data source by this name under the current tenant and uses it for subsequent conversion processing.</li>
     * <li><code>concurrency</code> specifies the concurrency for controlling the number of concurrent conversion executions.</li>
     * </ul>
     * <h2>Response description</h2>
     * <p>The <code>data</code> field contains the result of this edit operation, including the task ID, record primary key ID, file upload and parsing ID, and the <code>success</code> and <code>message</code> fields that indicate whether the edit succeeded. If the edit fails, <code>message</code> provides the reason.
     * The outer <code>success</code>, <code>errCode</code>, and <code>errMessage</code> fields indicate the result of the API call itself. <code>requestId</code> is used for troubleshooting.</p>
     * 
     * <b>summary</b> : 
     * <p>Edits the configuration of an existing SQL conversion task through the POP channel, such as the source dialect, target dialect, and conversion scope.</p>
     * 
     * @param request EditTaskPopRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return EditTaskPopResponse
     */
    public EditTaskPopResponse editTaskPopWithOptions(EditTaskPopRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.concurrency)) {
            body.put("concurrency", request.concurrency);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dqlTestDatasourceName)) {
            body.put("dqlTestDatasourceName", request.dqlTestDatasourceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceDialect)) {
            body.put("sourceDialect", request.sourceDialect);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetDialect)) {
            body.put("targetDialect", request.targetDialect);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("taskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskName)) {
            body.put("taskName", request.taskName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskType)) {
            body.put("taskType", request.taskType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EditTaskPop"),
            new TeaPair("version", "2025-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/bigdata/sql-translator/editPop"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EditTaskPopResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Edits the configuration of an existing SQL conversion task. The request is submitted through the POP open channel. You can modify the task name, task type, source and target dialects, concurrency, and the test data source associated with a DQL task.</p>
     * <h2>Request description</h2>
     * <ul>
     * <li><code>taskId</code> is required and specifies the conversion task to edit. <code>taskType</code> is required and specifies the task type: <code>1</code> for DDL and <code>2</code> for DQL.</li>
     * <li><code>taskName</code>, <code>sourceDialect</code>, and <code>targetDialect</code> specify the task name, source SQL dialect, and target SQL dialect.</li>
     * <li><code>dqlTestDatasourceName</code> specifies the name of the test data source associated with a DQL task. The server resolves the corresponding data source by this name under the current tenant and uses it for subsequent conversion processing.</li>
     * <li><code>concurrency</code> specifies the concurrency for controlling the number of concurrent conversion executions.</li>
     * </ul>
     * <h2>Response description</h2>
     * <p>The <code>data</code> field contains the result of this edit operation, including the task ID, record primary key ID, file upload and parsing ID, and the <code>success</code> and <code>message</code> fields that indicate whether the edit succeeded. If the edit fails, <code>message</code> provides the reason.
     * The outer <code>success</code>, <code>errCode</code>, and <code>errMessage</code> fields indicate the result of the API call itself. <code>requestId</code> is used for troubleshooting.</p>
     * 
     * <b>summary</b> : 
     * <p>Edits the configuration of an existing SQL conversion task through the POP channel, such as the source dialect, target dialect, and conversion scope.</p>
     * 
     * @param request EditTaskPopRequest
     * @return EditTaskPopResponse
     */
    public EditTaskPopResponse editTaskPop(EditTaskPopRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.editTaskPopWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Exports the subtask result details file for a specified validation batch and returns a downloadable link. You can use this link to verify data differences offline, archive validation conclusions, or deliver results to business stakeholders for confirmation.
     * This operation only exports reports that have already been generated. It does not trigger report generation. If the report for the batch has not been generated, call the report generation operation first and wait until the report status changes to Generated before exporting.</p>
     * <h2>Request description</h2>
     * <ul>
     * <li>batchId specifies the validation batch to export. Obtain this value from the response of the save data validation task operation.</li>
     * <li>Before calling this operation, make sure the report status for the batch is Generated. The export fails if the report has not been generated or generation has failed. Confirm the status by calling the report status query operation.</li>
     * <li>Each call exports the result details for a single batch.</li>
     * </ul>
     * <h2>Response description</h2>
     * <p>The response returns a single value. The data field contains the download link for the report file (a temporary Object Storage Service (OSS) URL). The link has an expiration time. Download the file promptly after obtaining the link. If the link expires, call this operation again to obtain a new link.
     * If success is false, use errCode and errMessage to identify the failure cause. Use requestId to troubleshoot the call.</p>
     * 
     * <b>summary</b> : 
     * <p>Exports the result details file at the subtask level by validation batch for offline verification of data differences.</p>
     * 
     * @param request ExecDataCheckDownloadReportRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExecDataCheckDownloadReportResponse
     */
    public ExecDataCheckDownloadReportResponse execDataCheckDownloadReportWithOptions(ExecDataCheckDownloadReportRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.batchId)) {
            query.put("batchId", request.batchId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExecDataCheckDownloadReport"),
            new TeaPair("version", "2025-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dataCheck/report/v3/download"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExecDataCheckDownloadReportResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Exports the subtask result details file for a specified validation batch and returns a downloadable link. You can use this link to verify data differences offline, archive validation conclusions, or deliver results to business stakeholders for confirmation.
     * This operation only exports reports that have already been generated. It does not trigger report generation. If the report for the batch has not been generated, call the report generation operation first and wait until the report status changes to Generated before exporting.</p>
     * <h2>Request description</h2>
     * <ul>
     * <li>batchId specifies the validation batch to export. Obtain this value from the response of the save data validation task operation.</li>
     * <li>Before calling this operation, make sure the report status for the batch is Generated. The export fails if the report has not been generated or generation has failed. Confirm the status by calling the report status query operation.</li>
     * <li>Each call exports the result details for a single batch.</li>
     * </ul>
     * <h2>Response description</h2>
     * <p>The response returns a single value. The data field contains the download link for the report file (a temporary Object Storage Service (OSS) URL). The link has an expiration time. Download the file promptly after obtaining the link. If the link expires, call this operation again to obtain a new link.
     * If success is false, use errCode and errMessage to identify the failure cause. Use requestId to troubleshoot the call.</p>
     * 
     * <b>summary</b> : 
     * <p>Exports the result details file at the subtask level by validation batch for offline verification of data differences.</p>
     * 
     * @param request ExecDataCheckDownloadReportRequest
     * @return ExecDataCheckDownloadReportResponse
     */
    public ExecDataCheckDownloadReportResponse execDataCheckDownloadReport(ExecDataCheckDownloadReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execDataCheckDownloadReportWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Triggers report generation for a specified data validation batch. After validation execution is complete, comparison results are stored as detailed records. You must generate a report before you can query results from the report perspective through operations such as report overview and report details, or export result files.
     * Report generation is an asynchronous process. This operation only initiates the generation. A successful response indicates that the generation request has been accepted, not that the report is available.</p>
     * <h2>Request description</h2>
     * <ul>
     * <li><code>batchId</code> specifies the data validation batch for which to generate a report. The value is obtained from the response of the ExecDataCheckSaveTask operation.</li>
     * <li>Initiate generation only after the validation execution of the batch is complete. A report generated for a batch that is still running does not contain the final results.</li>
     * <li>Track the generation progress and result through the report status query operation. The report overview can be queried or the file can be exported only after the report status changes to &quot;Generated&quot;.</li>
     * </ul>
     * <h2>Response description</h2>
     * <p>A common response is returned, which contains only <code>success</code>, <code>errCode</code>, <code>errMessage</code>, and <code>requestId</code>. No business data is returned. If <code>success</code> is <code>true</code>, the generation request has been accepted. If <code>success</code> is <code>false</code>, use <code>errCode</code> and <code>errMessage</code> to identify the cause of the failure.</p>
     * 
     * <b>summary</b> : 
     * <p>Triggers report generation for a specified data validation batch. After generation is complete, you can query results through the report overview and details operations.</p>
     * 
     * @param request ExecDataCheckGenerateReportRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExecDataCheckGenerateReportResponse
     */
    public ExecDataCheckGenerateReportResponse execDataCheckGenerateReportWithOptions(ExecDataCheckGenerateReportRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.batchId)) {
            query.put("batchId", request.batchId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExecDataCheckGenerateReport"),
            new TeaPair("version", "2025-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dataCheck/report/v3/generateReport"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExecDataCheckGenerateReportResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Triggers report generation for a specified data validation batch. After validation execution is complete, comparison results are stored as detailed records. You must generate a report before you can query results from the report perspective through operations such as report overview and report details, or export result files.
     * Report generation is an asynchronous process. This operation only initiates the generation. A successful response indicates that the generation request has been accepted, not that the report is available.</p>
     * <h2>Request description</h2>
     * <ul>
     * <li><code>batchId</code> specifies the data validation batch for which to generate a report. The value is obtained from the response of the ExecDataCheckSaveTask operation.</li>
     * <li>Initiate generation only after the validation execution of the batch is complete. A report generated for a batch that is still running does not contain the final results.</li>
     * <li>Track the generation progress and result through the report status query operation. The report overview can be queried or the file can be exported only after the report status changes to &quot;Generated&quot;.</li>
     * </ul>
     * <h2>Response description</h2>
     * <p>A common response is returned, which contains only <code>success</code>, <code>errCode</code>, <code>errMessage</code>, and <code>requestId</code>. No business data is returned. If <code>success</code> is <code>true</code>, the generation request has been accepted. If <code>success</code> is <code>false</code>, use <code>errCode</code> and <code>errMessage</code> to identify the cause of the failure.</p>
     * 
     * <b>summary</b> : 
     * <p>Triggers report generation for a specified data validation batch. After generation is complete, you can query results through the report overview and details operations.</p>
     * 
     * @param request ExecDataCheckGenerateReportRequest
     * @return ExecDataCheckGenerateReportResponse
     */
    public ExecDataCheckGenerateReportResponse execDataCheckGenerateReport(ExecDataCheckGenerateReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execDataCheckGenerateReportWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Initiates a full rerun for the specified validation batch: a new batch is created based on the original batch, and all tables pending validation under the task are compared again, rather than only rerunning the failed portions.
     * This operation is applicable to scenarios where source or destination data has been corrected and a complete validation conclusion is needed. If you only need to rerun failed or unverified subtasks, use the rerun failed subtasks operation to avoid the resource consumption caused by a full comparison.</p>
     * <h2>Request description</h2>
     * <ul>
     * <li><code>batchId</code> specifies the data validation batch to use as the rerun baseline. The value is obtained from the response of the ExecDataCheckSaveTask operation.</li>
     * <li>The batch must exist and must not be in the running state. Repeated requests against a running batch are denied.</li>
     * <li>Before the rerun starts, a connectivity dry run is performed on the source and destination data sources associated with the node. The rerun does not start if a data source is not active.</li>
     * <li>The rerun uses the table-level configuration of the node to which the original batch belongs. The configuration itself is not modified.</li>
     * </ul>
     * <h2>Response description</h2>
     * <p>A single-value response is returned. <code>data</code> is the batch ID of the newly created rerun batch. The execution progress, report, and result details of the rerun are associated with this new batch. The historical results of the original batch are retained. Use the new batch ID for subsequent queries and exports.
     * If <code>success</code> is <code>false</code>, use <code>errCode</code> and <code>errMessage</code> to identify the failure cause.</p>
     * 
     * <b>summary</b> : 
     * <p>Reruns a completed data validation task to re-execute data comparison and generate a new validation batch.</p>
     * 
     * @param request ExecDataCheckReRunRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExecDataCheckReRunResponse
     */
    public ExecDataCheckReRunResponse execDataCheckReRunWithOptions(ExecDataCheckReRunRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.batchId)) {
            body.put("batchId", request.batchId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExecDataCheckReRun"),
            new TeaPair("version", "2025-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dataCheck/task/v3/rerun"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExecDataCheckReRunResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Initiates a full rerun for the specified validation batch: a new batch is created based on the original batch, and all tables pending validation under the task are compared again, rather than only rerunning the failed portions.
     * This operation is applicable to scenarios where source or destination data has been corrected and a complete validation conclusion is needed. If you only need to rerun failed or unverified subtasks, use the rerun failed subtasks operation to avoid the resource consumption caused by a full comparison.</p>
     * <h2>Request description</h2>
     * <ul>
     * <li><code>batchId</code> specifies the data validation batch to use as the rerun baseline. The value is obtained from the response of the ExecDataCheckSaveTask operation.</li>
     * <li>The batch must exist and must not be in the running state. Repeated requests against a running batch are denied.</li>
     * <li>Before the rerun starts, a connectivity dry run is performed on the source and destination data sources associated with the node. The rerun does not start if a data source is not active.</li>
     * <li>The rerun uses the table-level configuration of the node to which the original batch belongs. The configuration itself is not modified.</li>
     * </ul>
     * <h2>Response description</h2>
     * <p>A single-value response is returned. <code>data</code> is the batch ID of the newly created rerun batch. The execution progress, report, and result details of the rerun are associated with this new batch. The historical results of the original batch are retained. Use the new batch ID for subsequent queries and exports.
     * If <code>success</code> is <code>false</code>, use <code>errCode</code> and <code>errMessage</code> to identify the failure cause.</p>
     * 
     * <b>summary</b> : 
     * <p>Reruns a completed data validation task to re-execute data comparison and generate a new validation batch.</p>
     * 
     * @param request ExecDataCheckReRunRequest
     * @return ExecDataCheckReRunResponse
     */
    public ExecDataCheckReRunResponse execDataCheckReRun(ExecDataCheckReRunRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execDataCheckReRunWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Immediately triggers a data validation execution without waiting for timed scheduling. This is applicable when you want to view comparison results right after saving a configuration, or when you need to run an additional execution outside the scheduling cycle.
     * The execution is performed asynchronously. A success response from this operation indicates that the execution has been initiated. Query the comparison results through the report and result details operations after the check execution is complete.</p>
     * <h2>Request description</h2>
     * <ul>
     * <li><code>batchId</code> specifies the check batch to execute. The value is obtained from the response of the operation that saves the data validation task.</li>
     * <li>The batch must exist and must not be in the running state. Repeated requests for a running batch are rejected.</li>
     * <li>Before execution, a connectivity dry run is performed on the source and target data sources associated with the task. The execution does not start if a data source is unavailable.</li>
     * <li>If you want to execute immediately after saving the configuration, you can also set the immediate execution switch to enabled when saving the data validation task, without calling this operation separately.</li>
     * </ul>
     * <h2>Response description</h2>
     * <p>A common response is returned, which contains only <code>success</code>, <code>errCode</code>, <code>errMessage</code>, and <code>requestId</code>. No business data is returned. A <code>success</code> value of <code>true</code> indicates that the execution has been initiated, not that the comparison is complete. If the value is <code>false</code>, use <code>errCode</code> and <code>errMessage</code> to identify the failure cause.</p>
     * 
     * <b>summary</b> : 
     * <p>Triggers a data validation task immediately without waiting for timed scheduling.</p>
     * 
     * @param request ExecDataCheckRunRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExecDataCheckRunResponse
     */
    public ExecDataCheckRunResponse execDataCheckRunWithOptions(ExecDataCheckRunRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.batchId)) {
            body.put("batchId", request.batchId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExecDataCheckRun"),
            new TeaPair("version", "2025-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dataCheck/task/v3/run"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExecDataCheckRunResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Immediately triggers a data validation execution without waiting for timed scheduling. This is applicable when you want to view comparison results right after saving a configuration, or when you need to run an additional execution outside the scheduling cycle.
     * The execution is performed asynchronously. A success response from this operation indicates that the execution has been initiated. Query the comparison results through the report and result details operations after the check execution is complete.</p>
     * <h2>Request description</h2>
     * <ul>
     * <li><code>batchId</code> specifies the check batch to execute. The value is obtained from the response of the operation that saves the data validation task.</li>
     * <li>The batch must exist and must not be in the running state. Repeated requests for a running batch are rejected.</li>
     * <li>Before execution, a connectivity dry run is performed on the source and target data sources associated with the task. The execution does not start if a data source is unavailable.</li>
     * <li>If you want to execute immediately after saving the configuration, you can also set the immediate execution switch to enabled when saving the data validation task, without calling this operation separately.</li>
     * </ul>
     * <h2>Response description</h2>
     * <p>A common response is returned, which contains only <code>success</code>, <code>errCode</code>, <code>errMessage</code>, and <code>requestId</code>. No business data is returned. A <code>success</code> value of <code>true</code> indicates that the execution has been initiated, not that the comparison is complete. If the value is <code>false</code>, use <code>errCode</code> and <code>errMessage</code> to identify the failure cause.</p>
     * 
     * <b>summary</b> : 
     * <p>Triggers a data validation task immediately without waiting for timed scheduling.</p>
     * 
     * @param request ExecDataCheckRunRequest
     * @return ExecDataCheckRunResponse
     */
    public ExecDataCheckRunResponse execDataCheckRun(ExecDataCheckRunRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execDataCheckRunWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Reruns subtasks that did not pass in a specified data validation batch. The rerun scope is limited by the rerun type to avoid rerunning tables that have already passed validation.
     * The difference from a full rerun is the scope: a full rerun revalidates all tables under the task, whereas this operation only reruns subtasks that match the selected type. Both approaches create a new batch to hold the results.</p>
     * <h2>Request description</h2>
     * <ul>
     * <li><code>batchId</code> specifies the data validation batch to rerun. Obtain this value from the response of the ExecDataCheckSaveTask operation.</li>
     * <li><code>type</code> determines the rerun scope: <code>0</code> reruns only execution-failed subtasks, <code>1</code> reruns execution-failed and validation-failed subtasks, and <code>2</code> reruns execution-failed and stopped subtasks. If not specified, the default value is <code>1</code>.</li>
     * <li>The specified batch must exist, and the most recent batch of the parent task must not be running. Otherwise, the rerun request is rejected.</li>
     * <li>The specified batch must contain completed data validation subtasks. If no subtasks have finished, there are no subtasks to rerun, and the operation returns an error.</li>
     * </ul>
     * <h2>Response description</h2>
     * <p>The response returns a single value. <code>data</code> is the ID of the new batch created for this rerun. The rerun progress and results are associated with this new batch. The original batch results remain unchanged. Use the new batch ID for subsequent queries and exports.
     * If <code>success</code> is <code>false</code>, check <code>errCode</code> and <code>errMessage</code> to identify the cause of the failure.</p>
     * 
     * <b>summary</b> : 
     * <p>Reruns failed subtasks in a specified data validation batch, scoped by rerun type to avoid a full rerun.</p>
     * 
     * @param request ExecDataCheckRunFailedRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExecDataCheckRunFailedResponse
     */
    public ExecDataCheckRunFailedResponse execDataCheckRunFailedWithOptions(ExecDataCheckRunFailedRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.batchId)) {
            body.put("batchId", request.batchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExecDataCheckRunFailed"),
            new TeaPair("version", "2025-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dataCheck/task/v3/runFailed"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExecDataCheckRunFailedResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Reruns subtasks that did not pass in a specified data validation batch. The rerun scope is limited by the rerun type to avoid rerunning tables that have already passed validation.
     * The difference from a full rerun is the scope: a full rerun revalidates all tables under the task, whereas this operation only reruns subtasks that match the selected type. Both approaches create a new batch to hold the results.</p>
     * <h2>Request description</h2>
     * <ul>
     * <li><code>batchId</code> specifies the data validation batch to rerun. Obtain this value from the response of the ExecDataCheckSaveTask operation.</li>
     * <li><code>type</code> determines the rerun scope: <code>0</code> reruns only execution-failed subtasks, <code>1</code> reruns execution-failed and validation-failed subtasks, and <code>2</code> reruns execution-failed and stopped subtasks. If not specified, the default value is <code>1</code>.</li>
     * <li>The specified batch must exist, and the most recent batch of the parent task must not be running. Otherwise, the rerun request is rejected.</li>
     * <li>The specified batch must contain completed data validation subtasks. If no subtasks have finished, there are no subtasks to rerun, and the operation returns an error.</li>
     * </ul>
     * <h2>Response description</h2>
     * <p>The response returns a single value. <code>data</code> is the ID of the new batch created for this rerun. The rerun progress and results are associated with this new batch. The original batch results remain unchanged. Use the new batch ID for subsequent queries and exports.
     * If <code>success</code> is <code>false</code>, check <code>errCode</code> and <code>errMessage</code> to identify the cause of the failure.</p>
     * 
     * <b>summary</b> : 
     * <p>Reruns failed subtasks in a specified data validation batch, scoped by rerun type to avoid a full rerun.</p>
     * 
     * @param request ExecDataCheckRunFailedRequest
     * @return ExecDataCheckRunFailedResponse
     */
    public ExecDataCheckRunFailedResponse execDataCheckRunFailed(ExecDataCheckRunFailedRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execDataCheckRunFailedWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Saves the execution configuration of a data validation task and generates a validation batch for the task. The task itself describes which two data sources to validate and which validation method to use. This operation determines the execution scope of the validation: whether to perform full-table validation, global parameters, data volume difference thresholds, and whether to execute immediately after saving.
     * The batch ID returned upon successful saving serves as the unified entry point for subsequent operations such as execution, stopping, re-running, report generation, and result detail queries.</p>
     * <h2>Request description</h2>
     * <ul>
     * <li><code>taskId</code> specifies the validation task for which to save the configuration. The task must already exist.</li>
     * <li>Before saving, the system checks whether the task has any table detail configurations. If no table detail configurations exist, the save operation is rejected. Add table detail configurations to the task first.</li>
     * <li><code>fullTableCount</code> determines the comparison granularity: <code>0</code> for partition-level validation (default), <code>1</code> for full-table validation.</li>
     * <li><code>sourceGlobalParams</code>, <code>targetGlobalParams</code>, and <code>checkGlobalParams</code> are global parameters for the source, target, and validation phases respectively. Separate multiple parameters with a line feed (<code>\\n</code>).</li>
     * <li><code>totalCountThreshold</code> is the total data volume comparison threshold, used to determine whether the data volume difference between the source and target is within an acceptable range.</li>
     * <li><code>startImmediately</code> determines whether to execute immediately after saving: <code>0</code> for no (default), <code>1</code> for yes. When set to <code>1</code>, the generated batch starts asynchronous execution immediately, eliminating the need to call a separate execution operation.</li>
     * </ul>
     * <h2>Response description</h2>
     * <p>Returns a single-value response. <code>data</code> is the validation batch ID generated by this save operation (not the task ID). Subsequent operations such as execution, stopping, re-running, report generation, and result detail queries all reference this validation by the batch ID.
     * When <code>success</code> is <code>false</code>, use <code>errCode</code> and <code>errMessage</code> to identify the cause of the failure.</p>
     * 
     * <b>summary</b> : 
     * <p>Saves one or more modified data validation tasks. You can also configure settings such as whether to perform full-table validation and whether to execute the task immediately.</p>
     * 
     * @param request ExecDataCheckSaveTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExecDataCheckSaveTaskResponse
     */
    public ExecDataCheckSaveTaskResponse execDataCheckSaveTaskWithOptions(ExecDataCheckSaveTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.checkGlobalParams)) {
            body.put("checkGlobalParams", request.checkGlobalParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fullTableCount)) {
            body.put("fullTableCount", request.fullTableCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceGlobalParams)) {
            body.put("sourceGlobalParams", request.sourceGlobalParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startImmediately)) {
            body.put("startImmediately", request.startImmediately);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetGlobalParams)) {
            body.put("targetGlobalParams", request.targetGlobalParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("taskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.totalCountThreshold)) {
            body.put("totalCountThreshold", request.totalCountThreshold);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExecDataCheckSaveTask"),
            new TeaPair("version", "2025-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dataCheck/task/v3/save"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExecDataCheckSaveTaskResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Saves the execution configuration of a data validation task and generates a validation batch for the task. The task itself describes which two data sources to validate and which validation method to use. This operation determines the execution scope of the validation: whether to perform full-table validation, global parameters, data volume difference thresholds, and whether to execute immediately after saving.
     * The batch ID returned upon successful saving serves as the unified entry point for subsequent operations such as execution, stopping, re-running, report generation, and result detail queries.</p>
     * <h2>Request description</h2>
     * <ul>
     * <li><code>taskId</code> specifies the validation task for which to save the configuration. The task must already exist.</li>
     * <li>Before saving, the system checks whether the task has any table detail configurations. If no table detail configurations exist, the save operation is rejected. Add table detail configurations to the task first.</li>
     * <li><code>fullTableCount</code> determines the comparison granularity: <code>0</code> for partition-level validation (default), <code>1</code> for full-table validation.</li>
     * <li><code>sourceGlobalParams</code>, <code>targetGlobalParams</code>, and <code>checkGlobalParams</code> are global parameters for the source, target, and validation phases respectively. Separate multiple parameters with a line feed (<code>\\n</code>).</li>
     * <li><code>totalCountThreshold</code> is the total data volume comparison threshold, used to determine whether the data volume difference between the source and target is within an acceptable range.</li>
     * <li><code>startImmediately</code> determines whether to execute immediately after saving: <code>0</code> for no (default), <code>1</code> for yes. When set to <code>1</code>, the generated batch starts asynchronous execution immediately, eliminating the need to call a separate execution operation.</li>
     * </ul>
     * <h2>Response description</h2>
     * <p>Returns a single-value response. <code>data</code> is the validation batch ID generated by this save operation (not the task ID). Subsequent operations such as execution, stopping, re-running, report generation, and result detail queries all reference this validation by the batch ID.
     * When <code>success</code> is <code>false</code>, use <code>errCode</code> and <code>errMessage</code> to identify the cause of the failure.</p>
     * 
     * <b>summary</b> : 
     * <p>Saves one or more modified data validation tasks. You can also configure settings such as whether to perform full-table validation and whether to execute the task immediately.</p>
     * 
     * @param request ExecDataCheckSaveTaskRequest
     * @return ExecDataCheckSaveTaskResponse
     */
    public ExecDataCheckSaveTaskResponse execDataCheckSaveTask(ExecDataCheckSaveTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execDataCheckSaveTaskWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Generates and returns the actual comparison SQL that will be issued based on the specified table and check conditions, without executing it. Use this operation to confirm whether the check scope meets expectations before you execute the check. For example, you can verify that the partition range, filter conditions, and fields involved in the comparison are correctly defined.
     * The generated SQL is intended only for preview and troubleshooting purposes and can serve as a reference for diagnosing unexpected comparison results.</p>
     * <h2>Request description</h2>
     * <ul>
     * <li><code>dataSourceId</code> specifies the data source on which the SQL is generated.</li>
     * <li><code>fullTableName</code> specifies the table to check, in the format <code>schema.table</code>.</li>
     * <li><code>taskId</code> specifies the check task, which is used to retrieve the check method and rules configured for that task.</li>
     * <li><code>engineId</code> specifies the check engine, used in Spark check scenarios.</li>
     * <li><code>partitionCondition</code> is the partition condition that limits the comparison scope to specified partitions. <code>whereClause</code> is the filter condition that further limits the rows involved in the comparison.</li>
     * <li><code>checkColumn</code> specifies the fields involved in the comparison. Separate multiple fields with commas (,). If not specified, the SQL is generated based on the field scope configured for the task.</li>
     * </ul>
     * <h2>Response description</h2>
     * <p>Returns a single-value response. <code>data</code> contains the generated comparison SQL statement text. Because this operation only generates the SQL without executing it, a successful response does not indicate that data has been compared.
     * If <code>success</code> is <code>false</code>, use <code>errCode</code> and <code>errMessage</code> to identify the cause of the failure.</p>
     * 
     * <b>summary</b> : 
     * <p>Generates a preview of the comparison SQL that will be issued based on the check task configuration, allowing you to confirm the check scope before execution.</p>
     * 
     * @param request ExecDataCheckSqlPreviewRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExecDataCheckSqlPreviewResponse
     */
    public ExecDataCheckSqlPreviewResponse execDataCheckSqlPreviewWithOptions(ExecDataCheckSqlPreviewRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.checkColumn)) {
            body.put("checkColumn", request.checkColumn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceId)) {
            body.put("dataSourceId", request.dataSourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.engineId)) {
            body.put("engineId", request.engineId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fullTableName)) {
            body.put("fullTableName", request.fullTableName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.partitionCondition)) {
            body.put("partitionCondition", request.partitionCondition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("taskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.whereClause)) {
            body.put("whereClause", request.whereClause);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExecDataCheckSqlPreview"),
            new TeaPair("version", "2025-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dataCheck/config/v3/sql/preview"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExecDataCheckSqlPreviewResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Generates and returns the actual comparison SQL that will be issued based on the specified table and check conditions, without executing it. Use this operation to confirm whether the check scope meets expectations before you execute the check. For example, you can verify that the partition range, filter conditions, and fields involved in the comparison are correctly defined.
     * The generated SQL is intended only for preview and troubleshooting purposes and can serve as a reference for diagnosing unexpected comparison results.</p>
     * <h2>Request description</h2>
     * <ul>
     * <li><code>dataSourceId</code> specifies the data source on which the SQL is generated.</li>
     * <li><code>fullTableName</code> specifies the table to check, in the format <code>schema.table</code>.</li>
     * <li><code>taskId</code> specifies the check task, which is used to retrieve the check method and rules configured for that task.</li>
     * <li><code>engineId</code> specifies the check engine, used in Spark check scenarios.</li>
     * <li><code>partitionCondition</code> is the partition condition that limits the comparison scope to specified partitions. <code>whereClause</code> is the filter condition that further limits the rows involved in the comparison.</li>
     * <li><code>checkColumn</code> specifies the fields involved in the comparison. Separate multiple fields with commas (,). If not specified, the SQL is generated based on the field scope configured for the task.</li>
     * </ul>
     * <h2>Response description</h2>
     * <p>Returns a single-value response. <code>data</code> contains the generated comparison SQL statement text. Because this operation only generates the SQL without executing it, a successful response does not indicate that data has been compared.
     * If <code>success</code> is <code>false</code>, use <code>errCode</code> and <code>errMessage</code> to identify the cause of the failure.</p>
     * 
     * <b>summary</b> : 
     * <p>Generates a preview of the comparison SQL that will be issued based on the check task configuration, allowing you to confirm the check scope before execution.</p>
     * 
     * @param request ExecDataCheckSqlPreviewRequest
     * @return ExecDataCheckSqlPreviewResponse
     */
    public ExecDataCheckSqlPreviewResponse execDataCheckSqlPreview(ExecDataCheckSqlPreviewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execDataCheckSqlPreviewWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Stops a running check batch and terminates any incomplete comparison work in the current scheduling run. Task results of completed subtasks are retained. After the node is stopped, you can rerun only the failed and stopped portions without rerunning the entire node.
     * This operation is applicable to scenarios where the check scope is misconfigured, the source or destination is under heavy load and needs to be relieved, or the execution time needs to be rescheduled.</p>
     * <h2>Request description</h2>
     * <ul>
     * <li><code>batchId</code> specifies the check batch to stop. The value is obtained from the response of the API operation that saves the data validation node.</li>
     * <li>You can stop only a batch that is in the running state. If the batch does not exist or has already ended (succeeded, failed, or stopped), the operation returns an error without making any changes.</li>
     * <li>The stop action applies only to the current batch and does not change the timed scheduling switch of the node. To stop periodic execution, use the API operation that enables or disables timed scheduling.</li>
     * </ul>
     * <h2>Response description</h2>
     * <p>A common response is returned, which contains only <code>success</code>, <code>errCode</code>, <code>errMessage</code>, and <code>requestId</code>. No business data is returned. If <code>success</code> is <code>true</code>, the stop action has taken effect. If <code>success</code> is <code>false</code>, use <code>errCode</code> and <code>errMessage</code> to identify the cause of the failure. The error message &quot;task is not running&quot; indicates that the batch no longer needs to be stopped.</p>
     * 
     * <b>summary</b> : 
     * <p>Stops the check node execution in the current scheduling run. Task results of completed subtasks are retained.</p>
     * 
     * @param request ExecDataCheckStopRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExecDataCheckStopResponse
     */
    public ExecDataCheckStopResponse execDataCheckStopWithOptions(ExecDataCheckStopRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.batchId)) {
            body.put("batchId", request.batchId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExecDataCheckStop"),
            new TeaPair("version", "2025-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dataCheck/task/v3/stop"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExecDataCheckStopResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Stops a running check batch and terminates any incomplete comparison work in the current scheduling run. Task results of completed subtasks are retained. After the node is stopped, you can rerun only the failed and stopped portions without rerunning the entire node.
     * This operation is applicable to scenarios where the check scope is misconfigured, the source or destination is under heavy load and needs to be relieved, or the execution time needs to be rescheduled.</p>
     * <h2>Request description</h2>
     * <ul>
     * <li><code>batchId</code> specifies the check batch to stop. The value is obtained from the response of the API operation that saves the data validation node.</li>
     * <li>You can stop only a batch that is in the running state. If the batch does not exist or has already ended (succeeded, failed, or stopped), the operation returns an error without making any changes.</li>
     * <li>The stop action applies only to the current batch and does not change the timed scheduling switch of the node. To stop periodic execution, use the API operation that enables or disables timed scheduling.</li>
     * </ul>
     * <h2>Response description</h2>
     * <p>A common response is returned, which contains only <code>success</code>, <code>errCode</code>, <code>errMessage</code>, and <code>requestId</code>. No business data is returned. If <code>success</code> is <code>true</code>, the stop action has taken effect. If <code>success</code> is <code>false</code>, use <code>errCode</code> and <code>errMessage</code> to identify the cause of the failure. The error message &quot;task is not running&quot; indicates that the batch no longer needs to be stopped.</p>
     * 
     * <b>summary</b> : 
     * <p>Stops the check node execution in the current scheduling run. Task results of completed subtasks are retained.</p>
     * 
     * @param request ExecDataCheckStopRequest
     * @return ExecDataCheckStopResponse
     */
    public ExecDataCheckStopResponse execDataCheckStop(ExecDataCheckStopRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execDataCheckStopWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Starts or stops the timed scheduling toggle of a data validation task to control whether the task is periodically executed based on the configured scheduling rule. You can submit multiple tasks at a time to start or stop a batch of validation tasks.
     * This operation only switches the scheduling toggle. It does not change the scheduling expression of the task or trigger an immediate execution. To run a task immediately, use the immediate execution operation for validation tasks.</p>
     * <h2>Request description</h2>
     * <ul>
     * <li><code>params</code> is a list of task scheduling parameters. You can submit multiple tasks at a time.</li>
     * <li>The <code>id</code> field in each item is the validation task ID. The <code>lastBatchId</code> field is the most recent batch number of the task. The <code>isScheduled</code> field is the target scheduling status: <code>0</code> indicates that timed scheduling is stopped, and <code>1</code> indicates that timed scheduling is started.</li>
     * <li>To start timed scheduling, the task must have a valid scheduling rule configured. After timed scheduling is stopped, the task is no longer periodically triggered, and existing historical batches and results are retained.</li>
     * </ul>
     * <h2>Response description</h2>
     * <p>A common response is returned, which contains only <code>success</code>, <code>errCode</code>, <code>errMessage</code>, and <code>requestId</code>. No business data is returned. If <code>success</code> is <code>true</code>, the scheduling status of the tasks in the list has been switched as submitted. If <code>success</code> is <code>false</code>, use <code>errCode</code> and <code>errMessage</code> to identify the cause of the failure.</p>
     * 
     * <b>summary</b> : 
     * <p>Switches the timed scheduling toggle of a data validation task to control whether the task is periodically executed based on a Cron rule.</p>
     * 
     * @param request ExecDataCheckToggleRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExecDataCheckToggleResponse
     */
    public ExecDataCheckToggleResponse execDataCheckToggleWithOptions(ExecDataCheckToggleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.params)) {
            body.put("params", request.params);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExecDataCheckToggle"),
            new TeaPair("version", "2025-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dataCheck/task/v3/toggle"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExecDataCheckToggleResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Starts or stops the timed scheduling toggle of a data validation task to control whether the task is periodically executed based on the configured scheduling rule. You can submit multiple tasks at a time to start or stop a batch of validation tasks.
     * This operation only switches the scheduling toggle. It does not change the scheduling expression of the task or trigger an immediate execution. To run a task immediately, use the immediate execution operation for validation tasks.</p>
     * <h2>Request description</h2>
     * <ul>
     * <li><code>params</code> is a list of task scheduling parameters. You can submit multiple tasks at a time.</li>
     * <li>The <code>id</code> field in each item is the validation task ID. The <code>lastBatchId</code> field is the most recent batch number of the task. The <code>isScheduled</code> field is the target scheduling status: <code>0</code> indicates that timed scheduling is stopped, and <code>1</code> indicates that timed scheduling is started.</li>
     * <li>To start timed scheduling, the task must have a valid scheduling rule configured. After timed scheduling is stopped, the task is no longer periodically triggered, and existing historical batches and results are retained.</li>
     * </ul>
     * <h2>Response description</h2>
     * <p>A common response is returned, which contains only <code>success</code>, <code>errCode</code>, <code>errMessage</code>, and <code>requestId</code>. No business data is returned. If <code>success</code> is <code>true</code>, the scheduling status of the tasks in the list has been switched as submitted. If <code>success</code> is <code>false</code>, use <code>errCode</code> and <code>errMessage</code> to identify the cause of the failure.</p>
     * 
     * <b>summary</b> : 
     * <p>Switches the timed scheduling toggle of a data validation task to control whether the task is periodically executed based on a Cron rule.</p>
     * 
     * @param request ExecDataCheckToggleRequest
     * @return ExecDataCheckToggleResponse
     */
    public ExecDataCheckToggleResponse execDataCheckToggle(ExecDataCheckToggleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execDataCheckToggleWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Checks whether a datasource name is already in use under the current tenant. This operation is used as a pre-check before creating a datasource or updating a datasource name.
     * Datasource names must be unique within a tenant. If a name conflict exists, the creation request fails directly. Call this operation first to confirm that the name is available. This helps you avoid exposing conflicts only when you submit the creation request.</p>
     * <h2>Request description</h2>
     * <ul>
     * <li><code>dsName</code> specifies the datasource name to check. The system performs an exact match against non-deleted datasources under the current tenant. Prefix matching and fuzzy matching are not supported.</li>
     * <li>The check scope is limited to the current tenant. Datasources with the same name under other tenants do not affect the result. Names of deleted datasources can be reused.</li>
     * </ul>
     * <h2>Response description</h2>
     * <p>The response returns a single value. <code>data</code> is a Boolean value that indicates the name check result: <code>true</code> indicates that a datasource with the same name already exists and the name is unavailable. <code>false</code> indicates that the name is not in use and can be used to create a datasource.
     * Note that the semantics of <code>data</code> is opposite to that of <code>success</code>. If <code>success</code> is <code>true</code> and <code>data</code> is <code>true</code>, the call succeeded and a datasource with the same name was found. In this case, use a different name. If <code>success</code> is <code>false</code>, use <code>errCode</code> and <code>errMessage</code> to identify the cause of the call failure.</p>
     * 
     * <b>summary</b> : 
     * <p>Checks whether a datasource with the specified name already exists under the current tenant. This operation is used as a pre-check before creating or renaming a datasource.</p>
     * 
     * @param request ExecMetaDataComponentNameRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExecMetaDataComponentNameResponse
     */
    public ExecMetaDataComponentNameResponse execMetaDataComponentNameWithOptions(ExecMetaDataComponentNameRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dsName)) {
            query.put("dsName", request.dsName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExecMetaDataComponentName"),
            new TeaPair("version", "2025-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/meta/data-component/check-name"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExecMetaDataComponentNameResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Checks whether a datasource name is already in use under the current tenant. This operation is used as a pre-check before creating a datasource or updating a datasource name.
     * Datasource names must be unique within a tenant. If a name conflict exists, the creation request fails directly. Call this operation first to confirm that the name is available. This helps you avoid exposing conflicts only when you submit the creation request.</p>
     * <h2>Request description</h2>
     * <ul>
     * <li><code>dsName</code> specifies the datasource name to check. The system performs an exact match against non-deleted datasources under the current tenant. Prefix matching and fuzzy matching are not supported.</li>
     * <li>The check scope is limited to the current tenant. Datasources with the same name under other tenants do not affect the result. Names of deleted datasources can be reused.</li>
     * </ul>
     * <h2>Response description</h2>
     * <p>The response returns a single value. <code>data</code> is a Boolean value that indicates the name check result: <code>true</code> indicates that a datasource with the same name already exists and the name is unavailable. <code>false</code> indicates that the name is not in use and can be used to create a datasource.
     * Note that the semantics of <code>data</code> is opposite to that of <code>success</code>. If <code>success</code> is <code>true</code> and <code>data</code> is <code>true</code>, the call succeeded and a datasource with the same name was found. In this case, use a different name. If <code>success</code> is <code>false</code>, use <code>errCode</code> and <code>errMessage</code> to identify the cause of the call failure.</p>
     * 
     * <b>summary</b> : 
     * <p>Checks whether a datasource with the specified name already exists under the current tenant. This operation is used as a pre-check before creating or renaming a datasource.</p>
     * 
     * @param request ExecMetaDataComponentNameRequest
     * @return ExecMetaDataComponentNameResponse
     */
    public ExecMetaDataComponentNameResponse execMetaDataComponentName(ExecMetaDataComponentNameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execMetaDataComponentNameWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Performs a synchronous conversion of a single SQL script. The parsing and rewriting are completed within a single call, and the SQL text in the target dialect is returned directly. This operation is suitable for manually verifying individual statements or validating conversion results. The conversion processes statements as query statements (DQL). To convert entire scripts or large files in batches, use the asynchronous script conversion task operation to avoid synchronous call timeouts.</p>
     * <h2>Request description</h2>
     * <ul>
     * <li>The request body is a JSON object. <code>sourceDialect</code> and <code>targetDialect</code> specify the source and target SQL dialects (such as hive or maxcompute), which determine the direction of the rewriting rules.</li>
     * <li><code>sourceSqlScript</code> is the script content to be converted. It must be Base64-encoded before being passed in. The server decodes the content before performing the conversion. Passing in the raw text causes a decoding failure and prevents the conversion.</li>
     * <li><code>tableMapping</code> is a list of table name mappings. Each element uses a comma (,) to separate the source table and target table (such as <code>src_table,dst_table</code>). Multiple mappings are merged by line breaks during conversion. If this parameter is not specified, the original table names in the script are used.</li>
     * </ul>
     * <h2>Response description</h2>
     * <p>A single-value response is returned. <code>data</code> is the converted SQL script in the target dialect (string). If <code>success</code> is <code>true</code>, the conversion is complete. If <code>success</code> is <code>false</code>, use <code>errCode</code> and <code>errMessage</code> to identify the failure cause. <code>requestId</code> is used to troubleshoot the call.</p>
     * 
     * <b>summary</b> : 
     * <p>Converts a single SQL script.</p>
     * 
     * @param request ExecSqlTransSingleScriptTranslateRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExecSqlTransSingleScriptTranslateResponse
     */
    public ExecSqlTransSingleScriptTranslateResponse execSqlTransSingleScriptTranslateWithOptions(ExecSqlTransSingleScriptTranslateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sourceDialect)) {
            body.put("sourceDialect", request.sourceDialect);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceSqlScript)) {
            body.put("sourceSqlScript", request.sourceSqlScript);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableMapping)) {
            body.put("tableMapping", request.tableMapping);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetDialect)) {
            body.put("targetDialect", request.targetDialect);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExecSqlTransSingleScriptTranslate"),
            new TeaPair("version", "2025-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/bigdata/sql-translator/open/single/translate-sync"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExecSqlTransSingleScriptTranslateResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Performs a synchronous conversion of a single SQL script. The parsing and rewriting are completed within a single call, and the SQL text in the target dialect is returned directly. This operation is suitable for manually verifying individual statements or validating conversion results. The conversion processes statements as query statements (DQL). To convert entire scripts or large files in batches, use the asynchronous script conversion task operation to avoid synchronous call timeouts.</p>
     * <h2>Request description</h2>
     * <ul>
     * <li>The request body is a JSON object. <code>sourceDialect</code> and <code>targetDialect</code> specify the source and target SQL dialects (such as hive or maxcompute), which determine the direction of the rewriting rules.</li>
     * <li><code>sourceSqlScript</code> is the script content to be converted. It must be Base64-encoded before being passed in. The server decodes the content before performing the conversion. Passing in the raw text causes a decoding failure and prevents the conversion.</li>
     * <li><code>tableMapping</code> is a list of table name mappings. Each element uses a comma (,) to separate the source table and target table (such as <code>src_table,dst_table</code>). Multiple mappings are merged by line breaks during conversion. If this parameter is not specified, the original table names in the script are used.</li>
     * </ul>
     * <h2>Response description</h2>
     * <p>A single-value response is returned. <code>data</code> is the converted SQL script in the target dialect (string). If <code>success</code> is <code>true</code>, the conversion is complete. If <code>success</code> is <code>false</code>, use <code>errCode</code> and <code>errMessage</code> to identify the failure cause. <code>requestId</code> is used to troubleshoot the call.</p>
     * 
     * <b>summary</b> : 
     * <p>Converts a single SQL script.</p>
     * 
     * @param request ExecSqlTransSingleScriptTranslateRequest
     * @return ExecSqlTransSingleScriptTranslateResponse
     */
    public ExecSqlTransSingleScriptTranslateResponse execSqlTransSingleScriptTranslate(ExecSqlTransSingleScriptTranslateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execSqlTransSingleScriptTranslateWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Checks whether a storage data source used for schedule migration is reachable. Before submitting a workflow migration (write) task, call this operation to verify that the destination storage is accessible. This helps you identify connection issues before the task enters the write phase.</p>
     * <h2>Request description</h2>
     * <ul>
     * <li>The request body is a JSON object. The dsName, dsType, dsVersion, and dsConfig parameters together describe the data source to be checked. The dsConfig parameter is a JSON string whose structure is determined by dsType.</li>
     * <li>If you specify id, the check is performed on a registered data source. The isModified parameter indicates whether the configuration has been modified, which tells the server to reconnect by using the new configuration.</li>
     * <li>The check is performed in the schedule migration scenario and only determines whether the access capabilities required for this scenario are available.</li>
     * </ul>
     * <h2>Response description</h2>
     * <p>If the data source is reachable, success is set to true and data is set to true. If the data source is not reachable, the operation returns an error: errCode contains the data source connection error, and errMessage provides the specific failure reason. Use this information to check network reachability, account permissions, and dsConfig settings.</p>
     * 
     * <b>summary</b> : 
     * <p>Checks the connectivity of a storage data source used for schedule migration. You can submit a workflow migration task only after the connectivity check is passed.</p>
     * 
     * @param request ExecWorkflowConnectivityRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExecWorkflowConnectivityResponse
     */
    public ExecWorkflowConnectivityResponse execWorkflowConnectivityWithOptions(ExecWorkflowConnectivityRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dsConfig)) {
            body.put("dsConfig", request.dsConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dsName)) {
            body.put("dsName", request.dsName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dsType)) {
            body.put("dsType", request.dsType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dsVersion)) {
            body.put("dsVersion", request.dsVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isModified)) {
            body.put("isModified", request.isModified);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExecWorkflowConnectivity"),
            new TeaPair("version", "2025-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/meta/data-component/workflow/connectivity"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExecWorkflowConnectivityResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Checks whether a storage data source used for schedule migration is reachable. Before submitting a workflow migration (write) task, call this operation to verify that the destination storage is accessible. This helps you identify connection issues before the task enters the write phase.</p>
     * <h2>Request description</h2>
     * <ul>
     * <li>The request body is a JSON object. The dsName, dsType, dsVersion, and dsConfig parameters together describe the data source to be checked. The dsConfig parameter is a JSON string whose structure is determined by dsType.</li>
     * <li>If you specify id, the check is performed on a registered data source. The isModified parameter indicates whether the configuration has been modified, which tells the server to reconnect by using the new configuration.</li>
     * <li>The check is performed in the schedule migration scenario and only determines whether the access capabilities required for this scenario are available.</li>
     * </ul>
     * <h2>Response description</h2>
     * <p>If the data source is reachable, success is set to true and data is set to true. If the data source is not reachable, the operation returns an error: errCode contains the data source connection error, and errMessage provides the specific failure reason. Use this information to check network reachability, account permissions, and dsConfig settings.</p>
     * 
     * <b>summary</b> : 
     * <p>Checks the connectivity of a storage data source used for schedule migration. You can submit a workflow migration task only after the connectivity check is passed.</p>
     * 
     * @param request ExecWorkflowConnectivityRequest
     * @return ExecWorkflowConnectivityResponse
     */
    public ExecWorkflowConnectivityResponse execWorkflowConnectivity(ExecWorkflowConnectivityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execWorkflowConnectivityWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Queries the paging list of instances in the commit (write) stage for a scheduling migration node to view the transform and commit progress of each workflow instance on the destination. After a commit node is started, this operation serves as the primary entry point for tracking the execute results.</p>
     * <h2>Request description</h2>
     * <ul>
     * <li><code>taskId</code> is required and specifies the scheduling migration node ID.</li>
     * <li><code>status</code> is optional and filters instances by instance status. If this parameter is not specified, instances in all statuses under the node are returned.</li>
     * <li><code>pageIndex</code> and <code>pageSize</code> are optional and specify the page number and the number of entries per page. Default values are 1 and 10.</li>
     * </ul>
     * <h2>Response description</h2>
     * <p>A paging response is returned: <code>totalCount</code> indicates the total number of instances that meet the conditional criteria, <code>pageIndex</code> and <code>pageSize</code> echo the paging parameters of the current request, and <code>data</code> contains the instance list for the current page. Each list element includes the instance identity (<code>instanceId</code> and <code>instanceName</code>), the source scheduling information <code>srcMetaInfo</code> and its metadata update time <code>srcMetaGmtUpdate</code>, the transform execute time <code>gmtConvert</code>, the transform result <code>status</code>, and the transform failed reason <code>detail</code>. When <code>success</code> is <code>false</code>, use <code>errCode</code> and <code>errMessage</code> to troubleshoot the issue.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the paging list of commit (write) instances for a scheduling migration node by node ID and status, and returns the transform and commit stage status of each instance.</p>
     * 
     * @param request GetBwmMigrationSubmitInstanceListRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetBwmMigrationSubmitInstanceListResponse
     */
    public GetBwmMigrationSubmitInstanceListResponse getBwmMigrationSubmitInstanceListWithOptions(GetBwmMigrationSubmitInstanceListRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            query.put("pageIndex", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("taskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBwmMigrationSubmitInstanceList"),
            new TeaPair("version", "2025-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/bwm/task/migration/submit/instances/list"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetBwmMigrationSubmitInstanceListResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Queries the paging list of instances in the commit (write) stage for a scheduling migration node to view the transform and commit progress of each workflow instance on the destination. After a commit node is started, this operation serves as the primary entry point for tracking the execute results.</p>
     * <h2>Request description</h2>
     * <ul>
     * <li><code>taskId</code> is required and specifies the scheduling migration node ID.</li>
     * <li><code>status</code> is optional and filters instances by instance status. If this parameter is not specified, instances in all statuses under the node are returned.</li>
     * <li><code>pageIndex</code> and <code>pageSize</code> are optional and specify the page number and the number of entries per page. Default values are 1 and 10.</li>
     * </ul>
     * <h2>Response description</h2>
     * <p>A paging response is returned: <code>totalCount</code> indicates the total number of instances that meet the conditional criteria, <code>pageIndex</code> and <code>pageSize</code> echo the paging parameters of the current request, and <code>data</code> contains the instance list for the current page. Each list element includes the instance identity (<code>instanceId</code> and <code>instanceName</code>), the source scheduling information <code>srcMetaInfo</code> and its metadata update time <code>srcMetaGmtUpdate</code>, the transform execute time <code>gmtConvert</code>, the transform result <code>status</code>, and the transform failed reason <code>detail</code>. When <code>success</code> is <code>false</code>, use <code>errCode</code> and <code>errMessage</code> to troubleshoot the issue.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the paging list of commit (write) instances for a scheduling migration node by node ID and status, and returns the transform and commit stage status of each instance.</p>
     * 
     * @param request GetBwmMigrationSubmitInstanceListRequest
     * @return GetBwmMigrationSubmitInstanceListResponse
     */
    public GetBwmMigrationSubmitInstanceListResponse getBwmMigrationSubmitInstanceList(GetBwmMigrationSubmitInstanceListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getBwmMigrationSubmitInstanceListWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Exports the result package of the write phase for a scheduling migration by commit instance, and returns the download URL of the result package. This allows you to view the complete batch write result details offline. The write result package and the transform result package share the same export capability with consistent field definitions.</p>
     * <h2>Request description</h2>
     * <ul>
     * <li><code>instanceId</code> is required. It specifies the commit instance identity for which to export the result package. You can obtain this identity from the list commit instances operation.</li>
     * <li>Each invocation exports the result package for only one instance. To export result packages for multiple instances, invoke this operation separately for each instance.</li>
     * </ul>
     * <h2>Response description</h2>
     * <p>Returns a single-value response. <code>data</code> contains the result package URL (character string). Use this URL to download the complete result file. If <code>success</code> is <code>false</code>, use <code>errCode</code> and <code>errMessage</code> to identify the failure cause. <code>requestId</code> can be used to troubleshoot the invocation.</p>
     * 
     * <b>summary</b> : 
     * <p>Exports the result package of a write task by instance ID for offline viewing of complete batch write results.</p>
     * 
     * @param request GetBwmMigrationTaskWriterResultPackageRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetBwmMigrationTaskWriterResultPackageResponse
     */
    public GetBwmMigrationTaskWriterResultPackageResponse getBwmMigrationTaskWriterResultPackageWithOptions(GetBwmMigrationTaskWriterResultPackageRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("instanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBwmMigrationTaskWriterResultPackage"),
            new TeaPair("version", "2025-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/bwm/task/migration/write/result/export/package"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetBwmMigrationTaskWriterResultPackageResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Exports the result package of the write phase for a scheduling migration by commit instance, and returns the download URL of the result package. This allows you to view the complete batch write result details offline. The write result package and the transform result package share the same export capability with consistent field definitions.</p>
     * <h2>Request description</h2>
     * <ul>
     * <li><code>instanceId</code> is required. It specifies the commit instance identity for which to export the result package. You can obtain this identity from the list commit instances operation.</li>
     * <li>Each invocation exports the result package for only one instance. To export result packages for multiple instances, invoke this operation separately for each instance.</li>
     * </ul>
     * <h2>Response description</h2>
     * <p>Returns a single-value response. <code>data</code> contains the result package URL (character string). Use this URL to download the complete result file. If <code>success</code> is <code>false</code>, use <code>errCode</code> and <code>errMessage</code> to identify the failure cause. <code>requestId</code> can be used to troubleshoot the invocation.</p>
     * 
     * <b>summary</b> : 
     * <p>Exports the result package of a write task by instance ID for offline viewing of complete batch write results.</p>
     * 
     * @param request GetBwmMigrationTaskWriterResultPackageRequest
     * @return GetBwmMigrationTaskWriterResultPackageResponse
     */
    public GetBwmMigrationTaskWriterResultPackageResponse getBwmMigrationTaskWriterResultPackage(GetBwmMigrationTaskWriterResultPackageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getBwmMigrationTaskWriterResultPackageWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Performs a paged query on workflow details in a write report by commit instance with paging. Supports filtering by name. Use this operation to verify the commit status, target workflow identity, and failure reason for each workflow on the target side. This operation is shared by write reports and publish reports.</p>
     * <h2>Request description</h2>
     * <ul>
     * <li><code>instanceId</code> is required and specifies the commit instance identity.</li>
     * <li><code>workflowName</code> is optional and filters by workflow name to quickly locate a specific workflow within an instance.</li>
     * <li><code>pageIndex</code> and <code>pageSize</code> are optional. The default values are 1 and 10.</li>
     * </ul>
     * <h2>Response description</h2>
     * <p>Returns a paginated response: <code>totalCount</code> is the total number of workflows that match the filter conditions, and <code>data</code> contains the details of the current page. Each element in the list contains the source workflow identifier and name (<code>workflowId</code>, <code>workflowName</code>), the scheduling expression <code>cron</code>, the node count <code>taskNodeCount</code>, the submit status <code>submitStatus</code> (WRT_INIT: submit not started, WRT_RUN: submitting, WRT_SUCC: all submitted successfully, WRT_FAIL: all submissions failed, WRT_PART_FAIL: some submissions failed, DPY_SUCC: published successfully, DPY_FAIL: publish failed), the submit failure message <code>submitDetail</code>, and the target workflow name and identifier (<code>targetWorkflowName</code>, <code>targetWorkflowId</code>).</p>
     * 
     * <b>summary</b> : 
     * <p>Performs a paged query on the details of workflows in a write (or publish) report by instance ID with paging. Supports filtering by workflow name.</p>
     * 
     * @param request GetBwmMigrationTaskWriterWorkflowListRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetBwmMigrationTaskWriterWorkflowListResponse
     */
    public GetBwmMigrationTaskWriterWorkflowListResponse getBwmMigrationTaskWriterWorkflowListWithOptions(GetBwmMigrationTaskWriterWorkflowListRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("instanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            query.put("pageIndex", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workflowName)) {
            query.put("workflowName", request.workflowName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBwmMigrationTaskWriterWorkflowList"),
            new TeaPair("version", "2025-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/bwm/task/migration/write/result/workflow/list"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetBwmMigrationTaskWriterWorkflowListResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Performs a paged query on workflow details in a write report by commit instance with paging. Supports filtering by name. Use this operation to verify the commit status, target workflow identity, and failure reason for each workflow on the target side. This operation is shared by write reports and publish reports.</p>
     * <h2>Request description</h2>
     * <ul>
     * <li><code>instanceId</code> is required and specifies the commit instance identity.</li>
     * <li><code>workflowName</code> is optional and filters by workflow name to quickly locate a specific workflow within an instance.</li>
     * <li><code>pageIndex</code> and <code>pageSize</code> are optional. The default values are 1 and 10.</li>
     * </ul>
     * <h2>Response description</h2>
     * <p>Returns a paginated response: <code>totalCount</code> is the total number of workflows that match the filter conditions, and <code>data</code> contains the details of the current page. Each element in the list contains the source workflow identifier and name (<code>workflowId</code>, <code>workflowName</code>), the scheduling expression <code>cron</code>, the node count <code>taskNodeCount</code>, the submit status <code>submitStatus</code> (WRT_INIT: submit not started, WRT_RUN: submitting, WRT_SUCC: all submitted successfully, WRT_FAIL: all submissions failed, WRT_PART_FAIL: some submissions failed, DPY_SUCC: published successfully, DPY_FAIL: publish failed), the submit failure message <code>submitDetail</code>, and the target workflow name and identifier (<code>targetWorkflowName</code>, <code>targetWorkflowId</code>).</p>
     * 
     * <b>summary</b> : 
     * <p>Performs a paged query on the details of workflows in a write (or publish) report by instance ID with paging. Supports filtering by workflow name.</p>
     * 
     * @param request GetBwmMigrationTaskWriterWorkflowListRequest
     * @return GetBwmMigrationTaskWriterWorkflowListResponse
     */
    public GetBwmMigrationTaskWriterWorkflowListResponse getBwmMigrationTaskWriterWorkflowList(GetBwmMigrationTaskWriterWorkflowListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getBwmMigrationTaskWriterWorkflowListWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Starts the submit (write) action sequence for a scheduling migration task to batch import converted workflows into the destination scheduling system. The start operation is asynchronous: a successful call only indicates that the write process has been triggered. To check the progress, query the submit instance list and workflow details.</p>
     * <h2>Request description</h2>
     * <ul>
     * <li><code>taskId</code> is required and specifies the scheduling migration task ID.</li>
     * <li>This operation triggers the write sequence for the entire task at once. You do not need to submit workflows one by one.</li>
     * </ul>
     * <h2>Response description</h2>
     * <p>The response returns a single value. <code>data</code> is a fixed integer value of <code>0</code>, which only indicates that the start request has been accepted. It does not indicate that the import is complete or the number of imported workflows. To check the import result, query the submit instance list and workflow details. If <code>success</code> is <code>false</code>, troubleshoot the issue based on <code>errCode</code> and <code>errMessage</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Starts a schedule import (write) task by task ID to batch import converted workflows into the destination scheduling system.</p>
     * 
     * @param request GetBwmMigrationWorkflowSubmitStartRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetBwmMigrationWorkflowSubmitStartResponse
     */
    public GetBwmMigrationWorkflowSubmitStartResponse getBwmMigrationWorkflowSubmitStartWithOptions(GetBwmMigrationWorkflowSubmitStartRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("taskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBwmMigrationWorkflowSubmitStart"),
            new TeaPair("version", "2025-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/bwm/task/migration/submit/start"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetBwmMigrationWorkflowSubmitStartResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Starts the submit (write) action sequence for a scheduling migration task to batch import converted workflows into the destination scheduling system. The start operation is asynchronous: a successful call only indicates that the write process has been triggered. To check the progress, query the submit instance list and workflow details.</p>
     * <h2>Request description</h2>
     * <ul>
     * <li><code>taskId</code> is required and specifies the scheduling migration task ID.</li>
     * <li>This operation triggers the write sequence for the entire task at once. You do not need to submit workflows one by one.</li>
     * </ul>
     * <h2>Response description</h2>
     * <p>The response returns a single value. <code>data</code> is a fixed integer value of <code>0</code>, which only indicates that the start request has been accepted. It does not indicate that the import is complete or the number of imported workflows. To check the import result, query the submit instance list and workflow details. If <code>success</code> is <code>false</code>, troubleshoot the issue based on <code>errCode</code> and <code>errMessage</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Starts a schedule import (write) task by task ID to batch import converted workflows into the destination scheduling system.</p>
     * 
     * @param request GetBwmMigrationWorkflowSubmitStartRequest
     * @return GetBwmMigrationWorkflowSubmitStartResponse
     */
    public GetBwmMigrationWorkflowSubmitStartResponse getBwmMigrationWorkflowSubmitStart(GetBwmMigrationWorkflowSubmitStartRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getBwmMigrationWorkflowSubmitStartWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Calculates and returns the next 5 execution times based on a Cron expression. Use this operation to confirm that the expression matches the expected schedule before configuring a scheduling rule for a data validation task. This helps you avoid discovering scheduling errors only after the configuration takes effect.</p>
     * <h2>Request description</h2>
     * <ul>
     * <li>cronRule is required and must be a Cron expression. When passed as a query parameter, replace spaces in the expression with plus signs <code>+</code>. For example, <code>0+0+0+*+*+?</code> indicates execution at midnight every day.</li>
     * <li>The server validates the expression first. If the expression is invalid, an error is returned directly without an execution time list.</li>
     * </ul>
     * <h2>Response description</h2>
     * <p>The response is a list. The data field contains 5 execution times (strings) sorted in chronological order. If success is <code>false</code>, the expression is invalid or the calculation failed. Use errCode and errMessage to troubleshoot. Use requestId to trace the call.</p>
     * 
     * <b>summary</b> : 
     * <p>Calculates and returns the next 5 execute times based on a Cron expression, allowing you to verify that a validation rule is correct before configuring a scheduled data validation task. This is a general-purpose operation that does not require authentication.</p>
     * 
     * @param request GetCronExecTimeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCronExecTimeResponse
     */
    public GetCronExecTimeResponse getCronExecTimeWithOptions(GetCronExecTimeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cronRule)) {
            query.put("cronRule", request.cronRule);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCronExecTime"),
            new TeaPair("version", "2025-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dataCheck/task/v3/cron/exeTime"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCronExecTimeResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Calculates and returns the next 5 execution times based on a Cron expression. Use this operation to confirm that the expression matches the expected schedule before configuring a scheduling rule for a data validation task. This helps you avoid discovering scheduling errors only after the configuration takes effect.</p>
     * <h2>Request description</h2>
     * <ul>
     * <li>cronRule is required and must be a Cron expression. When passed as a query parameter, replace spaces in the expression with plus signs <code>+</code>. For example, <code>0+0+0+*+*+?</code> indicates execution at midnight every day.</li>
     * <li>The server validates the expression first. If the expression is invalid, an error is returned directly without an execution time list.</li>
     * </ul>
     * <h2>Response description</h2>
     * <p>The response is a list. The data field contains 5 execution times (strings) sorted in chronological order. If success is <code>false</code>, the expression is invalid or the calculation failed. Use errCode and errMessage to troubleshoot. Use requestId to trace the call.</p>
     * 
     * <b>summary</b> : 
     * <p>Calculates and returns the next 5 execute times based on a Cron expression, allowing you to verify that a validation rule is correct before configuring a scheduled data validation task. This is a general-purpose operation that does not require authentication.</p>
     * 
     * @param request GetCronExecTimeRequest
     * @return GetCronExecTimeResponse
     */
    public GetCronExecTimeResponse getCronExecTime(GetCronExecTimeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getCronExecTimeWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Queries the detail configuration list of tables to be validated for a data validation task. All results are returned at once without pagination. Use this operation to view the source tables and destination tables configured for the task, the scope of comparison, and the comparison rules. This is the primary entry point for verifying configurations before executing a validation task.</p>
     * <h2>Request description</h2>
     * <ul>
     * <li>taskId is required. It specifies the ID of the data validation task, which is obtained from the response of the operation that creates a data validation task.</li>
     * <li>A single call returns all table detail configurations under the specified task. If no table details are configured for the task, an empty list is returned.</li>
     * </ul>
     * <h2>Response description</h2>
     * <p>The response is a list. Each element in data represents a table detail configuration, which contains the configuration ID, the associated task and validation type, the data source, table name, fields, partitions, WHERE and GROUP conditions, hints, and comparison keys for both the source and destination. It also contains comparison rule-related fields: totalCountThreshold for the total data volume threshold, groupCountThreshold for the grouped data volume threshold, batchSize for the batch size, algorithm for the validation algorithm, comparator for the comparison type, metricType for the metric type, isFullTableCount for whether full-table comparison is enabled, and isSkipped for whether the configuration is skipped. If success is false, troubleshoot the issue based on errCode and errMessage.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the table detail configurations of a data validation task by task ID, and returns the tables to be validated, validation scope, and comparison rules.</p>
     * 
     * @param request GetDataCheckConfigRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDataCheckConfigResponse
     */
    public GetDataCheckConfigResponse getDataCheckConfigWithOptions(GetDataCheckConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("taskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDataCheckConfig"),
            new TeaPair("version", "2025-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dataCheck/config/v3/getConfig"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDataCheckConfigResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Queries the detail configuration list of tables to be validated for a data validation task. All results are returned at once without pagination. Use this operation to view the source tables and destination tables configured for the task, the scope of comparison, and the comparison rules. This is the primary entry point for verifying configurations before executing a validation task.</p>
     * <h2>Request description</h2>
     * <ul>
     * <li>taskId is required. It specifies the ID of the data validation task, which is obtained from the response of the operation that creates a data validation task.</li>
     * <li>A single call returns all table detail configurations under the specified task. If no table details are configured for the task, an empty list is returned.</li>
     * </ul>
     * <h2>Response description</h2>
     * <p>The response is a list. Each element in data represents a table detail configuration, which contains the configuration ID, the associated task and validation type, the data source, table name, fields, partitions, WHERE and GROUP conditions, hints, and comparison keys for both the source and destination. It also contains comparison rule-related fields: totalCountThreshold for the total data volume threshold, groupCountThreshold for the grouped data volume threshold, batchSize for the batch size, algorithm for the validation algorithm, comparator for the comparison type, metricType for the metric type, isFullTableCount for whether full-table comparison is enabled, and isSkipped for whether the configuration is skipped. If success is false, troubleshoot the issue based on errCode and errMessage.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the table detail configurations of a data validation task by task ID, and returns the tables to be validated, validation scope, and comparison rules.</p>
     * 
     * @param request GetDataCheckConfigRequest
     * @return GetDataCheckConfigResponse
     */
    public GetDataCheckConfigResponse getDataCheckConfig(GetDataCheckConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDataCheckConfigWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Queries the overview of a data validation report by validation batch. The response includes the number of tables validated in this batch, the number of tables that passed, the pass rate, partition-level and field-level statistics, and the report generation status. This operation serves as the primary entry point for viewing validation conclusions. To obtain table-level details, call the report instance or column-level result operations.</p>
     * <h2>Request description</h2>
     * <ul>
     * <li><code>batchId</code> is required. It specifies the ID of the validation job (batch), which is returned by the operation that saves a validation task. Subsequent operations for execution, stopping, rerunning, and reporting all reference the same validation by this ID.</li>
     * </ul>
     * <h2>Response description</h2>
     * <p>The response is a single-value object. The <code>data</code> field is the overview object: <code>checkType</code> indicates the validation type (0: data volume comparison, 1: metric comparison, 2: weak content comparison). <code>checkResult</code> indicates the validation result (0: no records, 1: passed, 2: not passed). <code>reportStatus</code> indicates the report generation status (0: not generated, 1: generating, 2: generated). <code>reportGenerateMessage</code> provides a message about the generation progress. The statistics section includes the number of validated tables, tables with errors, tables that passed, skipped tables and partitions, validated partitions, validated rows and passed rows, pass rate (<code>passProcess</code> as a decimal and <code>passProcessExport</code> as a percentage string), field-level validation count and pass count, source and destination data source information, associated task identifiers and timestamps, and template information for metric validation scenarios.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the overview of a data validation report by validation batch, and returns summary metrics such as the number of validated tables, passed tables, and pass rate.</p>
     * 
     * @param request GetDataCheckReportOverviewRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDataCheckReportOverviewResponse
     */
    public GetDataCheckReportOverviewResponse getDataCheckReportOverviewWithOptions(GetDataCheckReportOverviewRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.batchId)) {
            query.put("batchId", request.batchId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDataCheckReportOverview"),
            new TeaPair("version", "2025-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dataCheck/report/v3/overview"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDataCheckReportOverviewResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Queries the overview of a data validation report by validation batch. The response includes the number of tables validated in this batch, the number of tables that passed, the pass rate, partition-level and field-level statistics, and the report generation status. This operation serves as the primary entry point for viewing validation conclusions. To obtain table-level details, call the report instance or column-level result operations.</p>
     * <h2>Request description</h2>
     * <ul>
     * <li><code>batchId</code> is required. It specifies the ID of the validation job (batch), which is returned by the operation that saves a validation task. Subsequent operations for execution, stopping, rerunning, and reporting all reference the same validation by this ID.</li>
     * </ul>
     * <h2>Response description</h2>
     * <p>The response is a single-value object. The <code>data</code> field is the overview object: <code>checkType</code> indicates the validation type (0: data volume comparison, 1: metric comparison, 2: weak content comparison). <code>checkResult</code> indicates the validation result (0: no records, 1: passed, 2: not passed). <code>reportStatus</code> indicates the report generation status (0: not generated, 1: generating, 2: generated). <code>reportGenerateMessage</code> provides a message about the generation progress. The statistics section includes the number of validated tables, tables with errors, tables that passed, skipped tables and partitions, validated partitions, validated rows and passed rows, pass rate (<code>passProcess</code> as a decimal and <code>passProcessExport</code> as a percentage string), field-level validation count and pass count, source and destination data source information, associated task identifiers and timestamps, and template information for metric validation scenarios.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the overview of a data validation report by validation batch, and returns summary metrics such as the number of validated tables, passed tables, and pass rate.</p>
     * 
     * @param request GetDataCheckReportOverviewRequest
     * @return GetDataCheckReportOverviewResponse
     */
    public GetDataCheckReportOverviewResponse getDataCheckReportOverview(GetDataCheckReportOverviewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDataCheckReportOverviewWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Queries the generation status of a data validation report by validation batch. Use this operation to poll the progress after triggering report generation. Report generation is an asynchronous process. The report overview and report details operations return complete data only after the status changes to generated.</p>
     * <h2>Request description</h2>
     * <ul>
     * <li><code>batchId</code> is required. It is the validation batch ID, obtained from the response of the ExecDataCheckSaveTask operation.</li>
     * <li>Each call queries the status of only one batch. When the report is being generated, call this operation repeatedly at intervals to refresh the status.</li>
     * </ul>
     * <h2>Response description</h2>
     * <p>Returns a single-value response. <code>data</code> is the report generation status code: <code>0</code> for not generated, <code>1</code> for generating, <code>2</code> for generated, and <code>3</code> for generation failed. After the status changes to generated, you can query the report overview and details. If the status is generation failed, troubleshoot the issue based on <code>errCode</code> and <code>errMessage</code>, and re-trigger report generation if necessary.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the generation status (not generated, generating, or generated) and generation information of a report for a specified validation batch.</p>
     * 
     * @param request GetDataCheckReportStatusRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDataCheckReportStatusResponse
     */
    public GetDataCheckReportStatusResponse getDataCheckReportStatusWithOptions(GetDataCheckReportStatusRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.batchId)) {
            query.put("batchId", request.batchId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDataCheckReportStatus"),
            new TeaPair("version", "2025-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dataCheck/report/v3/getReportStatus"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDataCheckReportStatusResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Queries the generation status of a data validation report by validation batch. Use this operation to poll the progress after triggering report generation. Report generation is an asynchronous process. The report overview and report details operations return complete data only after the status changes to generated.</p>
     * <h2>Request description</h2>
     * <ul>
     * <li><code>batchId</code> is required. It is the validation batch ID, obtained from the response of the ExecDataCheckSaveTask operation.</li>
     * <li>Each call queries the status of only one batch. When the report is being generated, call this operation repeatedly at intervals to refresh the status.</li>
     * </ul>
     * <h2>Response description</h2>
     * <p>Returns a single-value response. <code>data</code> is the report generation status code: <code>0</code> for not generated, <code>1</code> for generating, <code>2</code> for generated, and <code>3</code> for generation failed. After the status changes to generated, you can query the report overview and details. If the status is generation failed, troubleshoot the issue based on <code>errCode</code> and <code>errMessage</code>, and re-trigger report generation if necessary.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the generation status (not generated, generating, or generated) and generation information of a report for a specified validation batch.</p>
     * 
     * @param request GetDataCheckReportStatusRequest
     * @return GetDataCheckReportStatusResponse
     */
    public GetDataCheckReportStatusResponse getDataCheckReportStatus(GetDataCheckReportStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDataCheckReportStatusWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Queries the batch-level complete configuration of a data validation task. The response includes the validation type, execution and scheduling settings, comparison granularity and thresholds, batch concurrency, source and destination global parameters, and the table-level detail configurations under the task. Use this operation to verify the overall settings of a task before running the validation.</p>
     * <h2>Request description</h2>
     * <ul>
     * <li><code>taskId</code> is required and specifies the ID of the data validation task.</li>
     * <li>This operation returns task-level settings and includes the table-level detail configurations in the <code>dataCheckConfig</code> array. To retrieve only the table-level details, use the list operation for data validation task configurations.</li>
     * </ul>
     * <h2>Response description</h2>
     * <p>The response contains a single-value result. <code>data</code> is the task configuration object: <code>checkType</code> indicates the validation rule type (0: data volume comparison, 1: metric comparison, 2: weak content comparison, 3: custom comparison, 4: full-text comparison, 5: null rate comparison). <code>executeType</code>, <code>isScheduled</code>, <code>cronExp</code>, <code>scheduleId</code>, and <code>startImmediately</code> describe the execution method and scheduling settings. <code>fullTableCount</code>, <code>totalCountThreshold</code>, <code>groupCountThreshold</code>, and <code>concurrency</code> describe the comparison granularity, data volume thresholds, and batch concurrency. <code>sourceGlobalParams</code>, <code>targetGlobalParams</code>, and <code>checkGlobalParams</code> are the global parameters for the source, destination, and validation service respectively (JSON strings). <code>scopeFilter</code> specifies the scope filter conditions. <code>taskMode</code> indicates the creation method (0: table-by-table fine-grained, 1: same-schema batch). <code>batchId</code> is the current batch identifier, and <code>dataCheckConfig</code> is the list of table-level detail configurations under the task.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the complete configuration of a data validation task by task ID, including data sources, validation type, and scheduling settings.</p>
     * 
     * @param request GetDataCheckTaskConfigRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDataCheckTaskConfigResponse
     */
    public GetDataCheckTaskConfigResponse getDataCheckTaskConfigWithOptions(GetDataCheckTaskConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("taskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDataCheckTaskConfig"),
            new TeaPair("version", "2025-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dataCheck/task/v3/config"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDataCheckTaskConfigResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Queries the batch-level complete configuration of a data validation task. The response includes the validation type, execution and scheduling settings, comparison granularity and thresholds, batch concurrency, source and destination global parameters, and the table-level detail configurations under the task. Use this operation to verify the overall settings of a task before running the validation.</p>
     * <h2>Request description</h2>
     * <ul>
     * <li><code>taskId</code> is required and specifies the ID of the data validation task.</li>
     * <li>This operation returns task-level settings and includes the table-level detail configurations in the <code>dataCheckConfig</code> array. To retrieve only the table-level details, use the list operation for data validation task configurations.</li>
     * </ul>
     * <h2>Response description</h2>
     * <p>The response contains a single-value result. <code>data</code> is the task configuration object: <code>checkType</code> indicates the validation rule type (0: data volume comparison, 1: metric comparison, 2: weak content comparison, 3: custom comparison, 4: full-text comparison, 5: null rate comparison). <code>executeType</code>, <code>isScheduled</code>, <code>cronExp</code>, <code>scheduleId</code>, and <code>startImmediately</code> describe the execution method and scheduling settings. <code>fullTableCount</code>, <code>totalCountThreshold</code>, <code>groupCountThreshold</code>, and <code>concurrency</code> describe the comparison granularity, data volume thresholds, and batch concurrency. <code>sourceGlobalParams</code>, <code>targetGlobalParams</code>, and <code>checkGlobalParams</code> are the global parameters for the source, destination, and validation service respectively (JSON strings). <code>scopeFilter</code> specifies the scope filter conditions. <code>taskMode</code> indicates the creation method (0: table-by-table fine-grained, 1: same-schema batch). <code>batchId</code> is the current batch identifier, and <code>dataCheckConfig</code> is the list of table-level detail configurations under the task.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the complete configuration of a data validation task by task ID, including data sources, validation type, and scheduling settings.</p>
     * 
     * @param request GetDataCheckTaskConfigRequest
     * @return GetDataCheckTaskConfigResponse
     */
    public GetDataCheckTaskConfigResponse getDataCheckTaskConfig(GetDataCheckTaskConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDataCheckTaskConfigWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Lists data validation tasks by condition with paging, with support for combined filtering by task name, validation type, execute status, validation result, scheduling status, template name, and creation or update time range. The response includes the execution progress, validation statistics, and data source and engine information for both the source and destination of each task. This operation serves as the task overview entry point for data validation capabilities.</p>
     * <h2>Request description</h2>
     * <ul>
     * <li>The request body is a JSON object in which all fields are optional. If no filter conditions are specified, all tasks visible to the current user are returned.</li>
     * <li><code>taskName</code> and <code>templateName</code> support fuzzy match. The server converts <code>templateName</code> into a list of template IDs before filtering.</li>
     * <li><code>checkType</code>, <code>execStatus</code>, <code>checkResult</code>, and <code>isScheduled</code> filter by exact enum values. <code>createStartTime</code> and <code>createEndTime</code>, <code>updateStartTime</code> and <code>updateEndTime</code> define time ranges in the format YYYY-MM-DD HH:MM:SS.</li>
     * <li><code>pageIndex</code> and <code>pageSize</code> control pagination. Default values are 1 and 10.</li>
     * </ul>
     * <h2>Response description</h2>
     * <p>The response is paginated: <code>totalCount</code> indicates the total number of tasks that match the filter conditions, <code>pageIndex</code> and <code>pageSize</code> echo the pagination parameters of the current request, and <code>data</code> contains the task list for the current page. Each list element includes the task ID and name, creation mode <code>taskMode</code>, validation type <code>checkType</code>, execution status <code>execStatus</code>, execution type <code>executeType</code>, validation result <code>checkResult</code>, execution progress <code>process</code>, pass rate <code>passProcess</code>, number of validated tables and the counts of abnormal, successful, and skipped tables, latest batch IDs (<code>lastBatchId</code> and <code>lastFinishedId</code>), scheduling switch, start and end times, execution duration, creation and modification times, report time and title, error message <code>errorMsg</code>, as well as data source and validation engine information for both the source and destination and the validation template used.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists data validation tasks by condition with paging, with support for filtering by task name, data source, and other dimensions.</p>
     * 
     * @param request GetDataCheckTaskListRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDataCheckTaskListResponse
     */
    public GetDataCheckTaskListResponse getDataCheckTaskListWithOptions(GetDataCheckTaskListRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.checkResult)) {
            body.put("checkResult", request.checkResult);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.checkType)) {
            body.put("checkType", request.checkType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createEndTime)) {
            body.put("createEndTime", request.createEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createStartTime)) {
            body.put("createStartTime", request.createStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.execStatus)) {
            body.put("execStatus", request.execStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isScheduled)) {
            body.put("isScheduled", request.isScheduled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            body.put("pageIndex", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskName)) {
            body.put("taskName", request.taskName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateName)) {
            body.put("templateName", request.templateName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.updateEndTime)) {
            body.put("updateEndTime", request.updateEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.updateStartTime)) {
            body.put("updateStartTime", request.updateStartTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDataCheckTaskList"),
            new TeaPair("version", "2025-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dataCheck/task/v3/find"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDataCheckTaskListResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Lists data validation tasks by condition with paging, with support for combined filtering by task name, validation type, execute status, validation result, scheduling status, template name, and creation or update time range. The response includes the execution progress, validation statistics, and data source and engine information for both the source and destination of each task. This operation serves as the task overview entry point for data validation capabilities.</p>
     * <h2>Request description</h2>
     * <ul>
     * <li>The request body is a JSON object in which all fields are optional. If no filter conditions are specified, all tasks visible to the current user are returned.</li>
     * <li><code>taskName</code> and <code>templateName</code> support fuzzy match. The server converts <code>templateName</code> into a list of template IDs before filtering.</li>
     * <li><code>checkType</code>, <code>execStatus</code>, <code>checkResult</code>, and <code>isScheduled</code> filter by exact enum values. <code>createStartTime</code> and <code>createEndTime</code>, <code>updateStartTime</code> and <code>updateEndTime</code> define time ranges in the format YYYY-MM-DD HH:MM:SS.</li>
     * <li><code>pageIndex</code> and <code>pageSize</code> control pagination. Default values are 1 and 10.</li>
     * </ul>
     * <h2>Response description</h2>
     * <p>The response is paginated: <code>totalCount</code> indicates the total number of tasks that match the filter conditions, <code>pageIndex</code> and <code>pageSize</code> echo the pagination parameters of the current request, and <code>data</code> contains the task list for the current page. Each list element includes the task ID and name, creation mode <code>taskMode</code>, validation type <code>checkType</code>, execution status <code>execStatus</code>, execution type <code>executeType</code>, validation result <code>checkResult</code>, execution progress <code>process</code>, pass rate <code>passProcess</code>, number of validated tables and the counts of abnormal, successful, and skipped tables, latest batch IDs (<code>lastBatchId</code> and <code>lastFinishedId</code>), scheduling switch, start and end times, execution duration, creation and modification times, report time and title, error message <code>errorMsg</code>, as well as data source and validation engine information for both the source and destination and the validation template used.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists data validation tasks by condition with paging, with support for filtering by task name, data source, and other dimensions.</p>
     * 
     * @param request GetDataCheckTaskListRequest
     * @return GetDataCheckTaskListResponse
     */
    public GetDataCheckTaskListResponse getDataCheckTaskList(GetDataCheckTaskListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDataCheckTaskListWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Queries the detailed configuration of a data validation template by template ID. The response includes the basic template information, the overwrite scope of data sources and DPI engines, and the definitions of various check rules under the template. You can use this operation to view, reuse, or modify a configured set of check rules.</p>
     * <h2>Request description</h2>
     * <ul>
     * <li><code>templateId</code> is required. It specifies the check template ID, which can be obtained from the list templates operation.</li>
     * <li>Each call returns the details of only one template.</li>
     * </ul>
     * <h2>Response description</h2>
     * <p>The response is a single-value response. <code>data</code> is the template details object: <code>templateName</code> and <code>templateDesc</code> are the template name and description. <code>checkType</code> is the check rule type (0: data volume comparison, 1: metric comparison, 2: weak content comparison, 3: custom comparison, 4: full-text comparison, 5: null rate comparison). <code>checkTypeExport</code> is the Chinese name of the check type. <code>dsEngineRels</code> lists the data source types and check engine types covered by the template. The rule section varies by <code>checkType</code>: metric comparison (1) uses <code>basicMetricRules</code> and <code>complexMetricRules</code>, which correspond to metric rules for native and composite data types respectively, and <code>metricRules</code> is the list of metric rules. Weak content comparison (2) uses <code>weakContentRule</code>. Full-text comparison (4) uses <code>fulltextRule</code>. Null rate comparison (5) uses <code>nullRules</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the detailed configuration of a metric check template by template ID and returns the metric definitions included in the template.</p>
     * 
     * @param request GetDataCheckTemplateRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDataCheckTemplateResponse
     */
    public GetDataCheckTemplateResponse getDataCheckTemplateWithOptions(GetDataCheckTemplateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("templateId", request.templateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDataCheckTemplate"),
            new TeaPair("version", "2025-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dataCheck/template/v3/get"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDataCheckTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Queries the detailed configuration of a data validation template by template ID. The response includes the basic template information, the overwrite scope of data sources and DPI engines, and the definitions of various check rules under the template. You can use this operation to view, reuse, or modify a configured set of check rules.</p>
     * <h2>Request description</h2>
     * <ul>
     * <li><code>templateId</code> is required. It specifies the check template ID, which can be obtained from the list templates operation.</li>
     * <li>Each call returns the details of only one template.</li>
     * </ul>
     * <h2>Response description</h2>
     * <p>The response is a single-value response. <code>data</code> is the template details object: <code>templateName</code> and <code>templateDesc</code> are the template name and description. <code>checkType</code> is the check rule type (0: data volume comparison, 1: metric comparison, 2: weak content comparison, 3: custom comparison, 4: full-text comparison, 5: null rate comparison). <code>checkTypeExport</code> is the Chinese name of the check type. <code>dsEngineRels</code> lists the data source types and check engine types covered by the template. The rule section varies by <code>checkType</code>: metric comparison (1) uses <code>basicMetricRules</code> and <code>complexMetricRules</code>, which correspond to metric rules for native and composite data types respectively, and <code>metricRules</code> is the list of metric rules. Weak content comparison (2) uses <code>weakContentRule</code>. Full-text comparison (4) uses <code>fulltextRule</code>. Null rate comparison (5) uses <code>nullRules</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the detailed configuration of a metric check template by template ID and returns the metric definitions included in the template.</p>
     * 
     * @param request GetDataCheckTemplateRequest
     * @return GetDataCheckTemplateResponse
     */
    public GetDataCheckTemplateResponse getDataCheckTemplate(GetDataCheckTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDataCheckTemplateWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Queries a paginated list of data validation templates. Supports filtering by check type, template name, and whether the template is built-in. Use this operation to select an existing template when creating a validation task, or to view available built-in and custom templates.</p>
     * <h2>Request description</h2>
     * <ul>
     * <li>All parameters are optional. checkType filters by validation rule type (0: data volume comparison, 1: metric comparison, 2: weak content comparison, 3: custom comparison, 4: full-text comparison, 5: null rate comparison). templateName filters by template name. isBuiltin distinguishes built-in templates (1) from custom templates (0).</li>
     * <li>pageSize, pageIndex, orderBy, orderDirection, groupBy, and needTotalCount are common query parameters that control pagination, sorting, and whether to return the total count.</li>
     * <li>idList and isAdmin are legacy parameters. isAdmin is deprecated, and passing idList does not affect query results. Neither parameter needs to be used.</li>
     * </ul>
     * <h2>Response description</h2>
     * <p>The response contains a list. Each element in data represents a template and includes the template ID and name, the check type checkType and its display name checkTypeExport, the covered data source types dsTypes and validation engine types engineTypes, whether the template is built-in isBuiltin, the template description templateDesc, the modification time gmtModified, and whether the template is referenced by a validation task isUsedByTask. The response body returns only the list itself and does not include the total record count or pagination parameters.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of data validation templates with paging. Supports filtering by check type, template name, and whether the template is built-in. General node templates can be downloaded without authentication.</p>
     * 
     * @param tmpReq GetDataCheckTemplateListRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDataCheckTemplateListResponse
     */
    public GetDataCheckTemplateListResponse getDataCheckTemplateListWithOptions(GetDataCheckTemplateListRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetDataCheckTemplateListShrinkRequest request = new GetDataCheckTemplateListShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.idList)) {
            request.idListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.idList, "idList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.checkType)) {
            query.put("checkType", request.checkType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupBy)) {
            query.put("groupBy", request.groupBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idListShrink)) {
            query.put("idList", request.idListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isAdmin)) {
            query.put("isAdmin", request.isAdmin);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isBuiltin)) {
            query.put("isBuiltin", request.isBuiltin);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.needTotalCount)) {
            query.put("needTotalCount", request.needTotalCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("orderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderDirection)) {
            query.put("orderDirection", request.orderDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            query.put("pageIndex", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            query.put("requestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateName)) {
            query.put("templateName", request.templateName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDataCheckTemplateList"),
            new TeaPair("version", "2025-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dataCheck/template/v3/list"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDataCheckTemplateListResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Queries a paginated list of data validation templates. Supports filtering by check type, template name, and whether the template is built-in. Use this operation to select an existing template when creating a validation task, or to view available built-in and custom templates.</p>
     * <h2>Request description</h2>
     * <ul>
     * <li>All parameters are optional. checkType filters by validation rule type (0: data volume comparison, 1: metric comparison, 2: weak content comparison, 3: custom comparison, 4: full-text comparison, 5: null rate comparison). templateName filters by template name. isBuiltin distinguishes built-in templates (1) from custom templates (0).</li>
     * <li>pageSize, pageIndex, orderBy, orderDirection, groupBy, and needTotalCount are common query parameters that control pagination, sorting, and whether to return the total count.</li>
     * <li>idList and isAdmin are legacy parameters. isAdmin is deprecated, and passing idList does not affect query results. Neither parameter needs to be used.</li>
     * </ul>
     * <h2>Response description</h2>
     * <p>The response contains a list. Each element in data represents a template and includes the template ID and name, the check type checkType and its display name checkTypeExport, the covered data source types dsTypes and validation engine types engineTypes, whether the template is built-in isBuiltin, the template description templateDesc, the modification time gmtModified, and whether the template is referenced by a validation task isUsedByTask. The response body returns only the list itself and does not include the total record count or pagination parameters.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of data validation templates with paging. Supports filtering by check type, template name, and whether the template is built-in. General node templates can be downloaded without authentication.</p>
     * 
     * @param request GetDataCheckTemplateListRequest
     * @return GetDataCheckTemplateListResponse
     */
    public GetDataCheckTemplateListResponse getDataCheckTemplateList(GetDataCheckTemplateListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDataCheckTemplateListWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>This is an internal operation for querying the asynchronous result of a workflow conversion. After the submit operation PostInnerConvert accepts a conversion task and returns the acceptance result, this operation queries the asynchronous execution result of that conversion by using the same request credential. This operation serves as the polling side in the submit-and-poll invocation pattern.</p>
     * <h2>Request description</h2>
     * <p>The request body is a JSON object. The taskId parameter specifies the ID of the conversion task to query, which is the task identifier associated with the conversion task at the time of submission.</p>
     * <h2>Response description</h2>
     * <p>The success parameter indicates whether the call is successful. The data parameter contains the asynchronous execution result of the conversion task in string format. In specific error scenarios such as multiple data sources with the same name, the data parameter carries the error detail text. If the call fails, troubleshoot the issue based on errCode and errMessage. The requestId parameter uniquely identifies the call. Provide this value when troubleshooting issues.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the asynchronous execution result of a workflow conversion by submit credential. This is a Skill internal operation.</p>
     * 
     * @param request GetInnerConvertAsyncResultRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetInnerConvertAsyncResultResponse
     */
    public GetInnerConvertAsyncResultResponse getInnerConvertAsyncResultWithOptions(GetInnerConvertAsyncResultRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("taskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInnerConvertAsyncResult"),
            new TeaPair("version", "2025-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/skill/inner/v1/convert/async-result"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInnerConvertAsyncResultResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>This is an internal operation for querying the asynchronous result of a workflow conversion. After the submit operation PostInnerConvert accepts a conversion task and returns the acceptance result, this operation queries the asynchronous execution result of that conversion by using the same request credential. This operation serves as the polling side in the submit-and-poll invocation pattern.</p>
     * <h2>Request description</h2>
     * <p>The request body is a JSON object. The taskId parameter specifies the ID of the conversion task to query, which is the task identifier associated with the conversion task at the time of submission.</p>
     * <h2>Response description</h2>
     * <p>The success parameter indicates whether the call is successful. The data parameter contains the asynchronous execution result of the conversion task in string format. In specific error scenarios such as multiple data sources with the same name, the data parameter carries the error detail text. If the call fails, troubleshoot the issue based on errCode and errMessage. The requestId parameter uniquely identifies the call. Provide this value when troubleshooting issues.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the asynchronous execution result of a workflow conversion by submit credential. This is a Skill internal operation.</p>
     * 
     * @param request GetInnerConvertAsyncResultRequest
     * @return GetInnerConvertAsyncResultResponse
     */
    public GetInnerConvertAsyncResultResponse getInnerConvertAsyncResult(GetInnerConvertAsyncResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getInnerConvertAsyncResultWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>This is an internal operation for querying the asynchronous result of a workflow read operation. After the submit operation PostInnerReader accepts a source workflow read task and returns an acceptance result, this operation queries the asynchronous execution result of that read operation by using the same request credential. This operation serves as the polling side in the submit-and-poll invocation pattern.</p>
     * <h2>Request description</h2>
     * <p>The request body is a JSON object. The dataSourceName parameter specifies the name of the data source to which the read task belongs. The read task uses this field as its dimension identifier.</p>
     * <h2>Response description</h2>
     * <p>The success field indicates whether the call is successful. The data field contains the asynchronous execution result of the read task in string format. If the call fails, use errCode and errMessage to troubleshoot the issue. The requestId field uniquely identifies the call. Provide this value when troubleshooting issues.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the asynchronous execution result of a source workflow read operation by submit credential. This is a Skill internal operation.</p>
     * 
     * @param request GetInnerReadAsyncResultRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetInnerReadAsyncResultResponse
     */
    public GetInnerReadAsyncResultResponse getInnerReadAsyncResultWithOptions(GetInnerReadAsyncResultRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceName)) {
            body.put("dataSourceName", request.dataSourceName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInnerReadAsyncResult"),
            new TeaPair("version", "2025-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/skill/inner/v1/read/async-result"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInnerReadAsyncResultResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>This is an internal operation for querying the asynchronous result of a workflow read operation. After the submit operation PostInnerReader accepts a source workflow read task and returns an acceptance result, this operation queries the asynchronous execution result of that read operation by using the same request credential. This operation serves as the polling side in the submit-and-poll invocation pattern.</p>
     * <h2>Request description</h2>
     * <p>The request body is a JSON object. The dataSourceName parameter specifies the name of the data source to which the read task belongs. The read task uses this field as its dimension identifier.</p>
     * <h2>Response description</h2>
     * <p>The success field indicates whether the call is successful. The data field contains the asynchronous execution result of the read task in string format. If the call fails, use errCode and errMessage to troubleshoot the issue. The requestId field uniquely identifies the call. Provide this value when troubleshooting issues.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the asynchronous execution result of a source workflow read operation by submit credential. This is a Skill internal operation.</p>
     * 
     * @param request GetInnerReadAsyncResultRequest
     * @return GetInnerReadAsyncResultResponse
     */
    public GetInnerReadAsyncResultResponse getInnerReadAsyncResult(GetInnerReadAsyncResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getInnerReadAsyncResultWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Queries the registration and running status of a user-side Agent. Call this operation before using capabilities that depend on a local Agent, such as data validation, to confirm that the Agent is ready. This helps avoid task execution failures caused by an unregistered or stopped Agent.</p>
     * <h2>Request description</h2>
     * <ul>
     * <li><code>agentType</code>: required. Specifies the Agent type. Set this parameter to <code>0</code> for data validation (the only type currently supported) or <code>1</code> for metadata.</li>
     * <li><code>skillName</code>: optional. The skill name.</li>
     * </ul>
     * <h2>Response description</h2>
     * <p>Returns a single-value response. <code>data</code> contains the status information of the Agent as a string. If <code>success</code> is <code>false</code>, use <code>errCode</code> and <code>errMessage</code> to identify the failure cause. Use <code>requestId</code> to troubleshoot the call.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the registration and running status of a user-side Agent by agent type and skill name to determine whether the local environment is ready.</p>
     * 
     * @param request GetLhmAgentStatusRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetLhmAgentStatusResponse
     */
    public GetLhmAgentStatusResponse getLhmAgentStatusWithOptions(GetLhmAgentStatusRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentType)) {
            query.put("agentType", request.agentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillName)) {
            query.put("skillName", request.skillName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLhmAgentStatus"),
            new TeaPair("version", "2025-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/bigdata/lhm/agent/getAgentStatus"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetLhmAgentStatusResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Queries the registration and running status of a user-side Agent. Call this operation before using capabilities that depend on a local Agent, such as data validation, to confirm that the Agent is ready. This helps avoid task execution failures caused by an unregistered or stopped Agent.</p>
     * <h2>Request description</h2>
     * <ul>
     * <li><code>agentType</code>: required. Specifies the Agent type. Set this parameter to <code>0</code> for data validation (the only type currently supported) or <code>1</code> for metadata.</li>
     * <li><code>skillName</code>: optional. The skill name.</li>
     * </ul>
     * <h2>Response description</h2>
     * <p>Returns a single-value response. <code>data</code> contains the status information of the Agent as a string. If <code>success</code> is <code>false</code>, use <code>errCode</code> and <code>errMessage</code> to identify the failure cause. Use <code>requestId</code> to troubleshoot the call.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the registration and running status of a user-side Agent by agent type and skill name to determine whether the local environment is ready.</p>
     * 
     * @param request GetLhmAgentStatusRequest
     * @return GetLhmAgentStatusResponse
     */
    public GetLhmAgentStatusResponse getLhmAgentStatus(GetLhmAgentStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getLhmAgentStatusWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Queries the status of a user\&quot;s DataWorks resource groups by region. Use this operation before submitting a migration or validation task to confirm whether available execution resources exist in the specified region.</p>
     * <h2>Request description</h2>
     * <ul>
     * <li>regionId is required. Set this parameter to a region ID, such as cn-hangzhou.</li>
     * <li>Each call queries only one region. For cross-region deployments, query each region separately.</li>
     * </ul>
     * <h2>Response description</h2>
     * <p>The response returns a single value. The data field contains the status information of the resource group in the specified region as a string. If success is false, use errCode and errMessage to identify the cause of the failure. Use requestId to troubleshoot the call.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the status of a user\&quot;s DataWorks resource groups by region to determine whether available execution resources exist for migration tasks.</p>
     * 
     * @param request GetLhmDWResourceGroupStatusRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetLhmDWResourceGroupStatusResponse
     */
    public GetLhmDWResourceGroupStatusResponse getLhmDWResourceGroupStatusWithOptions(GetLhmDWResourceGroupStatusRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("regionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLhmDWResourceGroupStatus"),
            new TeaPair("version", "2025-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/bigdata/lhm/resource/getDWResourceGroupStatus"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetLhmDWResourceGroupStatusResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Queries the status of a user\&quot;s DataWorks resource groups by region. Use this operation before submitting a migration or validation task to confirm whether available execution resources exist in the specified region.</p>
     * <h2>Request description</h2>
     * <ul>
     * <li>regionId is required. Set this parameter to a region ID, such as cn-hangzhou.</li>
     * <li>Each call queries only one region. For cross-region deployments, query each region separately.</li>
     * </ul>
     * <h2>Response description</h2>
     * <p>The response returns a single value. The data field contains the status information of the resource group in the specified region as a string. If success is false, use errCode and errMessage to identify the cause of the failure. Use requestId to troubleshoot the call.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the status of a user\&quot;s DataWorks resource groups by region to determine whether available execution resources exist for migration tasks.</p>
     * 
     * @param request GetLhmDWResourceGroupStatusRequest
     * @return GetLhmDWResourceGroupStatusResponse
     */
    public GetLhmDWResourceGroupStatusResponse getLhmDWResourceGroupStatus(GetLhmDWResourceGroupStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getLhmDWResourceGroupStatusWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Retrieves temporary authorization credentials required for direct file uploads to Object Storage Service (OSS). The response includes a temporary AccessKey, security token, access endpoint, bucket, allowed upload directory prefix, upload policy and signature, and expiration time. These credentials enable the client to upload files by using form-based direct upload (PostObject) without storing long-term keys on the client.</p>
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation has no request parameters. The credential ownership and allowed upload directory are automatically generated by the server based on the current user and region.</li>
     * </ul>
     * <h2>Response description</h2>
     * <p>The response returns a single value. <code>data</code> is the temporary credential object: <code>ak</code> and <code>securityToken</code> are the temporary identity credentials. <code>endpoint</code> and <code>bucket</code> specify the upload target. <code>dir</code> is the allowed upload directory prefix (ending with a forward slash). The key of the uploaded object must start with this prefix. Otherwise, the request is rejected. <code>policy</code> is a Base64-encoded upload policy that defines constraints such as file size and path prefix. The decoded value is a JSON string. <code>signature</code> is the signature calculated based on the policy. <code>expire</code> is the credential expiration timestamp in Unix seconds. Before use, verify whether the credential has expired. If it has expired, call this operation again to obtain new credentials. <code>ak</code> and <code>securityToken</code> are sensitive credentials. Do not hard-code them in your code or print them to logs.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves temporary OSS upload credentials (STS), including the AccessKey, security token, bucket, upload directory, and expiration time.</p>
     * 
     * @param request GetMetaOssTempKeyRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMetaOssTempKeyResponse
     */
    public GetMetaOssTempKeyResponse getMetaOssTempKeyWithOptions(GetMetaOssTempKeyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMetaOssTempKey"),
            new TeaPair("version", "2025-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/meta/data-component/okss-services/file-job/sts"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMetaOssTempKeyResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Retrieves temporary authorization credentials required for direct file uploads to Object Storage Service (OSS). The response includes a temporary AccessKey, security token, access endpoint, bucket, allowed upload directory prefix, upload policy and signature, and expiration time. These credentials enable the client to upload files by using form-based direct upload (PostObject) without storing long-term keys on the client.</p>
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation has no request parameters. The credential ownership and allowed upload directory are automatically generated by the server based on the current user and region.</li>
     * </ul>
     * <h2>Response description</h2>
     * <p>The response returns a single value. <code>data</code> is the temporary credential object: <code>ak</code> and <code>securityToken</code> are the temporary identity credentials. <code>endpoint</code> and <code>bucket</code> specify the upload target. <code>dir</code> is the allowed upload directory prefix (ending with a forward slash). The key of the uploaded object must start with this prefix. Otherwise, the request is rejected. <code>policy</code> is a Base64-encoded upload policy that defines constraints such as file size and path prefix. The decoded value is a JSON string. <code>signature</code> is the signature calculated based on the policy. <code>expire</code> is the credential expiration timestamp in Unix seconds. Before use, verify whether the credential has expired. If it has expired, call this operation again to obtain new credentials. <code>ak</code> and <code>securityToken</code> are sensitive credentials. Do not hard-code them in your code or print them to logs.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves temporary OSS upload credentials (STS), including the AccessKey, security token, bucket, upload directory, and expiration time.</p>
     * 
     * @param request GetMetaOssTempKeyRequest
     * @return GetMetaOssTempKeyResponse
     */
    public GetMetaOssTempKeyResponse getMetaOssTempKey(GetMetaOssTempKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getMetaOssTempKeyWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Queries the execution progress of an SQL conversion task by task ID and returns the total number of scripts, the number of scripts being converted, the number of completed scripts, the number of failed scripts, and the completion percentage. Use this operation to poll the progress after submitting an asynchronous conversion task and determine when to retrieve the conversion results.</p>
     * <h2>Request description</h2>
     * <ul>
     * <li>taskId is required. It specifies the SQL conversion task ID, which is obtained from the response of the operation that creates the conversion task.</li>
     * <li>You can call this operation repeatedly during the conversion process to refresh the progress.</li>
     * </ul>
     * <h2>Response description</h2>
     * <p>The response returns a single-value result. The data field is a progress object: total indicates the total number of scripts, running indicates the number of scripts being converted, finish indicates the number of completed scripts, fail indicates the number of failed scripts, and percent indicates the completion percentage (for example, 66.67 indicates that approximately two-thirds of the scripts are completed). After the task is complete, call the query conversion results operation to retrieve the conversion details for each script.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the execution progress of an SQL conversion task by task ID and returns the total count, completed count, success count, and completion percentage.</p>
     * 
     * @param request GetSqlConversionProgressRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSqlConversionProgressResponse
     */
    public GetSqlConversionProgressResponse getSqlConversionProgressWithOptions(GetSqlConversionProgressRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("taskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSqlConversionProgress"),
            new TeaPair("version", "2025-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/bigdata/jobMigrate/sqlTranslator/task/api/progress"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSqlConversionProgressResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Queries the execution progress of an SQL conversion task by task ID and returns the total number of scripts, the number of scripts being converted, the number of completed scripts, the number of failed scripts, and the completion percentage. Use this operation to poll the progress after submitting an asynchronous conversion task and determine when to retrieve the conversion results.</p>
     * <h2>Request description</h2>
     * <ul>
     * <li>taskId is required. It specifies the SQL conversion task ID, which is obtained from the response of the operation that creates the conversion task.</li>
     * <li>You can call this operation repeatedly during the conversion process to refresh the progress.</li>
     * </ul>
     * <h2>Response description</h2>
     * <p>The response returns a single-value result. The data field is a progress object: total indicates the total number of scripts, running indicates the number of scripts being converted, finish indicates the number of completed scripts, fail indicates the number of failed scripts, and percent indicates the completion percentage (for example, 66.67 indicates that approximately two-thirds of the scripts are completed). After the task is complete, call the query conversion results operation to retrieve the conversion details for each script.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the execution progress of an SQL conversion task by task ID and returns the total count, completed count, success count, and completion percentage.</p>
     * 
     * @param request GetSqlConversionProgressRequest
     * @return GetSqlConversionProgressResponse
     */
    public GetSqlConversionProgressResponse getSqlConversionProgress(GetSqlConversionProgressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSqlConversionProgressWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Queries the result details of an SQL conversion task by using paging. Returns the original content, transformed content, transform status, failure reason, and table name mapping for each script. Use this operation to verify transform results one by one after a transform task is complete, or to identify scripts that failed to transform.</p>
     * <h2>Request description</h2>
     * <ul>
     * <li>The request body is a JSON object. <code>taskId</code> specifies the ID of the SQL conversion task to query, which is obtained from the response of the create conversion task operation. <code>page</code> and <code>size</code> specify the page number and the number of entries per page.</li>
     * <li>Conversion is an asynchronous process. Query the conversion progress first to confirm that the task is complete before calling this operation to retrieve details. If you call this operation while the conversion is still in progress, records with a converting status are returned.</li>
     * </ul>
     * <h2>Response description</h2>
     * <p>A paginated response is returned. <code>totalCount</code> is the total number of scripts that meet the conditions. <code>pageSize</code> and <code>pageIndex</code> echo the pagination parameters of the current request (corresponding to <code>size</code> and <code>page</code> in the request, respectively). <code>data</code> is the list of scripts on the current page. Each element in the list contains the script name and identifier (<code>scriptName</code> and <code>scriptId</code>), the original script content <code>sqlSourceContent</code>, the converted script content <code>sqlResultContent</code>, the script conversion status <code>scriptTransformStatus</code> (in conversion job scenarios: pass for conversion succeeded, turning for converting, and fail for conversion failed. In some scenarios: success for succeeded, failed for failed, and skipped for skipped), the error reason <code>errorMessage</code>, the completion time <code>finishTime</code>, and the table name mapping <code>tableMappingList</code>. For scripts with a conversion failed status, use <code>errorMessage</code> to identify the issue, fix the script, and resubmit it for conversion.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the result details of an SQL conversion task and returns the source statement, target statement, and conversion status of each SQL statement.</p>
     * 
     * @param request GetSqlConversionResultRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSqlConversionResultResponse
     */
    public GetSqlConversionResultResponse getSqlConversionResultWithOptions(GetSqlConversionResultRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            body.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            body.put("size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("taskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSqlConversionResult"),
            new TeaPair("version", "2025-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/bigdata/jobMigrate/sqlTranslator/task/api/result"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSqlConversionResultResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Queries the result details of an SQL conversion task by using paging. Returns the original content, transformed content, transform status, failure reason, and table name mapping for each script. Use this operation to verify transform results one by one after a transform task is complete, or to identify scripts that failed to transform.</p>
     * <h2>Request description</h2>
     * <ul>
     * <li>The request body is a JSON object. <code>taskId</code> specifies the ID of the SQL conversion task to query, which is obtained from the response of the create conversion task operation. <code>page</code> and <code>size</code> specify the page number and the number of entries per page.</li>
     * <li>Conversion is an asynchronous process. Query the conversion progress first to confirm that the task is complete before calling this operation to retrieve details. If you call this operation while the conversion is still in progress, records with a converting status are returned.</li>
     * </ul>
     * <h2>Response description</h2>
     * <p>A paginated response is returned. <code>totalCount</code> is the total number of scripts that meet the conditions. <code>pageSize</code> and <code>pageIndex</code> echo the pagination parameters of the current request (corresponding to <code>size</code> and <code>page</code> in the request, respectively). <code>data</code> is the list of scripts on the current page. Each element in the list contains the script name and identifier (<code>scriptName</code> and <code>scriptId</code>), the original script content <code>sqlSourceContent</code>, the converted script content <code>sqlResultContent</code>, the script conversion status <code>scriptTransformStatus</code> (in conversion job scenarios: pass for conversion succeeded, turning for converting, and fail for conversion failed. In some scenarios: success for succeeded, failed for failed, and skipped for skipped), the error reason <code>errorMessage</code>, the completion time <code>finishTime</code>, and the table name mapping <code>tableMappingList</code>. For scripts with a conversion failed status, use <code>errorMessage</code> to identify the issue, fix the script, and resubmit it for conversion.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the result details of an SQL conversion task and returns the source statement, target statement, and conversion status of each SQL statement.</p>
     * 
     * @param request GetSqlConversionResultRequest
     * @return GetSqlConversionResultResponse
     */
    public GetSqlConversionResultResponse getSqlConversionResult(GetSqlConversionResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSqlConversionResultWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Parses table-level lineage from a single SQL script and returns the names of upstream and downstream tables referenced by the script. Use this operation to identify the scope of tables involved in a script before performing batch conversions, or to provide a basis for configuring table name mapping.</p>
     * <h2>Request description</h2>
     * <ul>
     * <li>The request body is a JSON object. <code>dialect</code> specifies the SQL dialect used by the script (such as hive). During parsing, the same dialect is used for both the source and target. This operation only performs parsing and does not perform cross-dialect rewriting. <code>defaultSchema</code> specifies the default database name, which is used to complete table references in the script that do not explicitly specify a database name. <code>sourceSqlScriptBase64</code> specifies the script content to be parsed, which must be Base64-encoded before being passed in. The server decodes the content before parsing.</li>
     * <li>Parsing is processed as a data query language (DQL) statement. Each call parses only one script.</li>
     * </ul>
     * <h2>Response description</h2>
     * <p>A single-value response is returned. <code>data</code> is the lineage object. <code>upstreamTables</code> is the list of upstream table names. <code>downstreamTables</code> is the list of downstream table names. <code>success</code> indicates whether the parsing was successful. <code>errorMsg</code> provides the reason when parsing fails. When parsing fails, the outer layer also returns an SQL validation error. Use <code>errCode</code> and <code>errMessage</code> to troubleshoot the issue. Common causes include unparseable script syntax or Base64 decoding failure. <code>requestId</code> is used to locate the current call.</p>
     * 
     * <b>summary</b> : 
     * <p>Parses table-level lineage from a single SQL script and returns the names of upstream and downstream tables referenced by the script.</p>
     * 
     * @param request GetSqlTableLineageRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSqlTableLineageResponse
     */
    public GetSqlTableLineageResponse getSqlTableLineageWithOptions(GetSqlTableLineageRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.defaultSchema)) {
            body.put("defaultSchema", request.defaultSchema);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dialect)) {
            body.put("dialect", request.dialect);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceSqlScriptBase64)) {
            body.put("sourceSqlScriptBase64", request.sourceSqlScriptBase64);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSqlTableLineage"),
            new TeaPair("version", "2025-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/bigdata/sql-translator/open/single/getTableLineage"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSqlTableLineageResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Parses table-level lineage from a single SQL script and returns the names of upstream and downstream tables referenced by the script. Use this operation to identify the scope of tables involved in a script before performing batch conversions, or to provide a basis for configuring table name mapping.</p>
     * <h2>Request description</h2>
     * <ul>
     * <li>The request body is a JSON object. <code>dialect</code> specifies the SQL dialect used by the script (such as hive). During parsing, the same dialect is used for both the source and target. This operation only performs parsing and does not perform cross-dialect rewriting. <code>defaultSchema</code> specifies the default database name, which is used to complete table references in the script that do not explicitly specify a database name. <code>sourceSqlScriptBase64</code> specifies the script content to be parsed, which must be Base64-encoded before being passed in. The server decodes the content before parsing.</li>
     * <li>Parsing is processed as a data query language (DQL) statement. Each call parses only one script.</li>
     * </ul>
     * <h2>Response description</h2>
     * <p>A single-value response is returned. <code>data</code> is the lineage object. <code>upstreamTables</code> is the list of upstream table names. <code>downstreamTables</code> is the list of downstream table names. <code>success</code> indicates whether the parsing was successful. <code>errorMsg</code> provides the reason when parsing fails. When parsing fails, the outer layer also returns an SQL validation error. Use <code>errCode</code> and <code>errMessage</code> to troubleshoot the issue. Common causes include unparseable script syntax or Base64 decoding failure. <code>requestId</code> is used to locate the current call.</p>
     * 
     * <b>summary</b> : 
     * <p>Parses table-level lineage from a single SQL script and returns the names of upstream and downstream tables referenced by the script.</p>
     * 
     * @param request GetSqlTableLineageRequest
     * @return GetSqlTableLineageResponse
     */
    public GetSqlTableLineageResponse getSqlTableLineage(GetSqlTableLineageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSqlTableLineageWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Parses a single SQL script and returns the list of table names referenced in the script. Use this operation before performing a conversion to confirm which tables the script references, facilitating table name mapping preparation or conversion scope verification.</p>
     * <h2>Request description</h2>
     * <ul>
     * <li>The request body is a JSON object. <code>sourceDialect</code> and <code>targetDialect</code> specify the source and target SQL dialects (such as hive or maxcompute). <code>sourceSqlScript</code> is the script content to be parsed. You must Base64-encode the script before passing it in. The server decodes the content before parsing. Passing the raw script directly causes a decoding failure and prevents parsing.</li>
     * <li>Parsing treats the input as a data query language (DQL) statement. Each call parses only one script.</li>
     * </ul>
     * <h2>Response description</h2>
     * <p>The response is a list. <code>data</code> is a string array where each item is a table name parsed from the script. If the script contains no table references, an empty list is returned. If parsing fails, a SQL validation error is returned. <code>errCode</code> and <code>errMessage</code> provide the failure reason. <code>requestId</code> identifies the call for troubleshooting.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves table metadata information.</p>
     * 
     * @param request GetSqlTransTableMetaInfoRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSqlTransTableMetaInfoResponse
     */
    public GetSqlTransTableMetaInfoResponse getSqlTransTableMetaInfoWithOptions(GetSqlTransTableMetaInfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sourceDialect)) {
            body.put("sourceDialect", request.sourceDialect);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceSqlScript)) {
            body.put("sourceSqlScript", request.sourceSqlScript);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetDialect)) {
            body.put("targetDialect", request.targetDialect);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSqlTransTableMetaInfo"),
            new TeaPair("version", "2025-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/bigdata/sql-translator/open/single/get-table-info"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSqlTransTableMetaInfoResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Parses a single SQL script and returns the list of table names referenced in the script. Use this operation before performing a conversion to confirm which tables the script references, facilitating table name mapping preparation or conversion scope verification.</p>
     * <h2>Request description</h2>
     * <ul>
     * <li>The request body is a JSON object. <code>sourceDialect</code> and <code>targetDialect</code> specify the source and target SQL dialects (such as hive or maxcompute). <code>sourceSqlScript</code> is the script content to be parsed. You must Base64-encode the script before passing it in. The server decodes the content before parsing. Passing the raw script directly causes a decoding failure and prevents parsing.</li>
     * <li>Parsing treats the input as a data query language (DQL) statement. Each call parses only one script.</li>
     * </ul>
     * <h2>Response description</h2>
     * <p>The response is a list. <code>data</code> is a string array where each item is a table name parsed from the script. If the script contains no table references, an empty list is returned. If parsing fails, a SQL validation error is returned. <code>errCode</code> and <code>errMessage</code> provide the failure reason. <code>requestId</code> identifies the call for troubleshooting.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves table metadata information.</p>
     * 
     * @param request GetSqlTransTableMetaInfoRequest
     * @return GetSqlTransTableMetaInfoResponse
     */
    public GetSqlTransTableMetaInfoResponse getSqlTransTableMetaInfo(GetSqlTransTableMetaInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSqlTransTableMetaInfoWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Queries the result overview of a single validation step by validation result ID. The response includes the consistency conclusion, the number of validated and passed fields and metrics, and the table, partition, and metric information for both the source and target. This is useful for quickly determining the overall pass status when drilling down to a specific validation result in a report.</p>
     * <h2>Request description</h2>
     * <ul>
     * <li><code>resultId</code> is required. It is the unique ID of the validation result, obtained from the <code>resultId</code> field returned by the validation report query operation.</li>
     * <li>Each call queries only one validation result. To retrieve field-level comparison details for the result, call the field-level detail operation.</li>
     * </ul>
     * <h2>Response description</h2>
     * <p>The response is a single-value object. <code>data</code> is the overview object: <code>resultId</code> echoes the validation result ID of this query. <code>status</code> indicates the step status. Valid values: 0 (created), 1 (running), 2 (completed), 3 (stopped), 4 (canceled). <code>isConsistent</code> indicates whether the source and target are consistent. Valid values: 0 (inconsistent), 1 (consistent). <code>checkColumnCount</code> and <code>passColumnCount</code> indicate the number of validated fields and the number of passed fields. <code>metricColumnCount</code> and <code>metricPassColumnCount</code> indicate the number of validated metrics and the number of passed metrics. <code>sourceTable</code> and <code>targetTable</code>, <code>sourcePtName</code> and <code>targetPtName</code>, <code>srcMetricName</code> and <code>dstMetricName</code> provide the table names, partition names, and metric names for the source and target respectively. The consistency conclusion and statistics are meaningful only when the step status is completed.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the step-level result overview by validation result ID to determine the overall pass status of a single validation step.</p>
     * 
     * @param request GetStepResultOverviewRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetStepResultOverviewResponse
     */
    public GetStepResultOverviewResponse getStepResultOverviewWithOptions(GetStepResultOverviewRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resultId)) {
            query.put("resultId", request.resultId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetStepResultOverview"),
            new TeaPair("version", "2025-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dataCheck/report/v3/result/overview"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetStepResultOverviewResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Queries the result overview of a single validation step by validation result ID. The response includes the consistency conclusion, the number of validated and passed fields and metrics, and the table, partition, and metric information for both the source and target. This is useful for quickly determining the overall pass status when drilling down to a specific validation result in a report.</p>
     * <h2>Request description</h2>
     * <ul>
     * <li><code>resultId</code> is required. It is the unique ID of the validation result, obtained from the <code>resultId</code> field returned by the validation report query operation.</li>
     * <li>Each call queries only one validation result. To retrieve field-level comparison details for the result, call the field-level detail operation.</li>
     * </ul>
     * <h2>Response description</h2>
     * <p>The response is a single-value object. <code>data</code> is the overview object: <code>resultId</code> echoes the validation result ID of this query. <code>status</code> indicates the step status. Valid values: 0 (created), 1 (running), 2 (completed), 3 (stopped), 4 (canceled). <code>isConsistent</code> indicates whether the source and target are consistent. Valid values: 0 (inconsistent), 1 (consistent). <code>checkColumnCount</code> and <code>passColumnCount</code> indicate the number of validated fields and the number of passed fields. <code>metricColumnCount</code> and <code>metricPassColumnCount</code> indicate the number of validated metrics and the number of passed metrics. <code>sourceTable</code> and <code>targetTable</code>, <code>sourcePtName</code> and <code>targetPtName</code>, <code>srcMetricName</code> and <code>dstMetricName</code> provide the table names, partition names, and metric names for the source and target respectively. The consistency conclusion and statistics are meaningful only when the step status is completed.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the step-level result overview by validation result ID to determine the overall pass status of a single validation step.</p>
     * 
     * @param request GetStepResultOverviewRequest
     * @return GetStepResultOverviewResponse
     */
    public GetStepResultOverviewResponse getStepResultOverview(GetStepResultOverviewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getStepResultOverviewWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Queries field (column) dimension validation details by validation result ID with paging. The response returns the comparison results between the source and destination for each field, the comparison rule used, the expected threshold, and the actual difference. Use this operation to drill down validation conclusions to the field level and identify which column was determined to be inconsistent and by which rule.</p>
     * <h2>Request description</h2>
     * <ul>
     * <li><code>resultId</code> is required. It specifies the validation result ID, which is obtained from the validation report query operation or the step overview operation.</li>
     * <li><code>pageIndex</code> and <code>pageSize</code> are optional. They specify the page number (starting from 1) and the number of entries per page, respectively. The default value of <code>pageSize</code> is 10.</li>
     * </ul>
     * <h2>Response description</h2>
     * <p>The response is paginated: <code>totalCount</code> indicates the total number of fields that meet the conditions, <code>pageIndex</code> and <code>pageSize</code> echo the pagination parameters of the current request, and <code>data</code> contains the field details for the current page. Each element in the list contains the step ID <code>stepId</code>, the field name and field type for the source and destination (<code>srcColumnName</code>, <code>srcColumnType</code>, <code>dstColumnName</code>, <code>dstColumnType</code>), the metric key and alias for the source and destination (<code>srcMetricColumn</code>, <code>dstMetricColumn</code>, <code>srcAlias</code>, <code>dstAlias</code>), the comparison rule <code>checkRule</code>, the expected threshold <code>expectThreshold</code>, the result values for the source and destination (<code>srcResult</code>, <code>dstResult</code>), the actual difference <code>actualThreshold</code>, the validation result <code>isConsistent</code> (0: inconsistent, 1: consistent, 2: manually repaired), and the execution result <code>checkResult</code> (0: no record, 1: passed, 2: failed). When troubleshooting differences, compare <code>srcResult</code> and <code>dstResult</code> against <code>actualThreshold</code> to determine whether it exceeds <code>expectThreshold</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries field (column) dimension validation details by validation result ID with paging, and returns the comparison results and threshold evaluation for each field between the source and destination.</p>
     * 
     * @param request ListDataCheckColumnResultsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDataCheckColumnResultsResponse
     */
    public ListDataCheckColumnResultsResponse listDataCheckColumnResultsWithOptions(ListDataCheckColumnResultsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            query.put("pageIndex", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resultId)) {
            query.put("resultId", request.resultId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataCheckColumnResults"),
            new TeaPair("version", "2025-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dataCheck/report/v3/column/page"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataCheckColumnResultsResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Queries field (column) dimension validation details by validation result ID with paging. The response returns the comparison results between the source and destination for each field, the comparison rule used, the expected threshold, and the actual difference. Use this operation to drill down validation conclusions to the field level and identify which column was determined to be inconsistent and by which rule.</p>
     * <h2>Request description</h2>
     * <ul>
     * <li><code>resultId</code> is required. It specifies the validation result ID, which is obtained from the validation report query operation or the step overview operation.</li>
     * <li><code>pageIndex</code> and <code>pageSize</code> are optional. They specify the page number (starting from 1) and the number of entries per page, respectively. The default value of <code>pageSize</code> is 10.</li>
     * </ul>
     * <h2>Response description</h2>
     * <p>The response is paginated: <code>totalCount</code> indicates the total number of fields that meet the conditions, <code>pageIndex</code> and <code>pageSize</code> echo the pagination parameters of the current request, and <code>data</code> contains the field details for the current page. Each element in the list contains the step ID <code>stepId</code>, the field name and field type for the source and destination (<code>srcColumnName</code>, <code>srcColumnType</code>, <code>dstColumnName</code>, <code>dstColumnType</code>), the metric key and alias for the source and destination (<code>srcMetricColumn</code>, <code>dstMetricColumn</code>, <code>srcAlias</code>, <code>dstAlias</code>), the comparison rule <code>checkRule</code>, the expected threshold <code>expectThreshold</code>, the result values for the source and destination (<code>srcResult</code>, <code>dstResult</code>), the actual difference <code>actualThreshold</code>, the validation result <code>isConsistent</code> (0: inconsistent, 1: consistent, 2: manually repaired), and the execution result <code>checkResult</code> (0: no record, 1: passed, 2: failed). When troubleshooting differences, compare <code>srcResult</code> and <code>dstResult</code> against <code>actualThreshold</code> to determine whether it exceeds <code>expectThreshold</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries field (column) dimension validation details by validation result ID with paging, and returns the comparison results and threshold evaluation for each field between the source and destination.</p>
     * 
     * @param request ListDataCheckColumnResultsRequest
     * @return ListDataCheckColumnResultsResponse
     */
    public ListDataCheckColumnResultsResponse listDataCheckColumnResults(ListDataCheckColumnResultsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDataCheckColumnResultsWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>接口说明</h2>
     * <p>按数据校验任务 ID 分页查询该任务下的表明细配置，支持按源表名称模糊筛选，用于在任务包含较多表时定位单张表的配置，核对源端与目标端的表、字段、分区、过滤条件与比对规则是否符合预期。</p>
     * <h2>请求说明</h2>
     * <ul>
     * <li><code>taskId</code> 必填，为数据校验任务 ID。</li>
     * <li><code>srcTable</code> 选填，按源表名称模糊搜索。</li>
     * <li><code>pageIndex</code> 与 <code>pageSize</code> 选填，默认值为 1 与 10。</li>
     * </ul>
     * <h2>返回说明</h2>
     * <p>返回分页响应：<code>totalCount</code> 为满足条件的配置总数，<code>pageIndex</code> 与 <code>pageSize</code> 回显本次分页参数，<code>data</code> 为当前页配置列表。列表元素包含配置 ID、是否跳过 <code>isSkipped</code>、所属任务 <code>taskId</code> 与校验类型 <code>checkType</code>；源端的 <code>sourceDataSource</code>、<code>sourceId</code>、<code>sourceType</code>、<code>sourceTable</code>、<code>sourceColumns</code>、<code>sourcePartition</code>、<code>sourceWhereClause</code>、<code>sourceGroupClause</code>、<code>sourceHint</code>、<code>sourceSql</code> 与 <code>sourceCompareKey</code>，以及目标端一一对应的 <code>targetDataSource</code>、<code>targetId</code>、<code>targetType</code>、<code>targetTable</code>、<code>targetColumns</code>、<code>targetPartition</code>、<code>targetWhereClause</code>、<code>targetGroupClause</code>、<code>targetHint</code>、<code>targetSql</code> 与 <code>targetCompareKey</code>；比对规则相关的总数据量阈值 <code>totalCountThreshold</code>、分组数据量阈值 <code>groupCountThreshold</code>、批大小 <code>batchSize</code>、校验算法 <code>algorithm</code>、比较类型 <code>comparator</code>、指标类型 <code>metricType</code>、是否整表比对 <code>isFullTableCount</code>、源端与目标端是否校验所有列（<code>sourceCheckAllColumn</code>、<code>targetCheckAllColumn</code>）；另有配置详情 <code>taskConfigInfo</code> 与备用字段 <code>extra</code>。</p>
     * 
     * <b>summary</b> : 
     * <p>分页查询校验任务配置</p>
     * 
     * @param request ListDataCheckConfigRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDataCheckConfigResponse
     */
    public ListDataCheckConfigResponse listDataCheckConfigWithOptions(ListDataCheckConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            query.put("pageIndex", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcTable)) {
            query.put("srcTable", request.srcTable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("taskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataCheckConfig"),
            new TeaPair("version", "2025-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dataCheck/config/v3/listConfig/page"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataCheckConfigResponse());
    }

    /**
     * <b>description</b> :
     * <h2>接口说明</h2>
     * <p>按数据校验任务 ID 分页查询该任务下的表明细配置，支持按源表名称模糊筛选，用于在任务包含较多表时定位单张表的配置，核对源端与目标端的表、字段、分区、过滤条件与比对规则是否符合预期。</p>
     * <h2>请求说明</h2>
     * <ul>
     * <li><code>taskId</code> 必填，为数据校验任务 ID。</li>
     * <li><code>srcTable</code> 选填，按源表名称模糊搜索。</li>
     * <li><code>pageIndex</code> 与 <code>pageSize</code> 选填，默认值为 1 与 10。</li>
     * </ul>
     * <h2>返回说明</h2>
     * <p>返回分页响应：<code>totalCount</code> 为满足条件的配置总数，<code>pageIndex</code> 与 <code>pageSize</code> 回显本次分页参数，<code>data</code> 为当前页配置列表。列表元素包含配置 ID、是否跳过 <code>isSkipped</code>、所属任务 <code>taskId</code> 与校验类型 <code>checkType</code>；源端的 <code>sourceDataSource</code>、<code>sourceId</code>、<code>sourceType</code>、<code>sourceTable</code>、<code>sourceColumns</code>、<code>sourcePartition</code>、<code>sourceWhereClause</code>、<code>sourceGroupClause</code>、<code>sourceHint</code>、<code>sourceSql</code> 与 <code>sourceCompareKey</code>，以及目标端一一对应的 <code>targetDataSource</code>、<code>targetId</code>、<code>targetType</code>、<code>targetTable</code>、<code>targetColumns</code>、<code>targetPartition</code>、<code>targetWhereClause</code>、<code>targetGroupClause</code>、<code>targetHint</code>、<code>targetSql</code> 与 <code>targetCompareKey</code>；比对规则相关的总数据量阈值 <code>totalCountThreshold</code>、分组数据量阈值 <code>groupCountThreshold</code>、批大小 <code>batchSize</code>、校验算法 <code>algorithm</code>、比较类型 <code>comparator</code>、指标类型 <code>metricType</code>、是否整表比对 <code>isFullTableCount</code>、源端与目标端是否校验所有列（<code>sourceCheckAllColumn</code>、<code>targetCheckAllColumn</code>）；另有配置详情 <code>taskConfigInfo</code> 与备用字段 <code>extra</code>。</p>
     * 
     * <b>summary</b> : 
     * <p>分页查询校验任务配置</p>
     * 
     * @param request ListDataCheckConfigRequest
     * @return ListDataCheckConfigResponse
     */
    public ListDataCheckConfigResponse listDataCheckConfig(ListDataCheckConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDataCheckConfigWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>接口说明</h2>
     * <p>按校验作业（批次）分页查询校验报告明细，返回每个校验子作业及其对应表的校验结果，包含行数比对、字段与指标通过情况、差异率、源端与目标端配置和错误信息，是查看一次校验执行结论的主要入口。</p>
     * <h2>请求说明</h2>
     * <ul>
     * <li>请求体为 JSON 对象，其中 <code>batchId</code> 必填，为校验作业（批次）ID，取自保存校验任务接口的返回值。</li>
     * <li><code>checkResult</code> 选填，按校验结果筛选（0 无记录、1 通过、2 不通过）；<code>jobStatus</code> 选填，按作业状态筛选（0 INIT 待运行、1 RUNNING 运行中、2 FINISHED 运行完成、3 STOPPED 终止、4 FAIL 失败、6 READY 就绪、7 SKIPPED 跳过）；<code>tableName</code> 选填，按表名筛选。</li>
     * <li><code>pageIndex</code> 与 <code>pageSize</code> 选填，分别表示页码（最小值与默认值为 1）与每页条数。</li>
     * </ul>
     * <h2>返回说明</h2>
     * <p>返回分页响应：<code>totalCount</code> 为满足条件的明细总数，<code>pageIndex</code> 与 <code>pageSize</code> 回显本次分页参数，<code>data</code> 为当前页明细列表。列表元素包含批次与作业标识（<code>batchId</code>、<code>jobId</code>、<code>resultId</code>）、是否跳过 <code>isSkipped</code>、校验结果 <code>checkResult</code> 与作业状态 <code>jobStatus</code>；源端与目标端行数（<code>sourceCount</code>、<code>targetCount</code>）、实际差异与相同行数（<code>realDiffCount</code>、<code>realSameCount</code>）、预期差异行数 <code>expDiffCount</code>、差异率 <code>diffRate</code>、作业完成率 <code>completionRate</code>、仅源端或仅目标端存在的条数（<code>onlySrcCount</code>、<code>onlyDstCount</code>）；字段与指标维度的校验数与通过数（<code>checkColumCount</code>、<code>passColumCount</code>、<code>metricColumCount</code>、<code>metricPassColumCount</code>）；源端与目标端的数据源、类型、表、字段、分区、where 与 group 条件、hint、SQL 列表、比较字段与错误信息；以及阈值 <code>threshold</code>、分组数据量阈值 <code>totalCountThreshold</code>、模板名称 <code>templateName</code>、任务配置 ID <code>taskConfigId</code>、执行时间 <code>execTime</code>、完成时间 <code>finishTime</code> 与错误信息 <code>errorMsg</code>。其中的 <code>jobId</code> 与 <code>resultId</code> 可分别用于查询步骤维度明细与字段维度明细。</p>
     * 
     * <b>summary</b> : 
     * <p>查询校验报告，表维度明细</p>
     * 
     * @param request ListDataCheckReportRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDataCheckReportResponse
     */
    public ListDataCheckReportResponse listDataCheckReportWithOptions(ListDataCheckReportRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.batchId)) {
            body.put("batchId", request.batchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.checkResult)) {
            body.put("checkResult", request.checkResult);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobStatus)) {
            body.put("jobStatus", request.jobStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            body.put("pageIndex", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            body.put("tableName", request.tableName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataCheckReport"),
            new TeaPair("version", "2025-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dataCheck/report/v3/page"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataCheckReportResponse());
    }

    /**
     * <b>description</b> :
     * <h2>接口说明</h2>
     * <p>按校验作业（批次）分页查询校验报告明细，返回每个校验子作业及其对应表的校验结果，包含行数比对、字段与指标通过情况、差异率、源端与目标端配置和错误信息，是查看一次校验执行结论的主要入口。</p>
     * <h2>请求说明</h2>
     * <ul>
     * <li>请求体为 JSON 对象，其中 <code>batchId</code> 必填，为校验作业（批次）ID，取自保存校验任务接口的返回值。</li>
     * <li><code>checkResult</code> 选填，按校验结果筛选（0 无记录、1 通过、2 不通过）；<code>jobStatus</code> 选填，按作业状态筛选（0 INIT 待运行、1 RUNNING 运行中、2 FINISHED 运行完成、3 STOPPED 终止、4 FAIL 失败、6 READY 就绪、7 SKIPPED 跳过）；<code>tableName</code> 选填，按表名筛选。</li>
     * <li><code>pageIndex</code> 与 <code>pageSize</code> 选填，分别表示页码（最小值与默认值为 1）与每页条数。</li>
     * </ul>
     * <h2>返回说明</h2>
     * <p>返回分页响应：<code>totalCount</code> 为满足条件的明细总数，<code>pageIndex</code> 与 <code>pageSize</code> 回显本次分页参数，<code>data</code> 为当前页明细列表。列表元素包含批次与作业标识（<code>batchId</code>、<code>jobId</code>、<code>resultId</code>）、是否跳过 <code>isSkipped</code>、校验结果 <code>checkResult</code> 与作业状态 <code>jobStatus</code>；源端与目标端行数（<code>sourceCount</code>、<code>targetCount</code>）、实际差异与相同行数（<code>realDiffCount</code>、<code>realSameCount</code>）、预期差异行数 <code>expDiffCount</code>、差异率 <code>diffRate</code>、作业完成率 <code>completionRate</code>、仅源端或仅目标端存在的条数（<code>onlySrcCount</code>、<code>onlyDstCount</code>）；字段与指标维度的校验数与通过数（<code>checkColumCount</code>、<code>passColumCount</code>、<code>metricColumCount</code>、<code>metricPassColumCount</code>）；源端与目标端的数据源、类型、表、字段、分区、where 与 group 条件、hint、SQL 列表、比较字段与错误信息；以及阈值 <code>threshold</code>、分组数据量阈值 <code>totalCountThreshold</code>、模板名称 <code>templateName</code>、任务配置 ID <code>taskConfigId</code>、执行时间 <code>execTime</code>、完成时间 <code>finishTime</code> 与错误信息 <code>errorMsg</code>。其中的 <code>jobId</code> 与 <code>resultId</code> 可分别用于查询步骤维度明细与字段维度明细。</p>
     * 
     * <b>summary</b> : 
     * <p>查询校验报告，表维度明细</p>
     * 
     * @param request ListDataCheckReportRequest
     * @return ListDataCheckReportResponse
     */
    public ListDataCheckReportResponse listDataCheckReport(ListDataCheckReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDataCheckReportWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Queries the list of historical check instances by data validation node. The response includes the batch ID, report generation time, and report label for each check execution (including each run triggered by timed scheduling). Use this operation to trace historical check records and further query the corresponding report content by batch ID.</p>
     * <h2>Request description</h2>
     * <ul>
     * <li><code>taskId</code> is required and specifies the data validation node ID.</li>
     * <li>A single invoke returns all historical instances under the specified node without paging. When there are many instances, use the most recent batches as needed.</li>
     * </ul>
     * <h2>Response description</h2>
     * <p>The response is a list. Each element in <code>data</code> represents a historical check instance: <code>batchId</code> is the batch ID (character string) that can be used as an input parameter for operations such as check report, report overview, report status, and node historical instance queries. <code>reportTime</code> is the report generation time. <code>label</code> is the report label. An empty list is returned when the node has no historical execute records. When <code>success</code> is <code>false</code>, troubleshoot by using <code>errCode</code> and <code>errMessage</code>. <code>requestId</code> is used to locate the current invoke.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of historical check instances by check task ID to trace the check results of each scheduling run.</p>
     * 
     * @param request ListDataCheckReportInstanceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDataCheckReportInstanceResponse
     */
    public ListDataCheckReportInstanceResponse listDataCheckReportInstanceWithOptions(ListDataCheckReportInstanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("taskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataCheckReportInstance"),
            new TeaPair("version", "2025-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dataCheck/report/v3/list"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataCheckReportInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Queries the list of historical check instances by data validation node. The response includes the batch ID, report generation time, and report label for each check execution (including each run triggered by timed scheduling). Use this operation to trace historical check records and further query the corresponding report content by batch ID.</p>
     * <h2>Request description</h2>
     * <ul>
     * <li><code>taskId</code> is required and specifies the data validation node ID.</li>
     * <li>A single invoke returns all historical instances under the specified node without paging. When there are many instances, use the most recent batches as needed.</li>
     * </ul>
     * <h2>Response description</h2>
     * <p>The response is a list. Each element in <code>data</code> represents a historical check instance: <code>batchId</code> is the batch ID (character string) that can be used as an input parameter for operations such as check report, report overview, report status, and node historical instance queries. <code>reportTime</code> is the report generation time. <code>label</code> is the report label. An empty list is returned when the node has no historical execute records. When <code>success</code> is <code>false</code>, troubleshoot by using <code>errCode</code> and <code>errMessage</code>. <code>requestId</code> is used to locate the current invoke.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of historical check instances by check task ID to trace the check results of each scheduling run.</p>
     * 
     * @param request ListDataCheckReportInstanceRequest
     * @return ListDataCheckReportInstanceResponse
     */
    public ListDataCheckReportInstanceResponse listDataCheckReportInstance(ListDataCheckReportInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDataCheckReportInstanceWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Queries step-level (partition or shard) dimension verification details for a verification sub-job with a paged query. Supports filtering by verification result and step status. Use this operation to drill down verification conclusions to the partition level and view the source and destination data volumes, actual SQL statements executed, consistency conclusions, and error messages for each step.</p>
     * <h2>Request description</h2>
     * <ul>
     * <li><code>jobId</code> is required and specifies the database ID (integer) of the verification sub-job. If you have a UUID-format sub-job ID, use the operation that queries step details by UUID instead. The two operations have different parameter formats and are not interchangeable.</li>
     * <li><code>checkResult</code> is optional and filters by verification result (0: no record, 1: passed, 2: failed). <code>jobStatus</code> is optional and filters by step status (0: INIT, 1: RUNNING, 2: FINISHED, 3: STOPPED, 4: FAIL, 6: READY, 7: SKIPPED).</li>
     * <li><code>pageIndex</code> and <code>pageSize</code> are optional. Default values are 1 and 10.</li>
     * </ul>
     * <h2>Response description</h2>
     * <p>Returns a paginated response: <code>totalCount</code> indicates the total number of steps that meet the filter conditions, <code>pageIndex</code> and <code>pageSize</code> echo the pagination parameters of the current request, and <code>data</code> contains the step details for the current page. Each list element includes the record ID <code>id</code>, step ID <code>stepId</code>, verification result ID <code>resultId</code>, parent job <code>jobId</code>, shard boundary <code>boundary</code>, source and destination partition names (<code>sourcePtName</code>, <code>targetPtName</code>), source and destination data volumes (<code>srcCount</code>, <code>dstCount</code>), source and destination SQL statements (<code>srcSql</code>, <code>dstSql</code>), step status <code>status</code> (0: created, 1: running, 2: completed, 3: stopped, 4: canceled), consistency conclusion <code>isConsistent</code> (0: inconsistent, 1: consistent), error message <code>errMessage</code>, start and end times (<code>gmtStart</code>, <code>gmtEnd</code>), creation and modification times (<code>gmtCreate</code>, <code>gmtModified</code>), verified and passed counts at the field and metric levels (<code>checkColumCount</code>, <code>passColumCount</code>, <code>metricColumCount</code>, <code>metricPassColumCount</code>), label name list <code>signNameList</code>, and reserved field <code>extra</code>. The <code>resultId</code> can be used to further query field-level details and result overview for the step.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries step-level (partition-level) verification details by job ID with a paged query. Supports filtering by verification result and node status.</p>
     * 
     * @param request ListDataCheckReportStepRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDataCheckReportStepResponse
     */
    public ListDataCheckReportStepResponse listDataCheckReportStepWithOptions(ListDataCheckReportStepRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.checkResult)) {
            query.put("checkResult", request.checkResult);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("jobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobStatus)) {
            query.put("jobStatus", request.jobStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            query.put("pageIndex", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataCheckReportStep"),
            new TeaPair("version", "2025-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dataCheck/report/v3/step/page"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataCheckReportStepResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Queries step-level (partition or shard) dimension verification details for a verification sub-job with a paged query. Supports filtering by verification result and step status. Use this operation to drill down verification conclusions to the partition level and view the source and destination data volumes, actual SQL statements executed, consistency conclusions, and error messages for each step.</p>
     * <h2>Request description</h2>
     * <ul>
     * <li><code>jobId</code> is required and specifies the database ID (integer) of the verification sub-job. If you have a UUID-format sub-job ID, use the operation that queries step details by UUID instead. The two operations have different parameter formats and are not interchangeable.</li>
     * <li><code>checkResult</code> is optional and filters by verification result (0: no record, 1: passed, 2: failed). <code>jobStatus</code> is optional and filters by step status (0: INIT, 1: RUNNING, 2: FINISHED, 3: STOPPED, 4: FAIL, 6: READY, 7: SKIPPED).</li>
     * <li><code>pageIndex</code> and <code>pageSize</code> are optional. Default values are 1 and 10.</li>
     * </ul>
     * <h2>Response description</h2>
     * <p>Returns a paginated response: <code>totalCount</code> indicates the total number of steps that meet the filter conditions, <code>pageIndex</code> and <code>pageSize</code> echo the pagination parameters of the current request, and <code>data</code> contains the step details for the current page. Each list element includes the record ID <code>id</code>, step ID <code>stepId</code>, verification result ID <code>resultId</code>, parent job <code>jobId</code>, shard boundary <code>boundary</code>, source and destination partition names (<code>sourcePtName</code>, <code>targetPtName</code>), source and destination data volumes (<code>srcCount</code>, <code>dstCount</code>), source and destination SQL statements (<code>srcSql</code>, <code>dstSql</code>), step status <code>status</code> (0: created, 1: running, 2: completed, 3: stopped, 4: canceled), consistency conclusion <code>isConsistent</code> (0: inconsistent, 1: consistent), error message <code>errMessage</code>, start and end times (<code>gmtStart</code>, <code>gmtEnd</code>), creation and modification times (<code>gmtCreate</code>, <code>gmtModified</code>), verified and passed counts at the field and metric levels (<code>checkColumCount</code>, <code>passColumCount</code>, <code>metricColumCount</code>, <code>metricPassColumCount</code>), label name list <code>signNameList</code>, and reserved field <code>extra</code>. The <code>resultId</code> can be used to further query field-level details and result overview for the step.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries step-level (partition-level) verification details by job ID with a paged query. Supports filtering by verification result and node status.</p>
     * 
     * @param request ListDataCheckReportStepRequest
     * @return ListDataCheckReportStepResponse
     */
    public ListDataCheckReportStepResponse listDataCheckReportStep(ListDataCheckReportStepRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDataCheckReportStepWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>接口说明</h2>
     * <p>按 UUID 形式的校验子作业 ID 分页查询 step（分区或分片）维度的校验明细。返回的明细与按数据库 ID 查询的接口一致，区别在于入参形态：本接口直接使用校验报告中给出的子作业 ID 字符串，无需先换算为数据库 ID，适合从报告结果直接下钻。</p>
     * <h2>请求说明</h2>
     * <ul>
     * <li><code>jobId</code> 必填，为 UUID 形式的校验子作业 ID（字符串），取自校验报告查询接口返回的 <code>jobId</code>。</li>
     * <li><code>pageIndex</code> 与 <code>pageSize</code> 选填，默认值为 1 与 10。</li>
     * <li>本接口不支持按校验结果或 step 状态筛选；需要筛选时改用按数据库 ID 查询 step 明细的接口。</li>
     * </ul>
     * <h2>返回说明</h2>
     * <p>返回分页响应：<code>totalCount</code> 为满足条件的 step 总数，<code>pageIndex</code> 与 <code>pageSize</code> 回显本次分页参数，<code>data</code> 为当前页 step 明细。列表元素包含步骤 ID <code>stepId</code>、校验结果 ID <code>resultId</code>、分片边界 <code>boundary</code>、源端与目标端分区名称（<code>sourcePtName</code>、<code>targetPtName</code>）、源端与目标端数据量（<code>srcCount</code>、<code>dstCount</code>）、源端与目标端执行 SQL（<code>srcSql</code>、<code>dstSql</code>）、step 状态 <code>status</code>（0 创建、1 运行中、2 运行完成、3 停止、4 取消）、一致性结论 <code>isConsistent</code>（0 不一致、1 一致）、错误消息 <code>errMessage</code>、启动与结束时间（<code>gmtStart</code>、<code>gmtEnd</code>）、字段与指标维度的校验数与通过数（<code>checkColumCount</code>、<code>passColumCount</code>、<code>metricColumCount</code>、<code>metricPassColumCount</code>）与备用字段 <code>extra</code>。</p>
     * 
     * <b>summary</b> : 
     * <p>查询报告-作业维度明细（分区列表）</p>
     * 
     * @param request ListDataCheckReportStepByJobIdRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDataCheckReportStepByJobIdResponse
     */
    public ListDataCheckReportStepByJobIdResponse listDataCheckReportStepByJobIdWithOptions(ListDataCheckReportStepByJobIdRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("jobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            query.put("pageIndex", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataCheckReportStepByJobId"),
            new TeaPair("version", "2025-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dataCheck/report/v3/step/pageByJobId"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataCheckReportStepByJobIdResponse());
    }

    /**
     * <b>description</b> :
     * <h2>接口说明</h2>
     * <p>按 UUID 形式的校验子作业 ID 分页查询 step（分区或分片）维度的校验明细。返回的明细与按数据库 ID 查询的接口一致，区别在于入参形态：本接口直接使用校验报告中给出的子作业 ID 字符串，无需先换算为数据库 ID，适合从报告结果直接下钻。</p>
     * <h2>请求说明</h2>
     * <ul>
     * <li><code>jobId</code> 必填，为 UUID 形式的校验子作业 ID（字符串），取自校验报告查询接口返回的 <code>jobId</code>。</li>
     * <li><code>pageIndex</code> 与 <code>pageSize</code> 选填，默认值为 1 与 10。</li>
     * <li>本接口不支持按校验结果或 step 状态筛选；需要筛选时改用按数据库 ID 查询 step 明细的接口。</li>
     * </ul>
     * <h2>返回说明</h2>
     * <p>返回分页响应：<code>totalCount</code> 为满足条件的 step 总数，<code>pageIndex</code> 与 <code>pageSize</code> 回显本次分页参数，<code>data</code> 为当前页 step 明细。列表元素包含步骤 ID <code>stepId</code>、校验结果 ID <code>resultId</code>、分片边界 <code>boundary</code>、源端与目标端分区名称（<code>sourcePtName</code>、<code>targetPtName</code>）、源端与目标端数据量（<code>srcCount</code>、<code>dstCount</code>）、源端与目标端执行 SQL（<code>srcSql</code>、<code>dstSql</code>）、step 状态 <code>status</code>（0 创建、1 运行中、2 运行完成、3 停止、4 取消）、一致性结论 <code>isConsistent</code>（0 不一致、1 一致）、错误消息 <code>errMessage</code>、启动与结束时间（<code>gmtStart</code>、<code>gmtEnd</code>）、字段与指标维度的校验数与通过数（<code>checkColumCount</code>、<code>passColumCount</code>、<code>metricColumCount</code>、<code>metricPassColumCount</code>）与备用字段 <code>extra</code>。</p>
     * 
     * <b>summary</b> : 
     * <p>查询报告-作业维度明细（分区列表）</p>
     * 
     * @param request ListDataCheckReportStepByJobIdRequest
     * @return ListDataCheckReportStepByJobIdResponse
     */
    public ListDataCheckReportStepByJobIdResponse listDataCheckReportStepByJobId(ListDataCheckReportStepByJobIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDataCheckReportStepByJobIdWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Queries historical execute instances (batches) of data validation nodes with paging. Supports combined filtering by batch ID, node ID, execute status, validation result, and three types of time ranges: creation time, execute start time, and execute end time. Returns table count statistics, pass rate, start and end times, and execute duration for each execution. Use this operation to review historical validation execute details and result trends.</p>
     * <h2>Request description</h2>
     * <ul>
     * <li><code>batchId</code> is required and specifies the validation job (batch) ID.</li>
     * <li><code>taskId</code> is optional and specifies the data validation task ID. <code>execStatus</code> is optional and filters by execution status (0: pending, 1: running, 2: stopped, 3: failed, 4: completed). <code>checkResult</code> is optional and filters by validation result (0: no records, 1: passed, 2: failed).</li>
     * <li><code>createStartTime</code> and <code>createEndTime</code>, <code>execStartTime</code> and <code>execEndTime</code>, <code>finishStartTime</code> and <code>finishEndTime</code> define the filter ranges for job creation time, execution start time, and execution end time, respectively. The format is YYYY-MM-DD HH:MM:SS. Specify both the start and end values in pairs.</li>
     * <li><code>pageIndex</code> and <code>pageSize</code> are optional and specify the page number and the number of entries per page, respectively.</li>
     * </ul>
     * <h2>Response description</h2>
     * <p>Returns a paginated response. <code>totalCount</code> indicates the total number of historical instances that meet the filter conditions. <code>pageIndex</code> and <code>pageSize</code> reflect the pagination parameters of the current request. <code>data</code> contains the list of instances on the current page. Each list element includes batch identifiers (<code>batchId</code>, <code>originBatchId</code>, <code>seqId</code>), report title and report time (<code>reportTitle</code>, <code>reportTime</code>), the number of validated tables and the number of tables with errors, successes, and skips (<code>checkTableNum</code>, <code>errorTableNum</code>, <code>successfulTableNum</code>, <code>skipTableNum</code>), execution status <code>execStatus</code> and validation result <code>checkResult</code>, start and end times (<code>startTime</code>, <code>endTime</code>) and execution duration <code>execTime</code>, task progress <code>progress</code>, pass rate <code>passProcess</code> and its percentage string form <code>passProcessExport</code>, scheduling cycle expression <code>cronExp</code>, batch concurrency <code>concurrency</code>, scheduled task ID <code>scheduleId</code>, creator and updater (<code>creator</code>, <code>operator</code>), creation and last modification times (<code>gmtCreate</code>, <code>gmtModified</code>), error message <code>errorMsg</code>, reserved field <code>extra</code>, and business field <code>biz</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries historical instances of data validation nodes by batch ID and node ID with paging. Supports filtering by execute status, validation result, and time ranges for creation, execute start, and execute end.</p>
     * 
     * @param request ListDataCheckTaskHistoryRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDataCheckTaskHistoryResponse
     */
    public ListDataCheckTaskHistoryResponse listDataCheckTaskHistoryWithOptions(ListDataCheckTaskHistoryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.batchId)) {
            query.put("batchId", request.batchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.checkResult)) {
            query.put("checkResult", request.checkResult);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createEndTime)) {
            query.put("createEndTime", request.createEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createStartTime)) {
            query.put("createStartTime", request.createStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.execEndTime)) {
            query.put("execEndTime", request.execEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.execStartTime)) {
            query.put("execStartTime", request.execStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.execStatus)) {
            query.put("execStatus", request.execStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.finishEndTime)) {
            query.put("finishEndTime", request.finishEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.finishStartTime)) {
            query.put("finishStartTime", request.finishStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            query.put("pageIndex", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("taskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataCheckTaskHistory"),
            new TeaPair("version", "2025-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dataCheck/task/v3/details"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataCheckTaskHistoryResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Queries historical execute instances (batches) of data validation nodes with paging. Supports combined filtering by batch ID, node ID, execute status, validation result, and three types of time ranges: creation time, execute start time, and execute end time. Returns table count statistics, pass rate, start and end times, and execute duration for each execution. Use this operation to review historical validation execute details and result trends.</p>
     * <h2>Request description</h2>
     * <ul>
     * <li><code>batchId</code> is required and specifies the validation job (batch) ID.</li>
     * <li><code>taskId</code> is optional and specifies the data validation task ID. <code>execStatus</code> is optional and filters by execution status (0: pending, 1: running, 2: stopped, 3: failed, 4: completed). <code>checkResult</code> is optional and filters by validation result (0: no records, 1: passed, 2: failed).</li>
     * <li><code>createStartTime</code> and <code>createEndTime</code>, <code>execStartTime</code> and <code>execEndTime</code>, <code>finishStartTime</code> and <code>finishEndTime</code> define the filter ranges for job creation time, execution start time, and execution end time, respectively. The format is YYYY-MM-DD HH:MM:SS. Specify both the start and end values in pairs.</li>
     * <li><code>pageIndex</code> and <code>pageSize</code> are optional and specify the page number and the number of entries per page, respectively.</li>
     * </ul>
     * <h2>Response description</h2>
     * <p>Returns a paginated response. <code>totalCount</code> indicates the total number of historical instances that meet the filter conditions. <code>pageIndex</code> and <code>pageSize</code> reflect the pagination parameters of the current request. <code>data</code> contains the list of instances on the current page. Each list element includes batch identifiers (<code>batchId</code>, <code>originBatchId</code>, <code>seqId</code>), report title and report time (<code>reportTitle</code>, <code>reportTime</code>), the number of validated tables and the number of tables with errors, successes, and skips (<code>checkTableNum</code>, <code>errorTableNum</code>, <code>successfulTableNum</code>, <code>skipTableNum</code>), execution status <code>execStatus</code> and validation result <code>checkResult</code>, start and end times (<code>startTime</code>, <code>endTime</code>) and execution duration <code>execTime</code>, task progress <code>progress</code>, pass rate <code>passProcess</code> and its percentage string form <code>passProcessExport</code>, scheduling cycle expression <code>cronExp</code>, batch concurrency <code>concurrency</code>, scheduled task ID <code>scheduleId</code>, creator and updater (<code>creator</code>, <code>operator</code>), creation and last modification times (<code>gmtCreate</code>, <code>gmtModified</code>), error message <code>errorMsg</code>, reserved field <code>extra</code>, and business field <code>biz</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries historical instances of data validation nodes by batch ID and node ID with paging. Supports filtering by execute status, validation result, and time ranges for creation, execute start, and execute end.</p>
     * 
     * @param request ListDataCheckTaskHistoryRequest
     * @return ListDataCheckTaskHistoryResponse
     */
    public ListDataCheckTaskHistoryResponse listDataCheckTaskHistory(ListDataCheckTaskHistoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDataCheckTaskHistoryWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Queries the metadata data source list by paging and returns the basic information, connectivity status, and associated profiling node status of each data source. This operation is used for data source management, selection, and troubleshooting.</p>
     * <h2>Request description</h2>
     * <p>The request body is a JSON object. You can filter results by data source type, name, connectivity status, and categorization. The dsName parameter supports exact match or fuzzy match. The pageIndex parameter starts from 1, and pageSize specifies the number of records per page. The orderBy and orderDirection parameters control the sorting field and sorting direction. The needTotalCount parameter specifies whether to return the total number of records in the paging result.</p>
     * <h2>Response description</h2>
     * <p>The totalCount parameter indicates the total number of records that meet the conditional filter criteria. The pageIndex and pageSize parameters echo the paging parameters. The data parameter contains the list of data sources on the current page. Each element in the list contains the datasource config (sensitive fields such as tokens are masked in the response) and profiling node information. If a data source is not associated with a profiling node, the profilingJob field is empty.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the metadata data source list by paging and returns the data source type, connection status, and status information of associated profiling nodes.</p>
     * 
     * @param request ListMetaDataComponentPageRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMetaDataComponentPageResponse
     */
    public ListMetaDataComponentPageResponse listMetaDataComponentPageWithOptions(ListMetaDataComponentPageRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.categoryType)) {
            body.put("categoryType", request.categoryType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.componentType)) {
            body.put("componentType", request.componentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dsName)) {
            body.put("dsName", request.dsName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dsStatus)) {
            body.put("dsStatus", request.dsStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dsType)) {
            body.put("dsType", request.dsType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dsTypeList)) {
            body.put("dsTypeList", request.dsTypeList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupBy)) {
            body.put("groupBy", request.groupBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.needTotalCount)) {
            body.put("needTotalCount", request.needTotalCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            body.put("orderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderDirection)) {
            body.put("orderDirection", request.orderDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            body.put("pageIndex", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcComponentId)) {
            body.put("srcComponentId", request.srcComponentId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMetaDataComponentPage"),
            new TeaPair("version", "2025-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/meta/data-component/page"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMetaDataComponentPageResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Queries the metadata data source list by paging and returns the basic information, connectivity status, and associated profiling node status of each data source. This operation is used for data source management, selection, and troubleshooting.</p>
     * <h2>Request description</h2>
     * <p>The request body is a JSON object. You can filter results by data source type, name, connectivity status, and categorization. The dsName parameter supports exact match or fuzzy match. The pageIndex parameter starts from 1, and pageSize specifies the number of records per page. The orderBy and orderDirection parameters control the sorting field and sorting direction. The needTotalCount parameter specifies whether to return the total number of records in the paging result.</p>
     * <h2>Response description</h2>
     * <p>The totalCount parameter indicates the total number of records that meet the conditional filter criteria. The pageIndex and pageSize parameters echo the paging parameters. The data parameter contains the list of data sources on the current page. Each element in the list contains the datasource config (sensitive fields such as tokens are masked in the response) and profiling node information. If a data source is not associated with a profiling node, the profilingJob field is empty.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the metadata data source list by paging and returns the data source type, connection status, and status information of associated profiling nodes.</p>
     * 
     * @param request ListMetaDataComponentPageRequest
     * @return ListMetaDataComponentPageResponse
     */
    public ListMetaDataComponentPageResponse listMetaDataComponentPage(ListMetaDataComponentPageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listMetaDataComponentPageWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Interface Description</h2>
     * <p>This is an internal interface for submitting a workflow transformation task. It submits a workflow transformation based on the source, target data sources, and SQL node type mapping. The interface synchronously returns the acceptance result, and the asynchronous execution result can be queried through GetInnerConvertAsyncResult.</p>
     * <h2>Request Description</h2>
     * <p>The request body is a JSON object. <code>srcDataSourceName</code> and <code>tgtDataSourceName</code> are the names of the scheduling data sources at the source and target ends of the transformation task, respectively; <code>sqlConvertMap</code> is the mapping from source node types to target node types, which is written into the transformation configuration if not empty.</p>
     * <h2>Response Description</h2>
     * <p>When successful, <code>data</code> returns the identifier of the transformation task (a string) for subsequent asynchronous result queries; in specific error cases such as multiple data sources with the same name, <code>data</code> carries the detailed error text; in case of failure, use <code>errCode</code> and <code>errMessage</code> for troubleshooting.</p>
     * 
     * <b>summary</b> : 
     * <p>User Scheduling Task Transformation</p>
     * 
     * @param request PostInnerConvertRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return PostInnerConvertResponse
     */
    public PostInnerConvertResponse postInnerConvertWithOptions(PostInnerConvertRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sqlConvertMap)) {
            body.put("sqlConvertMap", request.sqlConvertMap);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcDataSourceName)) {
            body.put("srcDataSourceName", request.srcDataSourceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tgtDataSourceName)) {
            body.put("tgtDataSourceName", request.tgtDataSourceName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PostInnerConvert"),
            new TeaPair("version", "2025-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/skill/inner/v1/convert"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PostInnerConvertResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Interface Description</h2>
     * <p>This is an internal interface for submitting a workflow transformation task. It submits a workflow transformation based on the source, target data sources, and SQL node type mapping. The interface synchronously returns the acceptance result, and the asynchronous execution result can be queried through GetInnerConvertAsyncResult.</p>
     * <h2>Request Description</h2>
     * <p>The request body is a JSON object. <code>srcDataSourceName</code> and <code>tgtDataSourceName</code> are the names of the scheduling data sources at the source and target ends of the transformation task, respectively; <code>sqlConvertMap</code> is the mapping from source node types to target node types, which is written into the transformation configuration if not empty.</p>
     * <h2>Response Description</h2>
     * <p>When successful, <code>data</code> returns the identifier of the transformation task (a string) for subsequent asynchronous result queries; in specific error cases such as multiple data sources with the same name, <code>data</code> carries the detailed error text; in case of failure, use <code>errCode</code> and <code>errMessage</code> for troubleshooting.</p>
     * 
     * <b>summary</b> : 
     * <p>User Scheduling Task Transformation</p>
     * 
     * @param request PostInnerConvertRequest
     * @return PostInnerConvertResponse
     */
    public PostInnerConvertResponse postInnerConvert(PostInnerConvertRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.postInnerConvertWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>接口说明</h2>
     * <p>源端工作流读取任务提交内部接口。按数据源名称提交一次源端工作流读取，接口同步返回受理结果，读取的异步执行结果通过 GetInnerReadAsyncResult 查询。</p>
     * <h2>请求说明</h2>
     * <p>请求体为 JSON 对象，dataSourceName 指定读取任务的数据源名称；数据源缺失时可改由 dataSourceDescriptor 在入参中一次传齐数据源描述信息作为兜底。</p>
     * <h2>返回说明</h2>
     * <p>成功时 data 返回读取任务标识（字符串），用于后续异步结果查询；命中多个同名数据源等特定错误时 data 承载错误明细文本；失败时结合 errCode 与 errMessage 排查。</p>
     * 
     * <b>summary</b> : 
     * <p>调度skillread</p>
     * 
     * @param request PostInnerReaderRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return PostInnerReaderResponse
     */
    public PostInnerReaderResponse postInnerReaderWithOptions(PostInnerReaderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceDescriptor)) {
            body.put("dataSourceDescriptor", request.dataSourceDescriptor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceName)) {
            body.put("dataSourceName", request.dataSourceName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PostInnerReader"),
            new TeaPair("version", "2025-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/skill/inner/v1/read"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PostInnerReaderResponse());
    }

    /**
     * <b>description</b> :
     * <h2>接口说明</h2>
     * <p>源端工作流读取任务提交内部接口。按数据源名称提交一次源端工作流读取，接口同步返回受理结果，读取的异步执行结果通过 GetInnerReadAsyncResult 查询。</p>
     * <h2>请求说明</h2>
     * <p>请求体为 JSON 对象，dataSourceName 指定读取任务的数据源名称；数据源缺失时可改由 dataSourceDescriptor 在入参中一次传齐数据源描述信息作为兜底。</p>
     * <h2>返回说明</h2>
     * <p>成功时 data 返回读取任务标识（字符串），用于后续异步结果查询；命中多个同名数据源等特定错误时 data 承载错误明细文本；失败时结合 errCode 与 errMessage 排查。</p>
     * 
     * <b>summary</b> : 
     * <p>调度skillread</p>
     * 
     * @param request PostInnerReaderRequest
     * @return PostInnerReaderResponse
     */
    public PostInnerReaderResponse postInnerReader(PostInnerReaderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.postInnerReaderWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Uploads a local conversion result package and overwrites the existing result package on the task for subsequent batch writing to the destination scheduling system. This operation is applicable to scenarios where you need to modify conversion results locally before uploading them back. First, export the conversion result package, modify the file content offline, and then use this operation to overwrite and upload the package.</p>
     * <h2>Request description</h2>
     * <ul>
     * <li>The request body is a JSON object. taskId specifies the scheduling migration task ID and determines which task the result package belongs to. fileName specifies the file name. fileContentBase64 specifies the file content, which must be Base64-encoded before being sent. The server decodes the content before saving it.</li>
     * <li>The upload uses overwrite semantics. Uploading again for the same task replaces the existing result package. Confirm that the local file is the expected final version before uploading.</li>
     * </ul>
     * <h2>Response description</h2>
     * <p>The response returns a single value. data contains the upload result information as a string. A successful upload only indicates that the result package has been received by the server and overwritten on the corresponding task. It does not mean that the data has been written to the destination scheduling system. Writing requires a separate submit action. If the call fails, troubleshoot by using errCode and errMessage. Common causes include a nonexistent task ID, invalid file content, or Base64 decoding failure. requestId identifies this specific call.</p>
     * 
     * <b>summary</b> : 
     * <p>Uploads a local conversion result package for subsequent batch writing to the destination scheduling system. This is a Skill internal operation.</p>
     * 
     * @param request PostInnerUploadConvertPackageRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return PostInnerUploadConvertPackageResponse
     */
    public PostInnerUploadConvertPackageResponse postInnerUploadConvertPackageWithOptions(PostInnerUploadConvertPackageRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileContentBase64)) {
            body.put("fileContentBase64", request.fileContentBase64);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            body.put("fileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("taskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PostInnerUploadConvertPackage"),
            new TeaPair("version", "2025-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/skill/inner/v1/convert/upload-package"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PostInnerUploadConvertPackageResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Uploads a local conversion result package and overwrites the existing result package on the task for subsequent batch writing to the destination scheduling system. This operation is applicable to scenarios where you need to modify conversion results locally before uploading them back. First, export the conversion result package, modify the file content offline, and then use this operation to overwrite and upload the package.</p>
     * <h2>Request description</h2>
     * <ul>
     * <li>The request body is a JSON object. taskId specifies the scheduling migration task ID and determines which task the result package belongs to. fileName specifies the file name. fileContentBase64 specifies the file content, which must be Base64-encoded before being sent. The server decodes the content before saving it.</li>
     * <li>The upload uses overwrite semantics. Uploading again for the same task replaces the existing result package. Confirm that the local file is the expected final version before uploading.</li>
     * </ul>
     * <h2>Response description</h2>
     * <p>The response returns a single value. data contains the upload result information as a string. A successful upload only indicates that the result package has been received by the server and overwritten on the corresponding task. It does not mean that the data has been written to the destination scheduling system. Writing requires a separate submit action. If the call fails, troubleshoot by using errCode and errMessage. Common causes include a nonexistent task ID, invalid file content, or Base64 decoding failure. requestId identifies this specific call.</p>
     * 
     * <b>summary</b> : 
     * <p>Uploads a local conversion result package for subsequent batch writing to the destination scheduling system. This is a Skill internal operation.</p>
     * 
     * @param request PostInnerUploadConvertPackageRequest
     * @return PostInnerUploadConvertPackageResponse
     */
    public PostInnerUploadConvertPackageResponse postInnerUploadConvertPackage(PostInnerUploadConvertPackageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.postInnerUploadConvertPackageWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Performs a Dry Run validation on a single SQL statement against a specified data source. This operation verifies whether the syntax can be parsed and whether the required execution permissions are granted, without actually writing data. Use this operation to validate individual SQL statements before batch execution of converted SQL, reducing the risk of failures during formal execution.</p>
     * <h2>Request description</h2>
     * <ul>
     * <li>The request body is a JSON object. <code>sql</code> specifies the SQL statement to validate. <code>datasourceName</code> specifies the name of the data source used for validation, which must be a registered and connectable data source.</li>
     * <li>Dry Run only performs validation without producing data changes and can be called repeatedly. After validation succeeds, submit the formal SQL execution job.</li>
     * </ul>
     * <h2>Response description</h2>
     * <p>Returns a single-value response. <code>data</code> contains the Dry Run execution result (string). If validation fails, the operation returns an error: <code>errCode</code> is DRY_RUN_ERROR, and <code>errMessage</code> provides the specific reason (such as a syntax error or insufficient execution permissions). Use this information to correct the SQL statement or datasource config and retry. <code>requestId</code> identifies the current call.</p>
     * 
     * <b>summary</b> : 
     * <p>Performs a Dry Run validation on a single converted SQL statement to verify syntax and execution permissions without actually writing data.</p>
     * 
     * @param request SingleSqlDryRunRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SingleSqlDryRunResponse
     */
    public SingleSqlDryRunResponse singleSqlDryRunWithOptions(SingleSqlDryRunRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.datasourceName)) {
            body.put("datasourceName", request.datasourceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sql)) {
            body.put("sql", request.sql);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SingleSqlDryRun"),
            new TeaPair("version", "2025-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/bigdata/sql-translator/dryRun"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SingleSqlDryRunResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Performs a Dry Run validation on a single SQL statement against a specified data source. This operation verifies whether the syntax can be parsed and whether the required execution permissions are granted, without actually writing data. Use this operation to validate individual SQL statements before batch execution of converted SQL, reducing the risk of failures during formal execution.</p>
     * <h2>Request description</h2>
     * <ul>
     * <li>The request body is a JSON object. <code>sql</code> specifies the SQL statement to validate. <code>datasourceName</code> specifies the name of the data source used for validation, which must be a registered and connectable data source.</li>
     * <li>Dry Run only performs validation without producing data changes and can be called repeatedly. After validation succeeds, submit the formal SQL execution job.</li>
     * </ul>
     * <h2>Response description</h2>
     * <p>Returns a single-value response. <code>data</code> contains the Dry Run execution result (string). If validation fails, the operation returns an error: <code>errCode</code> is DRY_RUN_ERROR, and <code>errMessage</code> provides the specific reason (such as a syntax error or insufficient execution permissions). Use this information to correct the SQL statement or datasource config and retry. <code>requestId</code> identifies the current call.</p>
     * 
     * <b>summary</b> : 
     * <p>Performs a Dry Run validation on a single converted SQL statement to verify syntax and execution permissions without actually writing data.</p>
     * 
     * @param request SingleSqlDryRunRequest
     * @return SingleSqlDryRunResponse
     */
    public SingleSqlDryRunResponse singleSqlDryRun(SingleSqlDryRunRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.singleSqlDryRunWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>接口说明</h2>
     * <p>对指定的 SQL 转换任务先执行语法校验、再执行转换，在一次调用内串起「校验 + 转换」两个动作，适用于希望在转换前自动拦截语法问题、而不必分两步分别调用的场景。</p>
     * <h2>请求说明</h2>
     * <ul>
     * <li><code>taskId</code> 必填，为 SQL 转换任务 ID。</li>
     * <li>调用会校验任务归属，只能处理归属于当前账号的任务，否则返回鉴权失败。</li>
     * <li>本接口按任务维度触发处理，不接受逐条脚本入参；脚本较多时处理耗时较长。</li>
     * </ul>
     * <h2>返回说明</h2>
     * <p>返回单值响应，<code>data</code> 为对象，其中 <code>taskId</code> 回显本次处理的任务 ID。逐条脚本的校验与转换结果不在本接口返回，需调用查询转换进度接口跟踪进展、调用查询转换结果接口获取每条脚本的源语句、目标语句与转换状态。<code>success</code> 为 <code>false</code> 时说明语法校验或转换环节失败，结合 <code>errCode</code> 与 <code>errMessage</code> 定位原因；<code>requestId</code> 用于排查本次调用。</p>
     * 
     * <b>summary</b> : 
     * <p>对某个sql转换任务校验+转换</p>
     * 
     * @param request SyntaxCheckAndTransformSqlConversionTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SyntaxCheckAndTransformSqlConversionTaskResponse
     */
    public SyntaxCheckAndTransformSqlConversionTaskResponse syntaxCheckAndTransformSqlConversionTaskWithOptions(SyntaxCheckAndTransformSqlConversionTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("taskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SyntaxCheckAndTransformSqlConversionTask"),
            new TeaPair("version", "2025-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/bigdata/jobMigrate/sqlTranslator/task/api/syntaxCheckAndTransformTask"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SyntaxCheckAndTransformSqlConversionTaskResponse());
    }

    /**
     * <b>description</b> :
     * <h2>接口说明</h2>
     * <p>对指定的 SQL 转换任务先执行语法校验、再执行转换，在一次调用内串起「校验 + 转换」两个动作，适用于希望在转换前自动拦截语法问题、而不必分两步分别调用的场景。</p>
     * <h2>请求说明</h2>
     * <ul>
     * <li><code>taskId</code> 必填，为 SQL 转换任务 ID。</li>
     * <li>调用会校验任务归属，只能处理归属于当前账号的任务，否则返回鉴权失败。</li>
     * <li>本接口按任务维度触发处理，不接受逐条脚本入参；脚本较多时处理耗时较长。</li>
     * </ul>
     * <h2>返回说明</h2>
     * <p>返回单值响应，<code>data</code> 为对象，其中 <code>taskId</code> 回显本次处理的任务 ID。逐条脚本的校验与转换结果不在本接口返回，需调用查询转换进度接口跟踪进展、调用查询转换结果接口获取每条脚本的源语句、目标语句与转换状态。<code>success</code> 为 <code>false</code> 时说明语法校验或转换环节失败，结合 <code>errCode</code> 与 <code>errMessage</code> 定位原因；<code>requestId</code> 用于排查本次调用。</p>
     * 
     * <b>summary</b> : 
     * <p>对某个sql转换任务校验+转换</p>
     * 
     * @param request SyntaxCheckAndTransformSqlConversionTaskRequest
     * @return SyntaxCheckAndTransformSqlConversionTaskResponse
     */
    public SyntaxCheckAndTransformSqlConversionTaskResponse syntaxCheckAndTransformSqlConversionTask(SyntaxCheckAndTransformSqlConversionTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syntaxCheckAndTransformSqlConversionTaskWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Modifies an existing data validation task. You can adjust the task name and description, source and destination data sources, source and destination validation engines, and the validation template referenced by the task. This operation is used to correct configurations or change the source of comparison rules after a task is created.</p>
     * <h2>Request description</h2>
     * <ul>
     * <li>The request body is a JSON object. The <code>id</code> field is required and specifies the ID of the data validation task to modify. All other fields are optional. Fields that are not included in the request retain their original values.</li>
     * <li><code>taskName</code> supports only Chinese characters, English letters, and digits. <code>taskDescription</code> specifies the task description.</li>
     * <li><code>srcDsId</code>, <code>srcDsName</code>, and <code>srcDsType</code> describe the source data source. <code>dstDsId</code>, <code>dstDsName</code>, and <code>dstDsType</code> describe the destination data source. <code>srcEngineId</code>, <code>srcEngineName</code>, and <code>srcEngineType</code> describe the source validation engine. <code>dstEngineId</code>, <code>dstEngineName</code>, and <code>dstEngineType</code> describe the destination validation engine. Provide the ID, name, and type of a data source or engine as a group to avoid configuration inconsistencies caused by modifying only one of them.</li>
     * <li>Comparison rules are indirectly adjusted through <code>checkTemplateId</code>. After you replace the template, the task runs based on the rules of the new template. If this field is not included, the original template is retained. This operation does not accept table-level detail configurations or scheduling settings. To adjust these settings, use the validation task configuration and scheduling operations.</li>
     * </ul>
     * <h2>Response description</h2>
     * <p>The response returns a single value. <code>data</code> is an integer business data value returned with the update result. To determine whether the update is successful, check the <code>success</code> field. If <code>success</code> is <code>false</code>, use <code>errCode</code> and <code>errMessage</code> to identify the cause of the failure. Common causes include a nonexistent task ID, insufficient permissions to modify the task, or a task name that does not meet the character restrictions. <code>requestId</code> is used to troubleshoot the call.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies an existing data validation task. You can adjust the basic task information, source and destination data sources, validation engines, and the referenced validation template.</p>
     * 
     * @param request UpdateDataCheckTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDataCheckTaskResponse
     */
    public UpdateDataCheckTaskResponse updateDataCheckTaskWithOptions(UpdateDataCheckTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.checkTemplateId)) {
            body.put("checkTemplateId", request.checkTemplateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dstDsId)) {
            body.put("dstDsId", request.dstDsId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dstDsName)) {
            body.put("dstDsName", request.dstDsName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dstDsType)) {
            body.put("dstDsType", request.dstDsType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dstEngineId)) {
            body.put("dstEngineId", request.dstEngineId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dstEngineName)) {
            body.put("dstEngineName", request.dstEngineName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dstEngineType)) {
            body.put("dstEngineType", request.dstEngineType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcDsId)) {
            body.put("srcDsId", request.srcDsId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcDsName)) {
            body.put("srcDsName", request.srcDsName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcDsType)) {
            body.put("srcDsType", request.srcDsType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcEngineId)) {
            body.put("srcEngineId", request.srcEngineId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcEngineName)) {
            body.put("srcEngineName", request.srcEngineName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcEngineType)) {
            body.put("srcEngineType", request.srcEngineType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskDescription)) {
            body.put("taskDescription", request.taskDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskName)) {
            body.put("taskName", request.taskName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDataCheckTask"),
            new TeaPair("version", "2025-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dataCheck/task/v3/update"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDataCheckTaskResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Modifies an existing data validation task. You can adjust the task name and description, source and destination data sources, source and destination validation engines, and the validation template referenced by the task. This operation is used to correct configurations or change the source of comparison rules after a task is created.</p>
     * <h2>Request description</h2>
     * <ul>
     * <li>The request body is a JSON object. The <code>id</code> field is required and specifies the ID of the data validation task to modify. All other fields are optional. Fields that are not included in the request retain their original values.</li>
     * <li><code>taskName</code> supports only Chinese characters, English letters, and digits. <code>taskDescription</code> specifies the task description.</li>
     * <li><code>srcDsId</code>, <code>srcDsName</code>, and <code>srcDsType</code> describe the source data source. <code>dstDsId</code>, <code>dstDsName</code>, and <code>dstDsType</code> describe the destination data source. <code>srcEngineId</code>, <code>srcEngineName</code>, and <code>srcEngineType</code> describe the source validation engine. <code>dstEngineId</code>, <code>dstEngineName</code>, and <code>dstEngineType</code> describe the destination validation engine. Provide the ID, name, and type of a data source or engine as a group to avoid configuration inconsistencies caused by modifying only one of them.</li>
     * <li>Comparison rules are indirectly adjusted through <code>checkTemplateId</code>. After you replace the template, the task runs based on the rules of the new template. If this field is not included, the original template is retained. This operation does not accept table-level detail configurations or scheduling settings. To adjust these settings, use the validation task configuration and scheduling operations.</li>
     * </ul>
     * <h2>Response description</h2>
     * <p>The response returns a single value. <code>data</code> is an integer business data value returned with the update result. To determine whether the update is successful, check the <code>success</code> field. If <code>success</code> is <code>false</code>, use <code>errCode</code> and <code>errMessage</code> to identify the cause of the failure. Common causes include a nonexistent task ID, insufficient permissions to modify the task, or a task name that does not meet the character restrictions. <code>requestId</code> is used to troubleshoot the call.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies an existing data validation task. You can adjust the basic task information, source and destination data sources, validation engines, and the referenced validation template.</p>
     * 
     * @param request UpdateDataCheckTaskRequest
     * @return UpdateDataCheckTaskResponse
     */
    public UpdateDataCheckTaskResponse updateDataCheckTask(UpdateDataCheckTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateDataCheckTaskWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>接口说明</h2>
     * <p>更新数据校验模板的名称、描述、适用的数据源与引擎范围以及各类校验规则定义。模板被校验任务引用后，更新会改变这些任务后续执行时所采用的比对规则，请在变更前确认影响范围。</p>
     * <h2>请求说明</h2>
     * <ul>
     * <li>请求体为 JSON 对象：<code>templateId</code> 指定要更新的校验模板 ID，<code>templateName</code> 与 <code>templateDesc</code> 更新模板名称与描述，<code>checkType</code> 为校验规则类型（0 数据量比对、1 指标比对、2 弱内容对比、3 自定义比对、4 全文比对、5 空值率比对），<code>dsEngineRels</code> 更新模板关联的数据源与引擎范围。</li>
     * <li>规则字段按 <code>checkType</code> 取用：指标比对（1）使用 <code>basicMetricRules</code>（基础数据类型指标规则，该场景下应使用此字段）、<code>complexMetricRules</code>（复合数据类型指标规则）与 <code>metricRules</code>（指标规则列表）；弱内容对比（2）使用 <code>weakContentRule</code>，该场景下需要一并传入；全文比对（4）使用 <code>fulltextRule</code>；空值率比对（5）使用 <code>nullRules</code>。与 <code>checkType</code> 不匹配的规则字段不会被使用。</li>
     * <li><code>requestId</code> 选填，为请求 ID。</li>
     * </ul>
     * <h2>返回说明</h2>
     * <p>返回状态响应，响应体只包含 <code>success</code>、<code>errCode</code>、<code>errMessage</code> 与 <code>requestId</code>，不返回业务数据；<code>success</code> 为 <code>true</code> 即表示模板已更新，无需再回查确认。更新失败时结合 <code>errCode</code> 与 <code>errMessage</code> 排查，常见原因为模板 ID 不存在、无权修改该模板，或规则字段与 <code>checkType</code> 不匹配导致校验不通过。</p>
     * 
     * <b>summary</b> : 
     * <p>更新数据校验模版</p>
     * 
     * @param request UpdateDataCheckTemplateRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDataCheckTemplateResponse
     */
    public UpdateDataCheckTemplateResponse updateDataCheckTemplateWithOptions(UpdateDataCheckTemplateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.basicMetricRules)) {
            body.put("basicMetricRules", request.basicMetricRules);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.checkType)) {
            body.put("checkType", request.checkType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.complexMetricRules)) {
            body.put("complexMetricRules", request.complexMetricRules);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dsEngineRels)) {
            body.put("dsEngineRels", request.dsEngineRels);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fulltextRule)) {
            body.put("fulltextRule", request.fulltextRule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricRules)) {
            body.put("metricRules", request.metricRules);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nullRules)) {
            body.put("nullRules", request.nullRules);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            body.put("requestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateDesc)) {
            body.put("templateDesc", request.templateDesc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            body.put("templateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateName)) {
            body.put("templateName", request.templateName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.weakContentRule)) {
            body.put("weakContentRule", request.weakContentRule);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDataCheckTemplate"),
            new TeaPair("version", "2025-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dataCheck/template/v3/update"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDataCheckTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <h2>接口说明</h2>
     * <p>更新数据校验模板的名称、描述、适用的数据源与引擎范围以及各类校验规则定义。模板被校验任务引用后，更新会改变这些任务后续执行时所采用的比对规则，请在变更前确认影响范围。</p>
     * <h2>请求说明</h2>
     * <ul>
     * <li>请求体为 JSON 对象：<code>templateId</code> 指定要更新的校验模板 ID，<code>templateName</code> 与 <code>templateDesc</code> 更新模板名称与描述，<code>checkType</code> 为校验规则类型（0 数据量比对、1 指标比对、2 弱内容对比、3 自定义比对、4 全文比对、5 空值率比对），<code>dsEngineRels</code> 更新模板关联的数据源与引擎范围。</li>
     * <li>规则字段按 <code>checkType</code> 取用：指标比对（1）使用 <code>basicMetricRules</code>（基础数据类型指标规则，该场景下应使用此字段）、<code>complexMetricRules</code>（复合数据类型指标规则）与 <code>metricRules</code>（指标规则列表）；弱内容对比（2）使用 <code>weakContentRule</code>，该场景下需要一并传入；全文比对（4）使用 <code>fulltextRule</code>；空值率比对（5）使用 <code>nullRules</code>。与 <code>checkType</code> 不匹配的规则字段不会被使用。</li>
     * <li><code>requestId</code> 选填，为请求 ID。</li>
     * </ul>
     * <h2>返回说明</h2>
     * <p>返回状态响应，响应体只包含 <code>success</code>、<code>errCode</code>、<code>errMessage</code> 与 <code>requestId</code>，不返回业务数据；<code>success</code> 为 <code>true</code> 即表示模板已更新，无需再回查确认。更新失败时结合 <code>errCode</code> 与 <code>errMessage</code> 排查，常见原因为模板 ID 不存在、无权修改该模板，或规则字段与 <code>checkType</code> 不匹配导致校验不通过。</p>
     * 
     * <b>summary</b> : 
     * <p>更新数据校验模版</p>
     * 
     * @param request UpdateDataCheckTemplateRequest
     * @return UpdateDataCheckTemplateResponse
     */
    public UpdateDataCheckTemplateResponse updateDataCheckTemplate(UpdateDataCheckTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateDataCheckTemplateWithOptions(request, headers, runtime);
    }
}
