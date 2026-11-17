// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetDataQualityScanRunResponseBody extends TeaModel {
    /**
     * <p>The run record of the data quality monitor.</p>
     */
    @NameInMap("DataQualityScanRun")
    public GetDataQualityScanRunResponseBodyDataQualityScanRun dataQualityScanRun;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0bc14115****159376359</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetDataQualityScanRunResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDataQualityScanRunResponseBody self = new GetDataQualityScanRunResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDataQualityScanRunResponseBody setDataQualityScanRun(GetDataQualityScanRunResponseBodyDataQualityScanRun dataQualityScanRun) {
        this.dataQualityScanRun = dataQualityScanRun;
        return this;
    }
    public GetDataQualityScanRunResponseBodyDataQualityScanRun getDataQualityScanRun() {
        return this.dataQualityScanRun;
    }

    public GetDataQualityScanRunResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDataQualityScanRunResponseBodyDataQualityScanRunParameters extends TeaModel {
        /**
         * <p>The parameter name.</p>
         * 
         * <strong>example:</strong>
         * <p>dt</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The parameter value.</p>
         * 
         * <strong>example:</strong>
         * <p>$[yyyy-mm-dd-1]</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetDataQualityScanRunResponseBodyDataQualityScanRunParameters build(java.util.Map<String, ?> map) throws Exception {
            GetDataQualityScanRunResponseBodyDataQualityScanRunParameters self = new GetDataQualityScanRunResponseBodyDataQualityScanRunParameters();
            return TeaModel.build(map, self);
        }

        public GetDataQualityScanRunResponseBodyDataQualityScanRunParameters setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetDataQualityScanRunResponseBodyDataQualityScanRunParameters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetDataQualityScanRunResponseBodyDataQualityScanRunResultsDetails extends TeaModel {
        /**
         * <p>The final value used to compare with the threshold.</p>
         * 
         * <strong>example:</strong>
         * <p>100.0</p>
         */
        @NameInMap("CheckValue")
        public String checkValue;

        /**
         * <p>The baseline value from the referenced sample used to calculate CheckedValue.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0</p>
         */
        @NameInMap("ReferenceValue")
        public String referenceValue;

        /**
         * <p>The status of the final comparison result. Valid values:</p>
         * <ul>
         * <li>Pass</li>
         * <li>Error</li>
         * <li>Warn</li>
         * <li>Fail</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Fail</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetDataQualityScanRunResponseBodyDataQualityScanRunResultsDetails build(java.util.Map<String, ?> map) throws Exception {
            GetDataQualityScanRunResponseBodyDataQualityScanRunResultsDetails self = new GetDataQualityScanRunResponseBodyDataQualityScanRunResultsDetails();
            return TeaModel.build(map, self);
        }

        public GetDataQualityScanRunResponseBodyDataQualityScanRunResultsDetails setCheckValue(String checkValue) {
            this.checkValue = checkValue;
            return this;
        }
        public String getCheckValue() {
            return this.checkValue;
        }

        public GetDataQualityScanRunResponseBodyDataQualityScanRunResultsDetails setReferenceValue(String referenceValue) {
            this.referenceValue = referenceValue;
            return this;
        }
        public String getReferenceValue() {
            return this.referenceValue;
        }

        public GetDataQualityScanRunResponseBodyDataQualityScanRunResultsDetails setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class GetDataQualityScanRunResponseBodyDataQualityScanRunResults extends TeaModel {
        /**
         * <p>The time when the check result was generated.</p>
         * <p>The value is a 13-digit number, such as <code>1725506795000</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>1725506795000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The details of the current check.</p>
         */
        @NameInMap("Details")
        public java.util.List<GetDataQualityScanRunResponseBodyDataQualityScanRunResultsDetails> details;

        /**
         * <p>The snapshot of the rule spec at the start of the check.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;templateId&quot;: &quot;SYSTEM:field:null_value:fixed&quot;,
         *     &quot;pass&quot;: &quot;when = 0&quot;,
         *     &quot;name&quot;: &quot;The id cannot be empty.&quot;,
         *     &quot;severity&quot;: &quot;High&quot;,
         *     &quot;identity&quot;: &quot;a-customized-data-quality-rule-uuid&quot;
         * }</p>
         */
        @NameInMap("Rule")
        public String rule;

        /**
         * <p>The sample value used for the current check.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;value&quot;: &quot;100.0&quot;
         * }</p>
         */
        @NameInMap("Sample")
        public String sample;

        /**
         * <p>The status of the check result. Valid values:</p>
         * <ul>
         * <li>Pass</li>
         * <li>Running</li>
         * <li>Error</li>
         * <li>Warn</li>
         * <li>Fail</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Fail</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetDataQualityScanRunResponseBodyDataQualityScanRunResults build(java.util.Map<String, ?> map) throws Exception {
            GetDataQualityScanRunResponseBodyDataQualityScanRunResults self = new GetDataQualityScanRunResponseBodyDataQualityScanRunResults();
            return TeaModel.build(map, self);
        }

        public GetDataQualityScanRunResponseBodyDataQualityScanRunResults setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetDataQualityScanRunResponseBodyDataQualityScanRunResults setDetails(java.util.List<GetDataQualityScanRunResponseBodyDataQualityScanRunResultsDetails> details) {
            this.details = details;
            return this;
        }
        public java.util.List<GetDataQualityScanRunResponseBodyDataQualityScanRunResultsDetails> getDetails() {
            return this.details;
        }

        public GetDataQualityScanRunResponseBodyDataQualityScanRunResults setRule(String rule) {
            this.rule = rule;
            return this;
        }
        public String getRule() {
            return this.rule;
        }

        public GetDataQualityScanRunResponseBodyDataQualityScanRunResults setSample(String sample) {
            this.sample = sample;
            return this;
        }
        public String getSample() {
            return this.sample;
        }

        public GetDataQualityScanRunResponseBodyDataQualityScanRunResults setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class GetDataQualityScanRunResponseBodyDataQualityScanRunScanComputeResourceRuntime extends TeaModel {
        /**
         * <p>The type of the engine used. Only the E-MapReduce (EMR) compute engine supports this setting. Valid values:</p>
         * <ul>
         * <li>Hive</li>
         * <li>Spark</li>
         * <li>Kyuubi</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Hive</p>
         */
        @NameInMap("Engine")
        public String engine;

        /**
         * <p>The additional parameter settings when the Hive engine is used. Currently, only the queue can be configured by using mapreduce.job.queuename.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;mapreduce.job.queuename&quot;: &quot;dq_queue&quot;}</p>
         */
        @NameInMap("HiveConf")
        public java.util.Map<String, ?> hiveConf;

        /**
         * <p>The additional parameter settings when the Spark engine is used. Currently, only the queue can be configured by using spark.yarn.queue.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;spark.yarn.queue&quot;: &quot;dq_queue&quot;}</p>
         */
        @NameInMap("SparkConf")
        public java.util.Map<String, ?> sparkConf;

        public static GetDataQualityScanRunResponseBodyDataQualityScanRunScanComputeResourceRuntime build(java.util.Map<String, ?> map) throws Exception {
            GetDataQualityScanRunResponseBodyDataQualityScanRunScanComputeResourceRuntime self = new GetDataQualityScanRunResponseBodyDataQualityScanRunScanComputeResourceRuntime();
            return TeaModel.build(map, self);
        }

        public GetDataQualityScanRunResponseBodyDataQualityScanRunScanComputeResourceRuntime setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public GetDataQualityScanRunResponseBodyDataQualityScanRunScanComputeResourceRuntime setHiveConf(java.util.Map<String, ?> hiveConf) {
            this.hiveConf = hiveConf;
            return this;
        }
        public java.util.Map<String, ?> getHiveConf() {
            return this.hiveConf;
        }

        public GetDataQualityScanRunResponseBodyDataQualityScanRunScanComputeResourceRuntime setSparkConf(java.util.Map<String, ?> sparkConf) {
            this.sparkConf = sparkConf;
            return this;
        }
        public java.util.Map<String, ?> getSparkConf() {
            return this.sparkConf;
        }

    }

    public static class GetDataQualityScanRunResponseBodyDataQualityScanRunScanComputeResource extends TeaModel {
        /**
         * <p>The workspace environment to which the compute engine belongs. Valid values:</p>
         * <ul>
         * <li>Prod</li>
         * <li>Dev</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Dev</p>
         */
        @NameInMap("EnvType")
        public String envType;

        /**
         * <p>The name of the compute resource. This corresponds to the Name property in the ComputeResource data structure of the compute resource API.</p>
         * 
         * <strong>example:</strong>
         * <p>emr_cluster_001</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The additional runtime settings for the data quality monitoring task.</p>
         */
        @NameInMap("Runtime")
        public GetDataQualityScanRunResponseBodyDataQualityScanRunScanComputeResourceRuntime runtime;

        public static GetDataQualityScanRunResponseBodyDataQualityScanRunScanComputeResource build(java.util.Map<String, ?> map) throws Exception {
            GetDataQualityScanRunResponseBodyDataQualityScanRunScanComputeResource self = new GetDataQualityScanRunResponseBodyDataQualityScanRunScanComputeResource();
            return TeaModel.build(map, self);
        }

        public GetDataQualityScanRunResponseBodyDataQualityScanRunScanComputeResource setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public GetDataQualityScanRunResponseBodyDataQualityScanRunScanComputeResource setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetDataQualityScanRunResponseBodyDataQualityScanRunScanComputeResource setRuntime(GetDataQualityScanRunResponseBodyDataQualityScanRunScanComputeResourceRuntime runtime) {
            this.runtime = runtime;
            return this;
        }
        public GetDataQualityScanRunResponseBodyDataQualityScanRunScanComputeResourceRuntime getRuntime() {
            return this.runtime;
        }

    }

    public static class GetDataQualityScanRunResponseBodyDataQualityScanRunScanHooks extends TeaModel {
        /**
         * <p>The condition that triggers the hook. Currently, only one expression syntax is supported:</p>
         * <ul>
         * <li>Specify multiple groups of rule severity types and rule check statuses. For example, <code>results.any { r -&gt; r.status == \\&quot;Fail\\&quot; &amp;&amp; r.rule.severity == \\&quot;Normal\\&quot; || r.status == \\&quot;Error\\&quot; &amp;&amp; r.rule.severity == \\&quot;High\\&quot; || r.status == \\&quot;Warn\\&quot; &amp;&amp; r.rule.severity == \\&quot;High\\&quot; }</code> indicates that the condition is met if the check result of a rule with the severity of Normal is Fail, the check result of a rule with the severity of High is Error, or the check result of a rule with the severity of High is Warn among the executed rules. The enum values of severity in the conditional expression are the same as those in the spec, and the enum values of status are the same as those in DataQualityResult.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>results.any { r -&gt; r.status == \&quot;fail\&quot; &amp;&amp; r.rule.severity == \&quot;High\&quot; }</p>
         */
        @NameInMap("Condition")
        public String condition;

        /**
         * <p>The hook type. Valid values:</p>
         * <ul>
         * <li>BlockTaskInstance</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BlockTaskInstance</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetDataQualityScanRunResponseBodyDataQualityScanRunScanHooks build(java.util.Map<String, ?> map) throws Exception {
            GetDataQualityScanRunResponseBodyDataQualityScanRunScanHooks self = new GetDataQualityScanRunResponseBodyDataQualityScanRunScanHooks();
            return TeaModel.build(map, self);
        }

        public GetDataQualityScanRunResponseBodyDataQualityScanRunScanHooks setCondition(String condition) {
            this.condition = condition;
            return this;
        }
        public String getCondition() {
            return this.condition;
        }

        public GetDataQualityScanRunResponseBodyDataQualityScanRunScanHooks setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetDataQualityScanRunResponseBodyDataQualityScanRunScanParameters extends TeaModel {
        /**
         * <p>The parameter name.</p>
         * 
         * <strong>example:</strong>
         * <p>dt</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The parameter value.</p>
         * 
         * <strong>example:</strong>
         * <p>$[yyyy-mm-dd-1]</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetDataQualityScanRunResponseBodyDataQualityScanRunScanParameters build(java.util.Map<String, ?> map) throws Exception {
            GetDataQualityScanRunResponseBodyDataQualityScanRunScanParameters self = new GetDataQualityScanRunResponseBodyDataQualityScanRunScanParameters();
            return TeaModel.build(map, self);
        }

        public GetDataQualityScanRunResponseBodyDataQualityScanRunScanParameters setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetDataQualityScanRunResponseBodyDataQualityScanRunScanParameters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetDataQualityScanRunResponseBodyDataQualityScanRunScanRuntimeResource extends TeaModel {
        /**
         * <p>The reserved compute units (CUs) of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Cu")
        public Float cu;

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>60597</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The ID of the image used for the run configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>i-xxxx</p>
         */
        @NameInMap("Image")
        public String image;

        public static GetDataQualityScanRunResponseBodyDataQualityScanRunScanRuntimeResource build(java.util.Map<String, ?> map) throws Exception {
            GetDataQualityScanRunResponseBodyDataQualityScanRunScanRuntimeResource self = new GetDataQualityScanRunResponseBodyDataQualityScanRunScanRuntimeResource();
            return TeaModel.build(map, self);
        }

        public GetDataQualityScanRunResponseBodyDataQualityScanRunScanRuntimeResource setCu(Float cu) {
            this.cu = cu;
            return this;
        }
        public Float getCu() {
            return this.cu;
        }

        public GetDataQualityScanRunResponseBodyDataQualityScanRunScanRuntimeResource setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetDataQualityScanRunResponseBodyDataQualityScanRunScanRuntimeResource setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

    }

    public static class GetDataQualityScanRunResponseBodyDataQualityScanRunScanTrigger extends TeaModel {
        /**
         * <p>The IDs of the scheduling tasks that trigger the data quality monitoring task when the trigger method is set to BySchedule.</p>
         */
        @NameInMap("TaskIds")
        public java.util.List<Long> taskIds;

        /**
         * <p>The trigger method of the data quality monitoring task. Valid values:</p>
         * <ul>
         * <li>ByManual</li>
         * <li>BySchedule</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BySchedule</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetDataQualityScanRunResponseBodyDataQualityScanRunScanTrigger build(java.util.Map<String, ?> map) throws Exception {
            GetDataQualityScanRunResponseBodyDataQualityScanRunScanTrigger self = new GetDataQualityScanRunResponseBodyDataQualityScanRunScanTrigger();
            return TeaModel.build(map, self);
        }

        public GetDataQualityScanRunResponseBodyDataQualityScanRunScanTrigger setTaskIds(java.util.List<Long> taskIds) {
            this.taskIds = taskIds;
            return this;
        }
        public java.util.List<Long> getTaskIds() {
            return this.taskIds;
        }

        public GetDataQualityScanRunResponseBodyDataQualityScanRunScanTrigger setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetDataQualityScanRunResponseBodyDataQualityScanRunScan extends TeaModel {
        /**
         * <p>The compute resource settings of the data quality monitoring task.</p>
         */
        @NameInMap("ComputeResource")
        public GetDataQualityScanRunResponseBodyDataQualityScanRunScanComputeResource computeResource;

        /**
         * <p>The time when the data quality monitoring task was created.</p>
         * <p>The value is a 13-digit number, such as <code>1706247622000</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>1706247622000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The user who created the data quality monitoring task.</p>
         * 
         * <strong>example:</strong>
         * <p>7892346529452</p>
         */
        @NameInMap("CreateUser")
        public String createUser;

        /**
         * <p>The description of the data quality check task. The description can be up to 65,535 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>This is a hourly run data quality evaluation plan.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The configuration for hooks that run after the data quality monitor finishes.</p>
         */
        @NameInMap("Hooks")
        public java.util.List<GetDataQualityScanRunResponseBodyDataQualityScanRunScanHooks> hooks;

        /**
         * <p>The ID of the data quality monitor.</p>
         * 
         * <strong>example:</strong>
         * <p>21077</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The time when the data quality monitoring task was updated.</p>
         * <p>The value is a 13-digit number, such as <code>1706247622000</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>1706247622000</p>
         */
        @NameInMap("ModifyTime")
        public Long modifyTime;

        /**
         * <p>The user who last updated the data quality monitoring task.</p>
         * 
         * <strong>example:</strong>
         * <p>7892346529452</p>
         */
        @NameInMap("ModifyUser")
        public String modifyUser;

        /**
         * <p>The name of the data quality check task. The name can contain digits, letters, Chinese characters, and half-width or full-width punctuation marks, and can be up to 255 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>Hourly partition quality monitoring</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The owner of the data quality monitoring task.</p>
         * 
         * <strong>example:</strong>
         * <p>7892346529452</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The parameter settings of the data quality monitoring task.</p>
         */
        @NameInMap("Parameters")
        public java.util.List<GetDataQualityScanRunResponseBodyDataQualityScanRunScanParameters> parameters;

        /**
         * <p>The project ID.</p>
         * 
         * <strong>example:</strong>
         * <p>164024</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The resource group used when the data quality monitoring task runs.</p>
         */
        @NameInMap("RuntimeResource")
        public GetDataQualityScanRunResponseBodyDataQualityScanRunScanRuntimeResource runtimeResource;

        /**
         * <p>The spec of the data quality monitoring task. For more information, see <a href="https://help.aliyun.com/document_detail/2963394.html">Data quality spec configuration guide</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;datasets&quot;: [
         *         {
         *             &quot;type&quot;: &quot;Table&quot;,
         *             &quot;dataSource&quot;: {
         *                 &quot;name&quot;: &quot;odps_first&quot;,
         *                 &quot;envType&quot;: &quot;Prod&quot;
         *             },
         *             &quot;tables&quot;: [
         *                 &quot;ods_d_user_info&quot;
         *             ],
         *             &quot;filter&quot;: &quot;pt = $[yyyymmdd-1]&quot;
         *         }
         *     ],
         *     &quot;rules&quot;: [
         *         {
         *             &quot;assertion&quot;: &quot;row_count &gt; 0&quot;
         *         }, {
         *             &quot;templateId&quot;: &quot;SYSTEM:field:null_value:fixed&quot;,
         *             &quot;pass&quot;: &quot;when = 0&quot;,
         *             &quot;name&quot;: &quot;The id cannot be empty.&quot;,
         *             &quot;severity&quot;: &quot;High&quot;,
         *              &quot;identity&quot;: &quot;a-customized-data-quality-rule-uuid&quot;
         *         }
         *     ]
         * }</p>
         */
        @NameInMap("Spec")
        public String spec;

        /**
         * <p>The trigger configuration of the data quality monitoring task.</p>
         */
        @NameInMap("Trigger")
        public GetDataQualityScanRunResponseBodyDataQualityScanRunScanTrigger trigger;

        public static GetDataQualityScanRunResponseBodyDataQualityScanRunScan build(java.util.Map<String, ?> map) throws Exception {
            GetDataQualityScanRunResponseBodyDataQualityScanRunScan self = new GetDataQualityScanRunResponseBodyDataQualityScanRunScan();
            return TeaModel.build(map, self);
        }

        public GetDataQualityScanRunResponseBodyDataQualityScanRunScan setComputeResource(GetDataQualityScanRunResponseBodyDataQualityScanRunScanComputeResource computeResource) {
            this.computeResource = computeResource;
            return this;
        }
        public GetDataQualityScanRunResponseBodyDataQualityScanRunScanComputeResource getComputeResource() {
            return this.computeResource;
        }

        public GetDataQualityScanRunResponseBodyDataQualityScanRunScan setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetDataQualityScanRunResponseBodyDataQualityScanRunScan setCreateUser(String createUser) {
            this.createUser = createUser;
            return this;
        }
        public String getCreateUser() {
            return this.createUser;
        }

        public GetDataQualityScanRunResponseBodyDataQualityScanRunScan setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetDataQualityScanRunResponseBodyDataQualityScanRunScan setHooks(java.util.List<GetDataQualityScanRunResponseBodyDataQualityScanRunScanHooks> hooks) {
            this.hooks = hooks;
            return this;
        }
        public java.util.List<GetDataQualityScanRunResponseBodyDataQualityScanRunScanHooks> getHooks() {
            return this.hooks;
        }

        public GetDataQualityScanRunResponseBodyDataQualityScanRunScan setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetDataQualityScanRunResponseBodyDataQualityScanRunScan setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public GetDataQualityScanRunResponseBodyDataQualityScanRunScan setModifyUser(String modifyUser) {
            this.modifyUser = modifyUser;
            return this;
        }
        public String getModifyUser() {
            return this.modifyUser;
        }

        public GetDataQualityScanRunResponseBodyDataQualityScanRunScan setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetDataQualityScanRunResponseBodyDataQualityScanRunScan setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetDataQualityScanRunResponseBodyDataQualityScanRunScan setParameters(java.util.List<GetDataQualityScanRunResponseBodyDataQualityScanRunScanParameters> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.List<GetDataQualityScanRunResponseBodyDataQualityScanRunScanParameters> getParameters() {
            return this.parameters;
        }

        public GetDataQualityScanRunResponseBodyDataQualityScanRunScan setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetDataQualityScanRunResponseBodyDataQualityScanRunScan setRuntimeResource(GetDataQualityScanRunResponseBodyDataQualityScanRunScanRuntimeResource runtimeResource) {
            this.runtimeResource = runtimeResource;
            return this;
        }
        public GetDataQualityScanRunResponseBodyDataQualityScanRunScanRuntimeResource getRuntimeResource() {
            return this.runtimeResource;
        }

        public GetDataQualityScanRunResponseBodyDataQualityScanRunScan setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

        public GetDataQualityScanRunResponseBodyDataQualityScanRunScan setTrigger(GetDataQualityScanRunResponseBodyDataQualityScanRunScanTrigger trigger) {
            this.trigger = trigger;
            return this;
        }
        public GetDataQualityScanRunResponseBodyDataQualityScanRunScanTrigger getTrigger() {
            return this.trigger;
        }

    }

    public static class GetDataQualityScanRunResponseBodyDataQualityScanRun extends TeaModel {
        /**
         * <p>The time when the data quality monitoring run started.</p>
         * <p>The value is a 13-digit number, such as <code>1706247622000</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>1706247622000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The time when the data quality monitoring run ended.</p>
         * <p>The value is a 13-digit number, such as <code>1706247622000</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>1706247622000</p>
         */
        @NameInMap("FinishTime")
        public Long finishTime;

        /**
         * <p>The ID of the run record.</p>
         * 
         * <strong>example:</strong>
         * <p>1016440997</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The parameter settings used during the actual run.</p>
         */
        @NameInMap("Parameters")
        public java.util.List<GetDataQualityScanRunResponseBodyDataQualityScanRunParameters> parameters;

        /**
         * <p>The check results for individual rules.</p>
         */
        @NameInMap("Results")
        public java.util.List<GetDataQualityScanRunResponseBodyDataQualityScanRunResults> results;

        /**
         * <p>The snapshot of the data quality monitoring configuration at the start of the check.</p>
         */
        @NameInMap("Scan")
        public GetDataQualityScanRunResponseBodyDataQualityScanRunScan scan;

        /**
         * <p>The current run status. Valid values:</p>
         * <ul>
         * <li>Pass</li>
         * <li>Running</li>
         * <li>Error</li>
         * <li>Warn</li>
         * <li>Fail</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Fail</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetDataQualityScanRunResponseBodyDataQualityScanRun build(java.util.Map<String, ?> map) throws Exception {
            GetDataQualityScanRunResponseBodyDataQualityScanRun self = new GetDataQualityScanRunResponseBodyDataQualityScanRun();
            return TeaModel.build(map, self);
        }

        public GetDataQualityScanRunResponseBodyDataQualityScanRun setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetDataQualityScanRunResponseBodyDataQualityScanRun setFinishTime(Long finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public Long getFinishTime() {
            return this.finishTime;
        }

        public GetDataQualityScanRunResponseBodyDataQualityScanRun setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetDataQualityScanRunResponseBodyDataQualityScanRun setParameters(java.util.List<GetDataQualityScanRunResponseBodyDataQualityScanRunParameters> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.List<GetDataQualityScanRunResponseBodyDataQualityScanRunParameters> getParameters() {
            return this.parameters;
        }

        public GetDataQualityScanRunResponseBodyDataQualityScanRun setResults(java.util.List<GetDataQualityScanRunResponseBodyDataQualityScanRunResults> results) {
            this.results = results;
            return this;
        }
        public java.util.List<GetDataQualityScanRunResponseBodyDataQualityScanRunResults> getResults() {
            return this.results;
        }

        public GetDataQualityScanRunResponseBodyDataQualityScanRun setScan(GetDataQualityScanRunResponseBodyDataQualityScanRunScan scan) {
            this.scan = scan;
            return this;
        }
        public GetDataQualityScanRunResponseBodyDataQualityScanRunScan getScan() {
            return this.scan;
        }

        public GetDataQualityScanRunResponseBodyDataQualityScanRun setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
