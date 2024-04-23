// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class SetDedicatedBlockStorageClusterDiskThroughputRequest extends TeaModel {
    /**
     * <p>Target throughput.</p>
     */
    @NameInMap("Bps")
    public Integer bps;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that the value is unique among different requests. The ClientToken value can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](~~25693~~).</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the disk.</p>
     */
    @NameInMap("DiskId")
    public String diskId;

    /**
     * <p>The region ID of disk.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static SetDedicatedBlockStorageClusterDiskThroughputRequest build(java.util.Map<String, ?> map) throws Exception {
        SetDedicatedBlockStorageClusterDiskThroughputRequest self = new SetDedicatedBlockStorageClusterDiskThroughputRequest();
        return TeaModel.build(map, self);
    }

    public SetDedicatedBlockStorageClusterDiskThroughputRequest setBps(Integer bps) {
        this.bps = bps;
        return this;
    }
    public Integer getBps() {
        return this.bps;
    }

    public SetDedicatedBlockStorageClusterDiskThroughputRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public SetDedicatedBlockStorageClusterDiskThroughputRequest setDiskId(String diskId) {
        this.diskId = diskId;
        return this;
    }
    public String getDiskId() {
        return this.diskId;
    }

    public SetDedicatedBlockStorageClusterDiskThroughputRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
