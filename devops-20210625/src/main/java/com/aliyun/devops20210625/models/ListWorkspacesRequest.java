// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListWorkspacesRequest extends TeaModel {
    // 本次读取的最大数据记录数量，默认10，最大100
    @NameInMap("maxResults")
    public Integer maxResults;

    // 用来标记当前开始读取的位置，置空表示从头开始
    @NameInMap("nextToken")
    public String nextToken;

    // 枚举值：CREATING-创建中, SUCCESS-运行中, FROZEN-冻结中, RECOVERING-恢复中
    @NameInMap("statusList")
    public java.util.List<String> statusList;

    // 空间模板列表
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
