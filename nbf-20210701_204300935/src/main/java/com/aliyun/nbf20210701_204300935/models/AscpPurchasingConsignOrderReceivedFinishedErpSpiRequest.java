// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210701_204300935.models;

import com.aliyun.tea.*;

public class AscpPurchasingConsignOrderReceivedFinishedErpSpiRequest extends TeaModel {
    // 附加信息
    @NameInMap("extFields")
    public String extFields;

    // 采购单号
    @NameInMap("purchaseOrderNo")
    public String purchaseOrderNo;

    // 物流单号(LBX)
    @NameInMap("outInboundNo")
    public String outInboundNo;

    // 采购批次(发货单号)
    @NameInMap("consignOrderNo")
    public String consignOrderNo;

    // 租户ID
    @NameInMap("tenantId")
    public String tenantId;

    // 单据类型
    @NameInMap("poType")
    public Integer poType;

    // 仓信息
    @NameInMap("warehouse")
    public AscpPurchasingConsignOrderReceivedFinishedErpSpiRequestWarehouse warehouse;

    // 建单时间
    @NameInMap("gmtCreate")
    public String gmtCreate;

    // 货品行列表
    @NameInMap("items")
    public java.util.List<AscpPurchasingConsignOrderReceivedFinishedErpSpiRequestItems> items;

    // 收货完成时间
    @NameInMap("gmtReceiveFinish")
    public String gmtReceiveFinish;

    public static AscpPurchasingConsignOrderReceivedFinishedErpSpiRequest build(java.util.Map<String, ?> map) throws Exception {
        AscpPurchasingConsignOrderReceivedFinishedErpSpiRequest self = new AscpPurchasingConsignOrderReceivedFinishedErpSpiRequest();
        return TeaModel.build(map, self);
    }

    public AscpPurchasingConsignOrderReceivedFinishedErpSpiRequest setExtFields(String extFields) {
        this.extFields = extFields;
        return this;
    }
    public String getExtFields() {
        return this.extFields;
    }

    public AscpPurchasingConsignOrderReceivedFinishedErpSpiRequest setPurchaseOrderNo(String purchaseOrderNo) {
        this.purchaseOrderNo = purchaseOrderNo;
        return this;
    }
    public String getPurchaseOrderNo() {
        return this.purchaseOrderNo;
    }

    public AscpPurchasingConsignOrderReceivedFinishedErpSpiRequest setOutInboundNo(String outInboundNo) {
        this.outInboundNo = outInboundNo;
        return this;
    }
    public String getOutInboundNo() {
        return this.outInboundNo;
    }

    public AscpPurchasingConsignOrderReceivedFinishedErpSpiRequest setConsignOrderNo(String consignOrderNo) {
        this.consignOrderNo = consignOrderNo;
        return this;
    }
    public String getConsignOrderNo() {
        return this.consignOrderNo;
    }

    public AscpPurchasingConsignOrderReceivedFinishedErpSpiRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public AscpPurchasingConsignOrderReceivedFinishedErpSpiRequest setPoType(Integer poType) {
        this.poType = poType;
        return this;
    }
    public Integer getPoType() {
        return this.poType;
    }

    public AscpPurchasingConsignOrderReceivedFinishedErpSpiRequest setWarehouse(AscpPurchasingConsignOrderReceivedFinishedErpSpiRequestWarehouse warehouse) {
        this.warehouse = warehouse;
        return this;
    }
    public AscpPurchasingConsignOrderReceivedFinishedErpSpiRequestWarehouse getWarehouse() {
        return this.warehouse;
    }

    public AscpPurchasingConsignOrderReceivedFinishedErpSpiRequest setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public AscpPurchasingConsignOrderReceivedFinishedErpSpiRequest setItems(java.util.List<AscpPurchasingConsignOrderReceivedFinishedErpSpiRequestItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<AscpPurchasingConsignOrderReceivedFinishedErpSpiRequestItems> getItems() {
        return this.items;
    }

    public AscpPurchasingConsignOrderReceivedFinishedErpSpiRequest setGmtReceiveFinish(String gmtReceiveFinish) {
        this.gmtReceiveFinish = gmtReceiveFinish;
        return this;
    }
    public String getGmtReceiveFinish() {
        return this.gmtReceiveFinish;
    }

    public static class AscpPurchasingConsignOrderReceivedFinishedErpSpiRequestWarehouse extends TeaModel {
        // 仓库名称
        @NameInMap("warehouseName")
        public String warehouseName;

        // 仓库编码
        @NameInMap("warehouseCode")
        public String warehouseCode;

        public static AscpPurchasingConsignOrderReceivedFinishedErpSpiRequestWarehouse build(java.util.Map<String, ?> map) throws Exception {
            AscpPurchasingConsignOrderReceivedFinishedErpSpiRequestWarehouse self = new AscpPurchasingConsignOrderReceivedFinishedErpSpiRequestWarehouse();
            return TeaModel.build(map, self);
        }

        public AscpPurchasingConsignOrderReceivedFinishedErpSpiRequestWarehouse setWarehouseName(String warehouseName) {
            this.warehouseName = warehouseName;
            return this;
        }
        public String getWarehouseName() {
            return this.warehouseName;
        }

        public AscpPurchasingConsignOrderReceivedFinishedErpSpiRequestWarehouse setWarehouseCode(String warehouseCode) {
            this.warehouseCode = warehouseCode;
            return this;
        }
        public String getWarehouseCode() {
            return this.warehouseCode;
        }

    }

    public static class AscpPurchasingConsignOrderReceivedFinishedErpSpiRequestItems extends TeaModel {
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

        // 批次实收残品数量
        @NameInMap("receivedDefectiveQuantity")
        public Float receivedDefectiveQuantity;

        // 批次计划收货数量(发货数量)
        @NameInMap("planQuantity")
        public Float planQuantity;

        // 货品行ID
        @NameInMap("orderLineId")
        public Long orderLineId;

        // 条形码
        @NameInMap("barcode")
        public String barcode;

        // 批次实收良品数量
        @NameInMap("receivedNormalQuantity")
        public Float receivedNormalQuantity;

        // 货品名称
        @NameInMap("productName")
        public String productName;

        public static AscpPurchasingConsignOrderReceivedFinishedErpSpiRequestItems build(java.util.Map<String, ?> map) throws Exception {
            AscpPurchasingConsignOrderReceivedFinishedErpSpiRequestItems self = new AscpPurchasingConsignOrderReceivedFinishedErpSpiRequestItems();
            return TeaModel.build(map, self);
        }

        public AscpPurchasingConsignOrderReceivedFinishedErpSpiRequestItems setExtFields(String extFields) {
            this.extFields = extFields;
            return this;
        }
        public String getExtFields() {
            return this.extFields;
        }

        public AscpPurchasingConsignOrderReceivedFinishedErpSpiRequestItems setPurchaseUnit(String purchaseUnit) {
            this.purchaseUnit = purchaseUnit;
            return this;
        }
        public String getPurchaseUnit() {
            return this.purchaseUnit;
        }

        public AscpPurchasingConsignOrderReceivedFinishedErpSpiRequestItems setStorageUnit(String storageUnit) {
            this.storageUnit = storageUnit;
            return this;
        }
        public String getStorageUnit() {
            return this.storageUnit;
        }

        public AscpPurchasingConsignOrderReceivedFinishedErpSpiRequestItems setProductId(Long productId) {
            this.productId = productId;
            return this;
        }
        public Long getProductId() {
            return this.productId;
        }

        public AscpPurchasingConsignOrderReceivedFinishedErpSpiRequestItems setReceivedDefectiveQuantity(Float receivedDefectiveQuantity) {
            this.receivedDefectiveQuantity = receivedDefectiveQuantity;
            return this;
        }
        public Float getReceivedDefectiveQuantity() {
            return this.receivedDefectiveQuantity;
        }

        public AscpPurchasingConsignOrderReceivedFinishedErpSpiRequestItems setPlanQuantity(Float planQuantity) {
            this.planQuantity = planQuantity;
            return this;
        }
        public Float getPlanQuantity() {
            return this.planQuantity;
        }

        public AscpPurchasingConsignOrderReceivedFinishedErpSpiRequestItems setOrderLineId(Long orderLineId) {
            this.orderLineId = orderLineId;
            return this;
        }
        public Long getOrderLineId() {
            return this.orderLineId;
        }

        public AscpPurchasingConsignOrderReceivedFinishedErpSpiRequestItems setBarcode(String barcode) {
            this.barcode = barcode;
            return this;
        }
        public String getBarcode() {
            return this.barcode;
        }

        public AscpPurchasingConsignOrderReceivedFinishedErpSpiRequestItems setReceivedNormalQuantity(Float receivedNormalQuantity) {
            this.receivedNormalQuantity = receivedNormalQuantity;
            return this;
        }
        public Float getReceivedNormalQuantity() {
            return this.receivedNormalQuantity;
        }

        public AscpPurchasingConsignOrderReceivedFinishedErpSpiRequestItems setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

    }

}
