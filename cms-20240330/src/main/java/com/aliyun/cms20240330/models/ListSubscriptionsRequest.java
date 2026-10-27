// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListSubscriptionsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>agent-rca-001</p>
     */
    @NameInMap("agentUuid")
    public String agentUuid;

    /**
     * <strong>example:</strong>
     * <p>asc</p>
     */
    @NameInMap("direction")
    public String direction;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("enable")
    public Boolean enable;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>2-3408-4595-9d80-****</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>1a2b3c4d5e6f7a8b9c0d1e2f3a4b5c6d</p>
     */
    @NameInMap("notifyStrategyUuid")
    public String notifyStrategyUuid;

    /**
     * <strong>example:</strong>
     * <p>id</p>
     */
    @NameInMap("orderBy")
    public String orderBy;

    /**
     * <strong>example:</strong>
     * <p>123123123123</p>
     */
    @NameInMap("subscriptionId")
    public String subscriptionId;

    /**
     * <strong>example:</strong>
     * <p>测试订阅</p>
     */
    @NameInMap("subscriptionName")
    public String subscriptionName;

    /**
     * <strong>example:</strong>
     * <p>NORMAL</p>
     */
    @NameInMap("subscriptionType")
    public String subscriptionType;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("unbound")
    @Deprecated
    public Boolean unbound;

    /**
     * <strong>example:</strong>
     * <p>workspace-test</p>
     */
    @NameInMap("workspace")
    public String workspace;

    public static ListSubscriptionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSubscriptionsRequest self = new ListSubscriptionsRequest();
        return TeaModel.build(map, self);
    }

    public ListSubscriptionsRequest setAgentUuid(String agentUuid) {
        this.agentUuid = agentUuid;
        return this;
    }
    public String getAgentUuid() {
        return this.agentUuid;
    }

    public ListSubscriptionsRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public ListSubscriptionsRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public ListSubscriptionsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListSubscriptionsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListSubscriptionsRequest setNotifyStrategyUuid(String notifyStrategyUuid) {
        this.notifyStrategyUuid = notifyStrategyUuid;
        return this;
    }
    public String getNotifyStrategyUuid() {
        return this.notifyStrategyUuid;
    }

    public ListSubscriptionsRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public ListSubscriptionsRequest setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }
    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    public ListSubscriptionsRequest setSubscriptionName(String subscriptionName) {
        this.subscriptionName = subscriptionName;
        return this;
    }
    public String getSubscriptionName() {
        return this.subscriptionName;
    }

    public ListSubscriptionsRequest setSubscriptionType(String subscriptionType) {
        this.subscriptionType = subscriptionType;
        return this;
    }
    public String getSubscriptionType() {
        return this.subscriptionType;
    }

    @Deprecated
    public ListSubscriptionsRequest setUnbound(Boolean unbound) {
        this.unbound = unbound;
        return this;
    }
    public Boolean getUnbound() {
        return this.unbound;
    }

    public ListSubscriptionsRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
