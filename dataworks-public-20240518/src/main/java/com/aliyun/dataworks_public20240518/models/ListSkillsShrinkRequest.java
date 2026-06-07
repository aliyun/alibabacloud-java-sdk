// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListSkillsShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>analysis</p>
     */
    @NameInMap("Q")
    public String q;

    @NameInMap("Visibility")
    public String visibilityShrink;

    public static ListSkillsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSkillsShrinkRequest self = new ListSkillsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListSkillsShrinkRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListSkillsShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListSkillsShrinkRequest setQ(String q) {
        this.q = q;
        return this;
    }
    public String getQ() {
        return this.q;
    }

    public ListSkillsShrinkRequest setVisibilityShrink(String visibilityShrink) {
        this.visibilityShrink = visibilityShrink;
        return this;
    }
    public String getVisibilityShrink() {
        return this.visibilityShrink;
    }

}
