// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypns20170620.models;

import com.aliyun.tea.*;

public class QueryCommonStatisticPreviewRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ProdCode")
    public String prodCode;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProductType")
    public Integer productType;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("StartDate")
    public String startDate;

    public static QueryCommonStatisticPreviewRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCommonStatisticPreviewRequest self = new QueryCommonStatisticPreviewRequest();
        return TeaModel.build(map, self);
    }

    public QueryCommonStatisticPreviewRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public QueryCommonStatisticPreviewRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QueryCommonStatisticPreviewRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public QueryCommonStatisticPreviewRequest setProductType(Integer productType) {
        this.productType = productType;
        return this;
    }
    public Integer getProductType() {
        return this.productType;
    }

    public QueryCommonStatisticPreviewRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QueryCommonStatisticPreviewRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public QueryCommonStatisticPreviewRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

}
