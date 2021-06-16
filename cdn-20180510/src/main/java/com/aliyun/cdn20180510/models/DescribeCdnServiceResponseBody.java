// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnServiceResponseBody extends TeaModel {
    @NameInMap("ChangingAffectTime")
    public String changingAffectTime;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ChangingChargeType")
    public String changingChargeType;

    @NameInMap("OpeningTime")
    public String openingTime;

    @NameInMap("InternetChargeType")
    public String internetChargeType;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OperationLocks")
    public DescribeCdnServiceResponseBodyOperationLocks operationLocks;

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

    public DescribeCdnServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCdnServiceResponseBody setChangingChargeType(String changingChargeType) {
        this.changingChargeType = changingChargeType;
        return this;
    }
    public String getChangingChargeType() {
        return this.changingChargeType;
    }

    public DescribeCdnServiceResponseBody setOpeningTime(String openingTime) {
        this.openingTime = openingTime;
        return this;
    }
    public String getOpeningTime() {
        return this.openingTime;
    }

    public DescribeCdnServiceResponseBody setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
        return this;
    }
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public DescribeCdnServiceResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeCdnServiceResponseBody setOperationLocks(DescribeCdnServiceResponseBodyOperationLocks operationLocks) {
        this.operationLocks = operationLocks;
        return this;
    }
    public DescribeCdnServiceResponseBodyOperationLocks getOperationLocks() {
        return this.operationLocks;
    }

    public static class DescribeCdnServiceResponseBodyOperationLocksLockReason extends TeaModel {
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
