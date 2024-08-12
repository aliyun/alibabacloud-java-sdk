// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListCallSummariesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListCallSummariesResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("Params")
    public java.util.List<String> params;

    /**
     * <strong>example:</strong>
     * <p>932579BC-811A-503D-B322-4C2E57087CAA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListCallSummariesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCallSummariesResponseBody self = new ListCallSummariesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCallSummariesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListCallSummariesResponseBody setData(java.util.List<ListCallSummariesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListCallSummariesResponseBodyData> getData() {
        return this.data;
    }

    public ListCallSummariesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListCallSummariesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListCallSummariesResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public ListCallSummariesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListCallSummariesResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>job-544789******759424</p>
         */
        @NameInMap("ContactId")
        public String contactId;

        @NameInMap("Context")
        public String context;

        /**
         * <strong>example:</strong>
         * <p>1723449513735</p>
         */
        @NameInMap("CreatedTime")
        public Long createdTime;

        /**
         * <strong>example:</strong>
         * <p>creator@ccc-test</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <strong>example:</strong>
         * <p>editor@ccc-test</p>
         */
        @NameInMap("Editor")
        public String editor;

        /**
         * <strong>example:</strong>
         * <p>ac0dd304-<strong><strong>-</strong></strong>-****-4a90010f0d38</p>
         */
        @NameInMap("TicketId")
        public String ticketId;

        public static ListCallSummariesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListCallSummariesResponseBodyData self = new ListCallSummariesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListCallSummariesResponseBodyData setContactId(String contactId) {
            this.contactId = contactId;
            return this;
        }
        public String getContactId() {
            return this.contactId;
        }

        public ListCallSummariesResponseBodyData setContext(String context) {
            this.context = context;
            return this;
        }
        public String getContext() {
            return this.context;
        }

        public ListCallSummariesResponseBodyData setCreatedTime(Long createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public Long getCreatedTime() {
            return this.createdTime;
        }

        public ListCallSummariesResponseBodyData setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListCallSummariesResponseBodyData setEditor(String editor) {
            this.editor = editor;
            return this;
        }
        public String getEditor() {
            return this.editor;
        }

        public ListCallSummariesResponseBodyData setTicketId(String ticketId) {
            this.ticketId = ticketId;
            return this;
        }
        public String getTicketId() {
            return this.ticketId;
        }

    }

}
