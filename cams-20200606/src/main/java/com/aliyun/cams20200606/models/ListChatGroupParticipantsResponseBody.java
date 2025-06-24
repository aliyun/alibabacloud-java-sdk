// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ListChatGroupParticipantsResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListChatGroupParticipantsResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>E9d9****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListChatGroupParticipantsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListChatGroupParticipantsResponseBody self = new ListChatGroupParticipantsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListChatGroupParticipantsResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ListChatGroupParticipantsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListChatGroupParticipantsResponseBody setData(ListChatGroupParticipantsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListChatGroupParticipantsResponseBodyData getData() {
        return this.data;
    }

    public ListChatGroupParticipantsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListChatGroupParticipantsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListChatGroupParticipantsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListChatGroupParticipantsResponseBodyDataList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>861382***</p>
         */
        @NameInMap("ParticipantNumber")
        public String participantNumber;

        public static ListChatGroupParticipantsResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListChatGroupParticipantsResponseBodyDataList self = new ListChatGroupParticipantsResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListChatGroupParticipantsResponseBodyDataList setParticipantNumber(String participantNumber) {
            this.participantNumber = participantNumber;
            return this;
        }
        public String getParticipantNumber() {
            return this.participantNumber;
        }

    }

    public static class ListChatGroupParticipantsResponseBodyData extends TeaModel {
        @NameInMap("List")
        public java.util.List<ListChatGroupParticipantsResponseBodyDataList> list;

        /**
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("Total")
        public Long total;

        public static ListChatGroupParticipantsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListChatGroupParticipantsResponseBodyData self = new ListChatGroupParticipantsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListChatGroupParticipantsResponseBodyData setList(java.util.List<ListChatGroupParticipantsResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListChatGroupParticipantsResponseBodyDataList> getList() {
            return this.list;
        }

        public ListChatGroupParticipantsResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
