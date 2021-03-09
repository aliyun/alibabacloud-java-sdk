// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetHotlineCallActionResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public GetHotlineCallActionResponseBodyData data;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static GetHotlineCallActionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHotlineCallActionResponseBody self = new GetHotlineCallActionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHotlineCallActionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetHotlineCallActionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetHotlineCallActionResponseBody setData(GetHotlineCallActionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetHotlineCallActionResponseBodyData getData() {
        return this.data;
    }

    public GetHotlineCallActionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetHotlineCallActionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetHotlineCallActionResponseBodyData extends TeaModel {
        @NameInMap("TouchId")
        public Long touchId;

        @NameInMap("DepId")
        public Long depId;

        @NameInMap("MemberName")
        public String memberName;

        @NameInMap("ServicerName")
        public String servicerName;

        @NameInMap("ChannelType")
        public Long channelType;

        @NameInMap("ActionId")
        public Long actionId;

        @NameInMap("CalloutName")
        public String calloutName;

        @NameInMap("SubTouchId")
        public Long subTouchId;

        @NameInMap("ServicerId")
        public Long servicerId;

        @NameInMap("BuId")
        public Long buId;

        @NameInMap("CalloutId")
        public Long calloutId;

        @NameInMap("CaseId")
        public Long caseId;

        @NameInMap("ChannelId")
        public String channelId;

        @NameInMap("IsTransfer")
        public String isTransfer;

        @NameInMap("MemberId")
        public Long memberId;

        @NameInMap("TaskId")
        public Long taskId;

        @NameInMap("MemberList")
        public String memberList;

        public static GetHotlineCallActionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetHotlineCallActionResponseBodyData self = new GetHotlineCallActionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetHotlineCallActionResponseBodyData setTouchId(Long touchId) {
            this.touchId = touchId;
            return this;
        }
        public Long getTouchId() {
            return this.touchId;
        }

        public GetHotlineCallActionResponseBodyData setDepId(Long depId) {
            this.depId = depId;
            return this;
        }
        public Long getDepId() {
            return this.depId;
        }

        public GetHotlineCallActionResponseBodyData setMemberName(String memberName) {
            this.memberName = memberName;
            return this;
        }
        public String getMemberName() {
            return this.memberName;
        }

        public GetHotlineCallActionResponseBodyData setServicerName(String servicerName) {
            this.servicerName = servicerName;
            return this;
        }
        public String getServicerName() {
            return this.servicerName;
        }

        public GetHotlineCallActionResponseBodyData setChannelType(Long channelType) {
            this.channelType = channelType;
            return this;
        }
        public Long getChannelType() {
            return this.channelType;
        }

        public GetHotlineCallActionResponseBodyData setActionId(Long actionId) {
            this.actionId = actionId;
            return this;
        }
        public Long getActionId() {
            return this.actionId;
        }

        public GetHotlineCallActionResponseBodyData setCalloutName(String calloutName) {
            this.calloutName = calloutName;
            return this;
        }
        public String getCalloutName() {
            return this.calloutName;
        }

        public GetHotlineCallActionResponseBodyData setSubTouchId(Long subTouchId) {
            this.subTouchId = subTouchId;
            return this;
        }
        public Long getSubTouchId() {
            return this.subTouchId;
        }

        public GetHotlineCallActionResponseBodyData setServicerId(Long servicerId) {
            this.servicerId = servicerId;
            return this;
        }
        public Long getServicerId() {
            return this.servicerId;
        }

        public GetHotlineCallActionResponseBodyData setBuId(Long buId) {
            this.buId = buId;
            return this;
        }
        public Long getBuId() {
            return this.buId;
        }

        public GetHotlineCallActionResponseBodyData setCalloutId(Long calloutId) {
            this.calloutId = calloutId;
            return this;
        }
        public Long getCalloutId() {
            return this.calloutId;
        }

        public GetHotlineCallActionResponseBodyData setCaseId(Long caseId) {
            this.caseId = caseId;
            return this;
        }
        public Long getCaseId() {
            return this.caseId;
        }

        public GetHotlineCallActionResponseBodyData setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public GetHotlineCallActionResponseBodyData setIsTransfer(String isTransfer) {
            this.isTransfer = isTransfer;
            return this;
        }
        public String getIsTransfer() {
            return this.isTransfer;
        }

        public GetHotlineCallActionResponseBodyData setMemberId(Long memberId) {
            this.memberId = memberId;
            return this;
        }
        public Long getMemberId() {
            return this.memberId;
        }

        public GetHotlineCallActionResponseBodyData setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

        public GetHotlineCallActionResponseBodyData setMemberList(String memberList) {
            this.memberList = memberList;
            return this;
        }
        public String getMemberList() {
            return this.memberList;
        }

    }

}
