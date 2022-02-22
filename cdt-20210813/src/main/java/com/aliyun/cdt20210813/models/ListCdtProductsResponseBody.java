// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdt20210813.models;

import com.aliyun.tea.*;

public class ListCdtProductsResponseBody extends TeaModel {
    @NameInMap("CdtProducts")
    public java.util.List<ListCdtProductsResponseBodyCdtProducts> cdtProducts;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static ListCdtProductsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCdtProductsResponseBody self = new ListCdtProductsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCdtProductsResponseBody setCdtProducts(java.util.List<ListCdtProductsResponseBodyCdtProducts> cdtProducts) {
        this.cdtProducts = cdtProducts;
        return this;
    }
    public java.util.List<ListCdtProductsResponseBodyCdtProducts> getCdtProducts() {
        return this.cdtProducts;
    }

    public ListCdtProductsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListCdtProductsResponseBodyCdtProducts extends TeaModel {
        @NameInMap("BillingType")
        public String billingType;

        @NameInMap("BusinessRegionId")
        public String businessRegionId;

        @NameInMap("CdtType")
        public String cdtType;

        @NameInMap("EffectiveTime")
        public Long effectiveTime;

        @NameInMap("ExpireTime")
        public Long expireTime;

        @NameInMap("Product")
        public String product;

        @NameInMap("SwitchedToCdt")
        public Boolean switchedToCdt;

        public static ListCdtProductsResponseBodyCdtProducts build(java.util.Map<String, ?> map) throws Exception {
            ListCdtProductsResponseBodyCdtProducts self = new ListCdtProductsResponseBodyCdtProducts();
            return TeaModel.build(map, self);
        }

        public ListCdtProductsResponseBodyCdtProducts setBillingType(String billingType) {
            this.billingType = billingType;
            return this;
        }
        public String getBillingType() {
            return this.billingType;
        }

        public ListCdtProductsResponseBodyCdtProducts setBusinessRegionId(String businessRegionId) {
            this.businessRegionId = businessRegionId;
            return this;
        }
        public String getBusinessRegionId() {
            return this.businessRegionId;
        }

        public ListCdtProductsResponseBodyCdtProducts setCdtType(String cdtType) {
            this.cdtType = cdtType;
            return this;
        }
        public String getCdtType() {
            return this.cdtType;
        }

        public ListCdtProductsResponseBodyCdtProducts setEffectiveTime(Long effectiveTime) {
            this.effectiveTime = effectiveTime;
            return this;
        }
        public Long getEffectiveTime() {
            return this.effectiveTime;
        }

        public ListCdtProductsResponseBodyCdtProducts setExpireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Long getExpireTime() {
            return this.expireTime;
        }

        public ListCdtProductsResponseBodyCdtProducts setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

        public ListCdtProductsResponseBodyCdtProducts setSwitchedToCdt(Boolean switchedToCdt) {
            this.switchedToCdt = switchedToCdt;
            return this;
        }
        public Boolean getSwitchedToCdt() {
            return this.switchedToCdt;
        }

    }

}
