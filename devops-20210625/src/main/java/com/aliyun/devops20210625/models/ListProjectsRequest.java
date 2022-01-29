// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListProjectsRequest extends TeaModel {
    // 项目类型
    @NameInMap("category")
    public String category;

    @NameInMap("conditions")
    public String conditions;

    @NameInMap("extraConditions")
    public String extraConditions;

    // 每页最大返回数量，0-200，默认值20
    @NameInMap("maxResults")
    public Long maxResults;

    // 分页中的起始序列
    @NameInMap("nextToken")
    public String nextToken;

    // 公开类型
    @NameInMap("scope")
    public String scope;

    public static ListProjectsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProjectsRequest self = new ListProjectsRequest();
        return TeaModel.build(map, self);
    }

    public ListProjectsRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public ListProjectsRequest setConditions(String conditions) {
        this.conditions = conditions;
        return this;
    }
    public String getConditions() {
        return this.conditions;
    }

    public ListProjectsRequest setExtraConditions(String extraConditions) {
        this.extraConditions = extraConditions;
        return this;
    }
    public String getExtraConditions() {
        return this.extraConditions;
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

    public ListProjectsRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

}
