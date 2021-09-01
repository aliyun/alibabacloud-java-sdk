// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class GetEventInfosResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public java.util.List<GetEventInfosResponseBodyData> data;

    public static GetEventInfosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEventInfosResponseBody self = new GetEventInfosResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEventInfosResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetEventInfosResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetEventInfosResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetEventInfosResponseBody setData(java.util.List<GetEventInfosResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetEventInfosResponseBodyData> getData() {
        return this.data;
    }

    public static class GetEventInfosResponseBodyData extends TeaModel {
        @NameInMap("EventSort")
        public String eventSort;

        @NameInMap("EventName")
        public String eventName;

        public static GetEventInfosResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetEventInfosResponseBodyData self = new GetEventInfosResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetEventInfosResponseBodyData setEventSort(String eventSort) {
            this.eventSort = eventSort;
            return this;
        }
        public String getEventSort() {
            return this.eventSort;
        }

        public GetEventInfosResponseBodyData setEventName(String eventName) {
            this.eventName = eventName;
            return this;
        }
        public String getEventName() {
            return this.eventName;
        }

    }

}
