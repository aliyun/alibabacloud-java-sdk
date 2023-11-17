// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20230630.models;

import com.aliyun.tea.*;

public class GetThingEventSnapshotResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetThingEventSnapshotResponseBodyData> data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetThingEventSnapshotResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetThingEventSnapshotResponseBody self = new GetThingEventSnapshotResponseBody();
        return TeaModel.build(map, self);
    }

    public GetThingEventSnapshotResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetThingEventSnapshotResponseBody setData(java.util.List<GetThingEventSnapshotResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetThingEventSnapshotResponseBodyData> getData() {
        return this.data;
    }

    public GetThingEventSnapshotResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetThingEventSnapshotResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetThingEventSnapshotResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetThingEventSnapshotResponseBodyData extends TeaModel {
        @NameInMap("EventBody")
        public String eventBody;

        @NameInMap("EventCode")
        public String eventCode;

        @NameInMap("EventType")
        public String eventType;

        @NameInMap("Identifier")
        public String identifier;

        @NameInMap("IotId")
        public String iotId;

        @NameInMap("Timestamp")
        public Long timestamp;

        public static GetThingEventSnapshotResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetThingEventSnapshotResponseBodyData self = new GetThingEventSnapshotResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetThingEventSnapshotResponseBodyData setEventBody(String eventBody) {
            this.eventBody = eventBody;
            return this;
        }
        public String getEventBody() {
            return this.eventBody;
        }

        public GetThingEventSnapshotResponseBodyData setEventCode(String eventCode) {
            this.eventCode = eventCode;
            return this;
        }
        public String getEventCode() {
            return this.eventCode;
        }

        public GetThingEventSnapshotResponseBodyData setEventType(String eventType) {
            this.eventType = eventType;
            return this;
        }
        public String getEventType() {
            return this.eventType;
        }

        public GetThingEventSnapshotResponseBodyData setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public GetThingEventSnapshotResponseBodyData setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public GetThingEventSnapshotResponseBodyData setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

    }

}
