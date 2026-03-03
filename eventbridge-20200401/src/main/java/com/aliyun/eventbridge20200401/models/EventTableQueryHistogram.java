// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class EventTableQueryHistogram extends TeaModel {
    @NameInMap("Count")
    public Long count;

    @NameInMap("From")
    public Long from;

    @NameInMap("To")
    public Long to;

    public static EventTableQueryHistogram build(java.util.Map<String, ?> map) throws Exception {
        EventTableQueryHistogram self = new EventTableQueryHistogram();
        return TeaModel.build(map, self);
    }

    public EventTableQueryHistogram setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public EventTableQueryHistogram setFrom(Long from) {
        this.from = from;
        return this;
    }
    public Long getFrom() {
        return this.from;
    }

    public EventTableQueryHistogram setTo(Long to) {
        this.to = to;
        return this;
    }
    public Long getTo() {
        return this.to;
    }

}
