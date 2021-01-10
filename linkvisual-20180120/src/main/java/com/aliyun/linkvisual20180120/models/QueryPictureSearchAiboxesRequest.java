// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryPictureSearchAiboxesRequest extends TeaModel {
    @NameInMap("ApiProduct")
    public String apiProduct;

    @NameInMap("ApiRevision")
    public String apiRevision;

    @NameInMap("AppInstanceId")
    public String appInstanceId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    public static QueryPictureSearchAiboxesRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryPictureSearchAiboxesRequest self = new QueryPictureSearchAiboxesRequest();
        return TeaModel.build(map, self);
    }

    public QueryPictureSearchAiboxesRequest setApiProduct(String apiProduct) {
        this.apiProduct = apiProduct;
        return this;
    }
    public String getApiProduct() {
        return this.apiProduct;
    }

    public QueryPictureSearchAiboxesRequest setApiRevision(String apiRevision) {
        this.apiRevision = apiRevision;
        return this;
    }
    public String getApiRevision() {
        return this.apiRevision;
    }

    public QueryPictureSearchAiboxesRequest setAppInstanceId(String appInstanceId) {
        this.appInstanceId = appInstanceId;
        return this;
    }
    public String getAppInstanceId() {
        return this.appInstanceId;
    }

    public QueryPictureSearchAiboxesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryPictureSearchAiboxesRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

}
