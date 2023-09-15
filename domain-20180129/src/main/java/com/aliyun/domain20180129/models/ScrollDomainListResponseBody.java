// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class ScrollDomainListResponseBody extends TeaModel {
    @NameInMap("Data")
    public ScrollDomainListResponseBodyData data;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ScrollId")
    public String scrollId;

    @NameInMap("TotalItemNum")
    public Integer totalItemNum;

    public static ScrollDomainListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ScrollDomainListResponseBody self = new ScrollDomainListResponseBody();
        return TeaModel.build(map, self);
    }

    public ScrollDomainListResponseBody setData(ScrollDomainListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ScrollDomainListResponseBodyData getData() {
        return this.data;
    }

    public ScrollDomainListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ScrollDomainListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ScrollDomainListResponseBody setScrollId(String scrollId) {
        this.scrollId = scrollId;
        return this;
    }
    public String getScrollId() {
        return this.scrollId;
    }

    public ScrollDomainListResponseBody setTotalItemNum(Integer totalItemNum) {
        this.totalItemNum = totalItemNum;
        return this;
    }
    public Integer getTotalItemNum() {
        return this.totalItemNum;
    }

    public static class ScrollDomainListResponseBodyDataDomainDnsList extends TeaModel {
        @NameInMap("Dns")
        public java.util.List<String> dns;

        public static ScrollDomainListResponseBodyDataDomainDnsList build(java.util.Map<String, ?> map) throws Exception {
            ScrollDomainListResponseBodyDataDomainDnsList self = new ScrollDomainListResponseBodyDataDomainDnsList();
            return TeaModel.build(map, self);
        }

        public ScrollDomainListResponseBodyDataDomainDnsList setDns(java.util.List<String> dns) {
            this.dns = dns;
            return this;
        }
        public java.util.List<String> getDns() {
            return this.dns;
        }

    }

    public static class ScrollDomainListResponseBodyDataDomainTagTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ScrollDomainListResponseBodyDataDomainTagTag build(java.util.Map<String, ?> map) throws Exception {
            ScrollDomainListResponseBodyDataDomainTagTag self = new ScrollDomainListResponseBodyDataDomainTagTag();
            return TeaModel.build(map, self);
        }

        public ScrollDomainListResponseBodyDataDomainTagTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ScrollDomainListResponseBodyDataDomainTagTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ScrollDomainListResponseBodyDataDomainTag extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<ScrollDomainListResponseBodyDataDomainTagTag> tag;

        public static ScrollDomainListResponseBodyDataDomainTag build(java.util.Map<String, ?> map) throws Exception {
            ScrollDomainListResponseBodyDataDomainTag self = new ScrollDomainListResponseBodyDataDomainTag();
            return TeaModel.build(map, self);
        }

        public ScrollDomainListResponseBodyDataDomainTag setTag(java.util.List<ScrollDomainListResponseBodyDataDomainTagTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<ScrollDomainListResponseBodyDataDomainTagTag> getTag() {
            return this.tag;
        }

    }

    public static class ScrollDomainListResponseBodyDataDomain extends TeaModel {
        @NameInMap("DnsList")
        public ScrollDomainListResponseBodyDataDomainDnsList dnsList;

        @NameInMap("DomainAuditStatus")
        public String domainAuditStatus;

        @NameInMap("DomainGroupId")
        public String domainGroupId;

        @NameInMap("DomainGroupName")
        public String domainGroupName;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("DomainStatus")
        public String domainStatus;

        @NameInMap("DomainType")
        public String domainType;

        @NameInMap("Email")
        public String email;

        @NameInMap("ExpirationCurrDateDiff")
        public Integer expirationCurrDateDiff;

        @NameInMap("ExpirationDate")
        public String expirationDate;

        @NameInMap("ExpirationDateLong")
        public Long expirationDateLong;

        @NameInMap("ExpirationDateStatus")
        public String expirationDateStatus;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Premium")
        public Boolean premium;

        @NameInMap("ProductId")
        public String productId;

        @NameInMap("RegistrantOrganization")
        public String registrantOrganization;

        @NameInMap("RegistrantType")
        public String registrantType;

        @NameInMap("RegistrationDate")
        public String registrationDate;

        @NameInMap("RegistrationDateLong")
        public Long registrationDateLong;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("Tag")
        public ScrollDomainListResponseBodyDataDomainTag tag;

        @NameInMap("ZhRegistrantOrganization")
        public String zhRegistrantOrganization;

        public static ScrollDomainListResponseBodyDataDomain build(java.util.Map<String, ?> map) throws Exception {
            ScrollDomainListResponseBodyDataDomain self = new ScrollDomainListResponseBodyDataDomain();
            return TeaModel.build(map, self);
        }

        public ScrollDomainListResponseBodyDataDomain setDnsList(ScrollDomainListResponseBodyDataDomainDnsList dnsList) {
            this.dnsList = dnsList;
            return this;
        }
        public ScrollDomainListResponseBodyDataDomainDnsList getDnsList() {
            return this.dnsList;
        }

        public ScrollDomainListResponseBodyDataDomain setDomainAuditStatus(String domainAuditStatus) {
            this.domainAuditStatus = domainAuditStatus;
            return this;
        }
        public String getDomainAuditStatus() {
            return this.domainAuditStatus;
        }

        public ScrollDomainListResponseBodyDataDomain setDomainGroupId(String domainGroupId) {
            this.domainGroupId = domainGroupId;
            return this;
        }
        public String getDomainGroupId() {
            return this.domainGroupId;
        }

        public ScrollDomainListResponseBodyDataDomain setDomainGroupName(String domainGroupName) {
            this.domainGroupName = domainGroupName;
            return this;
        }
        public String getDomainGroupName() {
            return this.domainGroupName;
        }

        public ScrollDomainListResponseBodyDataDomain setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public ScrollDomainListResponseBodyDataDomain setDomainStatus(String domainStatus) {
            this.domainStatus = domainStatus;
            return this;
        }
        public String getDomainStatus() {
            return this.domainStatus;
        }

        public ScrollDomainListResponseBodyDataDomain setDomainType(String domainType) {
            this.domainType = domainType;
            return this;
        }
        public String getDomainType() {
            return this.domainType;
        }

        public ScrollDomainListResponseBodyDataDomain setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ScrollDomainListResponseBodyDataDomain setExpirationCurrDateDiff(Integer expirationCurrDateDiff) {
            this.expirationCurrDateDiff = expirationCurrDateDiff;
            return this;
        }
        public Integer getExpirationCurrDateDiff() {
            return this.expirationCurrDateDiff;
        }

        public ScrollDomainListResponseBodyDataDomain setExpirationDate(String expirationDate) {
            this.expirationDate = expirationDate;
            return this;
        }
        public String getExpirationDate() {
            return this.expirationDate;
        }

        public ScrollDomainListResponseBodyDataDomain setExpirationDateLong(Long expirationDateLong) {
            this.expirationDateLong = expirationDateLong;
            return this;
        }
        public Long getExpirationDateLong() {
            return this.expirationDateLong;
        }

        public ScrollDomainListResponseBodyDataDomain setExpirationDateStatus(String expirationDateStatus) {
            this.expirationDateStatus = expirationDateStatus;
            return this;
        }
        public String getExpirationDateStatus() {
            return this.expirationDateStatus;
        }

        public ScrollDomainListResponseBodyDataDomain setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ScrollDomainListResponseBodyDataDomain setPremium(Boolean premium) {
            this.premium = premium;
            return this;
        }
        public Boolean getPremium() {
            return this.premium;
        }

        public ScrollDomainListResponseBodyDataDomain setProductId(String productId) {
            this.productId = productId;
            return this;
        }
        public String getProductId() {
            return this.productId;
        }

        public ScrollDomainListResponseBodyDataDomain setRegistrantOrganization(String registrantOrganization) {
            this.registrantOrganization = registrantOrganization;
            return this;
        }
        public String getRegistrantOrganization() {
            return this.registrantOrganization;
        }

        public ScrollDomainListResponseBodyDataDomain setRegistrantType(String registrantType) {
            this.registrantType = registrantType;
            return this;
        }
        public String getRegistrantType() {
            return this.registrantType;
        }

        public ScrollDomainListResponseBodyDataDomain setRegistrationDate(String registrationDate) {
            this.registrationDate = registrationDate;
            return this;
        }
        public String getRegistrationDate() {
            return this.registrationDate;
        }

        public ScrollDomainListResponseBodyDataDomain setRegistrationDateLong(Long registrationDateLong) {
            this.registrationDateLong = registrationDateLong;
            return this;
        }
        public Long getRegistrationDateLong() {
            return this.registrationDateLong;
        }

        public ScrollDomainListResponseBodyDataDomain setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public ScrollDomainListResponseBodyDataDomain setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ScrollDomainListResponseBodyDataDomain setTag(ScrollDomainListResponseBodyDataDomainTag tag) {
            this.tag = tag;
            return this;
        }
        public ScrollDomainListResponseBodyDataDomainTag getTag() {
            return this.tag;
        }

        public ScrollDomainListResponseBodyDataDomain setZhRegistrantOrganization(String zhRegistrantOrganization) {
            this.zhRegistrantOrganization = zhRegistrantOrganization;
            return this;
        }
        public String getZhRegistrantOrganization() {
            return this.zhRegistrantOrganization;
        }

    }

    public static class ScrollDomainListResponseBodyData extends TeaModel {
        @NameInMap("Domain")
        public java.util.List<ScrollDomainListResponseBodyDataDomain> domain;

        public static ScrollDomainListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ScrollDomainListResponseBodyData self = new ScrollDomainListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ScrollDomainListResponseBodyData setDomain(java.util.List<ScrollDomainListResponseBodyDataDomain> domain) {
            this.domain = domain;
            return this;
        }
        public java.util.List<ScrollDomainListResponseBodyDataDomain> getDomain() {
            return this.domain;
        }

    }

}
