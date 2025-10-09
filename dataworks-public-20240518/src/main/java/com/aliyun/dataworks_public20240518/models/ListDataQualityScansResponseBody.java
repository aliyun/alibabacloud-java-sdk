// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListDataQualityScansResponseBody extends TeaModel {
    /**
     * <p>The page information.</p>
     */
    @NameInMap("PageInfo")
    public ListDataQualityScansResponseBodyPageInfo pageInfo;

    /**
     * <p>The API request ID, which is generated as a UUID.</p>
     * 
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
         * <p>The engine type. These settings are only supported for the EMR compute engine. Valid values:</p>
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
         * <p>Additional parameters for the Hive engine. Currently, only mapreduce.job.queuename is supported to set the queue.</p>
         * 
         * <strong>example:</strong>
         * <p>mapreduce.job.queuename=dq_queue</p>
         */
        @NameInMap("HiveConf")
        public String hiveConf;

        /**
         * <p>Additional parameters for the Spark engine. Currently, only spark.yarn.queue is supported to set the queue.</p>
         * 
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
         * <p>The name of the computing engine. Uniquely identifies the engine.</p>
         * 
         * <strong>example:</strong>
         * <p>emr_cluster_001</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Additional runtime settings for the data quality monitor.</p>
         */
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
         * <li>BlockTaskInstance: Blocks the scheduling of the task instance.</li>
         * </ul>
         * 
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
         * <p>CU consumption for task running.</p>
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
         * <p>Serverless_resource_group_xxxxx</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The ID of the image configured for task running.</p>
         * 
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
        /**
         * <p>The compute engine used during execution. If it is not specified, the data source connection defined in the Spec will be used.</p>
         */
        @NameInMap("ComputeResource")
        public ListDataQualityScansResponseBodyPageInfoDataQualityScansComputeResource computeResource;

        /**
         * <p>The creation time of the data quality monitor.</p>
         * 
         * <strong>example:</strong>
         * <p>1694512304000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The creator of the data quality monitor.</p>
         * 
         * <strong>example:</strong>
         * <p>7892346529452</p>
         */
        @NameInMap("CreateUser")
        public String createUser;

        /**
         * <p>The description of the data quality scan task. Maximum length: 65,535 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>This is a hourly run data quality evaluation plan.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The hook configuration after the data quality monitor stops.</p>
         */
        @NameInMap("Hooks")
        public java.util.List<ListDataQualityScansResponseBodyPageInfoDataQualityScansHooks> hooks;

        /**
         * <p>The ID of the data quality monitor.</p>
         * 
         * <strong>example:</strong>
         * <p>26433</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>Last update time of the data quality monitor.</p>
         * 
         * <strong>example:</strong>
         * <p>17236236472</p>
         */
        @NameInMap("ModifyTime")
        public Long modifyTime;

        /**
         * <p>The user ID of the last person who updated the data quality monitor.</p>
         * 
         * <strong>example:</strong>
         * <p>23782382795249</p>
         */
        @NameInMap("ModifyUser")
        public String modifyUser;

        /**
         * <p>The name of the data quality scan task. Can include digits, letters, Chinese characters, and both half-width and full-width punctuation marks. Maximum length: 255 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>Hourly partition quality monitoring</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The user ID of the owner responsible for the data quality monitor.</p>
         * 
         * <strong>example:</strong>
         * <p>23782382795249</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>Execution parameter definitions for the data quality monitor.</p>
         */
        @NameInMap("Parameters")
        public java.util.List<ListDataQualityScansResponseBodyPageInfoDataQualityScansParameters> parameters;

        /**
         * <p>The project ID.</p>
         * 
         * <strong>example:</strong>
         * <p>59094</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The resource group used during the execution of the data quality monitor.</p>
         */
        @NameInMap("RuntimeResource")
        public ListDataQualityScansResponseBodyPageInfoDataQualityScansRuntimeResource runtimeResource;

        /**
         * <p>Trigger settings for the data quality monitor.</p>
         */
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
        /**
         * <p>The list of data quality monitors.</p>
         */
        @NameInMap("DataQualityScans")
        public java.util.List<ListDataQualityScansResponseBodyPageInfoDataQualityScans> dataQualityScans;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of records per page. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of records returned.</p>
         * 
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
