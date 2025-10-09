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
     * <p>The compute engine used at runtime. If not specified, the data source defined in the Spec is used.</p>
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
     * <p>The Hook configurations after the data quality monitoring run ends.</p>
     */
    @NameInMap("Hooks")
    public java.util.List<CreateDataQualityScanRequestHooks> hooks;

    /**
     * <p>The data quality monitoring name.</p>
     * 
     * <strong>example:</strong>
     * <p>data_quality_scan_001</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the user who owns of the data quality monitor.</p>
     * 
     * <strong>example:</strong>
     * <p>95279527****</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <p>The definition of execution parameters for the data quality monitoring.</p>
     */
    @NameInMap("Parameters")
    public java.util.List<CreateDataQualityScanRequestParameters> parameters;

    /**
     * <p>The DataWorks workspace ID. You can log on to the DataWorks console and go to the workspace configuration page to obtain the workspace ID. This parameter is required to specify the target DataWorks workspace for this API operation.</p>
     * 
     * <strong>example:</strong>
     * <p>101</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The resource group used during execution of the data quality monitoring.</p>
     */
    @NameInMap("RuntimeResource")
    public CreateDataQualityScanRequestRuntimeResource runtimeResource;

    /**
     * <p>Spec code for the content of the data quality monitoring.</p>
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
     * <p>The trigger configurations of the data quality monitoring task.</p>
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
         * <p>The type of the compute engine. Only EMR compute engines support these settings.</p>
         * <p>Valid values:</p>
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
         * <p>Additional Hive engine parameters. Currently, only the mapreduce.job.queuename parameter is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>mapreduce.job.queuename=dq_queue</p>
         */
        @NameInMap("HiveConf")
        public java.util.Map<String, ?> hiveConf;

        /**
         * <p>Additional Spark engine parameters. Currently, only the spark.yarn.queue parameter is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>spark.yarn.queue=dq_queue</p>
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
         * <p>The workspace environment to which the compute engine belongs.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Prod: production environment .</li>
         * <li>Dev: development environment.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Dev</p>
         */
        @NameInMap("EnvType")
        public String envType;

        /**
         * <p>The name of the compute engine, which is a unique identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>emr_first</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>More settings for data quality monitoring at runtime.</p>
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
         * <p>The Hook trigger condition. The hook will run if the condition is met. Currently, only one type of expression syntax is supported:</p>
         * <p>You can specify multiple combinations of rule severity levels and validation statuses using an expression such as <code>results.any { r -&gt; r.status == \\&quot;Fail\\&quot; &amp;&amp; r.rule.severity == \\&quot;Normal\\&quot; || r.status == \\&quot;Error\\&quot; &amp;&amp; r.rule.severity == \\&quot;High\\&quot; || r.status == \\&quot;Warn\\&quot; &amp;&amp; r.rule.severity == \\&quot;High\\&quot; }</code>. This expression means the condition is met if any executed rule has a result of Fail with severity Normal, Error with severity High, or Warn with severity High. In the condition expression, the values of severity and status are predefined enums. The values of severity must match those defined in the Spec, and the values of status must match those in DataQualityResult.</p>
         * 
         * <strong>example:</strong>
         * <p>results.any { r -&gt; r.status == \&quot;Fail\&quot; &amp;&amp; r.rule.severity == \&quot;Normal\&quot; || r.status == \&quot;Error\&quot; &amp;&amp; r.rule.severity == \&quot;High\&quot; || r.status == \&quot;Warn\&quot; &amp;&amp; r.rule.severity == \&quot;High\&quot; }</p>
         */
        @NameInMap("Condition")
        public String condition;

        /**
         * <p>The type of the Hook.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>BlockTaskInstance: Blocks the scheduling of the task instance.</li>
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
         * <p>The parameter name.</p>
         * 
         * <strong>example:</strong>
         * <p>triggerTime</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The parameter values.</p>
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
         * <p>The default number of CUs configured for task running.</p>
         * 
         * <strong>example:</strong>
         * <p>0.25</p>
         */
        @NameInMap("Cu")
        public Float cu;

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0525242e-d0ee-4bda-bc73-765d82f6a34a</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The ID of the image configured for task running.</p>
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
         * <p>If the trigger mode is set to BySchedule, the scheduling task ID must be specified.</p>
         */
        @NameInMap("TaskIds")
        public java.util.List<Long> taskIds;

        /**
         * <p>The trigger mode of the monitoring task.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>ByManual: Manual trigger. This is the default setting.</li>
         * <li>BySchedule: Triggered by a scheduled task instance.</li>
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
