// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianmodelonchip20240816.models;

import com.aliyun.tea.*;

public class QueryProductQuotaPageRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageIndex")
    public Integer pageIndex;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>2oImhCz4f8XCviiM</p>
     */
    @NameInMap("productKey")
    public String productKey;

    @NameInMap("productName")
    public String productName;

    /**
     * <strong>example:</strong>
     * <p>2025-04-01 00:00:00</p>
     */
    @NameInMap("purchaseTimeEnd")
    public String purchaseTimeEnd;

    /**
     * <strong>example:</strong>
     * <p>2025-03-01 00:00:00</p>
     */
    @NameInMap("purchaseTimeStart")
    public String purchaseTimeStart;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("purchaseType")
    public Integer purchaseType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>628103740287873</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("userId")
    public String userId;

    public static QueryProductQuotaPageRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryProductQuotaPageRequest self = new QueryProductQuotaPageRequest();
        return TeaModel.build(map, self);
    }

    public QueryProductQuotaPageRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public QueryProductQuotaPageRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryProductQuotaPageRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public QueryProductQuotaPageRequest setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public QueryProductQuotaPageRequest setPurchaseTimeEnd(String purchaseTimeEnd) {
        this.purchaseTimeEnd = purchaseTimeEnd;
        return this;
    }
    public String getPurchaseTimeEnd() {
        return this.purchaseTimeEnd;
    }

    public QueryProductQuotaPageRequest setPurchaseTimeStart(String purchaseTimeStart) {
        this.purchaseTimeStart = purchaseTimeStart;
        return this;
    }
    public String getPurchaseTimeStart() {
        return this.purchaseTimeStart;
    }

    public QueryProductQuotaPageRequest setPurchaseType(Integer purchaseType) {
        this.purchaseType = purchaseType;
        return this;
    }
    public Integer getPurchaseType() {
        return this.purchaseType;
    }

    public QueryProductQuotaPageRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryProductQuotaPageRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
