// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class AddBodyTraceResponseBody extends TeaModel {
    // RequestId
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public AddBodyTraceResponseBodyData data;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    public static AddBodyTraceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddBodyTraceResponseBody self = new AddBodyTraceResponseBody();
        return TeaModel.build(map, self);
    }

    public AddBodyTraceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddBodyTraceResponseBody setData(AddBodyTraceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AddBodyTraceResponseBodyData getData() {
        return this.data;
    }

    public AddBodyTraceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AddBodyTraceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public static class AddBodyTraceResponseBodyData extends TeaModel {
        // TraceID
        @NameInMap("Id")
        public Long id;

        public static AddBodyTraceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AddBodyTraceResponseBodyData self = new AddBodyTraceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AddBodyTraceResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
