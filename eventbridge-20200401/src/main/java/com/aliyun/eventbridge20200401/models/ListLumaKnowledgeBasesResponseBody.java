// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class ListLumaKnowledgeBasesResponseBody extends TeaModel {
    /**
     * <p>The response code. A value of Success indicates a successful call. Otherwise, a specific error code is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The list of knowledge bases bound to the agent. All results are returned at once without pagination.</p>
     */
    @NameInMap("Data")
    public ListLumaKnowledgeBasesResponseBodyData data;

    /**
     * <p>The message returned by the operation. The value is Operation success if the call succeeds, or a specific error description if the call fails.</p>
     * 
     * <strong>example:</strong>
     * <p>Operation success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The unique identifier of the request, used for troubleshooting and ticket feedback.</p>
     * 
     * <strong>example:</strong>
     * <p>34AD682D-5B91-5773-8132-AA38C130****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. A value of true indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListLumaKnowledgeBasesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLumaKnowledgeBasesResponseBody self = new ListLumaKnowledgeBasesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLumaKnowledgeBasesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListLumaKnowledgeBasesResponseBody setData(ListLumaKnowledgeBasesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListLumaKnowledgeBasesResponseBodyData getData() {
        return this.data;
    }

    public ListLumaKnowledgeBasesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListLumaKnowledgeBasesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLumaKnowledgeBasesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListLumaKnowledgeBasesResponseBodyData extends TeaModel {
        /**
         * <p>The list of knowledge bases bound to the agent.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;KnowledgeBaseName&quot;:&quot;my-knowledge-base&quot;}]</p>
         */
        @NameInMap("KnowledgeBases")
        public java.util.List<KnowledgeBase> knowledgeBases;

        public static ListLumaKnowledgeBasesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListLumaKnowledgeBasesResponseBodyData self = new ListLumaKnowledgeBasesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListLumaKnowledgeBasesResponseBodyData setKnowledgeBases(java.util.List<KnowledgeBase> knowledgeBases) {
            this.knowledgeBases = knowledgeBases;
            return this;
        }
        public java.util.List<KnowledgeBase> getKnowledgeBases() {
            return this.knowledgeBases;
        }

    }

}
