// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class OSSTriggerConfig extends TeaModel {
    /**
     * <p>The list of events. Enter an event related to OSS. For more information about event types,see <a href="https://help.aliyun.com/document_detail/2513613.html">OSS events</a>.</p>
     */
    @NameInMap("events")
    public java.util.List<String> events;

    /**
     * <p>The event filtering rule.</p>
     */
    @NameInMap("filter")
    public Filter filter;

    public static OSSTriggerConfig build(java.util.Map<String, ?> map) throws Exception {
        OSSTriggerConfig self = new OSSTriggerConfig();
        return TeaModel.build(map, self);
    }

    public OSSTriggerConfig setEvents(java.util.List<String> events) {
        this.events = events;
        return this;
    }
    public java.util.List<String> getEvents() {
        return this.events;
    }

    public OSSTriggerConfig setFilter(Filter filter) {
        this.filter = filter;
        return this;
    }
    public Filter getFilter() {
        return this.filter;
    }

}
