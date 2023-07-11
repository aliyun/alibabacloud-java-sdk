// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeAutoScalingHistoryResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    /**
     * <p>AutoScalingInstanceHistory</p>
     */
    @NameInMap("Data")
    public DescribeAutoScalingHistoryResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    public static DescribeAutoScalingHistoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAutoScalingHistoryResponseBody self = new DescribeAutoScalingHistoryResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAutoScalingHistoryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeAutoScalingHistoryResponseBody setData(DescribeAutoScalingHistoryResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeAutoScalingHistoryResponseBodyData getData() {
        return this.data;
    }

    public DescribeAutoScalingHistoryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAutoScalingHistoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAutoScalingHistoryResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class DescribeAutoScalingHistoryResponseBodyDataSpecHistory extends TeaModel {
        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("OriginCore")
        public Integer originCore;

        @NameInMap("OriginInstanceClass")
        public String originInstanceClass;

        @NameInMap("OriginMemory")
        public Double originMemory;

        @NameInMap("ScaleType")
        public String scaleType;

        @NameInMap("TargetCore")
        public Integer targetCore;

        @NameInMap("TargetInstanceClass")
        public String targetInstanceClass;

        @NameInMap("TargetMemory")
        public Double targetMemory;

        @NameInMap("TaskExcuteStatus")
        public Boolean taskExcuteStatus;

        @NameInMap("TaskTime")
        public Long taskTime;

        public static DescribeAutoScalingHistoryResponseBodyDataSpecHistory build(java.util.Map<String, ?> map) throws Exception {
            DescribeAutoScalingHistoryResponseBodyDataSpecHistory self = new DescribeAutoScalingHistoryResponseBodyDataSpecHistory();
            return TeaModel.build(map, self);
        }

        public DescribeAutoScalingHistoryResponseBodyDataSpecHistory setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DescribeAutoScalingHistoryResponseBodyDataSpecHistory setOriginCore(Integer originCore) {
            this.originCore = originCore;
            return this;
        }
        public Integer getOriginCore() {
            return this.originCore;
        }

        public DescribeAutoScalingHistoryResponseBodyDataSpecHistory setOriginInstanceClass(String originInstanceClass) {
            this.originInstanceClass = originInstanceClass;
            return this;
        }
        public String getOriginInstanceClass() {
            return this.originInstanceClass;
        }

        public DescribeAutoScalingHistoryResponseBodyDataSpecHistory setOriginMemory(Double originMemory) {
            this.originMemory = originMemory;
            return this;
        }
        public Double getOriginMemory() {
            return this.originMemory;
        }

        public DescribeAutoScalingHistoryResponseBodyDataSpecHistory setScaleType(String scaleType) {
            this.scaleType = scaleType;
            return this;
        }
        public String getScaleType() {
            return this.scaleType;
        }

        public DescribeAutoScalingHistoryResponseBodyDataSpecHistory setTargetCore(Integer targetCore) {
            this.targetCore = targetCore;
            return this;
        }
        public Integer getTargetCore() {
            return this.targetCore;
        }

        public DescribeAutoScalingHistoryResponseBodyDataSpecHistory setTargetInstanceClass(String targetInstanceClass) {
            this.targetInstanceClass = targetInstanceClass;
            return this;
        }
        public String getTargetInstanceClass() {
            return this.targetInstanceClass;
        }

        public DescribeAutoScalingHistoryResponseBodyDataSpecHistory setTargetMemory(Double targetMemory) {
            this.targetMemory = targetMemory;
            return this;
        }
        public Double getTargetMemory() {
            return this.targetMemory;
        }

        public DescribeAutoScalingHistoryResponseBodyDataSpecHistory setTaskExcuteStatus(Boolean taskExcuteStatus) {
            this.taskExcuteStatus = taskExcuteStatus;
            return this;
        }
        public Boolean getTaskExcuteStatus() {
            return this.taskExcuteStatus;
        }

        public DescribeAutoScalingHistoryResponseBodyDataSpecHistory setTaskTime(Long taskTime) {
            this.taskTime = taskTime;
            return this;
        }
        public Long getTaskTime() {
            return this.taskTime;
        }

    }

    public static class DescribeAutoScalingHistoryResponseBodyData extends TeaModel {
        @NameInMap("Bandwidth")
        public java.util.List<java.util.Map<String, ?>> bandwidth;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Resource")
        public java.util.List<java.util.Map<String, ?>> resource;

        @NameInMap("Shard")
        public java.util.List<java.util.Map<String, ?>> shard;

        @NameInMap("SpecHistory")
        public java.util.List<DescribeAutoScalingHistoryResponseBodyDataSpecHistory> specHistory;

        @NameInMap("Storage")
        public java.util.List<java.util.Map<String, ?>> storage;

        public static DescribeAutoScalingHistoryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeAutoScalingHistoryResponseBodyData self = new DescribeAutoScalingHistoryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeAutoScalingHistoryResponseBodyData setBandwidth(java.util.List<java.util.Map<String, ?>> bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getBandwidth() {
            return this.bandwidth;
        }

        public DescribeAutoScalingHistoryResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeAutoScalingHistoryResponseBodyData setResource(java.util.List<java.util.Map<String, ?>> resource) {
            this.resource = resource;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getResource() {
            return this.resource;
        }

        public DescribeAutoScalingHistoryResponseBodyData setShard(java.util.List<java.util.Map<String, ?>> shard) {
            this.shard = shard;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getShard() {
            return this.shard;
        }

        public DescribeAutoScalingHistoryResponseBodyData setSpecHistory(java.util.List<DescribeAutoScalingHistoryResponseBodyDataSpecHistory> specHistory) {
            this.specHistory = specHistory;
            return this;
        }
        public java.util.List<DescribeAutoScalingHistoryResponseBodyDataSpecHistory> getSpecHistory() {
            return this.specHistory;
        }

        public DescribeAutoScalingHistoryResponseBodyData setStorage(java.util.List<java.util.Map<String, ?>> storage) {
            this.storage = storage;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getStorage() {
            return this.storage;
        }

    }

}
