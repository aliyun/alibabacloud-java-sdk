// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnServiceResponseBody extends TeaModel {
    /**
     * <p>The time when the metering method for the next cycle takes effect. The time is displayed in GMT.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-11-27T16:00:00Z</p>
     */
    @NameInMap("ChangingAffectTime")
    public String changingAffectTime;

    /**
     * <p>The metering method for the next cycle. Valid values:</p>
     * <ul>
     * <li><strong>PayByTraffic</strong>: pay-by-data-transfer</li>
     * <li><strong>PayByBandwidth</strong>: pay-by-bandwidth</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PayByTraffic</p>
     */
    @NameInMap("ChangingChargeType")
    public String changingChargeType;

    @NameInMap("ChangingDynamicBillingType")
    public String changingDynamicBillingType;

    @NameInMap("DynamicBillingType")
    public String dynamicBillingType;

    /**
     * <p>The ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>aliuidxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The current metering method. Valid values:</p>
     * <ul>
     * <li><strong>PayByTraffic</strong>: pay-by-data-transfer</li>
     * <li><strong>PayByBandwidth</strong>: pay-by-bandwidth</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PayByTraffic</p>
     */
    @NameInMap("InternetChargeType")
    public String internetChargeType;

    /**
     * <p>The time when the service was activated. The time follows the ISO 8601 standard.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-02-28T13:11:49Z</p>
     */
    @NameInMap("OpeningTime")
    public String openingTime;

    /**
     * <p>The lock status.</p>
     */
    @NameInMap("OperationLocks")
    public DescribeCdnServiceResponseBodyOperationLocks operationLocks;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>16A96B9A-F203-4EC5-8E43-CB92E68F4CD8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCdnServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnServiceResponseBody self = new DescribeCdnServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCdnServiceResponseBody setChangingAffectTime(String changingAffectTime) {
        this.changingAffectTime = changingAffectTime;
        return this;
    }
    public String getChangingAffectTime() {
        return this.changingAffectTime;
    }

    public DescribeCdnServiceResponseBody setChangingChargeType(String changingChargeType) {
        this.changingChargeType = changingChargeType;
        return this;
    }
    public String getChangingChargeType() {
        return this.changingChargeType;
    }

    public DescribeCdnServiceResponseBody setChangingDynamicBillingType(String changingDynamicBillingType) {
        this.changingDynamicBillingType = changingDynamicBillingType;
        return this;
    }
    public String getChangingDynamicBillingType() {
        return this.changingDynamicBillingType;
    }

    public DescribeCdnServiceResponseBody setDynamicBillingType(String dynamicBillingType) {
        this.dynamicBillingType = dynamicBillingType;
        return this;
    }
    public String getDynamicBillingType() {
        return this.dynamicBillingType;
    }

    public DescribeCdnServiceResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeCdnServiceResponseBody setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
        return this;
    }
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public DescribeCdnServiceResponseBody setOpeningTime(String openingTime) {
        this.openingTime = openingTime;
        return this;
    }
    public String getOpeningTime() {
        return this.openingTime;
    }

    public DescribeCdnServiceResponseBody setOperationLocks(DescribeCdnServiceResponseBodyOperationLocks operationLocks) {
        this.operationLocks = operationLocks;
        return this;
    }
    public DescribeCdnServiceResponseBodyOperationLocks getOperationLocks() {
        return this.operationLocks;
    }

    public DescribeCdnServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeCdnServiceResponseBodyOperationLocksLockReason extends TeaModel {
        /**
         * <p>The reason why the service is locked. A value of financial indicates that the service is locked due to overdue payments.</p>
         * 
         * <strong>example:</strong>
         * <p>financial</p>
         */
        @NameInMap("LockReason")
        public String lockReason;

        public static DescribeCdnServiceResponseBodyOperationLocksLockReason build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdnServiceResponseBodyOperationLocksLockReason self = new DescribeCdnServiceResponseBodyOperationLocksLockReason();
            return TeaModel.build(map, self);
        }

        public DescribeCdnServiceResponseBodyOperationLocksLockReason setLockReason(String lockReason) {
            this.lockReason = lockReason;
            return this;
        }
        public String getLockReason() {
            return this.lockReason;
        }

    }

    public static class DescribeCdnServiceResponseBodyOperationLocks extends TeaModel {
        @NameInMap("LockReason")
        public java.util.List<DescribeCdnServiceResponseBodyOperationLocksLockReason> lockReason;

        public static DescribeCdnServiceResponseBodyOperationLocks build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdnServiceResponseBodyOperationLocks self = new DescribeCdnServiceResponseBodyOperationLocks();
            return TeaModel.build(map, self);
        }

        public DescribeCdnServiceResponseBodyOperationLocks setLockReason(java.util.List<DescribeCdnServiceResponseBodyOperationLocksLockReason> lockReason) {
            this.lockReason = lockReason;
            return this;
        }
        public java.util.List<DescribeCdnServiceResponseBodyOperationLocksLockReason> getLockReason() {
            return this.lockReason;
        }

    }

}
