// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListWorkspacesRequest extends TeaModel {
    @NameInMap("maxResults")
    public Integer maxResults;

    @NameInMap("nextToken")
    public String nextToken;

    @NameInMap("statusList")
    public java.util.List<String> statusList;

    @NameInMap("workspaceTemplateList")
    public java.util.List<String> workspaceTemplateList;

    public static ListWorkspacesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListWorkspacesRequest self = new ListWorkspacesRequest();
        return TeaModel.build(map, self);
    }

    public ListWorkspacesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListWorkspacesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListWorkspacesRequest setStatusList(java.util.List<String> statusList) {
        this.statusList = statusList;
        return this;
    }
    public java.util.List<String> getStatusList() {
        return this.statusList;
    }

    public ListWorkspacesRequest setWorkspaceTemplateList(java.util.List<String> workspaceTemplateList) {
        this.workspaceTemplateList = workspaceTemplateList;
        return this;
    }
    public java.util.List<String> getWorkspaceTemplateList() {
        return this.workspaceTemplateList;
    }

}
