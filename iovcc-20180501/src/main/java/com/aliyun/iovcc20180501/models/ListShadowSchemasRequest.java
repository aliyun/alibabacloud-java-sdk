// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListShadowSchemasRequest extends TeaModel {
    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("QueryType")
    public String queryType;

    @NameInMap("QueryValue")
    public String queryValue;

    @NameInMap("PageIndex")
    public Integer pageIndex;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListShadowSchemasRequest build(java.util.Map<String, ?> map) throws Exception {
        ListShadowSchemasRequest self = new ListShadowSchemasRequest();
        return TeaModel.build(map, self);
    }

    public ListShadowSchemasRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ListShadowSchemasRequest setQueryType(String queryType) {
        this.queryType = queryType;
        return this;
    }
    public String getQueryType() {
        return this.queryType;
    }

    public ListShadowSchemasRequest setQueryValue(String queryValue) {
        this.queryValue = queryValue;
        return this;
    }
    public String getQueryValue() {
        return this.queryValue;
    }

    public ListShadowSchemasRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public ListShadowSchemasRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
