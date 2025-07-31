// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetDataQualityScanResponseBody extends TeaModel {
    @NameInMap("DataQualityScan")
    public GetDataQualityScanResponseBodyDataQualityScan dataQualityScan;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>204EAF68-CCE3-5112-8DA0-E7A60F02XXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetDataQualityScanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDataQualityScanResponseBody self = new GetDataQualityScanResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDataQualityScanResponseBody setDataQualityScan(GetDataQualityScanResponseBodyDataQualityScan dataQualityScan) {
        this.dataQualityScan = dataQualityScan;
        return this;
    }
    public GetDataQualityScanResponseBodyDataQualityScan getDataQualityScan() {
        return this.dataQualityScan;
    }

    public GetDataQualityScanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDataQualityScanResponseBodyDataQualityScanComputeResourceRuntime extends TeaModel {
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

        public static GetDataQualityScanResponseBodyDataQualityScanComputeResourceRuntime build(java.util.Map<String, ?> map) throws Exception {
            GetDataQualityScanResponseBodyDataQualityScanComputeResourceRuntime self = new GetDataQualityScanResponseBodyDataQualityScanComputeResourceRuntime();
            return TeaModel.build(map, self);
        }

        public GetDataQualityScanResponseBodyDataQualityScanComputeResourceRuntime setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public GetDataQualityScanResponseBodyDataQualityScanComputeResourceRuntime setHiveConf(java.util.Map<String, ?> hiveConf) {
            this.hiveConf = hiveConf;
            return this;
        }
        public java.util.Map<String, ?> getHiveConf() {
            return this.hiveConf;
        }

        public GetDataQualityScanResponseBodyDataQualityScanComputeResourceRuntime setSparkConf(java.util.Map<String, ?> sparkConf) {
            this.sparkConf = sparkConf;
            return this;
        }
        public java.util.Map<String, ?> getSparkConf() {
            return this.sparkConf;
        }

    }

    public static class GetDataQualityScanResponseBodyDataQualityScanComputeResource extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Prod</p>
         */
        @NameInMap("EnvType")
        public String envType;

        /**
         * <strong>example:</strong>
         * <p>polardb_to_holo</p>
         */
        @NameInMap("Name")
        public String name;

        @NameInMap("Runtime")
        public GetDataQualityScanResponseBodyDataQualityScanComputeResourceRuntime runtime;

        public static GetDataQualityScanResponseBodyDataQualityScanComputeResource build(java.util.Map<String, ?> map) throws Exception {
            GetDataQualityScanResponseBodyDataQualityScanComputeResource self = new GetDataQualityScanResponseBodyDataQualityScanComputeResource();
            return TeaModel.build(map, self);
        }

        public GetDataQualityScanResponseBodyDataQualityScanComputeResource setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public GetDataQualityScanResponseBodyDataQualityScanComputeResource setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetDataQualityScanResponseBodyDataQualityScanComputeResource setRuntime(GetDataQualityScanResponseBodyDataQualityScanComputeResourceRuntime runtime) {
            this.runtime = runtime;
            return this;
        }
        public GetDataQualityScanResponseBodyDataQualityScanComputeResourceRuntime getRuntime() {
            return this.runtime;
        }

    }

    public static class GetDataQualityScanResponseBodyDataQualityScanHooks extends TeaModel {
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

        public static GetDataQualityScanResponseBodyDataQualityScanHooks build(java.util.Map<String, ?> map) throws Exception {
            GetDataQualityScanResponseBodyDataQualityScanHooks self = new GetDataQualityScanResponseBodyDataQualityScanHooks();
            return TeaModel.build(map, self);
        }

        public GetDataQualityScanResponseBodyDataQualityScanHooks setCondition(String condition) {
            this.condition = condition;
            return this;
        }
        public String getCondition() {
            return this.condition;
        }

        public GetDataQualityScanResponseBodyDataQualityScanHooks setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetDataQualityScanResponseBodyDataQualityScanParameters extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>e2e_autolabel</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetDataQualityScanResponseBodyDataQualityScanParameters build(java.util.Map<String, ?> map) throws Exception {
            GetDataQualityScanResponseBodyDataQualityScanParameters self = new GetDataQualityScanResponseBodyDataQualityScanParameters();
            return TeaModel.build(map, self);
        }

        public GetDataQualityScanResponseBodyDataQualityScanParameters setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetDataQualityScanResponseBodyDataQualityScanParameters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetDataQualityScanResponseBodyDataQualityScanRuntimeResource extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Cu")
        public Float cu;

        /**
         * <strong>example:</strong>
         * <p>122878</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>hp-tlp-e2e-repo-registry-vpc.cn-heyuan-acdr-1.cr.aliyuncs.com/hp-service/worker:9b28b6d-202506091008</p>
         */
        @NameInMap("Image")
        public String image;

        public static GetDataQualityScanResponseBodyDataQualityScanRuntimeResource build(java.util.Map<String, ?> map) throws Exception {
            GetDataQualityScanResponseBodyDataQualityScanRuntimeResource self = new GetDataQualityScanResponseBodyDataQualityScanRuntimeResource();
            return TeaModel.build(map, self);
        }

        public GetDataQualityScanResponseBodyDataQualityScanRuntimeResource setCu(Float cu) {
            this.cu = cu;
            return this;
        }
        public Float getCu() {
            return this.cu;
        }

        public GetDataQualityScanResponseBodyDataQualityScanRuntimeResource setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetDataQualityScanResponseBodyDataQualityScanRuntimeResource setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

    }

    public static class GetDataQualityScanResponseBodyDataQualityScanTrigger extends TeaModel {
        @NameInMap("TaskIds")
        public java.util.List<Long> taskIds;

        /**
         * <strong>example:</strong>
         * <p>BySchedule</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetDataQualityScanResponseBodyDataQualityScanTrigger build(java.util.Map<String, ?> map) throws Exception {
            GetDataQualityScanResponseBodyDataQualityScanTrigger self = new GetDataQualityScanResponseBodyDataQualityScanTrigger();
            return TeaModel.build(map, self);
        }

        public GetDataQualityScanResponseBodyDataQualityScanTrigger setTaskIds(java.util.List<Long> taskIds) {
            this.taskIds = taskIds;
            return this;
        }
        public java.util.List<Long> getTaskIds() {
            return this.taskIds;
        }

        public GetDataQualityScanResponseBodyDataQualityScanTrigger setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetDataQualityScanResponseBodyDataQualityScan extends TeaModel {
        @NameInMap("ComputeResource")
        public GetDataQualityScanResponseBodyDataQualityScanComputeResource computeResource;

        /**
         * <strong>example:</strong>
         * <p>1731550150000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <strong>example:</strong>
         * <p>2374924198591250</p>
         */
        @NameInMap("CreateUser")
        public String createUser;

        @NameInMap("Description")
        public String description;

        @NameInMap("Hooks")
        public java.util.List<GetDataQualityScanResponseBodyDataQualityScanHooks> hooks;

        /**
         * <strong>example:</strong>
         * <p>10001</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>1731550150000</p>
         */
        @NameInMap("ModifyTime")
        public Long modifyTime;

        /**
         * <strong>example:</strong>
         * <p>23482597582479</p>
         */
        @NameInMap("ModifyUser")
        public String modifyUser;

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
        public java.util.List<GetDataQualityScanResponseBodyDataQualityScanParameters> parameters;

        /**
         * <strong>example:</strong>
         * <p>101</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("RuntimeResource")
        public GetDataQualityScanResponseBodyDataQualityScanRuntimeResource runtimeResource;

        @NameInMap("Spec")
        public String spec;

        @NameInMap("Trigger")
        public GetDataQualityScanResponseBodyDataQualityScanTrigger trigger;

        public static GetDataQualityScanResponseBodyDataQualityScan build(java.util.Map<String, ?> map) throws Exception {
            GetDataQualityScanResponseBodyDataQualityScan self = new GetDataQualityScanResponseBodyDataQualityScan();
            return TeaModel.build(map, self);
        }

        public GetDataQualityScanResponseBodyDataQualityScan setComputeResource(GetDataQualityScanResponseBodyDataQualityScanComputeResource computeResource) {
            this.computeResource = computeResource;
            return this;
        }
        public GetDataQualityScanResponseBodyDataQualityScanComputeResource getComputeResource() {
            return this.computeResource;
        }

        public GetDataQualityScanResponseBodyDataQualityScan setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetDataQualityScanResponseBodyDataQualityScan setCreateUser(String createUser) {
            this.createUser = createUser;
            return this;
        }
        public String getCreateUser() {
            return this.createUser;
        }

        public GetDataQualityScanResponseBodyDataQualityScan setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetDataQualityScanResponseBodyDataQualityScan setHooks(java.util.List<GetDataQualityScanResponseBodyDataQualityScanHooks> hooks) {
            this.hooks = hooks;
            return this;
        }
        public java.util.List<GetDataQualityScanResponseBodyDataQualityScanHooks> getHooks() {
            return this.hooks;
        }

        public GetDataQualityScanResponseBodyDataQualityScan setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetDataQualityScanResponseBodyDataQualityScan setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public GetDataQualityScanResponseBodyDataQualityScan setModifyUser(String modifyUser) {
            this.modifyUser = modifyUser;
            return this;
        }
        public String getModifyUser() {
            return this.modifyUser;
        }

        public GetDataQualityScanResponseBodyDataQualityScan setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetDataQualityScanResponseBodyDataQualityScan setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetDataQualityScanResponseBodyDataQualityScan setParameters(java.util.List<GetDataQualityScanResponseBodyDataQualityScanParameters> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.List<GetDataQualityScanResponseBodyDataQualityScanParameters> getParameters() {
            return this.parameters;
        }

        public GetDataQualityScanResponseBodyDataQualityScan setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetDataQualityScanResponseBodyDataQualityScan setRuntimeResource(GetDataQualityScanResponseBodyDataQualityScanRuntimeResource runtimeResource) {
            this.runtimeResource = runtimeResource;
            return this;
        }
        public GetDataQualityScanResponseBodyDataQualityScanRuntimeResource getRuntimeResource() {
            return this.runtimeResource;
        }

        public GetDataQualityScanResponseBodyDataQualityScan setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

        public GetDataQualityScanResponseBodyDataQualityScan setTrigger(GetDataQualityScanResponseBodyDataQualityScanTrigger trigger) {
            this.trigger = trigger;
            return this;
        }
        public GetDataQualityScanResponseBodyDataQualityScanTrigger getTrigger() {
            return this.trigger;
        }

    }

}
