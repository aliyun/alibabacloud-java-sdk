// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListWorkitemsRequest extends TeaModel {
    // 工作项类型，需求为Req，缺陷为Bug，任务为Task，风险为Risk
    @NameInMap("category")
    public String category;

    // 过滤条件
    @NameInMap("conditions")
    public String conditions;

    // 额外条件
    @NameInMap("extraConditions")
    public String extraConditions;

    // 分组条件
    @NameInMap("groupCondition")
    public String groupCondition;

    // 每页最大返回数量，0-200，默认值20
    @NameInMap("maxResults")
    public String maxResults;

    // 分页中的起始序列
    @NameInMap("nextToken")
    public String nextToken;

    // 排序顺序
    @NameInMap("orderBy")
    public String orderBy;

    // 查询类型
    @NameInMap("searchType")
    public String searchType;

    // 项目id
    @NameInMap("spaceIdentifier")
    public String spaceIdentifier;

    // 项目类型
    @NameInMap("spaceType")
    public String spaceType;

    public static ListWorkitemsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListWorkitemsRequest self = new ListWorkitemsRequest();
        return TeaModel.build(map, self);
    }

    public ListWorkitemsRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public ListWorkitemsRequest setConditions(String conditions) {
        this.conditions = conditions;
        return this;
    }
    public String getConditions() {
        return this.conditions;
    }

    public ListWorkitemsRequest setExtraConditions(String extraConditions) {
        this.extraConditions = extraConditions;
        return this;
    }
    public String getExtraConditions() {
        return this.extraConditions;
    }

    public ListWorkitemsRequest setGroupCondition(String groupCondition) {
        this.groupCondition = groupCondition;
        return this;
    }
    public String getGroupCondition() {
        return this.groupCondition;
    }

    public ListWorkitemsRequest setMaxResults(String maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public String getMaxResults() {
        return this.maxResults;
    }

    public ListWorkitemsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListWorkitemsRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public ListWorkitemsRequest setSearchType(String searchType) {
        this.searchType = searchType;
        return this;
    }
    public String getSearchType() {
        return this.searchType;
    }

    public ListWorkitemsRequest setSpaceIdentifier(String spaceIdentifier) {
        this.spaceIdentifier = spaceIdentifier;
        return this;
    }
    public String getSpaceIdentifier() {
        return this.spaceIdentifier;
    }

    public ListWorkitemsRequest setSpaceType(String spaceType) {
        this.spaceType = spaceType;
        return this;
    }
    public String getSpaceType() {
        return this.spaceType;
    }

}
