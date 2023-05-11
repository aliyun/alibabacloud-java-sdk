// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeCustomEventAttributeResponseBody extends TeaModel {
    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The time when the custom event occurred.</p>
     * <br>
     * <p>This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
     */
    @NameInMap("CustomEvents")
    public DescribeCustomEventAttributeResponseBodyCustomEvents customEvents;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <br>
     * <p>*   true: The call was successful.</p>
     * <p>*   false: The call failed.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The details of the custom event.</p>
     */
    @NameInMap("Success")
    public String success;

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

    public DescribeCustomEventAttributeResponseBody setCustomEvents(DescribeCustomEventAttributeResponseBodyCustomEvents customEvents) {
        this.customEvents = customEvents;
        return this;
    }
    public DescribeCustomEventAttributeResponseBodyCustomEvents getCustomEvents() {
        return this.customEvents;
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

    public static class DescribeCustomEventAttributeResponseBodyCustomEventsCustomEvent extends TeaModel {
        /**
         * <p>The ID of the custom event.</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The content of the custom event.</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>Queries the details of a custom event occurred in a specified time period.</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The ID of the application group.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The name of the custom event.</p>
         */
        @NameInMap("Time")
        public String time;

        public static DescribeCustomEventAttributeResponseBodyCustomEventsCustomEvent build(java.util.Map<String, ?> map) throws Exception {
            DescribeCustomEventAttributeResponseBodyCustomEventsCustomEvent self = new DescribeCustomEventAttributeResponseBodyCustomEventsCustomEvent();
            return TeaModel.build(map, self);
        }

        public DescribeCustomEventAttributeResponseBodyCustomEventsCustomEvent setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public DescribeCustomEventAttributeResponseBodyCustomEventsCustomEvent setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeCustomEventAttributeResponseBodyCustomEventsCustomEvent setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeCustomEventAttributeResponseBodyCustomEventsCustomEvent setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeCustomEventAttributeResponseBodyCustomEventsCustomEvent setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
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
