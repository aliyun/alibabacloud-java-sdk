// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetInstanceInspectionsResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The details.</p>
     */
    @NameInMap("Data")
    public GetInstanceInspectionsResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * <blockquote>
     * <p> If the request was successful, Successful is returned. If the request failed, an error message such as an error code is returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B6D17591-B48B-4D31-9CD6-9B9796B2****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static GetInstanceInspectionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceInspectionsResponseBody self = new GetInstanceInspectionsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceInspectionsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetInstanceInspectionsResponseBody setData(GetInstanceInspectionsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetInstanceInspectionsResponseBodyData getData() {
        return this.data;
    }

    public GetInstanceInspectionsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetInstanceInspectionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetInstanceInspectionsResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class GetInstanceInspectionsResponseBodyDataListAutoFunction extends TeaModel {
        /**
         * <p>Indicates whether the feature of automatically creating and deleting indexes is enabled. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: disabled.</li>
         * <li><strong>1</strong>: enabled.</li>
         * <li><strong>2</strong>: not supported.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("AutoIndex")
        public Integer autoIndex;

        /**
         * <p>Indicates whether the automatic throttling feature is enabled. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: disabled.</li>
         * <li><strong>1</strong>: enabled.</li>
         * <li><strong>2</strong>: not supported.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("AutoLimitedSql")
        public Integer autoLimitedSql;

        /**
         * <p>Indicates whether the automatic fragment recycling feature is enabled. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: disabled.</li>
         * <li><strong>1</strong>: enabled.</li>
         * <li><strong>2</strong>: not supported.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AutoResourceOptimize")
        public Integer autoResourceOptimize;

        /**
         * <p>Indicates whether the auto scaling feature is enabled. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: disabled.</li>
         * <li><strong>1</strong>: enabled.</li>
         * <li><strong>2</strong>: not supported.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AutoScale")
        public Integer autoScale;

        /**
         * <p>Indicates whether the event subscription feature is enabled. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: disabled.</li>
         * <li><strong>1</strong>: enabled.</li>
         * <li><strong>2</strong>: not supported.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("EventSubscription")
        public Integer eventSubscription;

        public static GetInstanceInspectionsResponseBodyDataListAutoFunction build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceInspectionsResponseBodyDataListAutoFunction self = new GetInstanceInspectionsResponseBodyDataListAutoFunction();
            return TeaModel.build(map, self);
        }

        public GetInstanceInspectionsResponseBodyDataListAutoFunction setAutoIndex(Integer autoIndex) {
            this.autoIndex = autoIndex;
            return this;
        }
        public Integer getAutoIndex() {
            return this.autoIndex;
        }

        public GetInstanceInspectionsResponseBodyDataListAutoFunction setAutoLimitedSql(Integer autoLimitedSql) {
            this.autoLimitedSql = autoLimitedSql;
            return this;
        }
        public Integer getAutoLimitedSql() {
            return this.autoLimitedSql;
        }

        public GetInstanceInspectionsResponseBodyDataListAutoFunction setAutoResourceOptimize(Integer autoResourceOptimize) {
            this.autoResourceOptimize = autoResourceOptimize;
            return this;
        }
        public Integer getAutoResourceOptimize() {
            return this.autoResourceOptimize;
        }

        public GetInstanceInspectionsResponseBodyDataListAutoFunction setAutoScale(Integer autoScale) {
            this.autoScale = autoScale;
            return this;
        }
        public Integer getAutoScale() {
            return this.autoScale;
        }

        public GetInstanceInspectionsResponseBodyDataListAutoFunction setEventSubscription(Integer eventSubscription) {
            this.eventSubscription = eventSubscription;
            return this;
        }
        public Integer getEventSubscription() {
            return this.eventSubscription;
        }

    }

    public static class GetInstanceInspectionsResponseBodyDataListInstance extends TeaModel {
        /**
         * <p>The account ID. You can view the ID of the logon account by moving the pointer over the profile in the Alibaba Cloud management console.</p>
         * 
         * <strong>example:</strong>
         * <p>108398049688****</p>
         */
        @NameInMap("AccountId")
        public String accountId;

        /**
         * <p>The connection mode of the instance. Valid values:</p>
         * <ul>
         * <li><strong>standard</strong>: standard mode.</li>
         * <li><strong>safe</strong>: database proxy mode.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>standard</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The CPU specification of the instance. For example, if a value of 8 is returned, the instance has eight CPU cores.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("Cpu")
        public String cpu;

        /**
         * <p>The database engine. Valid values:</p>
         * <ul>
         * <li><strong>MySQL</strong></li>
         * <li><strong>Redis</strong></li>
         * <li><strong>PolarDBMySQL</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        @NameInMap("Engine")
        public String engine;

        /**
         * <p>The version number of the database engine.</p>
         * 
         * <strong>example:</strong>
         * <p>8.0</p>
         */
        @NameInMap("EngineVersion")
        public String engineVersion;

        /**
         * <p>The instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>test-01</p>
         */
        @NameInMap("InstanceAlias")
        public String instanceAlias;

        /**
         * <p>The type of the instance on which the database is deployed. Valid values:</p>
         * <ul>
         * <li><strong>RDS</strong>: an Alibaba Cloud database instance.</li>
         * <li><strong>ECS</strong>: an Elastic Compute Service (ECS) instance on which a self-managed database is deployed.</li>
         * <li><strong>IDC</strong>: a self-managed database instance that is not deployed on Alibaba Cloud.</li>
         * </ul>
         * <blockquote>
         * <p> The value IDC indicates that the instance is deployed in a data center.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>RDS</p>
         */
        @NameInMap("InstanceArea")
        public String instanceArea;

        /**
         * <p>The instance type.</p>
         * 
         * <strong>example:</strong>
         * <p>rds.mysql.s2.xlarge</p>
         */
        @NameInMap("InstanceClass")
        public String instanceClass;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-bp10usoc1erj7****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The memory capacity of the database that is deployed on the instance. Unit: MB.</p>
         * 
         * <strong>example:</strong>
         * <p>32768</p>
         */
        @NameInMap("Memory")
        public Integer memory;

        /**
         * <p>The network type of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        @NameInMap("NetworkType")
        public String networkType;

        /**
         * <p>The ID of the node on the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-bp10usoc1erj7****</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>The region ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The storage space of the instance. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>150</p>
         */
        @NameInMap("Storage")
        public Integer storage;

        /**
         * <p>The unique identifier of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>hdm_3063db6792965c080a4bcb6e6304****</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        /**
         * <p>The ID of the virtual private cloud (VPC) in which the instance is deployed.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1knt7m55z9exoo7****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static GetInstanceInspectionsResponseBodyDataListInstance build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceInspectionsResponseBodyDataListInstance self = new GetInstanceInspectionsResponseBodyDataListInstance();
            return TeaModel.build(map, self);
        }

        public GetInstanceInspectionsResponseBodyDataListInstance setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public GetInstanceInspectionsResponseBodyDataListInstance setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public GetInstanceInspectionsResponseBodyDataListInstance setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }
        public String getCpu() {
            return this.cpu;
        }

        public GetInstanceInspectionsResponseBodyDataListInstance setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public GetInstanceInspectionsResponseBodyDataListInstance setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public GetInstanceInspectionsResponseBodyDataListInstance setInstanceAlias(String instanceAlias) {
            this.instanceAlias = instanceAlias;
            return this;
        }
        public String getInstanceAlias() {
            return this.instanceAlias;
        }

        public GetInstanceInspectionsResponseBodyDataListInstance setInstanceArea(String instanceArea) {
            this.instanceArea = instanceArea;
            return this;
        }
        public String getInstanceArea() {
            return this.instanceArea;
        }

        public GetInstanceInspectionsResponseBodyDataListInstance setInstanceClass(String instanceClass) {
            this.instanceClass = instanceClass;
            return this;
        }
        public String getInstanceClass() {
            return this.instanceClass;
        }

        public GetInstanceInspectionsResponseBodyDataListInstance setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetInstanceInspectionsResponseBodyDataListInstance setMemory(Integer memory) {
            this.memory = memory;
            return this;
        }
        public Integer getMemory() {
            return this.memory;
        }

        public GetInstanceInspectionsResponseBodyDataListInstance setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public GetInstanceInspectionsResponseBodyDataListInstance setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public GetInstanceInspectionsResponseBodyDataListInstance setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public GetInstanceInspectionsResponseBodyDataListInstance setStorage(Integer storage) {
            this.storage = storage;
            return this;
        }
        public Integer getStorage() {
            return this.storage;
        }

        public GetInstanceInspectionsResponseBodyDataListInstance setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

        public GetInstanceInspectionsResponseBodyDataListInstance setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class GetInstanceInspectionsResponseBodyDataList extends TeaModel {
        /**
         * <p>Indicates whether the autonomy service is enabled.</p>
         */
        @NameInMap("AutoFunction")
        public GetInstanceInspectionsResponseBodyDataListAutoFunction autoFunction;

        /**
         * <p>The data returned.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;data&quot;: { &quot;hasDeadLock&quot;: false, &quot;exceptionTableMap&quot;: {}, &quot;bigTransactionCount&quot;: 0, &quot;cpu&quot;: 4, &quot;isRds&quot;: true, &quot;rdsEnable&quot;: true, &quot;enable&quot;: false, &quot;activeSessions&quot;: [], &quot;bigTransactionList&quot;: [], &quot;bigSessionList&quot;: [ { &quot;blockDuration&quot;: 0, &quot;active&quot;: false, &quot;Time&quot;: 0, &quot;db&quot;: &quot;&quot; },</p>
         */
        @NameInMap("Data")
        public java.util.Map<String, ?> data;

        /**
         * <p>Indicates whether DAS Enterprise Edition is enabled. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: disabled.</li>
         * <li><strong>1</strong>: enabled.</li>
         * <li><strong>2</strong>: not supported.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("EnableDasPro")
        public Integer enableDasPro;

        /**
         * <p>The end time of the inspection and scoring task. The value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * <blockquote>
         * <p> The end time must be later than the start time.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1608888296001</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The time when the task was created. The value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1603247192000</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <p>The information about the instance.</p>
         */
        @NameInMap("Instance")
        public GetInstanceInspectionsResponseBodyDataListInstance instance;

        /**
         * <p>The inspection score of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Score")
        public Integer score;

        /**
         * <p>The scores that are deducted for the instance.</p>
         */
        @NameInMap("ScoreMap")
        public java.util.Map<String, ?> scoreMap;

        /**
         * <p>The start time of the inspection and scoring task. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1608888296000</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>The state of the inspection and scoring task. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: The task is waiting for execution.</li>
         * <li><strong>1</strong>: The task is in progress.</li>
         * <li><strong>2</strong>: The task is complete.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("State")
        public Integer state;

        /**
         * <p>The mode in which the inspection and scoring task was initiated. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: automatic mode.</li>
         * <li><strong>1</strong>: manual mode.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TaskType")
        public Integer taskType;

        public static GetInstanceInspectionsResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceInspectionsResponseBodyDataList self = new GetInstanceInspectionsResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public GetInstanceInspectionsResponseBodyDataList setAutoFunction(GetInstanceInspectionsResponseBodyDataListAutoFunction autoFunction) {
            this.autoFunction = autoFunction;
            return this;
        }
        public GetInstanceInspectionsResponseBodyDataListAutoFunction getAutoFunction() {
            return this.autoFunction;
        }

        public GetInstanceInspectionsResponseBodyDataList setData(java.util.Map<String, ?> data) {
            this.data = data;
            return this;
        }
        public java.util.Map<String, ?> getData() {
            return this.data;
        }

        public GetInstanceInspectionsResponseBodyDataList setEnableDasPro(Integer enableDasPro) {
            this.enableDasPro = enableDasPro;
            return this;
        }
        public Integer getEnableDasPro() {
            return this.enableDasPro;
        }

        public GetInstanceInspectionsResponseBodyDataList setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public GetInstanceInspectionsResponseBodyDataList setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public GetInstanceInspectionsResponseBodyDataList setInstance(GetInstanceInspectionsResponseBodyDataListInstance instance) {
            this.instance = instance;
            return this;
        }
        public GetInstanceInspectionsResponseBodyDataListInstance getInstance() {
            return this.instance;
        }

        public GetInstanceInspectionsResponseBodyDataList setScore(Integer score) {
            this.score = score;
            return this;
        }
        public Integer getScore() {
            return this.score;
        }

        public GetInstanceInspectionsResponseBodyDataList setScoreMap(java.util.Map<String, ?> scoreMap) {
            this.scoreMap = scoreMap;
            return this;
        }
        public java.util.Map<String, ?> getScoreMap() {
            return this.scoreMap;
        }

        public GetInstanceInspectionsResponseBodyDataList setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public GetInstanceInspectionsResponseBodyDataList setState(Integer state) {
            this.state = state;
            return this;
        }
        public Integer getState() {
            return this.state;
        }

        public GetInstanceInspectionsResponseBodyDataList setTaskType(Integer taskType) {
            this.taskType = taskType;
            return this;
        }
        public Integer getTaskType() {
            return this.taskType;
        }

    }

    public static class GetInstanceInspectionsResponseBodyData extends TeaModel {
        /**
         * <p>The detailed information.</p>
         */
        @NameInMap("List")
        public java.util.List<GetInstanceInspectionsResponseBodyDataList> list;

        /**
         * <p>The page number. The value returned is a positive integer. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNo")
        public Long pageNo;

        /**
         * <p>The number of entries per page. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Long pageSize;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Total")
        public Long total;

        public static GetInstanceInspectionsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceInspectionsResponseBodyData self = new GetInstanceInspectionsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetInstanceInspectionsResponseBodyData setList(java.util.List<GetInstanceInspectionsResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<GetInstanceInspectionsResponseBodyDataList> getList() {
            return this.list;
        }

        public GetInstanceInspectionsResponseBodyData setPageNo(Long pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Long getPageNo() {
            return this.pageNo;
        }

        public GetInstanceInspectionsResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public GetInstanceInspectionsResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
