// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetInstanceResponseBody extends TeaModel {
    /**
     * <p>The instance information.</p>
     */
    @NameInMap("Instance")
    public GetInstanceResponseBodyInstance instance;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
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
         * <p>The domain name of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>example-xxx.aliyunidaas.com</p>
         */
        @NameInMap("Endpoint")
        public String endpoint;

        /**
         * <p>The status of the instance domain name. Valid values:</p>
         * <ul>
         * <li>resolved: Resolved.</li>
         * <li>unresolved: Not resolved.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>resolved</p>
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
         * <p>The default domain name of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>login.example.com</p>
         */
        @NameInMap("DefaultDomain")
        public String defaultDomain;

        /**
         * <p>The initialization domain name of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>rx72nxxx.example.com</p>
         */
        @NameInMap("InitDomain")
        public String initDomain;

        /**
         * <p>The automatic redirect status of the initialization domain name. Valid values:</p>
         * <ul>
         * <li><p>enabled: Enabled.</p>
         * </li>
         * <li><p>disabled: Disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>disabled</p>
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

    public static class GetInstanceResponseBodyInstanceReplicationConfiguration extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>idaas_xxxx</p>
         */
        @NameInMap("BackupInstanceId")
        public String backupInstanceId;

        /**
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("BackupInstanceRegionId")
        public String backupInstanceRegionId;

        /**
         * <strong>example:</strong>
         * <p>idaas_xxxx</p>
         */
        @NameInMap("PrimaryInstanceId")
        public String primaryInstanceId;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("PrimaryInstanceRegionId")
        public String primaryInstanceRegionId;

        /**
         * <strong>example:</strong>
         * <p>1778499337000</p>
         */
        @NameInMap("ReplicationCreateTime")
        public Long replicationCreateTime;

        public static GetInstanceResponseBodyInstanceReplicationConfiguration build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceResponseBodyInstanceReplicationConfiguration self = new GetInstanceResponseBodyInstanceReplicationConfiguration();
            return TeaModel.build(map, self);
        }

        public GetInstanceResponseBodyInstanceReplicationConfiguration setBackupInstanceId(String backupInstanceId) {
            this.backupInstanceId = backupInstanceId;
            return this;
        }
        public String getBackupInstanceId() {
            return this.backupInstanceId;
        }

        public GetInstanceResponseBodyInstanceReplicationConfiguration setBackupInstanceRegionId(String backupInstanceRegionId) {
            this.backupInstanceRegionId = backupInstanceRegionId;
            return this;
        }
        public String getBackupInstanceRegionId() {
            return this.backupInstanceRegionId;
        }

        public GetInstanceResponseBodyInstanceReplicationConfiguration setPrimaryInstanceId(String primaryInstanceId) {
            this.primaryInstanceId = primaryInstanceId;
            return this;
        }
        public String getPrimaryInstanceId() {
            return this.primaryInstanceId;
        }

        public GetInstanceResponseBodyInstanceReplicationConfiguration setPrimaryInstanceRegionId(String primaryInstanceRegionId) {
            this.primaryInstanceRegionId = primaryInstanceRegionId;
            return this;
        }
        public String getPrimaryInstanceRegionId() {
            return this.primaryInstanceRegionId;
        }

        public GetInstanceResponseBodyInstanceReplicationConfiguration setReplicationCreateTime(Long replicationCreateTime) {
            this.replicationCreateTime = replicationCreateTime;
            return this;
        }
        public Long getReplicationCreateTime() {
            return this.replicationCreateTime;
        }

    }

    public static class GetInstanceResponseBodyInstance extends TeaModel {
        /**
         * <p>The time when the instance was created. The value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1550115455000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("CrossRegionReplication")
        public String crossRegionReplication;

        /**
         * <strong>example:</strong>
         * <p>primary</p>
         */
        @NameInMap("CrossRegionReplicationRole")
        public String crossRegionReplicationRole;

        /**
         * <p>The default domain name of the instance. This field is no longer maintained. Use the DomainConfig fields or refer to the query domain name list operation instead.</p>
         */
        @NameInMap("DefaultEndpoint")
        public GetInstanceResponseBodyInstanceDefaultEndpoint defaultEndpoint;

        /**
         * <p>The description of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>instance_for_test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The domain name configuration of the instance.</p>
         */
        @NameInMap("DomainConfig")
        public GetInstanceResponseBodyInstanceDomainConfig domainConfig;

        /**
         * <p>The public egress CIDR blocks of the instance. For example, during Active Directory (AD) account synchronization, the EIAM instance accesses your AD server through these public CIDR blocks.</p>
         */
        @NameInMap("EgressAddresses")
        public java.util.List<String> egressAddresses;

        /**
         * <strong>example:</strong>
         * <p>inactive</p>
         */
        @NameInMap("InstanceFailoverStatus")
        public String instanceFailoverStatus;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_abt3pfwojojcq323si6g5xxxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The ServiceCode of the Alibaba Cloud service that manages the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>sase</p>
         * 
         * <strong>if can be null:</strong>
         * <p>false</p>
         */
        @NameInMap("ManagedServiceCode")
        public String managedServiceCode;

        @NameInMap("ReplicationConfiguration")
        public GetInstanceResponseBodyInstanceReplicationConfiguration replicationConfiguration;

        /**
         * <p>Indicates whether the instance is managed by an Alibaba Cloud service.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         * 
         * <strong>if can be null:</strong>
         * <p>false</p>
         */
        @NameInMap("ServiceManaged")
        public Boolean serviceManaged;

        /**
         * <p>The instance status. Valid values:</p>
         * <ul>
         * <li>creating: Being created.</li>
         * <li>running: Running.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>running</p>
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

        public GetInstanceResponseBodyInstance setCrossRegionReplication(String crossRegionReplication) {
            this.crossRegionReplication = crossRegionReplication;
            return this;
        }
        public String getCrossRegionReplication() {
            return this.crossRegionReplication;
        }

        public GetInstanceResponseBodyInstance setCrossRegionReplicationRole(String crossRegionReplicationRole) {
            this.crossRegionReplicationRole = crossRegionReplicationRole;
            return this;
        }
        public String getCrossRegionReplicationRole() {
            return this.crossRegionReplicationRole;
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

        public GetInstanceResponseBodyInstance setInstanceFailoverStatus(String instanceFailoverStatus) {
            this.instanceFailoverStatus = instanceFailoverStatus;
            return this;
        }
        public String getInstanceFailoverStatus() {
            return this.instanceFailoverStatus;
        }

        public GetInstanceResponseBodyInstance setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetInstanceResponseBodyInstance setManagedServiceCode(String managedServiceCode) {
            this.managedServiceCode = managedServiceCode;
            return this;
        }
        public String getManagedServiceCode() {
            return this.managedServiceCode;
        }

        public GetInstanceResponseBodyInstance setReplicationConfiguration(GetInstanceResponseBodyInstanceReplicationConfiguration replicationConfiguration) {
            this.replicationConfiguration = replicationConfiguration;
            return this;
        }
        public GetInstanceResponseBodyInstanceReplicationConfiguration getReplicationConfiguration() {
            return this.replicationConfiguration;
        }

        public GetInstanceResponseBodyInstance setServiceManaged(Boolean serviceManaged) {
            this.serviceManaged = serviceManaged;
            return this;
        }
        public Boolean getServiceManaged() {
            return this.serviceManaged;
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
