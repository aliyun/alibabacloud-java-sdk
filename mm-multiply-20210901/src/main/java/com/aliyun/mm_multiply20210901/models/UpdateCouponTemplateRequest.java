// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class UpdateCouponTemplateRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("CouponTemplateDTO")
    public UpdateCouponTemplateRequestCouponTemplateDTO couponTemplateDTO;

    public static UpdateCouponTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCouponTemplateRequest self = new UpdateCouponTemplateRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCouponTemplateRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public UpdateCouponTemplateRequest setCouponTemplateDTO(UpdateCouponTemplateRequestCouponTemplateDTO couponTemplateDTO) {
        this.couponTemplateDTO = couponTemplateDTO;
        return this;
    }
    public UpdateCouponTemplateRequestCouponTemplateDTO getCouponTemplateDTO() {
        return this.couponTemplateDTO;
    }

    public static class UpdateCouponTemplateRequestCouponTemplateDTO extends TeaModel {
        @NameInMap("AlipayImgUrl")
        public String alipayImgUrl;

        @NameInMap("AlipayJumpLabel")
        public String alipayJumpLabel;

        @NameInMap("AlipayJumpTable")
        public String alipayJumpTable;

        @NameInMap("AlipayJumpUrl")
        public String alipayJumpUrl;

        @NameInMap("AlipaySendCount")
        public Long alipaySendCount;

        @NameInMap("ChannelCode")
        public String channelCode;

        @NameInMap("DecreaseMoney")
        public String decreaseMoney;

        @NameInMap("DecreaseType")
        public Integer decreaseType;

        @NameInMap("Discount")
        public String discount;

        @NameInMap("EffectiveDelayInterval")
        public Integer effectiveDelayInterval;

        @NameInMap("EffectiveEndTime")
        public String effectiveEndTime;

        @NameInMap("EffectiveInterval")
        public Integer effectiveInterval;

        @NameInMap("EffectiveStartTime")
        public String effectiveStartTime;

        @NameInMap("EffectiveType")
        public Integer effectiveType;

        @NameInMap("Id")
        public String id;

        @NameInMap("Instruction")
        public String instruction;

        @NameInMap("ItemFixPrice")
        public String itemFixPrice;

        @NameInMap("ItemSalePrice")
        public String itemSalePrice;

        @NameInMap("JumpLabel")
        public String jumpLabel;

        @NameInMap("JumpTable")
        public String jumpTable;

        @NameInMap("JumpUrl")
        public String jumpUrl;

        @NameInMap("MaxDecreaseMoney")
        public String maxDecreaseMoney;

        @NameInMap("OnlineEndTime")
        public String onlineEndTime;

        @NameInMap("OnlineStartTime")
        public String onlineStartTime;

        @NameInMap("OriginalPriceTag")
        public Boolean originalPriceTag;

        @NameInMap("Overlay")
        public Boolean overlay;

        @NameInMap("PersonLimitCount")
        public Long personLimitCount;

        @NameInMap("PersonTotalCount")
        public Long personTotalCount;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("RestrictType")
        public Integer restrictType;

        @NameInMap("RestrictValue")
        public String restrictValue;

        @NameInMap("ScopeId")
        public java.util.List<String> scopeId;

        @NameInMap("ScopeName")
        public String scopeName;

        @NameInMap("ScopeType")
        public Integer scopeType;

        @NameInMap("StartInterval")
        public String startInterval;

        @NameInMap("StartType")
        public Integer startType;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("SyncTag")
        public Boolean syncTag;

        @NameInMap("Title")
        public String title;

        @NameInMap("TotalCount")
        public Long totalCount;

        @NameInMap("Type")
        public Integer type;

        @NameInMap("WechatExt")
        public String wechatExt;

        @NameInMap("WechatSendCount")
        public Long wechatSendCount;

        public static UpdateCouponTemplateRequestCouponTemplateDTO build(java.util.Map<String, ?> map) throws Exception {
            UpdateCouponTemplateRequestCouponTemplateDTO self = new UpdateCouponTemplateRequestCouponTemplateDTO();
            return TeaModel.build(map, self);
        }

        public UpdateCouponTemplateRequestCouponTemplateDTO setAlipayImgUrl(String alipayImgUrl) {
            this.alipayImgUrl = alipayImgUrl;
            return this;
        }
        public String getAlipayImgUrl() {
            return this.alipayImgUrl;
        }

        public UpdateCouponTemplateRequestCouponTemplateDTO setAlipayJumpLabel(String alipayJumpLabel) {
            this.alipayJumpLabel = alipayJumpLabel;
            return this;
        }
        public String getAlipayJumpLabel() {
            return this.alipayJumpLabel;
        }

        public UpdateCouponTemplateRequestCouponTemplateDTO setAlipayJumpTable(String alipayJumpTable) {
            this.alipayJumpTable = alipayJumpTable;
            return this;
        }
        public String getAlipayJumpTable() {
            return this.alipayJumpTable;
        }

        public UpdateCouponTemplateRequestCouponTemplateDTO setAlipayJumpUrl(String alipayJumpUrl) {
            this.alipayJumpUrl = alipayJumpUrl;
            return this;
        }
        public String getAlipayJumpUrl() {
            return this.alipayJumpUrl;
        }

        public UpdateCouponTemplateRequestCouponTemplateDTO setAlipaySendCount(Long alipaySendCount) {
            this.alipaySendCount = alipaySendCount;
            return this;
        }
        public Long getAlipaySendCount() {
            return this.alipaySendCount;
        }

        public UpdateCouponTemplateRequestCouponTemplateDTO setChannelCode(String channelCode) {
            this.channelCode = channelCode;
            return this;
        }
        public String getChannelCode() {
            return this.channelCode;
        }

        public UpdateCouponTemplateRequestCouponTemplateDTO setDecreaseMoney(String decreaseMoney) {
            this.decreaseMoney = decreaseMoney;
            return this;
        }
        public String getDecreaseMoney() {
            return this.decreaseMoney;
        }

        public UpdateCouponTemplateRequestCouponTemplateDTO setDecreaseType(Integer decreaseType) {
            this.decreaseType = decreaseType;
            return this;
        }
        public Integer getDecreaseType() {
            return this.decreaseType;
        }

        public UpdateCouponTemplateRequestCouponTemplateDTO setDiscount(String discount) {
            this.discount = discount;
            return this;
        }
        public String getDiscount() {
            return this.discount;
        }

        public UpdateCouponTemplateRequestCouponTemplateDTO setEffectiveDelayInterval(Integer effectiveDelayInterval) {
            this.effectiveDelayInterval = effectiveDelayInterval;
            return this;
        }
        public Integer getEffectiveDelayInterval() {
            return this.effectiveDelayInterval;
        }

        public UpdateCouponTemplateRequestCouponTemplateDTO setEffectiveEndTime(String effectiveEndTime) {
            this.effectiveEndTime = effectiveEndTime;
            return this;
        }
        public String getEffectiveEndTime() {
            return this.effectiveEndTime;
        }

        public UpdateCouponTemplateRequestCouponTemplateDTO setEffectiveInterval(Integer effectiveInterval) {
            this.effectiveInterval = effectiveInterval;
            return this;
        }
        public Integer getEffectiveInterval() {
            return this.effectiveInterval;
        }

        public UpdateCouponTemplateRequestCouponTemplateDTO setEffectiveStartTime(String effectiveStartTime) {
            this.effectiveStartTime = effectiveStartTime;
            return this;
        }
        public String getEffectiveStartTime() {
            return this.effectiveStartTime;
        }

        public UpdateCouponTemplateRequestCouponTemplateDTO setEffectiveType(Integer effectiveType) {
            this.effectiveType = effectiveType;
            return this;
        }
        public Integer getEffectiveType() {
            return this.effectiveType;
        }

        public UpdateCouponTemplateRequestCouponTemplateDTO setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public UpdateCouponTemplateRequestCouponTemplateDTO setInstruction(String instruction) {
            this.instruction = instruction;
            return this;
        }
        public String getInstruction() {
            return this.instruction;
        }

        public UpdateCouponTemplateRequestCouponTemplateDTO setItemFixPrice(String itemFixPrice) {
            this.itemFixPrice = itemFixPrice;
            return this;
        }
        public String getItemFixPrice() {
            return this.itemFixPrice;
        }

        public UpdateCouponTemplateRequestCouponTemplateDTO setItemSalePrice(String itemSalePrice) {
            this.itemSalePrice = itemSalePrice;
            return this;
        }
        public String getItemSalePrice() {
            return this.itemSalePrice;
        }

        public UpdateCouponTemplateRequestCouponTemplateDTO setJumpLabel(String jumpLabel) {
            this.jumpLabel = jumpLabel;
            return this;
        }
        public String getJumpLabel() {
            return this.jumpLabel;
        }

        public UpdateCouponTemplateRequestCouponTemplateDTO setJumpTable(String jumpTable) {
            this.jumpTable = jumpTable;
            return this;
        }
        public String getJumpTable() {
            return this.jumpTable;
        }

        public UpdateCouponTemplateRequestCouponTemplateDTO setJumpUrl(String jumpUrl) {
            this.jumpUrl = jumpUrl;
            return this;
        }
        public String getJumpUrl() {
            return this.jumpUrl;
        }

        public UpdateCouponTemplateRequestCouponTemplateDTO setMaxDecreaseMoney(String maxDecreaseMoney) {
            this.maxDecreaseMoney = maxDecreaseMoney;
            return this;
        }
        public String getMaxDecreaseMoney() {
            return this.maxDecreaseMoney;
        }

        public UpdateCouponTemplateRequestCouponTemplateDTO setOnlineEndTime(String onlineEndTime) {
            this.onlineEndTime = onlineEndTime;
            return this;
        }
        public String getOnlineEndTime() {
            return this.onlineEndTime;
        }

        public UpdateCouponTemplateRequestCouponTemplateDTO setOnlineStartTime(String onlineStartTime) {
            this.onlineStartTime = onlineStartTime;
            return this;
        }
        public String getOnlineStartTime() {
            return this.onlineStartTime;
        }

        public UpdateCouponTemplateRequestCouponTemplateDTO setOriginalPriceTag(Boolean originalPriceTag) {
            this.originalPriceTag = originalPriceTag;
            return this;
        }
        public Boolean getOriginalPriceTag() {
            return this.originalPriceTag;
        }

        public UpdateCouponTemplateRequestCouponTemplateDTO setOverlay(Boolean overlay) {
            this.overlay = overlay;
            return this;
        }
        public Boolean getOverlay() {
            return this.overlay;
        }

        public UpdateCouponTemplateRequestCouponTemplateDTO setPersonLimitCount(Long personLimitCount) {
            this.personLimitCount = personLimitCount;
            return this;
        }
        public Long getPersonLimitCount() {
            return this.personLimitCount;
        }

        public UpdateCouponTemplateRequestCouponTemplateDTO setPersonTotalCount(Long personTotalCount) {
            this.personTotalCount = personTotalCount;
            return this;
        }
        public Long getPersonTotalCount() {
            return this.personTotalCount;
        }

        public UpdateCouponTemplateRequestCouponTemplateDTO setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public UpdateCouponTemplateRequestCouponTemplateDTO setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public UpdateCouponTemplateRequestCouponTemplateDTO setRestrictType(Integer restrictType) {
            this.restrictType = restrictType;
            return this;
        }
        public Integer getRestrictType() {
            return this.restrictType;
        }

        public UpdateCouponTemplateRequestCouponTemplateDTO setRestrictValue(String restrictValue) {
            this.restrictValue = restrictValue;
            return this;
        }
        public String getRestrictValue() {
            return this.restrictValue;
        }

        public UpdateCouponTemplateRequestCouponTemplateDTO setScopeId(java.util.List<String> scopeId) {
            this.scopeId = scopeId;
            return this;
        }
        public java.util.List<String> getScopeId() {
            return this.scopeId;
        }

        public UpdateCouponTemplateRequestCouponTemplateDTO setScopeName(String scopeName) {
            this.scopeName = scopeName;
            return this;
        }
        public String getScopeName() {
            return this.scopeName;
        }

        public UpdateCouponTemplateRequestCouponTemplateDTO setScopeType(Integer scopeType) {
            this.scopeType = scopeType;
            return this;
        }
        public Integer getScopeType() {
            return this.scopeType;
        }

        public UpdateCouponTemplateRequestCouponTemplateDTO setStartInterval(String startInterval) {
            this.startInterval = startInterval;
            return this;
        }
        public String getStartInterval() {
            return this.startInterval;
        }

        public UpdateCouponTemplateRequestCouponTemplateDTO setStartType(Integer startType) {
            this.startType = startType;
            return this;
        }
        public Integer getStartType() {
            return this.startType;
        }

        public UpdateCouponTemplateRequestCouponTemplateDTO setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public UpdateCouponTemplateRequestCouponTemplateDTO setSyncTag(Boolean syncTag) {
            this.syncTag = syncTag;
            return this;
        }
        public Boolean getSyncTag() {
            return this.syncTag;
        }

        public UpdateCouponTemplateRequestCouponTemplateDTO setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public UpdateCouponTemplateRequestCouponTemplateDTO setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public UpdateCouponTemplateRequestCouponTemplateDTO setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public UpdateCouponTemplateRequestCouponTemplateDTO setWechatExt(String wechatExt) {
            this.wechatExt = wechatExt;
            return this;
        }
        public String getWechatExt() {
            return this.wechatExt;
        }

        public UpdateCouponTemplateRequestCouponTemplateDTO setWechatSendCount(Long wechatSendCount) {
            this.wechatSendCount = wechatSendCount;
            return this;
        }
        public Long getWechatSendCount() {
            return this.wechatSendCount;
        }

    }

}
