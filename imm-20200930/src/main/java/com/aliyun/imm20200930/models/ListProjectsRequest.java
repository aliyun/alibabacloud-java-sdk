// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class ListProjectsRequest extends TeaModel {
    /**
     * <p>The maximum number of projects to return. Valid values: 0 to 200. If you do not set this parameter or set it to 0, the default value 100 is used.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>The pagination token. Set this parameter to the NextToken value returned in the previous API call. Project information is returned in alphabetical order starting from the NextToken position. Leave this parameter empty for the first call.</p>
     * 
     * <strong>example:</strong>
     * <p>MTIzNDU2Nzg6aW1tdGVzdDAx</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The prefix used to list projects. The value can be 0 to 128 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>immtest</p>
     */
    @NameInMap("Prefix")
    public String prefix;

    /**
     * <p>The list of tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<ListProjectsRequestTag> tag;

    public static ListProjectsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProjectsRequest self = new ListProjectsRequest();
        return TeaModel.build(map, self);
    }

    public ListProjectsRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListProjectsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListProjectsRequest setPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }
    public String getPrefix() {
        return this.prefix;
    }

    public ListProjectsRequest setTag(java.util.List<ListProjectsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListProjectsRequestTag> getTag() {
        return this.tag;
    }

    public static class ListProjectsRequestTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListProjectsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListProjectsRequestTag self = new ListProjectsRequestTag();
            return TeaModel.build(map, self);
        }

        public ListProjectsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListProjectsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
