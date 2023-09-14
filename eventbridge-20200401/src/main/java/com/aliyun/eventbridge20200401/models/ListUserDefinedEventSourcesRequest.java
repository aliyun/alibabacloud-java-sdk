// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class ListUserDefinedEventSourcesRequest extends TeaModel {
    @NameInMap("EventBusName")
    public String eventBusName;

    @NameInMap("Limit")
    public Integer limit;

    @NameInMap("NamePrefix")
    public String namePrefix;

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
