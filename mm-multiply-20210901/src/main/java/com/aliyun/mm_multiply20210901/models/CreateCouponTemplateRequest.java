// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class CreateCouponTemplateRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("CouponTemplateDTO")
    public CreateCouponTemplateRequestCouponTemplateDTO couponTemplateDTO;

    public static CreateCouponTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCouponTemplateRequest self = new CreateCouponTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateCouponTemplateRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public CreateCouponTemplateRequest setCouponTemplateDTO(CreateCouponTemplateRequestCouponTemplateDTO couponTemplateDTO) {
        this.couponTemplateDTO = couponTemplateDTO;
        return this;
    }
    public CreateCouponTemplateRequestCouponTemplateDTO getCouponTemplateDTO() {
        return this.couponTemplateDTO;
    }

    public static class CreateCouponTemplateRequestCouponTemplateDTO extends TeaModel {
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

        public static CreateCouponTemplateRequestCouponTemplateDTO build(java.util.Map<String, ?> map) throws Exception {
            CreateCouponTemplateRequestCouponTemplateDTO self = new CreateCouponTemplateRequestCouponTemplateDTO();
            return TeaModel.build(map, self);
        }

        public CreateCouponTemplateRequestCouponTemplateDTO setAlipayImgUrl(String alipayImgUrl) {
            this.alipayImgUrl = alipayImgUrl;
            return this;
        }
        public String getAlipayImgUrl() {
            return this.alipayImgUrl;
        }

        public CreateCouponTemplateRequestCouponTemplateDTO setAlipayJumpLabel(String alipayJumpLabel) {
            this.alipayJumpLabel = alipayJumpLabel;
            return this;
        }
        public String getAlipayJumpLabel() {
            return this.alipayJumpLabel;
        }

        public CreateCouponTemplateRequestCouponTemplateDTO setAlipayJumpTable(String alipayJumpTable) {
            this.alipayJumpTable = alipayJumpTable;
            return this;
        }
        public String getAlipayJumpTable() {
            return this.alipayJumpTable;
        }

        public CreateCouponTemplateRequestCouponTemplateDTO setAlipayJumpUrl(String alipayJumpUrl) {
            this.alipayJumpUrl = alipayJumpUrl;
            return this;
        }
        public String getAlipayJumpUrl() {
            return this.alipayJumpUrl;
        }

        public CreateCouponTemplateRequestCouponTemplateDTO setAlipaySendCount(Long alipaySendCount) {
            this.alipaySendCount = alipaySendCount;
            return this;
        }
        public Long getAlipaySendCount() {
            return this.alipaySendCount;
        }

        public CreateCouponTemplateRequestCouponTemplateDTO setChannelCode(String channelCode) {
            this.channelCode = channelCode;
            return this;
        }
        public String getChannelCode() {
            return this.channelCode;
        }

        public CreateCouponTemplateRequestCouponTemplateDTO setDecreaseMoney(String decreaseMoney) {
            this.decreaseMoney = decreaseMoney;
            return this;
        }
        public String getDecreaseMoney() {
            return this.decreaseMoney;
        }

        public CreateCouponTemplateRequestCouponTemplateDTO setDecreaseType(Integer decreaseType) {
            this.decreaseType = decreaseType;
            return this;
        }
        public Integer getDecreaseType() {
            return this.decreaseType;
        }

        public CreateCouponTemplateRequestCouponTemplateDTO setDiscount(String discount) {
            this.discount = discount;
            return this;
        }
        public String getDiscount() {
            return this.discount;
        }

        public CreateCouponTemplateRequestCouponTemplateDTO setEffectiveDelayInterval(Integer effectiveDelayInterval) {
            this.effectiveDelayInterval = effectiveDelayInterval;
            return this;
        }
        public Integer getEffectiveDelayInterval() {
            return this.effectiveDelayInterval;
        }

        public CreateCouponTemplateRequestCouponTemplateDTO setEffectiveEndTime(String effectiveEndTime) {
            this.effectiveEndTime = effectiveEndTime;
            return this;
        }
        public String getEffectiveEndTime() {
            return this.effectiveEndTime;
        }

        public CreateCouponTemplateRequestCouponTemplateDTO setEffectiveInterval(Integer effectiveInterval) {
            this.effectiveInterval = effectiveInterval;
            return this;
        }
        public Integer getEffectiveInterval() {
            return this.effectiveInterval;
        }

        public CreateCouponTemplateRequestCouponTemplateDTO setEffectiveStartTime(String effectiveStartTime) {
            this.effectiveStartTime = effectiveStartTime;
            return this;
        }
        public String getEffectiveStartTime() {
            return this.effectiveStartTime;
        }

        public CreateCouponTemplateRequestCouponTemplateDTO setEffectiveType(Integer effectiveType) {
            this.effectiveType = effectiveType;
            return this;
        }
        public Integer getEffectiveType() {
            return this.effectiveType;
        }

        public CreateCouponTemplateRequestCouponTemplateDTO setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateCouponTemplateRequestCouponTemplateDTO setInstruction(String instruction) {
            this.instruction = instruction;
            return this;
        }
        public String getInstruction() {
            return this.instruction;
        }

        public CreateCouponTemplateRequestCouponTemplateDTO setItemFixPrice(String itemFixPrice) {
            this.itemFixPrice = itemFixPrice;
            return this;
        }
        public String getItemFixPrice() {
            return this.itemFixPrice;
        }

        public CreateCouponTemplateRequestCouponTemplateDTO setItemSalePrice(String itemSalePrice) {
            this.itemSalePrice = itemSalePrice;
            return this;
        }
        public String getItemSalePrice() {
            return this.itemSalePrice;
        }

        public CreateCouponTemplateRequestCouponTemplateDTO setJumpLabel(String jumpLabel) {
            this.jumpLabel = jumpLabel;
            return this;
        }
        public String getJumpLabel() {
            return this.jumpLabel;
        }

        public CreateCouponTemplateRequestCouponTemplateDTO setJumpTable(String jumpTable) {
            this.jumpTable = jumpTable;
            return this;
        }
        public String getJumpTable() {
            return this.jumpTable;
        }

        public CreateCouponTemplateRequestCouponTemplateDTO setJumpUrl(String jumpUrl) {
            this.jumpUrl = jumpUrl;
            return this;
        }
        public String getJumpUrl() {
            return this.jumpUrl;
        }

        public CreateCouponTemplateRequestCouponTemplateDTO setMaxDecreaseMoney(String maxDecreaseMoney) {
            this.maxDecreaseMoney = maxDecreaseMoney;
            return this;
        }
        public String getMaxDecreaseMoney() {
            return this.maxDecreaseMoney;
        }

        public CreateCouponTemplateRequestCouponTemplateDTO setOnlineEndTime(String onlineEndTime) {
            this.onlineEndTime = onlineEndTime;
            return this;
        }
        public String getOnlineEndTime() {
            return this.onlineEndTime;
        }

        public CreateCouponTemplateRequestCouponTemplateDTO setOnlineStartTime(String onlineStartTime) {
            this.onlineStartTime = onlineStartTime;
            return this;
        }
        public String getOnlineStartTime() {
            return this.onlineStartTime;
        }

        public CreateCouponTemplateRequestCouponTemplateDTO setOriginalPriceTag(Boolean originalPriceTag) {
            this.originalPriceTag = originalPriceTag;
            return this;
        }
        public Boolean getOriginalPriceTag() {
            return this.originalPriceTag;
        }

        public CreateCouponTemplateRequestCouponTemplateDTO setOverlay(Boolean overlay) {
            this.overlay = overlay;
            return this;
        }
        public Boolean getOverlay() {
            return this.overlay;
        }

        public CreateCouponTemplateRequestCouponTemplateDTO setPersonLimitCount(Long personLimitCount) {
            this.personLimitCount = personLimitCount;
            return this;
        }
        public Long getPersonLimitCount() {
            return this.personLimitCount;
        }

        public CreateCouponTemplateRequestCouponTemplateDTO setPersonTotalCount(Long personTotalCount) {
            this.personTotalCount = personTotalCount;
            return this;
        }
        public Long getPersonTotalCount() {
            return this.personTotalCount;
        }

        public CreateCouponTemplateRequestCouponTemplateDTO setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public CreateCouponTemplateRequestCouponTemplateDTO setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public CreateCouponTemplateRequestCouponTemplateDTO setRestrictType(Integer restrictType) {
            this.restrictType = restrictType;
            return this;
        }
        public Integer getRestrictType() {
            return this.restrictType;
        }

        public CreateCouponTemplateRequestCouponTemplateDTO setRestrictValue(String restrictValue) {
            this.restrictValue = restrictValue;
            return this;
        }
        public String getRestrictValue() {
            return this.restrictValue;
        }

        public CreateCouponTemplateRequestCouponTemplateDTO setScopeId(java.util.List<String> scopeId) {
            this.scopeId = scopeId;
            return this;
        }
        public java.util.List<String> getScopeId() {
            return this.scopeId;
        }

        public CreateCouponTemplateRequestCouponTemplateDTO setScopeName(String scopeName) {
            this.scopeName = scopeName;
            return this;
        }
        public String getScopeName() {
            return this.scopeName;
        }

        public CreateCouponTemplateRequestCouponTemplateDTO setScopeType(Integer scopeType) {
            this.scopeType = scopeType;
            return this;
        }
        public Integer getScopeType() {
            return this.scopeType;
        }

        public CreateCouponTemplateRequestCouponTemplateDTO setStartInterval(String startInterval) {
            this.startInterval = startInterval;
            return this;
        }
        public String getStartInterval() {
            return this.startInterval;
        }

        public CreateCouponTemplateRequestCouponTemplateDTO setStartType(Integer startType) {
            this.startType = startType;
            return this;
        }
        public Integer getStartType() {
            return this.startType;
        }

        public CreateCouponTemplateRequestCouponTemplateDTO setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public CreateCouponTemplateRequestCouponTemplateDTO setSyncTag(Boolean syncTag) {
            this.syncTag = syncTag;
            return this;
        }
        public Boolean getSyncTag() {
            return this.syncTag;
        }

        public CreateCouponTemplateRequestCouponTemplateDTO setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public CreateCouponTemplateRequestCouponTemplateDTO setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public CreateCouponTemplateRequestCouponTemplateDTO setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public CreateCouponTemplateRequestCouponTemplateDTO setWechatExt(String wechatExt) {
            this.wechatExt = wechatExt;
            return this;
        }
        public String getWechatExt() {
            return this.wechatExt;
        }

        public CreateCouponTemplateRequestCouponTemplateDTO setWechatSendCount(Long wechatSendCount) {
            this.wechatSendCount = wechatSendCount;
            return this;
        }
        public Long getWechatSendCount() {
            return this.wechatSendCount;
        }

    }

}
