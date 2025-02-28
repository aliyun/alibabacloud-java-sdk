// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class ListSupplierRegistrationsResponseBody extends TeaModel {
    /**
     * <p>The number of entries per page. Valid values: 1 to 100. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAdx9kBO7qKpr9My/+XQo0oY=</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C6CC568D-xxxx-xxxx-xxxx-08EB8E9F9F20</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The supplier registrations</p>
     */
    @NameInMap("SupplierRegistrations")
    public java.util.List<ListSupplierRegistrationsResponseBodySupplierRegistrations> supplierRegistrations;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListSupplierRegistrationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSupplierRegistrationsResponseBody self = new ListSupplierRegistrationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSupplierRegistrationsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListSupplierRegistrationsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListSupplierRegistrationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSupplierRegistrationsResponseBody setSupplierRegistrations(java.util.List<ListSupplierRegistrationsResponseBodySupplierRegistrations> supplierRegistrations) {
        this.supplierRegistrations = supplierRegistrations;
        return this;
    }
    public java.util.List<ListSupplierRegistrationsResponseBodySupplierRegistrations> getSupplierRegistrations() {
        return this.supplierRegistrations;
    }

    public ListSupplierRegistrationsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListSupplierRegistrationsResponseBodySupplierRegistrations extends TeaModel {
        /**
         * <p>The comment of this registration.</p>
         * 
         * <strong>example:</strong>
         * <p>empty</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>Contact email</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:test@163.com">test@163.com</a></p>
         */
        @NameInMap("ContactEmail")
        public String contactEmail;

        /**
         * <p>Contact number</p>
         * 
         * <strong>example:</strong>
         * <p>135xxxxxxxx</p>
         */
        @NameInMap("ContactNumber")
        public String contactNumber;

        /**
         * <p>Contact person</p>
         * 
         * <strong>example:</strong>
         * <p>Mike</p>
         */
        @NameInMap("ContactPerson")
        public String contactPerson;

        /**
         * <p>Contact person tiltle.</p>
         * 
         * <strong>example:</strong>
         * <p>CTO</p>
         */
        @NameInMap("ContactPersonTitle")
        public String contactPersonTitle;

        /**
         * <p>Whether to enable the resell mode.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableResellerMode")
        public Boolean enableResellerMode;

        /**
         * <p>Annual product revenue</p>
         * 
         * <strong>example:</strong>
         * <p>empty</p>
         */
        @NameInMap("ProductAnnualRevenue")
        public String productAnnualRevenue;

        /**
         * <p>The business of product.</p>
         * 
         * <strong>example:</strong>
         * <p>AI</p>
         */
        @NameInMap("ProductBusiness")
        public String productBusiness;

        /**
         * <p>Product delivery type，Valid values:</p>
         * <p>SaaS
         * License
         * API
         * DesktopSoftware
         * Others</p>
         * 
         * <strong>example:</strong>
         * <p>SaaS</p>
         */
        @NameInMap("ProductDeliveryTypes")
        public String productDeliveryTypes;

        /**
         * <p>The publish time of product.</p>
         * 
         * <strong>example:</strong>
         * <p>2024.10.24</p>
         */
        @NameInMap("ProductPublishTime")
        public String productPublishTime;

        /**
         * <p>Product sell type, Valid values:</p>
         * <ul>
         * <li>Direct</li>
         * <li>Channel</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Direct</p>
         */
        @NameInMap("ProductSellTypes")
        public String productSellTypes;

        /**
         * <p>The registration ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sr-xxx</p>
         */
        @NameInMap("RegistrationId")
        public String registrationId;

        /**
         * <p>The description of resell business.</p>
         * 
         * <strong>example:</strong>
         * <p>empty</p>
         */
        @NameInMap("ResellBusinessDesc")
        public String resellBusinessDesc;

        /**
         * <p>The deployment state of the registration. Valid values:</p>
         * <ul>
         * <li>Submitted</li>
         * <li>Approved</li>
         * <li>Rejected</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Submitted</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The submit time of this registration.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-01-22 09:47:58</p>
         */
        @NameInMap("SubmitTime")
        public String submitTime;

        /**
         * <p>The description of service provider.</p>
         * 
         * <strong>example:</strong>
         * <p>Test supplier</p>
         */
        @NameInMap("SupplierDesc")
        public String supplierDesc;

        /**
         * <p>The Logo of service provider.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://service-info-public.oss-cn-hangzhou.aliyuncs.com/xxx/service-xxx/xxx.png">https://service-info-public.oss-cn-hangzhou.aliyuncs.com/xxx/service-xxx/xxx.png</a></p>
         */
        @NameInMap("SupplierLogo")
        public String supplierLogo;

        /**
         * <p>The name of the service provider.</p>
         * 
         * <strong>example:</strong>
         * <p>Aliibaba Cloud</p>
         */
        @NameInMap("SupplierName")
        public String supplierName;

        /**
         * <p>The english name of the service provider.</p>
         * 
         * <strong>example:</strong>
         * <p>Alibaba Cloud ComputeNest</p>
         */
        @NameInMap("SupplierNameEn")
        public String supplierNameEn;

        /**
         * <p>The Alibaba Cloud account ID of the service provider.</p>
         * 
         * <strong>example:</strong>
         * <p>1256xxx23434</p>
         */
        @NameInMap("SupplierUid")
        public String supplierUid;

        /**
         * <p>The URL of the service provider.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://www.guangbao-uni.com">https://www.guangbao-uni.com</a></p>
         */
        @NameInMap("SupplierUrl")
        public String supplierUrl;

        public static ListSupplierRegistrationsResponseBodySupplierRegistrations build(java.util.Map<String, ?> map) throws Exception {
            ListSupplierRegistrationsResponseBodySupplierRegistrations self = new ListSupplierRegistrationsResponseBodySupplierRegistrations();
            return TeaModel.build(map, self);
        }

        public ListSupplierRegistrationsResponseBodySupplierRegistrations setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public ListSupplierRegistrationsResponseBodySupplierRegistrations setContactEmail(String contactEmail) {
            this.contactEmail = contactEmail;
            return this;
        }
        public String getContactEmail() {
            return this.contactEmail;
        }

        public ListSupplierRegistrationsResponseBodySupplierRegistrations setContactNumber(String contactNumber) {
            this.contactNumber = contactNumber;
            return this;
        }
        public String getContactNumber() {
            return this.contactNumber;
        }

        public ListSupplierRegistrationsResponseBodySupplierRegistrations setContactPerson(String contactPerson) {
            this.contactPerson = contactPerson;
            return this;
        }
        public String getContactPerson() {
            return this.contactPerson;
        }

        public ListSupplierRegistrationsResponseBodySupplierRegistrations setContactPersonTitle(String contactPersonTitle) {
            this.contactPersonTitle = contactPersonTitle;
            return this;
        }
        public String getContactPersonTitle() {
            return this.contactPersonTitle;
        }

        public ListSupplierRegistrationsResponseBodySupplierRegistrations setEnableResellerMode(Boolean enableResellerMode) {
            this.enableResellerMode = enableResellerMode;
            return this;
        }
        public Boolean getEnableResellerMode() {
            return this.enableResellerMode;
        }

        public ListSupplierRegistrationsResponseBodySupplierRegistrations setProductAnnualRevenue(String productAnnualRevenue) {
            this.productAnnualRevenue = productAnnualRevenue;
            return this;
        }
        public String getProductAnnualRevenue() {
            return this.productAnnualRevenue;
        }

        public ListSupplierRegistrationsResponseBodySupplierRegistrations setProductBusiness(String productBusiness) {
            this.productBusiness = productBusiness;
            return this;
        }
        public String getProductBusiness() {
            return this.productBusiness;
        }

        public ListSupplierRegistrationsResponseBodySupplierRegistrations setProductDeliveryTypes(String productDeliveryTypes) {
            this.productDeliveryTypes = productDeliveryTypes;
            return this;
        }
        public String getProductDeliveryTypes() {
            return this.productDeliveryTypes;
        }

        public ListSupplierRegistrationsResponseBodySupplierRegistrations setProductPublishTime(String productPublishTime) {
            this.productPublishTime = productPublishTime;
            return this;
        }
        public String getProductPublishTime() {
            return this.productPublishTime;
        }

        public ListSupplierRegistrationsResponseBodySupplierRegistrations setProductSellTypes(String productSellTypes) {
            this.productSellTypes = productSellTypes;
            return this;
        }
        public String getProductSellTypes() {
            return this.productSellTypes;
        }

        public ListSupplierRegistrationsResponseBodySupplierRegistrations setRegistrationId(String registrationId) {
            this.registrationId = registrationId;
            return this;
        }
        public String getRegistrationId() {
            return this.registrationId;
        }

        public ListSupplierRegistrationsResponseBodySupplierRegistrations setResellBusinessDesc(String resellBusinessDesc) {
            this.resellBusinessDesc = resellBusinessDesc;
            return this;
        }
        public String getResellBusinessDesc() {
            return this.resellBusinessDesc;
        }

        public ListSupplierRegistrationsResponseBodySupplierRegistrations setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListSupplierRegistrationsResponseBodySupplierRegistrations setSubmitTime(String submitTime) {
            this.submitTime = submitTime;
            return this;
        }
        public String getSubmitTime() {
            return this.submitTime;
        }

        public ListSupplierRegistrationsResponseBodySupplierRegistrations setSupplierDesc(String supplierDesc) {
            this.supplierDesc = supplierDesc;
            return this;
        }
        public String getSupplierDesc() {
            return this.supplierDesc;
        }

        public ListSupplierRegistrationsResponseBodySupplierRegistrations setSupplierLogo(String supplierLogo) {
            this.supplierLogo = supplierLogo;
            return this;
        }
        public String getSupplierLogo() {
            return this.supplierLogo;
        }

        public ListSupplierRegistrationsResponseBodySupplierRegistrations setSupplierName(String supplierName) {
            this.supplierName = supplierName;
            return this;
        }
        public String getSupplierName() {
            return this.supplierName;
        }

        public ListSupplierRegistrationsResponseBodySupplierRegistrations setSupplierNameEn(String supplierNameEn) {
            this.supplierNameEn = supplierNameEn;
            return this;
        }
        public String getSupplierNameEn() {
            return this.supplierNameEn;
        }

        public ListSupplierRegistrationsResponseBodySupplierRegistrations setSupplierUid(String supplierUid) {
            this.supplierUid = supplierUid;
            return this;
        }
        public String getSupplierUid() {
            return this.supplierUid;
        }

        public ListSupplierRegistrationsResponseBodySupplierRegistrations setSupplierUrl(String supplierUrl) {
            this.supplierUrl = supplierUrl;
            return this;
        }
        public String getSupplierUrl() {
            return this.supplierUrl;
        }

    }

}
