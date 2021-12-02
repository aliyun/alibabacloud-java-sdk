// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class AddBodyTraceResponseBody extends TeaModel {
    @NameInMap("Data")
    public AddBodyTraceResponseBodyData data;

    // RequestId
    @NameInMap("RequestId")
    public String requestId;

    public static AddBodyTraceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddBodyTraceResponseBody self = new AddBodyTraceResponseBody();
        return TeaModel.build(map, self);
    }

    public AddBodyTraceResponseBody setData(AddBodyTraceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AddBodyTraceResponseBodyData getData() {
        return this.data;
    }

    public AddBodyTraceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
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
