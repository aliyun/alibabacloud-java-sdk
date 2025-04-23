// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListExplorerTasksRequest extends TeaModel {
    @NameInMap("keyword")
    public String keyword;

    @NameInMap("maxResult")
    public String maxResult;

    @NameInMap("moduleId")
    public String moduleId;

    @NameInMap("nextToken")
    public String nextToken;

    public static ListExplorerTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListExplorerTasksRequest self = new ListExplorerTasksRequest();
        return TeaModel.build(map, self);
    }

    public ListExplorerTasksRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListExplorerTasksRequest setMaxResult(String maxResult) {
        this.maxResult = maxResult;
        return this;
    }
    public String getMaxResult() {
        return this.maxResult;
    }

    public ListExplorerTasksRequest setModuleId(String moduleId) {
        this.moduleId = moduleId;
        return this;
    }
    public String getModuleId() {
        return this.moduleId;
    }

    public ListExplorerTasksRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
