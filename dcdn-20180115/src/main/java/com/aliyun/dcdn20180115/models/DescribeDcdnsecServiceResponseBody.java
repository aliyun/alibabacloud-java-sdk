// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnsecServiceResponseBody extends TeaModel {
    /**
     * <p>The time when the renewed service takes effect. The time is displayed in UTC.</p>
     */
    @NameInMap("ChangingAffectTime")
    public String changingAffectTime;

    /**
     * <p>The new metering method for the renewed DCDN. Valid values:</p>
     * <br>
     * <p>*   **PayByTraffic**: pay by data transfer</p>
     * <p>*   **PayByBandwidth**: pay by bandwidth</p>
     * <p>*   **PayByBandwidth95**: pay by 95th percentile bandwidth</p>
     * <p>*   **PayByBandwidth_monthavg**: pay by monthly average bandwidth</p>
     * <p>*   **PayByBandwidth_month4th**: pay by fourth peak bandwidth per month</p>
     * <p>*   **PayByBandwidth_monthday95avg**: pay by monthly average 95th percentile bandwidth</p>
     * <p>*   **PayByBandwidth_nighthalf95**: pay by 95th percentile bandwidth (50% off during nighttime)</p>
     */
    @NameInMap("ChangingChargeType")
    public String changingChargeType;

    /**
     * <p>The number of accelerated domain names that use DCDN.</p>
     */
    @NameInMap("DomainNum")
    public String domainNum;

    /**
     * <p>The service expiration time.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The metering method for traffic.</p>
     */
    @NameInMap("FlowType")
    public String flowType;

    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The current metering method. Valid values:</p>
     * <br>
     * <p>*   **PayByTraffic**: pay by data transfer</p>
     * <p>*   **PayByBandwidth**: pay by bandwidth</p>
     * <p>*   **PayByBandwidth95**: pay by 95th percentile bandwidth</p>
     * <p>*   **PayByBandwidth_monthavg**: pay by monthly average bandwidth</p>
     * <p>*   **PayByBandwidth_month4th**: pay by fourth peak bandwidth per month</p>
     * <p>*   **PayByBandwidth_monthday95avg**: pay by monthly average 95th percentile bandwidth</p>
     * <p>*   **PayByBandwidth_nighthalf95**: pay by 95th percentile bandwidth (50% off during nighttime)</p>
     */
    @NameInMap("InternetChargeType")
    public String internetChargeType;

    /**
     * <p>The lock status of DCDN.</p>
     */
    @NameInMap("OperationLocks")
    public DescribeDcdnsecServiceResponseBodyOperationLocks operationLocks;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The metering method for requests.</p>
     */
    @NameInMap("RequestType")
    public String requestType;

    /**
     * <p>The service activation time.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The version number.</p>
     */
    @NameInMap("Version")
    public String version;

    public static DescribeDcdnsecServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnsecServiceResponseBody self = new DescribeDcdnsecServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnsecServiceResponseBody setChangingAffectTime(String changingAffectTime) {
        this.changingAffectTime = changingAffectTime;
        return this;
    }
    public String getChangingAffectTime() {
        return this.changingAffectTime;
    }

    public DescribeDcdnsecServiceResponseBody setChangingChargeType(String changingChargeType) {
        this.changingChargeType = changingChargeType;
        return this;
    }
    public String getChangingChargeType() {
        return this.changingChargeType;
    }

    public DescribeDcdnsecServiceResponseBody setDomainNum(String domainNum) {
        this.domainNum = domainNum;
        return this;
    }
    public String getDomainNum() {
        return this.domainNum;
    }

    public DescribeDcdnsecServiceResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDcdnsecServiceResponseBody setFlowType(String flowType) {
        this.flowType = flowType;
        return this;
    }
    public String getFlowType() {
        return this.flowType;
    }

    public DescribeDcdnsecServiceResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeDcdnsecServiceResponseBody setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
        return this;
    }
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public DescribeDcdnsecServiceResponseBody setOperationLocks(DescribeDcdnsecServiceResponseBodyOperationLocks operationLocks) {
        this.operationLocks = operationLocks;
        return this;
    }
    public DescribeDcdnsecServiceResponseBodyOperationLocks getOperationLocks() {
        return this.operationLocks;
    }

    public DescribeDcdnsecServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDcdnsecServiceResponseBody setRequestType(String requestType) {
        this.requestType = requestType;
        return this;
    }
    public String getRequestType() {
        return this.requestType;
    }

    public DescribeDcdnsecServiceResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeDcdnsecServiceResponseBody setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public static class DescribeDcdnsecServiceResponseBodyOperationLocksLockReason extends TeaModel {
        /**
         * <p>The reason why the instance was locked.</p>
         */
        @NameInMap("LockReason")
        public String lockReason;

        public static DescribeDcdnsecServiceResponseBodyOperationLocksLockReason build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnsecServiceResponseBodyOperationLocksLockReason self = new DescribeDcdnsecServiceResponseBodyOperationLocksLockReason();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnsecServiceResponseBodyOperationLocksLockReason setLockReason(String lockReason) {
            this.lockReason = lockReason;
            return this;
        }
        public String getLockReason() {
            return this.lockReason;
        }

    }

    public static class DescribeDcdnsecServiceResponseBodyOperationLocks extends TeaModel {
        @NameInMap("LockReason")
        public java.util.List<DescribeDcdnsecServiceResponseBodyOperationLocksLockReason> lockReason;

        public static DescribeDcdnsecServiceResponseBodyOperationLocks build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnsecServiceResponseBodyOperationLocks self = new DescribeDcdnsecServiceResponseBodyOperationLocks();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnsecServiceResponseBodyOperationLocks setLockReason(java.util.List<DescribeDcdnsecServiceResponseBodyOperationLocksLockReason> lockReason) {
            this.lockReason = lockReason;
            return this;
        }
        public java.util.List<DescribeDcdnsecServiceResponseBodyOperationLocksLockReason> getLockReason() {
            return this.lockReason;
        }

    }

}
