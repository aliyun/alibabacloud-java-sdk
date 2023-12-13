// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutCustomEventRequest extends TeaModel {
    @NameInMap("EventInfo")
    public java.util.List<PutCustomEventRequestEventInfo> eventInfo;

    @NameInMap("RegionId")
    public String regionId;

    public static PutCustomEventRequest build(java.util.Map<String, ?> map) throws Exception {
        PutCustomEventRequest self = new PutCustomEventRequest();
        return TeaModel.build(map, self);
    }

    public PutCustomEventRequest setEventInfo(java.util.List<PutCustomEventRequestEventInfo> eventInfo) {
        this.eventInfo = eventInfo;
        return this;
    }
    public java.util.List<PutCustomEventRequestEventInfo> getEventInfo() {
        return this.eventInfo;
    }

    public PutCustomEventRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class PutCustomEventRequestEventInfo extends TeaModel {
        /**
         * <p>The content of the custom event. Valid values of N: 1 to 50.</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The name of the custom event. Valid values of N: 1 to 50.</p>
         */
        @NameInMap("EventName")
        public String eventName;

        /**
         * <p>The ID of the application group. Valid values of N: 0 to 50.</p>
         * <br>
         * <p>Default value: 0. This value indicates that the custom event to be reported does not belong to any application group.</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The time when the custom event occurred.</p>
         * <br>
         * <p>Format: `yyyyMMddTHHmmss.SSSZ`.</p>
         * <br>
         * <p>Valid values of N: 1 to 50.</p>
         * <br>
         * <p>>  You can also specify a UNIX timestamp. Example: 1552199984000. Unit: milliseconds.</p>
         */
        @NameInMap("Time")
        public String time;

        public static PutCustomEventRequestEventInfo build(java.util.Map<String, ?> map) throws Exception {
            PutCustomEventRequestEventInfo self = new PutCustomEventRequestEventInfo();
            return TeaModel.build(map, self);
        }

        public PutCustomEventRequestEventInfo setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public PutCustomEventRequestEventInfo setEventName(String eventName) {
            this.eventName = eventName;
            return this;
        }
        public String getEventName() {
            return this.eventName;
        }

        public PutCustomEventRequestEventInfo setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public PutCustomEventRequestEventInfo setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

    }

}
