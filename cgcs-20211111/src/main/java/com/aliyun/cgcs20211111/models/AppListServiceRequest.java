// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class AppListServiceRequest extends TeaModel {
    @NameInMap("KeySearch")
    public String keySearch;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestApp")
    public String requestApp;

    public static AppListServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        AppListServiceRequest self = new AppListServiceRequest();
        return TeaModel.build(map, self);
    }

    public AppListServiceRequest setKeySearch(String keySearch) {
        this.keySearch = keySearch;
        return this;
    }
    public String getKeySearch() {
        return this.keySearch;
    }

    public AppListServiceRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public AppListServiceRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public AppListServiceRequest setRequestApp(String requestApp) {
        this.requestApp = requestApp;
        return this;
    }
    public String getRequestApp() {
        return this.requestApp;
    }

}
