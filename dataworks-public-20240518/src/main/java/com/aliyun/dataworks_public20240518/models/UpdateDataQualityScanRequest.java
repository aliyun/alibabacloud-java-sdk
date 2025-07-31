// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateDataQualityScanRequest extends TeaModel {
    @NameInMap("ComputeResource")
    public UpdateDataQualityScanRequestComputeResource computeResource;

    @NameInMap("Description")
    public String description;

    @NameInMap("Hooks")
    public java.util.List<UpdateDataQualityScanRequestHooks> hooks;

    /**
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <strong>example:</strong>
     * <p>data_quality_scan_001</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>231263586109857423</p>
     */
    @NameInMap("Owner")
    public String owner;

    @NameInMap("Parameters")
    public java.util.List<UpdateDataQualityScanRequestParameters> parameters;

    /**
     * <strong>example:</strong>
     * <p>101</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("RuntimeResource")
    public UpdateDataQualityScanRequestRuntimeResource runtimeResource;

    @NameInMap("Spec")
    public String spec;

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
         * <strong>example:</strong>
         * <p>Hive</p>
         */
        @NameInMap("Engine")
        public String engine;

        /**
         * <strong>example:</strong>
         * <p>mapreduce.job.queuename=dq_queue</p>
         */
        @NameInMap("HiveConf")
        public java.util.Map<String, ?> hiveConf;

        /**
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
         * <strong>example:</strong>
         * <p>Prod</p>
         */
        @NameInMap("EnvType")
        public String envType;

        /**
         * <strong>example:</strong>
         * <p>auto_createAlertRule_Finished_1kUTk6</p>
         */
        @NameInMap("Name")
        public String name;

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
         * <strong>example:</strong>
         * <p>results.any { r -&gt; r.status == \&quot;Fail\&quot; &amp;&amp; r.rule.severity == \&quot;Normal\&quot; || r.status == \&quot;Error\&quot; &amp;&amp; r.rule.severity == \&quot;High\&quot; || r.status == \&quot;Warn\&quot; &amp;&amp; r.rule.severity == \&quot;High\&quot; }</p>
         */
        @NameInMap("Condition")
        public String condition;

        /**
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
         * <strong>example:</strong>
         * <p>temp_237669.zip_byBwm_1734661241752</p>
         */
        @NameInMap("Name")
        public String name;

        /**
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
         * <strong>example:</strong>
         * <p>0.25</p>
         */
        @NameInMap("Cu")
        public Float cu;

        /**
         * <strong>example:</strong>
         * <p>20315</p>
         */
        @NameInMap("Id")
        public String id;

        /**
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
        @NameInMap("TaskIds")
        public java.util.List<Long> taskIds;

        /**
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
