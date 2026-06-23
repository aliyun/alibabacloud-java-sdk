// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListInstancesResponseBody extends TeaModel {
    /**
     * <p>The list of instance information.</p>
     */
    @NameInMap("Instances")
    public java.util.List<ListInstancesResponseBodyInstances> instances;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries in the list.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstancesResponseBody self = new ListInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstancesResponseBody setInstances(java.util.List<ListInstancesResponseBodyInstances> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<ListInstancesResponseBodyInstances> getInstances() {
        return this.instances;
    }

    public ListInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInstancesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListInstancesResponseBodyInstancesDefaultEndpoint extends TeaModel {
        /**
         * <p>The endpoint address of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>example-xxx.aliyunidaas.com</p>
         */
        @NameInMap("Endpoint")
        public String endpoint;

        /**
         * <p>The status of the instance endpoint. Valid values:</p>
         * <ul>
         * <li>resolved: Resolved.</li>
         * <li>unresolved: Unresolved.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>resolved</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListInstancesResponseBodyInstancesDefaultEndpoint build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesResponseBodyInstancesDefaultEndpoint self = new ListInstancesResponseBodyInstancesDefaultEndpoint();
            return TeaModel.build(map, self);
        }

        public ListInstancesResponseBodyInstancesDefaultEndpoint setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public ListInstancesResponseBodyInstancesDefaultEndpoint setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListInstancesResponseBodyInstancesReplicationConfiguration extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>idaas_xxxxxx</p>
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
         * <p>idaas_xxxxxx</p>
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

        public static ListInstancesResponseBodyInstancesReplicationConfiguration build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesResponseBodyInstancesReplicationConfiguration self = new ListInstancesResponseBodyInstancesReplicationConfiguration();
            return TeaModel.build(map, self);
        }

        public ListInstancesResponseBodyInstancesReplicationConfiguration setBackupInstanceId(String backupInstanceId) {
            this.backupInstanceId = backupInstanceId;
            return this;
        }
        public String getBackupInstanceId() {
            return this.backupInstanceId;
        }

        public ListInstancesResponseBodyInstancesReplicationConfiguration setBackupInstanceRegionId(String backupInstanceRegionId) {
            this.backupInstanceRegionId = backupInstanceRegionId;
            return this;
        }
        public String getBackupInstanceRegionId() {
            return this.backupInstanceRegionId;
        }

        public ListInstancesResponseBodyInstancesReplicationConfiguration setPrimaryInstanceId(String primaryInstanceId) {
            this.primaryInstanceId = primaryInstanceId;
            return this;
        }
        public String getPrimaryInstanceId() {
            return this.primaryInstanceId;
        }

        public ListInstancesResponseBodyInstancesReplicationConfiguration setPrimaryInstanceRegionId(String primaryInstanceRegionId) {
            this.primaryInstanceRegionId = primaryInstanceRegionId;
            return this;
        }
        public String getPrimaryInstanceRegionId() {
            return this.primaryInstanceRegionId;
        }

        public ListInstancesResponseBodyInstancesReplicationConfiguration setReplicationCreateTime(Long replicationCreateTime) {
            this.replicationCreateTime = replicationCreateTime;
            return this;
        }
        public Long getReplicationCreateTime() {
            return this.replicationCreateTime;
        }

    }

    public static class ListInstancesResponseBodyInstances extends TeaModel {
        /**
         * <p>The time when the instance was created. The value is a UNIX timestamp in milliseconds.</p>
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
         * <p>The default endpoint of the instance.</p>
         */
        @NameInMap("DefaultEndpoint")
        public ListInstancesResponseBodyInstancesDefaultEndpoint defaultEndpoint;

        /**
         * <p>The description of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>instance_for_test</p>
         */
        @NameInMap("Description")
        public String description;

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
         * <p>idaas_eypq6ljgyeuwmlw672sulxxxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The service code of the Alibaba Cloud service that manages the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>sase</p>
         */
        @NameInMap("ManagedServiceCode")
        public String managedServiceCode;

        @NameInMap("ReplicationConfiguration")
        public ListInstancesResponseBodyInstancesReplicationConfiguration replicationConfiguration;

        /**
         * <p>Indicates whether the instance is managed by an Alibaba Cloud service.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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

        public static ListInstancesResponseBodyInstances build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesResponseBodyInstances self = new ListInstancesResponseBodyInstances();
            return TeaModel.build(map, self);
        }

        public ListInstancesResponseBodyInstances setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListInstancesResponseBodyInstances setCrossRegionReplication(String crossRegionReplication) {
            this.crossRegionReplication = crossRegionReplication;
            return this;
        }
        public String getCrossRegionReplication() {
            return this.crossRegionReplication;
        }

        public ListInstancesResponseBodyInstances setCrossRegionReplicationRole(String crossRegionReplicationRole) {
            this.crossRegionReplicationRole = crossRegionReplicationRole;
            return this;
        }
        public String getCrossRegionReplicationRole() {
            return this.crossRegionReplicationRole;
        }

        public ListInstancesResponseBodyInstances setDefaultEndpoint(ListInstancesResponseBodyInstancesDefaultEndpoint defaultEndpoint) {
            this.defaultEndpoint = defaultEndpoint;
            return this;
        }
        public ListInstancesResponseBodyInstancesDefaultEndpoint getDefaultEndpoint() {
            return this.defaultEndpoint;
        }

        public ListInstancesResponseBodyInstances setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListInstancesResponseBodyInstances setInstanceFailoverStatus(String instanceFailoverStatus) {
            this.instanceFailoverStatus = instanceFailoverStatus;
            return this;
        }
        public String getInstanceFailoverStatus() {
            return this.instanceFailoverStatus;
        }

        public ListInstancesResponseBodyInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListInstancesResponseBodyInstances setManagedServiceCode(String managedServiceCode) {
            this.managedServiceCode = managedServiceCode;
            return this;
        }
        public String getManagedServiceCode() {
            return this.managedServiceCode;
        }

        public ListInstancesResponseBodyInstances setReplicationConfiguration(ListInstancesResponseBodyInstancesReplicationConfiguration replicationConfiguration) {
            this.replicationConfiguration = replicationConfiguration;
            return this;
        }
        public ListInstancesResponseBodyInstancesReplicationConfiguration getReplicationConfiguration() {
            return this.replicationConfiguration;
        }

        public ListInstancesResponseBodyInstances setServiceManaged(Boolean serviceManaged) {
            this.serviceManaged = serviceManaged;
            return this;
        }
        public Boolean getServiceManaged() {
            return this.serviceManaged;
        }

        public ListInstancesResponseBodyInstances setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
