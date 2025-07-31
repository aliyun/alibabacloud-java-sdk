// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetDataQualityScanRunResponseBody extends TeaModel {
    @NameInMap("DataQualityScanRun")
    public GetDataQualityScanRunResponseBodyDataQualityScanRun dataQualityScanRun;

    /**
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
         * <strong>example:</strong>
         * <p>dt</p>
         */
        @NameInMap("Name")
        public String name;

        /**
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
         * <strong>example:</strong>
         * <p>100.0</p>
         */
        @NameInMap("CheckValue")
        public String checkValue;

        /**
         * <strong>example:</strong>
         * <p>0.0</p>
         */
        @NameInMap("ReferenceValue")
        public String referenceValue;

        /**
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
         * <strong>example:</strong>
         * <p>1725506795000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("Details")
        public java.util.List<GetDataQualityScanRunResponseBodyDataQualityScanRunResultsDetails> details;

        @NameInMap("Rule")
        public String rule;

        /**
         * <strong>example:</strong>
         * <p>{
         *   &quot;value&quot;: &quot;100.0&quot;
         * }</p>
         */
        @NameInMap("Sample")
        public String sample;

        /**
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
         * <strong>example:</strong>
         * <p>Dev</p>
         */
        @NameInMap("EnvType")
        public String envType;

        /**
         * <strong>example:</strong>
         * <p>emr_cluster_001</p>
         */
        @NameInMap("Name")
        public String name;

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
         * <strong>example:</strong>
         * <p>results.any { r -&gt; r.status == \&quot;fail\&quot; &amp;&amp; r.rule.severity == \&quot;High\&quot; }</p>
         */
        @NameInMap("Condition")
        public String condition;

        /**
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
         * <strong>example:</strong>
         * <p>dt</p>
         */
        @NameInMap("Name")
        public String name;

        /**
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
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Cu")
        public Float cu;

        /**
         * <strong>example:</strong>
         * <p>60597</p>
         */
        @NameInMap("Id")
        public String id;

        /**
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
        @NameInMap("TaskIds")
        public java.util.List<Long> taskIds;

        /**
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
        @NameInMap("ComputeResource")
        public GetDataQualityScanRunResponseBodyDataQualityScanRunScanComputeResource computeResource;

        /**
         * <strong>example:</strong>
         * <p>1706247622000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <strong>example:</strong>
         * <p>7892346529452</p>
         */
        @NameInMap("CreateUser")
        public String createUser;

        /**
         * <strong>example:</strong>
         * <p>This is a hourly run data quality evaluation plan.</p>
         */
        @NameInMap("Description")
        public String description;

        @NameInMap("Hooks")
        public java.util.List<GetDataQualityScanRunResponseBodyDataQualityScanRunScanHooks> hooks;

        /**
         * <strong>example:</strong>
         * <p>21077</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>1706247622000</p>
         */
        @NameInMap("ModifyTime")
        public Long modifyTime;

        /**
         * <strong>example:</strong>
         * <p>7892346529452</p>
         */
        @NameInMap("ModifyUser")
        public String modifyUser;

        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>7892346529452</p>
         */
        @NameInMap("Owner")
        public String owner;

        @NameInMap("Parameters")
        public java.util.List<GetDataQualityScanRunResponseBodyDataQualityScanRunScanParameters> parameters;

        /**
         * <strong>example:</strong>
         * <p>164024</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("RuntimeResource")
        public GetDataQualityScanRunResponseBodyDataQualityScanRunScanRuntimeResource runtimeResource;

        @NameInMap("Spec")
        public String spec;

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
         * <strong>example:</strong>
         * <p>1706247622000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <strong>example:</strong>
         * <p>1706247622000</p>
         */
        @NameInMap("FinishTime")
        public Long finishTime;

        /**
         * <strong>example:</strong>
         * <p>1016440997</p>
         */
        @NameInMap("Id")
        public Long id;

        @NameInMap("Parameters")
        public java.util.List<GetDataQualityScanRunResponseBodyDataQualityScanRunParameters> parameters;

        @NameInMap("Results")
        public java.util.List<GetDataQualityScanRunResponseBodyDataQualityScanRunResults> results;

        @NameInMap("Scan")
        public GetDataQualityScanRunResponseBodyDataQualityScanRunScan scan;

        /**
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
