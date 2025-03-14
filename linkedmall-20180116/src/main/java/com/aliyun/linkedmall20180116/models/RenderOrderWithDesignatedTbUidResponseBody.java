// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class RenderOrderWithDesignatedTbUidResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("LogsId")
    public String logsId;

    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public RenderOrderWithDesignatedTbUidResponseBodyModel model;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>pageSize</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <strong>example:</strong>
     * <p>978A8742-1A***9-F8713ACBC385</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>205</p>
     */
    @NameInMap("SubCode")
    public String subCode;

    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("SubMessage")
    public String subMessage;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static RenderOrderWithDesignatedTbUidResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RenderOrderWithDesignatedTbUidResponseBody self = new RenderOrderWithDesignatedTbUidResponseBody();
        return TeaModel.build(map, self);
    }

    public RenderOrderWithDesignatedTbUidResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RenderOrderWithDesignatedTbUidResponseBody setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public RenderOrderWithDesignatedTbUidResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RenderOrderWithDesignatedTbUidResponseBody setModel(RenderOrderWithDesignatedTbUidResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public RenderOrderWithDesignatedTbUidResponseBodyModel getModel() {
        return this.model;
    }

    public RenderOrderWithDesignatedTbUidResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public RenderOrderWithDesignatedTbUidResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public RenderOrderWithDesignatedTbUidResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RenderOrderWithDesignatedTbUidResponseBody setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public RenderOrderWithDesignatedTbUidResponseBody setSubMessage(String subMessage) {
        this.subMessage = subMessage;
        return this;
    }
    public String getSubMessage() {
        return this.subMessage;
    }

    public RenderOrderWithDesignatedTbUidResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public RenderOrderWithDesignatedTbUidResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class RenderOrderWithDesignatedTbUidResponseBodyModelAddressInfos extends TeaModel {
        @NameInMap("AddressDetail")
        public String addressDetail;

        /**
         * <strong>example:</strong>
         * <p>31***40</p>
         */
        @NameInMap("AddressId")
        public Long addressId;

        /**
         * <strong>example:</strong>
         * <p>43***03</p>
         */
        @NameInMap("DivisionCode")
        public String divisionCode;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsDefault")
        public Boolean isDefault;

        @NameInMap("Receiver")
        public String receiver;

        /**
         * <strong>example:</strong>
         * <p>137***343</p>
         */
        @NameInMap("ReceiverPhone")
        public String receiverPhone;

        /**
         * <strong>example:</strong>
         * <p>430***008</p>
         */
        @NameInMap("TownDivisionCode")
        public String townDivisionCode;

        public static RenderOrderWithDesignatedTbUidResponseBodyModelAddressInfos build(java.util.Map<String, ?> map) throws Exception {
            RenderOrderWithDesignatedTbUidResponseBodyModelAddressInfos self = new RenderOrderWithDesignatedTbUidResponseBodyModelAddressInfos();
            return TeaModel.build(map, self);
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelAddressInfos setAddressDetail(String addressDetail) {
            this.addressDetail = addressDetail;
            return this;
        }
        public String getAddressDetail() {
            return this.addressDetail;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelAddressInfos setAddressId(Long addressId) {
            this.addressId = addressId;
            return this;
        }
        public Long getAddressId() {
            return this.addressId;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelAddressInfos setDivisionCode(String divisionCode) {
            this.divisionCode = divisionCode;
            return this;
        }
        public String getDivisionCode() {
            return this.divisionCode;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelAddressInfos setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelAddressInfos setReceiver(String receiver) {
            this.receiver = receiver;
            return this;
        }
        public String getReceiver() {
            return this.receiver;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelAddressInfos setReceiverPhone(String receiverPhone) {
            this.receiverPhone = receiverPhone;
            return this;
        }
        public String getReceiverPhone() {
            return this.receiverPhone;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelAddressInfos setTownDivisionCode(String townDivisionCode) {
            this.townDivisionCode = townDivisionCode;
            return this;
        }
        public String getTownDivisionCode() {
            return this.townDivisionCode;
        }

    }

    public static class RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosDeliveryInfos extends TeaModel {
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>id</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PostFee")
        public Long postFee;

        /**
         * <strong>example:</strong>
         * <p>-4</p>
         */
        @NameInMap("ServiceType")
        public Long serviceType;

        public static RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosDeliveryInfos build(java.util.Map<String, ?> map) throws Exception {
            RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosDeliveryInfos self = new RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosDeliveryInfos();
            return TeaModel.build(map, self);
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosDeliveryInfos setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosDeliveryInfos setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosDeliveryInfos setPostFee(Long postFee) {
            this.postFee = postFee;
            return this;
        }
        public Long getPostFee() {
            return this.postFee;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosDeliveryInfos setServiceType(Long serviceType) {
            this.serviceType = serviceType;
            return this;
        }
        public Long getServiceType() {
            return this.serviceType;
        }

    }

    public static class RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosInvoiceInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("Desc")
        public String desc;

        @NameInMap("Type")
        public String type;

        public static RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosInvoiceInfo build(java.util.Map<String, ?> map) throws Exception {
            RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosInvoiceInfo self = new RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosInvoiceInfo();
            return TeaModel.build(map, self);
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosInvoiceInfo setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosInvoiceInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosLmItemInfosItemPromInstVOSAvailableItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>668***630</p>
         */
        @NameInMap("ItemId")
        public Long itemId;

        /**
         * <strong>example:</strong>
         * <p>100<em><strong>35-630</strong></em>809</p>
         */
        @NameInMap("LmItemId")
        public String lmItemId;

        /**
         * <strong>example:</strong>
         * <p>100***35</p>
         */
        @NameInMap("LmShopId")
        public Long lmShopId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Number")
        public Integer number;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Points")
        public Long points;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PointsAmount")
        public Long pointsAmount;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("PriceCent")
        public Long priceCent;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Removed")
        public Boolean removed;

        /**
         * <p>skuid</p>
         * 
         * <strong>example:</strong>
         * <p>457***764</p>
         */
        @NameInMap("SkuId")
        public Long skuId;

        /**
         * <strong>example:</strong>
         * <p>32***42</p>
         */
        @NameInMap("TbSellerId")
        public Long tbSellerId;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("UserPayFee")
        public Long userPayFee;

        public static RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosLmItemInfosItemPromInstVOSAvailableItems build(java.util.Map<String, ?> map) throws Exception {
            RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosLmItemInfosItemPromInstVOSAvailableItems self = new RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosLmItemInfosItemPromInstVOSAvailableItems();
            return TeaModel.build(map, self);
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosLmItemInfosItemPromInstVOSAvailableItems setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosLmItemInfosItemPromInstVOSAvailableItems setLmItemId(String lmItemId) {
            this.lmItemId = lmItemId;
            return this;
        }
        public String getLmItemId() {
            return this.lmItemId;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosLmItemInfosItemPromInstVOSAvailableItems setLmShopId(Long lmShopId) {
            this.lmShopId = lmShopId;
            return this;
        }
        public Long getLmShopId() {
            return this.lmShopId;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosLmItemInfosItemPromInstVOSAvailableItems setNumber(Integer number) {
            this.number = number;
            return this;
        }
        public Integer getNumber() {
            return this.number;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosLmItemInfosItemPromInstVOSAvailableItems setPoints(Long points) {
            this.points = points;
            return this;
        }
        public Long getPoints() {
            return this.points;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosLmItemInfosItemPromInstVOSAvailableItems setPointsAmount(Long pointsAmount) {
            this.pointsAmount = pointsAmount;
            return this;
        }
        public Long getPointsAmount() {
            return this.pointsAmount;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosLmItemInfosItemPromInstVOSAvailableItems setPriceCent(Long priceCent) {
            this.priceCent = priceCent;
            return this;
        }
        public Long getPriceCent() {
            return this.priceCent;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosLmItemInfosItemPromInstVOSAvailableItems setRemoved(Boolean removed) {
            this.removed = removed;
            return this;
        }
        public Boolean getRemoved() {
            return this.removed;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosLmItemInfosItemPromInstVOSAvailableItems setSkuId(Long skuId) {
            this.skuId = skuId;
            return this;
        }
        public Long getSkuId() {
            return this.skuId;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosLmItemInfosItemPromInstVOSAvailableItems setTbSellerId(Long tbSellerId) {
            this.tbSellerId = tbSellerId;
            return this;
        }
        public Long getTbSellerId() {
            return this.tbSellerId;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosLmItemInfosItemPromInstVOSAvailableItems setUserPayFee(Long userPayFee) {
            this.userPayFee = userPayFee;
            return this;
        }
        public Long getUserPayFee() {
            return this.userPayFee;
        }

    }

    public static class RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosLmItemInfosItemPromInstVOS extends TeaModel {
        @NameInMap("AvailableItems")
        public java.util.List<RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosLmItemInfosItemPromInstVOSAvailableItems> availableItems;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("CanUse")
        public Boolean canUse;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DiscountPrice")
        public Long discountPrice;

        /**
         * <strong>example:</strong>
         * <p>1659612158</p>
         */
        @NameInMap("ExpireTime")
        public Long expireTime;

        /**
         * <strong>example:</strong>
         * <p>324***234</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <strong>example:</strong>
         * <p>100<em><strong>35-582</strong></em>661</p>
         */
        @NameInMap("LmItemId")
        public String lmItemId;

        @NameInMap("PromotionName")
        public String promotionName;

        @NameInMap("PromotionType")
        public String promotionType;

        @NameInMap("Reason")
        public String reason;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Selected")
        public Boolean selected;

        @NameInMap("SkuIds")
        public java.util.List<Long> skuIds;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SpecialPrice")
        public Long specialPrice;

        /**
         * <strong>example:</strong>
         * <p>0eae4fd***e23145</p>
         */
        @NameInMap("SubBizCode")
        public String subBizCode;

        /**
         * <strong>example:</strong>
         * <p>32***24</p>
         */
        @NameInMap("TbSellerId")
        public Long tbSellerId;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ThresholdPrice")
        public Long thresholdPrice;

        /**
         * <strong>example:</strong>
         * <p>1659612158</p>
         */
        @NameInMap("UseStartTime")
        public Long useStartTime;

        public static RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosLmItemInfosItemPromInstVOS build(java.util.Map<String, ?> map) throws Exception {
            RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosLmItemInfosItemPromInstVOS self = new RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosLmItemInfosItemPromInstVOS();
            return TeaModel.build(map, self);
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosLmItemInfosItemPromInstVOS setAvailableItems(java.util.List<RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosLmItemInfosItemPromInstVOSAvailableItems> availableItems) {
            this.availableItems = availableItems;
            return this;
        }
        public java.util.List<RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosLmItemInfosItemPromInstVOSAvailableItems> getAvailableItems() {
            return this.availableItems;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosLmItemInfosItemPromInstVOS setCanUse(Boolean canUse) {
            this.canUse = canUse;
            return this;
        }
        public Boolean getCanUse() {
            return this.canUse;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosLmItemInfosItemPromInstVOS setDiscountPrice(Long discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public Long getDiscountPrice() {
            return this.discountPrice;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosLmItemInfosItemPromInstVOS setExpireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Long getExpireTime() {
            return this.expireTime;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosLmItemInfosItemPromInstVOS setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosLmItemInfosItemPromInstVOS setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosLmItemInfosItemPromInstVOS setLmItemId(String lmItemId) {
            this.lmItemId = lmItemId;
            return this;
        }
        public String getLmItemId() {
            return this.lmItemId;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosLmItemInfosItemPromInstVOS setPromotionName(String promotionName) {
            this.promotionName = promotionName;
            return this;
        }
        public String getPromotionName() {
            return this.promotionName;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosLmItemInfosItemPromInstVOS setPromotionType(String promotionType) {
            this.promotionType = promotionType;
            return this;
        }
        public String getPromotionType() {
            return this.promotionType;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosLmItemInfosItemPromInstVOS setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosLmItemInfosItemPromInstVOS setSelected(Boolean selected) {
            this.selected = selected;
            return this;
        }
        public Boolean getSelected() {
            return this.selected;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosLmItemInfosItemPromInstVOS setSkuIds(java.util.List<Long> skuIds) {
            this.skuIds = skuIds;
            return this;
        }
        public java.util.List<Long> getSkuIds() {
            return this.skuIds;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosLmItemInfosItemPromInstVOS setSpecialPrice(Long specialPrice) {
            this.specialPrice = specialPrice;
            return this;
        }
        public Long getSpecialPrice() {
            return this.specialPrice;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosLmItemInfosItemPromInstVOS setSubBizCode(String subBizCode) {
            this.subBizCode = subBizCode;
            return this;
        }
        public String getSubBizCode() {
            return this.subBizCode;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosLmItemInfosItemPromInstVOS setTbSellerId(Long tbSellerId) {
            this.tbSellerId = tbSellerId;
            return this;
        }
        public Long getTbSellerId() {
            return this.tbSellerId;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosLmItemInfosItemPromInstVOS setThresholdPrice(Long thresholdPrice) {
            this.thresholdPrice = thresholdPrice;
            return this;
        }
        public Long getThresholdPrice() {
            return this.thresholdPrice;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosLmItemInfosItemPromInstVOS setUseStartTime(Long useStartTime) {
            this.useStartTime = useStartTime;
            return this;
        }
        public Long getUseStartTime() {
            return this.useStartTime;
        }

    }

    public static class RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosLmItemInfos extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>50000</p>
         */
        @NameInMap("ActualPrice")
        public Long actualPrice;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("CanSell")
        public Boolean canSell;

        /**
         * <strong>example:</strong>
         * <p>16000</p>
         */
        @NameInMap("Cash")
        public Long cash;

        @NameInMap("Features")
        public java.util.Map<String, String> features;

        /**
         * <strong>example:</strong>
         * <p>661***740</p>
         */
        @NameInMap("ItemId")
        public Long itemId;

        /**
         * <strong>example:</strong>
         * <p>iphone12</p>
         */
        @NameInMap("ItemName")
        public String itemName;

        /**
         * <strong>example:</strong>
         * <p><a href="https://aliyundoc.com">https://aliyundoc.com</a></p>
         */
        @NameInMap("ItemPicUrl")
        public String itemPicUrl;

        @NameInMap("ItemPromInstVOS")
        public java.util.List<RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosLmItemInfosItemPromInstVOS> itemPromInstVOS;

        /**
         * <strong>example:</strong>
         * <p><a href="https://aliyundoc.com">https://aliyundoc.com</a></p>
         */
        @NameInMap("ItemUrl")
        public String itemUrl;

        /**
         * <strong>example:</strong>
         * <p>100<em><strong>02-661</strong></em>740</p>
         */
        @NameInMap("LmItemId")
        public String lmItemId;

        /**
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <strong>example:</strong>
         * <p>1000000</p>
         */
        @NameInMap("PointPrice")
        public Long pointPrice;

        /**
         * <strong>example:</strong>
         * <p>100000</p>
         */
        @NameInMap("Points")
        public Long points;

        /**
         * <strong>example:</strong>
         * <p>6000</p>
         */
        @NameInMap("PromotionFee")
        public Long promotionFee;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Quantity")
        public Integer quantity;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("ReservePrice")
        public Long reservePrice;

        /**
         * <strong>example:</strong>
         * <p>107***918</p>
         */
        @NameInMap("SellerId")
        public Long sellerId;

        @NameInMap("SellerNick")
        public String sellerNick;

        /**
         * <p>skuid</p>
         * 
         * <strong>example:</strong>
         * <p>493***981</p>
         */
        @NameInMap("SkuId")
        public Long skuId;

        /**
         * <strong>example:</strong>
         * <p>64GB</p>
         */
        @NameInMap("SkuName")
        public String skuName;

        @NameInMap("TbShopName")
        public String tbShopName;

        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("VirtualItemType")
        public String virtualItemType;

        public static RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosLmItemInfos build(java.util.Map<String, ?> map) throws Exception {
            RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosLmItemInfos self = new RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosLmItemInfos();
            return TeaModel.build(map, self);
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosLmItemInfos setActualPrice(Long actualPrice) {
            this.actualPrice = actualPrice;
            return this;
        }
        public Long getActualPrice() {
            return this.actualPrice;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosLmItemInfos setCanSell(Boolean canSell) {
            this.canSell = canSell;
            return this;
        }
        public Boolean getCanSell() {
            return this.canSell;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosLmItemInfos setCash(Long cash) {
            this.cash = cash;
            return this;
        }
        public Long getCash() {
            return this.cash;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosLmItemInfos setFeatures(java.util.Map<String, String> features) {
            this.features = features;
            return this;
        }
        public java.util.Map<String, String> getFeatures() {
            return this.features;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosLmItemInfos setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosLmItemInfos setItemName(String itemName) {
            this.itemName = itemName;
            return this;
        }
        public String getItemName() {
            return this.itemName;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosLmItemInfos setItemPicUrl(String itemPicUrl) {
            this.itemPicUrl = itemPicUrl;
            return this;
        }
        public String getItemPicUrl() {
            return this.itemPicUrl;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosLmItemInfos setItemPromInstVOS(java.util.List<RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosLmItemInfosItemPromInstVOS> itemPromInstVOS) {
            this.itemPromInstVOS = itemPromInstVOS;
            return this;
        }
        public java.util.List<RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosLmItemInfosItemPromInstVOS> getItemPromInstVOS() {
            return this.itemPromInstVOS;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosLmItemInfos setItemUrl(String itemUrl) {
            this.itemUrl = itemUrl;
            return this;
        }
        public String getItemUrl() {
            return this.itemUrl;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosLmItemInfos setLmItemId(String lmItemId) {
            this.lmItemId = lmItemId;
            return this;
        }
        public String getLmItemId() {
            return this.lmItemId;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosLmItemInfos setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosLmItemInfos setPointPrice(Long pointPrice) {
            this.pointPrice = pointPrice;
            return this;
        }
        public Long getPointPrice() {
            return this.pointPrice;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosLmItemInfos setPoints(Long points) {
            this.points = points;
            return this;
        }
        public Long getPoints() {
            return this.points;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosLmItemInfos setPromotionFee(Long promotionFee) {
            this.promotionFee = promotionFee;
            return this;
        }
        public Long getPromotionFee() {
            return this.promotionFee;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosLmItemInfos setQuantity(Integer quantity) {
            this.quantity = quantity;
            return this;
        }
        public Integer getQuantity() {
            return this.quantity;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosLmItemInfos setReservePrice(Long reservePrice) {
            this.reservePrice = reservePrice;
            return this;
        }
        public Long getReservePrice() {
            return this.reservePrice;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosLmItemInfos setSellerId(Long sellerId) {
            this.sellerId = sellerId;
            return this;
        }
        public Long getSellerId() {
            return this.sellerId;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosLmItemInfos setSellerNick(String sellerNick) {
            this.sellerNick = sellerNick;
            return this;
        }
        public String getSellerNick() {
            return this.sellerNick;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosLmItemInfos setSkuId(Long skuId) {
            this.skuId = skuId;
            return this;
        }
        public Long getSkuId() {
            return this.skuId;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosLmItemInfos setSkuName(String skuName) {
            this.skuName = skuName;
            return this;
        }
        public String getSkuName() {
            return this.skuName;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosLmItemInfos setTbShopName(String tbShopName) {
            this.tbShopName = tbShopName;
            return this;
        }
        public String getTbShopName() {
            return this.tbShopName;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosLmItemInfos setVirtualItemType(String virtualItemType) {
            this.virtualItemType = virtualItemType;
            return this;
        }
        public String getVirtualItemType() {
            return this.virtualItemType;
        }

    }

    public static class RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosShopPromInstVOSAvailableItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>668***630</p>
         */
        @NameInMap("ItemId")
        public Long itemId;

        /**
         * <strong>example:</strong>
         * <p>100<em><strong>88-52</strong></em>337</p>
         */
        @NameInMap("LmItemId")
        public String lmItemId;

        /**
         * <strong>example:</strong>
         * <p>10***40</p>
         */
        @NameInMap("LmShopId")
        public Long lmShopId;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Number")
        public Integer number;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Points")
        public Long points;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PointsAmount")
        public Long pointsAmount;

        /**
         * <strong>example:</strong>
         * <p>1490</p>
         */
        @NameInMap("PriceCent")
        public Long priceCent;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Removed")
        public Boolean removed;

        /**
         * <strong>example:</strong>
         * <p>502***91</p>
         */
        @NameInMap("SkuId")
        public Long skuId;

        /**
         * <strong>example:</strong>
         * <p>32***32</p>
         */
        @NameInMap("TbSellerId")
        public Long tbSellerId;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("UserPayFee")
        public Long userPayFee;

        public static RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosShopPromInstVOSAvailableItems build(java.util.Map<String, ?> map) throws Exception {
            RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosShopPromInstVOSAvailableItems self = new RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosShopPromInstVOSAvailableItems();
            return TeaModel.build(map, self);
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosShopPromInstVOSAvailableItems setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosShopPromInstVOSAvailableItems setLmItemId(String lmItemId) {
            this.lmItemId = lmItemId;
            return this;
        }
        public String getLmItemId() {
            return this.lmItemId;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosShopPromInstVOSAvailableItems setLmShopId(Long lmShopId) {
            this.lmShopId = lmShopId;
            return this;
        }
        public Long getLmShopId() {
            return this.lmShopId;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosShopPromInstVOSAvailableItems setNumber(Integer number) {
            this.number = number;
            return this;
        }
        public Integer getNumber() {
            return this.number;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosShopPromInstVOSAvailableItems setPoints(Long points) {
            this.points = points;
            return this;
        }
        public Long getPoints() {
            return this.points;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosShopPromInstVOSAvailableItems setPointsAmount(Long pointsAmount) {
            this.pointsAmount = pointsAmount;
            return this;
        }
        public Long getPointsAmount() {
            return this.pointsAmount;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosShopPromInstVOSAvailableItems setPriceCent(Long priceCent) {
            this.priceCent = priceCent;
            return this;
        }
        public Long getPriceCent() {
            return this.priceCent;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosShopPromInstVOSAvailableItems setRemoved(Boolean removed) {
            this.removed = removed;
            return this;
        }
        public Boolean getRemoved() {
            return this.removed;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosShopPromInstVOSAvailableItems setSkuId(Long skuId) {
            this.skuId = skuId;
            return this;
        }
        public Long getSkuId() {
            return this.skuId;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosShopPromInstVOSAvailableItems setTbSellerId(Long tbSellerId) {
            this.tbSellerId = tbSellerId;
            return this;
        }
        public Long getTbSellerId() {
            return this.tbSellerId;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosShopPromInstVOSAvailableItems setUserPayFee(Long userPayFee) {
            this.userPayFee = userPayFee;
            return this;
        }
        public Long getUserPayFee() {
            return this.userPayFee;
        }

    }

    public static class RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosShopPromInstVOS extends TeaModel {
        @NameInMap("AvailableItems")
        public java.util.List<RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosShopPromInstVOSAvailableItems> availableItems;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("CanUse")
        public Boolean canUse;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("DiscountPrice")
        public Long discountPrice;

        /**
         * <strong>example:</strong>
         * <p>1659612158</p>
         */
        @NameInMap("ExpireTime")
        public Long expireTime;

        /**
         * <strong>example:</strong>
         * <p>324***242</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <strong>example:</strong>
         * <p>100<em><strong>42-568</strong></em>99</p>
         */
        @NameInMap("LmItemId")
        public String lmItemId;

        @NameInMap("PromotionName")
        public String promotionName;

        @NameInMap("PromotionType")
        public String promotionType;

        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Selected")
        public Boolean selected;

        @NameInMap("SkuIds")
        public java.util.List<Long> skuIds;

        /**
         * <strong>example:</strong>
         * <p>88</p>
         */
        @NameInMap("SpecialPrice")
        public Long specialPrice;

        /**
         * <strong>example:</strong>
         * <p>40b8362***20760d</p>
         */
        @NameInMap("SubBizCode")
        public String subBizCode;

        /**
         * <strong>example:</strong>
         * <p>343***242</p>
         */
        @NameInMap("TbSellerId")
        public Long tbSellerId;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("ThresholdPrice")
        public Long thresholdPrice;

        /**
         * <strong>example:</strong>
         * <p>1659612158</p>
         */
        @NameInMap("UseStartTime")
        public Long useStartTime;

        public static RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosShopPromInstVOS build(java.util.Map<String, ?> map) throws Exception {
            RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosShopPromInstVOS self = new RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosShopPromInstVOS();
            return TeaModel.build(map, self);
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosShopPromInstVOS setAvailableItems(java.util.List<RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosShopPromInstVOSAvailableItems> availableItems) {
            this.availableItems = availableItems;
            return this;
        }
        public java.util.List<RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosShopPromInstVOSAvailableItems> getAvailableItems() {
            return this.availableItems;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosShopPromInstVOS setCanUse(Boolean canUse) {
            this.canUse = canUse;
            return this;
        }
        public Boolean getCanUse() {
            return this.canUse;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosShopPromInstVOS setDiscountPrice(Long discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public Long getDiscountPrice() {
            return this.discountPrice;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosShopPromInstVOS setExpireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Long getExpireTime() {
            return this.expireTime;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosShopPromInstVOS setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosShopPromInstVOS setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosShopPromInstVOS setLmItemId(String lmItemId) {
            this.lmItemId = lmItemId;
            return this;
        }
        public String getLmItemId() {
            return this.lmItemId;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosShopPromInstVOS setPromotionName(String promotionName) {
            this.promotionName = promotionName;
            return this;
        }
        public String getPromotionName() {
            return this.promotionName;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosShopPromInstVOS setPromotionType(String promotionType) {
            this.promotionType = promotionType;
            return this;
        }
        public String getPromotionType() {
            return this.promotionType;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosShopPromInstVOS setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosShopPromInstVOS setSelected(Boolean selected) {
            this.selected = selected;
            return this;
        }
        public Boolean getSelected() {
            return this.selected;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosShopPromInstVOS setSkuIds(java.util.List<Long> skuIds) {
            this.skuIds = skuIds;
            return this;
        }
        public java.util.List<Long> getSkuIds() {
            return this.skuIds;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosShopPromInstVOS setSpecialPrice(Long specialPrice) {
            this.specialPrice = specialPrice;
            return this;
        }
        public Long getSpecialPrice() {
            return this.specialPrice;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosShopPromInstVOS setSubBizCode(String subBizCode) {
            this.subBizCode = subBizCode;
            return this;
        }
        public String getSubBizCode() {
            return this.subBizCode;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosShopPromInstVOS setTbSellerId(Long tbSellerId) {
            this.tbSellerId = tbSellerId;
            return this;
        }
        public Long getTbSellerId() {
            return this.tbSellerId;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosShopPromInstVOS setThresholdPrice(Long thresholdPrice) {
            this.thresholdPrice = thresholdPrice;
            return this;
        }
        public Long getThresholdPrice() {
            return this.thresholdPrice;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosShopPromInstVOS setUseStartTime(Long useStartTime) {
            this.useStartTime = useStartTime;
            return this;
        }
        public Long getUseStartTime() {
            return this.useStartTime;
        }

    }

    public static class RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfos extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("CanSell")
        public Boolean canSell;

        @NameInMap("DeliveryInfos")
        public java.util.List<RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosDeliveryInfos> deliveryInfos;

        @NameInMap("ExtInfo")
        public java.util.Map<String, String> extInfo;

        @NameInMap("InvoiceInfo")
        public RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosInvoiceInfo invoiceInfo;

        @NameInMap("LmItemInfos")
        public java.util.List<RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosLmItemInfos> lmItemInfos;

        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <strong>example:</strong>
         * <p>218***608</p>
         */
        @NameInMap("SellerId")
        public Long sellerId;

        @NameInMap("ShopPromInstVOS")
        public java.util.List<RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosShopPromInstVOS> shopPromInstVOS;

        @NameInMap("TbShopName")
        public String tbShopName;

        public static RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfos build(java.util.Map<String, ?> map) throws Exception {
            RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfos self = new RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfos();
            return TeaModel.build(map, self);
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfos setCanSell(Boolean canSell) {
            this.canSell = canSell;
            return this;
        }
        public Boolean getCanSell() {
            return this.canSell;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfos setDeliveryInfos(java.util.List<RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosDeliveryInfos> deliveryInfos) {
            this.deliveryInfos = deliveryInfos;
            return this;
        }
        public java.util.List<RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosDeliveryInfos> getDeliveryInfos() {
            return this.deliveryInfos;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfos setExtInfo(java.util.Map<String, String> extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public java.util.Map<String, String> getExtInfo() {
            return this.extInfo;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfos setInvoiceInfo(RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosInvoiceInfo invoiceInfo) {
            this.invoiceInfo = invoiceInfo;
            return this;
        }
        public RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosInvoiceInfo getInvoiceInfo() {
            return this.invoiceInfo;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfos setLmItemInfos(java.util.List<RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosLmItemInfos> lmItemInfos) {
            this.lmItemInfos = lmItemInfos;
            return this;
        }
        public java.util.List<RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosLmItemInfos> getLmItemInfos() {
            return this.lmItemInfos;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfos setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfos setSellerId(Long sellerId) {
            this.sellerId = sellerId;
            return this;
        }
        public Long getSellerId() {
            return this.sellerId;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfos setShopPromInstVOS(java.util.List<RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosShopPromInstVOS> shopPromInstVOS) {
            this.shopPromInstVOS = shopPromInstVOS;
            return this;
        }
        public java.util.List<RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfosShopPromInstVOS> getShopPromInstVOS() {
            return this.shopPromInstVOS;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfos setTbShopName(String tbShopName) {
            this.tbShopName = tbShopName;
            return this;
        }
        public String getTbShopName() {
            return this.tbShopName;
        }

    }

    public static class RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosDeliveryInfos extends TeaModel {
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>id</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PostFee")
        public Long postFee;

        /**
         * <strong>example:</strong>
         * <p>-4</p>
         */
        @NameInMap("ServiceType")
        public Long serviceType;

        public static RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosDeliveryInfos build(java.util.Map<String, ?> map) throws Exception {
            RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosDeliveryInfos self = new RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosDeliveryInfos();
            return TeaModel.build(map, self);
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosDeliveryInfos setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosDeliveryInfos setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosDeliveryInfos setPostFee(Long postFee) {
            this.postFee = postFee;
            return this;
        }
        public Long getPostFee() {
            return this.postFee;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosDeliveryInfos setServiceType(Long serviceType) {
            this.serviceType = serviceType;
            return this;
        }
        public Long getServiceType() {
            return this.serviceType;
        }

    }

    public static class RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosInvoiceInfo extends TeaModel {
        @NameInMap("Desc")
        public String desc;

        @NameInMap("Type")
        public String type;

        public static RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosInvoiceInfo build(java.util.Map<String, ?> map) throws Exception {
            RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosInvoiceInfo self = new RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosInvoiceInfo();
            return TeaModel.build(map, self);
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosInvoiceInfo setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosInvoiceInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosLmItemInfosItemPromInstVOSAvailableItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>413***546</p>
         */
        @NameInMap("ItemId")
        public Long itemId;

        /**
         * <strong>example:</strong>
         * <p>100<em><strong>03-680</strong></em>926</p>
         */
        @NameInMap("LmItemId")
        public String lmItemId;

        /**
         * <strong>example:</strong>
         * <p>100***92</p>
         */
        @NameInMap("LmShopId")
        public Long lmShopId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Number")
        public Integer number;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Points")
        public Long points;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PointsAmount")
        public Long pointsAmount;

        /**
         * <strong>example:</strong>
         * <p>2950</p>
         */
        @NameInMap("PriceCent")
        public Long priceCent;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Removed")
        public Boolean removed;

        /**
         * <p>skuid</p>
         * 
         * <strong>example:</strong>
         * <p>504***414</p>
         */
        @NameInMap("SkuId")
        public Long skuId;

        /**
         * <strong>example:</strong>
         * <p>21***31</p>
         */
        @NameInMap("TbSellerId")
        public Long tbSellerId;

        /**
         * <strong>example:</strong>
         * <p>2950</p>
         */
        @NameInMap("UserPayFee")
        public Long userPayFee;

        public static RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosLmItemInfosItemPromInstVOSAvailableItems build(java.util.Map<String, ?> map) throws Exception {
            RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosLmItemInfosItemPromInstVOSAvailableItems self = new RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosLmItemInfosItemPromInstVOSAvailableItems();
            return TeaModel.build(map, self);
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosLmItemInfosItemPromInstVOSAvailableItems setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosLmItemInfosItemPromInstVOSAvailableItems setLmItemId(String lmItemId) {
            this.lmItemId = lmItemId;
            return this;
        }
        public String getLmItemId() {
            return this.lmItemId;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosLmItemInfosItemPromInstVOSAvailableItems setLmShopId(Long lmShopId) {
            this.lmShopId = lmShopId;
            return this;
        }
        public Long getLmShopId() {
            return this.lmShopId;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosLmItemInfosItemPromInstVOSAvailableItems setNumber(Integer number) {
            this.number = number;
            return this;
        }
        public Integer getNumber() {
            return this.number;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosLmItemInfosItemPromInstVOSAvailableItems setPoints(Long points) {
            this.points = points;
            return this;
        }
        public Long getPoints() {
            return this.points;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosLmItemInfosItemPromInstVOSAvailableItems setPointsAmount(Long pointsAmount) {
            this.pointsAmount = pointsAmount;
            return this;
        }
        public Long getPointsAmount() {
            return this.pointsAmount;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosLmItemInfosItemPromInstVOSAvailableItems setPriceCent(Long priceCent) {
            this.priceCent = priceCent;
            return this;
        }
        public Long getPriceCent() {
            return this.priceCent;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosLmItemInfosItemPromInstVOSAvailableItems setRemoved(Boolean removed) {
            this.removed = removed;
            return this;
        }
        public Boolean getRemoved() {
            return this.removed;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosLmItemInfosItemPromInstVOSAvailableItems setSkuId(Long skuId) {
            this.skuId = skuId;
            return this;
        }
        public Long getSkuId() {
            return this.skuId;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosLmItemInfosItemPromInstVOSAvailableItems setTbSellerId(Long tbSellerId) {
            this.tbSellerId = tbSellerId;
            return this;
        }
        public Long getTbSellerId() {
            return this.tbSellerId;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosLmItemInfosItemPromInstVOSAvailableItems setUserPayFee(Long userPayFee) {
            this.userPayFee = userPayFee;
            return this;
        }
        public Long getUserPayFee() {
            return this.userPayFee;
        }

    }

    public static class RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosLmItemInfosItemPromInstVOS extends TeaModel {
        @NameInMap("AvailableItems")
        public java.util.List<RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosLmItemInfosItemPromInstVOSAvailableItems> availableItems;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("CanUse")
        public Boolean canUse;

        /**
         * <strong>example:</strong>
         * <p>600</p>
         */
        @NameInMap("DiscountPrice")
        public Long discountPrice;

        /**
         * <strong>example:</strong>
         * <p>1659612158</p>
         */
        @NameInMap("ExpireTime")
        public Long expireTime;

        /**
         * <strong>example:</strong>
         * <p>324***253</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <strong>example:</strong>
         * <p>100<em><strong>17-6511</strong></em>700</p>
         */
        @NameInMap("LmItemId")
        public String lmItemId;

        @NameInMap("PromotionName")
        public String promotionName;

        @NameInMap("PromotionType")
        public String promotionType;

        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Selected")
        public Boolean selected;

        /**
         * <p>skuid</p>
         */
        @NameInMap("SkuIds")
        public java.util.List<Long> skuIds;

        /**
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("SpecialPrice")
        public Long specialPrice;

        /**
         * <strong>example:</strong>
         * <p>9b1f9bd***b774c0</p>
         */
        @NameInMap("SubBizCode")
        public String subBizCode;

        /**
         * <strong>example:</strong>
         * <p>324***242</p>
         */
        @NameInMap("TbSellerId")
        public Long tbSellerId;

        /**
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("ThresholdPrice")
        public Long thresholdPrice;

        /**
         * <strong>example:</strong>
         * <p>1659612158</p>
         */
        @NameInMap("UseStartTime")
        public Long useStartTime;

        public static RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosLmItemInfosItemPromInstVOS build(java.util.Map<String, ?> map) throws Exception {
            RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosLmItemInfosItemPromInstVOS self = new RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosLmItemInfosItemPromInstVOS();
            return TeaModel.build(map, self);
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosLmItemInfosItemPromInstVOS setAvailableItems(java.util.List<RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosLmItemInfosItemPromInstVOSAvailableItems> availableItems) {
            this.availableItems = availableItems;
            return this;
        }
        public java.util.List<RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosLmItemInfosItemPromInstVOSAvailableItems> getAvailableItems() {
            return this.availableItems;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosLmItemInfosItemPromInstVOS setCanUse(Boolean canUse) {
            this.canUse = canUse;
            return this;
        }
        public Boolean getCanUse() {
            return this.canUse;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosLmItemInfosItemPromInstVOS setDiscountPrice(Long discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public Long getDiscountPrice() {
            return this.discountPrice;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosLmItemInfosItemPromInstVOS setExpireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Long getExpireTime() {
            return this.expireTime;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosLmItemInfosItemPromInstVOS setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosLmItemInfosItemPromInstVOS setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosLmItemInfosItemPromInstVOS setLmItemId(String lmItemId) {
            this.lmItemId = lmItemId;
            return this;
        }
        public String getLmItemId() {
            return this.lmItemId;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosLmItemInfosItemPromInstVOS setPromotionName(String promotionName) {
            this.promotionName = promotionName;
            return this;
        }
        public String getPromotionName() {
            return this.promotionName;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosLmItemInfosItemPromInstVOS setPromotionType(String promotionType) {
            this.promotionType = promotionType;
            return this;
        }
        public String getPromotionType() {
            return this.promotionType;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosLmItemInfosItemPromInstVOS setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosLmItemInfosItemPromInstVOS setSelected(Boolean selected) {
            this.selected = selected;
            return this;
        }
        public Boolean getSelected() {
            return this.selected;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosLmItemInfosItemPromInstVOS setSkuIds(java.util.List<Long> skuIds) {
            this.skuIds = skuIds;
            return this;
        }
        public java.util.List<Long> getSkuIds() {
            return this.skuIds;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosLmItemInfosItemPromInstVOS setSpecialPrice(Long specialPrice) {
            this.specialPrice = specialPrice;
            return this;
        }
        public Long getSpecialPrice() {
            return this.specialPrice;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosLmItemInfosItemPromInstVOS setSubBizCode(String subBizCode) {
            this.subBizCode = subBizCode;
            return this;
        }
        public String getSubBizCode() {
            return this.subBizCode;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosLmItemInfosItemPromInstVOS setTbSellerId(Long tbSellerId) {
            this.tbSellerId = tbSellerId;
            return this;
        }
        public Long getTbSellerId() {
            return this.tbSellerId;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosLmItemInfosItemPromInstVOS setThresholdPrice(Long thresholdPrice) {
            this.thresholdPrice = thresholdPrice;
            return this;
        }
        public Long getThresholdPrice() {
            return this.thresholdPrice;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosLmItemInfosItemPromInstVOS setUseStartTime(Long useStartTime) {
            this.useStartTime = useStartTime;
            return this;
        }
        public Long getUseStartTime() {
            return this.useStartTime;
        }

    }

    public static class RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosLmItemInfos extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("ActualPrice")
        public Long actualPrice;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("CanSell")
        public Boolean canSell;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Cash")
        public Long cash;

        @NameInMap("Features")
        public java.util.Map<String, String> features;

        /**
         * <strong>example:</strong>
         * <p>651***245</p>
         */
        @NameInMap("ItemId")
        public Long itemId;

        @NameInMap("ItemName")
        public String itemName;

        /**
         * <strong>example:</strong>
         * <p><a href="https://aliyundoc.com">https://aliyundoc.com</a></p>
         */
        @NameInMap("ItemPicUrl")
        public String itemPicUrl;

        @NameInMap("ItemPromInstVOS")
        public java.util.List<RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosLmItemInfosItemPromInstVOS> itemPromInstVOS;

        /**
         * <strong>example:</strong>
         * <p><a href="https://aliyundoc.com">https://aliyundoc.com</a></p>
         */
        @NameInMap("ItemUrl")
        public String itemUrl;

        /**
         * <strong>example:</strong>
         * <p>100<em><strong>87-644</strong></em>2078</p>
         */
        @NameInMap("LmItemId")
        public String lmItemId;

        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PointPrice")
        public Long pointPrice;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Points")
        public Long points;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PromotionFee")
        public Long promotionFee;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Quantity")
        public Integer quantity;

        /**
         * <strong>example:</strong>
         * <p>999</p>
         */
        @NameInMap("ReservePrice")
        public Long reservePrice;

        /**
         * <strong>example:</strong>
         * <p>218***608</p>
         */
        @NameInMap("SellerId")
        public Long sellerId;

        @NameInMap("SellerNick")
        public String sellerNick;

        /**
         * <p>skuid</p>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        @NameInMap("SkuId")
        public Long skuId;

        /**
         * <strong>example:</strong>
         * <p>500g</p>
         */
        @NameInMap("SkuName")
        public String skuName;

        @NameInMap("TbShopName")
        public String tbShopName;

        @NameInMap("VirtualItemType")
        public String virtualItemType;

        public static RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosLmItemInfos build(java.util.Map<String, ?> map) throws Exception {
            RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosLmItemInfos self = new RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosLmItemInfos();
            return TeaModel.build(map, self);
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosLmItemInfos setActualPrice(Long actualPrice) {
            this.actualPrice = actualPrice;
            return this;
        }
        public Long getActualPrice() {
            return this.actualPrice;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosLmItemInfos setCanSell(Boolean canSell) {
            this.canSell = canSell;
            return this;
        }
        public Boolean getCanSell() {
            return this.canSell;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosLmItemInfos setCash(Long cash) {
            this.cash = cash;
            return this;
        }
        public Long getCash() {
            return this.cash;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosLmItemInfos setFeatures(java.util.Map<String, String> features) {
            this.features = features;
            return this;
        }
        public java.util.Map<String, String> getFeatures() {
            return this.features;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosLmItemInfos setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosLmItemInfos setItemName(String itemName) {
            this.itemName = itemName;
            return this;
        }
        public String getItemName() {
            return this.itemName;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosLmItemInfos setItemPicUrl(String itemPicUrl) {
            this.itemPicUrl = itemPicUrl;
            return this;
        }
        public String getItemPicUrl() {
            return this.itemPicUrl;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosLmItemInfos setItemPromInstVOS(java.util.List<RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosLmItemInfosItemPromInstVOS> itemPromInstVOS) {
            this.itemPromInstVOS = itemPromInstVOS;
            return this;
        }
        public java.util.List<RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosLmItemInfosItemPromInstVOS> getItemPromInstVOS() {
            return this.itemPromInstVOS;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosLmItemInfos setItemUrl(String itemUrl) {
            this.itemUrl = itemUrl;
            return this;
        }
        public String getItemUrl() {
            return this.itemUrl;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosLmItemInfos setLmItemId(String lmItemId) {
            this.lmItemId = lmItemId;
            return this;
        }
        public String getLmItemId() {
            return this.lmItemId;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosLmItemInfos setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosLmItemInfos setPointPrice(Long pointPrice) {
            this.pointPrice = pointPrice;
            return this;
        }
        public Long getPointPrice() {
            return this.pointPrice;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosLmItemInfos setPoints(Long points) {
            this.points = points;
            return this;
        }
        public Long getPoints() {
            return this.points;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosLmItemInfos setPromotionFee(Long promotionFee) {
            this.promotionFee = promotionFee;
            return this;
        }
        public Long getPromotionFee() {
            return this.promotionFee;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosLmItemInfos setQuantity(Integer quantity) {
            this.quantity = quantity;
            return this;
        }
        public Integer getQuantity() {
            return this.quantity;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosLmItemInfos setReservePrice(Long reservePrice) {
            this.reservePrice = reservePrice;
            return this;
        }
        public Long getReservePrice() {
            return this.reservePrice;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosLmItemInfos setSellerId(Long sellerId) {
            this.sellerId = sellerId;
            return this;
        }
        public Long getSellerId() {
            return this.sellerId;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosLmItemInfos setSellerNick(String sellerNick) {
            this.sellerNick = sellerNick;
            return this;
        }
        public String getSellerNick() {
            return this.sellerNick;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosLmItemInfos setSkuId(Long skuId) {
            this.skuId = skuId;
            return this;
        }
        public Long getSkuId() {
            return this.skuId;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosLmItemInfos setSkuName(String skuName) {
            this.skuName = skuName;
            return this;
        }
        public String getSkuName() {
            return this.skuName;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosLmItemInfos setTbShopName(String tbShopName) {
            this.tbShopName = tbShopName;
            return this;
        }
        public String getTbShopName() {
            return this.tbShopName;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosLmItemInfos setVirtualItemType(String virtualItemType) {
            this.virtualItemType = virtualItemType;
            return this;
        }
        public String getVirtualItemType() {
            return this.virtualItemType;
        }

    }

    public static class RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosShopPromInstVOSAvailableItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>661***792</p>
         */
        @NameInMap("ItemId")
        public Long itemId;

        /**
         * <strong>example:</strong>
         * <p>100<em><strong>66-633</strong></em>108</p>
         */
        @NameInMap("LmItemId")
        public String lmItemId;

        /**
         * <strong>example:</strong>
         * <p>100***92</p>
         */
        @NameInMap("LmShopId")
        public Long lmShopId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Number")
        public Integer number;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Points")
        public Long points;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PointsAmount")
        public Long pointsAmount;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("PriceCent")
        public Long priceCent;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Removed")
        public Boolean removed;

        /**
         * <strong>example:</strong>
         * <p>502***2291</p>
         */
        @NameInMap("SkuId")
        public Long skuId;

        /**
         * <strong>example:</strong>
         * <p>3432***42</p>
         */
        @NameInMap("TbSellerId")
        public Long tbSellerId;

        /**
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("UserPayFee")
        public Long userPayFee;

        public static RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosShopPromInstVOSAvailableItems build(java.util.Map<String, ?> map) throws Exception {
            RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosShopPromInstVOSAvailableItems self = new RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosShopPromInstVOSAvailableItems();
            return TeaModel.build(map, self);
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosShopPromInstVOSAvailableItems setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosShopPromInstVOSAvailableItems setLmItemId(String lmItemId) {
            this.lmItemId = lmItemId;
            return this;
        }
        public String getLmItemId() {
            return this.lmItemId;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosShopPromInstVOSAvailableItems setLmShopId(Long lmShopId) {
            this.lmShopId = lmShopId;
            return this;
        }
        public Long getLmShopId() {
            return this.lmShopId;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosShopPromInstVOSAvailableItems setNumber(Integer number) {
            this.number = number;
            return this;
        }
        public Integer getNumber() {
            return this.number;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosShopPromInstVOSAvailableItems setPoints(Long points) {
            this.points = points;
            return this;
        }
        public Long getPoints() {
            return this.points;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosShopPromInstVOSAvailableItems setPointsAmount(Long pointsAmount) {
            this.pointsAmount = pointsAmount;
            return this;
        }
        public Long getPointsAmount() {
            return this.pointsAmount;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosShopPromInstVOSAvailableItems setPriceCent(Long priceCent) {
            this.priceCent = priceCent;
            return this;
        }
        public Long getPriceCent() {
            return this.priceCent;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosShopPromInstVOSAvailableItems setRemoved(Boolean removed) {
            this.removed = removed;
            return this;
        }
        public Boolean getRemoved() {
            return this.removed;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosShopPromInstVOSAvailableItems setSkuId(Long skuId) {
            this.skuId = skuId;
            return this;
        }
        public Long getSkuId() {
            return this.skuId;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosShopPromInstVOSAvailableItems setTbSellerId(Long tbSellerId) {
            this.tbSellerId = tbSellerId;
            return this;
        }
        public Long getTbSellerId() {
            return this.tbSellerId;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosShopPromInstVOSAvailableItems setUserPayFee(Long userPayFee) {
            this.userPayFee = userPayFee;
            return this;
        }
        public Long getUserPayFee() {
            return this.userPayFee;
        }

    }

    public static class RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosShopPromInstVOS extends TeaModel {
        @NameInMap("AvailableItems")
        public java.util.List<RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosShopPromInstVOSAvailableItems> availableItems;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("CanUse")
        public Boolean canUse;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DiscountPrice")
        public Long discountPrice;

        /**
         * <strong>example:</strong>
         * <p>1659612158</p>
         */
        @NameInMap("ExpireTime")
        public Long expireTime;

        /**
         * <strong>example:</strong>
         * <p>232***777</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <strong>example:</strong>
         * <p>100<em><strong>95-625</strong></em>772</p>
         */
        @NameInMap("LmItemId")
        public String lmItemId;

        @NameInMap("PromotionName")
        public String promotionName;

        @NameInMap("PromotionType")
        public String promotionType;

        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Selected")
        public Boolean selected;

        @NameInMap("SkuIds")
        public java.util.List<Long> skuIds;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SpecialPrice")
        public Long specialPrice;

        /**
         * <strong>example:</strong>
         * <p>fa7a31***7787b2</p>
         */
        @NameInMap("SubBizCode")
        public String subBizCode;

        /**
         * <strong>example:</strong>
         * <p>44***53</p>
         */
        @NameInMap("TbSellerId")
        public Long tbSellerId;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ThresholdPrice")
        public Long thresholdPrice;

        /**
         * <strong>example:</strong>
         * <p>1659612158</p>
         */
        @NameInMap("UseStartTime")
        public Long useStartTime;

        public static RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosShopPromInstVOS build(java.util.Map<String, ?> map) throws Exception {
            RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosShopPromInstVOS self = new RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosShopPromInstVOS();
            return TeaModel.build(map, self);
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosShopPromInstVOS setAvailableItems(java.util.List<RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosShopPromInstVOSAvailableItems> availableItems) {
            this.availableItems = availableItems;
            return this;
        }
        public java.util.List<RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosShopPromInstVOSAvailableItems> getAvailableItems() {
            return this.availableItems;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosShopPromInstVOS setCanUse(Boolean canUse) {
            this.canUse = canUse;
            return this;
        }
        public Boolean getCanUse() {
            return this.canUse;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosShopPromInstVOS setDiscountPrice(Long discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public Long getDiscountPrice() {
            return this.discountPrice;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosShopPromInstVOS setExpireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Long getExpireTime() {
            return this.expireTime;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosShopPromInstVOS setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosShopPromInstVOS setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosShopPromInstVOS setLmItemId(String lmItemId) {
            this.lmItemId = lmItemId;
            return this;
        }
        public String getLmItemId() {
            return this.lmItemId;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosShopPromInstVOS setPromotionName(String promotionName) {
            this.promotionName = promotionName;
            return this;
        }
        public String getPromotionName() {
            return this.promotionName;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosShopPromInstVOS setPromotionType(String promotionType) {
            this.promotionType = promotionType;
            return this;
        }
        public String getPromotionType() {
            return this.promotionType;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosShopPromInstVOS setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosShopPromInstVOS setSelected(Boolean selected) {
            this.selected = selected;
            return this;
        }
        public Boolean getSelected() {
            return this.selected;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosShopPromInstVOS setSkuIds(java.util.List<Long> skuIds) {
            this.skuIds = skuIds;
            return this;
        }
        public java.util.List<Long> getSkuIds() {
            return this.skuIds;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosShopPromInstVOS setSpecialPrice(Long specialPrice) {
            this.specialPrice = specialPrice;
            return this;
        }
        public Long getSpecialPrice() {
            return this.specialPrice;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosShopPromInstVOS setSubBizCode(String subBizCode) {
            this.subBizCode = subBizCode;
            return this;
        }
        public String getSubBizCode() {
            return this.subBizCode;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosShopPromInstVOS setTbSellerId(Long tbSellerId) {
            this.tbSellerId = tbSellerId;
            return this;
        }
        public Long getTbSellerId() {
            return this.tbSellerId;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosShopPromInstVOS setThresholdPrice(Long thresholdPrice) {
            this.thresholdPrice = thresholdPrice;
            return this;
        }
        public Long getThresholdPrice() {
            return this.thresholdPrice;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosShopPromInstVOS setUseStartTime(Long useStartTime) {
            this.useStartTime = useStartTime;
            return this;
        }
        public Long getUseStartTime() {
            return this.useStartTime;
        }

    }

    public static class RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfos extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("CanSell")
        public Boolean canSell;

        @NameInMap("DeliveryInfos")
        public java.util.List<RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosDeliveryInfos> deliveryInfos;

        @NameInMap("ExtInfo")
        public java.util.Map<String, String> extInfo;

        @NameInMap("InvoiceInfo")
        public RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosInvoiceInfo invoiceInfo;

        @NameInMap("LmItemInfos")
        public java.util.List<RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosLmItemInfos> lmItemInfos;

        @NameInMap("Message")
        public String message;

        /**
         * <strong>example:</strong>
         * <p>2204***416</p>
         */
        @NameInMap("SellerId")
        public Long sellerId;

        @NameInMap("ShopPromInstVOS")
        public java.util.List<RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosShopPromInstVOS> shopPromInstVOS;

        @NameInMap("TbShopName")
        public String tbShopName;

        public static RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfos build(java.util.Map<String, ?> map) throws Exception {
            RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfos self = new RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfos();
            return TeaModel.build(map, self);
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfos setCanSell(Boolean canSell) {
            this.canSell = canSell;
            return this;
        }
        public Boolean getCanSell() {
            return this.canSell;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfos setDeliveryInfos(java.util.List<RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosDeliveryInfos> deliveryInfos) {
            this.deliveryInfos = deliveryInfos;
            return this;
        }
        public java.util.List<RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosDeliveryInfos> getDeliveryInfos() {
            return this.deliveryInfos;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfos setExtInfo(java.util.Map<String, String> extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public java.util.Map<String, String> getExtInfo() {
            return this.extInfo;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfos setInvoiceInfo(RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosInvoiceInfo invoiceInfo) {
            this.invoiceInfo = invoiceInfo;
            return this;
        }
        public RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosInvoiceInfo getInvoiceInfo() {
            return this.invoiceInfo;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfos setLmItemInfos(java.util.List<RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosLmItemInfos> lmItemInfos) {
            this.lmItemInfos = lmItemInfos;
            return this;
        }
        public java.util.List<RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosLmItemInfos> getLmItemInfos() {
            return this.lmItemInfos;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfos setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfos setSellerId(Long sellerId) {
            this.sellerId = sellerId;
            return this;
        }
        public Long getSellerId() {
            return this.sellerId;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfos setShopPromInstVOS(java.util.List<RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosShopPromInstVOS> shopPromInstVOS) {
            this.shopPromInstVOS = shopPromInstVOS;
            return this;
        }
        public java.util.List<RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfosShopPromInstVOS> getShopPromInstVOS() {
            return this.shopPromInstVOS;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfos setTbShopName(String tbShopName) {
            this.tbShopName = tbShopName;
            return this;
        }
        public String getTbShopName() {
            return this.tbShopName;
        }

    }

    public static class RenderOrderWithDesignatedTbUidResponseBodyModel extends TeaModel {
        @NameInMap("AddressInfos")
        public java.util.List<RenderOrderWithDesignatedTbUidResponseBodyModelAddressInfos> addressInfos;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("BuyerCurrentPoints")
        public Long buyerCurrentPoints;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("CanSell")
        public Boolean canSell;

        @NameInMap("ExtInfo")
        public java.util.Map<String, String> extInfo;

        /**
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("Message")
        public String message;

        @NameInMap("RenderOrderInfos")
        public java.util.List<RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfos> renderOrderInfos;

        @NameInMap("UnsellableRenderOrderInfos")
        public java.util.List<RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfos> unsellableRenderOrderInfos;

        public static RenderOrderWithDesignatedTbUidResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            RenderOrderWithDesignatedTbUidResponseBodyModel self = new RenderOrderWithDesignatedTbUidResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModel setAddressInfos(java.util.List<RenderOrderWithDesignatedTbUidResponseBodyModelAddressInfos> addressInfos) {
            this.addressInfos = addressInfos;
            return this;
        }
        public java.util.List<RenderOrderWithDesignatedTbUidResponseBodyModelAddressInfos> getAddressInfos() {
            return this.addressInfos;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModel setBuyerCurrentPoints(Long buyerCurrentPoints) {
            this.buyerCurrentPoints = buyerCurrentPoints;
            return this;
        }
        public Long getBuyerCurrentPoints() {
            return this.buyerCurrentPoints;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModel setCanSell(Boolean canSell) {
            this.canSell = canSell;
            return this;
        }
        public Boolean getCanSell() {
            return this.canSell;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModel setExtInfo(java.util.Map<String, String> extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public java.util.Map<String, String> getExtInfo() {
            return this.extInfo;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModel setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModel setRenderOrderInfos(java.util.List<RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfos> renderOrderInfos) {
            this.renderOrderInfos = renderOrderInfos;
            return this;
        }
        public java.util.List<RenderOrderWithDesignatedTbUidResponseBodyModelRenderOrderInfos> getRenderOrderInfos() {
            return this.renderOrderInfos;
        }

        public RenderOrderWithDesignatedTbUidResponseBodyModel setUnsellableRenderOrderInfos(java.util.List<RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfos> unsellableRenderOrderInfos) {
            this.unsellableRenderOrderInfos = unsellableRenderOrderInfos;
            return this;
        }
        public java.util.List<RenderOrderWithDesignatedTbUidResponseBodyModelUnsellableRenderOrderInfos> getUnsellableRenderOrderInfos() {
            return this.unsellableRenderOrderInfos;
        }

    }

}
