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
        @NameInMap("Content")
        public String content;

        @NameInMap("EventName")
        public String eventName;

        @NameInMap("GroupId")
        public String groupId;

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
