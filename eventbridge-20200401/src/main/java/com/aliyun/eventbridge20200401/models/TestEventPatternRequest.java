// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class TestEventPatternRequest extends TeaModel {
    /**
     * <p>The event.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Event")
    public String event;

    /**
     * <p>The event pattern.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("EventPattern")
    public String eventPattern;

    public static TestEventPatternRequest build(java.util.Map<String, ?> map) throws Exception {
        TestEventPatternRequest self = new TestEventPatternRequest();
        return TeaModel.build(map, self);
    }

    public TestEventPatternRequest setEvent(String event) {
        this.event = event;
        return this;
    }
    public String getEvent() {
        return this.event;
    }

    public TestEventPatternRequest setEventPattern(String eventPattern) {
        this.eventPattern = eventPattern;
        return this;
    }
    public String getEventPattern() {
        return this.eventPattern;
    }

}
