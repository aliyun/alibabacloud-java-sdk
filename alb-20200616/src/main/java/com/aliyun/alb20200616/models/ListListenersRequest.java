// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class ListListenersRequest extends TeaModel {
    /**
     * <p>The instance IDs. A maximum of 20 instance IDs are supported.</p>
     */
    @NameInMap("ListenerIds")
    public java.util.List<String> listenerIds;

    /**
     * <p>The listener protocol that you want to use as a filter. Valid values:</p>
     * <ul>
     * <li><strong>HTTP</strong>: The protocol type is HTTP.</li>
     * <li><strong>HTTPS</strong>: The protocol type is HTTPS.</li>
     * <li><strong>QUIC</strong>: The protocol type is QUIC.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>HTTP</p>
     */
    @NameInMap("ListenerProtocol")
    public String listenerProtocol;

    /**
     * <p>The Application Load Balancer (ALB) load balancing instance ID. A maximum of 20 instance IDs are supported.</p>
     */
    @NameInMap("LoadBalancerIds")
    public java.util.List<String> loadBalancerIds;

    /**
     * <p>The maximum number of data records to read in this request. This parameter is optional. Valid values: <strong>1</strong> to <strong>100</strong>. If this parameter is not specified, the default value is <strong>20</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. Valid values:</p>
     * <ul>
     * <li>You do not need to specify this parameter for the first request or if no next query exists.</li>
     * <li>If a next query exists, set the value to the <strong>NextToken</strong> value returned in the previous API call.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FFmyTO70tTpLG6I4FmYAXGKPd****</p>
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
         * <p>The tag key. The tag key can be up to 128 characters in length and cannot start with aliyun or acs:. It cannot contain http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>env</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. The tag value can be up to 128 characters in length and cannot start with aliyun or acs:. It cannot contain http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>product</p>
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
