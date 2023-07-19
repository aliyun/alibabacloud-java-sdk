// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class SwitchSynchronizationEndpointRequest extends TeaModel {
    @NameInMap("Endpoint")
    public SwitchSynchronizationEndpointRequestEndpoint endpoint;

    @NameInMap("SourceEndpoint")
    public SwitchSynchronizationEndpointRequestSourceEndpoint sourceEndpoint;

    /**
     * <p>The ID of the Alibaba Cloud account. You do not need to specify this parameter because this parameter will be removed in the future.</p>
     */
    @NameInMap("AccountId")
    public String accountId;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The synchronization direction. Valid values:</p>
     * <br>
     * <p>*   **Forward**</p>
     * <p>*   **Reverse**</p>
     * <br>
     * <p>>  Default value: **Forward**.</p>
     * <br>
     * <p>The value **Reverse** takes effect only if the topology of the data synchronization instance is two-way synchronization.</p>
     */
    @NameInMap("SynchronizationDirection")
    public String synchronizationDirection;

    /**
     * <p>The ID of the data synchronization instance. You can call the DescribeSynchronizationJobs operation to query the instance ID.</p>
     */
    @NameInMap("SynchronizationJobId")
    public String synchronizationJobId;

    public static SwitchSynchronizationEndpointRequest build(java.util.Map<String, ?> map) throws Exception {
        SwitchSynchronizationEndpointRequest self = new SwitchSynchronizationEndpointRequest();
        return TeaModel.build(map, self);
    }

    public SwitchSynchronizationEndpointRequest setEndpoint(SwitchSynchronizationEndpointRequestEndpoint endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public SwitchSynchronizationEndpointRequestEndpoint getEndpoint() {
        return this.endpoint;
    }

    public SwitchSynchronizationEndpointRequest setSourceEndpoint(SwitchSynchronizationEndpointRequestSourceEndpoint sourceEndpoint) {
        this.sourceEndpoint = sourceEndpoint;
        return this;
    }
    public SwitchSynchronizationEndpointRequestSourceEndpoint getSourceEndpoint() {
        return this.sourceEndpoint;
    }

    public SwitchSynchronizationEndpointRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public SwitchSynchronizationEndpointRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public SwitchSynchronizationEndpointRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SwitchSynchronizationEndpointRequest setSynchronizationDirection(String synchronizationDirection) {
        this.synchronizationDirection = synchronizationDirection;
        return this;
    }
    public String getSynchronizationDirection() {
        return this.synchronizationDirection;
    }

    public SwitchSynchronizationEndpointRequest setSynchronizationJobId(String synchronizationJobId) {
        this.synchronizationJobId = synchronizationJobId;
        return this;
    }
    public String getSynchronizationJobId() {
        return this.synchronizationJobId;
    }

    public static class SwitchSynchronizationEndpointRequestEndpoint extends TeaModel {
        /**
         * <p>The IP address of the database.</p>
         * <br>
         * <p>>  You must specify the IP address only if the **Endpoint.InstanceType** parameter is set to **Express**.</p>
         */
        @NameInMap("IP")
        public String IP;

        /**
         * <p>The ID of the ECS instance or the virtual private cloud (VPC).</p>
         * <br>
         * <p>> </p>
         * <p>*   If the **Endpoint.InstanceType** parameter is set to **ECS**, you must specify the ID of the ECS instance.</p>
         * <p>*   If the **Endpoint.InstanceType** parameter is set to **Express**, you must specify the ID of the VPC.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The instance type of the database. Valid values:</p>
         * <br>
         * <p>*   **LocalInstance**: self-managed database with a public IP address</p>
         * <p>*   **ECS**: self-managed database that is hosted on ECS</p>
         * <p>*   **Express**: self-managed database that is connected over Express Connect</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The service port number of the database.</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>Specifies whether to update the connection settings of the source instance or the destination instance. Valid values:</p>
         * <br>
         * <p>*   **Source**</p>
         * <p>*   **Destination**</p>
         */
        @NameInMap("Type")
        public String type;

        public static SwitchSynchronizationEndpointRequestEndpoint build(java.util.Map<String, ?> map) throws Exception {
            SwitchSynchronizationEndpointRequestEndpoint self = new SwitchSynchronizationEndpointRequestEndpoint();
            return TeaModel.build(map, self);
        }

        public SwitchSynchronizationEndpointRequestEndpoint setIP(String IP) {
            this.IP = IP;
            return this;
        }
        public String getIP() {
            return this.IP;
        }

        public SwitchSynchronizationEndpointRequestEndpoint setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public SwitchSynchronizationEndpointRequestEndpoint setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public SwitchSynchronizationEndpointRequestEndpoint setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public SwitchSynchronizationEndpointRequestEndpoint setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class SwitchSynchronizationEndpointRequestSourceEndpoint extends TeaModel {
        /**
         * <p>The ID of the Alibaba Cloud account to which the source instance belongs. You must specify this parameter only if the source instance and the destination instance belong to different Alibaba Cloud accounts.</p>
         */
        @NameInMap("OwnerID")
        public String ownerID;

        /**
         * <p>The authorized Resource Access Management (RAM) role of the source instance. You must specify the RAM role only if the source instance and the destination instance belong to different Alibaba Cloud accounts. You can use the RAM role to allow the Alibaba Cloud account that owns the destination instance to access the source instance.</p>
         * <br>
         * <p>>  For information about the permissions and authorization methods of the RAM role, see [Configure RAM authorization for cross-account data migration and synchronization](~~48468~~).</p>
         */
        @NameInMap("Role")
        public String role;

        public static SwitchSynchronizationEndpointRequestSourceEndpoint build(java.util.Map<String, ?> map) throws Exception {
            SwitchSynchronizationEndpointRequestSourceEndpoint self = new SwitchSynchronizationEndpointRequestSourceEndpoint();
            return TeaModel.build(map, self);
        }

        public SwitchSynchronizationEndpointRequestSourceEndpoint setOwnerID(String ownerID) {
            this.ownerID = ownerID;
            return this;
        }
        public String getOwnerID() {
            return this.ownerID;
        }

        public SwitchSynchronizationEndpointRequestSourceEndpoint setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

    }

}
