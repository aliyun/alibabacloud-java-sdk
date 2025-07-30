// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetDomainResponseBody extends TeaModel {
    /**
     * <p>The domain name.</p>
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
         * <p><notice>The ICP filing number is only applicable for services in the China region.  For non-China regions, no validation or display of this record number will be performed.</notice>
         * The ICP filing number associated with the domain name, with a maximum length of 64 characters.</p>
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
         * <p>The start time when the change order was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1649830226000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>Whether it is the default domain.</p>
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
         * <p>login.example.com</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>Domain ID.</p>
         * 
         * <strong>example:</strong>
         * <p>dm_examplexxxxx</p>
         */
        @NameInMap("DomainId")
        public String domainId;

        /**
         * <p>The type of the domain name. Valid values:</p>
         * <ul>
         * <li><strong>system_init</strong>: Initialize domain</li>
         * <li><strong>user_custom</strong>: user custom domain</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>system_init</p>
         */
        @NameInMap("DomainType")
        public String domainType;

        /**
         * <p>Domain registration information.</p>
         */
        @NameInMap("Filing")
        public GetDomainResponseBodyDomainFiling filing;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The lock status of the instance. Valid values:</p>
         * <ul>
         * <li><strong>Unlock</strong>: The instance is normal.</li>
         * <li><strong>lockByLicense</strong>: Not available due to license restrictions.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>unlock</p>
         */
        @NameInMap("LockMode")
        public String lockMode;

        /**
         * <p>The time when the service was updated.</p>
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
