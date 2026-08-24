// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeAutoScalingHistoryResponseBody extends TeaModel {
    /**
     * <p>The status code. A value of 200 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The elastic scaling history records.</p>
     */
    @NameInMap("Data")
    public DescribeAutoScalingHistoryResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * <blockquote>
     * <p>If the request is successful, <strong>Successful</strong> is returned. If the request fails, an error message such as an error code is returned.</p>
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
     * <li><strong>true</strong>: The request was successful.</li>
     * <li><strong>false</strong>: The request failed.</li>
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
         * <p>The error code returned by the internal scaling task. Valid values:</p>
         * <ul>
         * <li><strong>Insufficient_Balance</strong>: The account balance is insufficient or there are unpaid orders.</li>
         * <li><strong>REACH_SPEC_UPPERBOUND</strong>: The upper limit of the instance specification has been reached.</li>
         * <li><strong>Control_Error_Timeout_Msg</strong>: The control task timed out.</li>
         * <li><strong>Invoke_Rds_Api_Error_Msg</strong>: Failed to call the RDS API.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Insufficient_Balance</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The number of CPU cores of the original instance.</p>
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
         * <p>The memory size of the original instance. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("OriginMemory")
        public Double originMemory;

        /**
         * <p>The type of the automatic performance extension task. Valid values:</p>
         * <ul>
         * <li><strong>SCALE_UP</strong>: Automatic specification extension.</li>
         * <li><strong>SCALE_DOWN</strong>: Automatic specification scale-down.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SCALE_UP</p>
         */
        @NameInMap("ScaleType")
        public String scaleType;

        /**
         * <p>The number of CPU cores of the target instance.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("TargetCore")
        public Integer targetCore;

        /**
         * <p>The target instance type.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql.n2.xlarge.2c</p>
         */
        @NameInMap("TargetInstanceClass")
        public String targetInstanceClass;

        /**
         * <p>The memory size of the target instance. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        @NameInMap("TargetMemory")
        public Double targetMemory;

        /**
         * <p>The task execution status. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The task was executed successfully.</li>
         * <li><strong>false</strong>: The task failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("TaskExcuteStatus")
        public Boolean taskExcuteStatus;

        /**
         * <p>The task execution time. The value is a UNIX timestamp. Unit: milliseconds.</p>
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
         * <p>The Redis bandwidth elastic scaling history records. This parameter is not supported.</p>
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
         * <p>The Redis resource scaling history records. This parameter is not supported.</p>
         */
        @NameInMap("Resource")
        public java.util.List<java.util.Map<String, ?>> resource;

        /**
         * <p>The Redis automatic shard scaling history records. This parameter is not supported.</p>
         */
        @NameInMap("Shard")
        public java.util.List<java.util.Map<String, ?>> shard;

        /**
         * <p>The automatic performance extension history records.</p>
         */
        @NameInMap("SpecHistory")
        public java.util.List<DescribeAutoScalingHistoryResponseBodyDataSpecHistory> specHistory;

        /**
         * <p>The storage expansion history records. This parameter is not supported.</p>
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
