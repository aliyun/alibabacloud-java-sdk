// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210701_204300935.models;

import com.aliyun.tea.*;

public class AscpPurchasingPurchaseOrderReceivedFinishedErpSpiRequest extends TeaModel {
    // 附加信息
    @NameInMap("extFields")
    public String extFields;

    // 建单时间
    @NameInMap("gmtCreate")
    public String gmtCreate;

    // 收货完成时间
    @NameInMap("gmtReceiveFinish")
    public String gmtReceiveFinish;

    // 货品行列表
    @NameInMap("items")
    public java.util.List<AscpPurchasingPurchaseOrderReceivedFinishedErpSpiRequestItems> items;

    // 单据类型
    @NameInMap("poType")
    public Integer poType;

    // 采购单号
    @NameInMap("purchaseOrderNo")
    public String purchaseOrderNo;

    // 来源单号
    @NameInMap("sourceOrderCode")
    public String sourceOrderCode;

    // 供应商ID
    @NameInMap("supplierId")
    public Long supplierId;

    // 租户ID
    @NameInMap("tenantId")
    public String tenantId;

    // 仓信息
    @NameInMap("warehouse")
    public AscpPurchasingPurchaseOrderReceivedFinishedErpSpiRequestWarehouse warehouse;

    // 供应商ID，路由专用
    @NameInMap("routeSupplierId")
    public Long routeSupplierId;

    public static AscpPurchasingPurchaseOrderReceivedFinishedErpSpiRequest build(java.util.Map<String, ?> map) throws Exception {
        AscpPurchasingPurchaseOrderReceivedFinishedErpSpiRequest self = new AscpPurchasingPurchaseOrderReceivedFinishedErpSpiRequest();
        return TeaModel.build(map, self);
    }

    public AscpPurchasingPurchaseOrderReceivedFinishedErpSpiRequest setExtFields(String extFields) {
        this.extFields = extFields;
        return this;
    }
    public String getExtFields() {
        return this.extFields;
    }

    public AscpPurchasingPurchaseOrderReceivedFinishedErpSpiRequest setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public AscpPurchasingPurchaseOrderReceivedFinishedErpSpiRequest setGmtReceiveFinish(String gmtReceiveFinish) {
        this.gmtReceiveFinish = gmtReceiveFinish;
        return this;
    }
    public String getGmtReceiveFinish() {
        return this.gmtReceiveFinish;
    }

    public AscpPurchasingPurchaseOrderReceivedFinishedErpSpiRequest setItems(java.util.List<AscpPurchasingPurchaseOrderReceivedFinishedErpSpiRequestItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<AscpPurchasingPurchaseOrderReceivedFinishedErpSpiRequestItems> getItems() {
        return this.items;
    }

    public AscpPurchasingPurchaseOrderReceivedFinishedErpSpiRequest setPoType(Integer poType) {
        this.poType = poType;
        return this;
    }
    public Integer getPoType() {
        return this.poType;
    }

    public AscpPurchasingPurchaseOrderReceivedFinishedErpSpiRequest setPurchaseOrderNo(String purchaseOrderNo) {
        this.purchaseOrderNo = purchaseOrderNo;
        return this;
    }
    public String getPurchaseOrderNo() {
        return this.purchaseOrderNo;
    }

    public AscpPurchasingPurchaseOrderReceivedFinishedErpSpiRequest setSourceOrderCode(String sourceOrderCode) {
        this.sourceOrderCode = sourceOrderCode;
        return this;
    }
    public String getSourceOrderCode() {
        return this.sourceOrderCode;
    }

    public AscpPurchasingPurchaseOrderReceivedFinishedErpSpiRequest setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
        return this;
    }
    public Long getSupplierId() {
        return this.supplierId;
    }

    public AscpPurchasingPurchaseOrderReceivedFinishedErpSpiRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public AscpPurchasingPurchaseOrderReceivedFinishedErpSpiRequest setWarehouse(AscpPurchasingPurchaseOrderReceivedFinishedErpSpiRequestWarehouse warehouse) {
        this.warehouse = warehouse;
        return this;
    }
    public AscpPurchasingPurchaseOrderReceivedFinishedErpSpiRequestWarehouse getWarehouse() {
        return this.warehouse;
    }

    public AscpPurchasingPurchaseOrderReceivedFinishedErpSpiRequest setRouteSupplierId(Long routeSupplierId) {
        this.routeSupplierId = routeSupplierId;
        return this;
    }
    public Long getRouteSupplierId() {
        return this.routeSupplierId;
    }

    public static class AscpPurchasingPurchaseOrderReceivedFinishedErpSpiRequestItems extends TeaModel {
        // 条形码
        @NameInMap("barcode")
        public String barcode;

        // 采购币种
        @NameInMap("currency")
        public String currency;

        // 货品行附加信息
        @NameInMap("extFields")
        public String extFields;

        // 货品行ID
        @NameInMap("orderLineId")
        public Long orderLineId;

        // 采购数量
        @NameInMap("planQuantity")
        public Float planQuantity;

        // 含税采购价，基本单位
        @NameInMap("priceIncludingTax")
        public Float priceIncludingTax;

        // 货品ID
        @NameInMap("productId")
        public Long productId;

        // 货品名称
        @NameInMap("productName")
        public String productName;

        // 采购单位
        @NameInMap("purchaseUnit")
        public String purchaseUnit;

        // 实收残品数量
        @NameInMap("receivedDefectiveQuantity")
        public Float receivedDefectiveQuantity;

        // 实收良品数量
        @NameInMap("receivedNormalQuantity")
        public Float receivedNormalQuantity;

        // 库存单位
        @NameInMap("storageUnit")
        public String storageUnit;

        // 税率，13%则值为13
        @NameInMap("taxRate")
        public Float taxRate;

        public static AscpPurchasingPurchaseOrderReceivedFinishedErpSpiRequestItems build(java.util.Map<String, ?> map) throws Exception {
            AscpPurchasingPurchaseOrderReceivedFinishedErpSpiRequestItems self = new AscpPurchasingPurchaseOrderReceivedFinishedErpSpiRequestItems();
            return TeaModel.build(map, self);
        }

        public AscpPurchasingPurchaseOrderReceivedFinishedErpSpiRequestItems setBarcode(String barcode) {
            this.barcode = barcode;
            return this;
        }
        public String getBarcode() {
            return this.barcode;
        }

        public AscpPurchasingPurchaseOrderReceivedFinishedErpSpiRequestItems setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public AscpPurchasingPurchaseOrderReceivedFinishedErpSpiRequestItems setExtFields(String extFields) {
            this.extFields = extFields;
            return this;
        }
        public String getExtFields() {
            return this.extFields;
        }

        public AscpPurchasingPurchaseOrderReceivedFinishedErpSpiRequestItems setOrderLineId(Long orderLineId) {
            this.orderLineId = orderLineId;
            return this;
        }
        public Long getOrderLineId() {
            return this.orderLineId;
        }

        public AscpPurchasingPurchaseOrderReceivedFinishedErpSpiRequestItems setPlanQuantity(Float planQuantity) {
            this.planQuantity = planQuantity;
            return this;
        }
        public Float getPlanQuantity() {
            return this.planQuantity;
        }

        public AscpPurchasingPurchaseOrderReceivedFinishedErpSpiRequestItems setPriceIncludingTax(Float priceIncludingTax) {
            this.priceIncludingTax = priceIncludingTax;
            return this;
        }
        public Float getPriceIncludingTax() {
            return this.priceIncludingTax;
        }

        public AscpPurchasingPurchaseOrderReceivedFinishedErpSpiRequestItems setProductId(Long productId) {
            this.productId = productId;
            return this;
        }
        public Long getProductId() {
            return this.productId;
        }

        public AscpPurchasingPurchaseOrderReceivedFinishedErpSpiRequestItems setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public AscpPurchasingPurchaseOrderReceivedFinishedErpSpiRequestItems setPurchaseUnit(String purchaseUnit) {
            this.purchaseUnit = purchaseUnit;
            return this;
        }
        public String getPurchaseUnit() {
            return this.purchaseUnit;
        }

        public AscpPurchasingPurchaseOrderReceivedFinishedErpSpiRequestItems setReceivedDefectiveQuantity(Float receivedDefectiveQuantity) {
            this.receivedDefectiveQuantity = receivedDefectiveQuantity;
            return this;
        }
        public Float getReceivedDefectiveQuantity() {
            return this.receivedDefectiveQuantity;
        }

        public AscpPurchasingPurchaseOrderReceivedFinishedErpSpiRequestItems setReceivedNormalQuantity(Float receivedNormalQuantity) {
            this.receivedNormalQuantity = receivedNormalQuantity;
            return this;
        }
        public Float getReceivedNormalQuantity() {
            return this.receivedNormalQuantity;
        }

        public AscpPurchasingPurchaseOrderReceivedFinishedErpSpiRequestItems setStorageUnit(String storageUnit) {
            this.storageUnit = storageUnit;
            return this;
        }
        public String getStorageUnit() {
            return this.storageUnit;
        }

        public AscpPurchasingPurchaseOrderReceivedFinishedErpSpiRequestItems setTaxRate(Float taxRate) {
            this.taxRate = taxRate;
            return this;
        }
        public Float getTaxRate() {
            return this.taxRate;
        }

    }

    public static class AscpPurchasingPurchaseOrderReceivedFinishedErpSpiRequestWarehouse extends TeaModel {
        // 仓库编码
        @NameInMap("warehouseCode")
        public String warehouseCode;

        // 仓库名称
        @NameInMap("warehouseName")
        public String warehouseName;

        public static AscpPurchasingPurchaseOrderReceivedFinishedErpSpiRequestWarehouse build(java.util.Map<String, ?> map) throws Exception {
            AscpPurchasingPurchaseOrderReceivedFinishedErpSpiRequestWarehouse self = new AscpPurchasingPurchaseOrderReceivedFinishedErpSpiRequestWarehouse();
            return TeaModel.build(map, self);
        }

        public AscpPurchasingPurchaseOrderReceivedFinishedErpSpiRequestWarehouse setWarehouseCode(String warehouseCode) {
            this.warehouseCode = warehouseCode;
            return this;
        }
        public String getWarehouseCode() {
            return this.warehouseCode;
        }

        public AscpPurchasingPurchaseOrderReceivedFinishedErpSpiRequestWarehouse setWarehouseName(String warehouseName) {
            this.warehouseName = warehouseName;
            return this;
        }
        public String getWarehouseName() {
            return this.warehouseName;
        }

    }

}
