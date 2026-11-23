// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListGatewayWebsocketEventsRequest extends TeaModel {
    /**
     * <p>The connection identifier.</p>
     * 
     * <strong>example:</strong>
     * <p>connection-example</p>
     */
    @NameInMap("connectionId")
    public String connectionId;

    /**
     * <p>The end time. The value is a UNIX timestamp in seconds since the UTC epoch. Example: 1793919600.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1793919600</p>
     */
    @NameInMap("endTime")
    public Long endTime;

    /**
     * <p>The maximum number of results per page for cursor-based pagination.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The model.</p>
     * 
     * <strong>example:</strong>
     * <p>qwen-plus</p>
     */
    @NameInMap("model")
    public String model;

    /**
     * <p>The pagination token for the next page.</p>
     * 
     * <strong>example:</strong>
     * <p>opaque-token-from-previous-page</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The provider.</p>
     * 
     * <strong>example:</strong>
     * <p>dashscope</p>
     */
    @NameInMap("provider")
    public String provider;

    /**
     * <p>The log source.</p>
     * 
     * <strong>example:</strong>
     * <p>access.log</p>
     */
    @NameInMap("source")
    public String source;

    /**
     * <p>The start time. The value is a UNIX timestamp in seconds since the UTC epoch. Example: 1793916000.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1793916000</p>
     */
    @NameInMap("startTime")
    public Long startTime;

    /**
     * <p>The turn identifier.</p>
     * 
     * <strong>example:</strong>
     * <p>turn-example</p>
     */
    @NameInMap("turnId")
    public String turnId;

    public static ListGatewayWebsocketEventsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListGatewayWebsocketEventsRequest self = new ListGatewayWebsocketEventsRequest();
        return TeaModel.build(map, self);
    }

    public ListGatewayWebsocketEventsRequest setConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }
    public String getConnectionId() {
        return this.connectionId;
    }

    public ListGatewayWebsocketEventsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListGatewayWebsocketEventsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListGatewayWebsocketEventsRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public ListGatewayWebsocketEventsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListGatewayWebsocketEventsRequest setProvider(String provider) {
        this.provider = provider;
        return this;
    }
    public String getProvider() {
        return this.provider;
    }

    public ListGatewayWebsocketEventsRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public ListGatewayWebsocketEventsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public ListGatewayWebsocketEventsRequest setTurnId(String turnId) {
        this.turnId = turnId;
        return this;
    }
    public String getTurnId() {
        return this.turnId;
    }

}
