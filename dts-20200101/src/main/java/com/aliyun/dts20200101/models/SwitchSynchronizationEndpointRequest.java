// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class SwitchSynchronizationEndpointRequest extends TeaModel {
    @NameInMap("Endpoint")
    public SwitchSynchronizationEndpointRequestEndpoint endpoint;

    @NameInMap("SourceEndpoint")
    public SwitchSynchronizationEndpointRequestSourceEndpoint sourceEndpoint;

    /**
     * <p>The Alibaba Cloud account ID. You do not need to specify this parameter because it will be deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>12323344****</p>
     */
    @NameInMap("AccountId")
    public String accountId;

    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <p>The region ID. Specify this parameter to indicate the region where the instance resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmzawhxxc****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The synchronization direction. Valid values:</p>
     * <ul>
     * <li><strong>Forward</strong>: forward.</li>
     * <li><strong>Reverse</strong>: reverse.</li>
     * </ul>
     * <blockquote>
     * <p>Default value: <strong>Forward</strong>. The value <strong>Reverse</strong> takes effect only when the synchronization topology of the data synchronization instance is two-way synchronization.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Forward</p>
     */
    @NameInMap("SynchronizationDirection")
    public String synchronizationDirection;

    /**
     * <p>Instance ID of the data synchronization instance. You can call the DescribeSynchronizationJobs operation to query instance ID.</p>
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
         * <p>新数据库的IP地址。</p>
         * <blockquote>
         * <p>当<strong>Endpoint.InstanceType</strong>取值为<strong>Express</strong>时，本参数才可用且必须传入。</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>172.15.185.***</p>
         */
        @NameInMap("IP")
        public String IP;

        /**
         * <p>ECS或专有网络的实例ID。</p>
         * <blockquote>
         * <ul>
         * <li>当<strong>Endpoint.InstanceType</strong>取值为<strong>ECS</strong>时，本参数需传入ECS实例的ID。</li>
         * </ul>
         * </blockquote>
         * <ul>
         * <li>当<strong>Endpoint.InstanceType</strong>取值为<strong>Express</strong>时，本参数需传入专有网络ID。</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp11haem1kpkhoup****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>新数据库所属的实例类型，取值：</p>
         * <ul>
         * <li><strong>LocalInstance</strong>：有公网IP的自建数据库；</li>
         * <li><strong>ECS</strong>：ECS上的自建数据库。</li>
         * <li><strong>Express</strong>：通过专线接入的自建数据库。</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ECS</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>新的数据库服务端口。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3306</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>待调整连接信息的实例，取值：</p>
         * <ul>
         * <li><strong>Source</strong>：源实例。</li>
         * <li><strong>Destination</strong>：目标实例。</li>
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
         * <p>当源实例与目标实例所属阿里云账号不同时，您需要传入该参数指定源实例的所属阿里云账号的ID。</p>
         * 
         * <strong>example:</strong>
         * <p>14069264****</p>
         */
        @NameInMap("OwnerID")
        public String ownerID;

        /**
         * <p>当源实例与目标实例所属阿里云账号不同时，需传入该参数，来指定源实例的授权角色，以允许目标实例阿里云账号访问源实例的实例信息。</p>
         * <blockquote>
         * <p>角色所需的权限及授权方式，请参见<a href="https://help.aliyun.com/document_detail/48468.html">跨阿里云账号数据迁移或同步时如何配置RAM授权</a>。</p>
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
