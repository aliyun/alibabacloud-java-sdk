// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetInstanceInspectionsResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code returned.</p>
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
     * <br>
     * <p>>  If the request was successful, Successful is returned. If the request failed, an error message such as an error code is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
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
         * <br>
         * <p>*   **0**: disabled.</p>
         * <p>*   **1**: enabled.</p>
         * <p>*   **2**: not supported.</p>
         */
        @NameInMap("AutoIndex")
        public Integer autoIndex;

        /**
         * <p>Indicates whether the automatic throttling feature is enabled. Valid values:</p>
         * <br>
         * <p>*   **0**: disabled.</p>
         * <p>*   **1**: enabled.</p>
         * <p>*   **2**: not supported.</p>
         */
        @NameInMap("AutoLimitedSql")
        public Integer autoLimitedSql;

        /**
         * <p>Indicates whether the automatic fragment recycling feature is enabled. Valid values:</p>
         * <br>
         * <p>*   **0**: disabled.</p>
         * <p>*   **1**: enabled.</p>
         * <p>*   **2**: not supported.</p>
         */
        @NameInMap("AutoResourceOptimize")
        public Integer autoResourceOptimize;

        /**
         * <p>Indicates whether the auto scaling feature is enabled. Valid values:</p>
         * <br>
         * <p>*   **0**: disabled.</p>
         * <p>*   **1**: enabled.</p>
         * <p>*   **2**: not supported.</p>
         */
        @NameInMap("AutoScale")
        public Integer autoScale;

        /**
         * <p>Indicates whether the event subscription feature is enabled. Valid values:</p>
         * <br>
         * <p>*   **0**: disabled.</p>
         * <p>*   **1**: enabled.</p>
         * <p>*   **2**: not supported.</p>
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
         */
        @NameInMap("AccountId")
        public String accountId;

        /**
         * <p>The connection mode of the instance. Valid values:</p>
         * <br>
         * <p>*   **standard**: standard mode.</p>
         * <p>*   **safe**: database proxy mode.</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The CPU specification of the instance. For example, if a value of 8 is returned, the instance has eight CPU cores.</p>
         */
        @NameInMap("Cpu")
        public String cpu;

        /**
         * <p>The database engine. Valid values:</p>
         * <br>
         * <p>*   **MySQL**</p>
         * <p>*   **Redis**</p>
         * <p>*   **PolarDBMySQL**</p>
         */
        @NameInMap("Engine")
        public String engine;

        /**
         * <p>The version number of the database engine.</p>
         */
        @NameInMap("EngineVersion")
        public String engineVersion;

        /**
         * <p>The instance name.</p>
         */
        @NameInMap("InstanceAlias")
        public String instanceAlias;

        /**
         * <p>The type of the instance on which the database is deployed. Valid values:</p>
         * <br>
         * <p>*   **RDS**: an Alibaba Cloud database instance.</p>
         * <p>*   **ECS**: an Elastic Compute Service (ECS) instance on which a self-managed database is deployed.</p>
         * <p>*   **IDC**: a self-managed database instance that is not deployed on Alibaba Cloud.</p>
         * <br>
         * <p>>  The value IDC indicates that the instance is deployed in a data center.</p>
         */
        @NameInMap("InstanceArea")
        public String instanceArea;

        /**
         * <p>The instance type.</p>
         */
        @NameInMap("InstanceClass")
        public String instanceClass;

        /**
         * <p>The instance ID.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The memory capacity of the database that is deployed on the instance. Unit: MB.</p>
         */
        @NameInMap("Memory")
        public Integer memory;

        /**
         * <p>The network type of the instance.</p>
         */
        @NameInMap("NetworkType")
        public String networkType;

        /**
         * <p>The ID of the node on the instance.</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>The region ID of the instance.</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The storage space of the instance. Unit: GB.</p>
         */
        @NameInMap("Storage")
        public Integer storage;

        /**
         * <p>The unique identifier of the instance.</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        /**
         * <p>The ID of the virtual private cloud (VPC) in which the instance is deployed.</p>
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
         */
        @NameInMap("Data")
        public java.util.Map<String, ?> data;

        /**
         * <p>Indicates whether DAS Enterprise Edition is enabled. Valid values:</p>
         * <br>
         * <p>*   **0**: disabled.</p>
         * <p>*   **1**: enabled.</p>
         * <p>*   **2**: not supported.</p>
         */
        @NameInMap("EnableDasPro")
        public Integer enableDasPro;

        /**
         * <p>The end time of the inspection and scoring task. The value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * <br>
         * <p>>  The end time must be later than the start time.</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The time when the task was created. The value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
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
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>The state of the inspection and scoring task. Valid values:</p>
         * <br>
         * <p>*   **0**: The task is waiting for execution.</p>
         * <p>*   **1**: The task is in progress.</p>
         * <p>*   **2**: The task is complete.</p>
         */
        @NameInMap("State")
        public Integer state;

        /**
         * <p>The mode in which the inspection and scoring task was initiated. Valid values:</p>
         * <br>
         * <p>*   **0**: automatic mode.</p>
         * <p>*   **1**: manual mode.</p>
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
         */
        @NameInMap("PageNo")
        public Long pageNo;

        /**
         * <p>The number of entries per page. Default value: 10.</p>
         */
        @NameInMap("PageSize")
        public Long pageSize;

        /**
         * <p>The total number of entries returned.</p>
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
