// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateDataQualityScanRequest extends TeaModel {
    /**
     * <p>The compute engine used during execution. If it\&quot;s not specified, the data source connection defined in the Spec will be used.</p>
     */
    @NameInMap("ComputeResource")
    public UpdateDataQualityScanRequestComputeResource computeResource;

    /**
     * <p>Description of the data quality monitor.</p>
     * 
     * <strong>example:</strong>
     * <p>Daily data quality scanning of ods tables.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The hook configuration after the data quality monitor stops.</p>
     */
    @NameInMap("Hooks")
    public java.util.List<UpdateDataQualityScanRequestHooks> hooks;

    /**
     * <p>The ID of the data quality monitor.</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("Id")
    public Long id;

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
     * <p>231263586109857423</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <p>The definition of execution parameters for the data quality monitor.</p>
     */
    @NameInMap("Parameters")
    public java.util.List<UpdateDataQualityScanRequestParameters> parameters;

    /**
     * <p>The ID of the DataWorks workspace where the data quality monitor resides. You can obtain the workspace ID by calling the <a href="https://help.aliyun.com/document_detail/2852607.html">ListProjects</a> operation.</p>
     * 
     * <strong>example:</strong>
     * <p>101</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The resource group used during the execution of the data quality monitor.</p>
     */
    @NameInMap("RuntimeResource")
    public UpdateDataQualityScanRequestRuntimeResource runtimeResource;

    /**
     * <p>The Spec code of the data quality monitoring content. For more information, see <a href="https://help.aliyun.com/document_detail/2963394.html">Data quality Spec configuration description</a>.</p>
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
     * <p>Trigger settings for the data quality monitor.</p>
     */
    @NameInMap("Trigger")
    public UpdateDataQualityScanRequestTrigger trigger;

    public static UpdateDataQualityScanRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataQualityScanRequest self = new UpdateDataQualityScanRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDataQualityScanRequest setComputeResource(UpdateDataQualityScanRequestComputeResource computeResource) {
        this.computeResource = computeResource;
        return this;
    }
    public UpdateDataQualityScanRequestComputeResource getComputeResource() {
        return this.computeResource;
    }

    public UpdateDataQualityScanRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateDataQualityScanRequest setHooks(java.util.List<UpdateDataQualityScanRequestHooks> hooks) {
        this.hooks = hooks;
        return this;
    }
    public java.util.List<UpdateDataQualityScanRequestHooks> getHooks() {
        return this.hooks;
    }

    public UpdateDataQualityScanRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateDataQualityScanRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateDataQualityScanRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public UpdateDataQualityScanRequest setParameters(java.util.List<UpdateDataQualityScanRequestParameters> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.List<UpdateDataQualityScanRequestParameters> getParameters() {
        return this.parameters;
    }

    public UpdateDataQualityScanRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public UpdateDataQualityScanRequest setRuntimeResource(UpdateDataQualityScanRequestRuntimeResource runtimeResource) {
        this.runtimeResource = runtimeResource;
        return this;
    }
    public UpdateDataQualityScanRequestRuntimeResource getRuntimeResource() {
        return this.runtimeResource;
    }

    public UpdateDataQualityScanRequest setSpec(String spec) {
        this.spec = spec;
        return this;
    }
    public String getSpec() {
        return this.spec;
    }

    public UpdateDataQualityScanRequest setTrigger(UpdateDataQualityScanRequestTrigger trigger) {
        this.trigger = trigger;
        return this;
    }
    public UpdateDataQualityScanRequestTrigger getTrigger() {
        return this.trigger;
    }

    public static class UpdateDataQualityScanRequestComputeResourceRuntime extends TeaModel {
        /**
         * <p>The engine type. These settings are only supported for the EMR compute engine.This setting? Valid values:</p>
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

        public static UpdateDataQualityScanRequestComputeResourceRuntime build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataQualityScanRequestComputeResourceRuntime self = new UpdateDataQualityScanRequestComputeResourceRuntime();
            return TeaModel.build(map, self);
        }

        public UpdateDataQualityScanRequestComputeResourceRuntime setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public UpdateDataQualityScanRequestComputeResourceRuntime setHiveConf(java.util.Map<String, ?> hiveConf) {
            this.hiveConf = hiveConf;
            return this;
        }
        public java.util.Map<String, ?> getHiveConf() {
            return this.hiveConf;
        }

        public UpdateDataQualityScanRequestComputeResourceRuntime setSparkConf(java.util.Map<String, ?> sparkConf) {
            this.sparkConf = sparkConf;
            return this;
        }
        public java.util.Map<String, ?> getSparkConf() {
            return this.sparkConf;
        }

    }

    public static class UpdateDataQualityScanRequestComputeResource extends TeaModel {
        /**
         * <p>Workspace environment of the compute engine. Valid values:</p>
         * <ul>
         * <li>Prod</li>
         * <li>Dev</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Prod</p>
         */
        @NameInMap("EnvType")
        public String envType;

        /**
         * <p>The name of the compute engine, which is a unique identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>auto_createAlertRule_Finished_1kUTk6</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Additional settings for the compute engine.</p>
         */
        @NameInMap("Runtime")
        public UpdateDataQualityScanRequestComputeResourceRuntime runtime;

        public static UpdateDataQualityScanRequestComputeResource build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataQualityScanRequestComputeResource self = new UpdateDataQualityScanRequestComputeResource();
            return TeaModel.build(map, self);
        }

        public UpdateDataQualityScanRequestComputeResource setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public UpdateDataQualityScanRequestComputeResource setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateDataQualityScanRequestComputeResource setRuntime(UpdateDataQualityScanRequestComputeResourceRuntime runtime) {
            this.runtime = runtime;
            return this;
        }
        public UpdateDataQualityScanRequestComputeResourceRuntime getRuntime() {
            return this.runtime;
        }

    }

    public static class UpdateDataQualityScanRequestHooks extends TeaModel {
        /**
         * <p>The hook trigger condition. When this condition is met, the hook is triggered. Valid expression format:</p>
         * <p>Specifies multiple combinations of rule severity levels and rule validation statuses, such as <code>results.any { r -&gt; r.status == \\&quot;Fail\\&quot; &amp;&amp; r.rule.severity == \\&quot;Normal\\&quot; || r.status == \\&quot;Error\\&quot; &amp;&amp; r.rule.severity == \\&quot;High\\&quot; || r.status == \\&quot;Warn\\&quot; &amp;&amp; r.rule.severity == \\&quot;High\\&quot; }</code>. This means the hook is triggered if any executed rule has Fail with Normal severity, Error with High severity, or Warn with High severity. The severity values must match those defined in the Spec. The status values must match those in DataQualityResult.</p>
         * 
         * <strong>example:</strong>
         * <p>results.any { r -&gt; r.status == \&quot;Fail\&quot; &amp;&amp; r.rule.severity == \&quot;Normal\&quot; || r.status == \&quot;Error\&quot; &amp;&amp; r.rule.severity == \&quot;High\&quot; || r.status == \&quot;Warn\&quot; &amp;&amp; r.rule.severity == \&quot;High\&quot; }</p>
         */
        @NameInMap("Condition")
        public String condition;

        /**
         * <p>The type of the hook. Valid values:</p>
         * <ul>
         * <li>BlockTaskInstance: Block the scheduling of the task instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BlockTaskInstance</p>
         */
        @NameInMap("Type")
        public String type;

        public static UpdateDataQualityScanRequestHooks build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataQualityScanRequestHooks self = new UpdateDataQualityScanRequestHooks();
            return TeaModel.build(map, self);
        }

        public UpdateDataQualityScanRequestHooks setCondition(String condition) {
            this.condition = condition;
            return this;
        }
        public String getCondition() {
            return this.condition;
        }

        public UpdateDataQualityScanRequestHooks setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateDataQualityScanRequestParameters extends TeaModel {
        /**
         * <p>The parameter name.</p>
         * 
         * <strong>example:</strong>
         * <p>temp_237669.zip_byBwm_1734661241752</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The parameter value.</p>
         * 
         * <strong>example:</strong>
         * <p>smtp.qiye.aliyun.com</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateDataQualityScanRequestParameters build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataQualityScanRequestParameters self = new UpdateDataQualityScanRequestParameters();
            return TeaModel.build(map, self);
        }

        public UpdateDataQualityScanRequestParameters setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateDataQualityScanRequestParameters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateDataQualityScanRequestRuntimeResource extends TeaModel {
        /**
         * <p>The default number of CUs configured for task running.</p>
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
         * <p>20315</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The image ID of the task runtime configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>i-xxxxxx</p>
         */
        @NameInMap("Image")
        public String image;

        public static UpdateDataQualityScanRequestRuntimeResource build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataQualityScanRequestRuntimeResource self = new UpdateDataQualityScanRequestRuntimeResource();
            return TeaModel.build(map, self);
        }

        public UpdateDataQualityScanRequestRuntimeResource setCu(Float cu) {
            this.cu = cu;
            return this;
        }
        public Float getCu() {
            return this.cu;
        }

        public UpdateDataQualityScanRequestRuntimeResource setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public UpdateDataQualityScanRequestRuntimeResource setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

    }

    public static class UpdateDataQualityScanRequestTrigger extends TeaModel {
        /**
         * <p>If the trigger mode is BySchedule, the ID of the scheduling task that triggers the monitor must be configured.</p>
         */
        @NameInMap("TaskIds")
        public java.util.List<Long> taskIds;

        /**
         * <p>The trigger mode of the data quality monitor. Valid values:</p>
         * <ul>
         * <li>ByManual: Manually triggered. Default setting.</li>
         * <li>BySchedule: Triggered by a scheduled task instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BySchedule</p>
         */
        @NameInMap("Type")
        public String type;

        public static UpdateDataQualityScanRequestTrigger build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataQualityScanRequestTrigger self = new UpdateDataQualityScanRequestTrigger();
            return TeaModel.build(map, self);
        }

        public UpdateDataQualityScanRequestTrigger setTaskIds(java.util.List<Long> taskIds) {
            this.taskIds = taskIds;
            return this;
        }
        public java.util.List<Long> getTaskIds() {
            return this.taskIds;
        }

        public UpdateDataQualityScanRequestTrigger setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
