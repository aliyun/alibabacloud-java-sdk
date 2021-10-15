// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class RenderH5OrderResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("LogsId")
    @Validation(required = true)
    public String logsId;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("SubCode")
    @Validation(required = true)
    public String subCode;

    @NameInMap("SubMessage")
    @Validation(required = true)
    public String subMessage;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Long totalCount;

    @NameInMap("Model")
    @Validation(required = true)
    public RenderH5OrderResponseModel model;

    public static RenderH5OrderResponse build(java.util.Map<String, ?> map) throws Exception {
        RenderH5OrderResponse self = new RenderH5OrderResponse();
        return TeaModel.build(map, self);
    }

    public RenderH5OrderResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RenderH5OrderResponse setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public RenderH5OrderResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RenderH5OrderResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RenderH5OrderResponse setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public RenderH5OrderResponse setSubMessage(String subMessage) {
        this.subMessage = subMessage;
        return this;
    }
    public String getSubMessage() {
        return this.subMessage;
    }

    public RenderH5OrderResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public RenderH5OrderResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public RenderH5OrderResponse setModel(RenderH5OrderResponseModel model) {
        this.model = model;
        return this;
    }
    public RenderH5OrderResponseModel getModel() {
        return this.model;
    }

    public static class RenderH5OrderResponseModelLmItemInfoList extends TeaModel {
        @NameInMap("LmItemId")
        @Validation(required = true)
        public String lmItemId;

        @NameInMap("ItemId")
        @Validation(required = true)
        public Long itemId;

        @NameInMap("ItemName")
        @Validation(required = true)
        public String itemName;

        @NameInMap("SkuName")
        @Validation(required = true)
        public String skuName;

        @NameInMap("SkuId")
        @Validation(required = true)
        public Long skuId;

        @NameInMap("SellerId")
        @Validation(required = true)
        public Long sellerId;

        @NameInMap("TbShopName")
        @Validation(required = true)
        public String tbShopName;

        @NameInMap("SellerNick")
        @Validation(required = true)
        public String sellerNick;

        @NameInMap("Cash")
        @Validation(required = true)
        public Long cash;

        @NameInMap("Points")
        @Validation(required = true)
        public Long points;

        @NameInMap("ActualPrice")
        @Validation(required = true)
        public Long actualPrice;

        @NameInMap("Quantity")
        @Validation(required = true)
        public Integer quantity;

        @NameInMap("ItemUrl")
        @Validation(required = true)
        public String itemUrl;

        @NameInMap("ItemPicUrl")
        @Validation(required = true)
        public String itemPicUrl;

        @NameInMap("CanSell")
        @Validation(required = true)
        public Boolean canSell;

        @NameInMap("Message")
        @Validation(required = true)
        public String message;

        @NameInMap("VirtualItemType")
        @Validation(required = true)
        public String virtualItemType;

        @NameInMap("Features")
        @Validation(required = true)
        public java.util.Map<String, ?> features;

        public static RenderH5OrderResponseModelLmItemInfoList build(java.util.Map<String, ?> map) throws Exception {
            RenderH5OrderResponseModelLmItemInfoList self = new RenderH5OrderResponseModelLmItemInfoList();
            return TeaModel.build(map, self);
        }

        public RenderH5OrderResponseModelLmItemInfoList setLmItemId(String lmItemId) {
            this.lmItemId = lmItemId;
            return this;
        }
        public String getLmItemId() {
            return this.lmItemId;
        }

        public RenderH5OrderResponseModelLmItemInfoList setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public RenderH5OrderResponseModelLmItemInfoList setItemName(String itemName) {
            this.itemName = itemName;
            return this;
        }
        public String getItemName() {
            return this.itemName;
        }

        public RenderH5OrderResponseModelLmItemInfoList setSkuName(String skuName) {
            this.skuName = skuName;
            return this;
        }
        public String getSkuName() {
            return this.skuName;
        }

        public RenderH5OrderResponseModelLmItemInfoList setSkuId(Long skuId) {
            this.skuId = skuId;
            return this;
        }
        public Long getSkuId() {
            return this.skuId;
        }

        public RenderH5OrderResponseModelLmItemInfoList setSellerId(Long sellerId) {
            this.sellerId = sellerId;
            return this;
        }
        public Long getSellerId() {
            return this.sellerId;
        }

        public RenderH5OrderResponseModelLmItemInfoList setTbShopName(String tbShopName) {
            this.tbShopName = tbShopName;
            return this;
        }
        public String getTbShopName() {
            return this.tbShopName;
        }

        public RenderH5OrderResponseModelLmItemInfoList setSellerNick(String sellerNick) {
            this.sellerNick = sellerNick;
            return this;
        }
        public String getSellerNick() {
            return this.sellerNick;
        }

        public RenderH5OrderResponseModelLmItemInfoList setCash(Long cash) {
            this.cash = cash;
            return this;
        }
        public Long getCash() {
            return this.cash;
        }

        public RenderH5OrderResponseModelLmItemInfoList setPoints(Long points) {
            this.points = points;
            return this;
        }
        public Long getPoints() {
            return this.points;
        }

        public RenderH5OrderResponseModelLmItemInfoList setActualPrice(Long actualPrice) {
            this.actualPrice = actualPrice;
            return this;
        }
        public Long getActualPrice() {
            return this.actualPrice;
        }

        public RenderH5OrderResponseModelLmItemInfoList setQuantity(Integer quantity) {
            this.quantity = quantity;
            return this;
        }
        public Integer getQuantity() {
            return this.quantity;
        }

        public RenderH5OrderResponseModelLmItemInfoList setItemUrl(String itemUrl) {
            this.itemUrl = itemUrl;
            return this;
        }
        public String getItemUrl() {
            return this.itemUrl;
        }

        public RenderH5OrderResponseModelLmItemInfoList setItemPicUrl(String itemPicUrl) {
            this.itemPicUrl = itemPicUrl;
            return this;
        }
        public String getItemPicUrl() {
            return this.itemPicUrl;
        }

        public RenderH5OrderResponseModelLmItemInfoList setCanSell(Boolean canSell) {
            this.canSell = canSell;
            return this;
        }
        public Boolean getCanSell() {
            return this.canSell;
        }

        public RenderH5OrderResponseModelLmItemInfoList setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public RenderH5OrderResponseModelLmItemInfoList setVirtualItemType(String virtualItemType) {
            this.virtualItemType = virtualItemType;
            return this;
        }
        public String getVirtualItemType() {
            return this.virtualItemType;
        }

        public RenderH5OrderResponseModelLmItemInfoList setFeatures(java.util.Map<String, ?> features) {
            this.features = features;
            return this;
        }
        public java.util.Map<String, ?> getFeatures() {
            return this.features;
        }

    }

    public static class RenderH5OrderResponseModelDeliveryInfoList extends TeaModel {
        @NameInMap("Id")
        @Validation(required = true)
        public String id;

        @NameInMap("DisplayName")
        @Validation(required = true)
        public String displayName;

        @NameInMap("PostFee")
        @Validation(required = true)
        public Long postFee;

        @NameInMap("ServiceType")
        @Validation(required = true)
        public Long serviceType;

        public static RenderH5OrderResponseModelDeliveryInfoList build(java.util.Map<String, ?> map) throws Exception {
            RenderH5OrderResponseModelDeliveryInfoList self = new RenderH5OrderResponseModelDeliveryInfoList();
            return TeaModel.build(map, self);
        }

        public RenderH5OrderResponseModelDeliveryInfoList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public RenderH5OrderResponseModelDeliveryInfoList setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public RenderH5OrderResponseModelDeliveryInfoList setPostFee(Long postFee) {
            this.postFee = postFee;
            return this;
        }
        public Long getPostFee() {
            return this.postFee;
        }

        public RenderH5OrderResponseModelDeliveryInfoList setServiceType(Long serviceType) {
            this.serviceType = serviceType;
            return this;
        }
        public Long getServiceType() {
            return this.serviceType;
        }

    }

    public static class RenderH5OrderResponseModelAddressInfoList extends TeaModel {
        @NameInMap("AddressId")
        @Validation(required = true)
        public Long addressId;

        @NameInMap("Receiver")
        @Validation(required = true)
        public String receiver;

        @NameInMap("ReceiverPhone")
        @Validation(required = true)
        public String receiverPhone;

        @NameInMap("AddressDetail")
        @Validation(required = true)
        public String addressDetail;

        @NameInMap("DivisionCode")
        @Validation(required = true)
        public String divisionCode;

        @NameInMap("Default")
        @Validation(required = true)
        public Boolean _default;

        public static RenderH5OrderResponseModelAddressInfoList build(java.util.Map<String, ?> map) throws Exception {
            RenderH5OrderResponseModelAddressInfoList self = new RenderH5OrderResponseModelAddressInfoList();
            return TeaModel.build(map, self);
        }

        public RenderH5OrderResponseModelAddressInfoList setAddressId(Long addressId) {
            this.addressId = addressId;
            return this;
        }
        public Long getAddressId() {
            return this.addressId;
        }

        public RenderH5OrderResponseModelAddressInfoList setReceiver(String receiver) {
            this.receiver = receiver;
            return this;
        }
        public String getReceiver() {
            return this.receiver;
        }

        public RenderH5OrderResponseModelAddressInfoList setReceiverPhone(String receiverPhone) {
            this.receiverPhone = receiverPhone;
            return this;
        }
        public String getReceiverPhone() {
            return this.receiverPhone;
        }

        public RenderH5OrderResponseModelAddressInfoList setAddressDetail(String addressDetail) {
            this.addressDetail = addressDetail;
            return this;
        }
        public String getAddressDetail() {
            return this.addressDetail;
        }

        public RenderH5OrderResponseModelAddressInfoList setDivisionCode(String divisionCode) {
            this.divisionCode = divisionCode;
            return this;
        }
        public String getDivisionCode() {
            return this.divisionCode;
        }

        public RenderH5OrderResponseModelAddressInfoList set_default(Boolean _default) {
            this._default = _default;
            return this;
        }
        public Boolean get_default() {
            return this._default;
        }

    }

    public static class RenderH5OrderResponseModelInvoiceInfo extends TeaModel {
        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        @NameInMap("Desc")
        @Validation(required = true)
        public String desc;

        public static RenderH5OrderResponseModelInvoiceInfo build(java.util.Map<String, ?> map) throws Exception {
            RenderH5OrderResponseModelInvoiceInfo self = new RenderH5OrderResponseModelInvoiceInfo();
            return TeaModel.build(map, self);
        }

        public RenderH5OrderResponseModelInvoiceInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public RenderH5OrderResponseModelInvoiceInfo setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

    }

    public static class RenderH5OrderResponseModel extends TeaModel {
        @NameInMap("BuyerCurrentPoints")
        @Validation(required = true)
        public Long buyerCurrentPoints;

        @NameInMap("ExtInfo")
        @Validation(required = true)
        public java.util.Map<String, ?> extInfo;

        @NameInMap("LmItemInfoList")
        @Validation(required = true)
        public java.util.List<RenderH5OrderResponseModelLmItemInfoList> lmItemInfoList;

        @NameInMap("DeliveryInfoList")
        @Validation(required = true)
        public java.util.List<RenderH5OrderResponseModelDeliveryInfoList> deliveryInfoList;

        @NameInMap("AddressInfoList")
        @Validation(required = true)
        public java.util.List<RenderH5OrderResponseModelAddressInfoList> addressInfoList;

        @NameInMap("InvoiceInfo")
        @Validation(required = true)
        public RenderH5OrderResponseModelInvoiceInfo invoiceInfo;

        public static RenderH5OrderResponseModel build(java.util.Map<String, ?> map) throws Exception {
            RenderH5OrderResponseModel self = new RenderH5OrderResponseModel();
            return TeaModel.build(map, self);
        }

        public RenderH5OrderResponseModel setBuyerCurrentPoints(Long buyerCurrentPoints) {
            this.buyerCurrentPoints = buyerCurrentPoints;
            return this;
        }
        public Long getBuyerCurrentPoints() {
            return this.buyerCurrentPoints;
        }

        public RenderH5OrderResponseModel setExtInfo(java.util.Map<String, ?> extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public java.util.Map<String, ?> getExtInfo() {
            return this.extInfo;
        }

        public RenderH5OrderResponseModel setLmItemInfoList(java.util.List<RenderH5OrderResponseModelLmItemInfoList> lmItemInfoList) {
            this.lmItemInfoList = lmItemInfoList;
            return this;
        }
        public java.util.List<RenderH5OrderResponseModelLmItemInfoList> getLmItemInfoList() {
            return this.lmItemInfoList;
        }

        public RenderH5OrderResponseModel setDeliveryInfoList(java.util.List<RenderH5OrderResponseModelDeliveryInfoList> deliveryInfoList) {
            this.deliveryInfoList = deliveryInfoList;
            return this;
        }
        public java.util.List<RenderH5OrderResponseModelDeliveryInfoList> getDeliveryInfoList() {
            return this.deliveryInfoList;
        }

        public RenderH5OrderResponseModel setAddressInfoList(java.util.List<RenderH5OrderResponseModelAddressInfoList> addressInfoList) {
            this.addressInfoList = addressInfoList;
            return this;
        }
        public java.util.List<RenderH5OrderResponseModelAddressInfoList> getAddressInfoList() {
            return this.addressInfoList;
        }

        public RenderH5OrderResponseModel setInvoiceInfo(RenderH5OrderResponseModelInvoiceInfo invoiceInfo) {
            this.invoiceInfo = invoiceInfo;
            return this;
        }
        public RenderH5OrderResponseModelInvoiceInfo getInvoiceInfo() {
            return this.invoiceInfo;
        }

    }

}
