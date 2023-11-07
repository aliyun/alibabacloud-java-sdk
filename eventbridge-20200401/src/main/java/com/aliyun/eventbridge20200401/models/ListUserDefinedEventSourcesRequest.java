// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class ListUserDefinedEventSourcesRequest extends TeaModel {
    /**
     * <p>The name of the event bus.</p>
     */
    @NameInMap("EventBusName")
    public String eventBusName;

    /**
     * <p>The maximum number of entries to be returned in a call. You can use this parameter and NextToken to implement paging. Note: Up to 100 entries can be returned in a call.</p>
     */
    @NameInMap("Limit")
    public Integer limit;

    /**
     * <p>The name of the event source.</p>
     */
    @NameInMap("NamePrefix")
    public String namePrefix;

    /**
     * <p>If you configure Limit and excess return values exist, this parameter is returned.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    public static ListUserDefinedEventSourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUserDefinedEventSourcesRequest self = new ListUserDefinedEventSourcesRequest();
        return TeaModel.build(map, self);
    }

    public ListUserDefinedEventSourcesRequest setEventBusName(String eventBusName) {
        this.eventBusName = eventBusName;
        return this;
    }
    public String getEventBusName() {
        return this.eventBusName;
    }

    public ListUserDefinedEventSourcesRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public ListUserDefinedEventSourcesRequest setNamePrefix(String namePrefix) {
        this.namePrefix = namePrefix;
        return this;
    }
    public String getNamePrefix() {
        return this.namePrefix;
    }

    public ListUserDefinedEventSourcesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
