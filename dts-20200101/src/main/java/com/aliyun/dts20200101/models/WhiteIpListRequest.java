// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class WhiteIpListRequest extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     */
    @NameInMap("DestinationRegion")
    public String destinationRegion;

    /**
     * <p>The ID of the region where the destination instance resides. For more information, see [List of supported regions](https://help.aliyun.com/document_detail/141033.html).</p>
     * <br>
     * <p>> </p>
     * <p>*   If the destination instance is a self-managed database with a public IP address or a third-party cloud database, you can set the parameter to **cn-hangzhou** or the ID of the closest region.</p>
     * <p>*   If the DTS task is a data migration or data synchronization task, you must specify this parameter.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Region")
    public String region;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The ID of the region where the source instance resides. For more information, see [List of supported regions](https://help.aliyun.com/document_detail/141033.html).</p>
     * <br>
     * <p>>  If the source instance is a self-managed database with a public IP address or a third-party cloud database, you can set the parameter to **cn-hangzhou** or the ID of the closest region.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Type")
    public String type;

    @NameInMap("ZeroEtlJob")
    public Boolean zeroEtlJob;

    public static WhiteIpListRequest build(java.util.Map<String, ?> map) throws Exception {
        WhiteIpListRequest self = new WhiteIpListRequest();
        return TeaModel.build(map, self);
    }

    public WhiteIpListRequest setDestinationRegion(String destinationRegion) {
        this.destinationRegion = destinationRegion;
        return this;
    }
    public String getDestinationRegion() {
        return this.destinationRegion;
    }

    public WhiteIpListRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public WhiteIpListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public WhiteIpListRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public WhiteIpListRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public WhiteIpListRequest setZeroEtlJob(Boolean zeroEtlJob) {
        this.zeroEtlJob = zeroEtlJob;
        return this;
    }
    public Boolean getZeroEtlJob() {
        return this.zeroEtlJob;
    }

}
