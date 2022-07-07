// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class ListCouponTemplateResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("CouponTemplates")
    public java.util.List<ListCouponTemplateResponseBodyCouponTemplates> couponTemplates;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListCouponTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCouponTemplateResponseBody self = new ListCouponTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCouponTemplateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListCouponTemplateResponseBody setCouponTemplates(java.util.List<ListCouponTemplateResponseBodyCouponTemplates> couponTemplates) {
        this.couponTemplates = couponTemplates;
        return this;
    }
    public java.util.List<ListCouponTemplateResponseBodyCouponTemplates> getCouponTemplates() {
        return this.couponTemplates;
    }

    public ListCouponTemplateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListCouponTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCouponTemplateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListCouponTemplateResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListCouponTemplateResponseBodyCouponTemplates extends TeaModel {
        @NameInMap("ApplyCount")
        public Long applyCount;

        @NameInMap("BelongTypeList")
        public java.util.List<String> belongTypeList;

        @NameInMap("DecreaseType")
        public Integer decreaseType;

        @NameInMap("EffectiveDelayInterval")
        public Integer effectiveDelayInterval;

        @NameInMap("EffectiveInfo")
        public String effectiveInfo;

        @NameInMap("EffectiveInterval")
        public Integer effectiveInterval;

        @NameInMap("EffectiveType")
        public Integer effectiveType;

        @NameInMap("Id")
        public String id;

        @NameInMap("Info")
        public String info;

        @NameInMap("IsOuterCouponTemplate")
        public Boolean isOuterCouponTemplate;

        @NameInMap("ItemName")
        public String itemName;

        @NameInMap("MaxDecreaseMoney")
        public String maxDecreaseMoney;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("ScopeInfo")
        public String scopeInfo;

        @NameInMap("ShortEndDate")
        public String shortEndDate;

        @NameInMap("ShortStartDate")
        public String shortStartDate;

        @NameInMap("StartType")
        public Integer startType;

        @NameInMap("StartValue")
        public String startValue;

        @NameInMap("Status")
        public String status;

        @NameInMap("SurplusCount")
        public Long surplusCount;

        @NameInMap("Title")
        public String title;

        @NameInMap("Type")
        public String type;

        @NameInMap("UseCount")
        public Long useCount;

        @NameInMap("Value")
        public String value;

        public static ListCouponTemplateResponseBodyCouponTemplates build(java.util.Map<String, ?> map) throws Exception {
            ListCouponTemplateResponseBodyCouponTemplates self = new ListCouponTemplateResponseBodyCouponTemplates();
            return TeaModel.build(map, self);
        }

        public ListCouponTemplateResponseBodyCouponTemplates setApplyCount(Long applyCount) {
            this.applyCount = applyCount;
            return this;
        }
        public Long getApplyCount() {
            return this.applyCount;
        }

        public ListCouponTemplateResponseBodyCouponTemplates setBelongTypeList(java.util.List<String> belongTypeList) {
            this.belongTypeList = belongTypeList;
            return this;
        }
        public java.util.List<String> getBelongTypeList() {
            return this.belongTypeList;
        }

        public ListCouponTemplateResponseBodyCouponTemplates setDecreaseType(Integer decreaseType) {
            this.decreaseType = decreaseType;
            return this;
        }
        public Integer getDecreaseType() {
            return this.decreaseType;
        }

        public ListCouponTemplateResponseBodyCouponTemplates setEffectiveDelayInterval(Integer effectiveDelayInterval) {
            this.effectiveDelayInterval = effectiveDelayInterval;
            return this;
        }
        public Integer getEffectiveDelayInterval() {
            return this.effectiveDelayInterval;
        }

        public ListCouponTemplateResponseBodyCouponTemplates setEffectiveInfo(String effectiveInfo) {
            this.effectiveInfo = effectiveInfo;
            return this;
        }
        public String getEffectiveInfo() {
            return this.effectiveInfo;
        }

        public ListCouponTemplateResponseBodyCouponTemplates setEffectiveInterval(Integer effectiveInterval) {
            this.effectiveInterval = effectiveInterval;
            return this;
        }
        public Integer getEffectiveInterval() {
            return this.effectiveInterval;
        }

        public ListCouponTemplateResponseBodyCouponTemplates setEffectiveType(Integer effectiveType) {
            this.effectiveType = effectiveType;
            return this;
        }
        public Integer getEffectiveType() {
            return this.effectiveType;
        }

        public ListCouponTemplateResponseBodyCouponTemplates setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListCouponTemplateResponseBodyCouponTemplates setInfo(String info) {
            this.info = info;
            return this;
        }
        public String getInfo() {
            return this.info;
        }

        public ListCouponTemplateResponseBodyCouponTemplates setIsOuterCouponTemplate(Boolean isOuterCouponTemplate) {
            this.isOuterCouponTemplate = isOuterCouponTemplate;
            return this;
        }
        public Boolean getIsOuterCouponTemplate() {
            return this.isOuterCouponTemplate;
        }

        public ListCouponTemplateResponseBodyCouponTemplates setItemName(String itemName) {
            this.itemName = itemName;
            return this;
        }
        public String getItemName() {
            return this.itemName;
        }

        public ListCouponTemplateResponseBodyCouponTemplates setMaxDecreaseMoney(String maxDecreaseMoney) {
            this.maxDecreaseMoney = maxDecreaseMoney;
            return this;
        }
        public String getMaxDecreaseMoney() {
            return this.maxDecreaseMoney;
        }

        public ListCouponTemplateResponseBodyCouponTemplates setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public ListCouponTemplateResponseBodyCouponTemplates setScopeInfo(String scopeInfo) {
            this.scopeInfo = scopeInfo;
            return this;
        }
        public String getScopeInfo() {
            return this.scopeInfo;
        }

        public ListCouponTemplateResponseBodyCouponTemplates setShortEndDate(String shortEndDate) {
            this.shortEndDate = shortEndDate;
            return this;
        }
        public String getShortEndDate() {
            return this.shortEndDate;
        }

        public ListCouponTemplateResponseBodyCouponTemplates setShortStartDate(String shortStartDate) {
            this.shortStartDate = shortStartDate;
            return this;
        }
        public String getShortStartDate() {
            return this.shortStartDate;
        }

        public ListCouponTemplateResponseBodyCouponTemplates setStartType(Integer startType) {
            this.startType = startType;
            return this;
        }
        public Integer getStartType() {
            return this.startType;
        }

        public ListCouponTemplateResponseBodyCouponTemplates setStartValue(String startValue) {
            this.startValue = startValue;
            return this;
        }
        public String getStartValue() {
            return this.startValue;
        }

        public ListCouponTemplateResponseBodyCouponTemplates setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListCouponTemplateResponseBodyCouponTemplates setSurplusCount(Long surplusCount) {
            this.surplusCount = surplusCount;
            return this;
        }
        public Long getSurplusCount() {
            return this.surplusCount;
        }

        public ListCouponTemplateResponseBodyCouponTemplates setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public ListCouponTemplateResponseBodyCouponTemplates setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListCouponTemplateResponseBodyCouponTemplates setUseCount(Long useCount) {
            this.useCount = useCount;
            return this;
        }
        public Long getUseCount() {
            return this.useCount;
        }

        public ListCouponTemplateResponseBodyCouponTemplates setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
