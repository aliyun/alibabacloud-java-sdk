// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class ListRulesRequest extends TeaModel {
    // 监听ID列表
    @NameInMap("ListenerIds")
    public java.util.List<String> listenerIds;

    // 实例ID列表
    @NameInMap("LoadBalancerIds")
    public java.util.List<String> loadBalancerIds;

    // 本次读取的最大数据记录数量，此参数为可选参数，取值1-100，用户传入为空时，默认为20。
    @NameInMap("MaxResults")
    public Integer maxResults;

    // 用来标记当前开始读取的位置，置空表示从头开始。
    @NameInMap("NextToken")
    public String nextToken;

    // 转发规则ID列表，N最大支持20
    @NameInMap("RuleIds")
    public java.util.List<String> ruleIds;

    public static ListRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRulesRequest self = new ListRulesRequest();
        return TeaModel.build(map, self);
    }

    public ListRulesRequest setListenerIds(java.util.List<String> listenerIds) {
        this.listenerIds = listenerIds;
        return this;
    }
    public java.util.List<String> getListenerIds() {
        return this.listenerIds;
    }

    public ListRulesRequest setLoadBalancerIds(java.util.List<String> loadBalancerIds) {
        this.loadBalancerIds = loadBalancerIds;
        return this;
    }
    public java.util.List<String> getLoadBalancerIds() {
        return this.loadBalancerIds;
    }

    public ListRulesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListRulesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListRulesRequest setRuleIds(java.util.List<String> ruleIds) {
        this.ruleIds = ruleIds;
        return this;
    }
    public java.util.List<String> getRuleIds() {
        return this.ruleIds;
    }

}
