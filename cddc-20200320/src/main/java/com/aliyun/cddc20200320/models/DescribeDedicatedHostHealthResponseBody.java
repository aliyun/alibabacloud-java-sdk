// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cddc20200320.models;

import com.aliyun.tea.*;

public class DescribeDedicatedHostHealthResponseBody extends TeaModel {
    @NameInMap("DedicatedHostId")
    public String dedicatedHostId;

    @NameInMap("ResourceEvent")
    public java.util.Map<String, ?> resourceEvent;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("HealthStatus")
    public java.util.Map<String, ?> healthStatus;

    @NameInMap("HostEvents")
    public DescribeDedicatedHostHealthResponseBodyHostEvents hostEvents;

    public static DescribeDedicatedHostHealthResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDedicatedHostHealthResponseBody self = new DescribeDedicatedHostHealthResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDedicatedHostHealthResponseBody setDedicatedHostId(String dedicatedHostId) {
        this.dedicatedHostId = dedicatedHostId;
        return this;
    }
    public String getDedicatedHostId() {
        return this.dedicatedHostId;
    }

    public DescribeDedicatedHostHealthResponseBody setResourceEvent(java.util.Map<String, ?> resourceEvent) {
        this.resourceEvent = resourceEvent;
        return this;
    }
    public java.util.Map<String, ?> getResourceEvent() {
        return this.resourceEvent;
    }

    public DescribeDedicatedHostHealthResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDedicatedHostHealthResponseBody setHealthStatus(java.util.Map<String, ?> healthStatus) {
        this.healthStatus = healthStatus;
        return this;
    }
    public java.util.Map<String, ?> getHealthStatus() {
        return this.healthStatus;
    }

    public DescribeDedicatedHostHealthResponseBody setHostEvents(DescribeDedicatedHostHealthResponseBodyHostEvents hostEvents) {
        this.hostEvents = hostEvents;
        return this;
    }
    public DescribeDedicatedHostHealthResponseBodyHostEvents getHostEvents() {
        return this.hostEvents;
    }

    public static class DescribeDedicatedHostHealthResponseBodyHostEventsHostEvents extends TeaModel {
        @NameInMap("EventName")
        public String eventName;

        @NameInMap("EventTime")
        public String eventTime;

        @NameInMap("EventType")
        public String eventType;

        @NameInMap("EventDescription")
        public String eventDescription;

        public static DescribeDedicatedHostHealthResponseBodyHostEventsHostEvents build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostHealthResponseBodyHostEventsHostEvents self = new DescribeDedicatedHostHealthResponseBodyHostEventsHostEvents();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedHostHealthResponseBodyHostEventsHostEvents setEventName(String eventName) {
            this.eventName = eventName;
            return this;
        }
        public String getEventName() {
            return this.eventName;
        }

        public DescribeDedicatedHostHealthResponseBodyHostEventsHostEvents setEventTime(String eventTime) {
            this.eventTime = eventTime;
            return this;
        }
        public String getEventTime() {
            return this.eventTime;
        }

        public DescribeDedicatedHostHealthResponseBodyHostEventsHostEvents setEventType(String eventType) {
            this.eventType = eventType;
            return this;
        }
        public String getEventType() {
            return this.eventType;
        }

        public DescribeDedicatedHostHealthResponseBodyHostEventsHostEvents setEventDescription(String eventDescription) {
            this.eventDescription = eventDescription;
            return this;
        }
        public String getEventDescription() {
            return this.eventDescription;
        }

    }

    public static class DescribeDedicatedHostHealthResponseBodyHostEvents extends TeaModel {
        @NameInMap("HostEvents")
        public java.util.List<DescribeDedicatedHostHealthResponseBodyHostEventsHostEvents> hostEvents;

        public static DescribeDedicatedHostHealthResponseBodyHostEvents build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostHealthResponseBodyHostEvents self = new DescribeDedicatedHostHealthResponseBodyHostEvents();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedHostHealthResponseBodyHostEvents setHostEvents(java.util.List<DescribeDedicatedHostHealthResponseBodyHostEventsHostEvents> hostEvents) {
            this.hostEvents = hostEvents;
            return this;
        }
        public java.util.List<DescribeDedicatedHostHealthResponseBodyHostEventsHostEvents> getHostEvents() {
            return this.hostEvents;
        }

    }

}
