// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class CreateCouponTemplateResponseBody extends TeaModel {
    /**
     * <p>The status code. 200 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public CreateCouponTemplateResponseBodyData data;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>2103a30617045934095083027d88c5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateCouponTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCouponTemplateResponseBody self = new CreateCouponTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCouponTemplateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateCouponTemplateResponseBody setData(CreateCouponTemplateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateCouponTemplateResponseBodyData getData() {
        return this.data;
    }

    public CreateCouponTemplateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateCouponTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateCouponTemplateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateCouponTemplateResponseBodyData extends TeaModel {
        /**
         * <p>The applicable products.</p>
         * <ul>
         * <li>All Products: All products.</li>
         * <li>Custom: Custom products.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Custom</p>
         */
        @NameInMap("ApplicableProducts")
        public String applicableProducts;

        /**
         * <p>The party that bears the coupon cost.</p>
         * <ul>
         * <li>Partner: Borne by the partner.</li>
         * <li>Alibaba Cloud: Borne by Alibaba Cloud.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Partner</p>
         */
        @NameInMap("CostBearer")
        public String costBearer;

        /**
         * <p>The ID of the coupon template.</p>
         * 
         * <strong>example:</strong>
         * <p>111111</p>
         */
        @NameInMap("CouponTemplateID")
        public Long couponTemplateID;

        /**
         * <p>The creation time. The format is YYYY-MM-DD HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-04-02 16:15:31</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The end time of the effective period.
         * Format: yyyy-MM-dd.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-01-01</p>
         */
        @NameInMap("Expireddate")
        public String expireddate;

        /**
         * <p>The list of product codes.</p>
         */
        @NameInMap("ProductType")
        public java.util.List<String> productType;

        /**
         * <p>The status of the coupon template. Valid values:</p>
         * <ul>
         * <li>CREATED: Created.</li>
         * <li>APPROVING: Under review.</li>
         * <li>APPROVED: Approved.</li>
         * <li>UNAPPROVED: Unapproved.</li>
         * <li>ABANDONED: Abandoned.</li>
         * <li>EXPIRED: Expired.</li>
         * <li>EXHAUSTED: Exhausted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>APPROVED</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The name of the coupon template.</p>
         * 
         * <strong>example:</strong>
         * <p>Template name</p>
         */
        @NameInMap("TemplateName")
        public String templateName;

        /**
         * <p>The start time of the effective period.
         * Format: yyyy-MM-dd.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-01-01</p>
         */
        @NameInMap("Vailddate")
        public String vailddate;

        /**
         * <p>The duration of the relative time in days.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Vaildperioddays")
        public String vaildperioddays;

        /**
         * <p>The validity period of the coupon.</p>
         * <ul>
         * <li>Validity Duration: From the date of issuance.</li>
         * <li>Custom Timeframe: Custom time period.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Validity Duration</p>
         */
        @NameInMap("ValidUntil")
        public String validUntil;

        /**
         * <p>The denomination.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateCouponTemplateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateCouponTemplateResponseBodyData self = new CreateCouponTemplateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateCouponTemplateResponseBodyData setApplicableProducts(String applicableProducts) {
            this.applicableProducts = applicableProducts;
            return this;
        }
        public String getApplicableProducts() {
            return this.applicableProducts;
        }

        public CreateCouponTemplateResponseBodyData setCostBearer(String costBearer) {
            this.costBearer = costBearer;
            return this;
        }
        public String getCostBearer() {
            return this.costBearer;
        }

        public CreateCouponTemplateResponseBodyData setCouponTemplateID(Long couponTemplateID) {
            this.couponTemplateID = couponTemplateID;
            return this;
        }
        public Long getCouponTemplateID() {
            return this.couponTemplateID;
        }

        public CreateCouponTemplateResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CreateCouponTemplateResponseBodyData setExpireddate(String expireddate) {
            this.expireddate = expireddate;
            return this;
        }
        public String getExpireddate() {
            return this.expireddate;
        }

        public CreateCouponTemplateResponseBodyData setProductType(java.util.List<String> productType) {
            this.productType = productType;
            return this;
        }
        public java.util.List<String> getProductType() {
            return this.productType;
        }

        public CreateCouponTemplateResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateCouponTemplateResponseBodyData setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public CreateCouponTemplateResponseBodyData setVailddate(String vailddate) {
            this.vailddate = vailddate;
            return this;
        }
        public String getVailddate() {
            return this.vailddate;
        }

        public CreateCouponTemplateResponseBodyData setVaildperioddays(String vaildperioddays) {
            this.vaildperioddays = vaildperioddays;
            return this;
        }
        public String getVaildperioddays() {
            return this.vaildperioddays;
        }

        public CreateCouponTemplateResponseBodyData setValidUntil(String validUntil) {
            this.validUntil = validUntil;
            return this;
        }
        public String getValidUntil() {
            return this.validUntil;
        }

        public CreateCouponTemplateResponseBodyData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
