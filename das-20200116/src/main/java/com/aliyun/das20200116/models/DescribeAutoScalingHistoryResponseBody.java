// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeAutoScalingHistoryResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code returned. The status code 200 indicates that the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The history of auto scaling.</p>
     */
    @NameInMap("Data")
    public DescribeAutoScalingHistoryResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * <blockquote>
     * <p>If the request was successful, <strong>Successful</strong> is returned. Otherwise, an error message such as an error code is returned.</p>
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
        /**
         * <p>The error code returned by the scaling task. Valid values:</p>
         * <ul>
         * <li><strong>Insufficient_Balance</strong>: The account has insufficient balance or an unpaid order.</li>
         * <li><strong>REACH_SPEC_UPPERBOUND</strong>: The instance type reaches the upper limit.</li>
         * <li><strong>Control_Error_Timeout_Msg</strong>: The management task timed out.</li>
         * <li><strong>Invoke_Rds_Api_Error_Msg</strong>: Failed to call the ApsaraDB RDS API.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Insufficient_Balance</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The original number of CPU cores of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("OriginCore")
        public Integer originCore;

        /**
         * <p>The original instance type.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql.n2.large.2c</p>
         */
        @NameInMap("OriginInstanceClass")
        public String originInstanceClass;

        /**
         * <p>The original memory size of the instance. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("OriginMemory")
        public Double originMemory;

        /**
         * <p>The type of the automatic performance scaling task. Valid values:</p>
         * <ul>
         * <li><strong>SCALE_UP</strong>: automatic instance type scale-up task.</li>
         * <li><strong>SCALE_DOWN</strong>: automatic instance type scale-down task.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SCALE_UP</p>
         */
        @NameInMap("ScaleType")
        public String scaleType;

        /**
         * <p>The destination number of CPU cores of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("TargetCore")
        public Integer targetCore;

        /**
         * <p>The destination instance type.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql.n2.xlarge.2c</p>
         */
        @NameInMap("TargetInstanceClass")
        public String targetInstanceClass;

        /**
         * <p>The destination memory size of the instance. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        @NameInMap("TargetMemory")
        public Double targetMemory;

        /**
         * <p>The status of the task. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The task was successful.</li>
         * <li><strong>false</strong>: The task failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("TaskExcuteStatus")
        public Boolean taskExcuteStatus;

        /**
         * <p>The time when the task was run. Set this parameter to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1684830763000</p>
         */
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
        /**
         * <p>The history of automatic bandwidth scaling of ApsaraDB for Redis instances. This feature is not supported.</p>
         */
        @NameInMap("Bandwidth")
        public java.util.List<java.util.Map<String, ?>> bandwidth;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-2ze1jdv45i7l6****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The history of resource scale-out of ApsaraDB for Redis instances. This feature is not supported.</p>
         */
        @NameInMap("Resource")
        public java.util.List<java.util.Map<String, ?>> resource;

        /**
         * <p>The history of automatic shard scale-out of ApsaraDB for Redis instances. This feature is not supported.</p>
         */
        @NameInMap("Shard")
        public java.util.List<java.util.Map<String, ?>> shard;

        /**
         * <p>The history of automatic performance scaling.</p>
         */
        @NameInMap("SpecHistory")
        public java.util.List<DescribeAutoScalingHistoryResponseBodyDataSpecHistory> specHistory;

        /**
         * <p>The history of storage expansion. This feature is not supported.</p>
         */
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
