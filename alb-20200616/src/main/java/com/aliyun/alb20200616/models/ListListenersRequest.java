// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class ListListenersRequest extends TeaModel {
    // 用来标记当前开始读取的位置，置空表示从头开始。
    @NameInMap("NextToken")
    public String nextToken;

    // 本次读取的最大数据记录数量，此参数为可选参数，取值1-100，用户传入为空时，默认为20。
    @NameInMap("MaxResults")
    public Integer maxResults;

    // 监听ID列表，N最大支持20
    @NameInMap("ListenerIds")
    public java.util.List<String> listenerIds;

    // 实例ID列表，N最大支持20
    @NameInMap("LoadBalancerIds")
    public java.util.List<String> loadBalancerIds;

    // 监听协议
    @NameInMap("ListenerProtocol")
    public String listenerProtocol;

    public static ListListenersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListListenersRequest self = new ListListenersRequest();
        return TeaModel.build(map, self);
    }

    public ListListenersRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListListenersRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListListenersRequest setListenerIds(java.util.List<String> listenerIds) {
        this.listenerIds = listenerIds;
        return this;
    }
    public java.util.List<String> getListenerIds() {
        return this.listenerIds;
    }

    public ListListenersRequest setLoadBalancerIds(java.util.List<String> loadBalancerIds) {
        this.loadBalancerIds = loadBalancerIds;
        return this;
    }
    public java.util.List<String> getLoadBalancerIds() {
        return this.loadBalancerIds;
    }

    public ListListenersRequest setListenerProtocol(String listenerProtocol) {
        this.listenerProtocol = listenerProtocol;
        return this;
    }
    public String getListenerProtocol() {
        return this.listenerProtocol;
    }

}
