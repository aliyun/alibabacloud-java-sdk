// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateDataQualityScanRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a-customized-uuid</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("ComputeResource")
    public CreateDataQualityScanRequestComputeResource computeResource;

    @NameInMap("Description")
    public String description;

    @NameInMap("Hooks")
    public java.util.List<CreateDataQualityScanRequestHooks> hooks;

    /**
     * <strong>example:</strong>
     * <p>data_quality_scan_001</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>95279527****</p>
     */
    @NameInMap("Owner")
    public String owner;

    @NameInMap("Parameters")
    public java.util.List<CreateDataQualityScanRequestParameters> parameters;

    /**
     * <strong>example:</strong>
     * <p>101</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("RuntimeResource")
    public CreateDataQualityScanRequestRuntimeResource runtimeResource;

    @NameInMap("Spec")
    public String spec;

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
         * <strong>example:</strong>
         * <p>Dev</p>
         */
        @NameInMap("EnvType")
        public String envType;

        /**
         * <strong>example:</strong>
         * <p>emr_first</p>
         */
        @NameInMap("Name")
        public String name;

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
         * <strong>example:</strong>
         * <p>triggerTime</p>
         */
        @NameInMap("Name")
        public String name;

        /**
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
         * <strong>example:</strong>
         * <p>0.25</p>
         */
        @NameInMap("Cu")
        public Float cu;

        /**
         * <strong>example:</strong>
         * <p>0525242e-d0ee-4bda-bc73-765d82f6a34a</p>
         */
        @NameInMap("Id")
        public String id;

        /**
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
        @NameInMap("TaskIds")
        public java.util.List<Long> taskIds;

        /**
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
