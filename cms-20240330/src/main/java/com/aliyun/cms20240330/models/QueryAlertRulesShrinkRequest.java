// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class QueryAlertRulesShrinkRequest extends TeaModel {
    @NameInMap("body")
    public String bodyShrink;

    /**
     * <strong>example:</strong>
     * <p>xxxxx-xxxx-xxxx</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    public static QueryAlertRulesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAlertRulesShrinkRequest self = new QueryAlertRulesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QueryAlertRulesShrinkRequest setBodyShrink(String bodyShrink) {
        this.bodyShrink = bodyShrink;
        return this;
    }
    public String getBodyShrink() {
        return this.bodyShrink;
    }

    public QueryAlertRulesShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public QueryAlertRulesShrinkRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public QueryAlertRulesShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
