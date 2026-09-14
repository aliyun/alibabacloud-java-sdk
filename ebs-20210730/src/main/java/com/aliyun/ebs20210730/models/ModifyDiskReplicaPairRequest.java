// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class ModifyDiskReplicaPairRequest extends TeaModel {
    /**
     * <p>The bandwidth for async replication, in Kbps.</p>
     * <blockquote>
     * <p>This parameter is not yet available.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10240</p>
     */
    @NameInMap("Bandwidth")
    public Long bandwidth;

    /**
     * <p>A client token to ensure the idempotence of the request. Generate a value for this parameter from your client. Make sure that the value is unique among different requests. The ClientToken value can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the replication pair.</p>
     * 
     * <strong>example:</strong>
     * <p>This is description.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to enable replication time control (RTC). Valid values:</p>
     * <ul>
     * <li><p>false: Disables RTC.</p>
     * </li>
     * <li><p>true: Enables RTC.</p>
     * </li>
     * </ul>
     * <p>Default value: false.</p>
     * <blockquote>
     * <p>If a replication pair is part of a replication group, its RTC setting is the same as the setting of the group.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableRtc")
    public Boolean enableRtc;

    /**
     * <p>The name of the replication pair.</p>
     * 
     * <strong>example:</strong>
     * <p>TestReplicaPair</p>
     */
    @NameInMap("PairName")
    public String pairName;

    /**
     * <p>The recovery point objective (RPO) of the replication pair-consistent group. Unit: seconds. Currently, only a value of 900 is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>900</p>
     */
    @NameInMap("RPO")
    public Long RPO;

    /**
     * <p>The region ID of the primary or secondary disk in the replication pair. You can call <a href="https://help.aliyun.com/document_detail/354276.html">DescribeRegions</a> to query the regions that support async replication.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the replication pair.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pair-cn-dsa****</p>
     */
    @NameInMap("ReplicaPairId")
    public String replicaPairId;

    public static ModifyDiskReplicaPairRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDiskReplicaPairRequest self = new ModifyDiskReplicaPairRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDiskReplicaPairRequest setBandwidth(Long bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Long getBandwidth() {
        return this.bandwidth;
    }

    public ModifyDiskReplicaPairRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyDiskReplicaPairRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyDiskReplicaPairRequest setEnableRtc(Boolean enableRtc) {
        this.enableRtc = enableRtc;
        return this;
    }
    public Boolean getEnableRtc() {
        return this.enableRtc;
    }

    public ModifyDiskReplicaPairRequest setPairName(String pairName) {
        this.pairName = pairName;
        return this;
    }
    public String getPairName() {
        return this.pairName;
    }

    public ModifyDiskReplicaPairRequest setRPO(Long RPO) {
        this.RPO = RPO;
        return this;
    }
    public Long getRPO() {
        return this.RPO;
    }

    public ModifyDiskReplicaPairRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyDiskReplicaPairRequest setReplicaPairId(String replicaPairId) {
        this.replicaPairId = replicaPairId;
        return this;
    }
    public String getReplicaPairId() {
        return this.replicaPairId;
    }

}
