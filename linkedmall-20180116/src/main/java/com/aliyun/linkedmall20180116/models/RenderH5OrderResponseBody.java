// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class RenderH5OrderResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("SubMessage")
    public String subMessage;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("SubCode")
    public String subCode;

    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("LogsId")
    public String logsId;

    @NameInMap("Model")
    public RenderH5OrderResponseBodyModel model;

    public static RenderH5OrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RenderH5OrderResponseBody self = new RenderH5OrderResponseBody();
        return TeaModel.build(map, self);
    }

    public RenderH5OrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RenderH5OrderResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public RenderH5OrderResponseBody setSubMessage(String subMessage) {
        this.subMessage = subMessage;
        return this;
    }
    public String getSubMessage() {
        return this.subMessage;
    }

    public RenderH5OrderResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RenderH5OrderResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RenderH5OrderResponseBody setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public RenderH5OrderResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public RenderH5OrderResponseBody setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public RenderH5OrderResponseBody setModel(RenderH5OrderResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public RenderH5OrderResponseBodyModel getModel() {
        return this.model;
    }

    public static class RenderH5OrderResponseBodyModelLmItemInfoList extends TeaModel {
        @NameInMap("TbShopName")
        public String tbShopName;

        @NameInMap("SellerId")
        public Long sellerId;

        @NameInMap("LmItemId")
        public String lmItemId;

        @NameInMap("Message")
        public String message;

        @NameInMap("CanSell")
        public Boolean canSell;

        @NameInMap("Cash")
        public Long cash;

        @NameInMap("ItemId")
        public Long itemId;

        @NameInMap("VirtualItemType")
        public String virtualItemType;

        @NameInMap("ItemName")
        public String itemName;

        @NameInMap("ActualPrice")
        public Long actualPrice;

        @NameInMap("SkuName")
        public String skuName;

        @NameInMap("SkuId")
        public Long skuId;

        @NameInMap("Points")
        public Long points;

        @NameInMap("ItemUrl")
        public String itemUrl;

        @NameInMap("SellerNick")
        public String sellerNick;

        @NameInMap("Quantity")
        public Integer quantity;

        @NameInMap("Features")
        public java.util.Map<String, ?> features;

        @NameInMap("ItemPicUrl")
        public String itemPicUrl;

        public static RenderH5OrderResponseBodyModelLmItemInfoList build(java.util.Map<String, ?> map) throws Exception {
            RenderH5OrderResponseBodyModelLmItemInfoList self = new RenderH5OrderResponseBodyModelLmItemInfoList();
            return TeaModel.build(map, self);
        }

        public RenderH5OrderResponseBodyModelLmItemInfoList setTbShopName(String tbShopName) {
            this.tbShopName = tbShopName;
            return this;
        }
        public String getTbShopName() {
            return this.tbShopName;
        }

        public RenderH5OrderResponseBodyModelLmItemInfoList setSellerId(Long sellerId) {
            this.sellerId = sellerId;
            return this;
        }
        public Long getSellerId() {
            return this.sellerId;
        }

        public RenderH5OrderResponseBodyModelLmItemInfoList setLmItemId(String lmItemId) {
            this.lmItemId = lmItemId;
            return this;
        }
        public String getLmItemId() {
            return this.lmItemId;
        }

        public RenderH5OrderResponseBodyModelLmItemInfoList setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public RenderH5OrderResponseBodyModelLmItemInfoList setCanSell(Boolean canSell) {
            this.canSell = canSell;
            return this;
        }
        public Boolean getCanSell() {
            return this.canSell;
        }

        public RenderH5OrderResponseBodyModelLmItemInfoList setCash(Long cash) {
            this.cash = cash;
            return this;
        }
        public Long getCash() {
            return this.cash;
        }

        public RenderH5OrderResponseBodyModelLmItemInfoList setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public RenderH5OrderResponseBodyModelLmItemInfoList setVirtualItemType(String virtualItemType) {
            this.virtualItemType = virtualItemType;
            return this;
        }
        public String getVirtualItemType() {
            return this.virtualItemType;
        }

        public RenderH5OrderResponseBodyModelLmItemInfoList setItemName(String itemName) {
            this.itemName = itemName;
            return this;
        }
        public String getItemName() {
            return this.itemName;
        }

        public RenderH5OrderResponseBodyModelLmItemInfoList setActualPrice(Long actualPrice) {
            this.actualPrice = actualPrice;
            return this;
        }
        public Long getActualPrice() {
            return this.actualPrice;
        }

        public RenderH5OrderResponseBodyModelLmItemInfoList setSkuName(String skuName) {
            this.skuName = skuName;
            return this;
        }
        public String getSkuName() {
            return this.skuName;
        }

        public RenderH5OrderResponseBodyModelLmItemInfoList setSkuId(Long skuId) {
            this.skuId = skuId;
            return this;
        }
        public Long getSkuId() {
            return this.skuId;
        }

        public RenderH5OrderResponseBodyModelLmItemInfoList setPoints(Long points) {
            this.points = points;
            return this;
        }
        public Long getPoints() {
            return this.points;
        }

        public RenderH5OrderResponseBodyModelLmItemInfoList setItemUrl(String itemUrl) {
            this.itemUrl = itemUrl;
            return this;
        }
        public String getItemUrl() {
            return this.itemUrl;
        }

        public RenderH5OrderResponseBodyModelLmItemInfoList setSellerNick(String sellerNick) {
            this.sellerNick = sellerNick;
            return this;
        }
        public String getSellerNick() {
            return this.sellerNick;
        }

        public RenderH5OrderResponseBodyModelLmItemInfoList setQuantity(Integer quantity) {
            this.quantity = quantity;
            return this;
        }
        public Integer getQuantity() {
            return this.quantity;
        }

        public RenderH5OrderResponseBodyModelLmItemInfoList setFeatures(java.util.Map<String, ?> features) {
            this.features = features;
            return this;
        }
        public java.util.Map<String, ?> getFeatures() {
            return this.features;
        }

        public RenderH5OrderResponseBodyModelLmItemInfoList setItemPicUrl(String itemPicUrl) {
            this.itemPicUrl = itemPicUrl;
            return this;
        }
        public String getItemPicUrl() {
            return this.itemPicUrl;
        }

    }

    public static class RenderH5OrderResponseBodyModelDeliveryInfoList extends TeaModel {
        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("PostFee")
        public Long postFee;

        @NameInMap("ServiceType")
        public Long serviceType;

        @NameInMap("Id")
        public String id;

        public static RenderH5OrderResponseBodyModelDeliveryInfoList build(java.util.Map<String, ?> map) throws Exception {
            RenderH5OrderResponseBodyModelDeliveryInfoList self = new RenderH5OrderResponseBodyModelDeliveryInfoList();
            return TeaModel.build(map, self);
        }

        public RenderH5OrderResponseBodyModelDeliveryInfoList setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public RenderH5OrderResponseBodyModelDeliveryInfoList setPostFee(Long postFee) {
            this.postFee = postFee;
            return this;
        }
        public Long getPostFee() {
            return this.postFee;
        }

        public RenderH5OrderResponseBodyModelDeliveryInfoList setServiceType(Long serviceType) {
            this.serviceType = serviceType;
            return this;
        }
        public Long getServiceType() {
            return this.serviceType;
        }

        public RenderH5OrderResponseBodyModelDeliveryInfoList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class RenderH5OrderResponseBodyModelAddressInfoList extends TeaModel {
        @NameInMap("DivisionCode")
        public String divisionCode;

        @NameInMap("Receiver")
        public String receiver;

        @NameInMap("AddressDetail")
        public String addressDetail;

        @NameInMap("Default")
        public Boolean _default;

        @NameInMap("AddressId")
        public Long addressId;

        @NameInMap("ReceiverPhone")
        public String receiverPhone;

        public static RenderH5OrderResponseBodyModelAddressInfoList build(java.util.Map<String, ?> map) throws Exception {
            RenderH5OrderResponseBodyModelAddressInfoList self = new RenderH5OrderResponseBodyModelAddressInfoList();
            return TeaModel.build(map, self);
        }

        public RenderH5OrderResponseBodyModelAddressInfoList setDivisionCode(String divisionCode) {
            this.divisionCode = divisionCode;
            return this;
        }
        public String getDivisionCode() {
            return this.divisionCode;
        }

        public RenderH5OrderResponseBodyModelAddressInfoList setReceiver(String receiver) {
            this.receiver = receiver;
            return this;
        }
        public String getReceiver() {
            return this.receiver;
        }

        public RenderH5OrderResponseBodyModelAddressInfoList setAddressDetail(String addressDetail) {
            this.addressDetail = addressDetail;
            return this;
        }
        public String getAddressDetail() {
            return this.addressDetail;
        }

        public RenderH5OrderResponseBodyModelAddressInfoList set_default(Boolean _default) {
            this._default = _default;
            return this;
        }
        public Boolean get_default() {
            return this._default;
        }

        public RenderH5OrderResponseBodyModelAddressInfoList setAddressId(Long addressId) {
            this.addressId = addressId;
            return this;
        }
        public Long getAddressId() {
            return this.addressId;
        }

        public RenderH5OrderResponseBodyModelAddressInfoList setReceiverPhone(String receiverPhone) {
            this.receiverPhone = receiverPhone;
            return this;
        }
        public String getReceiverPhone() {
            return this.receiverPhone;
        }

    }

    public static class RenderH5OrderResponseBodyModelInvoiceInfo extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Desc")
        public String desc;

        public static RenderH5OrderResponseBodyModelInvoiceInfo build(java.util.Map<String, ?> map) throws Exception {
            RenderH5OrderResponseBodyModelInvoiceInfo self = new RenderH5OrderResponseBodyModelInvoiceInfo();
            return TeaModel.build(map, self);
        }

        public RenderH5OrderResponseBodyModelInvoiceInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public RenderH5OrderResponseBodyModelInvoiceInfo setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

    }

    public static class RenderH5OrderResponseBodyModel extends TeaModel {
        @NameInMap("ExtInfo")
        public java.util.Map<String, ?> extInfo;

        @NameInMap("BuyerCurrentPoints")
        public Long buyerCurrentPoints;

        @NameInMap("LmItemInfoList")
        public java.util.List<RenderH5OrderResponseBodyModelLmItemInfoList> lmItemInfoList;

        @NameInMap("DeliveryInfoList")
        public java.util.List<RenderH5OrderResponseBodyModelDeliveryInfoList> deliveryInfoList;

        @NameInMap("AddressInfoList")
        public java.util.List<RenderH5OrderResponseBodyModelAddressInfoList> addressInfoList;

        @NameInMap("InvoiceInfo")
        public RenderH5OrderResponseBodyModelInvoiceInfo invoiceInfo;

        public static RenderH5OrderResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            RenderH5OrderResponseBodyModel self = new RenderH5OrderResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public RenderH5OrderResponseBodyModel setExtInfo(java.util.Map<String, ?> extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public java.util.Map<String, ?> getExtInfo() {
            return this.extInfo;
        }

        public RenderH5OrderResponseBodyModel setBuyerCurrentPoints(Long buyerCurrentPoints) {
            this.buyerCurrentPoints = buyerCurrentPoints;
            return this;
        }
        public Long getBuyerCurrentPoints() {
            return this.buyerCurrentPoints;
        }

        public RenderH5OrderResponseBodyModel setLmItemInfoList(java.util.List<RenderH5OrderResponseBodyModelLmItemInfoList> lmItemInfoList) {
            this.lmItemInfoList = lmItemInfoList;
            return this;
        }
        public java.util.List<RenderH5OrderResponseBodyModelLmItemInfoList> getLmItemInfoList() {
            return this.lmItemInfoList;
        }

        public RenderH5OrderResponseBodyModel setDeliveryInfoList(java.util.List<RenderH5OrderResponseBodyModelDeliveryInfoList> deliveryInfoList) {
            this.deliveryInfoList = deliveryInfoList;
            return this;
        }
        public java.util.List<RenderH5OrderResponseBodyModelDeliveryInfoList> getDeliveryInfoList() {
            return this.deliveryInfoList;
        }

        public RenderH5OrderResponseBodyModel setAddressInfoList(java.util.List<RenderH5OrderResponseBodyModelAddressInfoList> addressInfoList) {
            this.addressInfoList = addressInfoList;
            return this;
        }
        public java.util.List<RenderH5OrderResponseBodyModelAddressInfoList> getAddressInfoList() {
            return this.addressInfoList;
        }

        public RenderH5OrderResponseBodyModel setInvoiceInfo(RenderH5OrderResponseBodyModelInvoiceInfo invoiceInfo) {
            this.invoiceInfo = invoiceInfo;
            return this;
        }
        public RenderH5OrderResponseBodyModelInvoiceInfo getInvoiceInfo() {
            return this.invoiceInfo;
        }

    }

}
