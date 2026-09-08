// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListCallSummariesResponseBody extends TeaModel {
    /**
     * <p>Response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Data.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListCallSummariesResponseBodyData> data;

    /**
     * <p>HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Error message.</p>
     * 
     * <strong>example:</strong>
     * <p>无</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>List of error parameters.</p>
     */
    @NameInMap("Params")
    public java.util.List<String> params;

    /**
     * <p>Request ID.</p>
     * 
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
         * <p>Call ID.</p>
         * 
         * <strong>example:</strong>
         * <p>job-544789******759424</p>
         */
        @NameInMap("ContactId")
        public String contactId;

        /**
         * <p>Summary information.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;_sys_field_config&quot;: [
         *         {
         *             &quot;Array&quot;: false,
         *             &quot;Required&quot;: true,
         *             &quot;DisplayName&quot;: &quot;主题&quot;,
         *             &quot;Attributes&quot;: &quot;{}&quot;,
         *             &quot;DataType&quot;: &quot;TEXT&quot;,
         *             &quot;EditorType&quot;: &quot;TEXT&quot;,
         *             &quot;MaxLength&quot;: 30,
         *             &quot;System&quot;: true,
         *             &quot;Name&quot;: &quot;summaryTitle&quot;
         *         },
         *         {
         *             &quot;Array&quot;: false,
         *             &quot;DisplayName&quot;: &quot;小结&quot;,
         *             &quot;Attributes&quot;: &quot;{}&quot;,
         *             &quot;DataType&quot;: &quot;TEXT&quot;,
         *             &quot;EditorType&quot;: &quot;TEXTAREA&quot;,
         *             &quot;MaxLength&quot;: 1000,
         *             &quot;System&quot;: true,
         *             &quot;Name&quot;: &quot;summaryContent&quot;
         *         },
         *         {
         *             &quot;Array&quot;: true,
         *             &quot;DisplayName&quot;: &quot;标签&quot;,
         *             &quot;Attributes&quot;: &quot;{}&quot;,
         *             &quot;DataType&quot;: &quot;TEXT&quot;,
         *             &quot;EditorType&quot;: &quot;SELECT&quot;,
         *             &quot;System&quot;: true,
         *             &quot;Name&quot;: &quot;keywords&quot;
         *         }
         *     ],
         *     &quot;summaryContent&quot;: &quot;小结内容&quot;,
         *     &quot;creator&quot;: &quot;creator@ccc-test&quot;,
         *     &quot;bizType&quot;: &quot;Summary&quot;,
         *     &quot;keywords&quot;: [
         *         &quot;标签1&quot;
         *     ],
         *     &quot;source&quot;: &quot;Console&quot;,
         *     &quot;summaryTitle&quot;: &quot;测试会话小结&quot;,
         *     &quot;instanceId&quot;: &quot;ccc-test&quot;,
         *     &quot;externalInput&quot;: &quot;{\&quot;summaryTitle\&quot;:\&quot;测试会话小结\&quot;,\&quot;summaryContent\&quot;:\&quot;小结内容\&quot;,\&quot;keywords\&quot;:[\&quot;标签1\&quot;],\&quot;_sys_field_config\&quot;:[{\&quot;DisplayName\&quot;:\&quot;主题\&quot;,\&quot;Name\&quot;:\&quot;summaryTitle\&quot;,\&quot;Required\&quot;:true,\&quot;EditorType\&quot;:\&quot;TEXT\&quot;,\&quot;Array\&quot;:false,\&quot;DataType\&quot;:\&quot;TEXT\&quot;,\&quot;System\&quot;:true,\&quot;MaxLength\&quot;:30,\&quot;Attributes\&quot;:\&quot;{}\&quot;},{\&quot;DisplayName\&quot;:\&quot;小结\&quot;,\&quot;Name\&quot;:\&quot;summaryContent\&quot;,\&quot;EditorType\&quot;:\&quot;TEXTAREA\&quot;,\&quot;Array\&quot;:false,\&quot;DataType\&quot;:\&quot;TEXT\&quot;,\&quot;System\&quot;:true,\&quot;MaxLength\&quot;:1000,\&quot;Attributes\&quot;:\&quot;{}\&quot;},{\&quot;DisplayName\&quot;:\&quot;标签\&quot;,\&quot;Name\&quot;:\&quot;keywords\&quot;,\&quot;EditorType\&quot;:\&quot;SELECT\&quot;,\&quot;Array\&quot;:true,\&quot;DataType\&quot;:\&quot;TEXT\&quot;,\&quot;System\&quot;:true,\&quot;Attributes\&quot;:\&quot;{}\&quot;}]}&quot;,
         *     &quot;templateName&quot;: &quot;Summary-Ticket&quot;,
         *     &quot;bizId&quot;: &quot;job-544789<strong><strong><strong>759424&quot;,
         *     &quot;ticketStartTime&quot;: 1723449513735,
         *     &quot;ticketId&quot;: &quot;ac0dd304-</strong></strong>-</strong><strong>-<strong><strong>-4a90010f0d38&quot;,
         *     &quot;definitionId&quot;: &quot;Summary-Ticket:2:6881f43a-</strong></strong>-11ee-***</strong>-6eb35a90a7a6&quot;
         * }</p>
         */
        @NameInMap("Context")
        public String context;

        /**
         * <p>Creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1723449513735</p>
         */
        @NameInMap("CreatedTime")
        public Long createdTime;

        /**
         * <p>Creator.</p>
         * 
         * <strong>example:</strong>
         * <p>creator@ccc-test</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <p>Editor.</p>
         * 
         * <strong>example:</strong>
         * <p>editor@ccc-test</p>
         */
        @NameInMap("Editor")
        public String editor;

        /**
         * <p>Summary ID.</p>
         * 
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
