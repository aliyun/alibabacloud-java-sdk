// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class CreateInstanceOpsTaskRequest extends TeaModel {
    /**
     * <p>The ID of the container group.</p>
     */
    @NameInMap("ContainerGroupId")
    public String containerGroupId;

    /**
     * <p>The type of the O&M task. Valid values:</p>
     * <br>
     * <p>*   coredump</p>
     * <p>*   tcpdump</p>
     */
    @NameInMap("OpsType")
    public String opsType;

    /**
     * <p>The value of the O\&M task. You can set this parameter based on the value of OpsType.</p>
     * <br>
     * <p>*   If OpsType is set to coredump, the valid values of OpsValue are:</p>
     * <br>
     * <p>    *   enable: enables coredump.</p>
     * <p>    *   disable: disables coredump.</p>
     * <br>
     * <p>*   If OpsType is set to tcpdump, the value of OpsValue is a JSON-formatted parameter string. Example: `{"Enable":true, "IfDeviceName":"eth0"}`. The value may contain the following parameters:</p>
     * <br>
     * <p>    *   Enable: specifies whether to enable tcpdump. You must specify this parameter. Valid values: true and false.</p>
     * <p>    *   Protocol: the network protocol. Valid values: tcp, udp, and icmpv4.</p>
     * <p>    *   SourceIp: the source IP address.</p>
     * <p>    *   SourceCidr: the source CIDR block. If you specify both an IP address and a CIDR block, the IP address is ignored if the CIDR block is valid.</p>
     * <p>    *   SourcePort: the source port. Valid values: 1 to 65535.</p>
     * <p>    *   DestIp: the destination IP address.</p>
     * <p>    *   DestCidr: the destination CIDR block. If you specify both an IP address and a CIDR block, the IP address is ignored if the CIDR block is valid.</p>
     * <p>    *   DestPort: the destination port. Valid values: 1 to 65535.</p>
     * <p>    *   IfDeviceName: the destination network interface controller. Default value: eth0.</p>
     * <p>    *   Snaplen: the length to be captured. Default value: 65535. Unit: bytes.</p>
     * <p>    *   Duration: the captured period. Unit: seconds.</p>
     * <p>    *   PacketNum: the number of packets to be captured.</p>
     * <p>    *   FileSize: the size of the destination files on packets. Unit: bytes. Maximum value: 1073741824. 1073741824 bytes is equal to 1 GB.</p>
     */
    @NameInMap("OpsValue")
    public String opsValue;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the O&M task.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static CreateInstanceOpsTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceOpsTaskRequest self = new CreateInstanceOpsTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateInstanceOpsTaskRequest setContainerGroupId(String containerGroupId) {
        this.containerGroupId = containerGroupId;
        return this;
    }
    public String getContainerGroupId() {
        return this.containerGroupId;
    }

    public CreateInstanceOpsTaskRequest setOpsType(String opsType) {
        this.opsType = opsType;
        return this;
    }
    public String getOpsType() {
        return this.opsType;
    }

    public CreateInstanceOpsTaskRequest setOpsValue(String opsValue) {
        this.opsValue = opsValue;
        return this;
    }
    public String getOpsValue() {
        return this.opsValue;
    }

    public CreateInstanceOpsTaskRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateInstanceOpsTaskRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateInstanceOpsTaskRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateInstanceOpsTaskRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateInstanceOpsTaskRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
