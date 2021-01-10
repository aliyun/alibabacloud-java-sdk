// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryIotIdsByAIPlanRequest extends TeaModel {
    @NameInMap("ApiProduct")
    public String apiProduct;

    @NameInMap("ApiRevision")
    public String apiRevision;

    @NameInMap("PlanId")
    public String planId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    public static QueryIotIdsByAIPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryIotIdsByAIPlanRequest self = new QueryIotIdsByAIPlanRequest();
        return TeaModel.build(map, self);
    }

    public QueryIotIdsByAIPlanRequest setApiProduct(String apiProduct) {
        this.apiProduct = apiProduct;
        return this;
    }
    public String getApiProduct() {
        return this.apiProduct;
    }

    public QueryIotIdsByAIPlanRequest setApiRevision(String apiRevision) {
        this.apiRevision = apiRevision;
        return this;
    }
    public String getApiRevision() {
        return this.apiRevision;
    }

    public QueryIotIdsByAIPlanRequest setPlanId(String planId) {
        this.planId = planId;
        return this;
    }
    public String getPlanId() {
        return this.planId;
    }

    public QueryIotIdsByAIPlanRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryIotIdsByAIPlanRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

}
