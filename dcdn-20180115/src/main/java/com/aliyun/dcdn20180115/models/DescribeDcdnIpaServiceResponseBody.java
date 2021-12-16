// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnIpaServiceResponseBody extends TeaModel {
    @NameInMap("ChangingAffectTime")
    public String changingAffectTime;

    @NameInMap("ChangingChargeType")
    public String changingChargeType;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("InternetChargeType")
    public String internetChargeType;

    @NameInMap("OpeningTime")
    public String openingTime;

    @NameInMap("OperationLocks")
    public DescribeDcdnIpaServiceResponseBodyOperationLocks operationLocks;

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
