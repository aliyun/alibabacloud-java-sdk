// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ListChatGroupParticipantsResponseBody extends TeaModel {
    /**
     * <p>The details about the access denial.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The request status code. Valid values:</p>
     * <ul>
     * <li><p>OK: The request was successful.</p>
     * </li>
     * <li><p>For other values, see the <a href="https://help.aliyun.com/document_detail/196974.html">error code list</a>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("Data")
    public ListChatGroupParticipantsResponseBodyData data;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>90E63D28-E31D-1EB2-8939-A94866411B2O</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: The request was successful.</p>
     * </li>
     * <li><p><strong>false</strong>: The request failed.</p>
     * </li>
     * </ul>
     * 
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
         * <p>The phone number of the group member.</p>
         * 
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
        /**
         * <p>The list of group members.</p>
         */
        @NameInMap("List")
        public java.util.List<ListChatGroupParticipantsResponseBodyDataList> list;

        /**
         * <p>The total number of participants.</p>
         * 
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
