// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeCustomEventAttributeResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public String success;

    @NameInMap("CustomEvents")
    @Validation(required = true)
    public DescribeCustomEventAttributeResponseCustomEvents customEvents;

    public static DescribeCustomEventAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomEventAttributeResponse self = new DescribeCustomEventAttributeResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeCustomEventAttributeResponseCustomEventsCustomEvent extends TeaModel {
        @NameInMap("Id")
        @Validation(required = true)
        public String id;

        @NameInMap("Content")
        @Validation(required = true)
        public String content;

        @NameInMap("GroupId")
        @Validation(required = true)
        public String groupId;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Time")
        @Validation(required = true)
        public String time;

        public static DescribeCustomEventAttributeResponseCustomEventsCustomEvent build(java.util.Map<String, ?> map) throws Exception {
            DescribeCustomEventAttributeResponseCustomEventsCustomEvent self = new DescribeCustomEventAttributeResponseCustomEventsCustomEvent();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeCustomEventAttributeResponseCustomEvents extends TeaModel {
        @NameInMap("CustomEvent")
        @Validation(required = true)
        public java.util.List<DescribeCustomEventAttributeResponseCustomEventsCustomEvent> customEvent;

        public static DescribeCustomEventAttributeResponseCustomEvents build(java.util.Map<String, ?> map) throws Exception {
            DescribeCustomEventAttributeResponseCustomEvents self = new DescribeCustomEventAttributeResponseCustomEvents();
            return TeaModel.build(map, self);
        }

    }

}
