// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210701_20105851.models;

import com.aliyun.tea.*;

public class AscpPurchasingPurchaseOrderSupplierConfirmErpApiRequest extends TeaModel {
    // 采购单号
    @NameInMap("purchaseOrderNo")
    public String purchaseOrderNo;

    // 二级供应商ID
    @NameInMap("supplierId")
    public Long supplierId;

    // 租户ID
    @NameInMap("tenantId")
    public String tenantId;

    // 货品行确认信息
    @NameInMap("items")
    public java.util.List<AscpPurchasingPurchaseOrderSupplierConfirmErpApiRequestItems> items;

    public static AscpPurchasingPurchaseOrderSupplierConfirmErpApiRequest build(java.util.Map<String, ?> map) throws Exception {
        AscpPurchasingPurchaseOrderSupplierConfirmErpApiRequest self = new AscpPurchasingPurchaseOrderSupplierConfirmErpApiRequest();
        return TeaModel.build(map, self);
    }

    public AscpPurchasingPurchaseOrderSupplierConfirmErpApiRequest setPurchaseOrderNo(String purchaseOrderNo) {
        this.purchaseOrderNo = purchaseOrderNo;
        return this;
    }
    public String getPurchaseOrderNo() {
        return this.purchaseOrderNo;
    }

    public AscpPurchasingPurchaseOrderSupplierConfirmErpApiRequest setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
        return this;
    }
    public Long getSupplierId() {
        return this.supplierId;
    }

    public AscpPurchasingPurchaseOrderSupplierConfirmErpApiRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public AscpPurchasingPurchaseOrderSupplierConfirmErpApiRequest setItems(java.util.List<AscpPurchasingPurchaseOrderSupplierConfirmErpApiRequestItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<AscpPurchasingPurchaseOrderSupplierConfirmErpApiRequestItems> getItems() {
        return this.items;
    }

    public static class AscpPurchasingPurchaseOrderSupplierConfirmErpApiRequestItems extends TeaModel {
        // 货品ID
        @NameInMap("productId")
        public Long productId;

        // 确认数量
        @NameInMap("confirmQuantity")
        public Float confirmQuantity;

        // 货品行ID
        @NameInMap("orderLineId")
        public Long orderLineId;

        public static AscpPurchasingPurchaseOrderSupplierConfirmErpApiRequestItems build(java.util.Map<String, ?> map) throws Exception {
            AscpPurchasingPurchaseOrderSupplierConfirmErpApiRequestItems self = new AscpPurchasingPurchaseOrderSupplierConfirmErpApiRequestItems();
            return TeaModel.build(map, self);
        }

        public AscpPurchasingPurchaseOrderSupplierConfirmErpApiRequestItems setProductId(Long productId) {
            this.productId = productId;
            return this;
        }
        public Long getProductId() {
            return this.productId;
        }

        public AscpPurchasingPurchaseOrderSupplierConfirmErpApiRequestItems setConfirmQuantity(Float confirmQuantity) {
            this.confirmQuantity = confirmQuantity;
            return this;
        }
        public Float getConfirmQuantity() {
            return this.confirmQuantity;
        }

        public AscpPurchasingPurchaseOrderSupplierConfirmErpApiRequestItems setOrderLineId(Long orderLineId) {
            this.orderLineId = orderLineId;
            return this;
        }
        public Long getOrderLineId() {
            return this.orderLineId;
        }

    }

}
