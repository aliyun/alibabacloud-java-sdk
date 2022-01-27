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

    public static class GetInstanceInspectionsResponseBodyDataListBaseInspectionInstance extends TeaModel {
        @NameInMap("AccountId")
        public String accountId;

        @NameInMap("Engine")
        public String engine;

        @NameInMap("EngineVersion")
        public String engineVersion;

        @NameInMap("InstanceArea")
        public String instanceArea;

        @NameInMap("InstanceClass")
        public String instanceClass;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("NetworkType")
        public String networkType;

        @NameInMap("NodeId")
        public String nodeId;

        @NameInMap("Region")
        public String region;

        @NameInMap("Uuid")
        public String uuid;

        @NameInMap("VpcId")
        public String vpcId;

        public static GetInstanceInspectionsResponseBodyDataListBaseInspectionInstance build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceInspectionsResponseBodyDataListBaseInspectionInstance self = new GetInstanceInspectionsResponseBodyDataListBaseInspectionInstance();
            return TeaModel.build(map, self);
        }

        public GetInstanceInspectionsResponseBodyDataListBaseInspectionInstance setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public GetInstanceInspectionsResponseBodyDataListBaseInspectionInstance setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public GetInstanceInspectionsResponseBodyDataListBaseInspectionInstance setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public GetInstanceInspectionsResponseBodyDataListBaseInspectionInstance setInstanceArea(String instanceArea) {
            this.instanceArea = instanceArea;
            return this;
        }
        public String getInstanceArea() {
            return this.instanceArea;
        }

        public GetInstanceInspectionsResponseBodyDataListBaseInspectionInstance setInstanceClass(String instanceClass) {
            this.instanceClass = instanceClass;
            return this;
        }
        public String getInstanceClass() {
            return this.instanceClass;
        }

        public GetInstanceInspectionsResponseBodyDataListBaseInspectionInstance setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetInstanceInspectionsResponseBodyDataListBaseInspectionInstance setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public GetInstanceInspectionsResponseBodyDataListBaseInspectionInstance setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public GetInstanceInspectionsResponseBodyDataListBaseInspectionInstance setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public GetInstanceInspectionsResponseBodyDataListBaseInspectionInstance setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

        public GetInstanceInspectionsResponseBodyDataListBaseInspectionInstance setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class GetInstanceInspectionsResponseBodyDataListBaseInspection extends TeaModel {
        @NameInMap("Data")
        public java.util.Map<String, ?> data;

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("Instance")
        public GetInstanceInspectionsResponseBodyDataListBaseInspectionInstance instance;

        @NameInMap("Score")
        public Integer score;

        @NameInMap("ScoreMap")
        public java.util.Map<String, ?> scoreMap;

        @NameInMap("StartTime")
        public Long startTime;

        public static GetInstanceInspectionsResponseBodyDataListBaseInspection build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceInspectionsResponseBodyDataListBaseInspection self = new GetInstanceInspectionsResponseBodyDataListBaseInspection();
            return TeaModel.build(map, self);
        }

        public GetInstanceInspectionsResponseBodyDataListBaseInspection setData(java.util.Map<String, ?> data) {
            this.data = data;
            return this;
        }
        public java.util.Map<String, ?> getData() {
            return this.data;
        }

        public GetInstanceInspectionsResponseBodyDataListBaseInspection setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public GetInstanceInspectionsResponseBodyDataListBaseInspection setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public GetInstanceInspectionsResponseBodyDataListBaseInspection setInstance(GetInstanceInspectionsResponseBodyDataListBaseInspectionInstance instance) {
            this.instance = instance;
            return this;
        }
        public GetInstanceInspectionsResponseBodyDataListBaseInspectionInstance getInstance() {
            return this.instance;
        }

        public GetInstanceInspectionsResponseBodyDataListBaseInspection setScore(Integer score) {
            this.score = score;
            return this;
        }
        public Integer getScore() {
            return this.score;
        }

        public GetInstanceInspectionsResponseBodyDataListBaseInspection setScoreMap(java.util.Map<String, ?> scoreMap) {
            this.scoreMap = scoreMap;
            return this;
        }
        public java.util.Map<String, ?> getScoreMap() {
            return this.scoreMap;
        }

        public GetInstanceInspectionsResponseBodyDataListBaseInspection setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

    }

    public static class GetInstanceInspectionsResponseBodyDataList extends TeaModel {
        @NameInMap("BaseInspection")
        public java.util.List<GetInstanceInspectionsResponseBodyDataListBaseInspection> baseInspection;

        public static GetInstanceInspectionsResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceInspectionsResponseBodyDataList self = new GetInstanceInspectionsResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public GetInstanceInspectionsResponseBodyDataList setBaseInspection(java.util.List<GetInstanceInspectionsResponseBodyDataListBaseInspection> baseInspection) {
            this.baseInspection = baseInspection;
            return this;
        }
        public java.util.List<GetInstanceInspectionsResponseBodyDataListBaseInspection> getBaseInspection() {
            return this.baseInspection;
        }

    }

    public static class GetInstanceInspectionsResponseBodyData extends TeaModel {
        @NameInMap("List")
        public GetInstanceInspectionsResponseBodyDataList list;

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

        public GetInstanceInspectionsResponseBodyData setList(GetInstanceInspectionsResponseBodyDataList list) {
            this.list = list;
            return this;
        }
        public GetInstanceInspectionsResponseBodyDataList getList() {
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
