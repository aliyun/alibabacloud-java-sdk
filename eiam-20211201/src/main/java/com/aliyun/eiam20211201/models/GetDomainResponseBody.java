// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetDomainResponseBody extends TeaModel {
    @NameInMap("Domain")
    public GetDomainResponseBodyDomain domain;

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
         * <p>域名关联的备案号, 长度最大限制64。</p>
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
        public GetDomainResponseBodyDomainFiling filing;

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

        public static GetDomainResponseBodyDomain build(java.util.Map<String, ?> map) throws Exception {
            GetDomainResponseBodyDomain self = new GetDomainResponseBodyDomain();
            return TeaModel.build(map, self);
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
