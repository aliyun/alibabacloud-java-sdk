// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class ListRevealApplicationFilterResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListRevealApplicationFilterResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListRevealApplicationFilterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRevealApplicationFilterResponseBody self = new ListRevealApplicationFilterResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRevealApplicationFilterResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListRevealApplicationFilterResponseBody setData(java.util.List<ListRevealApplicationFilterResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListRevealApplicationFilterResponseBodyData> getData() {
        return this.data;
    }

    public ListRevealApplicationFilterResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListRevealApplicationFilterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRevealApplicationFilterResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListRevealApplicationFilterResponseBodyData extends TeaModel {
        @NameInMap("code")
        public String code;

        @NameInMap("explanation")
        public String explanation;

        public static ListRevealApplicationFilterResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListRevealApplicationFilterResponseBodyData self = new ListRevealApplicationFilterResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListRevealApplicationFilterResponseBodyData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListRevealApplicationFilterResponseBodyData setExplanation(String explanation) {
            this.explanation = explanation;
            return this;
        }
        public String getExplanation() {
            return this.explanation;
        }

    }

}
