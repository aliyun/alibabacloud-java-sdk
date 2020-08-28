// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutCustomEventRequest extends TeaModel {
    @NameInMap("EventInfo")
    public java.util.List<PutCustomEventRequestEventInfo> eventInfo;

    public static PutCustomEventRequest build(java.util.Map<String, ?> map) throws Exception {
        PutCustomEventRequest self = new PutCustomEventRequest();
        return TeaModel.build(map, self);
    }

    public static class PutCustomEventRequestEventInfo extends TeaModel {
        @NameInMap("EventName")
        @Validation(required = true)
        public String eventName;

        @NameInMap("Content")
        @Validation(required = true)
        public String content;

        @NameInMap("Time")
        @Validation(required = true)
        public String time;

        @NameInMap("GroupId")
        @Validation(required = true)
        public String groupId;

        public static PutCustomEventRequestEventInfo build(java.util.Map<String, ?> map) throws Exception {
            PutCustomEventRequestEventInfo self = new PutCustomEventRequestEventInfo();
            return TeaModel.build(map, self);
        }

    }

}
