// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnServiceResponseBody extends TeaModel {
    /**
     * <p>The time when the next billing method takes effect. The time is displayed in GMT.</p>
     */
    @NameInMap("ChangingAffectTime")
    public String changingAffectTime;

    /**
     * <p>The next billing method that Alibaba Cloud CDN will use. Valid values:</p>
     * <br>
     * <p>*   **PayByTraffic**: pay-by-data-transfer.</p>
     * <p>*   **PayByBandwidth**: pay-by-bandwidth.</p>
     */
    @NameInMap("ChangingChargeType")
    public String changingChargeType;

    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The current billing method of Alibaba Cloud CDN.</p>
     * <br>
     * <p>*   **PayByTraffic**: pay-by-data-transfer.</p>
     * <p>*   **PayByBandwidth**: pay-by-bandwidth.</p>
     */
    @NameInMap("InternetChargeType")
    public String internetChargeType;

    /**
     * <p>The time when Alibaba Cloud CDN was activated. The time follows the ISO 8601 standard in the yyyy-MM-ddThh:mmZ format.</p>
     */
    @NameInMap("OpeningTime")
    public String openingTime;

    /**
     * <p>The lock status of Alibaba Cloud CDN.</p>
     */
    @NameInMap("OperationLocks")
    public DescribeCdnServiceResponseBodyOperationLocks operationLocks;

    /**
     * <p>The ID of the request.</p>
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
         * <p>The reason why Alibaba Cloud CDN is locked. A value of financial indicates that the service is locked due to overdue payments.</p>
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
