// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class EventCenterQueryEventsShrinkRequest extends TeaModel {
    /**
     * <p>The request body.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Body")
    public String bodyShrink;

    /**
     * <p>The name of the event bus.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("BusName")
    public String busName;

    /**
     * <p>The number of entries per page. Valid values: 0 to 10000. Default value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>用来标记当前开始读取的位置。置空表示从头开始。</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    public static EventCenterQueryEventsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        EventCenterQueryEventsShrinkRequest self = new EventCenterQueryEventsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public EventCenterQueryEventsShrinkRequest setBodyShrink(String bodyShrink) {
        this.bodyShrink = bodyShrink;
        return this;
    }
    public String getBodyShrink() {
        return this.bodyShrink;
    }

    public EventCenterQueryEventsShrinkRequest setBusName(String busName) {
        this.busName = busName;
        return this;
    }
    public String getBusName() {
        return this.busName;
    }

    public EventCenterQueryEventsShrinkRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public EventCenterQueryEventsShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
