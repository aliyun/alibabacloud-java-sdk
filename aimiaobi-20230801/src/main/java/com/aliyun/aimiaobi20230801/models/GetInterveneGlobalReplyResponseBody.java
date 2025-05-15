// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetInterveneGlobalReplyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetInterveneGlobalReplyResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>3f7045e099474ba28ceca1b4eb6d6e21</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetInterveneGlobalReplyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInterveneGlobalReplyResponseBody self = new GetInterveneGlobalReplyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInterveneGlobalReplyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetInterveneGlobalReplyResponseBody setData(GetInterveneGlobalReplyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetInterveneGlobalReplyResponseBodyData getData() {
        return this.data;
    }

    public GetInterveneGlobalReplyResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetInterveneGlobalReplyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetInterveneGlobalReplyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetInterveneGlobalReplyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetInterveneGlobalReplyResponseBodyDataReplyMessagList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <strong>example:</strong>
         * <p>namespace_qa_query</p>
         */
        @NameInMap("ReplyType")
        public String replyType;

        public static GetInterveneGlobalReplyResponseBodyDataReplyMessagList build(java.util.Map<String, ?> map) throws Exception {
            GetInterveneGlobalReplyResponseBodyDataReplyMessagList self = new GetInterveneGlobalReplyResponseBodyDataReplyMessagList();
            return TeaModel.build(map, self);
        }

        public GetInterveneGlobalReplyResponseBodyDataReplyMessagList setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetInterveneGlobalReplyResponseBodyDataReplyMessagList setReplyType(String replyType) {
            this.replyType = replyType;
            return this;
        }
        public String getReplyType() {
            return this.replyType;
        }

    }

    public static class GetInterveneGlobalReplyResponseBodyData extends TeaModel {
        @NameInMap("Code")
        public Integer code;

        @NameInMap("ReplyMessagList")
        public java.util.List<GetInterveneGlobalReplyResponseBodyDataReplyMessagList> replyMessagList;

        public static GetInterveneGlobalReplyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetInterveneGlobalReplyResponseBodyData self = new GetInterveneGlobalReplyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetInterveneGlobalReplyResponseBodyData setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

        public GetInterveneGlobalReplyResponseBodyData setReplyMessagList(java.util.List<GetInterveneGlobalReplyResponseBodyDataReplyMessagList> replyMessagList) {
            this.replyMessagList = replyMessagList;
            return this;
        }
        public java.util.List<GetInterveneGlobalReplyResponseBodyDataReplyMessagList> getReplyMessagList() {
            return this.replyMessagList;
        }

    }

}
