// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetInstanceResponseBody extends TeaModel {
    /**
     * <p>The details of the instance.</p>
     */
    @NameInMap("Instance")
    public GetInstanceResponseBodyInstance instance;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceResponseBody self = new GetInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceResponseBody setInstance(GetInstanceResponseBodyInstance instance) {
        this.instance = instance;
        return this;
    }
    public GetInstanceResponseBodyInstance getInstance() {
        return this.instance;
    }

    public GetInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetInstanceResponseBodyInstanceDefaultEndpoint extends TeaModel {
        /**
         * <p>The endpoint of the instance.</p>
         */
        @NameInMap("Endpoint")
        public String endpoint;

        /**
         * <p>The status of the endpoint. Valid values:</p>
         * <br>
         * <p>*   resolved</p>
         * <p>*   unresolved</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetInstanceResponseBodyInstanceDefaultEndpoint build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceResponseBodyInstanceDefaultEndpoint self = new GetInstanceResponseBodyInstanceDefaultEndpoint();
            return TeaModel.build(map, self);
        }

        public GetInstanceResponseBodyInstanceDefaultEndpoint setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public GetInstanceResponseBodyInstanceDefaultEndpoint setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class GetInstanceResponseBodyInstanceDomainConfig extends TeaModel {
        /**
         * <p>The default domain of the instance.</p>
         */
        @NameInMap("DefaultDomain")
        public String defaultDomain;

        /**
         * <p>The init domain of the instance.</p>
         */
        @NameInMap("InitDomain")
        public String initDomain;

        /**
         * <p>Valid values:</p>
         * <br>
         * <p>*   true</p>
         * <p>*   false</p>
         */
        @NameInMap("InitDomainAutoRedirectStatus")
        public String initDomainAutoRedirectStatus;

        public static GetInstanceResponseBodyInstanceDomainConfig build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceResponseBodyInstanceDomainConfig self = new GetInstanceResponseBodyInstanceDomainConfig();
            return TeaModel.build(map, self);
        }

        public GetInstanceResponseBodyInstanceDomainConfig setDefaultDomain(String defaultDomain) {
            this.defaultDomain = defaultDomain;
            return this;
        }
        public String getDefaultDomain() {
            return this.defaultDomain;
        }

        public GetInstanceResponseBodyInstanceDomainConfig setInitDomain(String initDomain) {
            this.initDomain = initDomain;
            return this;
        }
        public String getInitDomain() {
            return this.initDomain;
        }

        public GetInstanceResponseBodyInstanceDomainConfig setInitDomainAutoRedirectStatus(String initDomainAutoRedirectStatus) {
            this.initDomainAutoRedirectStatus = initDomainAutoRedirectStatus;
            return this;
        }
        public String getInitDomainAutoRedirectStatus() {
            return this.initDomainAutoRedirectStatus;
        }

    }

    public static class GetInstanceResponseBodyInstance extends TeaModel {
        /**
         * <p>The time when the instance was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The default endpoint of the instance.</p>
         */
        @NameInMap("DefaultEndpoint")
        public GetInstanceResponseBodyInstanceDefaultEndpoint defaultEndpoint;

        /**
         * <p>The description of the instance.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The default domain of the instance.</p>
         */
        @NameInMap("DomainConfig")
        public GetInstanceResponseBodyInstanceDomainConfig domainConfig;

        /**
         * <p>The outbound public CIDR blocks of the instance. For example, when you synchronize Active Directory (AD) accounts, the IDaaS EIAM instance accesses your AD service by using the outbound public CIDR blocks.</p>
         */
        @NameInMap("EgressAddresses")
        public java.util.List<String> egressAddresses;

        /**
         * <p>The instance ID.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The status of the instance. Valid values:</p>
         * <br>
         * <p>*   creating</p>
         * <p>*   running</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetInstanceResponseBodyInstance build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceResponseBodyInstance self = new GetInstanceResponseBodyInstance();
            return TeaModel.build(map, self);
        }

        public GetInstanceResponseBodyInstance setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetInstanceResponseBodyInstance setDefaultEndpoint(GetInstanceResponseBodyInstanceDefaultEndpoint defaultEndpoint) {
            this.defaultEndpoint = defaultEndpoint;
            return this;
        }
        public GetInstanceResponseBodyInstanceDefaultEndpoint getDefaultEndpoint() {
            return this.defaultEndpoint;
        }

        public GetInstanceResponseBodyInstance setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetInstanceResponseBodyInstance setDomainConfig(GetInstanceResponseBodyInstanceDomainConfig domainConfig) {
            this.domainConfig = domainConfig;
            return this;
        }
        public GetInstanceResponseBodyInstanceDomainConfig getDomainConfig() {
            return this.domainConfig;
        }

        public GetInstanceResponseBodyInstance setEgressAddresses(java.util.List<String> egressAddresses) {
            this.egressAddresses = egressAddresses;
            return this;
        }
        public java.util.List<String> getEgressAddresses() {
            return this.egressAddresses;
        }

        public GetInstanceResponseBodyInstance setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetInstanceResponseBodyInstance setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
