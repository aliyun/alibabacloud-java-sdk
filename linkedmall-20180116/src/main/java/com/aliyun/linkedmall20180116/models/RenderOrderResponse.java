// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class RenderOrderResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("SubCode")
    @Validation(required = true)
    public String subCode;

    @NameInMap("SubMessage")
    @Validation(required = true)
    public String subMessage;

    @NameInMap("LogsId")
    @Validation(required = true)
    public String logsId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Long totalCount;

    @NameInMap("Model")
    @Validation(required = true)
    public RenderOrderResponseModel model;

    public static RenderOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        RenderOrderResponse self = new RenderOrderResponse();
        return TeaModel.build(map, self);
    }

    public RenderOrderResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RenderOrderResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RenderOrderResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RenderOrderResponse setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public RenderOrderResponse setSubMessage(String subMessage) {
        this.subMessage = subMessage;
        return this;
    }
    public String getSubMessage() {
        return this.subMessage;
    }

    public RenderOrderResponse setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public RenderOrderResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public RenderOrderResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public RenderOrderResponse setModel(RenderOrderResponseModel model) {
        this.model = model;
        return this;
    }
    public RenderOrderResponseModel getModel() {
        return this.model;
    }

    public static class RenderOrderResponseModelRenderOrderInfosRenderOrderInfosLmItemInfosLmItemInfos extends TeaModel {
        @NameInMap("ItemId")
        @Validation(required = true)
        public Long itemId;

        @NameInMap("SkuId")
        @Validation(required = true)
        public Long skuId;

        @NameInMap("Quantity")
        @Validation(required = true)
        public Integer quantity;

        @NameInMap("CanSell")
        @Validation(required = true)
        public Boolean canSell;

        @NameInMap("Message")
        @Validation(required = true)
        public String message;

        @NameInMap("ItemName")
        @Validation(required = true)
        public String itemName;

        @NameInMap("SkuName")
        @Validation(required = true)
        public String skuName;

        @NameInMap("LmItemId")
        @Validation(required = true)
        public String lmItemId;

        @NameInMap("SellerId")
        @Validation(required = true)
        public Long sellerId;

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

        @NameInMap("ItemPicUrl")
        @Validation(required = true)
        public String itemPicUrl;

        public static RenderOrderResponseModelRenderOrderInfosRenderOrderInfosLmItemInfosLmItemInfos build(java.util.Map<String, ?> map) throws Exception {
            RenderOrderResponseModelRenderOrderInfosRenderOrderInfosLmItemInfosLmItemInfos self = new RenderOrderResponseModelRenderOrderInfosRenderOrderInfosLmItemInfosLmItemInfos();
            return TeaModel.build(map, self);
        }

        public RenderOrderResponseModelRenderOrderInfosRenderOrderInfosLmItemInfosLmItemInfos setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public RenderOrderResponseModelRenderOrderInfosRenderOrderInfosLmItemInfosLmItemInfos setSkuId(Long skuId) {
            this.skuId = skuId;
            return this;
        }
        public Long getSkuId() {
            return this.skuId;
        }

        public RenderOrderResponseModelRenderOrderInfosRenderOrderInfosLmItemInfosLmItemInfos setQuantity(Integer quantity) {
            this.quantity = quantity;
            return this;
        }
        public Integer getQuantity() {
            return this.quantity;
        }

        public RenderOrderResponseModelRenderOrderInfosRenderOrderInfosLmItemInfosLmItemInfos setCanSell(Boolean canSell) {
            this.canSell = canSell;
            return this;
        }
        public Boolean getCanSell() {
            return this.canSell;
        }

        public RenderOrderResponseModelRenderOrderInfosRenderOrderInfosLmItemInfosLmItemInfos setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public RenderOrderResponseModelRenderOrderInfosRenderOrderInfosLmItemInfosLmItemInfos setItemName(String itemName) {
            this.itemName = itemName;
            return this;
        }
        public String getItemName() {
            return this.itemName;
        }

        public RenderOrderResponseModelRenderOrderInfosRenderOrderInfosLmItemInfosLmItemInfos setSkuName(String skuName) {
            this.skuName = skuName;
            return this;
        }
        public String getSkuName() {
            return this.skuName;
        }

        public RenderOrderResponseModelRenderOrderInfosRenderOrderInfosLmItemInfosLmItemInfos setLmItemId(String lmItemId) {
            this.lmItemId = lmItemId;
            return this;
        }
        public String getLmItemId() {
            return this.lmItemId;
        }

        public RenderOrderResponseModelRenderOrderInfosRenderOrderInfosLmItemInfosLmItemInfos setSellerId(Long sellerId) {
            this.sellerId = sellerId;
            return this;
        }
        public Long getSellerId() {
            return this.sellerId;
        }

        public RenderOrderResponseModelRenderOrderInfosRenderOrderInfosLmItemInfosLmItemInfos setSellerNick(String sellerNick) {
            this.sellerNick = sellerNick;
            return this;
        }
        public String getSellerNick() {
            return this.sellerNick;
        }

        public RenderOrderResponseModelRenderOrderInfosRenderOrderInfosLmItemInfosLmItemInfos setCash(Long cash) {
            this.cash = cash;
            return this;
        }
        public Long getCash() {
            return this.cash;
        }

        public RenderOrderResponseModelRenderOrderInfosRenderOrderInfosLmItemInfosLmItemInfos setPoints(Long points) {
            this.points = points;
            return this;
        }
        public Long getPoints() {
            return this.points;
        }

        public RenderOrderResponseModelRenderOrderInfosRenderOrderInfosLmItemInfosLmItemInfos setActualPrice(Long actualPrice) {
            this.actualPrice = actualPrice;
            return this;
        }
        public Long getActualPrice() {
            return this.actualPrice;
        }

        public RenderOrderResponseModelRenderOrderInfosRenderOrderInfosLmItemInfosLmItemInfos setItemPicUrl(String itemPicUrl) {
            this.itemPicUrl = itemPicUrl;
            return this;
        }
        public String getItemPicUrl() {
            return this.itemPicUrl;
        }

    }

    public static class RenderOrderResponseModelRenderOrderInfosRenderOrderInfosLmItemInfos extends TeaModel {
        @NameInMap("LmItemInfos")
        @Validation(required = true)
        public java.util.List<RenderOrderResponseModelRenderOrderInfosRenderOrderInfosLmItemInfosLmItemInfos> lmItemInfos;

        public static RenderOrderResponseModelRenderOrderInfosRenderOrderInfosLmItemInfos build(java.util.Map<String, ?> map) throws Exception {
            RenderOrderResponseModelRenderOrderInfosRenderOrderInfosLmItemInfos self = new RenderOrderResponseModelRenderOrderInfosRenderOrderInfosLmItemInfos();
            return TeaModel.build(map, self);
        }

        public RenderOrderResponseModelRenderOrderInfosRenderOrderInfosLmItemInfos setLmItemInfos(java.util.List<RenderOrderResponseModelRenderOrderInfosRenderOrderInfosLmItemInfosLmItemInfos> lmItemInfos) {
            this.lmItemInfos = lmItemInfos;
            return this;
        }
        public java.util.List<RenderOrderResponseModelRenderOrderInfosRenderOrderInfosLmItemInfosLmItemInfos> getLmItemInfos() {
            return this.lmItemInfos;
        }

    }

    public static class RenderOrderResponseModelRenderOrderInfosRenderOrderInfosDeliveryInfosDeliveryInfos extends TeaModel {
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

        public static RenderOrderResponseModelRenderOrderInfosRenderOrderInfosDeliveryInfosDeliveryInfos build(java.util.Map<String, ?> map) throws Exception {
            RenderOrderResponseModelRenderOrderInfosRenderOrderInfosDeliveryInfosDeliveryInfos self = new RenderOrderResponseModelRenderOrderInfosRenderOrderInfosDeliveryInfosDeliveryInfos();
            return TeaModel.build(map, self);
        }

        public RenderOrderResponseModelRenderOrderInfosRenderOrderInfosDeliveryInfosDeliveryInfos setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public RenderOrderResponseModelRenderOrderInfosRenderOrderInfosDeliveryInfosDeliveryInfos setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public RenderOrderResponseModelRenderOrderInfosRenderOrderInfosDeliveryInfosDeliveryInfos setPostFee(Long postFee) {
            this.postFee = postFee;
            return this;
        }
        public Long getPostFee() {
            return this.postFee;
        }

        public RenderOrderResponseModelRenderOrderInfosRenderOrderInfosDeliveryInfosDeliveryInfos setServiceType(Long serviceType) {
            this.serviceType = serviceType;
            return this;
        }
        public Long getServiceType() {
            return this.serviceType;
        }

    }

    public static class RenderOrderResponseModelRenderOrderInfosRenderOrderInfosDeliveryInfos extends TeaModel {
        @NameInMap("DeliveryInfos")
        @Validation(required = true)
        public java.util.List<RenderOrderResponseModelRenderOrderInfosRenderOrderInfosDeliveryInfosDeliveryInfos> deliveryInfos;

        public static RenderOrderResponseModelRenderOrderInfosRenderOrderInfosDeliveryInfos build(java.util.Map<String, ?> map) throws Exception {
            RenderOrderResponseModelRenderOrderInfosRenderOrderInfosDeliveryInfos self = new RenderOrderResponseModelRenderOrderInfosRenderOrderInfosDeliveryInfos();
            return TeaModel.build(map, self);
        }

        public RenderOrderResponseModelRenderOrderInfosRenderOrderInfosDeliveryInfos setDeliveryInfos(java.util.List<RenderOrderResponseModelRenderOrderInfosRenderOrderInfosDeliveryInfosDeliveryInfos> deliveryInfos) {
            this.deliveryInfos = deliveryInfos;
            return this;
        }
        public java.util.List<RenderOrderResponseModelRenderOrderInfosRenderOrderInfosDeliveryInfosDeliveryInfos> getDeliveryInfos() {
            return this.deliveryInfos;
        }

    }

    public static class RenderOrderResponseModelRenderOrderInfosRenderOrderInfos extends TeaModel {
        @NameInMap("ExtInfo")
        @Validation(required = true)
        public java.util.Map<String, ?> extInfo;

        @NameInMap("LmItemInfos")
        @Validation(required = true)
        public RenderOrderResponseModelRenderOrderInfosRenderOrderInfosLmItemInfos lmItemInfos;

        @NameInMap("DeliveryInfos")
        @Validation(required = true)
        public RenderOrderResponseModelRenderOrderInfosRenderOrderInfosDeliveryInfos deliveryInfos;

        public static RenderOrderResponseModelRenderOrderInfosRenderOrderInfos build(java.util.Map<String, ?> map) throws Exception {
            RenderOrderResponseModelRenderOrderInfosRenderOrderInfos self = new RenderOrderResponseModelRenderOrderInfosRenderOrderInfos();
            return TeaModel.build(map, self);
        }

        public RenderOrderResponseModelRenderOrderInfosRenderOrderInfos setExtInfo(java.util.Map<String, ?> extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public java.util.Map<String, ?> getExtInfo() {
            return this.extInfo;
        }

        public RenderOrderResponseModelRenderOrderInfosRenderOrderInfos setLmItemInfos(RenderOrderResponseModelRenderOrderInfosRenderOrderInfosLmItemInfos lmItemInfos) {
            this.lmItemInfos = lmItemInfos;
            return this;
        }
        public RenderOrderResponseModelRenderOrderInfosRenderOrderInfosLmItemInfos getLmItemInfos() {
            return this.lmItemInfos;
        }

        public RenderOrderResponseModelRenderOrderInfosRenderOrderInfos setDeliveryInfos(RenderOrderResponseModelRenderOrderInfosRenderOrderInfosDeliveryInfos deliveryInfos) {
            this.deliveryInfos = deliveryInfos;
            return this;
        }
        public RenderOrderResponseModelRenderOrderInfosRenderOrderInfosDeliveryInfos getDeliveryInfos() {
            return this.deliveryInfos;
        }

    }

    public static class RenderOrderResponseModelRenderOrderInfos extends TeaModel {
        @NameInMap("RenderOrderInfos")
        @Validation(required = true)
        public java.util.List<RenderOrderResponseModelRenderOrderInfosRenderOrderInfos> renderOrderInfos;

        public static RenderOrderResponseModelRenderOrderInfos build(java.util.Map<String, ?> map) throws Exception {
            RenderOrderResponseModelRenderOrderInfos self = new RenderOrderResponseModelRenderOrderInfos();
            return TeaModel.build(map, self);
        }

        public RenderOrderResponseModelRenderOrderInfos setRenderOrderInfos(java.util.List<RenderOrderResponseModelRenderOrderInfosRenderOrderInfos> renderOrderInfos) {
            this.renderOrderInfos = renderOrderInfos;
            return this;
        }
        public java.util.List<RenderOrderResponseModelRenderOrderInfosRenderOrderInfos> getRenderOrderInfos() {
            return this.renderOrderInfos;
        }

    }

    public static class RenderOrderResponseModel extends TeaModel {
        @NameInMap("RenderOrderInfos")
        @Validation(required = true)
        public RenderOrderResponseModelRenderOrderInfos renderOrderInfos;

        public static RenderOrderResponseModel build(java.util.Map<String, ?> map) throws Exception {
            RenderOrderResponseModel self = new RenderOrderResponseModel();
            return TeaModel.build(map, self);
        }

        public RenderOrderResponseModel setRenderOrderInfos(RenderOrderResponseModelRenderOrderInfos renderOrderInfos) {
            this.renderOrderInfos = renderOrderInfos;
            return this;
        }
        public RenderOrderResponseModelRenderOrderInfos getRenderOrderInfos() {
            return this.renderOrderInfos;
        }

    }

}
