// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class ListUserDefinedEventSourcesRequest extends TeaModel {
    /**
     * <p>The name of the event bus.</p>
     * 
     * <strong>example:</strong>
     * <p>testBus</p>
     */
    @NameInMap("EventBusName")
    public String eventBusName;

    /**
     * <p>The maximum number of entries to return per request. You can use this parameter with NextToken for pagination. The maximum value is 100.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("Limit")
    public Integer limit;

    /**
     * <p>The prefix of the event source name.</p>
     * 
     * <strong>example:</strong>
     * <p>testName</p>
     */
    @NameInMap("NamePrefix")
    public String namePrefix;

    /**
     * <p>The token used to retrieve the next page of results. Set this parameter to the NextToken value returned from a previous call.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
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
