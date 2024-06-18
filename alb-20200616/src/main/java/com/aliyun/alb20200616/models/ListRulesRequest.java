// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class ListRulesRequest extends TeaModel {
    /**
     * <p>The direction to which the forwarding rule is applied. Valid values:</p>
     * <ul>
     * <li><strong>Request</strong> (default): The forwarding rule is applied to the client requests received by ALB.</li>
     * <li><strong>Response</strong>: The forwarding rule is applied to the responses returned by backend servers.</li>
     * </ul>
     * <blockquote>
     * <p>You cannot set this parameter to Response if you use basic ALB instances.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Request</p>
     */
    @NameInMap("Direction")
    public String direction;

    /**
     * <p>The listener IDs.</p>
     */
    @NameInMap("ListenerIds")
    public java.util.List<String> listenerIds;

    /**
     * <p>The Application Load Balancer (ALB) instance IDs.</p>
     */
    @NameInMap("LoadBalancerIds")
    public java.util.List<String> loadBalancerIds;

    /**
     * <p>The maximum number of entries to return.</p>
     * <p>Valid values: <strong>1 to 100</strong>.</p>
     * <p>Default value: <strong>20</strong>. If you do not specify this parameter, the default value is used.</p>
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
     * <p>The starting point of the current query. If you do not specify this parameter, the query starts from the beginning.</p>
     * 
     * <strong>example:</strong>
     * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The forwarding rules.</p>
     */
    @NameInMap("RuleIds")
    public java.util.List<String> ruleIds;

    /**
     * <p>The tag.</p>
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
         * <p>The tag key. The tag key can be up to 128 characters in length. It cannot start with aliyun or acs: and cannot contain http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>env</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. The tag value can be up to 128 characters in length. It cannot start with aliyun or acs: and cannot contain http:// or https://.</p>
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
