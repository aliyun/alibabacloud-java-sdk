// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryAIPlanRequest extends TeaModel {
    @NameInMap("ApiProduct")
    public String apiProduct;

    @NameInMap("ApiRevision")
    public String apiRevision;

    @NameInMap("AppId")
    public String appId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    public static QueryAIPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAIPlanRequest self = new QueryAIPlanRequest();
        return TeaModel.build(map, self);
    }

    public QueryAIPlanRequest setApiProduct(String apiProduct) {
        this.apiProduct = apiProduct;
        return this;
    }
    public String getApiProduct() {
        return this.apiProduct;
    }

    public QueryAIPlanRequest setApiRevision(String apiRevision) {
        this.apiRevision = apiRevision;
        return this;
    }
    public String getApiRevision() {
        return this.apiRevision;
    }

    public QueryAIPlanRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public QueryAIPlanRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryAIPlanRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

}
