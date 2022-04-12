// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class AppVersionQueryServiceRequest extends TeaModel {
    @NameInMap("KeySearch")
    public String keySearch;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestApp")
    public String requestApp;

    public static AppVersionQueryServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        AppVersionQueryServiceRequest self = new AppVersionQueryServiceRequest();
        return TeaModel.build(map, self);
    }

    public AppVersionQueryServiceRequest setKeySearch(String keySearch) {
        this.keySearch = keySearch;
        return this;
    }
    public String getKeySearch() {
        return this.keySearch;
    }

    public AppVersionQueryServiceRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public AppVersionQueryServiceRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public AppVersionQueryServiceRequest setRequestApp(String requestApp) {
        this.requestApp = requestApp;
        return this;
    }
    public String getRequestApp() {
        return this.requestApp;
    }

}
