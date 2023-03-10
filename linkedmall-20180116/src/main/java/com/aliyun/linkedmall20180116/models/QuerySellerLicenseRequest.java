// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QuerySellerLicenseRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("SellerId")
    public String sellerId;

    @NameInMap("TenantId")
    public String tenantId;

    public static QuerySellerLicenseRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySellerLicenseRequest self = new QuerySellerLicenseRequest();
        return TeaModel.build(map, self);
    }

    public QuerySellerLicenseRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QuerySellerLicenseRequest setSellerId(String sellerId) {
        this.sellerId = sellerId;
        return this;
    }
    public String getSellerId() {
        return this.sellerId;
    }

    public QuerySellerLicenseRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
