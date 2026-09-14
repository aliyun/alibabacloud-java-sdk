// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class ModifyDiskReplicaGroupRequest extends TeaModel {
    /**
     * <p>The bandwidth. Unit: Kbps.</p>
     * <blockquote>
     * <p>This parameter is not available.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("Bandwidth")
    public Long bandwidth;

    /**
     * <p>A client token to ensure the idempotence of the request. Generate a unique value for this parameter from your client. The ClientToken value can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the replication pair-consistent group. The description must be 2 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>This is description.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to enable replication time control (RTC). Valid values:</p>
     * <ul>
     * <li><p>false: RTC is disabled.</p>
     * </li>
     * <li><p>true: RTC is enabled.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If this parameter is set to true, RTC is enabled for the replication pair-consistent group. RTC is also enabled for all asynchronous replication pairs that are added to the group.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableRtc")
    public Boolean enableRtc;

    /**
     * <p>The name of the replication pair-consistent group. The name must be 2 to 128 characters in length. It must start with a letter or a Chinese character and cannot start with <code>http://</code> or <code>https://</code>. The name can contain digits, colons (:), underscores (_), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>myreplicagrouptest</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>The recovery point objective (RPO) of the replication pair-consistent group. Unit: seconds. A value of 900 is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>900</p>
     */
    @NameInMap("RPO")
    public Long RPO;

    /**
     * <p>The region ID of the replication pair-consistent group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the replication pair-consistent group. Call <a href="https://help.aliyun.com/document_detail/426614.html">DescribeDiskReplicaGroups</a> to query the IDs of replication pair-consistent groups.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pg-myreplica****</p>
     */
    @NameInMap("ReplicaGroupId")
    public String replicaGroupId;

    public static ModifyDiskReplicaGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDiskReplicaGroupRequest self = new ModifyDiskReplicaGroupRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDiskReplicaGroupRequest setBandwidth(Long bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Long getBandwidth() {
        return this.bandwidth;
    }

    public ModifyDiskReplicaGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyDiskReplicaGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyDiskReplicaGroupRequest setEnableRtc(Boolean enableRtc) {
        this.enableRtc = enableRtc;
        return this;
    }
    public Boolean getEnableRtc() {
        return this.enableRtc;
    }

    public ModifyDiskReplicaGroupRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public ModifyDiskReplicaGroupRequest setRPO(Long RPO) {
        this.RPO = RPO;
        return this;
    }
    public Long getRPO() {
        return this.RPO;
    }

    public ModifyDiskReplicaGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyDiskReplicaGroupRequest setReplicaGroupId(String replicaGroupId) {
        this.replicaGroupId = replicaGroupId;
        return this;
    }
    public String getReplicaGroupId() {
        return this.replicaGroupId;
    }

}
