// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListWorkspacesShrinkRequest extends TeaModel {
    // 本次读取的最大数据记录数量，默认10，最大100
    @NameInMap("maxResults")
    public Integer maxResults;

    // 用来标记当前开始读取的位置，置空表示从头开始
    @NameInMap("nextToken")
    public String nextToken;

    // 枚举值：CREATING-创建中, SUCCESS-运行中, FROZEN-冻结中, RECOVERING-恢复中
    @NameInMap("statusList")
    public String statusListShrink;

    // 空间模板列表
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
