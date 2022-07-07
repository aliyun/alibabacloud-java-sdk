// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class ListAvailableRuleCouponTemplatesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("CouponTemplateListDTOs")
    public java.util.List<ListAvailableRuleCouponTemplatesResponseBodyCouponTemplateListDTOs> couponTemplateListDTOs;

    @NameInMap("DynamicCode")
    public String dynamicCode;

    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListAvailableRuleCouponTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAvailableRuleCouponTemplatesResponseBody self = new ListAvailableRuleCouponTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAvailableRuleCouponTemplatesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAvailableRuleCouponTemplatesResponseBody setCouponTemplateListDTOs(java.util.List<ListAvailableRuleCouponTemplatesResponseBodyCouponTemplateListDTOs> couponTemplateListDTOs) {
        this.couponTemplateListDTOs = couponTemplateListDTOs;
        return this;
    }
    public java.util.List<ListAvailableRuleCouponTemplatesResponseBodyCouponTemplateListDTOs> getCouponTemplateListDTOs() {
        return this.couponTemplateListDTOs;
    }

    public ListAvailableRuleCouponTemplatesResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public ListAvailableRuleCouponTemplatesResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public ListAvailableRuleCouponTemplatesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListAvailableRuleCouponTemplatesResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListAvailableRuleCouponTemplatesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAvailableRuleCouponTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAvailableRuleCouponTemplatesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListAvailableRuleCouponTemplatesResponseBodyCouponTemplateListDTOs extends TeaModel {
        @NameInMap("ApplyCount")
        public Long applyCount;

        @NameInMap("EffectiveInfo")
        public String effectiveInfo;

        @NameInMap("Id")
        public String id;

        @NameInMap("Info")
        public String info;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("ScopeInfo")
        public String scopeInfo;

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

        public static ListAvailableRuleCouponTemplatesResponseBodyCouponTemplateListDTOs build(java.util.Map<String, ?> map) throws Exception {
            ListAvailableRuleCouponTemplatesResponseBodyCouponTemplateListDTOs self = new ListAvailableRuleCouponTemplatesResponseBodyCouponTemplateListDTOs();
            return TeaModel.build(map, self);
        }

        public ListAvailableRuleCouponTemplatesResponseBodyCouponTemplateListDTOs setApplyCount(Long applyCount) {
            this.applyCount = applyCount;
            return this;
        }
        public Long getApplyCount() {
            return this.applyCount;
        }

        public ListAvailableRuleCouponTemplatesResponseBodyCouponTemplateListDTOs setEffectiveInfo(String effectiveInfo) {
            this.effectiveInfo = effectiveInfo;
            return this;
        }
        public String getEffectiveInfo() {
            return this.effectiveInfo;
        }

        public ListAvailableRuleCouponTemplatesResponseBodyCouponTemplateListDTOs setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListAvailableRuleCouponTemplatesResponseBodyCouponTemplateListDTOs setInfo(String info) {
            this.info = info;
            return this;
        }
        public String getInfo() {
            return this.info;
        }

        public ListAvailableRuleCouponTemplatesResponseBodyCouponTemplateListDTOs setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public ListAvailableRuleCouponTemplatesResponseBodyCouponTemplateListDTOs setScopeInfo(String scopeInfo) {
            this.scopeInfo = scopeInfo;
            return this;
        }
        public String getScopeInfo() {
            return this.scopeInfo;
        }

        public ListAvailableRuleCouponTemplatesResponseBodyCouponTemplateListDTOs setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListAvailableRuleCouponTemplatesResponseBodyCouponTemplateListDTOs setSurplusCount(Long surplusCount) {
            this.surplusCount = surplusCount;
            return this;
        }
        public Long getSurplusCount() {
            return this.surplusCount;
        }

        public ListAvailableRuleCouponTemplatesResponseBodyCouponTemplateListDTOs setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public ListAvailableRuleCouponTemplatesResponseBodyCouponTemplateListDTOs setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListAvailableRuleCouponTemplatesResponseBodyCouponTemplateListDTOs setUseCount(Long useCount) {
            this.useCount = useCount;
            return this;
        }
        public Long getUseCount() {
            return this.useCount;
        }

    }

}
