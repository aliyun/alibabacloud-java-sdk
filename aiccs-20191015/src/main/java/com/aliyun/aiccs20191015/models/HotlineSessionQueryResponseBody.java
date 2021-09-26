// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class HotlineSessionQueryResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Data")
    public HotlineSessionQueryResponseBodyData data;

    public static HotlineSessionQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        HotlineSessionQueryResponseBody self = new HotlineSessionQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public HotlineSessionQueryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public HotlineSessionQueryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public HotlineSessionQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public HotlineSessionQueryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public HotlineSessionQueryResponseBody setData(HotlineSessionQueryResponseBodyData data) {
        this.data = data;
        return this;
    }
    public HotlineSessionQueryResponseBodyData getData() {
        return this.data;
    }

    public static class HotlineSessionQueryResponseBodyDataCallDetailRecord extends TeaModel {
        @NameInMap("CallResult")
        public String callResult;

        @NameInMap("TrunkCall")
        public String trunkCall;

        @NameInMap("ServicerName")
        public String servicerName;

        @NameInMap("OutQueueTime")
        public String outQueueTime;

        @NameInMap("CallContinueTime")
        public Integer callContinueTime;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("PickUpTime")
        public String pickUpTime;

        @NameInMap("RingContinueTime")
        public Integer ringContinueTime;

        @NameInMap("CalledNumber")
        public String calledNumber;

        @NameInMap("ServicerId")
        public String servicerId;

        @NameInMap("HangUpTime")
        public String hangUpTime;

        @NameInMap("EvaluationLevel")
        public Integer evaluationLevel;

        @NameInMap("PassiveTransferId")
        public String passiveTransferId;

        @NameInMap("ActiveTransferId")
        public String activeTransferId;

        @NameInMap("HangUpRole")
        public String hangUpRole;

        @NameInMap("PassiveTransferIdType")
        public String passiveTransferIdType;

        @NameInMap("MemberName")
        public String memberName;

        @NameInMap("EvaluationScore")
        public Integer evaluationScore;

        @NameInMap("Acid")
        public String acid;

        @NameInMap("RingStartTime")
        public String ringStartTime;

        @NameInMap("CallType")
        public Integer callType;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("GroupId")
        public Long groupId;

        @NameInMap("RingEndTime")
        public String ringEndTime;

        @NameInMap("InQueueTime")
        public String inQueueTime;

        @NameInMap("CallingNumber")
        public String callingNumber;

        @NameInMap("MemberId")
        public String memberId;

        @NameInMap("QueueUpContinueTime")
        public Integer queueUpContinueTime;

        @NameInMap("Id")
        public String id;

        public static HotlineSessionQueryResponseBodyDataCallDetailRecord build(java.util.Map<String, ?> map) throws Exception {
            HotlineSessionQueryResponseBodyDataCallDetailRecord self = new HotlineSessionQueryResponseBodyDataCallDetailRecord();
            return TeaModel.build(map, self);
        }

        public HotlineSessionQueryResponseBodyDataCallDetailRecord setCallResult(String callResult) {
            this.callResult = callResult;
            return this;
        }
        public String getCallResult() {
            return this.callResult;
        }

        public HotlineSessionQueryResponseBodyDataCallDetailRecord setTrunkCall(String trunkCall) {
            this.trunkCall = trunkCall;
            return this;
        }
        public String getTrunkCall() {
            return this.trunkCall;
        }

        public HotlineSessionQueryResponseBodyDataCallDetailRecord setServicerName(String servicerName) {
            this.servicerName = servicerName;
            return this;
        }
        public String getServicerName() {
            return this.servicerName;
        }

        public HotlineSessionQueryResponseBodyDataCallDetailRecord setOutQueueTime(String outQueueTime) {
            this.outQueueTime = outQueueTime;
            return this;
        }
        public String getOutQueueTime() {
            return this.outQueueTime;
        }

        public HotlineSessionQueryResponseBodyDataCallDetailRecord setCallContinueTime(Integer callContinueTime) {
            this.callContinueTime = callContinueTime;
            return this;
        }
        public Integer getCallContinueTime() {
            return this.callContinueTime;
        }

        public HotlineSessionQueryResponseBodyDataCallDetailRecord setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public HotlineSessionQueryResponseBodyDataCallDetailRecord setPickUpTime(String pickUpTime) {
            this.pickUpTime = pickUpTime;
            return this;
        }
        public String getPickUpTime() {
            return this.pickUpTime;
        }

        public HotlineSessionQueryResponseBodyDataCallDetailRecord setRingContinueTime(Integer ringContinueTime) {
            this.ringContinueTime = ringContinueTime;
            return this;
        }
        public Integer getRingContinueTime() {
            return this.ringContinueTime;
        }

        public HotlineSessionQueryResponseBodyDataCallDetailRecord setCalledNumber(String calledNumber) {
            this.calledNumber = calledNumber;
            return this;
        }
        public String getCalledNumber() {
            return this.calledNumber;
        }

        public HotlineSessionQueryResponseBodyDataCallDetailRecord setServicerId(String servicerId) {
            this.servicerId = servicerId;
            return this;
        }
        public String getServicerId() {
            return this.servicerId;
        }

        public HotlineSessionQueryResponseBodyDataCallDetailRecord setHangUpTime(String hangUpTime) {
            this.hangUpTime = hangUpTime;
            return this;
        }
        public String getHangUpTime() {
            return this.hangUpTime;
        }

        public HotlineSessionQueryResponseBodyDataCallDetailRecord setEvaluationLevel(Integer evaluationLevel) {
            this.evaluationLevel = evaluationLevel;
            return this;
        }
        public Integer getEvaluationLevel() {
            return this.evaluationLevel;
        }

        public HotlineSessionQueryResponseBodyDataCallDetailRecord setPassiveTransferId(String passiveTransferId) {
            this.passiveTransferId = passiveTransferId;
            return this;
        }
        public String getPassiveTransferId() {
            return this.passiveTransferId;
        }

        public HotlineSessionQueryResponseBodyDataCallDetailRecord setActiveTransferId(String activeTransferId) {
            this.activeTransferId = activeTransferId;
            return this;
        }
        public String getActiveTransferId() {
            return this.activeTransferId;
        }

        public HotlineSessionQueryResponseBodyDataCallDetailRecord setHangUpRole(String hangUpRole) {
            this.hangUpRole = hangUpRole;
            return this;
        }
        public String getHangUpRole() {
            return this.hangUpRole;
        }

        public HotlineSessionQueryResponseBodyDataCallDetailRecord setPassiveTransferIdType(String passiveTransferIdType) {
            this.passiveTransferIdType = passiveTransferIdType;
            return this;
        }
        public String getPassiveTransferIdType() {
            return this.passiveTransferIdType;
        }

        public HotlineSessionQueryResponseBodyDataCallDetailRecord setMemberName(String memberName) {
            this.memberName = memberName;
            return this;
        }
        public String getMemberName() {
            return this.memberName;
        }

        public HotlineSessionQueryResponseBodyDataCallDetailRecord setEvaluationScore(Integer evaluationScore) {
            this.evaluationScore = evaluationScore;
            return this;
        }
        public Integer getEvaluationScore() {
            return this.evaluationScore;
        }

        public HotlineSessionQueryResponseBodyDataCallDetailRecord setAcid(String acid) {
            this.acid = acid;
            return this;
        }
        public String getAcid() {
            return this.acid;
        }

        public HotlineSessionQueryResponseBodyDataCallDetailRecord setRingStartTime(String ringStartTime) {
            this.ringStartTime = ringStartTime;
            return this;
        }
        public String getRingStartTime() {
            return this.ringStartTime;
        }

        public HotlineSessionQueryResponseBodyDataCallDetailRecord setCallType(Integer callType) {
            this.callType = callType;
            return this;
        }
        public Integer getCallType() {
            return this.callType;
        }

        public HotlineSessionQueryResponseBodyDataCallDetailRecord setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public HotlineSessionQueryResponseBodyDataCallDetailRecord setGroupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }
        public Long getGroupId() {
            return this.groupId;
        }

        public HotlineSessionQueryResponseBodyDataCallDetailRecord setRingEndTime(String ringEndTime) {
            this.ringEndTime = ringEndTime;
            return this;
        }
        public String getRingEndTime() {
            return this.ringEndTime;
        }

        public HotlineSessionQueryResponseBodyDataCallDetailRecord setInQueueTime(String inQueueTime) {
            this.inQueueTime = inQueueTime;
            return this;
        }
        public String getInQueueTime() {
            return this.inQueueTime;
        }

        public HotlineSessionQueryResponseBodyDataCallDetailRecord setCallingNumber(String callingNumber) {
            this.callingNumber = callingNumber;
            return this;
        }
        public String getCallingNumber() {
            return this.callingNumber;
        }

        public HotlineSessionQueryResponseBodyDataCallDetailRecord setMemberId(String memberId) {
            this.memberId = memberId;
            return this;
        }
        public String getMemberId() {
            return this.memberId;
        }

        public HotlineSessionQueryResponseBodyDataCallDetailRecord setQueueUpContinueTime(Integer queueUpContinueTime) {
            this.queueUpContinueTime = queueUpContinueTime;
            return this;
        }
        public Integer getQueueUpContinueTime() {
            return this.queueUpContinueTime;
        }

        public HotlineSessionQueryResponseBodyDataCallDetailRecord setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class HotlineSessionQueryResponseBodyData extends TeaModel {
        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("CallDetailRecord")
        public java.util.List<HotlineSessionQueryResponseBodyDataCallDetailRecord> callDetailRecord;

        public static HotlineSessionQueryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            HotlineSessionQueryResponseBodyData self = new HotlineSessionQueryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public HotlineSessionQueryResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public HotlineSessionQueryResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public HotlineSessionQueryResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public HotlineSessionQueryResponseBodyData setCallDetailRecord(java.util.List<HotlineSessionQueryResponseBodyDataCallDetailRecord> callDetailRecord) {
            this.callDetailRecord = callDetailRecord;
            return this;
        }
        public java.util.List<HotlineSessionQueryResponseBodyDataCallDetailRecord> getCallDetailRecord() {
            return this.callDetailRecord;
        }

    }

}
