// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class ListListenersRequest extends TeaModel {
    /**
     * <p>The listener IDs. You can specify up to 20 IDs.</p>
     */
    @NameInMap("ListenerIds")
    public java.util.List<String> listenerIds;

    /**
     * <p>The listener protocol. Valid values:</p>
     * <br>
     * <p>*   **HTTP**</p>
     * <p>*   **HTTPS**</p>
     * <p>*   **QUIC**</p>
     */
    @NameInMap("ListenerProtocol")
    public String listenerProtocol;

    /**
     * <p>The ID of the Application Load Balancer (ALB) instance. You can specify at most 20 IDs.</p>
     */
    @NameInMap("LoadBalancerIds")
    public java.util.List<String> loadBalancerIds;

    /**
     * <p>The maximum number of entries to return. This parameter is optional. Valid values: **1 to 100**. If you do not specify this parameter, the default value **20** is used.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. Valid values:</p>
     * <br>
     * <p>*   You do not need to specify this parameter for the first request.</p>
     * <p>*   You must specify the token that is obtained from the previous query as the value of **NextToken**.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<ListListenersRequestTag> tag;

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

    public ListListenersRequest setTag(java.util.List<ListListenersRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListListenersRequestTag> getTag() {
        return this.tag;
    }

    public static class ListListenersRequestTag extends TeaModel {
        /**
         * <p>The tag key. The tag key can be up to 128 characters in length and cannot start with `acs:` or `aliyun`. It cannot contain `http://` or `https://`.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. The tag value can be up to 128 characters in length and cannot start with `acs:` or `aliyun`. It cannot contain `http://` or `https://`.</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListListenersRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListListenersRequestTag self = new ListListenersRequestTag();
            return TeaModel.build(map, self);
        }

        public ListListenersRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListListenersRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
