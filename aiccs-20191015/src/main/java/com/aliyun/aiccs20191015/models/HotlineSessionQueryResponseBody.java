// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class HotlineSessionQueryResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public HotlineSessionQueryResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>EE339D98-9BD3-4413-B165</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

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

    public HotlineSessionQueryResponseBody setData(HotlineSessionQueryResponseBodyData data) {
        this.data = data;
        return this;
    }
    public HotlineSessionQueryResponseBodyData getData() {
        return this.data;
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

    public static class HotlineSessionQueryResponseBodyDataCallDetailRecord extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>7719786</p>
         */
        @NameInMap("Acid")
        public String acid;

        /**
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("ActiveTransferId")
        public String activeTransferId;

        /**
         * <strong>example:</strong>
         * <p>37</p>
         */
        @NameInMap("CallContinueTime")
        public Integer callContinueTime;

        /**
         * <strong>example:</strong>
         * <p>normal</p>
         */
        @NameInMap("CallResult")
        public String callResult;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CallType")
        public Integer callType;

        /**
         * <strong>example:</strong>
         * <p>135615*****</p>
         */
        @NameInMap("CalledNumber")
        public String calledNumber;

        /**
         * <strong>example:</strong>
         * <p>0571773</p>
         */
        @NameInMap("CallingNumber")
        public String callingNumber;

        /**
         * <strong>example:</strong>
         * <p>2020-10-02 22:32:55</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("EvaluationLevel")
        public Integer evaluationLevel;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("EvaluationScore")
        public Integer evaluationScore;

        /**
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("GroupId")
        public Long groupId;

        @NameInMap("GroupName")
        public String groupName;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("HangUpRole")
        public String hangUpRole;

        /**
         * <strong>example:</strong>
         * <p>2020-10-02 22:33:46</p>
         */
        @NameInMap("HangUpTime")
        public String hangUpTime;

        /**
         * <strong>example:</strong>
         * <p>acc1c58dab4a4dd280e3813c66</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>2020-10-02 22:32:55</p>
         */
        @NameInMap("InQueueTime")
        public String inQueueTime;

        /**
         * <strong>example:</strong>
         * <p>7856876</p>
         */
        @NameInMap("MemberId")
        public String memberId;

        @NameInMap("MemberName")
        public String memberName;

        /**
         * <strong>example:</strong>
         * <p>2020-10-02 22:32:59</p>
         */
        @NameInMap("OutQueueTime")
        public String outQueueTime;

        /**
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("PassiveTransferId")
        public String passiveTransferId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PassiveTransferIdType")
        public String passiveTransferIdType;

        /**
         * <strong>example:</strong>
         * <p>2020-10-02 22:33:09</p>
         */
        @NameInMap("PickUpTime")
        public String pickUpTime;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("QueueUpContinueTime")
        public Integer queueUpContinueTime;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("RingContinueTime")
        public Integer ringContinueTime;

        /**
         * <strong>example:</strong>
         * <p>2020-10-02 22:33:09</p>
         */
        @NameInMap("RingEndTime")
        public String ringEndTime;

        /**
         * <strong>example:</strong>
         * <p>2020-10-02 22:32:59</p>
         */
        @NameInMap("RingStartTime")
        public String ringStartTime;

        /**
         * <strong>example:</strong>
         * <p>555555</p>
         */
        @NameInMap("ServicerId")
        public String servicerId;

        @NameInMap("ServicerName")
        public String servicerName;

        /**
         * <strong>example:</strong>
         * <p>1861111****</p>
         */
        @NameInMap("TrunkCall")
        public String trunkCall;

        public static HotlineSessionQueryResponseBodyDataCallDetailRecord build(java.util.Map<String, ?> map) throws Exception {
            HotlineSessionQueryResponseBodyDataCallDetailRecord self = new HotlineSessionQueryResponseBodyDataCallDetailRecord();
            return TeaModel.build(map, self);
        }

        public HotlineSessionQueryResponseBodyDataCallDetailRecord setAcid(String acid) {
            this.acid = acid;
            return this;
        }
        public String getAcid() {
            return this.acid;
        }

        public HotlineSessionQueryResponseBodyDataCallDetailRecord setActiveTransferId(String activeTransferId) {
            this.activeTransferId = activeTransferId;
            return this;
        }
        public String getActiveTransferId() {
            return this.activeTransferId;
        }

        public HotlineSessionQueryResponseBodyDataCallDetailRecord setCallContinueTime(Integer callContinueTime) {
            this.callContinueTime = callContinueTime;
            return this;
        }
        public Integer getCallContinueTime() {
            return this.callContinueTime;
        }

        public HotlineSessionQueryResponseBodyDataCallDetailRecord setCallResult(String callResult) {
            this.callResult = callResult;
            return this;
        }
        public String getCallResult() {
            return this.callResult;
        }

        public HotlineSessionQueryResponseBodyDataCallDetailRecord setCallType(Integer callType) {
            this.callType = callType;
            return this;
        }
        public Integer getCallType() {
            return this.callType;
        }

        public HotlineSessionQueryResponseBodyDataCallDetailRecord setCalledNumber(String calledNumber) {
            this.calledNumber = calledNumber;
            return this;
        }
        public String getCalledNumber() {
            return this.calledNumber;
        }

        public HotlineSessionQueryResponseBodyDataCallDetailRecord setCallingNumber(String callingNumber) {
            this.callingNumber = callingNumber;
            return this;
        }
        public String getCallingNumber() {
            return this.callingNumber;
        }

        public HotlineSessionQueryResponseBodyDataCallDetailRecord setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public HotlineSessionQueryResponseBodyDataCallDetailRecord setEvaluationLevel(Integer evaluationLevel) {
            this.evaluationLevel = evaluationLevel;
            return this;
        }
        public Integer getEvaluationLevel() {
            return this.evaluationLevel;
        }

        public HotlineSessionQueryResponseBodyDataCallDetailRecord setEvaluationScore(Integer evaluationScore) {
            this.evaluationScore = evaluationScore;
            return this;
        }
        public Integer getEvaluationScore() {
            return this.evaluationScore;
        }

        public HotlineSessionQueryResponseBodyDataCallDetailRecord setGroupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }
        public Long getGroupId() {
            return this.groupId;
        }

        public HotlineSessionQueryResponseBodyDataCallDetailRecord setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public HotlineSessionQueryResponseBodyDataCallDetailRecord setHangUpRole(String hangUpRole) {
            this.hangUpRole = hangUpRole;
            return this;
        }
        public String getHangUpRole() {
            return this.hangUpRole;
        }

        public HotlineSessionQueryResponseBodyDataCallDetailRecord setHangUpTime(String hangUpTime) {
            this.hangUpTime = hangUpTime;
            return this;
        }
        public String getHangUpTime() {
            return this.hangUpTime;
        }

        public HotlineSessionQueryResponseBodyDataCallDetailRecord setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public HotlineSessionQueryResponseBodyDataCallDetailRecord setInQueueTime(String inQueueTime) {
            this.inQueueTime = inQueueTime;
            return this;
        }
        public String getInQueueTime() {
            return this.inQueueTime;
        }

        public HotlineSessionQueryResponseBodyDataCallDetailRecord setMemberId(String memberId) {
            this.memberId = memberId;
            return this;
        }
        public String getMemberId() {
            return this.memberId;
        }

        public HotlineSessionQueryResponseBodyDataCallDetailRecord setMemberName(String memberName) {
            this.memberName = memberName;
            return this;
        }
        public String getMemberName() {
            return this.memberName;
        }

        public HotlineSessionQueryResponseBodyDataCallDetailRecord setOutQueueTime(String outQueueTime) {
            this.outQueueTime = outQueueTime;
            return this;
        }
        public String getOutQueueTime() {
            return this.outQueueTime;
        }

        public HotlineSessionQueryResponseBodyDataCallDetailRecord setPassiveTransferId(String passiveTransferId) {
            this.passiveTransferId = passiveTransferId;
            return this;
        }
        public String getPassiveTransferId() {
            return this.passiveTransferId;
        }

        public HotlineSessionQueryResponseBodyDataCallDetailRecord setPassiveTransferIdType(String passiveTransferIdType) {
            this.passiveTransferIdType = passiveTransferIdType;
            return this;
        }
        public String getPassiveTransferIdType() {
            return this.passiveTransferIdType;
        }

        public HotlineSessionQueryResponseBodyDataCallDetailRecord setPickUpTime(String pickUpTime) {
            this.pickUpTime = pickUpTime;
            return this;
        }
        public String getPickUpTime() {
            return this.pickUpTime;
        }

        public HotlineSessionQueryResponseBodyDataCallDetailRecord setQueueUpContinueTime(Integer queueUpContinueTime) {
            this.queueUpContinueTime = queueUpContinueTime;
            return this;
        }
        public Integer getQueueUpContinueTime() {
            return this.queueUpContinueTime;
        }

        public HotlineSessionQueryResponseBodyDataCallDetailRecord setRingContinueTime(Integer ringContinueTime) {
            this.ringContinueTime = ringContinueTime;
            return this;
        }
        public Integer getRingContinueTime() {
            return this.ringContinueTime;
        }

        public HotlineSessionQueryResponseBodyDataCallDetailRecord setRingEndTime(String ringEndTime) {
            this.ringEndTime = ringEndTime;
            return this;
        }
        public String getRingEndTime() {
            return this.ringEndTime;
        }

        public HotlineSessionQueryResponseBodyDataCallDetailRecord setRingStartTime(String ringStartTime) {
            this.ringStartTime = ringStartTime;
            return this;
        }
        public String getRingStartTime() {
            return this.ringStartTime;
        }

        public HotlineSessionQueryResponseBodyDataCallDetailRecord setServicerId(String servicerId) {
            this.servicerId = servicerId;
            return this;
        }
        public String getServicerId() {
            return this.servicerId;
        }

        public HotlineSessionQueryResponseBodyDataCallDetailRecord setServicerName(String servicerName) {
            this.servicerName = servicerName;
            return this;
        }
        public String getServicerName() {
            return this.servicerName;
        }

        public HotlineSessionQueryResponseBodyDataCallDetailRecord setTrunkCall(String trunkCall) {
            this.trunkCall = trunkCall;
            return this;
        }
        public String getTrunkCall() {
            return this.trunkCall;
        }

    }

    public static class HotlineSessionQueryResponseBodyData extends TeaModel {
        @NameInMap("CallDetailRecord")
        public java.util.List<HotlineSessionQueryResponseBodyDataCallDetailRecord> callDetailRecord;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>26</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static HotlineSessionQueryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            HotlineSessionQueryResponseBodyData self = new HotlineSessionQueryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public HotlineSessionQueryResponseBodyData setCallDetailRecord(java.util.List<HotlineSessionQueryResponseBodyDataCallDetailRecord> callDetailRecord) {
            this.callDetailRecord = callDetailRecord;
            return this;
        }
        public java.util.List<HotlineSessionQueryResponseBodyDataCallDetailRecord> getCallDetailRecord() {
            return this.callDetailRecord;
        }

        public HotlineSessionQueryResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public HotlineSessionQueryResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public HotlineSessionQueryResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
