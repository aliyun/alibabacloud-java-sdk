// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetInterveneGlobalReplyResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetInterveneGlobalReplyResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Message")
        public String message;

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
        @NameInMap("ReplyMessagList")
        public java.util.List<GetInterveneGlobalReplyResponseBodyDataReplyMessagList> replyMessagList;

        public static GetInterveneGlobalReplyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetInterveneGlobalReplyResponseBodyData self = new GetInterveneGlobalReplyResponseBodyData();
            return TeaModel.build(map, self);
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
