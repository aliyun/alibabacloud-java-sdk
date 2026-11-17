// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateDataQualityScanRequest extends TeaModel {
    /**
     * <p>The idempotency token.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a-customized-uuid</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The compute engine used when the data quality monitor runs. This parameter is optional. If it is not specified, the data source connection specified in the Spec is used.</p>
     */
    @NameInMap("ComputeResource")
    public CreateDataQualityScanRequestComputeResource computeResource;

    /**
     * <p>The description of the data quality monitor.</p>
     * 
     * <strong>example:</strong>
     * <p>Daily data quality scanning of ods tables.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The configuration for hooks that run after the data quality monitor finishes.</p>
     */
    @NameInMap("Hooks")
    public java.util.List<CreateDataQualityScanRequestHooks> hooks;

    /**
     * <p>The name of the data quality monitor.</p>
     * 
     * <strong>example:</strong>
     * <p>data_quality_scan_001</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The user ID of the owner of the data quality monitor.</p>
     * 
     * <strong>example:</strong>
     * <p>95279527****</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <p>The execution parameter definitions of the data quality monitor.</p>
     */
    @NameInMap("Parameters")
    public java.util.List<CreateDataQualityScanRequestParameters> parameters;

    /**
     * <p>The ID of the DataWorks workspace. You can log on to the <a href="https://dataworks.console.aliyun.com/overview">DataWorks console</a> and go to the Workspace Management page to obtain the workspace ID. This parameter specifies the DataWorks workspace for the API call.</p>
     * 
     * <strong>example:</strong>
     * <p>101</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The resource group used when the data quality monitor runs.</p>
     */
    @NameInMap("RuntimeResource")
    public CreateDataQualityScanRequestRuntimeResource runtimeResource;

    /**
     * <p>The Spec code that defines the data quality monitor. For more information, see <a href="https://help.aliyun.com/document_detail/2963394.html">Data quality spec configuration guide</a>.</p>
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
     * <p>The trigger settings of the data quality monitor.</p>
     */
    @NameInMap("Trigger")
    public CreateDataQualityScanRequestTrigger trigger;

    public static CreateDataQualityScanRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDataQualityScanRequest self = new CreateDataQualityScanRequest();
        return TeaModel.build(map, self);
    }

    public CreateDataQualityScanRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateDataQualityScanRequest setComputeResource(CreateDataQualityScanRequestComputeResource computeResource) {
        this.computeResource = computeResource;
        return this;
    }
    public CreateDataQualityScanRequestComputeResource getComputeResource() {
        return this.computeResource;
    }

    public CreateDataQualityScanRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateDataQualityScanRequest setHooks(java.util.List<CreateDataQualityScanRequestHooks> hooks) {
        this.hooks = hooks;
        return this;
    }
    public java.util.List<CreateDataQualityScanRequestHooks> getHooks() {
        return this.hooks;
    }

    public CreateDataQualityScanRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateDataQualityScanRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public CreateDataQualityScanRequest setParameters(java.util.List<CreateDataQualityScanRequestParameters> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.List<CreateDataQualityScanRequestParameters> getParameters() {
        return this.parameters;
    }

    public CreateDataQualityScanRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public CreateDataQualityScanRequest setRuntimeResource(CreateDataQualityScanRequestRuntimeResource runtimeResource) {
        this.runtimeResource = runtimeResource;
        return this;
    }
    public CreateDataQualityScanRequestRuntimeResource getRuntimeResource() {
        return this.runtimeResource;
    }

    public CreateDataQualityScanRequest setSpec(String spec) {
        this.spec = spec;
        return this;
    }
    public String getSpec() {
        return this.spec;
    }

    public CreateDataQualityScanRequest setTrigger(CreateDataQualityScanRequestTrigger trigger) {
        this.trigger = trigger;
        return this;
    }
    public CreateDataQualityScanRequestTrigger getTrigger() {
        return this.trigger;
    }

    public static class CreateDataQualityScanRequestComputeResourceRuntime extends TeaModel {
        /**
         * <p>The type of the engine used. Only the E-MapReduce (EMR) compute engine supports this setting. Valid values:</p>
         * <ul>
         * <li>Hive: Hive SQL</li>
         * <li>Spark: Spark SQL</li>
         * <li>Kyuubi</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Hive</p>
         */
        @NameInMap("Engine")
        public String engine;

        /**
         * <p>The additional parameter settings when the Hive engine is used. Currently, only the queue can be set by using mapreduce.job.queuename.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;mapreduce.job.queuename&quot;: &quot;dq_queue&quot;}</p>
         */
        @NameInMap("HiveConf")
        public java.util.Map<String, ?> hiveConf;

        /**
         * <p>The additional parameter settings when the Spark engine is used. Currently, only the queue can be set by using spark.yarn.queue.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;spark.yarn.queue&quot;: &quot;dq_queue&quot;}</p>
         */
        @NameInMap("SparkConf")
        public java.util.Map<String, ?> sparkConf;

        public static CreateDataQualityScanRequestComputeResourceRuntime build(java.util.Map<String, ?> map) throws Exception {
            CreateDataQualityScanRequestComputeResourceRuntime self = new CreateDataQualityScanRequestComputeResourceRuntime();
            return TeaModel.build(map, self);
        }

        public CreateDataQualityScanRequestComputeResourceRuntime setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public CreateDataQualityScanRequestComputeResourceRuntime setHiveConf(java.util.Map<String, ?> hiveConf) {
            this.hiveConf = hiveConf;
            return this;
        }
        public java.util.Map<String, ?> getHiveConf() {
            return this.hiveConf;
        }

        public CreateDataQualityScanRequestComputeResourceRuntime setSparkConf(java.util.Map<String, ?> sparkConf) {
            this.sparkConf = sparkConf;
            return this;
        }
        public java.util.Map<String, ?> getSparkConf() {
            return this.sparkConf;
        }

    }

    public static class CreateDataQualityScanRequestComputeResource extends TeaModel {
        /**
         * <p>The workspace environment to which the compute engine belongs. Valid values:</p>
         * <ul>
         * <li>Prod: production environment</li>
         * <li>Dev: development environment</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Dev</p>
         */
        @NameInMap("EnvType")
        public String envType;

        /**
         * <p>The name of the compute engine, which serves as a unique identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>emr_first</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The additional settings for the data quality monitor at runtime.</p>
         */
        @NameInMap("Runtime")
        public CreateDataQualityScanRequestComputeResourceRuntime runtime;

        public static CreateDataQualityScanRequestComputeResource build(java.util.Map<String, ?> map) throws Exception {
            CreateDataQualityScanRequestComputeResource self = new CreateDataQualityScanRequestComputeResource();
            return TeaModel.build(map, self);
        }

        public CreateDataQualityScanRequestComputeResource setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public CreateDataQualityScanRequestComputeResource setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateDataQualityScanRequestComputeResource setRuntime(CreateDataQualityScanRequestComputeResourceRuntime runtime) {
            this.runtime = runtime;
            return this;
        }
        public CreateDataQualityScanRequestComputeResourceRuntime getRuntime() {
            return this.runtime;
        }

    }

    public static class CreateDataQualityScanRequestHooks extends TeaModel {
        /**
         * <p>The condition that triggers the hook. When this condition is met, the hook is triggered. Currently, only one expression syntax is supported:</p>
         * <p>Specify multiple groups of rule severity levels and rule check statuses. For example, <code>results.any { r -&gt; r.status == \\&quot;Fail\\&quot; &amp;&amp; r.rule.severity == \\&quot;Normal\\&quot; || r.status == \\&quot;Error\\&quot; &amp;&amp; r.rule.severity == \\&quot;High\\&quot; || r.status == \\&quot;Warn\\&quot; &amp;&amp; r.rule.severity == \\&quot;High\\&quot; }</code> indicates that among the executed rules, if the check result of a rule with the severity of Normal is Fail, the check result of a rule with the severity of High is Error, or the check result of a rule with the severity of High is Warn, the condition is met. The enumerations of severity in the conditional expression are consistent with those in the spec, and the enumerations of status are consistent with those in DataQualityResult.</p>
         * 
         * <strong>example:</strong>
         * <p>results.any { r -&gt; r.status == \&quot;Fail\&quot; &amp;&amp; r.rule.severity == \&quot;Normal\&quot; || r.status == \&quot;Error\&quot; &amp;&amp; r.rule.severity == \&quot;High\&quot; || r.status == \&quot;Warn\&quot; &amp;&amp; r.rule.severity == \&quot;High\&quot; }</p>
         */
        @NameInMap("Condition")
        public String condition;

        /**
         * <p>The type of the hook. Valid values:</p>
         * <ul>
         * <li>BlockTaskInstance: blocks task instance scheduling.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BlockTaskInstance</p>
         */
        @NameInMap("Type")
        public String type;

        public static CreateDataQualityScanRequestHooks build(java.util.Map<String, ?> map) throws Exception {
            CreateDataQualityScanRequestHooks self = new CreateDataQualityScanRequestHooks();
            return TeaModel.build(map, self);
        }

        public CreateDataQualityScanRequestHooks setCondition(String condition) {
            this.condition = condition;
            return this;
        }
        public String getCondition() {
            return this.condition;
        }

        public CreateDataQualityScanRequestHooks setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateDataQualityScanRequestParameters extends TeaModel {
        /**
         * <p>The name of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>triggerTime</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The value of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>$[yyyymmdd-1]</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateDataQualityScanRequestParameters build(java.util.Map<String, ?> map) throws Exception {
            CreateDataQualityScanRequestParameters self = new CreateDataQualityScanRequestParameters();
            return TeaModel.build(map, self);
        }

        public CreateDataQualityScanRequestParameters setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateDataQualityScanRequestParameters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateDataQualityScanRequestRuntimeResource extends TeaModel {
        /**
         * <p>The compute unit (CU) consumption of the runtime configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>0.25</p>
         */
        @NameInMap("Cu")
        public Float cu;

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>0525242e-d0ee-4bda-bc73-765d82f6a34a</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The image ID of the runtime configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>i-xxxxxx</p>
         */
        @NameInMap("Image")
        public String image;

        public static CreateDataQualityScanRequestRuntimeResource build(java.util.Map<String, ?> map) throws Exception {
            CreateDataQualityScanRequestRuntimeResource self = new CreateDataQualityScanRequestRuntimeResource();
            return TeaModel.build(map, self);
        }

        public CreateDataQualityScanRequestRuntimeResource setCu(Float cu) {
            this.cu = cu;
            return this;
        }
        public Float getCu() {
            return this.cu;
        }

        public CreateDataQualityScanRequestRuntimeResource setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateDataQualityScanRequestRuntimeResource setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

    }

    public static class CreateDataQualityScanRequestTrigger extends TeaModel {
        /**
         * <p>The IDs of the scheduled tasks that trigger the data quality monitor when the trigger method is set to BySchedule.</p>
         */
        @NameInMap("TaskIds")
        public java.util.List<Long> taskIds;

        /**
         * <p>The trigger method of the data quality monitor. Valid values:</p>
         * <ul>
         * <li>ByManual: manual trigger. This is the default value.</li>
         * <li>BySchedule: scheduled task instance trigger.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BySchedule</p>
         */
        @NameInMap("Type")
        public String type;

        public static CreateDataQualityScanRequestTrigger build(java.util.Map<String, ?> map) throws Exception {
            CreateDataQualityScanRequestTrigger self = new CreateDataQualityScanRequestTrigger();
            return TeaModel.build(map, self);
        }

        public CreateDataQualityScanRequestTrigger setTaskIds(java.util.List<Long> taskIds) {
            this.taskIds = taskIds;
            return this;
        }
        public java.util.List<Long> getTaskIds() {
            return this.taskIds;
        }

        public CreateDataQualityScanRequestTrigger setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
