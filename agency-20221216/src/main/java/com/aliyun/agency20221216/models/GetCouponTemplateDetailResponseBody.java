// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class GetCouponTemplateDetailResponseBody extends TeaModel {
    /**
     * <p>The result code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The operation result.</p>
     */
    @NameInMap("Data")
    public GetCouponTemplateDetailResponseBodyData data;

    /**
     * <p>The prompt message.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9C14ADFE-DF0A-54D4-8BD5-45D0839246B4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the operation was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetCouponTemplateDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCouponTemplateDetailResponseBody self = new GetCouponTemplateDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCouponTemplateDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetCouponTemplateDetailResponseBody setData(GetCouponTemplateDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetCouponTemplateDetailResponseBodyData getData() {
        return this.data;
    }

    public GetCouponTemplateDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetCouponTemplateDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCouponTemplateDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetCouponTemplateDetailResponseBodyData extends TeaModel {
        /**
         * <p>The applicable products. Valid values:</p>
         * <ul>
         * <li><p>UNIVERSAL: all products</p>
         * </li>
         * <li><p>a specific commodity code</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>UNIVERSAL</p>
         */
        @NameInMap("ApplicableProducts")
        public String applicableProducts;

        /**
         * <p>The party that bears the coupon cost. Valid values:
         * ● cost_by_self: The cost is borne by the caller.
         * ● aliyun_poc: The cost is borne by Alibaba Cloud.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun_poc</p>
         */
        @NameInMap("CostBearer")
        public String costBearer;

        /**
         * <p>The remarks of the coupon.</p>
         * 
         * <strong>example:</strong>
         * <p>For testing</p>
         */
        @NameInMap("CouponDescription")
        public String couponDescription;

        /**
         * <p>The creation time. The format is YYYY-MM-DD HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-11-21 18:18:22</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <p>The face value.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Denomination")
        public Double denomination;

        /**
         * <p>The maximum number of coupons that each person can claim. Valid values:</p>
         * <ul>
         * <li><p>1: Each person can claim one coupon.</p>
         * </li>
         * <li><p>0: No limit applies.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("LimitPerPerson")
        public Integer limitPerPerson;

        /**
         * <p>The order type. Valid values:</p>
         * <ul>
         * <li>ALL: Alibaba Cloud upfront order</li>
         * <li>BILLING: Alibaba Cloud pay-as-you-go bill</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ALL,BILLING</p>
         */
        @NameInMap("PurchaseType")
        public String purchaseType;

        /**
         * <p>The reason for the template application.</p>
         * 
         * <strong>example:</strong>
         * <p>For testing</p>
         */
        @NameInMap("ReasonForApplication")
        public String reasonForApplication;

        /**
         * <p>The status. Valid values:</p>
         * <ul>
         * <li>APPROVED: approved</li>
         * <li>ABANDONED: voided</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>APPROVED</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1576</p>
         */
        @NameInMap("TemplateId")
        public Long templateId;

        /**
         * <p>The name of the coupon template.</p>
         * 
         * <strong>example:</strong>
         * <p>Template name</p>
         */
        @NameInMap("TemplateName")
        public String templateName;

        /**
         * <p>The validity period. This parameter is used together with the validity period type.</p>
         * <ul>
         * <li><p>If the validity period type is relative time, the validity period is the number of valid days.</p>
         * </li>
         * <li><p>If the validity period type is absolute time, the validity period is a time period.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("ValidUntil")
        public String validUntil;

        /**
         * <p>The type of the validity period. Valid values:</p>
         * <ul>
         * <li>0: relative time</li>
         * <li>1: absolute time</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ValidUntilType")
        public String validUntilType;

        public static GetCouponTemplateDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetCouponTemplateDetailResponseBodyData self = new GetCouponTemplateDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetCouponTemplateDetailResponseBodyData setApplicableProducts(String applicableProducts) {
            this.applicableProducts = applicableProducts;
            return this;
        }
        public String getApplicableProducts() {
            return this.applicableProducts;
        }

        public GetCouponTemplateDetailResponseBodyData setCostBearer(String costBearer) {
            this.costBearer = costBearer;
            return this;
        }
        public String getCostBearer() {
            return this.costBearer;
        }

        public GetCouponTemplateDetailResponseBodyData setCouponDescription(String couponDescription) {
            this.couponDescription = couponDescription;
            return this;
        }
        public String getCouponDescription() {
            return this.couponDescription;
        }

        public GetCouponTemplateDetailResponseBodyData setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public GetCouponTemplateDetailResponseBodyData setDenomination(Double denomination) {
            this.denomination = denomination;
            return this;
        }
        public Double getDenomination() {
            return this.denomination;
        }

        public GetCouponTemplateDetailResponseBodyData setLimitPerPerson(Integer limitPerPerson) {
            this.limitPerPerson = limitPerPerson;
            return this;
        }
        public Integer getLimitPerPerson() {
            return this.limitPerPerson;
        }

        public GetCouponTemplateDetailResponseBodyData setPurchaseType(String purchaseType) {
            this.purchaseType = purchaseType;
            return this;
        }
        public String getPurchaseType() {
            return this.purchaseType;
        }

        public GetCouponTemplateDetailResponseBodyData setReasonForApplication(String reasonForApplication) {
            this.reasonForApplication = reasonForApplication;
            return this;
        }
        public String getReasonForApplication() {
            return this.reasonForApplication;
        }

        public GetCouponTemplateDetailResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetCouponTemplateDetailResponseBodyData setTemplateId(Long templateId) {
            this.templateId = templateId;
            return this;
        }
        public Long getTemplateId() {
            return this.templateId;
        }

        public GetCouponTemplateDetailResponseBodyData setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public GetCouponTemplateDetailResponseBodyData setValidUntil(String validUntil) {
            this.validUntil = validUntil;
            return this;
        }
        public String getValidUntil() {
            return this.validUntil;
        }

        public GetCouponTemplateDetailResponseBodyData setValidUntilType(String validUntilType) {
            this.validUntilType = validUntilType;
            return this;
        }
        public String getValidUntilType() {
            return this.validUntilType;
        }

    }

}
