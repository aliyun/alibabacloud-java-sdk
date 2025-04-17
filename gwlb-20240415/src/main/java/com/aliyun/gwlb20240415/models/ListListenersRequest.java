// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gwlb20240415.models;

import com.aliyun.tea.*;

public class ListListenersRequest extends TeaModel {
    /**
     * <p>The listener IDs. You can specify at most 20 listener IDs.</p>
     */
    @NameInMap("ListenerIds")
    public java.util.List<String> listenerIds;

    /**
     * <p>The GWLB instance IDs. You can specify at most 20 instance IDs.</p>
     */
    @NameInMap("LoadBalancerIds")
    public java.util.List<String> loadBalancerIds;

    /**
     * <p>The maximum number of results to be returned from a single query when the NextToken parameter is used in the query. Valid values: 1 to 1000. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. Valid values:</p>
     * <ul>
     * <li>If <strong>NextToken</strong> is empty, no next page exists.</li>
     * <li>If a value of <strong>NextToken</strong> is returned, the value indicates the token that is used for the next query.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>d209f4e63ec942c967c50c888a13****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The number of entries to be skipped in the call.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Skip")
    public Integer skip;

    /**
     * <p>The tags. You can specify at most 20 tags in each call.</p>
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

    public ListListenersRequest setSkip(Integer skip) {
        this.skip = skip;
        return this;
    }
    public Integer getSkip() {
        return this.skip;
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
         * <p>The tag key. The tag key cannot be an empty string.</p>
         * <p>The tag key can be up to 128 characters in length. The tag key cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>tagKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. The tag value can be up to 256 characters in length and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>tagValue</p>
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
