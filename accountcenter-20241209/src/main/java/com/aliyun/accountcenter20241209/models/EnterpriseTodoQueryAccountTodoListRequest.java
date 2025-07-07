// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.accountcenter20241209.models;

import com.aliyun.tea.*;

public class EnterpriseTodoQueryAccountTodoListRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OperatePk")
    public String operatePk;

    @NameInMap("OrientedEcId")
    public String orientedEcId;

    @NameInMap("OrientedLeId")
    public String orientedLeId;

    @NameInMap("OrientedNbId")
    public String orientedNbId;

    @NameInMap("Page")
    public Integer page;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ShowCompleteInfo")
    public Boolean showCompleteInfo;

    @NameInMap("Status")
    public String status;

    @NameInMap("TodoType")
    public String todoType;

    public static EnterpriseTodoQueryAccountTodoListRequest build(java.util.Map<String, ?> map) throws Exception {
        EnterpriseTodoQueryAccountTodoListRequest self = new EnterpriseTodoQueryAccountTodoListRequest();
        return TeaModel.build(map, self);
    }

    public EnterpriseTodoQueryAccountTodoListRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public EnterpriseTodoQueryAccountTodoListRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public EnterpriseTodoQueryAccountTodoListRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public EnterpriseTodoQueryAccountTodoListRequest setOperatePk(String operatePk) {
        this.operatePk = operatePk;
        return this;
    }
    public String getOperatePk() {
        return this.operatePk;
    }

    public EnterpriseTodoQueryAccountTodoListRequest setOrientedEcId(String orientedEcId) {
        this.orientedEcId = orientedEcId;
        return this;
    }
    public String getOrientedEcId() {
        return this.orientedEcId;
    }

    public EnterpriseTodoQueryAccountTodoListRequest setOrientedLeId(String orientedLeId) {
        this.orientedLeId = orientedLeId;
        return this;
    }
    public String getOrientedLeId() {
        return this.orientedLeId;
    }

    public EnterpriseTodoQueryAccountTodoListRequest setOrientedNbId(String orientedNbId) {
        this.orientedNbId = orientedNbId;
        return this;
    }
    public String getOrientedNbId() {
        return this.orientedNbId;
    }

    public EnterpriseTodoQueryAccountTodoListRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public EnterpriseTodoQueryAccountTodoListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public EnterpriseTodoQueryAccountTodoListRequest setShowCompleteInfo(Boolean showCompleteInfo) {
        this.showCompleteInfo = showCompleteInfo;
        return this;
    }
    public Boolean getShowCompleteInfo() {
        return this.showCompleteInfo;
    }

    public EnterpriseTodoQueryAccountTodoListRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public EnterpriseTodoQueryAccountTodoListRequest setTodoType(String todoType) {
        this.todoType = todoType;
        return this;
    }
    public String getTodoType() {
        return this.todoType;
    }

}
