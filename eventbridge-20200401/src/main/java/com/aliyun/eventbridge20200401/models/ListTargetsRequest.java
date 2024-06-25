// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class ListTargetsRequest extends TeaModel {
    /**
     * <p>The Alibaba Cloud Resource Name (ARN) of the event rule.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:fc:cn-hangzhou:118609547428****:services/fc-connector.a1/functions/event</p>
     */
    @NameInMap("Arn")
    public String arn;

    /**
     * <p>The name of the event bus.</p>
     * 
     * <strong>example:</strong>
     * <p>my-event-bus</p>
     */
    @NameInMap("EventBusName")
    public String eventBusName;

    /**
     * <p>The maximum number of returned entries in a call.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Limit")
    public Integer limit;

    /**
     * <p>If you configure Limit and excess return values exist, this parameter is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The name of the event rule.</p>
     * 
     * <strong>example:</strong>
     * <p>tf-testacc-rule</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    public static ListTargetsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTargetsRequest self = new ListTargetsRequest();
        return TeaModel.build(map, self);
    }

    public ListTargetsRequest setArn(String arn) {
        this.arn = arn;
        return this;
    }
    public String getArn() {
        return this.arn;
    }

    public ListTargetsRequest setEventBusName(String eventBusName) {
        this.eventBusName = eventBusName;
        return this;
    }
    public String getEventBusName() {
        return this.eventBusName;
    }

    public ListTargetsRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public ListTargetsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTargetsRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

}
