// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnServiceResponseBody extends TeaModel {
    /**
     * <p>The time when the renewed secure DCDN takes effect. The time is displayed in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2018-03-31T16:00:00Z</p>
     */
    @NameInMap("ChangingAffectTime")
    public String changingAffectTime;

    /**
     * <p>The new metering method for the renewed secure DCDN. Valid values:</p>
     * <ul>
     * <li><strong>PayByTraffic</strong>: pay by data transfer</li>
     * <li><strong>PayByBandwidth</strong>: pay by bandwidth</li>
     * <li><strong>PayByBandwidth95</strong>: pay by 95th percentile bandwidth</li>
     * <li><strong>PayByBandwidth_monthavg</strong>: pay by monthly average bandwidth</li>
     * <li><strong>PayByBandwidth_month4th</strong>: pay by fourth peak bandwidth per month</li>
     * <li><strong>PayByBandwidth_monthday95avg</strong>: pay by monthly average 95th percentile bandwidth</li>
     * <li><strong>PayByBandwidth_nighthalf95</strong>: pay by 95th percentile bandwidth (50% off during nighttime)</li>
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
     * <p>FP-mkqgwxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The current metering method. Valid values:</p>
     * <ul>
     * <li><strong>PayByTraffic</strong>: pay by data transfer</li>
     * <li><strong>PayByBandwidth</strong>: pay by bandwidth</li>
     * <li><strong>PayByBandwidth95</strong>: pay by 95th percentile bandwidth</li>
     * <li><strong>PayByBandwidth_monthavg</strong>: pay by monthly average bandwidth</li>
     * <li><strong>PayByBandwidth_month4th</strong>: pay by fourth peak bandwidth per month</li>
     * <li><strong>PayByBandwidth_monthday95avg</strong>: pay by monthly average 95th percentile bandwidth</li>
     * <li><strong>PayByBandwidth_nighthalf95</strong>: pay by 95th percentile bandwidth (50% off during nighttime)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PayByTraffic</p>
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
     * <p>The lock status of DCDN.</p>
     */
    @NameInMap("OperationLocks")
    public DescribeDcdnServiceResponseBodyOperationLocks operationLocks;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EF2AEBC2-EDBD-41CF-BF64-7E095D42D6EF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The time when the changes of the WebSocket configuration take effect. The value is the same as that of the ChangingAffectTime parameter. This parameter can be displayed in the console only if the specified time is later than the current time.</p>
     * 
     * <strong>example:</strong>
     * <p>2018-03-19T11:16:11Z</p>
     */
    @NameInMap("WebsocketChangingTime")
    public String websocketChangingTime;

    /**
     * <p>The next effective billing method of WebSocket. Valid values: <strong>websockettraffic</strong> and <strong>websocketbps</strong>. A value of websockettraffic indicates that you are billed based on the traffic volume. A value of websocketbps indicates that you are billed based on the bandwidth.</p>
     * 
     * <strong>example:</strong>
     * <p>websocketbps</p>
     */
    @NameInMap("WebsocketChangingType")
    public String websocketChangingType;

    /**
     * <p>The current billing method of WebSocket. Valid values: <strong>websockettraffic</strong> and <strong>websocketbps</strong>. A value of websockettraffic indicates that you are billed based on the traffic volume. A value of websocketbps indicates that you are billed based on the bandwidth.</p>
     * 
     * <strong>example:</strong>
     * <p>websocketbps</p>
     */
    @NameInMap("WebsocketType")
    public String websocketType;

    public static DescribeDcdnServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnServiceResponseBody self = new DescribeDcdnServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnServiceResponseBody setChangingAffectTime(String changingAffectTime) {
        this.changingAffectTime = changingAffectTime;
        return this;
    }
    public String getChangingAffectTime() {
        return this.changingAffectTime;
    }

    public DescribeDcdnServiceResponseBody setChangingChargeType(String changingChargeType) {
        this.changingChargeType = changingChargeType;
        return this;
    }
    public String getChangingChargeType() {
        return this.changingChargeType;
    }

    public DescribeDcdnServiceResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeDcdnServiceResponseBody setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
        return this;
    }
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public DescribeDcdnServiceResponseBody setOpeningTime(String openingTime) {
        this.openingTime = openingTime;
        return this;
    }
    public String getOpeningTime() {
        return this.openingTime;
    }

    public DescribeDcdnServiceResponseBody setOperationLocks(DescribeDcdnServiceResponseBodyOperationLocks operationLocks) {
        this.operationLocks = operationLocks;
        return this;
    }
    public DescribeDcdnServiceResponseBodyOperationLocks getOperationLocks() {
        return this.operationLocks;
    }

    public DescribeDcdnServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDcdnServiceResponseBody setWebsocketChangingTime(String websocketChangingTime) {
        this.websocketChangingTime = websocketChangingTime;
        return this;
    }
    public String getWebsocketChangingTime() {
        return this.websocketChangingTime;
    }

    public DescribeDcdnServiceResponseBody setWebsocketChangingType(String websocketChangingType) {
        this.websocketChangingType = websocketChangingType;
        return this;
    }
    public String getWebsocketChangingType() {
        return this.websocketChangingType;
    }

    public DescribeDcdnServiceResponseBody setWebsocketType(String websocketType) {
        this.websocketType = websocketType;
        return this;
    }
    public String getWebsocketType() {
        return this.websocketType;
    }

    public static class DescribeDcdnServiceResponseBodyOperationLocksLockReason extends TeaModel {
        /**
         * <p>The reason why secure DCDN was locked. For example, a value of financial indicates that an overdue payment exists.</p>
         * 
         * <strong>example:</strong>
         * <p>financial</p>
         */
        @NameInMap("LockReason")
        public String lockReason;

        public static DescribeDcdnServiceResponseBodyOperationLocksLockReason build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnServiceResponseBodyOperationLocksLockReason self = new DescribeDcdnServiceResponseBodyOperationLocksLockReason();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnServiceResponseBodyOperationLocksLockReason setLockReason(String lockReason) {
            this.lockReason = lockReason;
            return this;
        }
        public String getLockReason() {
            return this.lockReason;
        }

    }

    public static class DescribeDcdnServiceResponseBodyOperationLocks extends TeaModel {
        @NameInMap("LockReason")
        public java.util.List<DescribeDcdnServiceResponseBodyOperationLocksLockReason> lockReason;

        public static DescribeDcdnServiceResponseBodyOperationLocks build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnServiceResponseBodyOperationLocks self = new DescribeDcdnServiceResponseBodyOperationLocks();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnServiceResponseBodyOperationLocks setLockReason(java.util.List<DescribeDcdnServiceResponseBodyOperationLocksLockReason> lockReason) {
            this.lockReason = lockReason;
            return this;
        }
        public java.util.List<DescribeDcdnServiceResponseBodyOperationLocksLockReason> getLockReason() {
            return this.lockReason;
        }

    }

}
