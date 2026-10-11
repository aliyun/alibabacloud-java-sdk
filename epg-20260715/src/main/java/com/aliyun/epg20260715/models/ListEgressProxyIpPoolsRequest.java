// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.epg20260715.models;

import com.aliyun.tea.*;

public class ListEgressProxyIpPoolsRequest extends TeaModel {
    @NameInMap("EgressProxyGatewayIds")
    public java.util.List<String> egressProxyGatewayIds;

    @NameInMap("EgressProxyIpPoolIds")
    public java.util.List<String> egressProxyIpPoolIds;

    @NameInMap("EgressProxyIpPoolNames")
    public java.util.List<String> egressProxyIpPoolNames;

    /**
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>a8cfe419acc68a35e0b5e8707e68181f</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Skip")
    public Integer skip;

    /**
     * <strong>example:</strong>
     * <p>Active</p>
     */
    @NameInMap("Status")
    public String status;

    @NameInMap("Tag")
    public java.util.List<ListEgressProxyIpPoolsRequestTag> tag;

    public static ListEgressProxyIpPoolsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEgressProxyIpPoolsRequest self = new ListEgressProxyIpPoolsRequest();
        return TeaModel.build(map, self);
    }

    public ListEgressProxyIpPoolsRequest setEgressProxyGatewayIds(java.util.List<String> egressProxyGatewayIds) {
        this.egressProxyGatewayIds = egressProxyGatewayIds;
        return this;
    }
    public java.util.List<String> getEgressProxyGatewayIds() {
        return this.egressProxyGatewayIds;
    }

    public ListEgressProxyIpPoolsRequest setEgressProxyIpPoolIds(java.util.List<String> egressProxyIpPoolIds) {
        this.egressProxyIpPoolIds = egressProxyIpPoolIds;
        return this;
    }
    public java.util.List<String> getEgressProxyIpPoolIds() {
        return this.egressProxyIpPoolIds;
    }

    public ListEgressProxyIpPoolsRequest setEgressProxyIpPoolNames(java.util.List<String> egressProxyIpPoolNames) {
        this.egressProxyIpPoolNames = egressProxyIpPoolNames;
        return this;
    }
    public java.util.List<String> getEgressProxyIpPoolNames() {
        return this.egressProxyIpPoolNames;
    }

    public ListEgressProxyIpPoolsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListEgressProxyIpPoolsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListEgressProxyIpPoolsRequest setSkip(Integer skip) {
        this.skip = skip;
        return this;
    }
    public Integer getSkip() {
        return this.skip;
    }

    public ListEgressProxyIpPoolsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListEgressProxyIpPoolsRequest setTag(java.util.List<ListEgressProxyIpPoolsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListEgressProxyIpPoolsRequestTag> getTag() {
        return this.tag;
    }

    public static class ListEgressProxyIpPoolsRequestTag extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>apitest_msgkey_20260529101130_key_1780020691018</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>1770104466</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListEgressProxyIpPoolsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListEgressProxyIpPoolsRequestTag self = new ListEgressProxyIpPoolsRequestTag();
            return TeaModel.build(map, self);
        }

        public ListEgressProxyIpPoolsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListEgressProxyIpPoolsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
