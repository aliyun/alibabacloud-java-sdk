// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListDomainsResponseBody extends TeaModel {
    @NameInMap("Domains")
    public java.util.List<ListDomainsResponseBodyDomains> domains;

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
         * <p>域名关联的备案号, 长度最大限制64。</p>
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
        /**
         * <p>域名创建时间，Unix时间戳格式，单位为毫秒。</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>是否默认域名。true表示实例默认域名，false表示非默认域名</p>
         */
        @NameInMap("DefaultDomain")
        public Boolean defaultDomain;

        /**
         * <p>域名。</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>域名ID。</p>
         */
        @NameInMap("DomainId")
        public String domainId;

        /**
         * <p>域名类型。枚举取值:system_init(系统初始化)、user_custom(用户自定义)。</p>
         */
        @NameInMap("DomainType")
        public String domainType;

        /**
         * <p>域名备案信息。</p>
         */
        @NameInMap("Filing")
        public ListDomainsResponseBodyDomainsFiling filing;

        /**
         * <p>实例ID。</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>域名锁定状态。枚举取值:unlock(正常)、lockByLicense(因License限制不可用)。</p>
         */
        @NameInMap("LockMode")
        public String lockMode;

        /**
         * <p>域名最近更新时间，Unix时间戳格式，单位为毫秒。</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static ListDomainsResponseBodyDomains build(java.util.Map<String, ?> map) throws Exception {
            ListDomainsResponseBodyDomains self = new ListDomainsResponseBodyDomains();
            return TeaModel.build(map, self);
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
