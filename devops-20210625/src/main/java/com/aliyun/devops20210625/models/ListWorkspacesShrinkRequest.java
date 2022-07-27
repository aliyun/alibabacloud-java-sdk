// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListWorkspacesShrinkRequest extends TeaModel {
    @NameInMap("maxResults")
    public Integer maxResults;

    @NameInMap("nextToken")
    public String nextToken;

    @NameInMap("statusList")
    public String statusListShrink;

    @NameInMap("workspaceTemplateList")
    public String workspaceTemplateListShrink;

    public static ListWorkspacesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListWorkspacesShrinkRequest self = new ListWorkspacesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListWorkspacesShrinkRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListWorkspacesShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListWorkspacesShrinkRequest setStatusListShrink(String statusListShrink) {
        this.statusListShrink = statusListShrink;
        return this;
    }
    public String getStatusListShrink() {
        return this.statusListShrink;
    }

    public ListWorkspacesShrinkRequest setWorkspaceTemplateListShrink(String workspaceTemplateListShrink) {
        this.workspaceTemplateListShrink = workspaceTemplateListShrink;
        return this;
    }
    public String getWorkspaceTemplateListShrink() {
        return this.workspaceTemplateListShrink;
    }

}
