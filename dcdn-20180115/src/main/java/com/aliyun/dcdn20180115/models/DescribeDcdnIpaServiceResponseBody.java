// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnIpaServiceResponseBody extends TeaModel {
    /**
     * <p>The time when the change of the billing method starts to take effect. The time is in GMT. This time appears on the frontend only when it is later than the current time.</p>
     * 
     * <strong>example:</strong>
     * <p>2018-03-31T16:00:00Z</p>
     */
    @NameInMap("ChangingAffectTime")
    public String changingAffectTime;

    /**
     * <p>The new billing method to take effect. Valid values:</p>
     * <ul>
     * <li><strong>PayByTraffic</strong>: pay-by-data-transfer</li>
     * <li><strong>PayByBandwidth</strong>: pay-by-bandwidth</li>
     * <li><strong>PayByBandwidth95</strong>: pay-by-95th percentile bandwidth</li>
     * <li><strong>PayByBandwidth_monthavg</strong>: pay-by-monthly average bandwidth</li>
     * <li><strong>PayByBandwidth_month4th</strong>: pay-by-fourth peak bandwidth per month</li>
     * <li><strong>PayByBandwidth_monthday95avg</strong>: pay-by-monthly average 95th percentile bandwidth</li>
     * <li><strong>PayByBandwidth_nighthalf95</strong>: pay-by-95th percentile bandwidth (50% off during nighttime)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PayByBandwidth</p>
     */
    @NameInMap("ChangingChargeType")
    public String changingChargeType;

    /**
     * <p>The ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>1883927335936173</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The billing method of the instance. Valid values:</p>
     * <ul>
     * <li><strong>PayByTraffic</strong>: pay-by-data-transfer</li>
     * <li><strong>PayByBandwidth</strong>: pay-by-bandwidth</li>
     * <li><strong>PayByBandwidth95</strong>: pay-by-95th percentile bandwidth</li>
     * <li><strong>PayByBandwidth_monthavg</strong>: pay-by-monthly average bandwidth</li>
     * <li><strong>PayByBandwidth_month4th</strong>: pay-by-fourth peak bandwidth per month</li>
     * <li><strong>PayByBandwidth_monthday95avg</strong>: pay-by-monthly average 95th percentile bandwidth</li>
     * <li><strong>PayByBandwidth_nighthalf95</strong>: pay-by-95th percentile bandwidth (50% off during nighttime)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PayByBandwidth</p>
     */
    @NameInMap("InternetChargeType")
    public String internetChargeType;

    /**
     * <p>The time when the DCDN service was activated. The time follows the ISO 8601 standard.</p>
     * 
     * <strong>example:</strong>
     * <p>2018-03-19T11:16:11Z</p>
     */
    @NameInMap("OpeningTime")
    public String openingTime;

    /**
     * <p>The lock status of secure DCDN.</p>
     */
    @NameInMap("OperationLocks")
    public DescribeDcdnIpaServiceResponseBodyOperationLocks operationLocks;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>EF2AEBC2-EDBD-41CF-BF64-7E095D42D6EF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDcdnIpaServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnIpaServiceResponseBody self = new DescribeDcdnIpaServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnIpaServiceResponseBody setChangingAffectTime(String changingAffectTime) {
        this.changingAffectTime = changingAffectTime;
        return this;
    }
    public String getChangingAffectTime() {
        return this.changingAffectTime;
    }

    public DescribeDcdnIpaServiceResponseBody setChangingChargeType(String changingChargeType) {
        this.changingChargeType = changingChargeType;
        return this;
    }
    public String getChangingChargeType() {
        return this.changingChargeType;
    }

    public DescribeDcdnIpaServiceResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeDcdnIpaServiceResponseBody setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
        return this;
    }
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public DescribeDcdnIpaServiceResponseBody setOpeningTime(String openingTime) {
        this.openingTime = openingTime;
        return this;
    }
    public String getOpeningTime() {
        return this.openingTime;
    }

    public DescribeDcdnIpaServiceResponseBody setOperationLocks(DescribeDcdnIpaServiceResponseBodyOperationLocks operationLocks) {
        this.operationLocks = operationLocks;
        return this;
    }
    public DescribeDcdnIpaServiceResponseBodyOperationLocks getOperationLocks() {
        return this.operationLocks;
    }

    public DescribeDcdnIpaServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDcdnIpaServiceResponseBodyOperationLocksLockReason extends TeaModel {
        /**
         * <p>The reason why the instance is locked. For example, a value of <strong>financial</strong> indicates that an overdue payment exists.</p>
         * 
         * <strong>example:</strong>
         * <p>financial</p>
         */
        @NameInMap("LockReason")
        public String lockReason;

        public static DescribeDcdnIpaServiceResponseBodyOperationLocksLockReason build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnIpaServiceResponseBodyOperationLocksLockReason self = new DescribeDcdnIpaServiceResponseBodyOperationLocksLockReason();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnIpaServiceResponseBodyOperationLocksLockReason setLockReason(String lockReason) {
            this.lockReason = lockReason;
            return this;
        }
        public String getLockReason() {
            return this.lockReason;
        }

    }

    public static class DescribeDcdnIpaServiceResponseBodyOperationLocks extends TeaModel {
        @NameInMap("LockReason")
        public java.util.List<DescribeDcdnIpaServiceResponseBodyOperationLocksLockReason> lockReason;

        public static DescribeDcdnIpaServiceResponseBodyOperationLocks build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnIpaServiceResponseBodyOperationLocks self = new DescribeDcdnIpaServiceResponseBodyOperationLocks();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnIpaServiceResponseBodyOperationLocks setLockReason(java.util.List<DescribeDcdnIpaServiceResponseBodyOperationLocksLockReason> lockReason) {
            this.lockReason = lockReason;
            return this;
        }
        public java.util.List<DescribeDcdnIpaServiceResponseBodyOperationLocksLockReason> getLockReason() {
            return this.lockReason;
        }

    }

}
