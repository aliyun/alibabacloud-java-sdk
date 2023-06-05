// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListProductsResponseBody extends TeaModel {
    @NameInMap("Products")
    public java.util.List<ListProductsResponseBodyProducts> products;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Services")
    public java.util.List<ListProductsResponseBodyServices> services;

    public static ListProductsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProductsResponseBody self = new ListProductsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProductsResponseBody setProducts(java.util.List<ListProductsResponseBodyProducts> products) {
        this.products = products;
        return this;
    }
    public java.util.List<ListProductsResponseBodyProducts> getProducts() {
        return this.products;
    }

    public ListProductsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListProductsResponseBody setServices(java.util.List<ListProductsResponseBodyServices> services) {
        this.services = services;
        return this;
    }
    public java.util.List<ListProductsResponseBodyServices> getServices() {
        return this.services;
    }

    public static class ListProductsResponseBodyProducts extends TeaModel {
        @NameInMap("HasPermissionToPurchase")
        public Boolean hasPermissionToPurchase;

        @NameInMap("IsPurchased")
        public Boolean isPurchased;

        @NameInMap("ProductCode")
        public String productCode;

        @NameInMap("ProductInstanceId")
        public String productInstanceId;

        @NameInMap("PurchaseUrl")
        public String purchaseUrl;

        public static ListProductsResponseBodyProducts build(java.util.Map<String, ?> map) throws Exception {
            ListProductsResponseBodyProducts self = new ListProductsResponseBodyProducts();
            return TeaModel.build(map, self);
        }

        public ListProductsResponseBodyProducts setHasPermissionToPurchase(Boolean hasPermissionToPurchase) {
            this.hasPermissionToPurchase = hasPermissionToPurchase;
            return this;
        }
        public Boolean getHasPermissionToPurchase() {
            return this.hasPermissionToPurchase;
        }

        public ListProductsResponseBodyProducts setIsPurchased(Boolean isPurchased) {
            this.isPurchased = isPurchased;
            return this;
        }
        public Boolean getIsPurchased() {
            return this.isPurchased;
        }

        public ListProductsResponseBodyProducts setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public ListProductsResponseBodyProducts setProductInstanceId(String productInstanceId) {
            this.productInstanceId = productInstanceId;
            return this;
        }
        public String getProductInstanceId() {
            return this.productInstanceId;
        }

        public ListProductsResponseBodyProducts setPurchaseUrl(String purchaseUrl) {
            this.purchaseUrl = purchaseUrl;
            return this;
        }
        public String getPurchaseUrl() {
            return this.purchaseUrl;
        }

    }

    public static class ListProductsResponseBodyServices extends TeaModel {
        @NameInMap("IsOpen")
        public Boolean isOpen;

        @NameInMap("OpenUrl")
        public String openUrl;

        @NameInMap("ServiceCode")
        public String serviceCode;

        public static ListProductsResponseBodyServices build(java.util.Map<String, ?> map) throws Exception {
            ListProductsResponseBodyServices self = new ListProductsResponseBodyServices();
            return TeaModel.build(map, self);
        }

        public ListProductsResponseBodyServices setIsOpen(Boolean isOpen) {
            this.isOpen = isOpen;
            return this;
        }
        public Boolean getIsOpen() {
            return this.isOpen;
        }

        public ListProductsResponseBodyServices setOpenUrl(String openUrl) {
            this.openUrl = openUrl;
            return this;
        }
        public String getOpenUrl() {
            return this.openUrl;
        }

        public ListProductsResponseBodyServices setServiceCode(String serviceCode) {
            this.serviceCode = serviceCode;
            return this;
        }
        public String getServiceCode() {
            return this.serviceCode;
        }

    }

}
