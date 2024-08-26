// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class ScrollDomainListResponseBody extends TeaModel {
    /**
     * <p>The domain names.</p>
     */
    @NameInMap("Data")
    public ScrollDomainListResponseBodyData data;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>722AB7F5-61F0-408C-A012-4784AFD34083</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The scroll ID.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("ScrollId")
    public String scrollId;

    /**
     * <p>The number of remaining domain names to be queried.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
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
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>testKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>testValue</p>
         */
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
        /**
         * <p>The Domain Name System (DNS) servers of the domain name.</p>
         */
        @NameInMap("DnsList")
        public ScrollDomainListResponseBodyDataDomainDnsList dnsList;

        /**
         * <p>The status of real-name verification for the domain name. Valid values:</p>
         * <ul>
         * <li><strong>FAILED</strong>: Real-name verification for the domain name fails.</li>
         * <li><strong>SUCCEED</strong>: Real-name verification for the domain name is successful.</li>
         * <li><strong>NONAUDIT</strong>: Real-name verification for the domain name is not performed.</li>
         * <li><strong>AUDITING</strong>: Real-name verification for the domain name is in progress.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NONAUDIT</p>
         */
        @NameInMap("DomainAuditStatus")
        public String domainAuditStatus;

        /**
         * <p>The ID of the domain name group.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("DomainGroupId")
        public String domainGroupId;

        /**
         * <p>The name of the domain name group.</p>
         * 
         * <strong>example:</strong>
         * <p>test group</p>
         */
        @NameInMap("DomainGroupName")
        public String domainGroupName;

        /**
         * <p>The domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>The status of the domain name. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: The domain name needs to be renewed.</li>
         * <li><strong>2</strong>: The domain name needs to be redeemed.</li>
         * <li><strong>3</strong>: The domain name is normal.</li>
         * <li><strong>4</strong>: The domain name is being transferred out.</li>
         * <li><strong>5</strong>: The information about the domain name registrant is being modified.</li>
         * <li><strong>6</strong>: Real-name verification is not performed on the domain name.</li>
         * <li><strong>7</strong>: Real-name verification for the domain name fails.</li>
         * <li><strong>8</strong>: The real-name verification is being reviewed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("DomainStatus")
        public String domainStatus;

        /**
         * <p>The type of the domain name. Valid values:</p>
         * <ul>
         * <li><strong>New gTLD</strong></li>
         * <li><strong>gTLD</strong></li>
         * <li><strong>ccTLD</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>gTLD</p>
         */
        @NameInMap("DomainType")
        public String domainType;

        /**
         * <p>The email address.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:username@example.com">username@example.com</a></p>
         */
        @NameInMap("Email")
        public String email;

        /**
         * <p>The number of days from the expiration date of the domain name to the current date.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("ExpirationCurrDateDiff")
        public Integer expirationCurrDateDiff;

        /**
         * <p>The time when the domain name expires.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-02-15 17:30:35</p>
         */
        @NameInMap("ExpirationDate")
        public String expirationDate;

        /**
         * <p>The time when the domain name expires. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1550223035000</p>
         */
        @NameInMap("ExpirationDateLong")
        public Long expirationDateLong;

        /**
         * <p>Indicates whether the domain name expires. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: The domain name does not expire.</li>
         * <li><strong>2</strong>: The domain name expires.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ExpirationDateStatus")
        public String expirationDateStatus;

        /**
         * <p>The instance ID of the domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>S1234</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>Indicates whether the domain name is a premium domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Premium")
        public Boolean premium;

        /**
         * <p>The service ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2a</p>
         */
        @NameInMap("ProductId")
        public String productId;

        /**
         * <p>The registrant of the domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>alibaba cloud</p>
         */
        @NameInMap("RegistrantOrganization")
        public String registrantOrganization;

        /**
         * <p>The registration type of the domain name. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: individual.</li>
         * <li><strong>2</strong>: enterprise.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RegistrantType")
        public String registrantType;

        /**
         * <p>The time when the domain name was registered.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-02-15 00:00:00</p>
         */
        @NameInMap("RegistrationDate")
        public String registrationDate;

        /**
         * <p>The time when the domain name was registered. This value is a UNIX timestamp that indicates the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1487088000000</p>
         */
        @NameInMap("RegistrationDateLong")
        public Long registrationDateLong;

        /**
         * <p>The remarks on the domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>test domain</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aek2yyciz557g3q</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The resource tag.</p>
         */
        @NameInMap("Tag")
        public ScrollDomainListResponseBodyDataDomainTag tag;

        /**
         * <p>The Chinese name of the domain name registrant.</p>
         * 
         * <strong>example:</strong>
         * <p>阿里云</p>
         */
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
