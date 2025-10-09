// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetDataQualityScanResponseBody extends TeaModel {
    /**
     * <p>Data quality monitoring details.</p>
     */
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
         * <p>The workspace environment to which the compute engine belongs.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Prod: production environment .</li>
         * <li>Dev: development environment.</li>
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
         * <p>polardb_to_holo</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>More settings for data quality monitor at runtime.</p>
         */
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
         * <p>The Hook trigger condition. The hook will run if the condition is met. Currently, only one type of expression syntax is supported:</p>
         * <ul>
         * <li>You can specify multiple combinations of rule severity levels and validation statuses using an expression such as <code>results.any { r -&gt; r.status == \\&quot;Fail\\&quot; &amp;&amp; r.rule.severity == \\&quot;Normal\\&quot; || r.status == \\&quot;Error\\&quot; &amp;&amp; r.rule.severity == \\&quot;High\\&quot; || r.status == \\&quot;Warn\\&quot; &amp;&amp; r.rule.severity == \\&quot;High\\&quot; }</code>. This expression means the condition is met if any executed rule has a result of Fail with severity Normal, Error with severity High, or Warn with severity High. In the condition expression, the values of severity and status are predefined enums. The values of severity must match those defined in the Spec, and the values of status must match those in DataQualityResult.</li>
         * </ul>
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
         * <li>BlockTaskInstance: BlockTaskInstance: Blocks the scheduling of the task instance.</li>
         * </ul>
         * 
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
         * <p>The parameter value.</p>
         * 
         * <strong>example:</strong>
         * <p>e2e_autolabel</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The parameter name.</p>
         * 
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
         * <p>Reserved compute units (CU) for the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Cu")
        public Float cu;

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>122878</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The image ID used in the runtime configuration.</p>
         * 
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
        /**
         * <p>The compute engine used at runtime. Optional. If not specified, the data source defined in the Spec is used.</p>
         */
        @NameInMap("ComputeResource")
        public GetDataQualityScanResponseBodyDataQualityScanComputeResource computeResource;

        /**
         * <p>The creation time of the data quality monitor.</p>
         * 
         * <strong>example:</strong>
         * <p>1731550150000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The ID of the user who creates the data quality monitor.</p>
         * 
         * <strong>example:</strong>
         * <p>2374924198591250</p>
         */
        @NameInMap("CreateUser")
        public String createUser;

        /**
         * <p>The data quality monitor description.</p>
         * 
         * <strong>example:</strong>
         * <p>aily data quality scanning of ods tables.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The Hook configurations after the data quality monitoring run ends.</p>
         */
        @NameInMap("Hooks")
        public java.util.List<GetDataQualityScanResponseBodyDataQualityScanHooks> hooks;

        /**
         * <p>The data quality monitoring ID.</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>Last modified time of the data quality monitor.</p>
         * 
         * <strong>example:</strong>
         * <p>1731550150000</p>
         */
        @NameInMap("ModifyTime")
        public Long modifyTime;

        /**
         * <p>The ID of the user who last modifies the data quality monitor.</p>
         * 
         * <strong>example:</strong>
         * <p>23482597582479</p>
         */
        @NameInMap("ModifyUser")
        public String modifyUser;

        /**
         * <p>The data quality monitor name.</p>
         * 
         * <strong>example:</strong>
         * <p>data_quality_scan_001</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the user who owns the data quality monitor.</p>
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
        public java.util.List<GetDataQualityScanResponseBodyDataQualityScanParameters> parameters;

        /**
         * <p>The workspace ID where the data quality monitor resides. You can obtain the workspace ID by calling the <a href="https://help.aliyun.com/document_detail/2780068.html">ListProjects</a> operation.</p>
         * 
         * <strong>example:</strong>
         * <p>101</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The resource group used during the running of the data quality monitor.</p>
         */
        @NameInMap("RuntimeResource")
        public GetDataQualityScanResponseBodyDataQualityScanRuntimeResource runtimeResource;

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
