// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class ListServiceUsagesResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ServiceUsages")
    public java.util.List<ListServiceUsagesResponseBodyServiceUsages> serviceUsages;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListServiceUsagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListServiceUsagesResponseBody self = new ListServiceUsagesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListServiceUsagesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListServiceUsagesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListServiceUsagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListServiceUsagesResponseBody setServiceUsages(java.util.List<ListServiceUsagesResponseBodyServiceUsages> serviceUsages) {
        this.serviceUsages = serviceUsages;
        return this;
    }
    public java.util.List<ListServiceUsagesResponseBodyServiceUsages> getServiceUsages() {
        return this.serviceUsages;
    }

    public ListServiceUsagesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListServiceUsagesResponseBodyServiceUsagesUserInformation extends TeaModel {
        @NameInMap("Company")
        public String company;

        @NameInMap("ContactEmail")
        public String contactEmail;

        @NameInMap("ContactNumber")
        public String contactNumber;

        @NameInMap("ContactPerson")
        public String contactPerson;

        @NameInMap("ContactPersonTitle")
        public String contactPersonTitle;

        @NameInMap("Country")
        public String country;

        @NameInMap("EmailAddress")
        public String emailAddress;

        @NameInMap("Industry")
        public String industry;

        @NameInMap("Name")
        public String name;

        @NameInMap("ProductBusiness")
        public String productBusiness;

        @NameInMap("ProductDeliveryTypes")
        public String productDeliveryTypes;

        @NameInMap("ProductSellTypes")
        public String productSellTypes;

        @NameInMap("Source")
        public String source;

        @NameInMap("SupplierDesc")
        public String supplierDesc;

        @NameInMap("SupplierName")
        public String supplierName;

        @NameInMap("SupplierUrl")
        public String supplierUrl;

        @NameInMap("Telephone")
        public String telephone;

        @NameInMap("Title")
        public String title;

        public static ListServiceUsagesResponseBodyServiceUsagesUserInformation build(java.util.Map<String, ?> map) throws Exception {
            ListServiceUsagesResponseBodyServiceUsagesUserInformation self = new ListServiceUsagesResponseBodyServiceUsagesUserInformation();
            return TeaModel.build(map, self);
        }

        public ListServiceUsagesResponseBodyServiceUsagesUserInformation setCompany(String company) {
            this.company = company;
            return this;
        }
        public String getCompany() {
            return this.company;
        }

        public ListServiceUsagesResponseBodyServiceUsagesUserInformation setContactEmail(String contactEmail) {
            this.contactEmail = contactEmail;
            return this;
        }
        public String getContactEmail() {
            return this.contactEmail;
        }

        public ListServiceUsagesResponseBodyServiceUsagesUserInformation setContactNumber(String contactNumber) {
            this.contactNumber = contactNumber;
            return this;
        }
        public String getContactNumber() {
            return this.contactNumber;
        }

        public ListServiceUsagesResponseBodyServiceUsagesUserInformation setContactPerson(String contactPerson) {
            this.contactPerson = contactPerson;
            return this;
        }
        public String getContactPerson() {
            return this.contactPerson;
        }

        public ListServiceUsagesResponseBodyServiceUsagesUserInformation setContactPersonTitle(String contactPersonTitle) {
            this.contactPersonTitle = contactPersonTitle;
            return this;
        }
        public String getContactPersonTitle() {
            return this.contactPersonTitle;
        }

        public ListServiceUsagesResponseBodyServiceUsagesUserInformation setCountry(String country) {
            this.country = country;
            return this;
        }
        public String getCountry() {
            return this.country;
        }

        public ListServiceUsagesResponseBodyServiceUsagesUserInformation setEmailAddress(String emailAddress) {
            this.emailAddress = emailAddress;
            return this;
        }
        public String getEmailAddress() {
            return this.emailAddress;
        }

        public ListServiceUsagesResponseBodyServiceUsagesUserInformation setIndustry(String industry) {
            this.industry = industry;
            return this;
        }
        public String getIndustry() {
            return this.industry;
        }

        public ListServiceUsagesResponseBodyServiceUsagesUserInformation setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListServiceUsagesResponseBodyServiceUsagesUserInformation setProductBusiness(String productBusiness) {
            this.productBusiness = productBusiness;
            return this;
        }
        public String getProductBusiness() {
            return this.productBusiness;
        }

        public ListServiceUsagesResponseBodyServiceUsagesUserInformation setProductDeliveryTypes(String productDeliveryTypes) {
            this.productDeliveryTypes = productDeliveryTypes;
            return this;
        }
        public String getProductDeliveryTypes() {
            return this.productDeliveryTypes;
        }

        public ListServiceUsagesResponseBodyServiceUsagesUserInformation setProductSellTypes(String productSellTypes) {
            this.productSellTypes = productSellTypes;
            return this;
        }
        public String getProductSellTypes() {
            return this.productSellTypes;
        }

        public ListServiceUsagesResponseBodyServiceUsagesUserInformation setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ListServiceUsagesResponseBodyServiceUsagesUserInformation setSupplierDesc(String supplierDesc) {
            this.supplierDesc = supplierDesc;
            return this;
        }
        public String getSupplierDesc() {
            return this.supplierDesc;
        }

        public ListServiceUsagesResponseBodyServiceUsagesUserInformation setSupplierName(String supplierName) {
            this.supplierName = supplierName;
            return this;
        }
        public String getSupplierName() {
            return this.supplierName;
        }

        public ListServiceUsagesResponseBodyServiceUsagesUserInformation setSupplierUrl(String supplierUrl) {
            this.supplierUrl = supplierUrl;
            return this;
        }
        public String getSupplierUrl() {
            return this.supplierUrl;
        }

        public ListServiceUsagesResponseBodyServiceUsagesUserInformation setTelephone(String telephone) {
            this.telephone = telephone;
            return this;
        }
        public String getTelephone() {
            return this.telephone;
        }

        public ListServiceUsagesResponseBodyServiceUsagesUserInformation setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class ListServiceUsagesResponseBodyServiceUsages extends TeaModel {
        @NameInMap("Comments")
        public String comments;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ServiceId")
        public String serviceId;

        @NameInMap("ServiceName")
        public String serviceName;

        @NameInMap("Status")
        public String status;

        @NameInMap("SupplierName")
        public String supplierName;

        @NameInMap("UpdateTime")
        public String updateTime;

        @NameInMap("UserAliUid")
        public Long userAliUid;

        @NameInMap("UserInformation")
        public ListServiceUsagesResponseBodyServiceUsagesUserInformation userInformation;

        public static ListServiceUsagesResponseBodyServiceUsages build(java.util.Map<String, ?> map) throws Exception {
            ListServiceUsagesResponseBodyServiceUsages self = new ListServiceUsagesResponseBodyServiceUsages();
            return TeaModel.build(map, self);
        }

        public ListServiceUsagesResponseBodyServiceUsages setComments(String comments) {
            this.comments = comments;
            return this;
        }
        public String getComments() {
            return this.comments;
        }

        public ListServiceUsagesResponseBodyServiceUsages setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListServiceUsagesResponseBodyServiceUsages setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public ListServiceUsagesResponseBodyServiceUsages setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public ListServiceUsagesResponseBodyServiceUsages setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListServiceUsagesResponseBodyServiceUsages setSupplierName(String supplierName) {
            this.supplierName = supplierName;
            return this;
        }
        public String getSupplierName() {
            return this.supplierName;
        }

        public ListServiceUsagesResponseBodyServiceUsages setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListServiceUsagesResponseBodyServiceUsages setUserAliUid(Long userAliUid) {
            this.userAliUid = userAliUid;
            return this;
        }
        public Long getUserAliUid() {
            return this.userAliUid;
        }

        public ListServiceUsagesResponseBodyServiceUsages setUserInformation(ListServiceUsagesResponseBodyServiceUsagesUserInformation userInformation) {
            this.userInformation = userInformation;
            return this;
        }
        public ListServiceUsagesResponseBodyServiceUsagesUserInformation getUserInformation() {
            return this.userInformation;
        }

    }

}
