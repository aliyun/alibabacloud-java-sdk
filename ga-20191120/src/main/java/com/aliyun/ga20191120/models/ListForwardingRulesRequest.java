// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListForwardingRulesRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("ListenerId")
    public String listenerId;

    @NameInMap("AcceleratorId")
    public String acceleratorId;

    @NameInMap("ForwardingRuleId")
    public String forwardingRuleId;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("MaxResults")
    public Integer maxResults;

    public static ListForwardingRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListForwardingRulesRequest self = new ListForwardingRulesRequest();
        return TeaModel.build(map, self);
    }

    public ListForwardingRulesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListForwardingRulesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ListForwardingRulesRequest setListenerId(String listenerId) {
        this.listenerId = listenerId;
        return this;
    }
    public String getListenerId() {
        return this.listenerId;
    }

    public ListForwardingRulesRequest setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public ListForwardingRulesRequest setForwardingRuleId(String forwardingRuleId) {
        this.forwardingRuleId = forwardingRuleId;
        return this;
    }
    public String getForwardingRuleId() {
        return this.forwardingRuleId;
    }

    public ListForwardingRulesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListForwardingRulesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

}
