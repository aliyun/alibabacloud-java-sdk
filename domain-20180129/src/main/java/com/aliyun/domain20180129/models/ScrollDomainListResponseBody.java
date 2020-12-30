// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class ScrollDomainListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ScrollId")
    public String scrollId;

    @NameInMap("Data")
    public ScrollDomainListResponseBodyData data;

    @NameInMap("TotalItemNum")
    public Integer totalItemNum;

    public static ScrollDomainListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ScrollDomainListResponseBody self = new ScrollDomainListResponseBody();
        return TeaModel.build(map, self);
    }

    public ScrollDomainListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ScrollDomainListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ScrollDomainListResponseBody setScrollId(String scrollId) {
        this.scrollId = scrollId;
        return this;
    }
    public String getScrollId() {
        return this.scrollId;
    }

    public ScrollDomainListResponseBody setData(ScrollDomainListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ScrollDomainListResponseBodyData getData() {
        return this.data;
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

    public static class ScrollDomainListResponseBodyDataDomain extends TeaModel {
        @NameInMap("DomainAuditStatus")
        public String domainAuditStatus;

        @NameInMap("DomainGroupId")
        public String domainGroupId;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("DomainGroupName")
        public String domainGroupName;

        @NameInMap("ZhRegistrantOrganization")
        public String zhRegistrantOrganization;

        @NameInMap("RegistrantOrganization")
        public String registrantOrganization;

        @NameInMap("RegistrationDate")
        public String registrationDate;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("ExpirationDateStatus")
        public String expirationDateStatus;

        @NameInMap("ExpirationDate")
        public String expirationDate;

        @NameInMap("DnsList")
        public ScrollDomainListResponseBodyDataDomainDnsList dnsList;

        @NameInMap("Email")
        public String email;

        @NameInMap("RegistrantType")
        public String registrantType;

        @NameInMap("ExpirationDateLong")
        public Long expirationDateLong;

        @NameInMap("ExpirationCurrDateDiff")
        public Integer expirationCurrDateDiff;

        @NameInMap("Premium")
        public Boolean premium;

        @NameInMap("RegistrationDateLong")
        public Long registrationDateLong;

        @NameInMap("ProductId")
        public String productId;

        @NameInMap("DomainStatus")
        public String domainStatus;

        @NameInMap("DomainType")
        public String domainType;

        public static ScrollDomainListResponseBodyDataDomain build(java.util.Map<String, ?> map) throws Exception {
            ScrollDomainListResponseBodyDataDomain self = new ScrollDomainListResponseBodyDataDomain();
            return TeaModel.build(map, self);
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

        public ScrollDomainListResponseBodyDataDomain setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public ScrollDomainListResponseBodyDataDomain setDomainGroupName(String domainGroupName) {
            this.domainGroupName = domainGroupName;
            return this;
        }
        public String getDomainGroupName() {
            return this.domainGroupName;
        }

        public ScrollDomainListResponseBodyDataDomain setZhRegistrantOrganization(String zhRegistrantOrganization) {
            this.zhRegistrantOrganization = zhRegistrantOrganization;
            return this;
        }
        public String getZhRegistrantOrganization() {
            return this.zhRegistrantOrganization;
        }

        public ScrollDomainListResponseBodyDataDomain setRegistrantOrganization(String registrantOrganization) {
            this.registrantOrganization = registrantOrganization;
            return this;
        }
        public String getRegistrantOrganization() {
            return this.registrantOrganization;
        }

        public ScrollDomainListResponseBodyDataDomain setRegistrationDate(String registrationDate) {
            this.registrationDate = registrationDate;
            return this;
        }
        public String getRegistrationDate() {
            return this.registrationDate;
        }

        public ScrollDomainListResponseBodyDataDomain setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ScrollDomainListResponseBodyDataDomain setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public ScrollDomainListResponseBodyDataDomain setExpirationDateStatus(String expirationDateStatus) {
            this.expirationDateStatus = expirationDateStatus;
            return this;
        }
        public String getExpirationDateStatus() {
            return this.expirationDateStatus;
        }

        public ScrollDomainListResponseBodyDataDomain setExpirationDate(String expirationDate) {
            this.expirationDate = expirationDate;
            return this;
        }
        public String getExpirationDate() {
            return this.expirationDate;
        }

        public ScrollDomainListResponseBodyDataDomain setDnsList(ScrollDomainListResponseBodyDataDomainDnsList dnsList) {
            this.dnsList = dnsList;
            return this;
        }
        public ScrollDomainListResponseBodyDataDomainDnsList getDnsList() {
            return this.dnsList;
        }

        public ScrollDomainListResponseBodyDataDomain setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ScrollDomainListResponseBodyDataDomain setRegistrantType(String registrantType) {
            this.registrantType = registrantType;
            return this;
        }
        public String getRegistrantType() {
            return this.registrantType;
        }

        public ScrollDomainListResponseBodyDataDomain setExpirationDateLong(Long expirationDateLong) {
            this.expirationDateLong = expirationDateLong;
            return this;
        }
        public Long getExpirationDateLong() {
            return this.expirationDateLong;
        }

        public ScrollDomainListResponseBodyDataDomain setExpirationCurrDateDiff(Integer expirationCurrDateDiff) {
            this.expirationCurrDateDiff = expirationCurrDateDiff;
            return this;
        }
        public Integer getExpirationCurrDateDiff() {
            return this.expirationCurrDateDiff;
        }

        public ScrollDomainListResponseBodyDataDomain setPremium(Boolean premium) {
            this.premium = premium;
            return this;
        }
        public Boolean getPremium() {
            return this.premium;
        }

        public ScrollDomainListResponseBodyDataDomain setRegistrationDateLong(Long registrationDateLong) {
            this.registrationDateLong = registrationDateLong;
            return this;
        }
        public Long getRegistrationDateLong() {
            return this.registrationDateLong;
        }

        public ScrollDomainListResponseBodyDataDomain setProductId(String productId) {
            this.productId = productId;
            return this;
        }
        public String getProductId() {
            return this.productId;
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
