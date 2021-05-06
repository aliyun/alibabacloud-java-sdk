// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gts_dayu20210324.models;

import com.aliyun.tea.*;

public class QueryApplyOrderAllDetailResponseBody extends TeaModel {
    // errorMsg
    @NameInMap("ErrorMsg")
    public String errorMsg;

    // data
    @NameInMap("Data")
    public QueryApplyOrderAllDetailResponseBodyData data;

    // errorCode
    @NameInMap("ErrorCode")
    public String errorCode;

    // success
    @NameInMap("Success")
    public Boolean success;

    // exception
    @NameInMap("Exception")
    public java.util.Map<String, ?> exception;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryApplyOrderAllDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryApplyOrderAllDetailResponseBody self = new QueryApplyOrderAllDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryApplyOrderAllDetailResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public QueryApplyOrderAllDetailResponseBody setData(QueryApplyOrderAllDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryApplyOrderAllDetailResponseBodyData getData() {
        return this.data;
    }

    public QueryApplyOrderAllDetailResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public QueryApplyOrderAllDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryApplyOrderAllDetailResponseBody setException(java.util.Map<String, ?> exception) {
        this.exception = exception;
        return this;
    }
    public java.util.Map<String, ?> getException() {
        return this.exception;
    }

    public QueryApplyOrderAllDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryApplyOrderAllDetailResponseBodyDataSubOrdersProductions extends TeaModel {
        @NameInMap("ProductId")
        public String productId;

        @NameInMap("ProductModel")
        public String productModel;

        @NameInMap("Num")
        public Integer num;

        @NameInMap("PoId")
        public String poId;

        @NameInMap("FactoryName")
        public String factoryName;

        @NameInMap("BatchNo")
        public String batchNo;

        @NameInMap("PreSnNo")
        public String preSnNo;

        @NameInMap("Warranty")
        public Integer warranty;

        @NameInMap("WarrantyLevel")
        public String warrantyLevel;

        @NameInMap("Status")
        public String status;

        @NameInMap("Uom")
        public String uom;

        @NameInMap("AcceptTime")
        public Long acceptTime;

        public static QueryApplyOrderAllDetailResponseBodyDataSubOrdersProductions build(java.util.Map<String, ?> map) throws Exception {
            QueryApplyOrderAllDetailResponseBodyDataSubOrdersProductions self = new QueryApplyOrderAllDetailResponseBodyDataSubOrdersProductions();
            return TeaModel.build(map, self);
        }

        public QueryApplyOrderAllDetailResponseBodyDataSubOrdersProductions setProductId(String productId) {
            this.productId = productId;
            return this;
        }
        public String getProductId() {
            return this.productId;
        }

        public QueryApplyOrderAllDetailResponseBodyDataSubOrdersProductions setProductModel(String productModel) {
            this.productModel = productModel;
            return this;
        }
        public String getProductModel() {
            return this.productModel;
        }

        public QueryApplyOrderAllDetailResponseBodyDataSubOrdersProductions setNum(Integer num) {
            this.num = num;
            return this;
        }
        public Integer getNum() {
            return this.num;
        }

        public QueryApplyOrderAllDetailResponseBodyDataSubOrdersProductions setPoId(String poId) {
            this.poId = poId;
            return this;
        }
        public String getPoId() {
            return this.poId;
        }

        public QueryApplyOrderAllDetailResponseBodyDataSubOrdersProductions setFactoryName(String factoryName) {
            this.factoryName = factoryName;
            return this;
        }
        public String getFactoryName() {
            return this.factoryName;
        }

        public QueryApplyOrderAllDetailResponseBodyDataSubOrdersProductions setBatchNo(String batchNo) {
            this.batchNo = batchNo;
            return this;
        }
        public String getBatchNo() {
            return this.batchNo;
        }

        public QueryApplyOrderAllDetailResponseBodyDataSubOrdersProductions setPreSnNo(String preSnNo) {
            this.preSnNo = preSnNo;
            return this;
        }
        public String getPreSnNo() {
            return this.preSnNo;
        }

        public QueryApplyOrderAllDetailResponseBodyDataSubOrdersProductions setWarranty(Integer warranty) {
            this.warranty = warranty;
            return this;
        }
        public Integer getWarranty() {
            return this.warranty;
        }

        public QueryApplyOrderAllDetailResponseBodyDataSubOrdersProductions setWarrantyLevel(String warrantyLevel) {
            this.warrantyLevel = warrantyLevel;
            return this;
        }
        public String getWarrantyLevel() {
            return this.warrantyLevel;
        }

        public QueryApplyOrderAllDetailResponseBodyDataSubOrdersProductions setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryApplyOrderAllDetailResponseBodyDataSubOrdersProductions setUom(String uom) {
            this.uom = uom;
            return this;
        }
        public String getUom() {
            return this.uom;
        }

        public QueryApplyOrderAllDetailResponseBodyDataSubOrdersProductions setAcceptTime(Long acceptTime) {
            this.acceptTime = acceptTime;
            return this;
        }
        public Long getAcceptTime() {
            return this.acceptTime;
        }

    }

    public static class QueryApplyOrderAllDetailResponseBodyDataSubOrdersGoodsDetails extends TeaModel {
        @NameInMap("ProductId")
        public String productId;

        @NameInMap("ProductModel")
        public String productModel;

        @NameInMap("Num")
        public Integer num;

        @NameInMap("PoId")
        public String poId;

        @NameInMap("FactoryName")
        public String factoryName;

        @NameInMap("BatchNo")
        public String batchNo;

        @NameInMap("PreSnNo")
        public String preSnNo;

        @NameInMap("Warranty")
        public Integer warranty;

        @NameInMap("WarrantyLevel")
        public String warrantyLevel;

        @NameInMap("Status")
        public String status;

        @NameInMap("Uom")
        public String uom;

        @NameInMap("AcceptTime")
        public Long acceptTime;

        public static QueryApplyOrderAllDetailResponseBodyDataSubOrdersGoodsDetails build(java.util.Map<String, ?> map) throws Exception {
            QueryApplyOrderAllDetailResponseBodyDataSubOrdersGoodsDetails self = new QueryApplyOrderAllDetailResponseBodyDataSubOrdersGoodsDetails();
            return TeaModel.build(map, self);
        }

        public QueryApplyOrderAllDetailResponseBodyDataSubOrdersGoodsDetails setProductId(String productId) {
            this.productId = productId;
            return this;
        }
        public String getProductId() {
            return this.productId;
        }

        public QueryApplyOrderAllDetailResponseBodyDataSubOrdersGoodsDetails setProductModel(String productModel) {
            this.productModel = productModel;
            return this;
        }
        public String getProductModel() {
            return this.productModel;
        }

        public QueryApplyOrderAllDetailResponseBodyDataSubOrdersGoodsDetails setNum(Integer num) {
            this.num = num;
            return this;
        }
        public Integer getNum() {
            return this.num;
        }

        public QueryApplyOrderAllDetailResponseBodyDataSubOrdersGoodsDetails setPoId(String poId) {
            this.poId = poId;
            return this;
        }
        public String getPoId() {
            return this.poId;
        }

        public QueryApplyOrderAllDetailResponseBodyDataSubOrdersGoodsDetails setFactoryName(String factoryName) {
            this.factoryName = factoryName;
            return this;
        }
        public String getFactoryName() {
            return this.factoryName;
        }

        public QueryApplyOrderAllDetailResponseBodyDataSubOrdersGoodsDetails setBatchNo(String batchNo) {
            this.batchNo = batchNo;
            return this;
        }
        public String getBatchNo() {
            return this.batchNo;
        }

        public QueryApplyOrderAllDetailResponseBodyDataSubOrdersGoodsDetails setPreSnNo(String preSnNo) {
            this.preSnNo = preSnNo;
            return this;
        }
        public String getPreSnNo() {
            return this.preSnNo;
        }

        public QueryApplyOrderAllDetailResponseBodyDataSubOrdersGoodsDetails setWarranty(Integer warranty) {
            this.warranty = warranty;
            return this;
        }
        public Integer getWarranty() {
            return this.warranty;
        }

        public QueryApplyOrderAllDetailResponseBodyDataSubOrdersGoodsDetails setWarrantyLevel(String warrantyLevel) {
            this.warrantyLevel = warrantyLevel;
            return this;
        }
        public String getWarrantyLevel() {
            return this.warrantyLevel;
        }

        public QueryApplyOrderAllDetailResponseBodyDataSubOrdersGoodsDetails setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryApplyOrderAllDetailResponseBodyDataSubOrdersGoodsDetails setUom(String uom) {
            this.uom = uom;
            return this;
        }
        public String getUom() {
            return this.uom;
        }

        public QueryApplyOrderAllDetailResponseBodyDataSubOrdersGoodsDetails setAcceptTime(Long acceptTime) {
            this.acceptTime = acceptTime;
            return this;
        }
        public Long getAcceptTime() {
            return this.acceptTime;
        }

    }

    public static class QueryApplyOrderAllDetailResponseBodyDataSubOrders extends TeaModel {
        @NameInMap("SubOrderId")
        public String subOrderId;

        @NameInMap("ApplyOrderId")
        public Long applyOrderId;

        @NameInMap("OrderType")
        public String orderType;

        @NameInMap("ArticleSpecDesc")
        public String articleSpecDesc;

        @NameInMap("CategoryName")
        public String categoryName;

        @NameInMap("PurchaseUse")
        public String purchaseUse;

        @NameInMap("SignNum")
        public String signNum;

        @NameInMap("UnitPrice")
        public String unitPrice;

        @NameInMap("SumPrice")
        public String sumPrice;

        @NameInMap("PurchaseType")
        public String purchaseType;

        @NameInMap("Brand")
        public String brand;

        @NameInMap("SupplierName")
        public String supplierName;

        @NameInMap("SupplierApproveUrl")
        public String supplierApproveUrl;

        @NameInMap("AttachmentId")
        public String attachmentId;

        @NameInMap("AttachmentIds")
        public java.util.List<String> attachmentIds;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("PrNumber")
        public String prNumber;

        @NameInMap("PrNumberUrl")
        public String prNumberUrl;

        @NameInMap("PrLineId")
        public String prLineId;

        @NameInMap("PoId")
        public String poId;

        @NameInMap("PoIdUrl")
        public String poIdUrl;

        @NameInMap("Status")
        public String status;

        @NameInMap("Uom")
        public String uom;

        @NameInMap("PreShipTime")
        public Long preShipTime;

        @NameInMap("ShipTime")
        public Long shipTime;

        @NameInMap("SignTime")
        public Long signTime;

        @NameInMap("InstallTime")
        public Long installTime;

        @NameInMap("AcceptedTime")
        public Long acceptedTime;

        @NameInMap("PurchaseDesc")
        public String purchaseDesc;

        @NameInMap("Productions")
        public java.util.List<QueryApplyOrderAllDetailResponseBodyDataSubOrdersProductions> productions;

        @NameInMap("GoodsDetails")
        public java.util.List<QueryApplyOrderAllDetailResponseBodyDataSubOrdersGoodsDetails> goodsDetails;

        public static QueryApplyOrderAllDetailResponseBodyDataSubOrders build(java.util.Map<String, ?> map) throws Exception {
            QueryApplyOrderAllDetailResponseBodyDataSubOrders self = new QueryApplyOrderAllDetailResponseBodyDataSubOrders();
            return TeaModel.build(map, self);
        }

        public QueryApplyOrderAllDetailResponseBodyDataSubOrders setSubOrderId(String subOrderId) {
            this.subOrderId = subOrderId;
            return this;
        }
        public String getSubOrderId() {
            return this.subOrderId;
        }

        public QueryApplyOrderAllDetailResponseBodyDataSubOrders setApplyOrderId(Long applyOrderId) {
            this.applyOrderId = applyOrderId;
            return this;
        }
        public Long getApplyOrderId() {
            return this.applyOrderId;
        }

        public QueryApplyOrderAllDetailResponseBodyDataSubOrders setOrderType(String orderType) {
            this.orderType = orderType;
            return this;
        }
        public String getOrderType() {
            return this.orderType;
        }

        public QueryApplyOrderAllDetailResponseBodyDataSubOrders setArticleSpecDesc(String articleSpecDesc) {
            this.articleSpecDesc = articleSpecDesc;
            return this;
        }
        public String getArticleSpecDesc() {
            return this.articleSpecDesc;
        }

        public QueryApplyOrderAllDetailResponseBodyDataSubOrders setCategoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }
        public String getCategoryName() {
            return this.categoryName;
        }

        public QueryApplyOrderAllDetailResponseBodyDataSubOrders setPurchaseUse(String purchaseUse) {
            this.purchaseUse = purchaseUse;
            return this;
        }
        public String getPurchaseUse() {
            return this.purchaseUse;
        }

        public QueryApplyOrderAllDetailResponseBodyDataSubOrders setSignNum(String signNum) {
            this.signNum = signNum;
            return this;
        }
        public String getSignNum() {
            return this.signNum;
        }

        public QueryApplyOrderAllDetailResponseBodyDataSubOrders setUnitPrice(String unitPrice) {
            this.unitPrice = unitPrice;
            return this;
        }
        public String getUnitPrice() {
            return this.unitPrice;
        }

        public QueryApplyOrderAllDetailResponseBodyDataSubOrders setSumPrice(String sumPrice) {
            this.sumPrice = sumPrice;
            return this;
        }
        public String getSumPrice() {
            return this.sumPrice;
        }

        public QueryApplyOrderAllDetailResponseBodyDataSubOrders setPurchaseType(String purchaseType) {
            this.purchaseType = purchaseType;
            return this;
        }
        public String getPurchaseType() {
            return this.purchaseType;
        }

        public QueryApplyOrderAllDetailResponseBodyDataSubOrders setBrand(String brand) {
            this.brand = brand;
            return this;
        }
        public String getBrand() {
            return this.brand;
        }

        public QueryApplyOrderAllDetailResponseBodyDataSubOrders setSupplierName(String supplierName) {
            this.supplierName = supplierName;
            return this;
        }
        public String getSupplierName() {
            return this.supplierName;
        }

        public QueryApplyOrderAllDetailResponseBodyDataSubOrders setSupplierApproveUrl(String supplierApproveUrl) {
            this.supplierApproveUrl = supplierApproveUrl;
            return this;
        }
        public String getSupplierApproveUrl() {
            return this.supplierApproveUrl;
        }

        public QueryApplyOrderAllDetailResponseBodyDataSubOrders setAttachmentId(String attachmentId) {
            this.attachmentId = attachmentId;
            return this;
        }
        public String getAttachmentId() {
            return this.attachmentId;
        }

        public QueryApplyOrderAllDetailResponseBodyDataSubOrders setAttachmentIds(java.util.List<String> attachmentIds) {
            this.attachmentIds = attachmentIds;
            return this;
        }
        public java.util.List<String> getAttachmentIds() {
            return this.attachmentIds;
        }

        public QueryApplyOrderAllDetailResponseBodyDataSubOrders setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public QueryApplyOrderAllDetailResponseBodyDataSubOrders setPrNumber(String prNumber) {
            this.prNumber = prNumber;
            return this;
        }
        public String getPrNumber() {
            return this.prNumber;
        }

        public QueryApplyOrderAllDetailResponseBodyDataSubOrders setPrNumberUrl(String prNumberUrl) {
            this.prNumberUrl = prNumberUrl;
            return this;
        }
        public String getPrNumberUrl() {
            return this.prNumberUrl;
        }

        public QueryApplyOrderAllDetailResponseBodyDataSubOrders setPrLineId(String prLineId) {
            this.prLineId = prLineId;
            return this;
        }
        public String getPrLineId() {
            return this.prLineId;
        }

        public QueryApplyOrderAllDetailResponseBodyDataSubOrders setPoId(String poId) {
            this.poId = poId;
            return this;
        }
        public String getPoId() {
            return this.poId;
        }

        public QueryApplyOrderAllDetailResponseBodyDataSubOrders setPoIdUrl(String poIdUrl) {
            this.poIdUrl = poIdUrl;
            return this;
        }
        public String getPoIdUrl() {
            return this.poIdUrl;
        }

        public QueryApplyOrderAllDetailResponseBodyDataSubOrders setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryApplyOrderAllDetailResponseBodyDataSubOrders setUom(String uom) {
            this.uom = uom;
            return this;
        }
        public String getUom() {
            return this.uom;
        }

        public QueryApplyOrderAllDetailResponseBodyDataSubOrders setPreShipTime(Long preShipTime) {
            this.preShipTime = preShipTime;
            return this;
        }
        public Long getPreShipTime() {
            return this.preShipTime;
        }

        public QueryApplyOrderAllDetailResponseBodyDataSubOrders setShipTime(Long shipTime) {
            this.shipTime = shipTime;
            return this;
        }
        public Long getShipTime() {
            return this.shipTime;
        }

        public QueryApplyOrderAllDetailResponseBodyDataSubOrders setSignTime(Long signTime) {
            this.signTime = signTime;
            return this;
        }
        public Long getSignTime() {
            return this.signTime;
        }

        public QueryApplyOrderAllDetailResponseBodyDataSubOrders setInstallTime(Long installTime) {
            this.installTime = installTime;
            return this;
        }
        public Long getInstallTime() {
            return this.installTime;
        }

        public QueryApplyOrderAllDetailResponseBodyDataSubOrders setAcceptedTime(Long acceptedTime) {
            this.acceptedTime = acceptedTime;
            return this;
        }
        public Long getAcceptedTime() {
            return this.acceptedTime;
        }

        public QueryApplyOrderAllDetailResponseBodyDataSubOrders setPurchaseDesc(String purchaseDesc) {
            this.purchaseDesc = purchaseDesc;
            return this;
        }
        public String getPurchaseDesc() {
            return this.purchaseDesc;
        }

        public QueryApplyOrderAllDetailResponseBodyDataSubOrders setProductions(java.util.List<QueryApplyOrderAllDetailResponseBodyDataSubOrdersProductions> productions) {
            this.productions = productions;
            return this;
        }
        public java.util.List<QueryApplyOrderAllDetailResponseBodyDataSubOrdersProductions> getProductions() {
            return this.productions;
        }

        public QueryApplyOrderAllDetailResponseBodyDataSubOrders setGoodsDetails(java.util.List<QueryApplyOrderAllDetailResponseBodyDataSubOrdersGoodsDetails> goodsDetails) {
            this.goodsDetails = goodsDetails;
            return this;
        }
        public java.util.List<QueryApplyOrderAllDetailResponseBodyDataSubOrdersGoodsDetails> getGoodsDetails() {
            return this.goodsDetails;
        }

    }

    public static class QueryApplyOrderAllDetailResponseBodyData extends TeaModel {
        @NameInMap("ApplyOrderId")
        public String applyOrderId;

        @NameInMap("BpId")
        public String bpId;

        @NameInMap("ArticleSpecCode")
        public String articleSpecCode;

        @NameInMap("ArticleSpecDesc")
        public String articleSpecDesc;

        @NameInMap("ApplyDesc")
        public String applyDesc;

        @NameInMap("Budget")
        public String budget;

        @NameInMap("LaboratoryAddress")
        public String laboratoryAddress;

        @NameInMap("ArticleName")
        public String articleName;

        @NameInMap("CurrentPurchaseNum")
        public Integer currentPurchaseNum;

        @NameInMap("ExpectTime")
        public Long expectTime;

        @NameInMap("HardwareWarranty")
        public String hardwareWarranty;

        @NameInMap("HardwareWarrantyLevel")
        public String hardwareWarrantyLevel;

        @NameInMap("DesignatedBrand")
        public String designatedBrand;

        @NameInMap("ProductModel")
        public String productModel;

        @NameInMap("PurchaseDesc")
        public String purchaseDesc;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("SubOrders")
        public java.util.List<QueryApplyOrderAllDetailResponseBodyDataSubOrders> subOrders;

        public static QueryApplyOrderAllDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryApplyOrderAllDetailResponseBodyData self = new QueryApplyOrderAllDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryApplyOrderAllDetailResponseBodyData setApplyOrderId(String applyOrderId) {
            this.applyOrderId = applyOrderId;
            return this;
        }
        public String getApplyOrderId() {
            return this.applyOrderId;
        }

        public QueryApplyOrderAllDetailResponseBodyData setBpId(String bpId) {
            this.bpId = bpId;
            return this;
        }
        public String getBpId() {
            return this.bpId;
        }

        public QueryApplyOrderAllDetailResponseBodyData setArticleSpecCode(String articleSpecCode) {
            this.articleSpecCode = articleSpecCode;
            return this;
        }
        public String getArticleSpecCode() {
            return this.articleSpecCode;
        }

        public QueryApplyOrderAllDetailResponseBodyData setArticleSpecDesc(String articleSpecDesc) {
            this.articleSpecDesc = articleSpecDesc;
            return this;
        }
        public String getArticleSpecDesc() {
            return this.articleSpecDesc;
        }

        public QueryApplyOrderAllDetailResponseBodyData setApplyDesc(String applyDesc) {
            this.applyDesc = applyDesc;
            return this;
        }
        public String getApplyDesc() {
            return this.applyDesc;
        }

        public QueryApplyOrderAllDetailResponseBodyData setBudget(String budget) {
            this.budget = budget;
            return this;
        }
        public String getBudget() {
            return this.budget;
        }

        public QueryApplyOrderAllDetailResponseBodyData setLaboratoryAddress(String laboratoryAddress) {
            this.laboratoryAddress = laboratoryAddress;
            return this;
        }
        public String getLaboratoryAddress() {
            return this.laboratoryAddress;
        }

        public QueryApplyOrderAllDetailResponseBodyData setArticleName(String articleName) {
            this.articleName = articleName;
            return this;
        }
        public String getArticleName() {
            return this.articleName;
        }

        public QueryApplyOrderAllDetailResponseBodyData setCurrentPurchaseNum(Integer currentPurchaseNum) {
            this.currentPurchaseNum = currentPurchaseNum;
            return this;
        }
        public Integer getCurrentPurchaseNum() {
            return this.currentPurchaseNum;
        }

        public QueryApplyOrderAllDetailResponseBodyData setExpectTime(Long expectTime) {
            this.expectTime = expectTime;
            return this;
        }
        public Long getExpectTime() {
            return this.expectTime;
        }

        public QueryApplyOrderAllDetailResponseBodyData setHardwareWarranty(String hardwareWarranty) {
            this.hardwareWarranty = hardwareWarranty;
            return this;
        }
        public String getHardwareWarranty() {
            return this.hardwareWarranty;
        }

        public QueryApplyOrderAllDetailResponseBodyData setHardwareWarrantyLevel(String hardwareWarrantyLevel) {
            this.hardwareWarrantyLevel = hardwareWarrantyLevel;
            return this;
        }
        public String getHardwareWarrantyLevel() {
            return this.hardwareWarrantyLevel;
        }

        public QueryApplyOrderAllDetailResponseBodyData setDesignatedBrand(String designatedBrand) {
            this.designatedBrand = designatedBrand;
            return this;
        }
        public String getDesignatedBrand() {
            return this.designatedBrand;
        }

        public QueryApplyOrderAllDetailResponseBodyData setProductModel(String productModel) {
            this.productModel = productModel;
            return this;
        }
        public String getProductModel() {
            return this.productModel;
        }

        public QueryApplyOrderAllDetailResponseBodyData setPurchaseDesc(String purchaseDesc) {
            this.purchaseDesc = purchaseDesc;
            return this;
        }
        public String getPurchaseDesc() {
            return this.purchaseDesc;
        }

        public QueryApplyOrderAllDetailResponseBodyData setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public QueryApplyOrderAllDetailResponseBodyData setSubOrders(java.util.List<QueryApplyOrderAllDetailResponseBodyDataSubOrders> subOrders) {
            this.subOrders = subOrders;
            return this;
        }
        public java.util.List<QueryApplyOrderAllDetailResponseBodyDataSubOrders> getSubOrders() {
            return this.subOrders;
        }

    }

}
