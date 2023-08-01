// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class StartTerminalSessionRequest extends TeaModel {
    /**
     * <p>The instance IDs.</p>
     */
    @NameInMap("InstanceId")
    public java.util.List<String> instanceId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The port number of the instance. The port is used to forward data. After this parameter is configured, Cloud Assistant Agent forwards data to the specified port for forwarding. Example: 22.</p>
     * <br>
     * <p>This parameter is empty by default, which indicates that no port is configured to forward data.</p>
     */
    @NameInMap("PortNumber")
    public Integer portNumber;

    /**
     * <p>The region ID. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static StartTerminalSessionRequest build(java.util.Map<String, ?> map) throws Exception {
        StartTerminalSessionRequest self = new StartTerminalSessionRequest();
        return TeaModel.build(map, self);
    }

    public StartTerminalSessionRequest setInstanceId(java.util.List<String> instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public java.util.List<String> getInstanceId() {
        return this.instanceId;
    }

    public StartTerminalSessionRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public StartTerminalSessionRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public StartTerminalSessionRequest setPortNumber(Integer portNumber) {
        this.portNumber = portNumber;
        return this;
    }
    public Integer getPortNumber() {
        return this.portNumber;
    }

    public StartTerminalSessionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public StartTerminalSessionRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public StartTerminalSessionRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
