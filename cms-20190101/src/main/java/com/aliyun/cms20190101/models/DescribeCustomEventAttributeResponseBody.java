// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeCustomEventAttributeResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    @NameInMap("CustomEvents")
    public DescribeCustomEventAttributeResponseBodyCustomEvents customEvents;

    public static DescribeCustomEventAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomEventAttributeResponseBody self = new DescribeCustomEventAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCustomEventAttributeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeCustomEventAttributeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeCustomEventAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCustomEventAttributeResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public DescribeCustomEventAttributeResponseBody setCustomEvents(DescribeCustomEventAttributeResponseBodyCustomEvents customEvents) {
        this.customEvents = customEvents;
        return this;
    }
    public DescribeCustomEventAttributeResponseBodyCustomEvents getCustomEvents() {
        return this.customEvents;
    }

    public static class DescribeCustomEventAttributeResponseBodyCustomEventsCustomEvent extends TeaModel {
        @NameInMap("Time")
        public String time;

        @NameInMap("Name")
        public String name;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("Content")
        public String content;

        @NameInMap("Id")
        public String id;

        public static DescribeCustomEventAttributeResponseBodyCustomEventsCustomEvent build(java.util.Map<String, ?> map) throws Exception {
            DescribeCustomEventAttributeResponseBodyCustomEventsCustomEvent self = new DescribeCustomEventAttributeResponseBodyCustomEventsCustomEvent();
            return TeaModel.build(map, self);
        }

        public DescribeCustomEventAttributeResponseBodyCustomEventsCustomEvent setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public DescribeCustomEventAttributeResponseBodyCustomEventsCustomEvent setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeCustomEventAttributeResponseBodyCustomEventsCustomEvent setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeCustomEventAttributeResponseBodyCustomEventsCustomEvent setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public DescribeCustomEventAttributeResponseBodyCustomEventsCustomEvent setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class DescribeCustomEventAttributeResponseBodyCustomEvents extends TeaModel {
        @NameInMap("CustomEvent")
        public java.util.List<DescribeCustomEventAttributeResponseBodyCustomEventsCustomEvent> customEvent;

        public static DescribeCustomEventAttributeResponseBodyCustomEvents build(java.util.Map<String, ?> map) throws Exception {
            DescribeCustomEventAttributeResponseBodyCustomEvents self = new DescribeCustomEventAttributeResponseBodyCustomEvents();
            return TeaModel.build(map, self);
        }

        public DescribeCustomEventAttributeResponseBodyCustomEvents setCustomEvent(java.util.List<DescribeCustomEventAttributeResponseBodyCustomEventsCustomEvent> customEvent) {
            this.customEvent = customEvent;
            return this;
        }
        public java.util.List<DescribeCustomEventAttributeResponseBodyCustomEventsCustomEvent> getCustomEvent() {
            return this.customEvent;
        }

    }

}
