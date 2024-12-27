// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class ListProjectsShrinkRequest extends TeaModel {
    /**
     * <p>The maximum number of entries to return. Valid values: 0 to 200. Default value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of NextToken. The operation returns the projects in lexicographical order starting from the location specified by NextToken.</p>
     * 
     * <strong>example:</strong>
     * <p>MTIzNDU2Nzg6aW1tdGVzdDAx</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The prefix used by the projects that you want to query. The prefix must be up to 128 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>immtest</p>
     */
    @NameInMap("Prefix")
    public String prefix;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tag")
    public String tagShrink;

    public static ListProjectsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProjectsShrinkRequest self = new ListProjectsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListProjectsShrinkRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListProjectsShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListProjectsShrinkRequest setPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }
    public String getPrefix() {
        return this.prefix;
    }

    public ListProjectsShrinkRequest setTagShrink(String tagShrink) {
        this.tagShrink = tagShrink;
        return this;
    }
    public String getTagShrink() {
        return this.tagShrink;
    }

}
