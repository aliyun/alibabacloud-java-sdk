// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListAggregatorsRequest extends TeaModel {
    /**
     * <p>The maximum number of entries to return in a request. Valid values: 1 to 100.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of <code>NextToken</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>TGlzdFJlc291cmNlU2hhcmVzJjE1MTI2NjY4NzY5MTAzOTEmMiZORnI4NDhVeEtrUT0</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The tags of the resource.</p>
     * <p>You can add up to 20 tags to a resource.</p>
     */
    @NameInMap("Tag")
    public java.util.List<ListAggregatorsRequestTag> tag;

    public static ListAggregatorsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAggregatorsRequest self = new ListAggregatorsRequest();
        return TeaModel.build(map, self);
    }

    public ListAggregatorsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAggregatorsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAggregatorsRequest setTag(java.util.List<ListAggregatorsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListAggregatorsRequestTag> getTag() {
        return this.tag;
    }

    public static class ListAggregatorsRequestTag extends TeaModel {
        /**
         * <p>The tag key of the resource. You can specify up to 20 tag keys.</p>
         * <p>The tag key cannot be an empty string. The tag key must be 1 to 64 characters in length and cannot start with <code>aliyun</code> or <code>acs</code>:. The tag key cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>key-1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag values.</p>
         * <p>The tag values can be an empty string or up to 128 characters in length. The tag values cannot start with <code>aliyun</code> or <code>acs:</code> and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * <p>Each key-value must be unique. You can specify at most 20 tag values in each call.</p>
         * 
         * <strong>example:</strong>
         * <p>value-1</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListAggregatorsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListAggregatorsRequestTag self = new ListAggregatorsRequestTag();
            return TeaModel.build(map, self);
        }

        public ListAggregatorsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListAggregatorsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
