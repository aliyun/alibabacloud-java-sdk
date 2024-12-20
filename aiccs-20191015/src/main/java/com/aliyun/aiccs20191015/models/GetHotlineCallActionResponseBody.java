// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetHotlineCallActionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetHotlineCallActionResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
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

    public static GetHotlineCallActionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHotlineCallActionResponseBody self = new GetHotlineCallActionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHotlineCallActionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetHotlineCallActionResponseBody setData(GetHotlineCallActionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetHotlineCallActionResponseBodyData getData() {
        return this.data;
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

    public GetHotlineCallActionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetHotlineCallActionResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>8999****</p>
         */
        @NameInMap("ActionId")
        public Long actionId;

        /**
         * <strong>example:</strong>
         * <p>2367****</p>
         */
        @NameInMap("BuId")
        public Long buId;

        /**
         * <strong>example:</strong>
         * <p>1122****</p>
         */
        @NameInMap("CalloutId")
        public Long calloutId;

        @NameInMap("CalloutName")
        public String calloutName;

        /**
         * <strong>example:</strong>
         * <p>1138902****</p>
         */
        @NameInMap("CaseId")
        public Long caseId;

        /**
         * <strong>example:</strong>
         * <p>2377****</p>
         */
        @NameInMap("ChannelId")
        public String channelId;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ChannelType")
        public Long channelType;

        /**
         * <strong>example:</strong>
         * <p>1223****</p>
         */
        @NameInMap("DepId")
        public Long depId;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsTransfer")
        public String isTransfer;

        /**
         * <strong>example:</strong>
         * <p>7856876****</p>
         */
        @NameInMap("MemberId")
        public Long memberId;

        /**
         * <strong>example:</strong>
         * <p>8900****</p>
         */
        @NameInMap("MemberList")
        public String memberList;

        @NameInMap("MemberName")
        public String memberName;

        /**
         * <strong>example:</strong>
         * <p>1332****</p>
         */
        @NameInMap("ServicerId")
        public Long servicerId;

        @NameInMap("ServicerName")
        public String servicerName;

        /**
         * <strong>example:</strong>
         * <p>3423****</p>
         */
        @NameInMap("SubTouchId")
        public Long subTouchId;

        /**
         * <strong>example:</strong>
         * <p>12345****</p>
         */
        @NameInMap("TaskId")
        public Long taskId;

        /**
         * <strong>example:</strong>
         * <p>2235****</p>
         */
        @NameInMap("TouchId")
        public Long touchId;

        public static GetHotlineCallActionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetHotlineCallActionResponseBodyData self = new GetHotlineCallActionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetHotlineCallActionResponseBodyData setActionId(Long actionId) {
            this.actionId = actionId;
            return this;
        }
        public Long getActionId() {
            return this.actionId;
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

        public GetHotlineCallActionResponseBodyData setCalloutName(String calloutName) {
            this.calloutName = calloutName;
            return this;
        }
        public String getCalloutName() {
            return this.calloutName;
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

        public GetHotlineCallActionResponseBodyData setChannelType(Long channelType) {
            this.channelType = channelType;
            return this;
        }
        public Long getChannelType() {
            return this.channelType;
        }

        public GetHotlineCallActionResponseBodyData setDepId(Long depId) {
            this.depId = depId;
            return this;
        }
        public Long getDepId() {
            return this.depId;
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

        public GetHotlineCallActionResponseBodyData setMemberList(String memberList) {
            this.memberList = memberList;
            return this;
        }
        public String getMemberList() {
            return this.memberList;
        }

        public GetHotlineCallActionResponseBodyData setMemberName(String memberName) {
            this.memberName = memberName;
            return this;
        }
        public String getMemberName() {
            return this.memberName;
        }

        public GetHotlineCallActionResponseBodyData setServicerId(Long servicerId) {
            this.servicerId = servicerId;
            return this;
        }
        public Long getServicerId() {
            return this.servicerId;
        }

        public GetHotlineCallActionResponseBodyData setServicerName(String servicerName) {
            this.servicerName = servicerName;
            return this;
        }
        public String getServicerName() {
            return this.servicerName;
        }

        public GetHotlineCallActionResponseBodyData setSubTouchId(Long subTouchId) {
            this.subTouchId = subTouchId;
            return this;
        }
        public Long getSubTouchId() {
            return this.subTouchId;
        }

        public GetHotlineCallActionResponseBodyData setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

        public GetHotlineCallActionResponseBodyData setTouchId(Long touchId) {
            this.touchId = touchId;
            return this;
        }
        public Long getTouchId() {
            return this.touchId;
        }

    }

}
