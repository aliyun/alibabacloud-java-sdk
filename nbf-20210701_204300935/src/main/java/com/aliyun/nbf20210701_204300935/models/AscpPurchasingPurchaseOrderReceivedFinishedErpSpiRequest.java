// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210701_204300935.models;

import com.aliyun.tea.*;

public class AscpPurchasingPurchaseOrderReceivedFinishedErpSpiRequest extends TeaModel {
    // 附加信息
    @NameInMap("extFields")
    public String extFields;

    // 采购单号
    @NameInMap("purchaseOrderNo")
    public String purchaseOrderNo;

    // 租户ID
    @NameInMap("tenantId")
    public String tenantId;

    // 单据类型
    @NameInMap("poType")
    public Integer poType;

    // 仓信息
    @NameInMap("warehouse")
    public AscpPurchasingPurchaseOrderReceivedFinishedErpSpiRequestWarehouse warehouse;

    // 建单时间
    @NameInMap("gmtCreate")
    public String gmtCreate;

    // 货品行列表
    @NameInMap("items")
    public java.util.List<AscpPurchasingPurchaseOrderReceivedFinishedErpSpiRequestItems> items;

    // 收货完成时间
    @NameInMap("gmtReceiveFinish")
    public String gmtReceiveFinish;

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

    public AscpPurchasingPurchaseOrderReceivedFinishedErpSpiRequest setPurchaseOrderNo(String purchaseOrderNo) {
        this.purchaseOrderNo = purchaseOrderNo;
        return this;
    }
    public String getPurchaseOrderNo() {
        return this.purchaseOrderNo;
    }

    public AscpPurchasingPurchaseOrderReceivedFinishedErpSpiRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public AscpPurchasingPurchaseOrderReceivedFinishedErpSpiRequest setPoType(Integer poType) {
        this.poType = poType;
        return this;
    }
    public Integer getPoType() {
        return this.poType;
    }

    public AscpPurchasingPurchaseOrderReceivedFinishedErpSpiRequest setWarehouse(AscpPurchasingPurchaseOrderReceivedFinishedErpSpiRequestWarehouse warehouse) {
        this.warehouse = warehouse;
        return this;
    }
    public AscpPurchasingPurchaseOrderReceivedFinishedErpSpiRequestWarehouse getWarehouse() {
        return this.warehouse;
    }

    public AscpPurchasingPurchaseOrderReceivedFinishedErpSpiRequest setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public AscpPurchasingPurchaseOrderReceivedFinishedErpSpiRequest setItems(java.util.List<AscpPurchasingPurchaseOrderReceivedFinishedErpSpiRequestItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<AscpPurchasingPurchaseOrderReceivedFinishedErpSpiRequestItems> getItems() {
        return this.items;
    }

    public AscpPurchasingPurchaseOrderReceivedFinishedErpSpiRequest setGmtReceiveFinish(String gmtReceiveFinish) {
        this.gmtReceiveFinish = gmtReceiveFinish;
        return this;
    }
    public String getGmtReceiveFinish() {
        return this.gmtReceiveFinish;
    }

    public static class AscpPurchasingPurchaseOrderReceivedFinishedErpSpiRequestWarehouse extends TeaModel {
        // 仓库名称
        @NameInMap("warehouseName")
        public String warehouseName;

        // 仓库编码
        @NameInMap("warehouseCode")
        public String warehouseCode;

        public static AscpPurchasingPurchaseOrderReceivedFinishedErpSpiRequestWarehouse build(java.util.Map<String, ?> map) throws Exception {
            AscpPurchasingPurchaseOrderReceivedFinishedErpSpiRequestWarehouse self = new AscpPurchasingPurchaseOrderReceivedFinishedErpSpiRequestWarehouse();
            return TeaModel.build(map, self);
        }

        public AscpPurchasingPurchaseOrderReceivedFinishedErpSpiRequestWarehouse setWarehouseName(String warehouseName) {
            this.warehouseName = warehouseName;
            return this;
        }
        public String getWarehouseName() {
            return this.warehouseName;
        }

        public AscpPurchasingPurchaseOrderReceivedFinishedErpSpiRequestWarehouse setWarehouseCode(String warehouseCode) {
            this.warehouseCode = warehouseCode;
            return this;
        }
        public String getWarehouseCode() {
            return this.warehouseCode;
        }

    }

    public static class AscpPurchasingPurchaseOrderReceivedFinishedErpSpiRequestItems extends TeaModel {
        // 货品行附加信息
        @NameInMap("extFields")
        public String extFields;

        // 采购单位
        @NameInMap("purchaseUnit")
        public String purchaseUnit;

        // 库存单位
        @NameInMap("storageUnit")
        public String storageUnit;

        // 货品ID
        @NameInMap("productId")
        public Long productId;

        // 实收残品数量
        @NameInMap("receivedDefectiveQuantity")
        public Float receivedDefectiveQuantity;

        // 采购数量
        @NameInMap("planQuantity")
        public Float planQuantity;

        // 货品行ID
        @NameInMap("orderLineId")
        public Long orderLineId;

        // 条形码
        @NameInMap("barcode")
        public String barcode;

        // 实收良品数量
        @NameInMap("receivedNormalQuantity")
        public Float receivedNormalQuantity;

        // 货品名称
        @NameInMap("productName")
        public String productName;

        public static AscpPurchasingPurchaseOrderReceivedFinishedErpSpiRequestItems build(java.util.Map<String, ?> map) throws Exception {
            AscpPurchasingPurchaseOrderReceivedFinishedErpSpiRequestItems self = new AscpPurchasingPurchaseOrderReceivedFinishedErpSpiRequestItems();
            return TeaModel.build(map, self);
        }

        public AscpPurchasingPurchaseOrderReceivedFinishedErpSpiRequestItems setExtFields(String extFields) {
            this.extFields = extFields;
            return this;
        }
        public String getExtFields() {
            return this.extFields;
        }

        public AscpPurchasingPurchaseOrderReceivedFinishedErpSpiRequestItems setPurchaseUnit(String purchaseUnit) {
            this.purchaseUnit = purchaseUnit;
            return this;
        }
        public String getPurchaseUnit() {
            return this.purchaseUnit;
        }

        public AscpPurchasingPurchaseOrderReceivedFinishedErpSpiRequestItems setStorageUnit(String storageUnit) {
            this.storageUnit = storageUnit;
            return this;
        }
        public String getStorageUnit() {
            return this.storageUnit;
        }

        public AscpPurchasingPurchaseOrderReceivedFinishedErpSpiRequestItems setProductId(Long productId) {
            this.productId = productId;
            return this;
        }
        public Long getProductId() {
            return this.productId;
        }

        public AscpPurchasingPurchaseOrderReceivedFinishedErpSpiRequestItems setReceivedDefectiveQuantity(Float receivedDefectiveQuantity) {
            this.receivedDefectiveQuantity = receivedDefectiveQuantity;
            return this;
        }
        public Float getReceivedDefectiveQuantity() {
            return this.receivedDefectiveQuantity;
        }

        public AscpPurchasingPurchaseOrderReceivedFinishedErpSpiRequestItems setPlanQuantity(Float planQuantity) {
            this.planQuantity = planQuantity;
            return this;
        }
        public Float getPlanQuantity() {
            return this.planQuantity;
        }

        public AscpPurchasingPurchaseOrderReceivedFinishedErpSpiRequestItems setOrderLineId(Long orderLineId) {
            this.orderLineId = orderLineId;
            return this;
        }
        public Long getOrderLineId() {
            return this.orderLineId;
        }

        public AscpPurchasingPurchaseOrderReceivedFinishedErpSpiRequestItems setBarcode(String barcode) {
            this.barcode = barcode;
            return this;
        }
        public String getBarcode() {
            return this.barcode;
        }

        public AscpPurchasingPurchaseOrderReceivedFinishedErpSpiRequestItems setReceivedNormalQuantity(Float receivedNormalQuantity) {
            this.receivedNormalQuantity = receivedNormalQuantity;
            return this;
        }
        public Float getReceivedNormalQuantity() {
            return this.receivedNormalQuantity;
        }

        public AscpPurchasingPurchaseOrderReceivedFinishedErpSpiRequestItems setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

    }

}
