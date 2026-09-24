// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class HotlineSessionQueryResponseBody extends TeaModel {
    /**
     * <p>The status code. A value of Success indicates that the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The call data.</p>
     */
    @NameInMap("Data")
    public HotlineSessionQueryResponseBodyData data;

    /**
     * <p>The description of the status code.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EE339D98-9BD3-4413-B165</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the API call was successful.</p>
     * 
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
         * <p>The session ID. The acid in the websocket after an inbound call.</p>
         * 
         * <strong>example:</strong>
         * <p>7719786</p>
         */
        @NameInMap("Acid")
        public String acid;

        /**
         * <p>The agent ID.</p>
         * <blockquote>
         * <p>This value is Null in non-transfer scenarios.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("ActiveTransferId")
        public String activeTransferId;

        /**
         * <p>The call duration. Unit: seconds.</p>
         * <blockquote>
         * <p>No call duration is available in scenarios where the call is not connected.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>37</p>
         */
        @NameInMap("CallContinueTime")
        public Integer callContinueTime;

        /**
         * <p>The call result. Valid values:</p>
         * <ul>
         * <li><strong>normal</strong>: normal hangup.</li>
         * <li><strong>touchRouteError</strong>: queue hangup.</li>
         * <li><strong>touchInQueue</strong>: queue hangup.</li>
         * <li><strong>touchInLoss</strong>: queue hangup.</li>
         * <li><strong>userHangup</strong>: user hangup or IVR hangup.</li>
         * <li><strong>sysHangup</strong>: system hangup or IVR hangup.</li>
         * <li><strong>transferAgent</strong>: user hangup or IVR hangup.</li>
         * <li><strong>dailing</strong>: agent hangup or ringing hangup.</li>
         * <li><strong>TouchRingCallLoss</strong>: queue hangup or ringing hangup.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        @NameInMap("CallResult")
        public String callResult;

        /**
         * <p>The call type. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: outbound call</li>
         * <li><strong>2</strong>: inbound call</li>
         * <li><strong>3</strong>: transferred call</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CallType")
        public Integer callType;

        /**
         * <p>The called number.</p>
         * 
         * <strong>example:</strong>
         * <p>135615*****</p>
         */
        @NameInMap("CalledNumber")
        public String calledNumber;

        /**
         * <p>The number of the caller. For example, a mobile phone number of a user, an agent number, or a robot number.</p>
         * 
         * <strong>example:</strong>
         * <p>0571773</p>
         */
        @NameInMap("CallingNumber")
        public String callingNumber;

        /**
         * <p>The time when the call was created. Format: YYYY-MM-DD HH:mm:ss.</p>
         * <blockquote>
         * <ul>
         * <li>For outbound call scenarios, this is the time when the outbound call was initiated.</li>
         * </ul>
         * </blockquote>
         * <ul>
         * <li>For inbound call scenarios, this is the time when the call entered the ACC system.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2020-10-02 22:32:55</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The satisfaction rating level. Valid values:</p>
         * <ul>
         * <li><strong>2</strong>: 2-level satisfaction</li>
         * <li><strong>3</strong>: 3-level satisfaction</li>
         * <li><strong>4</strong>: 4-level satisfaction</li>
         * <li><strong>5</strong>: 5-level satisfaction</li>
         * </ul>
         * <blockquote>
         * <p>No data is available for outbound call scenarios or scenarios where the call is not connected.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("EvaluationLevel")
        public Integer evaluationLevel;

        /**
         * <p>The satisfaction rating score. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Very dissatisfied.</li>
         * <li><strong>2</strong>: Dissatisfied.</li>
         * <li><strong>3</strong>: Average.</li>
         * <li><strong>4</strong>: Satisfied.</li>
         * <li><strong>5</strong>: Very satisfied.</li>
         * </ul>
         * <blockquote>
         * <p>No data is available for outbound call scenarios or scenarios where the call is not connected.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("EvaluationScore")
        public Integer evaluationScore;

        /**
         * <p>The skill group ID.</p>
         * <blockquote>
         * <p>When CallType is set to <strong>1</strong>, no skill group information is available for outbound call scenarios.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("GroupId")
        public Long groupId;

        /**
         * <p>The skill group name.</p>
         * <blockquote>
         * <p>When CallType is set to <strong>1</strong>, no skill group information is available for outbound call scenarios.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>AutomationSkillGroup</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The party that hung up. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: System hung up.</li>
         * <li><strong>2</strong>: Customer hung up.</li>
         * <li><strong>3</strong>: Agent hung up.</li>
         * <li><strong>null</strong>: Unknown.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("HangUpRole")
        public String hangUpRole;

        /**
         * <p>The hang-up time. Format: YYYY-MM-DD HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-10-02 22:33:46</p>
         */
        @NameInMap("HangUpTime")
        public String hangUpTime;

        /**
         * <p>The globally unique ID of the call details.</p>
         * 
         * <strong>example:</strong>
         * <p>acc1c58dab4a4dd280e3813c66</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The time when the call entered the queue for hotline assignment. Format: YYYY-MM-DD HH:mm:ss.</p>
         * <blockquote>
         * <p>No queue entry time is available for outbound call scenarios.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2020-10-02 22:32:55</p>
         */
        @NameInMap("InQueueTime")
        public String inQueueTime;

        /**
         * <p>The member ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7856876</p>
         */
        @NameInMap("MemberId")
        public String memberId;

        /**
         * <p>The member name.</p>
         * 
         * <strong>example:</strong>
         * <p>AnonymousMember</p>
         */
        @NameInMap("MemberName")
        public String memberName;

        /**
         * <p>The time when the call left the queue for hotline assignment. Format: YYYY-MM-DD HH:mm:ss.</p>
         * <blockquote>
         * <p>No queue exit time is available for outbound call scenarios.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2020-10-02 22:32:59</p>
         */
        @NameInMap("OutQueueTime")
        public String outQueueTime;

        /**
         * <p>The agent ID or transferred phone number.</p>
         * <blockquote>
         * <p>This value is Null in non-transfer scenarios.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("PassiveTransferId")
        public String passiveTransferId;

        /**
         * <p>The type of the party to which the session was transferred. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Agent ID.</li>
         * <li><strong>2</strong>: Transferred phone number.</li>
         * </ul>
         * <blockquote>
         * <p>This value is Null in non-transfer scenarios.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PassiveTransferIdType")
        public String passiveTransferIdType;

        /**
         * <p>The time when the call was answered. Format: YYYY-MM-DD HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-10-02 22:33:09</p>
         */
        @NameInMap("PickUpTime")
        public String pickUpTime;

        /**
         * <p>The queue waiting duration.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("QueueUpContinueTime")
        public Integer queueUpContinueTime;

        /**
         * <p>The ringing duration. Unit: seconds.</p>
         * <blockquote>
         * <p>No ringing duration is available for outbound call scenarios.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("RingContinueTime")
        public Integer ringContinueTime;

        /**
         * <p>The time when ringing ended. Format: YYYY-MM-DD HH:mm:ss.</p>
         * <blockquote>
         * <p>No ringing end time is available for outbound call scenarios.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2020-10-02 22:33:09</p>
         */
        @NameInMap("RingEndTime")
        public String ringEndTime;

        /**
         * <p>The time when ringing started. Format: YYYY-MM-DD HH:mm:ss.</p>
         * <blockquote>
         * <p>No ringing start time is available for outbound call scenarios.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2020-10-02 22:32:59</p>
         */
        @NameInMap("RingStartTime")
        public String ringStartTime;

        /**
         * <p>The agent ID.</p>
         * <blockquote>
         * <p>No agent information is available before the call is assigned to an agent in inbound call scenarios.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>555555</p>
         */
        @NameInMap("ServicerId")
        public String servicerId;

        /**
         * <p>The agent name.</p>
         * <blockquote>
         * <p>No agent information is available before the call is assigned to an agent in inbound call scenarios.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>TestAgent</p>
         */
        @NameInMap("ServicerName")
        public String servicerName;

        /**
         * <p>The long-distance call.</p>
         * 
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
        /**
         * <p>The call detail records.</p>
         */
        @NameInMap("CallDetailRecord")
        public java.util.List<HotlineSessionQueryResponseBodyDataCallDetailRecord> callDetailRecord;

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of records per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of records.</p>
         * 
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
