// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryAIJobsRequest extends TeaModel {
    @NameInMap("ApiProduct")
    public String apiProduct;

    @NameInMap("ApiRevision")
    public String apiRevision;

    @NameInMap("ActionId")
    public String actionId;

    @NameInMap("IotId")
    public String iotId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    public static QueryAIJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAIJobsRequest self = new QueryAIJobsRequest();
        return TeaModel.build(map, self);
    }

    public QueryAIJobsRequest setApiProduct(String apiProduct) {
        this.apiProduct = apiProduct;
        return this;
    }
    public String getApiProduct() {
        return this.apiProduct;
    }

    public QueryAIJobsRequest setApiRevision(String apiRevision) {
        this.apiRevision = apiRevision;
        return this;
    }
    public String getApiRevision() {
        return this.apiRevision;
    }

    public QueryAIJobsRequest setActionId(String actionId) {
        this.actionId = actionId;
        return this;
    }
    public String getActionId() {
        return this.actionId;
    }

    public QueryAIJobsRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public QueryAIJobsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryAIJobsRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

}
