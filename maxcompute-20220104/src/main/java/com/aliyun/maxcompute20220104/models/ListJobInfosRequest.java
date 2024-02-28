// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListJobInfosRequest extends TeaModel {
    /**
     * <p>Specifies whether to sort query results in ascending or descending order.</p>
     */
    @NameInMap("ascOrder")
    public Boolean ascOrder;

    /**
     * <p>The request body parameters.</p>
     */
    @NameInMap("body")
    public String body;

    /**
     * <p>The column based on which you want to sort query results.</p>
     */
    @NameInMap("orderColumn")
    public String orderColumn;

    /**
     * <p>The page number.</p>
     */
    @NameInMap("pageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page.</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <p>The region ID.</p>
     */
    @NameInMap("region")
    public String region;

    /**
     * <p>The tenant ID.</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static ListJobInfosRequest build(java.util.Map<String, ?> map) throws Exception {
        ListJobInfosRequest self = new ListJobInfosRequest();
        return TeaModel.build(map, self);
    }

    public ListJobInfosRequest setAscOrder(Boolean ascOrder) {
        this.ascOrder = ascOrder;
        return this;
    }
    public Boolean getAscOrder() {
        return this.ascOrder;
    }

    public ListJobInfosRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public ListJobInfosRequest setOrderColumn(String orderColumn) {
        this.orderColumn = orderColumn;
        return this;
    }
    public String getOrderColumn() {
        return this.orderColumn;
    }

    public ListJobInfosRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListJobInfosRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListJobInfosRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public ListJobInfosRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
