// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class ListProjectsShrinkRequest extends TeaModel {
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
