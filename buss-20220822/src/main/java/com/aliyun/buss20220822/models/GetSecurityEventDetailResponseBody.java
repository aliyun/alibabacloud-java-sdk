// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.buss20220822.models;

import com.aliyun.tea.*;

public class GetSecurityEventDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetSecurityEventDetailResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetSecurityEventDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSecurityEventDetailResponseBody self = new GetSecurityEventDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSecurityEventDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSecurityEventDetailResponseBody setData(GetSecurityEventDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSecurityEventDetailResponseBodyData getData() {
        return this.data;
    }

    public GetSecurityEventDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSecurityEventDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSecurityEventDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetSecurityEventDetailResponseBodyData extends TeaModel {
        @NameInMap("Aliuid")
        public String aliuid;

        @NameInMap("DataSource")
        public String dataSource;

        @NameInMap("EventCode")
        public String eventCode;

        @NameInMap("EventId")
        public String eventId;

        @NameInMap("EventTime")
        public String eventTime;

        @NameInMap("Extra")
        public String extra;

        @NameInMap("Level")
        public String level;

        @NameInMap("PrincipalId")
        public String principalId;

        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        public static GetSecurityEventDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSecurityEventDetailResponseBodyData self = new GetSecurityEventDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSecurityEventDetailResponseBodyData setAliuid(String aliuid) {
            this.aliuid = aliuid;
            return this;
        }
        public String getAliuid() {
            return this.aliuid;
        }

        public GetSecurityEventDetailResponseBodyData setDataSource(String dataSource) {
            this.dataSource = dataSource;
            return this;
        }
        public String getDataSource() {
            return this.dataSource;
        }

        public GetSecurityEventDetailResponseBodyData setEventCode(String eventCode) {
            this.eventCode = eventCode;
            return this;
        }
        public String getEventCode() {
            return this.eventCode;
        }

        public GetSecurityEventDetailResponseBodyData setEventId(String eventId) {
            this.eventId = eventId;
            return this;
        }
        public String getEventId() {
            return this.eventId;
        }

        public GetSecurityEventDetailResponseBodyData setEventTime(String eventTime) {
            this.eventTime = eventTime;
            return this;
        }
        public String getEventTime() {
            return this.eventTime;
        }

        public GetSecurityEventDetailResponseBodyData setExtra(String extra) {
            this.extra = extra;
            return this;
        }
        public String getExtra() {
            return this.extra;
        }

        public GetSecurityEventDetailResponseBodyData setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public GetSecurityEventDetailResponseBodyData setPrincipalId(String principalId) {
            this.principalId = principalId;
            return this;
        }
        public String getPrincipalId() {
            return this.principalId;
        }

        public GetSecurityEventDetailResponseBodyData setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public GetSecurityEventDetailResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetSecurityEventDetailResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
