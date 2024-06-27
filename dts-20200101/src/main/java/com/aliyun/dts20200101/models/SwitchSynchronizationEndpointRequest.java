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
     * 
     * <strong>example:</strong>
     * <p>12323344****</p>
     */
    @NameInMap("AccountId")
    public String accountId;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The synchronization direction. Valid values:</p>
     * <ul>
     * <li><strong>Forward</strong></li>
     * <li><strong>Reverse</strong></li>
     * </ul>
     * <blockquote>
     * <p> Default value: <strong>Forward</strong>.</p>
     * </blockquote>
     * <p>The value <strong>Reverse</strong> takes effect only if the topology of the data synchronization instance is two-way synchronization.</p>
     * 
     * <strong>example:</strong>
     * <p>Forward</p>
     */
    @NameInMap("SynchronizationDirection")
    public String synchronizationDirection;

    /**
     * <p>The ID of the data synchronization instance. You can call the DescribeSynchronizationJobs operation to query the instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dtsexjk1alb116****</p>
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

    public SwitchSynchronizationEndpointRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
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
         * <blockquote>
         * <p> You must specify the IP address only if the <strong>Endpoint.InstanceType</strong> parameter is set to <strong>Express</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>172.15.185.***</p>
         */
        @NameInMap("IP")
        public String IP;

        /**
         * <p>The ID of the ECS instance or the virtual private cloud (VPC).</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li>If the <strong>Endpoint.InstanceType</strong> parameter is set to <strong>ECS</strong>, you must specify the ID of the ECS instance.</li>
         * <li>If the <strong>Endpoint.InstanceType</strong> parameter is set to <strong>Express</strong>, you must specify the ID of the VPC.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp11haem1kpkhoup****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The instance type of the database. Valid values:</p>
         * <ul>
         * <li><strong>LocalInstance</strong>: self-managed database with a public IP address</li>
         * <li><strong>ECS</strong>: self-managed database that is hosted on ECS</li>
         * <li><strong>Express</strong>: self-managed database that is connected over Express Connect</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ECS</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The service port number of the database.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3306</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>Specifies whether to update the connection settings of the source instance or the destination instance. Valid values:</p>
         * <ul>
         * <li><strong>Source</strong></li>
         * <li><strong>Destination</strong></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Destination</p>
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
         * 
         * <strong>example:</strong>
         * <p>14069264****</p>
         */
        @NameInMap("OwnerID")
        public String ownerID;

        /**
         * <p>The authorized Resource Access Management (RAM) role of the source instance. You must specify the RAM role only if the source instance and the destination instance belong to different Alibaba Cloud accounts. You can use the RAM role to allow the Alibaba Cloud account that owns the destination instance to access the source instance.</p>
         * <blockquote>
         * <p> For information about the permissions and authorization methods of the RAM role, see <a href="https://help.aliyun.com/document_detail/48468.html">Configure RAM authorization for cross-account data migration and synchronization</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ram-for-dts</p>
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
