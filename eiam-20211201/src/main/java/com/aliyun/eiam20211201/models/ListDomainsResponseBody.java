// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListDomainsResponseBody extends TeaModel {
    /**
     * <p>The information about the domain names.</p>
     */
    @NameInMap("Domains")
    public java.util.List<ListDomainsResponseBodyDomains> domains;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListDomainsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDomainsResponseBody self = new ListDomainsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDomainsResponseBody setDomains(java.util.List<ListDomainsResponseBodyDomains> domains) {
        this.domains = domains;
        return this;
    }
    public java.util.List<ListDomainsResponseBodyDomains> getDomains() {
        return this.domains;
    }

    public ListDomainsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListDomainsResponseBodyDomainsFiling extends TeaModel {
        /**
         * <p>The ICP number associated with the domain name. Both the entity ICP number and website ICP number are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>Zhexx-xxxxxx</p>
         */
        @NameInMap("IcpNumber")
        public String icpNumber;

        public static ListDomainsResponseBodyDomainsFiling build(java.util.Map<String, ?> map) throws Exception {
            ListDomainsResponseBodyDomainsFiling self = new ListDomainsResponseBodyDomainsFiling();
            return TeaModel.build(map, self);
        }

        public ListDomainsResponseBodyDomainsFiling setIcpNumber(String icpNumber) {
            this.icpNumber = icpNumber;
            return this;
        }
        public String getIcpNumber() {
            return this.icpNumber;
        }

    }

    public static class ListDomainsResponseBodyDomains extends TeaModel {
        @NameInMap("BrandId")
        public String brandId;

        /**
         * <p>The time when the domain name was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1649830226000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>Indicates whether the domain name is the default domain.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("DefaultDomain")
        public Boolean defaultDomain;

        /**
         * <p>The domain.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com">www.example.com</a></p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>The domain ID.</p>
         * 
         * <strong>example:</strong>
         * <p>dm_examplexxxxx</p>
         */
        @NameInMap("DomainId")
        public String domainId;

        /**
         * <p>The type of the domain name. Valid values:</p>
         * <ul>
         * <li>system_init: an initial domain name.</li>
         * <li>user_custom: a custom domain name.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>system_init</p>
         */
        @NameInMap("DomainType")
        public String domainType;

        /**
         * <p>The information about the Internet content provider (ICP) filing of the domain name.</p>
         */
        @NameInMap("Filing")
        public ListDomainsResponseBodyDomainsFiling filing;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>Indicates whether the domain name is locked. Valid values:</p>
         * <ul>
         * <li>unlock</li>
         * <li>lockByLicense</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>unlock</p>
         */
        @NameInMap("LockMode")
        public String lockMode;

        /**
         * <p>The time when the domain name was last updated. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1649830226000</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static ListDomainsResponseBodyDomains build(java.util.Map<String, ?> map) throws Exception {
            ListDomainsResponseBodyDomains self = new ListDomainsResponseBodyDomains();
            return TeaModel.build(map, self);
        }

        public ListDomainsResponseBodyDomains setBrandId(String brandId) {
            this.brandId = brandId;
            return this;
        }
        public String getBrandId() {
            return this.brandId;
        }

        public ListDomainsResponseBodyDomains setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListDomainsResponseBodyDomains setDefaultDomain(Boolean defaultDomain) {
            this.defaultDomain = defaultDomain;
            return this;
        }
        public Boolean getDefaultDomain() {
            return this.defaultDomain;
        }

        public ListDomainsResponseBodyDomains setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public ListDomainsResponseBodyDomains setDomainId(String domainId) {
            this.domainId = domainId;
            return this;
        }
        public String getDomainId() {
            return this.domainId;
        }

        public ListDomainsResponseBodyDomains setDomainType(String domainType) {
            this.domainType = domainType;
            return this;
        }
        public String getDomainType() {
            return this.domainType;
        }

        public ListDomainsResponseBodyDomains setFiling(ListDomainsResponseBodyDomainsFiling filing) {
            this.filing = filing;
            return this;
        }
        public ListDomainsResponseBodyDomainsFiling getFiling() {
            return this.filing;
        }

        public ListDomainsResponseBodyDomains setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListDomainsResponseBodyDomains setLockMode(String lockMode) {
            this.lockMode = lockMode;
            return this;
        }
        public String getLockMode() {
            return this.lockMode;
        }

        public ListDomainsResponseBodyDomains setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
