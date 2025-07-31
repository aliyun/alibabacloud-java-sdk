// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListDataQualityScansResponseBody extends TeaModel {
    @NameInMap("PageInfo")
    public ListDataQualityScansResponseBodyPageInfo pageInfo;

    /**
     * <strong>example:</strong>
     * <p>0bc14115***159376359</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListDataQualityScansResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataQualityScansResponseBody self = new ListDataQualityScansResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataQualityScansResponseBody setPageInfo(ListDataQualityScansResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public ListDataQualityScansResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public ListDataQualityScansResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListDataQualityScansResponseBodyPageInfoDataQualityScansComputeResourceRuntime extends TeaModel {
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
        public String hiveConf;

        /**
         * <strong>example:</strong>
         * <p>spark.yarn.queue=dq_queue</p>
         */
        @NameInMap("SparkConf")
        public String sparkConf;

        public static ListDataQualityScansResponseBodyPageInfoDataQualityScansComputeResourceRuntime build(java.util.Map<String, ?> map) throws Exception {
            ListDataQualityScansResponseBodyPageInfoDataQualityScansComputeResourceRuntime self = new ListDataQualityScansResponseBodyPageInfoDataQualityScansComputeResourceRuntime();
            return TeaModel.build(map, self);
        }

        public ListDataQualityScansResponseBodyPageInfoDataQualityScansComputeResourceRuntime setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public ListDataQualityScansResponseBodyPageInfoDataQualityScansComputeResourceRuntime setHiveConf(String hiveConf) {
            this.hiveConf = hiveConf;
            return this;
        }
        public String getHiveConf() {
            return this.hiveConf;
        }

        public ListDataQualityScansResponseBodyPageInfoDataQualityScansComputeResourceRuntime setSparkConf(String sparkConf) {
            this.sparkConf = sparkConf;
            return this;
        }
        public String getSparkConf() {
            return this.sparkConf;
        }

    }

    public static class ListDataQualityScansResponseBodyPageInfoDataQualityScansComputeResource extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Prod</p>
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
        public ListDataQualityScansResponseBodyPageInfoDataQualityScansComputeResourceRuntime runtime;

        public static ListDataQualityScansResponseBodyPageInfoDataQualityScansComputeResource build(java.util.Map<String, ?> map) throws Exception {
            ListDataQualityScansResponseBodyPageInfoDataQualityScansComputeResource self = new ListDataQualityScansResponseBodyPageInfoDataQualityScansComputeResource();
            return TeaModel.build(map, self);
        }

        public ListDataQualityScansResponseBodyPageInfoDataQualityScansComputeResource setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public ListDataQualityScansResponseBodyPageInfoDataQualityScansComputeResource setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDataQualityScansResponseBodyPageInfoDataQualityScansComputeResource setRuntime(ListDataQualityScansResponseBodyPageInfoDataQualityScansComputeResourceRuntime runtime) {
            this.runtime = runtime;
            return this;
        }
        public ListDataQualityScansResponseBodyPageInfoDataQualityScansComputeResourceRuntime getRuntime() {
            return this.runtime;
        }

    }

    public static class ListDataQualityScansResponseBodyPageInfoDataQualityScansHooks extends TeaModel {
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

        public static ListDataQualityScansResponseBodyPageInfoDataQualityScansHooks build(java.util.Map<String, ?> map) throws Exception {
            ListDataQualityScansResponseBodyPageInfoDataQualityScansHooks self = new ListDataQualityScansResponseBodyPageInfoDataQualityScansHooks();
            return TeaModel.build(map, self);
        }

        public ListDataQualityScansResponseBodyPageInfoDataQualityScansHooks setCondition(String condition) {
            this.condition = condition;
            return this;
        }
        public String getCondition() {
            return this.condition;
        }

        public ListDataQualityScansResponseBodyPageInfoDataQualityScansHooks setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListDataQualityScansResponseBodyPageInfoDataQualityScansParameters extends TeaModel {
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

        public static ListDataQualityScansResponseBodyPageInfoDataQualityScansParameters build(java.util.Map<String, ?> map) throws Exception {
            ListDataQualityScansResponseBodyPageInfoDataQualityScansParameters self = new ListDataQualityScansResponseBodyPageInfoDataQualityScansParameters();
            return TeaModel.build(map, self);
        }

        public ListDataQualityScansResponseBodyPageInfoDataQualityScansParameters setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDataQualityScansResponseBodyPageInfoDataQualityScansParameters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListDataQualityScansResponseBodyPageInfoDataQualityScansRuntimeResource extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0.25</p>
         */
        @NameInMap("Cu")
        public Float cu;

        /**
         * <strong>example:</strong>
         * <p>Serverless_resource_group_xxxxx</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>i-xxxxx</p>
         */
        @NameInMap("Image")
        public String image;

        public static ListDataQualityScansResponseBodyPageInfoDataQualityScansRuntimeResource build(java.util.Map<String, ?> map) throws Exception {
            ListDataQualityScansResponseBodyPageInfoDataQualityScansRuntimeResource self = new ListDataQualityScansResponseBodyPageInfoDataQualityScansRuntimeResource();
            return TeaModel.build(map, self);
        }

        public ListDataQualityScansResponseBodyPageInfoDataQualityScansRuntimeResource setCu(Float cu) {
            this.cu = cu;
            return this;
        }
        public Float getCu() {
            return this.cu;
        }

        public ListDataQualityScansResponseBodyPageInfoDataQualityScansRuntimeResource setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListDataQualityScansResponseBodyPageInfoDataQualityScansRuntimeResource setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

    }

    public static class ListDataQualityScansResponseBodyPageInfoDataQualityScansTrigger extends TeaModel {
        @NameInMap("TaskIds")
        public java.util.List<Long> taskIds;

        /**
         * <strong>example:</strong>
         * <p>BySchedule</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListDataQualityScansResponseBodyPageInfoDataQualityScansTrigger build(java.util.Map<String, ?> map) throws Exception {
            ListDataQualityScansResponseBodyPageInfoDataQualityScansTrigger self = new ListDataQualityScansResponseBodyPageInfoDataQualityScansTrigger();
            return TeaModel.build(map, self);
        }

        public ListDataQualityScansResponseBodyPageInfoDataQualityScansTrigger setTaskIds(java.util.List<Long> taskIds) {
            this.taskIds = taskIds;
            return this;
        }
        public java.util.List<Long> getTaskIds() {
            return this.taskIds;
        }

        public ListDataQualityScansResponseBodyPageInfoDataQualityScansTrigger setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListDataQualityScansResponseBodyPageInfoDataQualityScans extends TeaModel {
        @NameInMap("ComputeResource")
        public ListDataQualityScansResponseBodyPageInfoDataQualityScansComputeResource computeResource;

        /**
         * <strong>example:</strong>
         * <p>1694512304000</p>
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
        public java.util.List<ListDataQualityScansResponseBodyPageInfoDataQualityScansHooks> hooks;

        /**
         * <strong>example:</strong>
         * <p>26433</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>17236236472</p>
         */
        @NameInMap("ModifyTime")
        public Long modifyTime;

        /**
         * <strong>example:</strong>
         * <p>23782382795249</p>
         */
        @NameInMap("ModifyUser")
        public String modifyUser;

        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>23782382795249</p>
         */
        @NameInMap("Owner")
        public String owner;

        @NameInMap("Parameters")
        public java.util.List<ListDataQualityScansResponseBodyPageInfoDataQualityScansParameters> parameters;

        /**
         * <strong>example:</strong>
         * <p>59094</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("RuntimeResource")
        public ListDataQualityScansResponseBodyPageInfoDataQualityScansRuntimeResource runtimeResource;

        @NameInMap("Trigger")
        public ListDataQualityScansResponseBodyPageInfoDataQualityScansTrigger trigger;

        public static ListDataQualityScansResponseBodyPageInfoDataQualityScans build(java.util.Map<String, ?> map) throws Exception {
            ListDataQualityScansResponseBodyPageInfoDataQualityScans self = new ListDataQualityScansResponseBodyPageInfoDataQualityScans();
            return TeaModel.build(map, self);
        }

        public ListDataQualityScansResponseBodyPageInfoDataQualityScans setComputeResource(ListDataQualityScansResponseBodyPageInfoDataQualityScansComputeResource computeResource) {
            this.computeResource = computeResource;
            return this;
        }
        public ListDataQualityScansResponseBodyPageInfoDataQualityScansComputeResource getComputeResource() {
            return this.computeResource;
        }

        public ListDataQualityScansResponseBodyPageInfoDataQualityScans setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListDataQualityScansResponseBodyPageInfoDataQualityScans setCreateUser(String createUser) {
            this.createUser = createUser;
            return this;
        }
        public String getCreateUser() {
            return this.createUser;
        }

        public ListDataQualityScansResponseBodyPageInfoDataQualityScans setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListDataQualityScansResponseBodyPageInfoDataQualityScans setHooks(java.util.List<ListDataQualityScansResponseBodyPageInfoDataQualityScansHooks> hooks) {
            this.hooks = hooks;
            return this;
        }
        public java.util.List<ListDataQualityScansResponseBodyPageInfoDataQualityScansHooks> getHooks() {
            return this.hooks;
        }

        public ListDataQualityScansResponseBodyPageInfoDataQualityScans setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListDataQualityScansResponseBodyPageInfoDataQualityScans setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public ListDataQualityScansResponseBodyPageInfoDataQualityScans setModifyUser(String modifyUser) {
            this.modifyUser = modifyUser;
            return this;
        }
        public String getModifyUser() {
            return this.modifyUser;
        }

        public ListDataQualityScansResponseBodyPageInfoDataQualityScans setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDataQualityScansResponseBodyPageInfoDataQualityScans setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ListDataQualityScansResponseBodyPageInfoDataQualityScans setParameters(java.util.List<ListDataQualityScansResponseBodyPageInfoDataQualityScansParameters> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.List<ListDataQualityScansResponseBodyPageInfoDataQualityScansParameters> getParameters() {
            return this.parameters;
        }

        public ListDataQualityScansResponseBodyPageInfoDataQualityScans setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListDataQualityScansResponseBodyPageInfoDataQualityScans setRuntimeResource(ListDataQualityScansResponseBodyPageInfoDataQualityScansRuntimeResource runtimeResource) {
            this.runtimeResource = runtimeResource;
            return this;
        }
        public ListDataQualityScansResponseBodyPageInfoDataQualityScansRuntimeResource getRuntimeResource() {
            return this.runtimeResource;
        }

        public ListDataQualityScansResponseBodyPageInfoDataQualityScans setTrigger(ListDataQualityScansResponseBodyPageInfoDataQualityScansTrigger trigger) {
            this.trigger = trigger;
            return this;
        }
        public ListDataQualityScansResponseBodyPageInfoDataQualityScansTrigger getTrigger() {
            return this.trigger;
        }

    }

    public static class ListDataQualityScansResponseBodyPageInfo extends TeaModel {
        @NameInMap("DataQualityScans")
        public java.util.List<ListDataQualityScansResponseBodyPageInfoDataQualityScans> dataQualityScans;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListDataQualityScansResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            ListDataQualityScansResponseBodyPageInfo self = new ListDataQualityScansResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public ListDataQualityScansResponseBodyPageInfo setDataQualityScans(java.util.List<ListDataQualityScansResponseBodyPageInfoDataQualityScans> dataQualityScans) {
            this.dataQualityScans = dataQualityScans;
            return this;
        }
        public java.util.List<ListDataQualityScansResponseBodyPageInfoDataQualityScans> getDataQualityScans() {
            return this.dataQualityScans;
        }

        public ListDataQualityScansResponseBodyPageInfo setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListDataQualityScansResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListDataQualityScansResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
