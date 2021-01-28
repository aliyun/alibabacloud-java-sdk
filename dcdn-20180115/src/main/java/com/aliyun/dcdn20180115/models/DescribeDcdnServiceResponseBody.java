// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnServiceResponseBody extends TeaModel {
    @NameInMap("WebsocketChangingType")
    public String websocketChangingType;

    @NameInMap("ChangingChargeType")
    public String changingChargeType;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("WebsocketType")
    public String websocketType;

    @NameInMap("OpeningTime")
    public String openingTime;

    @NameInMap("ChangingAffectTime")
    public String changingAffectTime;

    @NameInMap("OperationLocks")
    public DescribeDcdnServiceResponseBodyOperationLocks operationLocks;

    @NameInMap("WebsocketChangingTime")
    public String websocketChangingTime;

    @NameInMap("InternetChargeType")
    public String internetChargeType;

    public static DescribeDcdnServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnServiceResponseBody self = new DescribeDcdnServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnServiceResponseBody setWebsocketChangingType(String websocketChangingType) {
        this.websocketChangingType = websocketChangingType;
        return this;
    }
    public String getWebsocketChangingType() {
        return this.websocketChangingType;
    }

    public DescribeDcdnServiceResponseBody setChangingChargeType(String changingChargeType) {
        this.changingChargeType = changingChargeType;
        return this;
    }
    public String getChangingChargeType() {
        return this.changingChargeType;
    }

    public DescribeDcdnServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDcdnServiceResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeDcdnServiceResponseBody setWebsocketType(String websocketType) {
        this.websocketType = websocketType;
        return this;
    }
    public String getWebsocketType() {
        return this.websocketType;
    }

    public DescribeDcdnServiceResponseBody setOpeningTime(String openingTime) {
        this.openingTime = openingTime;
        return this;
    }
    public String getOpeningTime() {
        return this.openingTime;
    }

    public DescribeDcdnServiceResponseBody setChangingAffectTime(String changingAffectTime) {
        this.changingAffectTime = changingAffectTime;
        return this;
    }
    public String getChangingAffectTime() {
        return this.changingAffectTime;
    }

    public DescribeDcdnServiceResponseBody setOperationLocks(DescribeDcdnServiceResponseBodyOperationLocks operationLocks) {
        this.operationLocks = operationLocks;
        return this;
    }
    public DescribeDcdnServiceResponseBodyOperationLocks getOperationLocks() {
        return this.operationLocks;
    }

    public DescribeDcdnServiceResponseBody setWebsocketChangingTime(String websocketChangingTime) {
        this.websocketChangingTime = websocketChangingTime;
        return this;
    }
    public String getWebsocketChangingTime() {
        return this.websocketChangingTime;
    }

    public DescribeDcdnServiceResponseBody setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
        return this;
    }
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public static class DescribeDcdnServiceResponseBodyOperationLocksLockReason extends TeaModel {
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
