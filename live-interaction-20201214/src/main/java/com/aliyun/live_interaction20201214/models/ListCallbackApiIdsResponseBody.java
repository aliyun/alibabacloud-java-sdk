// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class ListCallbackApiIdsResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 业务是否成功
    @NameInMap("Success")
    public Boolean success;

    // 业务错误码
    @NameInMap("Code")
    public String code;

    // 网络错误码
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    // 错误信息
    @NameInMap("Message")
    public String message;

    // 返回结果
    @NameInMap("Result")
    public ListCallbackApiIdsResponseBodyResult result;

    public static ListCallbackApiIdsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCallbackApiIdsResponseBody self = new ListCallbackApiIdsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCallbackApiIdsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCallbackApiIdsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListCallbackApiIdsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListCallbackApiIdsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListCallbackApiIdsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListCallbackApiIdsResponseBody setResult(ListCallbackApiIdsResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ListCallbackApiIdsResponseBodyResult getResult() {
        return this.result;
    }

    public static class ListCallbackApiIdsResponseBodyResult extends TeaModel {
        // 回调列表
        @NameInMap("Spis")
        public java.util.Map<String, Boolean> spis;

        // 事件输出列表
        @NameInMap("Events")
        public java.util.Map<String, Boolean> events;

        public static ListCallbackApiIdsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListCallbackApiIdsResponseBodyResult self = new ListCallbackApiIdsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListCallbackApiIdsResponseBodyResult setSpis(java.util.Map<String, Boolean> spis) {
            this.spis = spis;
            return this;
        }
        public java.util.Map<String, Boolean> getSpis() {
            return this.spis;
        }

        public ListCallbackApiIdsResponseBodyResult setEvents(java.util.Map<String, Boolean> events) {
            this.events = events;
            return this;
        }
        public java.util.Map<String, Boolean> getEvents() {
            return this.events;
        }

    }

}
