// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class ListListenersRequest extends TeaModel {
    @NameInMap("ListenerIds")
    public java.util.List<String> listenerIds;

    @NameInMap("ListenerProtocol")
    public String listenerProtocol;

    @NameInMap("LoadBalancerIds")
    public java.util.List<String> loadBalancerIds;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    public static ListListenersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListListenersRequest self = new ListListenersRequest();
        return TeaModel.build(map, self);
    }

    public ListListenersRequest setListenerIds(java.util.List<String> listenerIds) {
        this.listenerIds = listenerIds;
        return this;
    }
    public java.util.List<String> getListenerIds() {
        return this.listenerIds;
    }

    public ListListenersRequest setListenerProtocol(String listenerProtocol) {
        this.listenerProtocol = listenerProtocol;
        return this;
    }
    public String getListenerProtocol() {
        return this.listenerProtocol;
    }

    public ListListenersRequest setLoadBalancerIds(java.util.List<String> loadBalancerIds) {
        this.loadBalancerIds = loadBalancerIds;
        return this;
    }
    public java.util.List<String> getLoadBalancerIds() {
        return this.loadBalancerIds;
    }

    public ListListenersRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListListenersRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
