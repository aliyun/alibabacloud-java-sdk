// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class ReprotectDiskReplicaPairRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The region ID of the secondary disk in the replication pair. You can call the <a href="https://help.aliyun.com/document_detail/354206.html">DescribeDiskReplicaPairs</a> operation to query region IDs of secondary disks in replication pairs.</p>
     * <blockquote>
     * <p> The reverse replication feature must be enabled from the region where the secondary disk is located.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
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

    /**
     * <p>Specifies whether to enable the reverse replication sub-feature. Valid values: true and false. Default value: true.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ReverseReplicate")
    public Boolean reverseReplicate;

    public static ReprotectDiskReplicaPairRequest build(java.util.Map<String, ?> map) throws Exception {
        ReprotectDiskReplicaPairRequest self = new ReprotectDiskReplicaPairRequest();
        return TeaModel.build(map, self);
    }

    public ReprotectDiskReplicaPairRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ReprotectDiskReplicaPairRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ReprotectDiskReplicaPairRequest setReplicaPairId(String replicaPairId) {
        this.replicaPairId = replicaPairId;
        return this;
    }
    public String getReplicaPairId() {
        return this.replicaPairId;
    }

    public ReprotectDiskReplicaPairRequest setReverseReplicate(Boolean reverseReplicate) {
        this.reverseReplicate = reverseReplicate;
        return this;
    }
    public Boolean getReverseReplicate() {
        return this.reverseReplicate;
    }

}
