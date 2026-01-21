// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetDingtalkMeetingMemberEventResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("data")
    public java.util.List<GetDingtalkMeetingMemberEventResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("vendorRequestId")
    public String vendorRequestId;

    /**
     * <strong>example:</strong>
     * <p>dingtalk</p>
     */
    @NameInMap("vendorType")
    public String vendorType;

    public static GetDingtalkMeetingMemberEventResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDingtalkMeetingMemberEventResponseBody self = new GetDingtalkMeetingMemberEventResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDingtalkMeetingMemberEventResponseBody setData(java.util.List<GetDingtalkMeetingMemberEventResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetDingtalkMeetingMemberEventResponseBodyData> getData() {
        return this.data;
    }

    public GetDingtalkMeetingMemberEventResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDingtalkMeetingMemberEventResponseBody setVendorRequestId(String vendorRequestId) {
        this.vendorRequestId = vendorRequestId;
        return this;
    }
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    public GetDingtalkMeetingMemberEventResponseBody setVendorType(String vendorType) {
        this.vendorType = vendorType;
        return this;
    }
    public String getVendorType() {
        return this.vendorType;
    }

    public static class GetDingtalkMeetingMemberEventResponseBodyData extends TeaModel {
        @NameInMap("confModule")
        public String confModule;

        /**
         * <strong>example:</strong>
         * <p>event123</p>
         */
        @NameInMap("eventId")
        public String eventId;

        /**
         * <strong>example:</strong>
         * <p>join</p>
         */
        @NameInMap("eventName")
        public String eventName;

        /**
         * <strong>example:</strong>
         * <p>member</p>
         */
        @NameInMap("eventType")
        public String eventType;

        /**
         * <strong>example:</strong>
         * <p>1638360000000</p>
         */
        @NameInMap("ts")
        public Long ts;

        public static GetDingtalkMeetingMemberEventResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDingtalkMeetingMemberEventResponseBodyData self = new GetDingtalkMeetingMemberEventResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDingtalkMeetingMemberEventResponseBodyData setConfModule(String confModule) {
            this.confModule = confModule;
            return this;
        }
        public String getConfModule() {
            return this.confModule;
        }

        public GetDingtalkMeetingMemberEventResponseBodyData setEventId(String eventId) {
            this.eventId = eventId;
            return this;
        }
        public String getEventId() {
            return this.eventId;
        }

        public GetDingtalkMeetingMemberEventResponseBodyData setEventName(String eventName) {
            this.eventName = eventName;
            return this;
        }
        public String getEventName() {
            return this.eventName;
        }

        public GetDingtalkMeetingMemberEventResponseBodyData setEventType(String eventType) {
            this.eventType = eventType;
            return this;
        }
        public String getEventType() {
            return this.eventType;
        }

        public GetDingtalkMeetingMemberEventResponseBodyData setTs(Long ts) {
            this.ts = ts;
            return this;
        }
        public Long getTs() {
            return this.ts;
        }

    }

}
