// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class ListCallbackApiIdsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public ListCallbackApiIdsResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static ListCallbackApiIdsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCallbackApiIdsResponseBody self = new ListCallbackApiIdsResponseBody();
        return TeaModel.build(map, self);
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

    public ListCallbackApiIdsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCallbackApiIdsResponseBody setResult(ListCallbackApiIdsResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ListCallbackApiIdsResponseBodyResult getResult() {
        return this.result;
    }

    public ListCallbackApiIdsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListCallbackApiIdsResponseBodyResult extends TeaModel {
        @NameInMap("Events")
        public java.util.Map<String, Boolean> events;

        @NameInMap("Spis")
        public java.util.Map<String, Boolean> spis;

        public static ListCallbackApiIdsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListCallbackApiIdsResponseBodyResult self = new ListCallbackApiIdsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListCallbackApiIdsResponseBodyResult setEvents(java.util.Map<String, Boolean> events) {
            this.events = events;
            return this;
        }
        public java.util.Map<String, Boolean> getEvents() {
            return this.events;
        }

        public ListCallbackApiIdsResponseBodyResult setSpis(java.util.Map<String, Boolean> spis) {
            this.spis = spis;
            return this;
        }
        public java.util.Map<String, Boolean> getSpis() {
            return this.spis;
        }

    }

}
