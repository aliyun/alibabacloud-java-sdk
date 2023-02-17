// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class RenderDistributionOrderResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("LogsId")
    public String logsId;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public RenderDistributionOrderResponseBodyModel model;

    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>pageSize</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SubCode")
    public String subCode;

    @NameInMap("SubMessage")
    public String subMessage;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static RenderDistributionOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RenderDistributionOrderResponseBody self = new RenderDistributionOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public RenderDistributionOrderResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RenderDistributionOrderResponseBody setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public RenderDistributionOrderResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RenderDistributionOrderResponseBody setModel(RenderDistributionOrderResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public RenderDistributionOrderResponseBodyModel getModel() {
        return this.model;
    }

    public RenderDistributionOrderResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public RenderDistributionOrderResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public RenderDistributionOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RenderDistributionOrderResponseBody setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public RenderDistributionOrderResponseBody setSubMessage(String subMessage) {
        this.subMessage = subMessage;
        return this;
    }
    public String getSubMessage() {
        return this.subMessage;
    }

    public RenderDistributionOrderResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public RenderDistributionOrderResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class RenderDistributionOrderResponseBodyModelAddressInfos extends TeaModel {
        @NameInMap("AddressDetail")
        public String addressDetail;

        @NameInMap("AddressId")
        public Long addressId;

        @NameInMap("DivisionCode")
        public String divisionCode;

        @NameInMap("IsDefault")
        public Boolean isDefault;

        @NameInMap("Receiver")
        public String receiver;

        @NameInMap("ReceiverPhone")
        public String receiverPhone;

        @NameInMap("TownDivisionCode")
        public String townDivisionCode;

        public static RenderDistributionOrderResponseBodyModelAddressInfos build(java.util.Map<String, ?> map) throws Exception {
            RenderDistributionOrderResponseBodyModelAddressInfos self = new RenderDistributionOrderResponseBodyModelAddressInfos();
            return TeaModel.build(map, self);
        }

        public RenderDistributionOrderResponseBodyModelAddressInfos setAddressDetail(String addressDetail) {
            this.addressDetail = addressDetail;
            return this;
        }
        public String getAddressDetail() {
            return this.addressDetail;
        }

        public RenderDistributionOrderResponseBodyModelAddressInfos setAddressId(Long addressId) {
            this.addressId = addressId;
            return this;
        }
        public Long getAddressId() {
            return this.addressId;
        }

        public RenderDistributionOrderResponseBodyModelAddressInfos setDivisionCode(String divisionCode) {
            this.divisionCode = divisionCode;
            return this;
        }
        public String getDivisionCode() {
            return this.divisionCode;
        }

        public RenderDistributionOrderResponseBodyModelAddressInfos setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public RenderDistributionOrderResponseBodyModelAddressInfos setReceiver(String receiver) {
            this.receiver = receiver;
            return this;
        }
        public String getReceiver() {
            return this.receiver;
        }

        public RenderDistributionOrderResponseBodyModelAddressInfos setReceiverPhone(String receiverPhone) {
            this.receiverPhone = receiverPhone;
            return this;
        }
        public String getReceiverPhone() {
            return this.receiverPhone;
        }

        public RenderDistributionOrderResponseBodyModelAddressInfos setTownDivisionCode(String townDivisionCode) {
            this.townDivisionCode = townDivisionCode;
            return this;
        }
        public String getTownDivisionCode() {
            return this.townDivisionCode;
        }

    }

    public static class RenderDistributionOrderResponseBodyModelRenderOrderInfosDeliveryInfos extends TeaModel {
        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("Id")
        public String id;

        @NameInMap("PostFee")
        public Long postFee;

        @NameInMap("ServiceType")
        public Long serviceType;

        public static RenderDistributionOrderResponseBodyModelRenderOrderInfosDeliveryInfos build(java.util.Map<String, ?> map) throws Exception {
            RenderDistributionOrderResponseBodyModelRenderOrderInfosDeliveryInfos self = new RenderDistributionOrderResponseBodyModelRenderOrderInfosDeliveryInfos();
            return TeaModel.build(map, self);
        }

        public RenderDistributionOrderResponseBodyModelRenderOrderInfosDeliveryInfos setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public RenderDistributionOrderResponseBodyModelRenderOrderInfosDeliveryInfos setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public RenderDistributionOrderResponseBodyModelRenderOrderInfosDeliveryInfos setPostFee(Long postFee) {
            this.postFee = postFee;
            return this;
        }
        public Long getPostFee() {
            return this.postFee;
        }

        public RenderDistributionOrderResponseBodyModelRenderOrderInfosDeliveryInfos setServiceType(Long serviceType) {
            this.serviceType = serviceType;
            return this;
        }
        public Long getServiceType() {
            return this.serviceType;
        }

    }

    public static class RenderDistributionOrderResponseBodyModelRenderOrderInfosInvoiceInfo extends TeaModel {
        @NameInMap("Desc")
        public String desc;

        @NameInMap("Type")
        public String type;

        public static RenderDistributionOrderResponseBodyModelRenderOrderInfosInvoiceInfo build(java.util.Map<String, ?> map) throws Exception {
            RenderDistributionOrderResponseBodyModelRenderOrderInfosInvoiceInfo self = new RenderDistributionOrderResponseBodyModelRenderOrderInfosInvoiceInfo();
            return TeaModel.build(map, self);
        }

        public RenderDistributionOrderResponseBodyModelRenderOrderInfosInvoiceInfo setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public RenderDistributionOrderResponseBodyModelRenderOrderInfosInvoiceInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class RenderDistributionOrderResponseBodyModelRenderOrderInfosItemInfosItemPromInstVOSAvailableItems extends TeaModel {
        @NameInMap("ItemId")
        public Long itemId;

        @NameInMap("LmItemId")
        public String lmItemId;

        @NameInMap("LmShopId")
        public Long lmShopId;

        @NameInMap("Number")
        public Integer number;

        @NameInMap("Points")
        public Long points;

        @NameInMap("PointsAmount")
        public Long pointsAmount;

        @NameInMap("PriceCent")
        public Long priceCent;

        @NameInMap("Removed")
        public Boolean removed;

        @NameInMap("SkuId")
        public Long skuId;

        @NameInMap("TbSellerId")
        public Long tbSellerId;

        @NameInMap("UserPayFee")
        public Long userPayFee;

        public static RenderDistributionOrderResponseBodyModelRenderOrderInfosItemInfosItemPromInstVOSAvailableItems build(java.util.Map<String, ?> map) throws Exception {
            RenderDistributionOrderResponseBodyModelRenderOrderInfosItemInfosItemPromInstVOSAvailableItems self = new RenderDistributionOrderResponseBodyModelRenderOrderInfosItemInfosItemPromInstVOSAvailableItems();
            return TeaModel.build(map, self);
        }

        public RenderDistributionOrderResponseBodyModelRenderOrderInfosItemInfosItemPromInstVOSAvailableItems setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public RenderDistributionOrderResponseBodyModelRenderOrderInfosItemInfosItemPromInstVOSAvailableItems setLmItemId(String lmItemId) {
            this.lmItemId = lmItemId;
            return this;
        }
        public String getLmItemId() {
            return this.lmItemId;
        }

        public RenderDistributionOrderResponseBodyModelRenderOrderInfosItemInfosItemPromInstVOSAvailableItems setLmShopId(Long lmShopId) {
            this.lmShopId = lmShopId;
            return this;
        }
        public Long getLmShopId() {
            return this.lmShopId;
        }

        public RenderDistributionOrderResponseBodyModelRenderOrderInfosItemInfosItemPromInstVOSAvailableItems setNumber(Integer number) {
            this.number = number;
            return this;
        }
        public Integer getNumber() {
            return this.number;
        }

        public RenderDistributionOrderResponseBodyModelRenderOrderInfosItemInfosItemPromInstVOSAvailableItems setPoints(Long points) {
            this.points = points;
            return this;
        }
        public Long getPoints() {
            return this.points;
        }

        public RenderDistributionOrderResponseBodyModelRenderOrderInfosItemInfosItemPromInstVOSAvailableItems setPointsAmount(Long pointsAmount) {
            this.pointsAmount = pointsAmount;
            return this;
        }
        public Long getPointsAmount() {
            return this.pointsAmount;
        }

        public RenderDistributionOrderResponseBodyModelRenderOrderInfosItemInfosItemPromInstVOSAvailableItems setPriceCent(Long priceCent) {
            this.priceCent = priceCent;
            return this;
        }
        public Long getPriceCent() {
            return this.priceCent;
        }

        public RenderDistributionOrderResponseBodyModelRenderOrderInfosItemInfosItemPromInstVOSAvailableItems setRemoved(Boolean removed) {
            this.removed = removed;
            return this;
        }
        public Boolean getRemoved() {
            return this.removed;
        }

        public RenderDistributionOrderResponseBodyModelRenderOrderInfosItemInfosItemPromInstVOSAvailableItems setSkuId(Long skuId) {
            this.skuId = skuId;
            return this;
        }
        public Long getSkuId() {
            return this.skuId;
        }

        public RenderDistributionOrderResponseBodyModelRenderOrderInfosItemInfosItemPromInstVOSAvailableItems setTbSellerId(Long tbSellerId) {
            this.tbSellerId = tbSellerId;
            return this;
        }
        public Long getTbSellerId() {
            return this.tbSellerId;
        }

        public RenderDistributionOrderResponseBodyModelRenderOrderInfosItemInfosItemPromInstVOSAvailableItems setUserPayFee(Long userPayFee) {
            this.userPayFee = userPayFee;
            return this;
        }
        public Long getUserPayFee() {
            return this.userPayFee;
        }

    }

    public static class RenderDistributionOrderResponseBodyModelRenderOrderInfosItemInfosItemPromInstVOS extends TeaModel {
        @NameInMap("AvailableItems")
        public java.util.List<RenderDistributionOrderResponseBodyModelRenderOrderInfosItemInfosItemPromInstVOSAvailableItems> availableItems;

        @NameInMap("CanUse")
        public Boolean canUse;

        @NameInMap("DiscountPrice")
        public Long discountPrice;

        @NameInMap("ExpireTime")
        public Long expireTime;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Level")
        public String level;

        @NameInMap("LmItemId")
        public String lmItemId;

        @NameInMap("PromotionName")
        public String promotionName;

        @NameInMap("PromotionType")
        public String promotionType;

        @NameInMap("Reason")
        public String reason;

        @NameInMap("Selected")
        public Boolean selected;

        @NameInMap("SkuIds")
        public java.util.List<Long> skuIds;

        @NameInMap("SpecialPrice")
        public Long specialPrice;

        @NameInMap("SubBizCode")
        public String subBizCode;

        @NameInMap("TbSellerId")
        public Long tbSellerId;

        @NameInMap("ThresholdPrice")
        public Long thresholdPrice;

        @NameInMap("UseStartTime")
        public Long useStartTime;

        public static RenderDistributionOrderResponseBodyModelRenderOrderInfosItemInfosItemPromInstVOS build(java.util.Map<String, ?> map) throws Exception {
            RenderDistributionOrderResponseBodyModelRenderOrderInfosItemInfosItemPromInstVOS self = new RenderDistributionOrderResponseBodyModelRenderOrderInfosItemInfosItemPromInstVOS();
            return TeaModel.build(map, self);
        }

        public RenderDistributionOrderResponseBodyModelRenderOrderInfosItemInfosItemPromInstVOS setAvailableItems(java.util.List<RenderDistributionOrderResponseBodyModelRenderOrderInfosItemInfosItemPromInstVOSAvailableItems> availableItems) {
            this.availableItems = availableItems;
            return this;
        }
        public java.util.List<RenderDistributionOrderResponseBodyModelRenderOrderInfosItemInfosItemPromInstVOSAvailableItems> getAvailableItems() {
            return this.availableItems;
        }

        public RenderDistributionOrderResponseBodyModelRenderOrderInfosItemInfosItemPromInstVOS setCanUse(Boolean canUse) {
            this.canUse = canUse;
            return this;
        }
        public Boolean getCanUse() {
            return this.canUse;
        }

        public RenderDistributionOrderResponseBodyModelRenderOrderInfosItemInfosItemPromInstVOS setDiscountPrice(Long discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public Long getDiscountPrice() {
            return this.discountPrice;
        }

        public RenderDistributionOrderResponseBodyModelRenderOrderInfosItemInfosItemPromInstVOS setExpireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Long getExpireTime() {
            return this.expireTime;
        }

        public RenderDistributionOrderResponseBodyModelRenderOrderInfosItemInfosItemPromInstVOS setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public RenderDistributionOrderResponseBodyModelRenderOrderInfosItemInfosItemPromInstVOS setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public RenderDistributionOrderResponseBodyModelRenderOrderInfosItemInfosItemPromInstVOS setLmItemId(String lmItemId) {
            this.lmItemId = lmItemId;
            return this;
        }
        public String getLmItemId() {
            return this.lmItemId;
        }

        public RenderDistributionOrderResponseBodyModelRenderOrderInfosItemInfosItemPromInstVOS setPromotionName(String promotionName) {
            this.promotionName = promotionName;
            return this;
        }
        public String getPromotionName() {
            return this.promotionName;
        }

        public RenderDistributionOrderResponseBodyModelRenderOrderInfosItemInfosItemPromInstVOS setPromotionType(String promotionType) {
            this.promotionType = promotionType;
            return this;
        }
        public String getPromotionType() {
            return this.promotionType;
        }

        public RenderDistributionOrderResponseBodyModelRenderOrderInfosItemInfosItemPromInstVOS setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public RenderDistributionOrderResponseBodyModelRenderOrderInfosItemInfosItemPromInstVOS setSelected(Boolean selected) {
            this.selected = selected;
            return this;
        }
        public Boolean getSelected() {
            return this.selected;
        }

        public RenderDistributionOrderResponseBodyModelRenderOrderInfosItemInfosItemPromInstVOS setSkuIds(java.util.List<Long> skuIds) {
            this.skuIds = skuIds;
            return this;
        }
        public java.util.List<Long> getSkuIds() {
            return this.skuIds;
        }

        public RenderDistributionOrderResponseBodyModelRenderOrderInfosItemInfosItemPromInstVOS setSpecialPrice(Long specialPrice) {
            this.specialPrice = specialPrice;
            return this;
        }
        public Long getSpecialPrice() {
            return this.specialPrice;
        }

        public RenderDistributionOrderResponseBodyModelRenderOrderInfosItemInfosItemPromInstVOS setSubBizCode(String subBizCode) {
            this.subBizCode = subBizCode;
            return this;
        }
        public String getSubBizCode() {
            return this.subBizCode;
        }

        public RenderDistributionOrderResponseBodyModelRenderOrderInfosItemInfosItemPromInstVOS setTbSellerId(Long tbSellerId) {
            this.tbSellerId = tbSellerId;
            return this;
        }
        public Long getTbSellerId() {
            return this.tbSellerId;
        }

        public RenderDistributionOrderResponseBodyModelRenderOrderInfosItemInfosItemPromInstVOS setThresholdPrice(Long thresholdPrice) {
            this.thresholdPrice = thresholdPrice;
            return this;
        }
        public Long getThresholdPrice() {
            return this.thresholdPrice;
        }

        public RenderDistributionOrderResponseBodyModelRenderOrderInfosItemInfosItemPromInstVOS setUseStartTime(Long useStartTime) {
            this.useStartTime = useStartTime;
            return this;
        }
        public Long getUseStartTime() {
            return this.useStartTime;
        }

    }

    public static class RenderDistributionOrderResponseBodyModelRenderOrderInfosItemInfos extends TeaModel {
        @NameInMap("CanSell")
        public Boolean canSell;

        @NameInMap("DistributionMallId")
        public String distributionMallId;

        @NameInMap("DistributionSupplierId")
        public String distributionSupplierId;

        @NameInMap("DistributorId")
        public String distributorId;

        @NameInMap("Features")
        public java.util.Map<String, String> features;

        @NameInMap("ItemId")
        public String itemId;

        @NameInMap("ItemName")
        public String itemName;

        @NameInMap("ItemPicUrl")
        public String itemPicUrl;

        @NameInMap("ItemPromInstVOS")
        public java.util.List<RenderDistributionOrderResponseBodyModelRenderOrderInfosItemInfosItemPromInstVOS> itemPromInstVOS;

        @NameInMap("ItemUrl")
        public String itemUrl;

        @NameInMap("Message")
        public String message;

        @NameInMap("Price")
        public Long price;

        @NameInMap("PromotionFee")
        public Long promotionFee;

        @NameInMap("Quantity")
        public Integer quantity;

        @NameInMap("ReservePrice")
        public Long reservePrice;

        @NameInMap("SkuId")
        public Long skuId;

        @NameInMap("SkuName")
        public String skuName;

        @NameInMap("VirtualItemType")
        public String virtualItemType;

        public static RenderDistributionOrderResponseBodyModelRenderOrderInfosItemInfos build(java.util.Map<String, ?> map) throws Exception {
            RenderDistributionOrderResponseBodyModelRenderOrderInfosItemInfos self = new RenderDistributionOrderResponseBodyModelRenderOrderInfosItemInfos();
            return TeaModel.build(map, self);
        }

        public RenderDistributionOrderResponseBodyModelRenderOrderInfosItemInfos setCanSell(Boolean canSell) {
            this.canSell = canSell;
            return this;
        }
        public Boolean getCanSell() {
            return this.canSell;
        }

        public RenderDistributionOrderResponseBodyModelRenderOrderInfosItemInfos setDistributionMallId(String distributionMallId) {
            this.distributionMallId = distributionMallId;
            return this;
        }
        public String getDistributionMallId() {
            return this.distributionMallId;
        }

        public RenderDistributionOrderResponseBodyModelRenderOrderInfosItemInfos setDistributionSupplierId(String distributionSupplierId) {
            this.distributionSupplierId = distributionSupplierId;
            return this;
        }
        public String getDistributionSupplierId() {
            return this.distributionSupplierId;
        }

        public RenderDistributionOrderResponseBodyModelRenderOrderInfosItemInfos setDistributorId(String distributorId) {
            this.distributorId = distributorId;
            return this;
        }
        public String getDistributorId() {
            return this.distributorId;
        }

        public RenderDistributionOrderResponseBodyModelRenderOrderInfosItemInfos setFeatures(java.util.Map<String, String> features) {
            this.features = features;
            return this;
        }
        public java.util.Map<String, String> getFeatures() {
            return this.features;
        }

        public RenderDistributionOrderResponseBodyModelRenderOrderInfosItemInfos setItemId(String itemId) {
            this.itemId = itemId;
            return this;
        }
        public String getItemId() {
            return this.itemId;
        }

        public RenderDistributionOrderResponseBodyModelRenderOrderInfosItemInfos setItemName(String itemName) {
            this.itemName = itemName;
            return this;
        }
        public String getItemName() {
            return this.itemName;
        }

        public RenderDistributionOrderResponseBodyModelRenderOrderInfosItemInfos setItemPicUrl(String itemPicUrl) {
            this.itemPicUrl = itemPicUrl;
            return this;
        }
        public String getItemPicUrl() {
            return this.itemPicUrl;
        }

        public RenderDistributionOrderResponseBodyModelRenderOrderInfosItemInfos setItemPromInstVOS(java.util.List<RenderDistributionOrderResponseBodyModelRenderOrderInfosItemInfosItemPromInstVOS> itemPromInstVOS) {
            this.itemPromInstVOS = itemPromInstVOS;
            return this;
        }
        public java.util.List<RenderDistributionOrderResponseBodyModelRenderOrderInfosItemInfosItemPromInstVOS> getItemPromInstVOS() {
            return this.itemPromInstVOS;
        }

        public RenderDistributionOrderResponseBodyModelRenderOrderInfosItemInfos setItemUrl(String itemUrl) {
            this.itemUrl = itemUrl;
            return this;
        }
        public String getItemUrl() {
            return this.itemUrl;
        }

        public RenderDistributionOrderResponseBodyModelRenderOrderInfosItemInfos setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public RenderDistributionOrderResponseBodyModelRenderOrderInfosItemInfos setPrice(Long price) {
            this.price = price;
            return this;
        }
        public Long getPrice() {
            return this.price;
        }

        public RenderDistributionOrderResponseBodyModelRenderOrderInfosItemInfos setPromotionFee(Long promotionFee) {
            this.promotionFee = promotionFee;
            return this;
        }
        public Long getPromotionFee() {
            return this.promotionFee;
        }

        public RenderDistributionOrderResponseBodyModelRenderOrderInfosItemInfos setQuantity(Integer quantity) {
            this.quantity = quantity;
            return this;
        }
        public Integer getQuantity() {
            return this.quantity;
        }

        public RenderDistributionOrderResponseBodyModelRenderOrderInfosItemInfos setReservePrice(Long reservePrice) {
            this.reservePrice = reservePrice;
            return this;
        }
        public Long getReservePrice() {
            return this.reservePrice;
        }

        public RenderDistributionOrderResponseBodyModelRenderOrderInfosItemInfos setSkuId(Long skuId) {
            this.skuId = skuId;
            return this;
        }
        public Long getSkuId() {
            return this.skuId;
        }

        public RenderDistributionOrderResponseBodyModelRenderOrderInfosItemInfos setSkuName(String skuName) {
            this.skuName = skuName;
            return this;
        }
        public String getSkuName() {
            return this.skuName;
        }

        public RenderDistributionOrderResponseBodyModelRenderOrderInfosItemInfos setVirtualItemType(String virtualItemType) {
            this.virtualItemType = virtualItemType;
            return this;
        }
        public String getVirtualItemType() {
            return this.virtualItemType;
        }

    }

    public static class RenderDistributionOrderResponseBodyModelRenderOrderInfosShopPromInstVOSAvailableItems extends TeaModel {
        @NameInMap("ItemId")
        public Long itemId;

        @NameInMap("LmItemId")
        public String lmItemId;

        @NameInMap("LmShopId")
        public Long lmShopId;

        @NameInMap("Number")
        public Integer number;

        @NameInMap("Points")
        public Long points;

        @NameInMap("PointsAmount")
        public Long pointsAmount;

        @NameInMap("PriceCent")
        public Long priceCent;

        @NameInMap("Removed")
        public Boolean removed;

        @NameInMap("SkuId")
        public Long skuId;

        @NameInMap("TbSellerId")
        public Long tbSellerId;

        @NameInMap("UserPayFee")
        public Long userPayFee;

        public static RenderDistributionOrderResponseBodyModelRenderOrderInfosShopPromInstVOSAvailableItems build(java.util.Map<String, ?> map) throws Exception {
            RenderDistributionOrderResponseBodyModelRenderOrderInfosShopPromInstVOSAvailableItems self = new RenderDistributionOrderResponseBodyModelRenderOrderInfosShopPromInstVOSAvailableItems();
            return TeaModel.build(map, self);
        }

        public RenderDistributionOrderResponseBodyModelRenderOrderInfosShopPromInstVOSAvailableItems setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public RenderDistributionOrderResponseBodyModelRenderOrderInfosShopPromInstVOSAvailableItems setLmItemId(String lmItemId) {
            this.lmItemId = lmItemId;
            return this;
        }
        public String getLmItemId() {
            return this.lmItemId;
        }

        public RenderDistributionOrderResponseBodyModelRenderOrderInfosShopPromInstVOSAvailableItems setLmShopId(Long lmShopId) {
            this.lmShopId = lmShopId;
            return this;
        }
        public Long getLmShopId() {
            return this.lmShopId;
        }

        public RenderDistributionOrderResponseBodyModelRenderOrderInfosShopPromInstVOSAvailableItems setNumber(Integer number) {
            this.number = number;
            return this;
        }
        public Integer getNumber() {
            return this.number;
        }

        public RenderDistributionOrderResponseBodyModelRenderOrderInfosShopPromInstVOSAvailableItems setPoints(Long points) {
            this.points = points;
            return this;
        }
        public Long getPoints() {
            return this.points;
        }

        public RenderDistributionOrderResponseBodyModelRenderOrderInfosShopPromInstVOSAvailableItems setPointsAmount(Long pointsAmount) {
            this.pointsAmount = pointsAmount;
            return this;
        }
        public Long getPointsAmount() {
            return this.pointsAmount;
        }

        public RenderDistributionOrderResponseBodyModelRenderOrderInfosShopPromInstVOSAvailableItems setPriceCent(Long priceCent) {
            this.priceCent = priceCent;
            return this;
        }
        public Long getPriceCent() {
            return this.priceCent;
        }

        public RenderDistributionOrderResponseBodyModelRenderOrderInfosShopPromInstVOSAvailableItems setRemoved(Boolean removed) {
            this.removed = removed;
            return this;
        }
        public Boolean getRemoved() {
            return this.removed;
        }

        public RenderDistributionOrderResponseBodyModelRenderOrderInfosShopPromInstVOSAvailableItems setSkuId(Long skuId) {
            this.skuId = skuId;
            return this;
        }
        public Long getSkuId() {
            return this.skuId;
        }

        public RenderDistributionOrderResponseBodyModelRenderOrderInfosShopPromInstVOSAvailableItems setTbSellerId(Long tbSellerId) {
            this.tbSellerId = tbSellerId;
            return this;
        }
        public Long getTbSellerId() {
            return this.tbSellerId;
        }

        public RenderDistributionOrderResponseBodyModelRenderOrderInfosShopPromInstVOSAvailableItems setUserPayFee(Long userPayFee) {
            this.userPayFee = userPayFee;
            return this;
        }
        public Long getUserPayFee() {
            return this.userPayFee;
        }

    }

    public static class RenderDistributionOrderResponseBodyModelRenderOrderInfosShopPromInstVOS extends TeaModel {
        @NameInMap("AvailableItems")
        public java.util.List<RenderDistributionOrderResponseBodyModelRenderOrderInfosShopPromInstVOSAvailableItems> availableItems;

        @NameInMap("CanUse")
        public Boolean canUse;

        @NameInMap("DiscountPrice")
        public Long discountPrice;

        @NameInMap("ExpireTime")
        public Long expireTime;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Level")
        public String level;

        @NameInMap("LmItemId")
        public String lmItemId;

        @NameInMap("PromotionName")
        public String promotionName;

        @NameInMap("PromotionType")
        public String promotionType;

        @NameInMap("Reason")
        public String reason;

        @NameInMap("Selected")
        public Boolean selected;

        @NameInMap("SkuIds")
        public java.util.List<Long> skuIds;

        @NameInMap("SpecialPrice")
        public Long specialPrice;

        @NameInMap("SubBizCode")
        public String subBizCode;

        @NameInMap("TbSellerId")
        public Long tbSellerId;

        @NameInMap("ThresholdPrice")
        public Long thresholdPrice;

        @NameInMap("UseStartTime")
        public Long useStartTime;

        public static RenderDistributionOrderResponseBodyModelRenderOrderInfosShopPromInstVOS build(java.util.Map<String, ?> map) throws Exception {
            RenderDistributionOrderResponseBodyModelRenderOrderInfosShopPromInstVOS self = new RenderDistributionOrderResponseBodyModelRenderOrderInfosShopPromInstVOS();
            return TeaModel.build(map, self);
        }

        public RenderDistributionOrderResponseBodyModelRenderOrderInfosShopPromInstVOS setAvailableItems(java.util.List<RenderDistributionOrderResponseBodyModelRenderOrderInfosShopPromInstVOSAvailableItems> availableItems) {
            this.availableItems = availableItems;
            return this;
        }
        public java.util.List<RenderDistributionOrderResponseBodyModelRenderOrderInfosShopPromInstVOSAvailableItems> getAvailableItems() {
            return this.availableItems;
        }

        public RenderDistributionOrderResponseBodyModelRenderOrderInfosShopPromInstVOS setCanUse(Boolean canUse) {
            this.canUse = canUse;
            return this;
        }
        public Boolean getCanUse() {
            return this.canUse;
        }

        public RenderDistributionOrderResponseBodyModelRenderOrderInfosShopPromInstVOS setDiscountPrice(Long discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public Long getDiscountPrice() {
            return this.discountPrice;
        }

        public RenderDistributionOrderResponseBodyModelRenderOrderInfosShopPromInstVOS setExpireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Long getExpireTime() {
            return this.expireTime;
        }

        public RenderDistributionOrderResponseBodyModelRenderOrderInfosShopPromInstVOS setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public RenderDistributionOrderResponseBodyModelRenderOrderInfosShopPromInstVOS setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public RenderDistributionOrderResponseBodyModelRenderOrderInfosShopPromInstVOS setLmItemId(String lmItemId) {
            this.lmItemId = lmItemId;
            return this;
        }
        public String getLmItemId() {
            return this.lmItemId;
        }

        public RenderDistributionOrderResponseBodyModelRenderOrderInfosShopPromInstVOS setPromotionName(String promotionName) {
            this.promotionName = promotionName;
            return this;
        }
        public String getPromotionName() {
            return this.promotionName;
        }

        public RenderDistributionOrderResponseBodyModelRenderOrderInfosShopPromInstVOS setPromotionType(String promotionType) {
            this.promotionType = promotionType;
            return this;
        }
        public String getPromotionType() {
            return this.promotionType;
        }

        public RenderDistributionOrderResponseBodyModelRenderOrderInfosShopPromInstVOS setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public RenderDistributionOrderResponseBodyModelRenderOrderInfosShopPromInstVOS setSelected(Boolean selected) {
            this.selected = selected;
            return this;
        }
        public Boolean getSelected() {
            return this.selected;
        }

        public RenderDistributionOrderResponseBodyModelRenderOrderInfosShopPromInstVOS setSkuIds(java.util.List<Long> skuIds) {
            this.skuIds = skuIds;
            return this;
        }
        public java.util.List<Long> getSkuIds() {
            return this.skuIds;
        }

        public RenderDistributionOrderResponseBodyModelRenderOrderInfosShopPromInstVOS setSpecialPrice(Long specialPrice) {
            this.specialPrice = specialPrice;
            return this;
        }
        public Long getSpecialPrice() {
            return this.specialPrice;
        }

        public RenderDistributionOrderResponseBodyModelRenderOrderInfosShopPromInstVOS setSubBizCode(String subBizCode) {
            this.subBizCode = subBizCode;
            return this;
        }
        public String getSubBizCode() {
            return this.subBizCode;
        }

        public RenderDistributionOrderResponseBodyModelRenderOrderInfosShopPromInstVOS setTbSellerId(Long tbSellerId) {
            this.tbSellerId = tbSellerId;
            return this;
        }
        public Long getTbSellerId() {
            return this.tbSellerId;
        }

        public RenderDistributionOrderResponseBodyModelRenderOrderInfosShopPromInstVOS setThresholdPrice(Long thresholdPrice) {
            this.thresholdPrice = thresholdPrice;
            return this;
        }
        public Long getThresholdPrice() {
            return this.thresholdPrice;
        }

        public RenderDistributionOrderResponseBodyModelRenderOrderInfosShopPromInstVOS setUseStartTime(Long useStartTime) {
            this.useStartTime = useStartTime;
            return this;
        }
        public Long getUseStartTime() {
            return this.useStartTime;
        }

    }

    public static class RenderDistributionOrderResponseBodyModelRenderOrderInfos extends TeaModel {
        @NameInMap("CanSell")
        public Boolean canSell;

        @NameInMap("DeliveryInfos")
        public java.util.List<RenderDistributionOrderResponseBodyModelRenderOrderInfosDeliveryInfos> deliveryInfos;

        @NameInMap("ExtInfo")
        public java.util.Map<String, String> extInfo;

        @NameInMap("InvoiceInfo")
        public RenderDistributionOrderResponseBodyModelRenderOrderInfosInvoiceInfo invoiceInfo;

        @NameInMap("ItemInfos")
        public java.util.List<RenderDistributionOrderResponseBodyModelRenderOrderInfosItemInfos> itemInfos;

        @NameInMap("Message")
        public String message;

        @NameInMap("ShopPromInstVOS")
        public java.util.List<RenderDistributionOrderResponseBodyModelRenderOrderInfosShopPromInstVOS> shopPromInstVOS;

        public static RenderDistributionOrderResponseBodyModelRenderOrderInfos build(java.util.Map<String, ?> map) throws Exception {
            RenderDistributionOrderResponseBodyModelRenderOrderInfos self = new RenderDistributionOrderResponseBodyModelRenderOrderInfos();
            return TeaModel.build(map, self);
        }

        public RenderDistributionOrderResponseBodyModelRenderOrderInfos setCanSell(Boolean canSell) {
            this.canSell = canSell;
            return this;
        }
        public Boolean getCanSell() {
            return this.canSell;
        }

        public RenderDistributionOrderResponseBodyModelRenderOrderInfos setDeliveryInfos(java.util.List<RenderDistributionOrderResponseBodyModelRenderOrderInfosDeliveryInfos> deliveryInfos) {
            this.deliveryInfos = deliveryInfos;
            return this;
        }
        public java.util.List<RenderDistributionOrderResponseBodyModelRenderOrderInfosDeliveryInfos> getDeliveryInfos() {
            return this.deliveryInfos;
        }

        public RenderDistributionOrderResponseBodyModelRenderOrderInfos setExtInfo(java.util.Map<String, String> extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public java.util.Map<String, String> getExtInfo() {
            return this.extInfo;
        }

        public RenderDistributionOrderResponseBodyModelRenderOrderInfos setInvoiceInfo(RenderDistributionOrderResponseBodyModelRenderOrderInfosInvoiceInfo invoiceInfo) {
            this.invoiceInfo = invoiceInfo;
            return this;
        }
        public RenderDistributionOrderResponseBodyModelRenderOrderInfosInvoiceInfo getInvoiceInfo() {
            return this.invoiceInfo;
        }

        public RenderDistributionOrderResponseBodyModelRenderOrderInfos setItemInfos(java.util.List<RenderDistributionOrderResponseBodyModelRenderOrderInfosItemInfos> itemInfos) {
            this.itemInfos = itemInfos;
            return this;
        }
        public java.util.List<RenderDistributionOrderResponseBodyModelRenderOrderInfosItemInfos> getItemInfos() {
            return this.itemInfos;
        }

        public RenderDistributionOrderResponseBodyModelRenderOrderInfos setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public RenderDistributionOrderResponseBodyModelRenderOrderInfos setShopPromInstVOS(java.util.List<RenderDistributionOrderResponseBodyModelRenderOrderInfosShopPromInstVOS> shopPromInstVOS) {
            this.shopPromInstVOS = shopPromInstVOS;
            return this;
        }
        public java.util.List<RenderDistributionOrderResponseBodyModelRenderOrderInfosShopPromInstVOS> getShopPromInstVOS() {
            return this.shopPromInstVOS;
        }

    }

    public static class RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosDeliveryInfos extends TeaModel {
        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("Id")
        public String id;

        @NameInMap("PostFee")
        public Long postFee;

        @NameInMap("ServiceType")
        public Long serviceType;

        public static RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosDeliveryInfos build(java.util.Map<String, ?> map) throws Exception {
            RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosDeliveryInfos self = new RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosDeliveryInfos();
            return TeaModel.build(map, self);
        }

        public RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosDeliveryInfos setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosDeliveryInfos setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosDeliveryInfos setPostFee(Long postFee) {
            this.postFee = postFee;
            return this;
        }
        public Long getPostFee() {
            return this.postFee;
        }

        public RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosDeliveryInfos setServiceType(Long serviceType) {
            this.serviceType = serviceType;
            return this;
        }
        public Long getServiceType() {
            return this.serviceType;
        }

    }

    public static class RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosInvoiceInfo extends TeaModel {
        @NameInMap("Desc")
        public String desc;

        @NameInMap("Type")
        public String type;

        public static RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosInvoiceInfo build(java.util.Map<String, ?> map) throws Exception {
            RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosInvoiceInfo self = new RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosInvoiceInfo();
            return TeaModel.build(map, self);
        }

        public RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosInvoiceInfo setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosInvoiceInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosItemInfosItemPromInstVOSAvailableItems extends TeaModel {
        @NameInMap("ItemId")
        public Long itemId;

        @NameInMap("LmItemId")
        public String lmItemId;

        @NameInMap("LmShopId")
        public Long lmShopId;

        @NameInMap("Number")
        public Integer number;

        @NameInMap("Points")
        public Long points;

        @NameInMap("PointsAmount")
        public Long pointsAmount;

        @NameInMap("PriceCent")
        public Long priceCent;

        @NameInMap("Removed")
        public Boolean removed;

        @NameInMap("SkuId")
        public Long skuId;

        @NameInMap("TbSellerId")
        public Long tbSellerId;

        @NameInMap("UserPayFee")
        public Long userPayFee;

        public static RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosItemInfosItemPromInstVOSAvailableItems build(java.util.Map<String, ?> map) throws Exception {
            RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosItemInfosItemPromInstVOSAvailableItems self = new RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosItemInfosItemPromInstVOSAvailableItems();
            return TeaModel.build(map, self);
        }

        public RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosItemInfosItemPromInstVOSAvailableItems setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosItemInfosItemPromInstVOSAvailableItems setLmItemId(String lmItemId) {
            this.lmItemId = lmItemId;
            return this;
        }
        public String getLmItemId() {
            return this.lmItemId;
        }

        public RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosItemInfosItemPromInstVOSAvailableItems setLmShopId(Long lmShopId) {
            this.lmShopId = lmShopId;
            return this;
        }
        public Long getLmShopId() {
            return this.lmShopId;
        }

        public RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosItemInfosItemPromInstVOSAvailableItems setNumber(Integer number) {
            this.number = number;
            return this;
        }
        public Integer getNumber() {
            return this.number;
        }

        public RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosItemInfosItemPromInstVOSAvailableItems setPoints(Long points) {
            this.points = points;
            return this;
        }
        public Long getPoints() {
            return this.points;
        }

        public RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosItemInfosItemPromInstVOSAvailableItems setPointsAmount(Long pointsAmount) {
            this.pointsAmount = pointsAmount;
            return this;
        }
        public Long getPointsAmount() {
            return this.pointsAmount;
        }

        public RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosItemInfosItemPromInstVOSAvailableItems setPriceCent(Long priceCent) {
            this.priceCent = priceCent;
            return this;
        }
        public Long getPriceCent() {
            return this.priceCent;
        }

        public RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosItemInfosItemPromInstVOSAvailableItems setRemoved(Boolean removed) {
            this.removed = removed;
            return this;
        }
        public Boolean getRemoved() {
            return this.removed;
        }

        public RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosItemInfosItemPromInstVOSAvailableItems setSkuId(Long skuId) {
            this.skuId = skuId;
            return this;
        }
        public Long getSkuId() {
            return this.skuId;
        }

        public RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosItemInfosItemPromInstVOSAvailableItems setTbSellerId(Long tbSellerId) {
            this.tbSellerId = tbSellerId;
            return this;
        }
        public Long getTbSellerId() {
            return this.tbSellerId;
        }

        public RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosItemInfosItemPromInstVOSAvailableItems setUserPayFee(Long userPayFee) {
            this.userPayFee = userPayFee;
            return this;
        }
        public Long getUserPayFee() {
            return this.userPayFee;
        }

    }

    public static class RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosItemInfosItemPromInstVOS extends TeaModel {
        @NameInMap("AvailableItems")
        public java.util.List<RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosItemInfosItemPromInstVOSAvailableItems> availableItems;

        @NameInMap("CanUse")
        public Boolean canUse;

        @NameInMap("DiscountPrice")
        public Long discountPrice;

        @NameInMap("ExpireTime")
        public Long expireTime;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Level")
        public String level;

        @NameInMap("LmItemId")
        public String lmItemId;

        @NameInMap("PromotionName")
        public String promotionName;

        @NameInMap("PromotionType")
        public String promotionType;

        @NameInMap("Reason")
        public String reason;

        @NameInMap("Selected")
        public Boolean selected;

        @NameInMap("SkuIds")
        public java.util.List<Long> skuIds;

        @NameInMap("SpecialPrice")
        public Long specialPrice;

        @NameInMap("SubBizCode")
        public String subBizCode;

        @NameInMap("TbSellerId")
        public Long tbSellerId;

        @NameInMap("ThresholdPrice")
        public Long thresholdPrice;

        @NameInMap("UseStartTime")
        public Long useStartTime;

        public static RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosItemInfosItemPromInstVOS build(java.util.Map<String, ?> map) throws Exception {
            RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosItemInfosItemPromInstVOS self = new RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosItemInfosItemPromInstVOS();
            return TeaModel.build(map, self);
        }

        public RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosItemInfosItemPromInstVOS setAvailableItems(java.util.List<RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosItemInfosItemPromInstVOSAvailableItems> availableItems) {
            this.availableItems = availableItems;
            return this;
        }
        public java.util.List<RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosItemInfosItemPromInstVOSAvailableItems> getAvailableItems() {
            return this.availableItems;
        }

        public RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosItemInfosItemPromInstVOS setCanUse(Boolean canUse) {
            this.canUse = canUse;
            return this;
        }
        public Boolean getCanUse() {
            return this.canUse;
        }

        public RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosItemInfosItemPromInstVOS setDiscountPrice(Long discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public Long getDiscountPrice() {
            return this.discountPrice;
        }

        public RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosItemInfosItemPromInstVOS setExpireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Long getExpireTime() {
            return this.expireTime;
        }

        public RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosItemInfosItemPromInstVOS setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosItemInfosItemPromInstVOS setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosItemInfosItemPromInstVOS setLmItemId(String lmItemId) {
            this.lmItemId = lmItemId;
            return this;
        }
        public String getLmItemId() {
            return this.lmItemId;
        }

        public RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosItemInfosItemPromInstVOS setPromotionName(String promotionName) {
            this.promotionName = promotionName;
            return this;
        }
        public String getPromotionName() {
            return this.promotionName;
        }

        public RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosItemInfosItemPromInstVOS setPromotionType(String promotionType) {
            this.promotionType = promotionType;
            return this;
        }
        public String getPromotionType() {
            return this.promotionType;
        }

        public RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosItemInfosItemPromInstVOS setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosItemInfosItemPromInstVOS setSelected(Boolean selected) {
            this.selected = selected;
            return this;
        }
        public Boolean getSelected() {
            return this.selected;
        }

        public RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosItemInfosItemPromInstVOS setSkuIds(java.util.List<Long> skuIds) {
            this.skuIds = skuIds;
            return this;
        }
        public java.util.List<Long> getSkuIds() {
            return this.skuIds;
        }

        public RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosItemInfosItemPromInstVOS setSpecialPrice(Long specialPrice) {
            this.specialPrice = specialPrice;
            return this;
        }
        public Long getSpecialPrice() {
            return this.specialPrice;
        }

        public RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosItemInfosItemPromInstVOS setSubBizCode(String subBizCode) {
            this.subBizCode = subBizCode;
            return this;
        }
        public String getSubBizCode() {
            return this.subBizCode;
        }

        public RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosItemInfosItemPromInstVOS setTbSellerId(Long tbSellerId) {
            this.tbSellerId = tbSellerId;
            return this;
        }
        public Long getTbSellerId() {
            return this.tbSellerId;
        }

        public RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosItemInfosItemPromInstVOS setThresholdPrice(Long thresholdPrice) {
            this.thresholdPrice = thresholdPrice;
            return this;
        }
        public Long getThresholdPrice() {
            return this.thresholdPrice;
        }

        public RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosItemInfosItemPromInstVOS setUseStartTime(Long useStartTime) {
            this.useStartTime = useStartTime;
            return this;
        }
        public Long getUseStartTime() {
            return this.useStartTime;
        }

    }

    public static class RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosItemInfos extends TeaModel {
        @NameInMap("CanSell")
        public Boolean canSell;

        @NameInMap("DistributionMallId")
        public String distributionMallId;

        @NameInMap("DistributionSupplierId")
        public String distributionSupplierId;

        @NameInMap("DistributorId")
        public String distributorId;

        @NameInMap("Features")
        public java.util.Map<String, String> features;

        @NameInMap("ItemId")
        public String itemId;

        @NameInMap("ItemName")
        public String itemName;

        @NameInMap("ItemPicUrl")
        public String itemPicUrl;

        @NameInMap("ItemPromInstVOS")
        public java.util.List<RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosItemInfosItemPromInstVOS> itemPromInstVOS;

        @NameInMap("ItemUrl")
        public String itemUrl;

        @NameInMap("Message")
        public String message;

        @NameInMap("Price")
        public Long price;

        @NameInMap("PromotionFee")
        public Long promotionFee;

        @NameInMap("Quantity")
        public Integer quantity;

        @NameInMap("ReservePrice")
        public Long reservePrice;

        @NameInMap("SkuId")
        public Long skuId;

        @NameInMap("SkuName")
        public String skuName;

        @NameInMap("VirtualItemType")
        public String virtualItemType;

        public static RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosItemInfos build(java.util.Map<String, ?> map) throws Exception {
            RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosItemInfos self = new RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosItemInfos();
            return TeaModel.build(map, self);
        }

        public RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosItemInfos setCanSell(Boolean canSell) {
            this.canSell = canSell;
            return this;
        }
        public Boolean getCanSell() {
            return this.canSell;
        }

        public RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosItemInfos setDistributionMallId(String distributionMallId) {
            this.distributionMallId = distributionMallId;
            return this;
        }
        public String getDistributionMallId() {
            return this.distributionMallId;
        }

        public RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosItemInfos setDistributionSupplierId(String distributionSupplierId) {
            this.distributionSupplierId = distributionSupplierId;
            return this;
        }
        public String getDistributionSupplierId() {
            return this.distributionSupplierId;
        }

        public RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosItemInfos setDistributorId(String distributorId) {
            this.distributorId = distributorId;
            return this;
        }
        public String getDistributorId() {
            return this.distributorId;
        }

        public RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosItemInfos setFeatures(java.util.Map<String, String> features) {
            this.features = features;
            return this;
        }
        public java.util.Map<String, String> getFeatures() {
            return this.features;
        }

        public RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosItemInfos setItemId(String itemId) {
            this.itemId = itemId;
            return this;
        }
        public String getItemId() {
            return this.itemId;
        }

        public RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosItemInfos setItemName(String itemName) {
            this.itemName = itemName;
            return this;
        }
        public String getItemName() {
            return this.itemName;
        }

        public RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosItemInfos setItemPicUrl(String itemPicUrl) {
            this.itemPicUrl = itemPicUrl;
            return this;
        }
        public String getItemPicUrl() {
            return this.itemPicUrl;
        }

        public RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosItemInfos setItemPromInstVOS(java.util.List<RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosItemInfosItemPromInstVOS> itemPromInstVOS) {
            this.itemPromInstVOS = itemPromInstVOS;
            return this;
        }
        public java.util.List<RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosItemInfosItemPromInstVOS> getItemPromInstVOS() {
            return this.itemPromInstVOS;
        }

        public RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosItemInfos setItemUrl(String itemUrl) {
            this.itemUrl = itemUrl;
            return this;
        }
        public String getItemUrl() {
            return this.itemUrl;
        }

        public RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosItemInfos setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosItemInfos setPrice(Long price) {
            this.price = price;
            return this;
        }
        public Long getPrice() {
            return this.price;
        }

        public RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosItemInfos setPromotionFee(Long promotionFee) {
            this.promotionFee = promotionFee;
            return this;
        }
        public Long getPromotionFee() {
            return this.promotionFee;
        }

        public RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosItemInfos setQuantity(Integer quantity) {
            this.quantity = quantity;
            return this;
        }
        public Integer getQuantity() {
            return this.quantity;
        }

        public RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosItemInfos setReservePrice(Long reservePrice) {
            this.reservePrice = reservePrice;
            return this;
        }
        public Long getReservePrice() {
            return this.reservePrice;
        }

        public RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosItemInfos setSkuId(Long skuId) {
            this.skuId = skuId;
            return this;
        }
        public Long getSkuId() {
            return this.skuId;
        }

        public RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosItemInfos setSkuName(String skuName) {
            this.skuName = skuName;
            return this;
        }
        public String getSkuName() {
            return this.skuName;
        }

        public RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosItemInfos setVirtualItemType(String virtualItemType) {
            this.virtualItemType = virtualItemType;
            return this;
        }
        public String getVirtualItemType() {
            return this.virtualItemType;
        }

    }

    public static class RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosShopPromInstVOSAvailableItems extends TeaModel {
        @NameInMap("ItemId")
        public Long itemId;

        @NameInMap("LmItemId")
        public String lmItemId;

        @NameInMap("LmShopId")
        public Long lmShopId;

        @NameInMap("Number")
        public Integer number;

        @NameInMap("Points")
        public Long points;

        @NameInMap("PointsAmount")
        public Long pointsAmount;

        @NameInMap("PriceCent")
        public Long priceCent;

        @NameInMap("Removed")
        public Boolean removed;

        @NameInMap("SkuId")
        public Long skuId;

        @NameInMap("TbSellerId")
        public Long tbSellerId;

        @NameInMap("UserPayFee")
        public Long userPayFee;

        public static RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosShopPromInstVOSAvailableItems build(java.util.Map<String, ?> map) throws Exception {
            RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosShopPromInstVOSAvailableItems self = new RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosShopPromInstVOSAvailableItems();
            return TeaModel.build(map, self);
        }

        public RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosShopPromInstVOSAvailableItems setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosShopPromInstVOSAvailableItems setLmItemId(String lmItemId) {
            this.lmItemId = lmItemId;
            return this;
        }
        public String getLmItemId() {
            return this.lmItemId;
        }

        public RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosShopPromInstVOSAvailableItems setLmShopId(Long lmShopId) {
            this.lmShopId = lmShopId;
            return this;
        }
        public Long getLmShopId() {
            return this.lmShopId;
        }

        public RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosShopPromInstVOSAvailableItems setNumber(Integer number) {
            this.number = number;
            return this;
        }
        public Integer getNumber() {
            return this.number;
        }

        public RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosShopPromInstVOSAvailableItems setPoints(Long points) {
            this.points = points;
            return this;
        }
        public Long getPoints() {
            return this.points;
        }

        public RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosShopPromInstVOSAvailableItems setPointsAmount(Long pointsAmount) {
            this.pointsAmount = pointsAmount;
            return this;
        }
        public Long getPointsAmount() {
            return this.pointsAmount;
        }

        public RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosShopPromInstVOSAvailableItems setPriceCent(Long priceCent) {
            this.priceCent = priceCent;
            return this;
        }
        public Long getPriceCent() {
            return this.priceCent;
        }

        public RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosShopPromInstVOSAvailableItems setRemoved(Boolean removed) {
            this.removed = removed;
            return this;
        }
        public Boolean getRemoved() {
            return this.removed;
        }

        public RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosShopPromInstVOSAvailableItems setSkuId(Long skuId) {
            this.skuId = skuId;
            return this;
        }
        public Long getSkuId() {
            return this.skuId;
        }

        public RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosShopPromInstVOSAvailableItems setTbSellerId(Long tbSellerId) {
            this.tbSellerId = tbSellerId;
            return this;
        }
        public Long getTbSellerId() {
            return this.tbSellerId;
        }

        public RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosShopPromInstVOSAvailableItems setUserPayFee(Long userPayFee) {
            this.userPayFee = userPayFee;
            return this;
        }
        public Long getUserPayFee() {
            return this.userPayFee;
        }

    }

    public static class RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosShopPromInstVOS extends TeaModel {
        @NameInMap("AvailableItems")
        public java.util.List<RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosShopPromInstVOSAvailableItems> availableItems;

        @NameInMap("CanUse")
        public Boolean canUse;

        @NameInMap("DiscountPrice")
        public Long discountPrice;

        @NameInMap("ExpireTime")
        public Long expireTime;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Level")
        public String level;

        @NameInMap("LmItemId")
        public String lmItemId;

        @NameInMap("PromotionName")
        public String promotionName;

        @NameInMap("PromotionType")
        public String promotionType;

        @NameInMap("Reason")
        public String reason;

        @NameInMap("Selected")
        public Boolean selected;

        @NameInMap("SkuIds")
        public java.util.List<Long> skuIds;

        @NameInMap("SpecialPrice")
        public Long specialPrice;

        @NameInMap("SubBizCode")
        public String subBizCode;

        @NameInMap("TbSellerId")
        public Long tbSellerId;

        @NameInMap("ThresholdPrice")
        public Long thresholdPrice;

        @NameInMap("UseStartTime")
        public Long useStartTime;

        public static RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosShopPromInstVOS build(java.util.Map<String, ?> map) throws Exception {
            RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosShopPromInstVOS self = new RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosShopPromInstVOS();
            return TeaModel.build(map, self);
        }

        public RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosShopPromInstVOS setAvailableItems(java.util.List<RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosShopPromInstVOSAvailableItems> availableItems) {
            this.availableItems = availableItems;
            return this;
        }
        public java.util.List<RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosShopPromInstVOSAvailableItems> getAvailableItems() {
            return this.availableItems;
        }

        public RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosShopPromInstVOS setCanUse(Boolean canUse) {
            this.canUse = canUse;
            return this;
        }
        public Boolean getCanUse() {
            return this.canUse;
        }

        public RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosShopPromInstVOS setDiscountPrice(Long discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public Long getDiscountPrice() {
            return this.discountPrice;
        }

        public RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosShopPromInstVOS setExpireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Long getExpireTime() {
            return this.expireTime;
        }

        public RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosShopPromInstVOS setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosShopPromInstVOS setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosShopPromInstVOS setLmItemId(String lmItemId) {
            this.lmItemId = lmItemId;
            return this;
        }
        public String getLmItemId() {
            return this.lmItemId;
        }

        public RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosShopPromInstVOS setPromotionName(String promotionName) {
            this.promotionName = promotionName;
            return this;
        }
        public String getPromotionName() {
            return this.promotionName;
        }

        public RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosShopPromInstVOS setPromotionType(String promotionType) {
            this.promotionType = promotionType;
            return this;
        }
        public String getPromotionType() {
            return this.promotionType;
        }

        public RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosShopPromInstVOS setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosShopPromInstVOS setSelected(Boolean selected) {
            this.selected = selected;
            return this;
        }
        public Boolean getSelected() {
            return this.selected;
        }

        public RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosShopPromInstVOS setSkuIds(java.util.List<Long> skuIds) {
            this.skuIds = skuIds;
            return this;
        }
        public java.util.List<Long> getSkuIds() {
            return this.skuIds;
        }

        public RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosShopPromInstVOS setSpecialPrice(Long specialPrice) {
            this.specialPrice = specialPrice;
            return this;
        }
        public Long getSpecialPrice() {
            return this.specialPrice;
        }

        public RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosShopPromInstVOS setSubBizCode(String subBizCode) {
            this.subBizCode = subBizCode;
            return this;
        }
        public String getSubBizCode() {
            return this.subBizCode;
        }

        public RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosShopPromInstVOS setTbSellerId(Long tbSellerId) {
            this.tbSellerId = tbSellerId;
            return this;
        }
        public Long getTbSellerId() {
            return this.tbSellerId;
        }

        public RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosShopPromInstVOS setThresholdPrice(Long thresholdPrice) {
            this.thresholdPrice = thresholdPrice;
            return this;
        }
        public Long getThresholdPrice() {
            return this.thresholdPrice;
        }

        public RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosShopPromInstVOS setUseStartTime(Long useStartTime) {
            this.useStartTime = useStartTime;
            return this;
        }
        public Long getUseStartTime() {
            return this.useStartTime;
        }

    }

    public static class RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfos extends TeaModel {
        @NameInMap("CanSell")
        public Boolean canSell;

        @NameInMap("DeliveryInfos")
        public java.util.List<RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosDeliveryInfos> deliveryInfos;

        @NameInMap("ExtInfo")
        public java.util.Map<String, String> extInfo;

        @NameInMap("InvoiceInfo")
        public RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosInvoiceInfo invoiceInfo;

        @NameInMap("ItemInfos")
        public java.util.List<RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosItemInfos> itemInfos;

        @NameInMap("Message")
        public String message;

        @NameInMap("ShopPromInstVOS")
        public java.util.List<RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosShopPromInstVOS> shopPromInstVOS;

        public static RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfos build(java.util.Map<String, ?> map) throws Exception {
            RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfos self = new RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfos();
            return TeaModel.build(map, self);
        }

        public RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfos setCanSell(Boolean canSell) {
            this.canSell = canSell;
            return this;
        }
        public Boolean getCanSell() {
            return this.canSell;
        }

        public RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfos setDeliveryInfos(java.util.List<RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosDeliveryInfos> deliveryInfos) {
            this.deliveryInfos = deliveryInfos;
            return this;
        }
        public java.util.List<RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosDeliveryInfos> getDeliveryInfos() {
            return this.deliveryInfos;
        }

        public RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfos setExtInfo(java.util.Map<String, String> extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public java.util.Map<String, String> getExtInfo() {
            return this.extInfo;
        }

        public RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfos setInvoiceInfo(RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosInvoiceInfo invoiceInfo) {
            this.invoiceInfo = invoiceInfo;
            return this;
        }
        public RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosInvoiceInfo getInvoiceInfo() {
            return this.invoiceInfo;
        }

        public RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfos setItemInfos(java.util.List<RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosItemInfos> itemInfos) {
            this.itemInfos = itemInfos;
            return this;
        }
        public java.util.List<RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosItemInfos> getItemInfos() {
            return this.itemInfos;
        }

        public RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfos setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfos setShopPromInstVOS(java.util.List<RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosShopPromInstVOS> shopPromInstVOS) {
            this.shopPromInstVOS = shopPromInstVOS;
            return this;
        }
        public java.util.List<RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfosShopPromInstVOS> getShopPromInstVOS() {
            return this.shopPromInstVOS;
        }

    }

    public static class RenderDistributionOrderResponseBodyModel extends TeaModel {
        @NameInMap("AddressInfos")
        public java.util.List<RenderDistributionOrderResponseBodyModelAddressInfos> addressInfos;

        @NameInMap("CanSell")
        public Boolean canSell;

        @NameInMap("ExtInfo")
        public java.util.Map<String, String> extInfo;

        @NameInMap("Message")
        public String message;

        @NameInMap("RenderOrderInfos")
        public java.util.List<RenderDistributionOrderResponseBodyModelRenderOrderInfos> renderOrderInfos;

        @NameInMap("UnsellableRenderOrderInfos")
        public java.util.List<RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfos> unsellableRenderOrderInfos;

        public static RenderDistributionOrderResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            RenderDistributionOrderResponseBodyModel self = new RenderDistributionOrderResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public RenderDistributionOrderResponseBodyModel setAddressInfos(java.util.List<RenderDistributionOrderResponseBodyModelAddressInfos> addressInfos) {
            this.addressInfos = addressInfos;
            return this;
        }
        public java.util.List<RenderDistributionOrderResponseBodyModelAddressInfos> getAddressInfos() {
            return this.addressInfos;
        }

        public RenderDistributionOrderResponseBodyModel setCanSell(Boolean canSell) {
            this.canSell = canSell;
            return this;
        }
        public Boolean getCanSell() {
            return this.canSell;
        }

        public RenderDistributionOrderResponseBodyModel setExtInfo(java.util.Map<String, String> extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public java.util.Map<String, String> getExtInfo() {
            return this.extInfo;
        }

        public RenderDistributionOrderResponseBodyModel setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public RenderDistributionOrderResponseBodyModel setRenderOrderInfos(java.util.List<RenderDistributionOrderResponseBodyModelRenderOrderInfos> renderOrderInfos) {
            this.renderOrderInfos = renderOrderInfos;
            return this;
        }
        public java.util.List<RenderDistributionOrderResponseBodyModelRenderOrderInfos> getRenderOrderInfos() {
            return this.renderOrderInfos;
        }

        public RenderDistributionOrderResponseBodyModel setUnsellableRenderOrderInfos(java.util.List<RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfos> unsellableRenderOrderInfos) {
            this.unsellableRenderOrderInfos = unsellableRenderOrderInfos;
            return this;
        }
        public java.util.List<RenderDistributionOrderResponseBodyModelUnsellableRenderOrderInfos> getUnsellableRenderOrderInfos() {
            return this.unsellableRenderOrderInfos;
        }

    }

}
