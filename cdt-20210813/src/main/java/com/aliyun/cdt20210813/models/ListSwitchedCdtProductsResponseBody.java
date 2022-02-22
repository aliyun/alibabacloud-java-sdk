// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdt20210813.models;

import com.aliyun.tea.*;

public class ListSwitchedCdtProductsResponseBody extends TeaModel {
    @NameInMap("CdtProducts")
    public java.util.List<ListSwitchedCdtProductsResponseBodyCdtProducts> cdtProducts;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static ListSwitchedCdtProductsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSwitchedCdtProductsResponseBody self = new ListSwitchedCdtProductsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSwitchedCdtProductsResponseBody setCdtProducts(java.util.List<ListSwitchedCdtProductsResponseBodyCdtProducts> cdtProducts) {
        this.cdtProducts = cdtProducts;
        return this;
    }
    public java.util.List<ListSwitchedCdtProductsResponseBodyCdtProducts> getCdtProducts() {
        return this.cdtProducts;
    }

    public ListSwitchedCdtProductsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListSwitchedCdtProductsResponseBodyCdtProducts extends TeaModel {
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

        public static ListSwitchedCdtProductsResponseBodyCdtProducts build(java.util.Map<String, ?> map) throws Exception {
            ListSwitchedCdtProductsResponseBodyCdtProducts self = new ListSwitchedCdtProductsResponseBodyCdtProducts();
            return TeaModel.build(map, self);
        }

        public ListSwitchedCdtProductsResponseBodyCdtProducts setBillingType(String billingType) {
            this.billingType = billingType;
            return this;
        }
        public String getBillingType() {
            return this.billingType;
        }

        public ListSwitchedCdtProductsResponseBodyCdtProducts setBusinessRegionId(String businessRegionId) {
            this.businessRegionId = businessRegionId;
            return this;
        }
        public String getBusinessRegionId() {
            return this.businessRegionId;
        }

        public ListSwitchedCdtProductsResponseBodyCdtProducts setCdtType(String cdtType) {
            this.cdtType = cdtType;
            return this;
        }
        public String getCdtType() {
            return this.cdtType;
        }

        public ListSwitchedCdtProductsResponseBodyCdtProducts setEffectiveTime(Long effectiveTime) {
            this.effectiveTime = effectiveTime;
            return this;
        }
        public Long getEffectiveTime() {
            return this.effectiveTime;
        }

        public ListSwitchedCdtProductsResponseBodyCdtProducts setExpireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Long getExpireTime() {
            return this.expireTime;
        }

        public ListSwitchedCdtProductsResponseBodyCdtProducts setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

    }

}
