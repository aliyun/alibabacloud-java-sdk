// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class ListRulesRequest extends TeaModel {
    /**
     * <p>The direction of the forwarding rule. Valid values:</p>
     * <ul>
     * <li><p><strong>Request</strong> (default): The forwarding rule is applied to requests. Application Load Balancer (ALB) matches conditions in the requests sent from clients and performs the specified actions.</p>
     * </li>
     * <li><p><strong>Response</strong>: The forwarding rule is applied to responses. ALB matches conditions in the responses sent from backend servers and performs the specified actions.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Basic ALB instances do not support the Response type.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Request</p>
     */
    @NameInMap("Direction")
    public String direction;

    /**
     * <p>The listener IDs. You can specify up to 20 listener IDs.</p>
     */
    @NameInMap("ListenerIds")
    public java.util.List<String> listenerIds;

    /**
     * <p>The SLB instance IDs. You can specify up to 20 instance IDs.</p>
     */
    @NameInMap("LoadBalancerIds")
    public java.util.List<String> loadBalancerIds;

    /**
     * <p>The maximum number of entries to return.</p>
     * <p>Valid values: 1 to <strong>100</strong>.</p>
     * <p>Default value: <strong>20</strong>.</p>
     * <blockquote>
     * <p>This parameter is optional.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that is used to retrieve the next page of results. Valid values:</p>
     * <ul>
     * <li><p>You do not need to set this parameter for the first query.</p>
     * </li>
     * <li><p>For a subsequent query, set this parameter to the value of <strong>NextToken</strong> from the previous response.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The IDs of the forwarding rules. You can specify up to 20 forwarding rule IDs.</p>
     */
    @NameInMap("RuleIds")
    public java.util.List<String> ruleIds;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<ListRulesRequestTag> tag;

    public static ListRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRulesRequest self = new ListRulesRequest();
        return TeaModel.build(map, self);
    }

    public ListRulesRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
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

    public ListRulesRequest setTag(java.util.List<ListRulesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListRulesRequestTag> getTag() {
        return this.tag;
    }

    public static class ListRulesRequestTag extends TeaModel {
        /**
         * <p>The tag key. The tag key can be up to 128 characters in length. It cannot start with \<code>aliyun\\</code> or \<code>acs:\\</code>, and cannot contain \<code>http\\://\\</code> or \<code>https\\://\\</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>env</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. The tag value can be up to 128 characters in length. It cannot start with \<code>aliyun\\</code> or \<code>acs:\\</code>, and cannot contain \<code>http\\://\\</code> or \<code>https\\://\\</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>product</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListRulesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListRulesRequestTag self = new ListRulesRequestTag();
            return TeaModel.build(map, self);
        }

        public ListRulesRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListRulesRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
