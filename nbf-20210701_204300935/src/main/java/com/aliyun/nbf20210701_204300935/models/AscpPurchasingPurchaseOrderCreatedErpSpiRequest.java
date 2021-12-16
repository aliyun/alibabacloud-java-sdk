// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210701_204300935.models;

import com.aliyun.tea.*;

public class AscpPurchasingPurchaseOrderCreatedErpSpiRequest extends TeaModel {
    // 合同编号
    @NameInMap("contractCode")
    public String contractCode;

    // 经营模式
    @NameInMap("contractType")
    public Integer contractType;

    // 合同版本
    @NameInMap("contractVersion")
    public String contractVersion;

    // 期望到仓时间
    @NameInMap("expectArriveTime")
    public String expectArriveTime;

    // 附加信息
    @NameInMap("extFields")
    public String extFields;

    // 存储类型
    @NameInMap("fullBulkFlag")
    public Integer fullBulkFlag;

    // 建单时间
    @NameInMap("gmtCreate")
    public String gmtCreate;

    // 贸易条款
    @NameInMap("internationTradeClause")
    public String internationTradeClause;

    // 采购货品行列表
    @NameInMap("items")
    public java.util.List<AscpPurchasingPurchaseOrderCreatedErpSpiRequestItems> items;

    // 单据类型
    @NameInMap("poType")
    public Integer poType;

    // 采购单号
    @NameInMap("purchaseOrderNo")
    public String purchaseOrderNo;

    // 备注
    @NameInMap("remark")
    public String remark;

    // 来源单号
    @NameInMap("sourceOrderCode")
    public String sourceOrderCode;

    // 供应商编码
    @NameInMap("supplierCode")
    public String supplierCode;

    // 供应商ID
    @NameInMap("supplierId")
    public Long supplierId;

    // 供应商名称
    @NameInMap("supplierName")
    public String supplierName;

    // 租户ID
    @NameInMap("tenantId")
    public String tenantId;

    @NameInMap("warehouse")
    public AscpPurchasingPurchaseOrderCreatedErpSpiRequestWarehouse warehouse;

    // 供应商ID，路由专用
    @NameInMap("routeSupplierId")
    public Long routeSupplierId;

    public static AscpPurchasingPurchaseOrderCreatedErpSpiRequest build(java.util.Map<String, ?> map) throws Exception {
        AscpPurchasingPurchaseOrderCreatedErpSpiRequest self = new AscpPurchasingPurchaseOrderCreatedErpSpiRequest();
        return TeaModel.build(map, self);
    }

    public AscpPurchasingPurchaseOrderCreatedErpSpiRequest setContractCode(String contractCode) {
        this.contractCode = contractCode;
        return this;
    }
    public String getContractCode() {
        return this.contractCode;
    }

    public AscpPurchasingPurchaseOrderCreatedErpSpiRequest setContractType(Integer contractType) {
        this.contractType = contractType;
        return this;
    }
    public Integer getContractType() {
        return this.contractType;
    }

    public AscpPurchasingPurchaseOrderCreatedErpSpiRequest setContractVersion(String contractVersion) {
        this.contractVersion = contractVersion;
        return this;
    }
    public String getContractVersion() {
        return this.contractVersion;
    }

    public AscpPurchasingPurchaseOrderCreatedErpSpiRequest setExpectArriveTime(String expectArriveTime) {
        this.expectArriveTime = expectArriveTime;
        return this;
    }
    public String getExpectArriveTime() {
        return this.expectArriveTime;
    }

    public AscpPurchasingPurchaseOrderCreatedErpSpiRequest setExtFields(String extFields) {
        this.extFields = extFields;
        return this;
    }
    public String getExtFields() {
        return this.extFields;
    }

    public AscpPurchasingPurchaseOrderCreatedErpSpiRequest setFullBulkFlag(Integer fullBulkFlag) {
        this.fullBulkFlag = fullBulkFlag;
        return this;
    }
    public Integer getFullBulkFlag() {
        return this.fullBulkFlag;
    }

    public AscpPurchasingPurchaseOrderCreatedErpSpiRequest setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public AscpPurchasingPurchaseOrderCreatedErpSpiRequest setInternationTradeClause(String internationTradeClause) {
        this.internationTradeClause = internationTradeClause;
        return this;
    }
    public String getInternationTradeClause() {
        return this.internationTradeClause;
    }

    public AscpPurchasingPurchaseOrderCreatedErpSpiRequest setItems(java.util.List<AscpPurchasingPurchaseOrderCreatedErpSpiRequestItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<AscpPurchasingPurchaseOrderCreatedErpSpiRequestItems> getItems() {
        return this.items;
    }

    public AscpPurchasingPurchaseOrderCreatedErpSpiRequest setPoType(Integer poType) {
        this.poType = poType;
        return this;
    }
    public Integer getPoType() {
        return this.poType;
    }

    public AscpPurchasingPurchaseOrderCreatedErpSpiRequest setPurchaseOrderNo(String purchaseOrderNo) {
        this.purchaseOrderNo = purchaseOrderNo;
        return this;
    }
    public String getPurchaseOrderNo() {
        return this.purchaseOrderNo;
    }

    public AscpPurchasingPurchaseOrderCreatedErpSpiRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public AscpPurchasingPurchaseOrderCreatedErpSpiRequest setSourceOrderCode(String sourceOrderCode) {
        this.sourceOrderCode = sourceOrderCode;
        return this;
    }
    public String getSourceOrderCode() {
        return this.sourceOrderCode;
    }

    public AscpPurchasingPurchaseOrderCreatedErpSpiRequest setSupplierCode(String supplierCode) {
        this.supplierCode = supplierCode;
        return this;
    }
    public String getSupplierCode() {
        return this.supplierCode;
    }

    public AscpPurchasingPurchaseOrderCreatedErpSpiRequest setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
        return this;
    }
    public Long getSupplierId() {
        return this.supplierId;
    }

    public AscpPurchasingPurchaseOrderCreatedErpSpiRequest setSupplierName(String supplierName) {
        this.supplierName = supplierName;
        return this;
    }
    public String getSupplierName() {
        return this.supplierName;
    }

    public AscpPurchasingPurchaseOrderCreatedErpSpiRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public AscpPurchasingPurchaseOrderCreatedErpSpiRequest setWarehouse(AscpPurchasingPurchaseOrderCreatedErpSpiRequestWarehouse warehouse) {
        this.warehouse = warehouse;
        return this;
    }
    public AscpPurchasingPurchaseOrderCreatedErpSpiRequestWarehouse getWarehouse() {
        return this.warehouse;
    }

    public AscpPurchasingPurchaseOrderCreatedErpSpiRequest setRouteSupplierId(Long routeSupplierId) {
        this.routeSupplierId = routeSupplierId;
        return this;
    }
    public Long getRouteSupplierId() {
        return this.routeSupplierId;
    }

    public static class AscpPurchasingPurchaseOrderCreatedErpSpiRequestItems extends TeaModel {
        // 条形码
        @NameInMap("barcode")
        public String barcode;

        // 品牌名称
        @NameInMap("brandName")
        public String brandName;

        // 叶子类目名称
        @NameInMap("categoryName")
        public String categoryName;

        // 采购币种
        @NameInMap("currency")
        public String currency;

        // 货品行附加信息
        @NameInMap("extFields")
        public String extFields;

        // 一级行业名称
        @NameInMap("industryName")
        public String industryName;

        // 商品ID
        @NameInMap("itemId")
        public Long itemId;

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

        // SKU ID
        @NameInMap("skuId")
        public Long skuId;

        // 库存单位
        @NameInMap("storageUnit")
        public String storageUnit;

        // 税率
        @NameInMap("taxRate")
        public Float taxRate;

        public static AscpPurchasingPurchaseOrderCreatedErpSpiRequestItems build(java.util.Map<String, ?> map) throws Exception {
            AscpPurchasingPurchaseOrderCreatedErpSpiRequestItems self = new AscpPurchasingPurchaseOrderCreatedErpSpiRequestItems();
            return TeaModel.build(map, self);
        }

        public AscpPurchasingPurchaseOrderCreatedErpSpiRequestItems setBarcode(String barcode) {
            this.barcode = barcode;
            return this;
        }
        public String getBarcode() {
            return this.barcode;
        }

        public AscpPurchasingPurchaseOrderCreatedErpSpiRequestItems setBrandName(String brandName) {
            this.brandName = brandName;
            return this;
        }
        public String getBrandName() {
            return this.brandName;
        }

        public AscpPurchasingPurchaseOrderCreatedErpSpiRequestItems setCategoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }
        public String getCategoryName() {
            return this.categoryName;
        }

        public AscpPurchasingPurchaseOrderCreatedErpSpiRequestItems setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public AscpPurchasingPurchaseOrderCreatedErpSpiRequestItems setExtFields(String extFields) {
            this.extFields = extFields;
            return this;
        }
        public String getExtFields() {
            return this.extFields;
        }

        public AscpPurchasingPurchaseOrderCreatedErpSpiRequestItems setIndustryName(String industryName) {
            this.industryName = industryName;
            return this;
        }
        public String getIndustryName() {
            return this.industryName;
        }

        public AscpPurchasingPurchaseOrderCreatedErpSpiRequestItems setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public AscpPurchasingPurchaseOrderCreatedErpSpiRequestItems setOrderLineId(Long orderLineId) {
            this.orderLineId = orderLineId;
            return this;
        }
        public Long getOrderLineId() {
            return this.orderLineId;
        }

        public AscpPurchasingPurchaseOrderCreatedErpSpiRequestItems setPlanQuantity(Float planQuantity) {
            this.planQuantity = planQuantity;
            return this;
        }
        public Float getPlanQuantity() {
            return this.planQuantity;
        }

        public AscpPurchasingPurchaseOrderCreatedErpSpiRequestItems setPriceIncludingTax(Float priceIncludingTax) {
            this.priceIncludingTax = priceIncludingTax;
            return this;
        }
        public Float getPriceIncludingTax() {
            return this.priceIncludingTax;
        }

        public AscpPurchasingPurchaseOrderCreatedErpSpiRequestItems setProductId(Long productId) {
            this.productId = productId;
            return this;
        }
        public Long getProductId() {
            return this.productId;
        }

        public AscpPurchasingPurchaseOrderCreatedErpSpiRequestItems setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public AscpPurchasingPurchaseOrderCreatedErpSpiRequestItems setPurchaseUnit(String purchaseUnit) {
            this.purchaseUnit = purchaseUnit;
            return this;
        }
        public String getPurchaseUnit() {
            return this.purchaseUnit;
        }

        public AscpPurchasingPurchaseOrderCreatedErpSpiRequestItems setSkuId(Long skuId) {
            this.skuId = skuId;
            return this;
        }
        public Long getSkuId() {
            return this.skuId;
        }

        public AscpPurchasingPurchaseOrderCreatedErpSpiRequestItems setStorageUnit(String storageUnit) {
            this.storageUnit = storageUnit;
            return this;
        }
        public String getStorageUnit() {
            return this.storageUnit;
        }

        public AscpPurchasingPurchaseOrderCreatedErpSpiRequestItems setTaxRate(Float taxRate) {
            this.taxRate = taxRate;
            return this;
        }
        public Float getTaxRate() {
            return this.taxRate;
        }

    }

    public static class AscpPurchasingPurchaseOrderCreatedErpSpiRequestWarehouse extends TeaModel {
        // 仓库编码
        @NameInMap("warehouseCode")
        public String warehouseCode;

        // 仓库名称
        @NameInMap("warehouseName")
        public String warehouseName;

        public static AscpPurchasingPurchaseOrderCreatedErpSpiRequestWarehouse build(java.util.Map<String, ?> map) throws Exception {
            AscpPurchasingPurchaseOrderCreatedErpSpiRequestWarehouse self = new AscpPurchasingPurchaseOrderCreatedErpSpiRequestWarehouse();
            return TeaModel.build(map, self);
        }

        public AscpPurchasingPurchaseOrderCreatedErpSpiRequestWarehouse setWarehouseCode(String warehouseCode) {
            this.warehouseCode = warehouseCode;
            return this;
        }
        public String getWarehouseCode() {
            return this.warehouseCode;
        }

        public AscpPurchasingPurchaseOrderCreatedErpSpiRequestWarehouse setWarehouseName(String warehouseName) {
            this.warehouseName = warehouseName;
            return this;
        }
        public String getWarehouseName() {
            return this.warehouseName;
        }

    }

}
