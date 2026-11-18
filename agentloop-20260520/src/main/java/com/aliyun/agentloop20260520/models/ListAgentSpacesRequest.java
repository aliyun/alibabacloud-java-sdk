// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class ListAgentSpacesRequest extends TeaModel {
    /**
     * <p>The name of the AgentSpace.</p>
     * 
     * <strong>example:</strong>
     * <p>test-agent-space</p>
     */
    @NameInMap("agentSpace")
    public String agentSpace;

    /**
     * <p>The maximum number of results.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token.</p>
     * 
     * <strong>example:</strong>
     * <p>pEL20OGYeZQez8NdW7ve</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regionId")
    public String regionId;

    /**
     * <p>Filters only active AgentSpaces in the current region. Multiple conditions are combined with AND, and keys must be unique. Omitting the value matches the existence of the key, and an empty character string is an exact match for an empty value. An empty array is equivalent to not using label filtering and retains the original cross-region resources.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;key&quot;:&quot;env&quot;,&quot;value&quot;:&quot;test&quot;}]</p>
     */
    @NameInMap("tag")
    public java.util.List<ListAgentSpacesRequestTag> tag;

    public static ListAgentSpacesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAgentSpacesRequest self = new ListAgentSpacesRequest();
        return TeaModel.build(map, self);
    }

    public ListAgentSpacesRequest setAgentSpace(String agentSpace) {
        this.agentSpace = agentSpace;
        return this;
    }
    public String getAgentSpace() {
        return this.agentSpace;
    }

    public ListAgentSpacesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAgentSpacesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAgentSpacesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListAgentSpacesRequest setTag(java.util.List<ListAgentSpacesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListAgentSpacesRequestTag> getTag() {
        return this.tag;
    }

    public static class ListAgentSpacesRequestTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>env</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("value")
        public String value;

        public static ListAgentSpacesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListAgentSpacesRequestTag self = new ListAgentSpacesRequestTag();
            return TeaModel.build(map, self);
        }

        public ListAgentSpacesRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListAgentSpacesRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
