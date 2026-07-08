// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appflow20230904.models;

import com.aliyun.tea.*;

public class ListFlowsRequest extends TeaModel {
    /**
     * <p>The filter conditions.</p>
     */
    @NameInMap("Filter")
    public java.util.List<ListFlowsRequestFilter> filter;

    /**
     * <p>The maximum number of entries to return.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public String maxResults;

    /**
     * <p>The pagination token for the next page.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAVY3rYiv9VoUJQSiCitgjgTlo5Q2D1qyq9rPPhxWJPl6j8bgHiGAwZWnCMJPepC+WRjTa7fpTA0Diy2AQ4aWoPY=</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Specifies the object tags to which the rule applies. You can specify multiple tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<ListFlowsRequestTag> tag;

    public static ListFlowsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFlowsRequest self = new ListFlowsRequest();
        return TeaModel.build(map, self);
    }

    public ListFlowsRequest setFilter(java.util.List<ListFlowsRequestFilter> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.List<ListFlowsRequestFilter> getFilter() {
        return this.filter;
    }

    public ListFlowsRequest setMaxResults(String maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public String getMaxResults() {
        return this.maxResults;
    }

    public ListFlowsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListFlowsRequest setTag(java.util.List<ListFlowsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListFlowsRequestTag> getTag() {
        return this.tag;
    }

    public static class ListFlowsRequestFilter extends TeaModel {
        /**
         * <p>The name of the filter field.</p>
         * 
         * <strong>example:</strong>
         * <p>FlowId\FlowName</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The filter values.</p>
         */
        @NameInMap("Values")
        public java.util.List<String> values;

        public static ListFlowsRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            ListFlowsRequestFilter self = new ListFlowsRequestFilter();
            return TeaModel.build(map, self);
        }

        public ListFlowsRequestFilter setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListFlowsRequestFilter setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class ListFlowsRequestTag extends TeaModel {
        /**
         * <p>The tag key. You can filter the cluster list by tag. You can specify up to 20 tag pairs. The numeric value n for each tag pair must be unique and must be a consecutive integer starting from 1. The value of Tag.N.Key corresponds to Tag.N.Value.</p>
         * <blockquote>
         * <p>The tag key can be up to 64 characters in length and cannot start with <code>aliyun</code>, <code>acs:</code>, <code>http://</code>, or <code>https://</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>CreateBy</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The authentication content.</p>
         * 
         * <strong>example:</strong>
         * <p>zhangsan</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListFlowsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListFlowsRequestTag self = new ListFlowsRequestTag();
            return TeaModel.build(map, self);
        }

        public ListFlowsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListFlowsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
