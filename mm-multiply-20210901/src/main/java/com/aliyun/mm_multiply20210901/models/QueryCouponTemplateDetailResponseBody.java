// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class QueryCouponTemplateDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("CouponTemplateDTO")
    public QueryCouponTemplateDetailResponseBodyCouponTemplateDTO couponTemplateDTO;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryCouponTemplateDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCouponTemplateDetailResponseBody self = new QueryCouponTemplateDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCouponTemplateDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryCouponTemplateDetailResponseBody setCouponTemplateDTO(QueryCouponTemplateDetailResponseBodyCouponTemplateDTO couponTemplateDTO) {
        this.couponTemplateDTO = couponTemplateDTO;
        return this;
    }
    public QueryCouponTemplateDetailResponseBodyCouponTemplateDTO getCouponTemplateDTO() {
        return this.couponTemplateDTO;
    }

    public QueryCouponTemplateDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryCouponTemplateDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryCouponTemplateDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryCouponTemplateDetailResponseBodyCouponTemplateDTO extends TeaModel {
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

        public static QueryCouponTemplateDetailResponseBodyCouponTemplateDTO build(java.util.Map<String, ?> map) throws Exception {
            QueryCouponTemplateDetailResponseBodyCouponTemplateDTO self = new QueryCouponTemplateDetailResponseBodyCouponTemplateDTO();
            return TeaModel.build(map, self);
        }

        public QueryCouponTemplateDetailResponseBodyCouponTemplateDTO setAlipayImgUrl(String alipayImgUrl) {
            this.alipayImgUrl = alipayImgUrl;
            return this;
        }
        public String getAlipayImgUrl() {
            return this.alipayImgUrl;
        }

        public QueryCouponTemplateDetailResponseBodyCouponTemplateDTO setAlipayJumpLabel(String alipayJumpLabel) {
            this.alipayJumpLabel = alipayJumpLabel;
            return this;
        }
        public String getAlipayJumpLabel() {
            return this.alipayJumpLabel;
        }

        public QueryCouponTemplateDetailResponseBodyCouponTemplateDTO setAlipayJumpTable(String alipayJumpTable) {
            this.alipayJumpTable = alipayJumpTable;
            return this;
        }
        public String getAlipayJumpTable() {
            return this.alipayJumpTable;
        }

        public QueryCouponTemplateDetailResponseBodyCouponTemplateDTO setAlipayJumpUrl(String alipayJumpUrl) {
            this.alipayJumpUrl = alipayJumpUrl;
            return this;
        }
        public String getAlipayJumpUrl() {
            return this.alipayJumpUrl;
        }

        public QueryCouponTemplateDetailResponseBodyCouponTemplateDTO setAlipaySendCount(Long alipaySendCount) {
            this.alipaySendCount = alipaySendCount;
            return this;
        }
        public Long getAlipaySendCount() {
            return this.alipaySendCount;
        }

        public QueryCouponTemplateDetailResponseBodyCouponTemplateDTO setChannelCode(String channelCode) {
            this.channelCode = channelCode;
            return this;
        }
        public String getChannelCode() {
            return this.channelCode;
        }

        public QueryCouponTemplateDetailResponseBodyCouponTemplateDTO setDecreaseMoney(String decreaseMoney) {
            this.decreaseMoney = decreaseMoney;
            return this;
        }
        public String getDecreaseMoney() {
            return this.decreaseMoney;
        }

        public QueryCouponTemplateDetailResponseBodyCouponTemplateDTO setDecreaseType(Integer decreaseType) {
            this.decreaseType = decreaseType;
            return this;
        }
        public Integer getDecreaseType() {
            return this.decreaseType;
        }

        public QueryCouponTemplateDetailResponseBodyCouponTemplateDTO setDiscount(String discount) {
            this.discount = discount;
            return this;
        }
        public String getDiscount() {
            return this.discount;
        }

        public QueryCouponTemplateDetailResponseBodyCouponTemplateDTO setEffectiveDelayInterval(Integer effectiveDelayInterval) {
            this.effectiveDelayInterval = effectiveDelayInterval;
            return this;
        }
        public Integer getEffectiveDelayInterval() {
            return this.effectiveDelayInterval;
        }

        public QueryCouponTemplateDetailResponseBodyCouponTemplateDTO setEffectiveEndTime(String effectiveEndTime) {
            this.effectiveEndTime = effectiveEndTime;
            return this;
        }
        public String getEffectiveEndTime() {
            return this.effectiveEndTime;
        }

        public QueryCouponTemplateDetailResponseBodyCouponTemplateDTO setEffectiveInterval(Integer effectiveInterval) {
            this.effectiveInterval = effectiveInterval;
            return this;
        }
        public Integer getEffectiveInterval() {
            return this.effectiveInterval;
        }

        public QueryCouponTemplateDetailResponseBodyCouponTemplateDTO setEffectiveStartTime(String effectiveStartTime) {
            this.effectiveStartTime = effectiveStartTime;
            return this;
        }
        public String getEffectiveStartTime() {
            return this.effectiveStartTime;
        }

        public QueryCouponTemplateDetailResponseBodyCouponTemplateDTO setEffectiveType(Integer effectiveType) {
            this.effectiveType = effectiveType;
            return this;
        }
        public Integer getEffectiveType() {
            return this.effectiveType;
        }

        public QueryCouponTemplateDetailResponseBodyCouponTemplateDTO setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryCouponTemplateDetailResponseBodyCouponTemplateDTO setInstruction(String instruction) {
            this.instruction = instruction;
            return this;
        }
        public String getInstruction() {
            return this.instruction;
        }

        public QueryCouponTemplateDetailResponseBodyCouponTemplateDTO setItemFixPrice(String itemFixPrice) {
            this.itemFixPrice = itemFixPrice;
            return this;
        }
        public String getItemFixPrice() {
            return this.itemFixPrice;
        }

        public QueryCouponTemplateDetailResponseBodyCouponTemplateDTO setItemSalePrice(String itemSalePrice) {
            this.itemSalePrice = itemSalePrice;
            return this;
        }
        public String getItemSalePrice() {
            return this.itemSalePrice;
        }

        public QueryCouponTemplateDetailResponseBodyCouponTemplateDTO setJumpLabel(String jumpLabel) {
            this.jumpLabel = jumpLabel;
            return this;
        }
        public String getJumpLabel() {
            return this.jumpLabel;
        }

        public QueryCouponTemplateDetailResponseBodyCouponTemplateDTO setJumpTable(String jumpTable) {
            this.jumpTable = jumpTable;
            return this;
        }
        public String getJumpTable() {
            return this.jumpTable;
        }

        public QueryCouponTemplateDetailResponseBodyCouponTemplateDTO setJumpUrl(String jumpUrl) {
            this.jumpUrl = jumpUrl;
            return this;
        }
        public String getJumpUrl() {
            return this.jumpUrl;
        }

        public QueryCouponTemplateDetailResponseBodyCouponTemplateDTO setMaxDecreaseMoney(String maxDecreaseMoney) {
            this.maxDecreaseMoney = maxDecreaseMoney;
            return this;
        }
        public String getMaxDecreaseMoney() {
            return this.maxDecreaseMoney;
        }

        public QueryCouponTemplateDetailResponseBodyCouponTemplateDTO setOnlineEndTime(String onlineEndTime) {
            this.onlineEndTime = onlineEndTime;
            return this;
        }
        public String getOnlineEndTime() {
            return this.onlineEndTime;
        }

        public QueryCouponTemplateDetailResponseBodyCouponTemplateDTO setOnlineStartTime(String onlineStartTime) {
            this.onlineStartTime = onlineStartTime;
            return this;
        }
        public String getOnlineStartTime() {
            return this.onlineStartTime;
        }

        public QueryCouponTemplateDetailResponseBodyCouponTemplateDTO setOriginalPriceTag(Boolean originalPriceTag) {
            this.originalPriceTag = originalPriceTag;
            return this;
        }
        public Boolean getOriginalPriceTag() {
            return this.originalPriceTag;
        }

        public QueryCouponTemplateDetailResponseBodyCouponTemplateDTO setOverlay(Boolean overlay) {
            this.overlay = overlay;
            return this;
        }
        public Boolean getOverlay() {
            return this.overlay;
        }

        public QueryCouponTemplateDetailResponseBodyCouponTemplateDTO setPersonLimitCount(Long personLimitCount) {
            this.personLimitCount = personLimitCount;
            return this;
        }
        public Long getPersonLimitCount() {
            return this.personLimitCount;
        }

        public QueryCouponTemplateDetailResponseBodyCouponTemplateDTO setPersonTotalCount(Long personTotalCount) {
            this.personTotalCount = personTotalCount;
            return this;
        }
        public Long getPersonTotalCount() {
            return this.personTotalCount;
        }

        public QueryCouponTemplateDetailResponseBodyCouponTemplateDTO setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public QueryCouponTemplateDetailResponseBodyCouponTemplateDTO setRestrictType(Integer restrictType) {
            this.restrictType = restrictType;
            return this;
        }
        public Integer getRestrictType() {
            return this.restrictType;
        }

        public QueryCouponTemplateDetailResponseBodyCouponTemplateDTO setRestrictValue(String restrictValue) {
            this.restrictValue = restrictValue;
            return this;
        }
        public String getRestrictValue() {
            return this.restrictValue;
        }

        public QueryCouponTemplateDetailResponseBodyCouponTemplateDTO setScopeId(java.util.List<String> scopeId) {
            this.scopeId = scopeId;
            return this;
        }
        public java.util.List<String> getScopeId() {
            return this.scopeId;
        }

        public QueryCouponTemplateDetailResponseBodyCouponTemplateDTO setScopeName(String scopeName) {
            this.scopeName = scopeName;
            return this;
        }
        public String getScopeName() {
            return this.scopeName;
        }

        public QueryCouponTemplateDetailResponseBodyCouponTemplateDTO setScopeType(Integer scopeType) {
            this.scopeType = scopeType;
            return this;
        }
        public Integer getScopeType() {
            return this.scopeType;
        }

        public QueryCouponTemplateDetailResponseBodyCouponTemplateDTO setStartInterval(String startInterval) {
            this.startInterval = startInterval;
            return this;
        }
        public String getStartInterval() {
            return this.startInterval;
        }

        public QueryCouponTemplateDetailResponseBodyCouponTemplateDTO setStartType(Integer startType) {
            this.startType = startType;
            return this;
        }
        public Integer getStartType() {
            return this.startType;
        }

        public QueryCouponTemplateDetailResponseBodyCouponTemplateDTO setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public QueryCouponTemplateDetailResponseBodyCouponTemplateDTO setSyncTag(Boolean syncTag) {
            this.syncTag = syncTag;
            return this;
        }
        public Boolean getSyncTag() {
            return this.syncTag;
        }

        public QueryCouponTemplateDetailResponseBodyCouponTemplateDTO setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public QueryCouponTemplateDetailResponseBodyCouponTemplateDTO setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public QueryCouponTemplateDetailResponseBodyCouponTemplateDTO setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public QueryCouponTemplateDetailResponseBodyCouponTemplateDTO setWechatExt(String wechatExt) {
            this.wechatExt = wechatExt;
            return this;
        }
        public String getWechatExt() {
            return this.wechatExt;
        }

        public QueryCouponTemplateDetailResponseBodyCouponTemplateDTO setWechatSendCount(Long wechatSendCount) {
            this.wechatSendCount = wechatSendCount;
            return this;
        }
        public Long getWechatSendCount() {
            return this.wechatSendCount;
        }

    }

}
