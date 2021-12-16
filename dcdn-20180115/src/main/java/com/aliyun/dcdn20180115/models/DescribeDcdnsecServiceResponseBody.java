// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnsecServiceResponseBody extends TeaModel {
    @NameInMap("ChangingAffectTime")
    public String changingAffectTime;

    @NameInMap("ChangingChargeType")
    public String changingChargeType;

    @NameInMap("DomainNum")
    public String domainNum;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("FlowType")
    public String flowType;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("InternetChargeType")
    public String internetChargeType;

    @NameInMap("OperationLocks")
    public DescribeDcdnsecServiceResponseBodyOperationLocks operationLocks;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RequestType")
    public String requestType;

    @NameInMap("StartTime")
    public String startTime;

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
