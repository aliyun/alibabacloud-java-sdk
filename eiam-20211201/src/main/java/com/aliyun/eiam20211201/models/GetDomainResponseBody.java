// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetDomainResponseBody extends TeaModel {
    /**
     * <p>The domain name object.</p>
     */
    @NameInMap("Domain")
    public GetDomainResponseBodyDomain domain;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDomainResponseBody self = new GetDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDomainResponseBody setDomain(GetDomainResponseBodyDomain domain) {
        this.domain = domain;
        return this;
    }
    public GetDomainResponseBodyDomain getDomain() {
        return this.domain;
    }

    public GetDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDomainResponseBodyDomainFiling extends TeaModel {
        /**
         * <p>The ICP filing number that is associated with the domain name. The ICP filing number can be for an entity or a website.</p>
         * 
         * <strong>example:</strong>
         * <p>xICPxxxxxx-xx</p>
         */
        @NameInMap("IcpNumber")
        public String icpNumber;

        public static GetDomainResponseBodyDomainFiling build(java.util.Map<String, ?> map) throws Exception {
            GetDomainResponseBodyDomainFiling self = new GetDomainResponseBodyDomainFiling();
            return TeaModel.build(map, self);
        }

        public GetDomainResponseBodyDomainFiling setIcpNumber(String icpNumber) {
            this.icpNumber = icpNumber;
            return this;
        }
        public String getIcpNumber() {
            return this.icpNumber;
        }

    }

    public static class GetDomainResponseBodyDomain extends TeaModel {
        /**
         * <p>The ID of the brand.</p>
         * 
         * <strong>example:</strong>
         * <p>brand_xxxxx</p>
         */
        @NameInMap("BrandId")
        public String brandId;

        /**
         * <p>The time when the domain name was created. This value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1649830226000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>Specifies whether the domain name is the default domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("DefaultDomain")
        public Boolean defaultDomain;

        /**
         * <p>The domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>login.example.com</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>The ID of the domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>dm_examplexxxxx</p>
         */
        @NameInMap("DomainId")
        public String domainId;

        /**
         * <p>The type of the domain name. Valid values:</p>
         * <ul>
         * <li><p>system_init: The initial domain name.</p>
         * </li>
         * <li><p>user_custom: A custom domain name.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>system_init</p>
         */
        @NameInMap("DomainType")
        public String domainType;

        /**
         * <p>The ICP filing information about the domain name.</p>
         */
        @NameInMap("Filing")
        public GetDomainResponseBodyDomainFiling filing;

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The lock status of the domain name. Valid values:</p>
         * <ul>
         * <li><p>unlock: Normal.</p>
         * </li>
         * <li><p>lockByLicense: The domain name is unavailable due to license restrictions.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>unlock</p>
         */
        @NameInMap("LockMode")
        public String lockMode;

        /**
         * <p>The time when the domain name was last updated. This value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1649830226000</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static GetDomainResponseBodyDomain build(java.util.Map<String, ?> map) throws Exception {
            GetDomainResponseBodyDomain self = new GetDomainResponseBodyDomain();
            return TeaModel.build(map, self);
        }

        public GetDomainResponseBodyDomain setBrandId(String brandId) {
            this.brandId = brandId;
            return this;
        }
        public String getBrandId() {
            return this.brandId;
        }

        public GetDomainResponseBodyDomain setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetDomainResponseBodyDomain setDefaultDomain(Boolean defaultDomain) {
            this.defaultDomain = defaultDomain;
            return this;
        }
        public Boolean getDefaultDomain() {
            return this.defaultDomain;
        }

        public GetDomainResponseBodyDomain setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public GetDomainResponseBodyDomain setDomainId(String domainId) {
            this.domainId = domainId;
            return this;
        }
        public String getDomainId() {
            return this.domainId;
        }

        public GetDomainResponseBodyDomain setDomainType(String domainType) {
            this.domainType = domainType;
            return this;
        }
        public String getDomainType() {
            return this.domainType;
        }

        public GetDomainResponseBodyDomain setFiling(GetDomainResponseBodyDomainFiling filing) {
            this.filing = filing;
            return this;
        }
        public GetDomainResponseBodyDomainFiling getFiling() {
            return this.filing;
        }

        public GetDomainResponseBodyDomain setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetDomainResponseBodyDomain setLockMode(String lockMode) {
            this.lockMode = lockMode;
            return this;
        }
        public String getLockMode() {
            return this.lockMode;
        }

        public GetDomainResponseBodyDomain setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
