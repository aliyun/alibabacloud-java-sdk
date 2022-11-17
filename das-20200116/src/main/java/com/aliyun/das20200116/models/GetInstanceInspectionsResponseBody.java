// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetInstanceInspectionsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetInstanceInspectionsResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("AutoIndex")
        public Integer autoIndex;

        @NameInMap("AutoLimitedSql")
        public Integer autoLimitedSql;

        @NameInMap("AutoResourceOptimize")
        public Integer autoResourceOptimize;

        @NameInMap("AutoScale")
        public Integer autoScale;

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
        @NameInMap("AccountId")
        public String accountId;

        @NameInMap("Category")
        public String category;

        @NameInMap("Cpu")
        public String cpu;

        @NameInMap("Engine")
        public String engine;

        @NameInMap("EngineVersion")
        public String engineVersion;

        @NameInMap("InstanceAlias")
        public String instanceAlias;

        @NameInMap("InstanceArea")
        public String instanceArea;

        @NameInMap("InstanceClass")
        public String instanceClass;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Memory")
        public Integer memory;

        @NameInMap("NetworkType")
        public String networkType;

        @NameInMap("NodeId")
        public String nodeId;

        @NameInMap("Region")
        public String region;

        @NameInMap("Storage")
        public Integer storage;

        @NameInMap("Uuid")
        public String uuid;

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
        @NameInMap("AutoFunction")
        public GetInstanceInspectionsResponseBodyDataListAutoFunction autoFunction;

        @NameInMap("Data")
        public java.util.Map<String, ?> data;

        @NameInMap("EnableDasPro")
        public Integer enableDasPro;

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("Instance")
        public GetInstanceInspectionsResponseBodyDataListInstance instance;

        @NameInMap("Score")
        public Integer score;

        @NameInMap("ScoreMap")
        public java.util.Map<String, ?> scoreMap;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("State")
        public Integer state;

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
        @NameInMap("List")
        public java.util.List<GetInstanceInspectionsResponseBodyDataList> list;

        @NameInMap("PageNo")
        public Long pageNo;

        @NameInMap("PageSize")
        public Long pageSize;

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
