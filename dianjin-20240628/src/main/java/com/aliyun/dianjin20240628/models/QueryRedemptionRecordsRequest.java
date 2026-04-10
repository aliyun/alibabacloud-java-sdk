// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class QueryRedemptionRecordsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1001</p>
     */
    @NameInMap("externalUserId")
    public String externalUserId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page")
    public Integer page;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>ORD20240101000001</p>
     */
    @NameInMap("redemptionOrderNo")
    public String redemptionOrderNo;

    public static QueryRedemptionRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRedemptionRecordsRequest self = new QueryRedemptionRecordsRequest();
        return TeaModel.build(map, self);
    }

    public QueryRedemptionRecordsRequest setExternalUserId(String externalUserId) {
        this.externalUserId = externalUserId;
        return this;
    }
    public String getExternalUserId() {
        return this.externalUserId;
    }

    public QueryRedemptionRecordsRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public QueryRedemptionRecordsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryRedemptionRecordsRequest setRedemptionOrderNo(String redemptionOrderNo) {
        this.redemptionOrderNo = redemptionOrderNo;
        return this;
    }
    public String getRedemptionOrderNo() {
        return this.redemptionOrderNo;
    }

}
