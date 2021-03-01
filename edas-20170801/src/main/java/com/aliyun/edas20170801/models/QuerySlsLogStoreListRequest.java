// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class QuerySlsLogStoreListRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("Type")
    public String type;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    public static QuerySlsLogStoreListRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySlsLogStoreListRequest self = new QuerySlsLogStoreListRequest();
        return TeaModel.build(map, self);
    }

    public QuerySlsLogStoreListRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public QuerySlsLogStoreListRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public QuerySlsLogStoreListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QuerySlsLogStoreListRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

}
