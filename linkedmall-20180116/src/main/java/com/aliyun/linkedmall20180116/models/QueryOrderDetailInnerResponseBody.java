// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryOrderDetailInnerResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Model")
    public QueryOrderDetailInnerResponseBodyModel model;

    public static QueryOrderDetailInnerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryOrderDetailInnerResponseBody self = new QueryOrderDetailInnerResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryOrderDetailInnerResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryOrderDetailInnerResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryOrderDetailInnerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryOrderDetailInnerResponseBody setModel(QueryOrderDetailInnerResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public QueryOrderDetailInnerResponseBodyModel getModel() {
        return this.model;
    }

    public static class QueryOrderDetailInnerResponseBodyModelOrderSubItemOrderListSubItemOrderItemPriceListItemPrice extends TeaModel {
        @NameInMap("FundAmount")
        public Long fundAmount;

        @NameInMap("TbOrderId")
        public Long tbOrderId;

        @NameInMap("FundType")
        public String fundType;

        @NameInMap("FundAmountMoney")
        public Long fundAmountMoney;

        @NameInMap("TbSubOrderId")
        public Long tbSubOrderId;

        public static QueryOrderDetailInnerResponseBodyModelOrderSubItemOrderListSubItemOrderItemPriceListItemPrice build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderDetailInnerResponseBodyModelOrderSubItemOrderListSubItemOrderItemPriceListItemPrice self = new QueryOrderDetailInnerResponseBodyModelOrderSubItemOrderListSubItemOrderItemPriceListItemPrice();
            return TeaModel.build(map, self);
        }

        public QueryOrderDetailInnerResponseBodyModelOrderSubItemOrderListSubItemOrderItemPriceListItemPrice setFundAmount(Long fundAmount) {
            this.fundAmount = fundAmount;
            return this;
        }
        public Long getFundAmount() {
            return this.fundAmount;
        }

        public QueryOrderDetailInnerResponseBodyModelOrderSubItemOrderListSubItemOrderItemPriceListItemPrice setTbOrderId(Long tbOrderId) {
            this.tbOrderId = tbOrderId;
            return this;
        }
        public Long getTbOrderId() {
            return this.tbOrderId;
        }

        public QueryOrderDetailInnerResponseBodyModelOrderSubItemOrderListSubItemOrderItemPriceListItemPrice setFundType(String fundType) {
            this.fundType = fundType;
            return this;
        }
        public String getFundType() {
            return this.fundType;
        }

        public QueryOrderDetailInnerResponseBodyModelOrderSubItemOrderListSubItemOrderItemPriceListItemPrice setFundAmountMoney(Long fundAmountMoney) {
            this.fundAmountMoney = fundAmountMoney;
            return this;
        }
        public Long getFundAmountMoney() {
            return this.fundAmountMoney;
        }

        public QueryOrderDetailInnerResponseBodyModelOrderSubItemOrderListSubItemOrderItemPriceListItemPrice setTbSubOrderId(Long tbSubOrderId) {
            this.tbSubOrderId = tbSubOrderId;
            return this;
        }
        public Long getTbSubOrderId() {
            return this.tbSubOrderId;
        }

    }

    public static class QueryOrderDetailInnerResponseBodyModelOrderSubItemOrderListSubItemOrderItemPriceList extends TeaModel {
        @NameInMap("ItemPrice")
        public java.util.List<QueryOrderDetailInnerResponseBodyModelOrderSubItemOrderListSubItemOrderItemPriceListItemPrice> itemPrice;

        public static QueryOrderDetailInnerResponseBodyModelOrderSubItemOrderListSubItemOrderItemPriceList build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderDetailInnerResponseBodyModelOrderSubItemOrderListSubItemOrderItemPriceList self = new QueryOrderDetailInnerResponseBodyModelOrderSubItemOrderListSubItemOrderItemPriceList();
            return TeaModel.build(map, self);
        }

        public QueryOrderDetailInnerResponseBodyModelOrderSubItemOrderListSubItemOrderItemPriceList setItemPrice(java.util.List<QueryOrderDetailInnerResponseBodyModelOrderSubItemOrderListSubItemOrderItemPriceListItemPrice> itemPrice) {
            this.itemPrice = itemPrice;
            return this;
        }
        public java.util.List<QueryOrderDetailInnerResponseBodyModelOrderSubItemOrderListSubItemOrderItemPriceListItemPrice> getItemPrice() {
            return this.itemPrice;
        }

    }

    public static class QueryOrderDetailInnerResponseBodyModelOrderSubItemOrderListSubItemOrder extends TeaModel {
        @NameInMap("LmOrderId")
        public Long lmOrderId;

        @NameInMap("ItemPriceInfo")
        public String itemPriceInfo;

        @NameInMap("ItemTitle")
        public String itemTitle;

        @NameInMap("TbSubOrderId")
        public Long tbSubOrderId;

        @NameInMap("LmItemId")
        public String lmItemId;

        @NameInMap("TotalPaymentInfo")
        public String totalPaymentInfo;

        @NameInMap("ItemPic")
        public String itemPic;

        @NameInMap("ItemId")
        public Long itemId;

        @NameInMap("ChannelCode")
        public String channelCode;

        @NameInMap("PayStatus")
        public Integer payStatus;

        @NameInMap("SkuName")
        public String skuName;

        @NameInMap("Number")
        public Integer number;

        @NameInMap("SkuId")
        public Long skuId;

        @NameInMap("ItemPriceList")
        public QueryOrderDetailInnerResponseBodyModelOrderSubItemOrderListSubItemOrderItemPriceList itemPriceList;

        public static QueryOrderDetailInnerResponseBodyModelOrderSubItemOrderListSubItemOrder build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderDetailInnerResponseBodyModelOrderSubItemOrderListSubItemOrder self = new QueryOrderDetailInnerResponseBodyModelOrderSubItemOrderListSubItemOrder();
            return TeaModel.build(map, self);
        }

        public QueryOrderDetailInnerResponseBodyModelOrderSubItemOrderListSubItemOrder setLmOrderId(Long lmOrderId) {
            this.lmOrderId = lmOrderId;
            return this;
        }
        public Long getLmOrderId() {
            return this.lmOrderId;
        }

        public QueryOrderDetailInnerResponseBodyModelOrderSubItemOrderListSubItemOrder setItemPriceInfo(String itemPriceInfo) {
            this.itemPriceInfo = itemPriceInfo;
            return this;
        }
        public String getItemPriceInfo() {
            return this.itemPriceInfo;
        }

        public QueryOrderDetailInnerResponseBodyModelOrderSubItemOrderListSubItemOrder setItemTitle(String itemTitle) {
            this.itemTitle = itemTitle;
            return this;
        }
        public String getItemTitle() {
            return this.itemTitle;
        }

        public QueryOrderDetailInnerResponseBodyModelOrderSubItemOrderListSubItemOrder setTbSubOrderId(Long tbSubOrderId) {
            this.tbSubOrderId = tbSubOrderId;
            return this;
        }
        public Long getTbSubOrderId() {
            return this.tbSubOrderId;
        }

        public QueryOrderDetailInnerResponseBodyModelOrderSubItemOrderListSubItemOrder setLmItemId(String lmItemId) {
            this.lmItemId = lmItemId;
            return this;
        }
        public String getLmItemId() {
            return this.lmItemId;
        }

        public QueryOrderDetailInnerResponseBodyModelOrderSubItemOrderListSubItemOrder setTotalPaymentInfo(String totalPaymentInfo) {
            this.totalPaymentInfo = totalPaymentInfo;
            return this;
        }
        public String getTotalPaymentInfo() {
            return this.totalPaymentInfo;
        }

        public QueryOrderDetailInnerResponseBodyModelOrderSubItemOrderListSubItemOrder setItemPic(String itemPic) {
            this.itemPic = itemPic;
            return this;
        }
        public String getItemPic() {
            return this.itemPic;
        }

        public QueryOrderDetailInnerResponseBodyModelOrderSubItemOrderListSubItemOrder setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public QueryOrderDetailInnerResponseBodyModelOrderSubItemOrderListSubItemOrder setChannelCode(String channelCode) {
            this.channelCode = channelCode;
            return this;
        }
        public String getChannelCode() {
            return this.channelCode;
        }

        public QueryOrderDetailInnerResponseBodyModelOrderSubItemOrderListSubItemOrder setPayStatus(Integer payStatus) {
            this.payStatus = payStatus;
            return this;
        }
        public Integer getPayStatus() {
            return this.payStatus;
        }

        public QueryOrderDetailInnerResponseBodyModelOrderSubItemOrderListSubItemOrder setSkuName(String skuName) {
            this.skuName = skuName;
            return this;
        }
        public String getSkuName() {
            return this.skuName;
        }

        public QueryOrderDetailInnerResponseBodyModelOrderSubItemOrderListSubItemOrder setNumber(Integer number) {
            this.number = number;
            return this;
        }
        public Integer getNumber() {
            return this.number;
        }

        public QueryOrderDetailInnerResponseBodyModelOrderSubItemOrderListSubItemOrder setSkuId(Long skuId) {
            this.skuId = skuId;
            return this;
        }
        public Long getSkuId() {
            return this.skuId;
        }

        public QueryOrderDetailInnerResponseBodyModelOrderSubItemOrderListSubItemOrder setItemPriceList(QueryOrderDetailInnerResponseBodyModelOrderSubItemOrderListSubItemOrderItemPriceList itemPriceList) {
            this.itemPriceList = itemPriceList;
            return this;
        }
        public QueryOrderDetailInnerResponseBodyModelOrderSubItemOrderListSubItemOrderItemPriceList getItemPriceList() {
            return this.itemPriceList;
        }

    }

    public static class QueryOrderDetailInnerResponseBodyModelOrderSubItemOrderList extends TeaModel {
        @NameInMap("SubItemOrder")
        public java.util.List<QueryOrderDetailInnerResponseBodyModelOrderSubItemOrderListSubItemOrder> subItemOrder;

        public static QueryOrderDetailInnerResponseBodyModelOrderSubItemOrderList build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderDetailInnerResponseBodyModelOrderSubItemOrderList self = new QueryOrderDetailInnerResponseBodyModelOrderSubItemOrderList();
            return TeaModel.build(map, self);
        }

        public QueryOrderDetailInnerResponseBodyModelOrderSubItemOrderList setSubItemOrder(java.util.List<QueryOrderDetailInnerResponseBodyModelOrderSubItemOrderListSubItemOrder> subItemOrder) {
            this.subItemOrder = subItemOrder;
            return this;
        }
        public java.util.List<QueryOrderDetailInnerResponseBodyModelOrderSubItemOrderListSubItemOrder> getSubItemOrder() {
            return this.subItemOrder;
        }

    }

    public static class QueryOrderDetailInnerResponseBodyModelOrderFundStructureModelsFundStructure extends TeaModel {
        @NameInMap("FundAmount")
        public Long fundAmount;

        @NameInMap("LmOrderId")
        public Long lmOrderId;

        @NameInMap("FundType")
        public String fundType;

        @NameInMap("FundAmountMoney")
        public Long fundAmountMoney;

        @NameInMap("TbSubOrderId")
        public Long tbSubOrderId;

        public static QueryOrderDetailInnerResponseBodyModelOrderFundStructureModelsFundStructure build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderDetailInnerResponseBodyModelOrderFundStructureModelsFundStructure self = new QueryOrderDetailInnerResponseBodyModelOrderFundStructureModelsFundStructure();
            return TeaModel.build(map, self);
        }

        public QueryOrderDetailInnerResponseBodyModelOrderFundStructureModelsFundStructure setFundAmount(Long fundAmount) {
            this.fundAmount = fundAmount;
            return this;
        }
        public Long getFundAmount() {
            return this.fundAmount;
        }

        public QueryOrderDetailInnerResponseBodyModelOrderFundStructureModelsFundStructure setLmOrderId(Long lmOrderId) {
            this.lmOrderId = lmOrderId;
            return this;
        }
        public Long getLmOrderId() {
            return this.lmOrderId;
        }

        public QueryOrderDetailInnerResponseBodyModelOrderFundStructureModelsFundStructure setFundType(String fundType) {
            this.fundType = fundType;
            return this;
        }
        public String getFundType() {
            return this.fundType;
        }

        public QueryOrderDetailInnerResponseBodyModelOrderFundStructureModelsFundStructure setFundAmountMoney(Long fundAmountMoney) {
            this.fundAmountMoney = fundAmountMoney;
            return this;
        }
        public Long getFundAmountMoney() {
            return this.fundAmountMoney;
        }

        public QueryOrderDetailInnerResponseBodyModelOrderFundStructureModelsFundStructure setTbSubOrderId(Long tbSubOrderId) {
            this.tbSubOrderId = tbSubOrderId;
            return this;
        }
        public Long getTbSubOrderId() {
            return this.tbSubOrderId;
        }

    }

    public static class QueryOrderDetailInnerResponseBodyModelOrderFundStructureModels extends TeaModel {
        @NameInMap("FundStructure")
        public java.util.List<QueryOrderDetailInnerResponseBodyModelOrderFundStructureModelsFundStructure> fundStructure;

        public static QueryOrderDetailInnerResponseBodyModelOrderFundStructureModels build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderDetailInnerResponseBodyModelOrderFundStructureModels self = new QueryOrderDetailInnerResponseBodyModelOrderFundStructureModels();
            return TeaModel.build(map, self);
        }

        public QueryOrderDetailInnerResponseBodyModelOrderFundStructureModels setFundStructure(java.util.List<QueryOrderDetailInnerResponseBodyModelOrderFundStructureModelsFundStructure> fundStructure) {
            this.fundStructure = fundStructure;
            return this;
        }
        public java.util.List<QueryOrderDetailInnerResponseBodyModelOrderFundStructureModelsFundStructure> getFundStructure() {
            return this.fundStructure;
        }

    }

    public static class QueryOrderDetailInnerResponseBodyModelOrderPostFee extends TeaModel {
        @NameInMap("FundAmount")
        public Long fundAmount;

        @NameInMap("LmOrderId")
        public Long lmOrderId;

        @NameInMap("FundType")
        public String fundType;

        @NameInMap("FundAmountMoney")
        public Long fundAmountMoney;

        @NameInMap("TbSubOrderId")
        public Long tbSubOrderId;

        public static QueryOrderDetailInnerResponseBodyModelOrderPostFee build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderDetailInnerResponseBodyModelOrderPostFee self = new QueryOrderDetailInnerResponseBodyModelOrderPostFee();
            return TeaModel.build(map, self);
        }

        public QueryOrderDetailInnerResponseBodyModelOrderPostFee setFundAmount(Long fundAmount) {
            this.fundAmount = fundAmount;
            return this;
        }
        public Long getFundAmount() {
            return this.fundAmount;
        }

        public QueryOrderDetailInnerResponseBodyModelOrderPostFee setLmOrderId(Long lmOrderId) {
            this.lmOrderId = lmOrderId;
            return this;
        }
        public Long getLmOrderId() {
            return this.lmOrderId;
        }

        public QueryOrderDetailInnerResponseBodyModelOrderPostFee setFundType(String fundType) {
            this.fundType = fundType;
            return this;
        }
        public String getFundType() {
            return this.fundType;
        }

        public QueryOrderDetailInnerResponseBodyModelOrderPostFee setFundAmountMoney(Long fundAmountMoney) {
            this.fundAmountMoney = fundAmountMoney;
            return this;
        }
        public Long getFundAmountMoney() {
            return this.fundAmountMoney;
        }

        public QueryOrderDetailInnerResponseBodyModelOrderPostFee setTbSubOrderId(Long tbSubOrderId) {
            this.tbSubOrderId = tbSubOrderId;
            return this;
        }
        public Long getTbSubOrderId() {
            return this.tbSubOrderId;
        }

    }

    public static class QueryOrderDetailInnerResponseBodyModelOrder extends TeaModel {
        @NameInMap("Eticket")
        public Boolean eticket;

        @NameInMap("CreateDate")
        public String createDate;

        @NameInMap("LogisticsCompName")
        public String logisticsCompName;

        @NameInMap("ChannelCode")
        public String channelCode;

        @NameInMap("LogisticsMobilePhone")
        public String logisticsMobilePhone;

        @NameInMap("ResExtInfo")
        public String resExtInfo;

        @NameInMap("EnableStatus")
        public Integer enableStatus;

        @NameInMap("ChannelBizType")
        public String channelBizType;

        @NameInMap("Shipping")
        public String shipping;

        @NameInMap("OrderPayInfo")
        public String orderPayInfo;

        @NameInMap("LogisticsStatusDesc")
        public String logisticsStatusDesc;

        @NameInMap("TbOrderId")
        public String tbOrderId;

        @NameInMap("LogisticsStatus")
        public Integer logisticsStatus;

        @NameInMap("LmOrderId")
        public Long lmOrderId;

        @NameInMap("SellerId")
        public Long sellerId;

        @NameInMap("ShopName")
        public String shopName;

        @NameInMap("OrderAmount")
        public Long orderAmount;

        @NameInMap("ExtInfo")
        public java.util.Map<String, ?> extInfo;

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("PayStatus")
        public Integer payStatus;

        @NameInMap("LogisticsNo")
        public String logisticsNo;

        @NameInMap("LogisticsUserName")
        public String logisticsUserName;

        @NameInMap("LogisticsAddress")
        public String logisticsAddress;

        @NameInMap("PayWaterStatus")
        public Integer payWaterStatus;

        @NameInMap("RefundStatus")
        public Integer refundStatus;

        @NameInMap("SellerNick")
        public String sellerNick;

        @NameInMap("ChannelOrderId")
        public String channelOrderId;

        @NameInMap("SubItemOrderList")
        public QueryOrderDetailInnerResponseBodyModelOrderSubItemOrderList subItemOrderList;

        @NameInMap("FundStructureModels")
        public QueryOrderDetailInnerResponseBodyModelOrderFundStructureModels fundStructureModels;

        @NameInMap("PostFee")
        public QueryOrderDetailInnerResponseBodyModelOrderPostFee postFee;

        public static QueryOrderDetailInnerResponseBodyModelOrder build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderDetailInnerResponseBodyModelOrder self = new QueryOrderDetailInnerResponseBodyModelOrder();
            return TeaModel.build(map, self);
        }

        public QueryOrderDetailInnerResponseBodyModelOrder setEticket(Boolean eticket) {
            this.eticket = eticket;
            return this;
        }
        public Boolean getEticket() {
            return this.eticket;
        }

        public QueryOrderDetailInnerResponseBodyModelOrder setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public QueryOrderDetailInnerResponseBodyModelOrder setLogisticsCompName(String logisticsCompName) {
            this.logisticsCompName = logisticsCompName;
            return this;
        }
        public String getLogisticsCompName() {
            return this.logisticsCompName;
        }

        public QueryOrderDetailInnerResponseBodyModelOrder setChannelCode(String channelCode) {
            this.channelCode = channelCode;
            return this;
        }
        public String getChannelCode() {
            return this.channelCode;
        }

        public QueryOrderDetailInnerResponseBodyModelOrder setLogisticsMobilePhone(String logisticsMobilePhone) {
            this.logisticsMobilePhone = logisticsMobilePhone;
            return this;
        }
        public String getLogisticsMobilePhone() {
            return this.logisticsMobilePhone;
        }

        public QueryOrderDetailInnerResponseBodyModelOrder setResExtInfo(String resExtInfo) {
            this.resExtInfo = resExtInfo;
            return this;
        }
        public String getResExtInfo() {
            return this.resExtInfo;
        }

        public QueryOrderDetailInnerResponseBodyModelOrder setEnableStatus(Integer enableStatus) {
            this.enableStatus = enableStatus;
            return this;
        }
        public Integer getEnableStatus() {
            return this.enableStatus;
        }

        public QueryOrderDetailInnerResponseBodyModelOrder setChannelBizType(String channelBizType) {
            this.channelBizType = channelBizType;
            return this;
        }
        public String getChannelBizType() {
            return this.channelBizType;
        }

        public QueryOrderDetailInnerResponseBodyModelOrder setShipping(String shipping) {
            this.shipping = shipping;
            return this;
        }
        public String getShipping() {
            return this.shipping;
        }

        public QueryOrderDetailInnerResponseBodyModelOrder setOrderPayInfo(String orderPayInfo) {
            this.orderPayInfo = orderPayInfo;
            return this;
        }
        public String getOrderPayInfo() {
            return this.orderPayInfo;
        }

        public QueryOrderDetailInnerResponseBodyModelOrder setLogisticsStatusDesc(String logisticsStatusDesc) {
            this.logisticsStatusDesc = logisticsStatusDesc;
            return this;
        }
        public String getLogisticsStatusDesc() {
            return this.logisticsStatusDesc;
        }

        public QueryOrderDetailInnerResponseBodyModelOrder setTbOrderId(String tbOrderId) {
            this.tbOrderId = tbOrderId;
            return this;
        }
        public String getTbOrderId() {
            return this.tbOrderId;
        }

        public QueryOrderDetailInnerResponseBodyModelOrder setLogisticsStatus(Integer logisticsStatus) {
            this.logisticsStatus = logisticsStatus;
            return this;
        }
        public Integer getLogisticsStatus() {
            return this.logisticsStatus;
        }

        public QueryOrderDetailInnerResponseBodyModelOrder setLmOrderId(Long lmOrderId) {
            this.lmOrderId = lmOrderId;
            return this;
        }
        public Long getLmOrderId() {
            return this.lmOrderId;
        }

        public QueryOrderDetailInnerResponseBodyModelOrder setSellerId(Long sellerId) {
            this.sellerId = sellerId;
            return this;
        }
        public Long getSellerId() {
            return this.sellerId;
        }

        public QueryOrderDetailInnerResponseBodyModelOrder setShopName(String shopName) {
            this.shopName = shopName;
            return this;
        }
        public String getShopName() {
            return this.shopName;
        }

        public QueryOrderDetailInnerResponseBodyModelOrder setOrderAmount(Long orderAmount) {
            this.orderAmount = orderAmount;
            return this;
        }
        public Long getOrderAmount() {
            return this.orderAmount;
        }

        public QueryOrderDetailInnerResponseBodyModelOrder setExtInfo(java.util.Map<String, ?> extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public java.util.Map<String, ?> getExtInfo() {
            return this.extInfo;
        }

        public QueryOrderDetailInnerResponseBodyModelOrder setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public QueryOrderDetailInnerResponseBodyModelOrder setPayStatus(Integer payStatus) {
            this.payStatus = payStatus;
            return this;
        }
        public Integer getPayStatus() {
            return this.payStatus;
        }

        public QueryOrderDetailInnerResponseBodyModelOrder setLogisticsNo(String logisticsNo) {
            this.logisticsNo = logisticsNo;
            return this;
        }
        public String getLogisticsNo() {
            return this.logisticsNo;
        }

        public QueryOrderDetailInnerResponseBodyModelOrder setLogisticsUserName(String logisticsUserName) {
            this.logisticsUserName = logisticsUserName;
            return this;
        }
        public String getLogisticsUserName() {
            return this.logisticsUserName;
        }

        public QueryOrderDetailInnerResponseBodyModelOrder setLogisticsAddress(String logisticsAddress) {
            this.logisticsAddress = logisticsAddress;
            return this;
        }
        public String getLogisticsAddress() {
            return this.logisticsAddress;
        }

        public QueryOrderDetailInnerResponseBodyModelOrder setPayWaterStatus(Integer payWaterStatus) {
            this.payWaterStatus = payWaterStatus;
            return this;
        }
        public Integer getPayWaterStatus() {
            return this.payWaterStatus;
        }

        public QueryOrderDetailInnerResponseBodyModelOrder setRefundStatus(Integer refundStatus) {
            this.refundStatus = refundStatus;
            return this;
        }
        public Integer getRefundStatus() {
            return this.refundStatus;
        }

        public QueryOrderDetailInnerResponseBodyModelOrder setSellerNick(String sellerNick) {
            this.sellerNick = sellerNick;
            return this;
        }
        public String getSellerNick() {
            return this.sellerNick;
        }

        public QueryOrderDetailInnerResponseBodyModelOrder setChannelOrderId(String channelOrderId) {
            this.channelOrderId = channelOrderId;
            return this;
        }
        public String getChannelOrderId() {
            return this.channelOrderId;
        }

        public QueryOrderDetailInnerResponseBodyModelOrder setSubItemOrderList(QueryOrderDetailInnerResponseBodyModelOrderSubItemOrderList subItemOrderList) {
            this.subItemOrderList = subItemOrderList;
            return this;
        }
        public QueryOrderDetailInnerResponseBodyModelOrderSubItemOrderList getSubItemOrderList() {
            return this.subItemOrderList;
        }

        public QueryOrderDetailInnerResponseBodyModelOrder setFundStructureModels(QueryOrderDetailInnerResponseBodyModelOrderFundStructureModels fundStructureModels) {
            this.fundStructureModels = fundStructureModels;
            return this;
        }
        public QueryOrderDetailInnerResponseBodyModelOrderFundStructureModels getFundStructureModels() {
            return this.fundStructureModels;
        }

        public QueryOrderDetailInnerResponseBodyModelOrder setPostFee(QueryOrderDetailInnerResponseBodyModelOrderPostFee postFee) {
            this.postFee = postFee;
            return this;
        }
        public QueryOrderDetailInnerResponseBodyModelOrderPostFee getPostFee() {
            return this.postFee;
        }

    }

    public static class QueryOrderDetailInnerResponseBodyModel extends TeaModel {
        @NameInMap("order")
        public QueryOrderDetailInnerResponseBodyModelOrder order;

        public static QueryOrderDetailInnerResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderDetailInnerResponseBodyModel self = new QueryOrderDetailInnerResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public QueryOrderDetailInnerResponseBodyModel setOrder(QueryOrderDetailInnerResponseBodyModelOrder order) {
            this.order = order;
            return this;
        }
        public QueryOrderDetailInnerResponseBodyModelOrder getOrder() {
            return this.order;
        }

    }

}
