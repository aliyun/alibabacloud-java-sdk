// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryOrderDetailInnerResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Model")
    @Validation(required = true)
    public QueryOrderDetailInnerResponseModel model;

    public static QueryOrderDetailInnerResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryOrderDetailInnerResponse self = new QueryOrderDetailInnerResponse();
        return TeaModel.build(map, self);
    }

    public QueryOrderDetailInnerResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryOrderDetailInnerResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryOrderDetailInnerResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryOrderDetailInnerResponse setModel(QueryOrderDetailInnerResponseModel model) {
        this.model = model;
        return this;
    }
    public QueryOrderDetailInnerResponseModel getModel() {
        return this.model;
    }

    public static class QueryOrderDetailInnerResponseModelOrderSubItemOrderListSubItemOrderItemPriceListItemPrice extends TeaModel {
        @NameInMap("TbOrderId")
        @Validation(required = true)
        public Long tbOrderId;

        @NameInMap("TbSubOrderId")
        @Validation(required = true)
        public Long tbSubOrderId;

        @NameInMap("FundType")
        @Validation(required = true)
        public String fundType;

        @NameInMap("FundAmount")
        @Validation(required = true)
        public Long fundAmount;

        @NameInMap("FundAmountMoney")
        @Validation(required = true)
        public Long fundAmountMoney;

        public static QueryOrderDetailInnerResponseModelOrderSubItemOrderListSubItemOrderItemPriceListItemPrice build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderDetailInnerResponseModelOrderSubItemOrderListSubItemOrderItemPriceListItemPrice self = new QueryOrderDetailInnerResponseModelOrderSubItemOrderListSubItemOrderItemPriceListItemPrice();
            return TeaModel.build(map, self);
        }

        public QueryOrderDetailInnerResponseModelOrderSubItemOrderListSubItemOrderItemPriceListItemPrice setTbOrderId(Long tbOrderId) {
            this.tbOrderId = tbOrderId;
            return this;
        }
        public Long getTbOrderId() {
            return this.tbOrderId;
        }

        public QueryOrderDetailInnerResponseModelOrderSubItemOrderListSubItemOrderItemPriceListItemPrice setTbSubOrderId(Long tbSubOrderId) {
            this.tbSubOrderId = tbSubOrderId;
            return this;
        }
        public Long getTbSubOrderId() {
            return this.tbSubOrderId;
        }

        public QueryOrderDetailInnerResponseModelOrderSubItemOrderListSubItemOrderItemPriceListItemPrice setFundType(String fundType) {
            this.fundType = fundType;
            return this;
        }
        public String getFundType() {
            return this.fundType;
        }

        public QueryOrderDetailInnerResponseModelOrderSubItemOrderListSubItemOrderItemPriceListItemPrice setFundAmount(Long fundAmount) {
            this.fundAmount = fundAmount;
            return this;
        }
        public Long getFundAmount() {
            return this.fundAmount;
        }

        public QueryOrderDetailInnerResponseModelOrderSubItemOrderListSubItemOrderItemPriceListItemPrice setFundAmountMoney(Long fundAmountMoney) {
            this.fundAmountMoney = fundAmountMoney;
            return this;
        }
        public Long getFundAmountMoney() {
            return this.fundAmountMoney;
        }

    }

    public static class QueryOrderDetailInnerResponseModelOrderSubItemOrderListSubItemOrderItemPriceList extends TeaModel {
        @NameInMap("ItemPrice")
        @Validation(required = true)
        public java.util.List<QueryOrderDetailInnerResponseModelOrderSubItemOrderListSubItemOrderItemPriceListItemPrice> itemPrice;

        public static QueryOrderDetailInnerResponseModelOrderSubItemOrderListSubItemOrderItemPriceList build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderDetailInnerResponseModelOrderSubItemOrderListSubItemOrderItemPriceList self = new QueryOrderDetailInnerResponseModelOrderSubItemOrderListSubItemOrderItemPriceList();
            return TeaModel.build(map, self);
        }

        public QueryOrderDetailInnerResponseModelOrderSubItemOrderListSubItemOrderItemPriceList setItemPrice(java.util.List<QueryOrderDetailInnerResponseModelOrderSubItemOrderListSubItemOrderItemPriceListItemPrice> itemPrice) {
            this.itemPrice = itemPrice;
            return this;
        }
        public java.util.List<QueryOrderDetailInnerResponseModelOrderSubItemOrderListSubItemOrderItemPriceListItemPrice> getItemPrice() {
            return this.itemPrice;
        }

    }

    public static class QueryOrderDetailInnerResponseModelOrderSubItemOrderListSubItemOrder extends TeaModel {
        @NameInMap("PayStatus")
        @Validation(required = true)
        public Integer payStatus;

        @NameInMap("ItemTitle")
        @Validation(required = true)
        public String itemTitle;

        @NameInMap("LmItemId")
        @Validation(required = true)
        public String lmItemId;

        @NameInMap("ItemId")
        @Validation(required = true)
        public Long itemId;

        @NameInMap("ItemPic")
        @Validation(required = true)
        public String itemPic;

        @NameInMap("ItemPriceInfo")
        @Validation(required = true)
        public String itemPriceInfo;

        @NameInMap("Number")
        @Validation(required = true)
        public Integer number;

        @NameInMap("TbSubOrderId")
        @Validation(required = true)
        public Long tbSubOrderId;

        @NameInMap("LmOrderId")
        @Validation(required = true)
        public Long lmOrderId;

        @NameInMap("SkuName")
        @Validation(required = true)
        public String skuName;

        @NameInMap("SkuId")
        @Validation(required = true)
        public Long skuId;

        @NameInMap("TotalPaymentInfo")
        @Validation(required = true)
        public String totalPaymentInfo;

        @NameInMap("ChannelCode")
        @Validation(required = true)
        public String channelCode;

        @NameInMap("ItemPriceList")
        @Validation(required = true)
        public QueryOrderDetailInnerResponseModelOrderSubItemOrderListSubItemOrderItemPriceList itemPriceList;

        public static QueryOrderDetailInnerResponseModelOrderSubItemOrderListSubItemOrder build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderDetailInnerResponseModelOrderSubItemOrderListSubItemOrder self = new QueryOrderDetailInnerResponseModelOrderSubItemOrderListSubItemOrder();
            return TeaModel.build(map, self);
        }

        public QueryOrderDetailInnerResponseModelOrderSubItemOrderListSubItemOrder setPayStatus(Integer payStatus) {
            this.payStatus = payStatus;
            return this;
        }
        public Integer getPayStatus() {
            return this.payStatus;
        }

        public QueryOrderDetailInnerResponseModelOrderSubItemOrderListSubItemOrder setItemTitle(String itemTitle) {
            this.itemTitle = itemTitle;
            return this;
        }
        public String getItemTitle() {
            return this.itemTitle;
        }

        public QueryOrderDetailInnerResponseModelOrderSubItemOrderListSubItemOrder setLmItemId(String lmItemId) {
            this.lmItemId = lmItemId;
            return this;
        }
        public String getLmItemId() {
            return this.lmItemId;
        }

        public QueryOrderDetailInnerResponseModelOrderSubItemOrderListSubItemOrder setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public QueryOrderDetailInnerResponseModelOrderSubItemOrderListSubItemOrder setItemPic(String itemPic) {
            this.itemPic = itemPic;
            return this;
        }
        public String getItemPic() {
            return this.itemPic;
        }

        public QueryOrderDetailInnerResponseModelOrderSubItemOrderListSubItemOrder setItemPriceInfo(String itemPriceInfo) {
            this.itemPriceInfo = itemPriceInfo;
            return this;
        }
        public String getItemPriceInfo() {
            return this.itemPriceInfo;
        }

        public QueryOrderDetailInnerResponseModelOrderSubItemOrderListSubItemOrder setNumber(Integer number) {
            this.number = number;
            return this;
        }
        public Integer getNumber() {
            return this.number;
        }

        public QueryOrderDetailInnerResponseModelOrderSubItemOrderListSubItemOrder setTbSubOrderId(Long tbSubOrderId) {
            this.tbSubOrderId = tbSubOrderId;
            return this;
        }
        public Long getTbSubOrderId() {
            return this.tbSubOrderId;
        }

        public QueryOrderDetailInnerResponseModelOrderSubItemOrderListSubItemOrder setLmOrderId(Long lmOrderId) {
            this.lmOrderId = lmOrderId;
            return this;
        }
        public Long getLmOrderId() {
            return this.lmOrderId;
        }

        public QueryOrderDetailInnerResponseModelOrderSubItemOrderListSubItemOrder setSkuName(String skuName) {
            this.skuName = skuName;
            return this;
        }
        public String getSkuName() {
            return this.skuName;
        }

        public QueryOrderDetailInnerResponseModelOrderSubItemOrderListSubItemOrder setSkuId(Long skuId) {
            this.skuId = skuId;
            return this;
        }
        public Long getSkuId() {
            return this.skuId;
        }

        public QueryOrderDetailInnerResponseModelOrderSubItemOrderListSubItemOrder setTotalPaymentInfo(String totalPaymentInfo) {
            this.totalPaymentInfo = totalPaymentInfo;
            return this;
        }
        public String getTotalPaymentInfo() {
            return this.totalPaymentInfo;
        }

        public QueryOrderDetailInnerResponseModelOrderSubItemOrderListSubItemOrder setChannelCode(String channelCode) {
            this.channelCode = channelCode;
            return this;
        }
        public String getChannelCode() {
            return this.channelCode;
        }

        public QueryOrderDetailInnerResponseModelOrderSubItemOrderListSubItemOrder setItemPriceList(QueryOrderDetailInnerResponseModelOrderSubItemOrderListSubItemOrderItemPriceList itemPriceList) {
            this.itemPriceList = itemPriceList;
            return this;
        }
        public QueryOrderDetailInnerResponseModelOrderSubItemOrderListSubItemOrderItemPriceList getItemPriceList() {
            return this.itemPriceList;
        }

    }

    public static class QueryOrderDetailInnerResponseModelOrderSubItemOrderList extends TeaModel {
        @NameInMap("SubItemOrder")
        @Validation(required = true)
        public java.util.List<QueryOrderDetailInnerResponseModelOrderSubItemOrderListSubItemOrder> subItemOrder;

        public static QueryOrderDetailInnerResponseModelOrderSubItemOrderList build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderDetailInnerResponseModelOrderSubItemOrderList self = new QueryOrderDetailInnerResponseModelOrderSubItemOrderList();
            return TeaModel.build(map, self);
        }

        public QueryOrderDetailInnerResponseModelOrderSubItemOrderList setSubItemOrder(java.util.List<QueryOrderDetailInnerResponseModelOrderSubItemOrderListSubItemOrder> subItemOrder) {
            this.subItemOrder = subItemOrder;
            return this;
        }
        public java.util.List<QueryOrderDetailInnerResponseModelOrderSubItemOrderListSubItemOrder> getSubItemOrder() {
            return this.subItemOrder;
        }

    }

    public static class QueryOrderDetailInnerResponseModelOrderFundStructureModelsFundStructure extends TeaModel {
        @NameInMap("LmOrderId")
        @Validation(required = true)
        public Long lmOrderId;

        @NameInMap("TbSubOrderId")
        @Validation(required = true)
        public Long tbSubOrderId;

        @NameInMap("FundType")
        @Validation(required = true)
        public String fundType;

        @NameInMap("FundAmount")
        @Validation(required = true)
        public Long fundAmount;

        @NameInMap("FundAmountMoney")
        @Validation(required = true)
        public Long fundAmountMoney;

        public static QueryOrderDetailInnerResponseModelOrderFundStructureModelsFundStructure build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderDetailInnerResponseModelOrderFundStructureModelsFundStructure self = new QueryOrderDetailInnerResponseModelOrderFundStructureModelsFundStructure();
            return TeaModel.build(map, self);
        }

        public QueryOrderDetailInnerResponseModelOrderFundStructureModelsFundStructure setLmOrderId(Long lmOrderId) {
            this.lmOrderId = lmOrderId;
            return this;
        }
        public Long getLmOrderId() {
            return this.lmOrderId;
        }

        public QueryOrderDetailInnerResponseModelOrderFundStructureModelsFundStructure setTbSubOrderId(Long tbSubOrderId) {
            this.tbSubOrderId = tbSubOrderId;
            return this;
        }
        public Long getTbSubOrderId() {
            return this.tbSubOrderId;
        }

        public QueryOrderDetailInnerResponseModelOrderFundStructureModelsFundStructure setFundType(String fundType) {
            this.fundType = fundType;
            return this;
        }
        public String getFundType() {
            return this.fundType;
        }

        public QueryOrderDetailInnerResponseModelOrderFundStructureModelsFundStructure setFundAmount(Long fundAmount) {
            this.fundAmount = fundAmount;
            return this;
        }
        public Long getFundAmount() {
            return this.fundAmount;
        }

        public QueryOrderDetailInnerResponseModelOrderFundStructureModelsFundStructure setFundAmountMoney(Long fundAmountMoney) {
            this.fundAmountMoney = fundAmountMoney;
            return this;
        }
        public Long getFundAmountMoney() {
            return this.fundAmountMoney;
        }

    }

    public static class QueryOrderDetailInnerResponseModelOrderFundStructureModels extends TeaModel {
        @NameInMap("FundStructure")
        @Validation(required = true)
        public java.util.List<QueryOrderDetailInnerResponseModelOrderFundStructureModelsFundStructure> fundStructure;

        public static QueryOrderDetailInnerResponseModelOrderFundStructureModels build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderDetailInnerResponseModelOrderFundStructureModels self = new QueryOrderDetailInnerResponseModelOrderFundStructureModels();
            return TeaModel.build(map, self);
        }

        public QueryOrderDetailInnerResponseModelOrderFundStructureModels setFundStructure(java.util.List<QueryOrderDetailInnerResponseModelOrderFundStructureModelsFundStructure> fundStructure) {
            this.fundStructure = fundStructure;
            return this;
        }
        public java.util.List<QueryOrderDetailInnerResponseModelOrderFundStructureModelsFundStructure> getFundStructure() {
            return this.fundStructure;
        }

    }

    public static class QueryOrderDetailInnerResponseModelOrderPostFee extends TeaModel {
        @NameInMap("LmOrderId")
        @Validation(required = true)
        public Long lmOrderId;

        @NameInMap("TbSubOrderId")
        @Validation(required = true)
        public Long tbSubOrderId;

        @NameInMap("FundType")
        @Validation(required = true)
        public String fundType;

        @NameInMap("FundAmount")
        @Validation(required = true)
        public Long fundAmount;

        @NameInMap("FundAmountMoney")
        @Validation(required = true)
        public Long fundAmountMoney;

        public static QueryOrderDetailInnerResponseModelOrderPostFee build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderDetailInnerResponseModelOrderPostFee self = new QueryOrderDetailInnerResponseModelOrderPostFee();
            return TeaModel.build(map, self);
        }

        public QueryOrderDetailInnerResponseModelOrderPostFee setLmOrderId(Long lmOrderId) {
            this.lmOrderId = lmOrderId;
            return this;
        }
        public Long getLmOrderId() {
            return this.lmOrderId;
        }

        public QueryOrderDetailInnerResponseModelOrderPostFee setTbSubOrderId(Long tbSubOrderId) {
            this.tbSubOrderId = tbSubOrderId;
            return this;
        }
        public Long getTbSubOrderId() {
            return this.tbSubOrderId;
        }

        public QueryOrderDetailInnerResponseModelOrderPostFee setFundType(String fundType) {
            this.fundType = fundType;
            return this;
        }
        public String getFundType() {
            return this.fundType;
        }

        public QueryOrderDetailInnerResponseModelOrderPostFee setFundAmount(Long fundAmount) {
            this.fundAmount = fundAmount;
            return this;
        }
        public Long getFundAmount() {
            return this.fundAmount;
        }

        public QueryOrderDetailInnerResponseModelOrderPostFee setFundAmountMoney(Long fundAmountMoney) {
            this.fundAmountMoney = fundAmountMoney;
            return this;
        }
        public Long getFundAmountMoney() {
            return this.fundAmountMoney;
        }

    }

    public static class QueryOrderDetailInnerResponseModelOrder extends TeaModel {
        @NameInMap("LmOrderId")
        @Validation(required = true)
        public Long lmOrderId;

        @NameInMap("ChannelCode")
        @Validation(required = true)
        public String channelCode;

        @NameInMap("ChannelOrderId")
        @Validation(required = true)
        public String channelOrderId;

        @NameInMap("ChannelBizType")
        @Validation(required = true)
        public String channelBizType;

        @NameInMap("OrderPayInfo")
        @Validation(required = true)
        public String orderPayInfo;

        @NameInMap("SellerId")
        @Validation(required = true)
        public Long sellerId;

        @NameInMap("SellerNick")
        @Validation(required = true)
        public String sellerNick;

        @NameInMap("ShopName")
        @Validation(required = true)
        public String shopName;

        @NameInMap("CreateDate")
        @Validation(required = true)
        public String createDate;

        @NameInMap("PayStatus")
        @Validation(required = true)
        public Integer payStatus;

        @NameInMap("PayWaterStatus")
        @Validation(required = true)
        public Integer payWaterStatus;

        @NameInMap("RefundStatus")
        @Validation(required = true)
        public Integer refundStatus;

        @NameInMap("LogisticsStatus")
        @Validation(required = true)
        public Integer logisticsStatus;

        @NameInMap("LogisticsStatusDesc")
        @Validation(required = true)
        public String logisticsStatusDesc;

        @NameInMap("LogisticsAddress")
        @Validation(required = true)
        public String logisticsAddress;

        @NameInMap("LogisticsUserName")
        @Validation(required = true)
        public String logisticsUserName;

        @NameInMap("LogisticsMobilePhone")
        @Validation(required = true)
        public String logisticsMobilePhone;

        @NameInMap("LogisticsNo")
        @Validation(required = true)
        public String logisticsNo;

        @NameInMap("OrderAmount")
        @Validation(required = true)
        public Long orderAmount;

        @NameInMap("LogisticsCompName")
        @Validation(required = true)
        public String logisticsCompName;

        @NameInMap("ResExtInfo")
        @Validation(required = true)
        public String resExtInfo;

        @NameInMap("EndTime")
        @Validation(required = true)
        public Long endTime;

        @NameInMap("Shipping")
        @Validation(required = true)
        public String shipping;

        @NameInMap("Eticket")
        @Validation(required = true)
        public Boolean eticket;

        @NameInMap("EnableStatus")
        @Validation(required = true)
        public Integer enableStatus;

        @NameInMap("TbOrderId")
        @Validation(required = true)
        public String tbOrderId;

        @NameInMap("ExtInfo")
        @Validation(required = true)
        public java.util.Map<String, ?> extInfo;

        @NameInMap("SubItemOrderList")
        @Validation(required = true)
        public QueryOrderDetailInnerResponseModelOrderSubItemOrderList subItemOrderList;

        @NameInMap("FundStructureModels")
        @Validation(required = true)
        public QueryOrderDetailInnerResponseModelOrderFundStructureModels fundStructureModels;

        @NameInMap("PostFee")
        @Validation(required = true)
        public QueryOrderDetailInnerResponseModelOrderPostFee postFee;

        public static QueryOrderDetailInnerResponseModelOrder build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderDetailInnerResponseModelOrder self = new QueryOrderDetailInnerResponseModelOrder();
            return TeaModel.build(map, self);
        }

        public QueryOrderDetailInnerResponseModelOrder setLmOrderId(Long lmOrderId) {
            this.lmOrderId = lmOrderId;
            return this;
        }
        public Long getLmOrderId() {
            return this.lmOrderId;
        }

        public QueryOrderDetailInnerResponseModelOrder setChannelCode(String channelCode) {
            this.channelCode = channelCode;
            return this;
        }
        public String getChannelCode() {
            return this.channelCode;
        }

        public QueryOrderDetailInnerResponseModelOrder setChannelOrderId(String channelOrderId) {
            this.channelOrderId = channelOrderId;
            return this;
        }
        public String getChannelOrderId() {
            return this.channelOrderId;
        }

        public QueryOrderDetailInnerResponseModelOrder setChannelBizType(String channelBizType) {
            this.channelBizType = channelBizType;
            return this;
        }
        public String getChannelBizType() {
            return this.channelBizType;
        }

        public QueryOrderDetailInnerResponseModelOrder setOrderPayInfo(String orderPayInfo) {
            this.orderPayInfo = orderPayInfo;
            return this;
        }
        public String getOrderPayInfo() {
            return this.orderPayInfo;
        }

        public QueryOrderDetailInnerResponseModelOrder setSellerId(Long sellerId) {
            this.sellerId = sellerId;
            return this;
        }
        public Long getSellerId() {
            return this.sellerId;
        }

        public QueryOrderDetailInnerResponseModelOrder setSellerNick(String sellerNick) {
            this.sellerNick = sellerNick;
            return this;
        }
        public String getSellerNick() {
            return this.sellerNick;
        }

        public QueryOrderDetailInnerResponseModelOrder setShopName(String shopName) {
            this.shopName = shopName;
            return this;
        }
        public String getShopName() {
            return this.shopName;
        }

        public QueryOrderDetailInnerResponseModelOrder setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public QueryOrderDetailInnerResponseModelOrder setPayStatus(Integer payStatus) {
            this.payStatus = payStatus;
            return this;
        }
        public Integer getPayStatus() {
            return this.payStatus;
        }

        public QueryOrderDetailInnerResponseModelOrder setPayWaterStatus(Integer payWaterStatus) {
            this.payWaterStatus = payWaterStatus;
            return this;
        }
        public Integer getPayWaterStatus() {
            return this.payWaterStatus;
        }

        public QueryOrderDetailInnerResponseModelOrder setRefundStatus(Integer refundStatus) {
            this.refundStatus = refundStatus;
            return this;
        }
        public Integer getRefundStatus() {
            return this.refundStatus;
        }

        public QueryOrderDetailInnerResponseModelOrder setLogisticsStatus(Integer logisticsStatus) {
            this.logisticsStatus = logisticsStatus;
            return this;
        }
        public Integer getLogisticsStatus() {
            return this.logisticsStatus;
        }

        public QueryOrderDetailInnerResponseModelOrder setLogisticsStatusDesc(String logisticsStatusDesc) {
            this.logisticsStatusDesc = logisticsStatusDesc;
            return this;
        }
        public String getLogisticsStatusDesc() {
            return this.logisticsStatusDesc;
        }

        public QueryOrderDetailInnerResponseModelOrder setLogisticsAddress(String logisticsAddress) {
            this.logisticsAddress = logisticsAddress;
            return this;
        }
        public String getLogisticsAddress() {
            return this.logisticsAddress;
        }

        public QueryOrderDetailInnerResponseModelOrder setLogisticsUserName(String logisticsUserName) {
            this.logisticsUserName = logisticsUserName;
            return this;
        }
        public String getLogisticsUserName() {
            return this.logisticsUserName;
        }

        public QueryOrderDetailInnerResponseModelOrder setLogisticsMobilePhone(String logisticsMobilePhone) {
            this.logisticsMobilePhone = logisticsMobilePhone;
            return this;
        }
        public String getLogisticsMobilePhone() {
            return this.logisticsMobilePhone;
        }

        public QueryOrderDetailInnerResponseModelOrder setLogisticsNo(String logisticsNo) {
            this.logisticsNo = logisticsNo;
            return this;
        }
        public String getLogisticsNo() {
            return this.logisticsNo;
        }

        public QueryOrderDetailInnerResponseModelOrder setOrderAmount(Long orderAmount) {
            this.orderAmount = orderAmount;
            return this;
        }
        public Long getOrderAmount() {
            return this.orderAmount;
        }

        public QueryOrderDetailInnerResponseModelOrder setLogisticsCompName(String logisticsCompName) {
            this.logisticsCompName = logisticsCompName;
            return this;
        }
        public String getLogisticsCompName() {
            return this.logisticsCompName;
        }

        public QueryOrderDetailInnerResponseModelOrder setResExtInfo(String resExtInfo) {
            this.resExtInfo = resExtInfo;
            return this;
        }
        public String getResExtInfo() {
            return this.resExtInfo;
        }

        public QueryOrderDetailInnerResponseModelOrder setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public QueryOrderDetailInnerResponseModelOrder setShipping(String shipping) {
            this.shipping = shipping;
            return this;
        }
        public String getShipping() {
            return this.shipping;
        }

        public QueryOrderDetailInnerResponseModelOrder setEticket(Boolean eticket) {
            this.eticket = eticket;
            return this;
        }
        public Boolean getEticket() {
            return this.eticket;
        }

        public QueryOrderDetailInnerResponseModelOrder setEnableStatus(Integer enableStatus) {
            this.enableStatus = enableStatus;
            return this;
        }
        public Integer getEnableStatus() {
            return this.enableStatus;
        }

        public QueryOrderDetailInnerResponseModelOrder setTbOrderId(String tbOrderId) {
            this.tbOrderId = tbOrderId;
            return this;
        }
        public String getTbOrderId() {
            return this.tbOrderId;
        }

        public QueryOrderDetailInnerResponseModelOrder setExtInfo(java.util.Map<String, ?> extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public java.util.Map<String, ?> getExtInfo() {
            return this.extInfo;
        }

        public QueryOrderDetailInnerResponseModelOrder setSubItemOrderList(QueryOrderDetailInnerResponseModelOrderSubItemOrderList subItemOrderList) {
            this.subItemOrderList = subItemOrderList;
            return this;
        }
        public QueryOrderDetailInnerResponseModelOrderSubItemOrderList getSubItemOrderList() {
            return this.subItemOrderList;
        }

        public QueryOrderDetailInnerResponseModelOrder setFundStructureModels(QueryOrderDetailInnerResponseModelOrderFundStructureModels fundStructureModels) {
            this.fundStructureModels = fundStructureModels;
            return this;
        }
        public QueryOrderDetailInnerResponseModelOrderFundStructureModels getFundStructureModels() {
            return this.fundStructureModels;
        }

        public QueryOrderDetailInnerResponseModelOrder setPostFee(QueryOrderDetailInnerResponseModelOrderPostFee postFee) {
            this.postFee = postFee;
            return this;
        }
        public QueryOrderDetailInnerResponseModelOrderPostFee getPostFee() {
            return this.postFee;
        }

    }

    public static class QueryOrderDetailInnerResponseModel extends TeaModel {
        @NameInMap("order")
        @Validation(required = true)
        public QueryOrderDetailInnerResponseModelOrder order;

        public static QueryOrderDetailInnerResponseModel build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderDetailInnerResponseModel self = new QueryOrderDetailInnerResponseModel();
            return TeaModel.build(map, self);
        }

        public QueryOrderDetailInnerResponseModel setOrder(QueryOrderDetailInnerResponseModelOrder order) {
            this.order = order;
            return this;
        }
        public QueryOrderDetailInnerResponseModelOrder getOrder() {
            return this.order;
        }

    }

}
