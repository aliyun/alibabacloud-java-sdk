// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class GetMemoryEventResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public GetMemoryEventResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>BF2A63E4-FCE9-5A65-A60E-4086C8EDBC06</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetMemoryEventResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMemoryEventResponseBody self = new GetMemoryEventResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMemoryEventResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetMemoryEventResponseBody setData(GetMemoryEventResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetMemoryEventResponseBodyData getData() {
        return this.data;
    }

    public GetMemoryEventResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetMemoryEventResponseBodyData extends TeaModel {
        @NameInMap("event")
        public java.util.Map<String, ?> event;

        public static GetMemoryEventResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetMemoryEventResponseBodyData self = new GetMemoryEventResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetMemoryEventResponseBodyData setEvent(java.util.Map<String, ?> event) {
            this.event = event;
            return this;
        }
        public java.util.Map<String, ?> getEvent() {
            return this.event;
        }

    }

}
