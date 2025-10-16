// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class RetrieveMemoryResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public RetrieveMemoryResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>BC65E49E-1F6A-55E0-8A0E-7255DBFAA8F9</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static RetrieveMemoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RetrieveMemoryResponseBody self = new RetrieveMemoryResponseBody();
        return TeaModel.build(map, self);
    }

    public RetrieveMemoryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RetrieveMemoryResponseBody setData(RetrieveMemoryResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RetrieveMemoryResponseBodyData getData() {
        return this.data;
    }

    public RetrieveMemoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RetrieveMemoryResponseBodyData extends TeaModel {
        @NameInMap("events")
        public java.util.List<java.util.Map<String, String>> events;

        @NameInMap("memories")
        public java.util.List<java.util.Map<String, String>> memories;

        public static RetrieveMemoryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RetrieveMemoryResponseBodyData self = new RetrieveMemoryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RetrieveMemoryResponseBodyData setEvents(java.util.List<java.util.Map<String, String>> events) {
            this.events = events;
            return this;
        }
        public java.util.List<java.util.Map<String, String>> getEvents() {
            return this.events;
        }

        public RetrieveMemoryResponseBodyData setMemories(java.util.List<java.util.Map<String, String>> memories) {
            this.memories = memories;
            return this;
        }
        public java.util.List<java.util.Map<String, String>> getMemories() {
            return this.memories;
        }

    }

}
