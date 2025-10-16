// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class GetMemorySessionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public GetMemorySessionResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>55D4BE40-2811-5CFB-8482-E0E98D575B1E</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetMemorySessionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMemorySessionResponseBody self = new GetMemorySessionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMemorySessionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetMemorySessionResponseBody setData(GetMemorySessionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetMemorySessionResponseBodyData getData() {
        return this.data;
    }

    public GetMemorySessionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetMemorySessionResponseBodyData extends TeaModel {
        @NameInMap("events")
        public java.util.List<java.util.Map<String, ?>> events;

        public static GetMemorySessionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetMemorySessionResponseBodyData self = new GetMemorySessionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetMemorySessionResponseBodyData setEvents(java.util.List<java.util.Map<String, ?>> events) {
            this.events = events;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getEvents() {
            return this.events;
        }

    }

}
