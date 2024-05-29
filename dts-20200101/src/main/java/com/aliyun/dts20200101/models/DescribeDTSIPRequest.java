// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeDTSIPRequest extends TeaModel {
    /**
     * <p>The ID of the region where the destination instance resides. For more information, see [List of supported regions](https://help.aliyun.com/document_detail/141033.html).</p>
     * <br>
     * <p>>  If the destination instance is a self-managed database with a public IP address, you can set the parameter to **cn-hangzhou** or the ID of the closest region.</p>
     */
    @NameInMap("DestinationEndpointRegion")
    public String destinationEndpointRegion;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The ID of the region where the source instance resides. For more information, see [List of supported regions](https://help.aliyun.com/document_detail/141033.html).</p>
     * <br>
     * <p>>  If the source instance is a self-managed database with a public IP address, you can set the parameter to **cn-hangzhou** or the ID of the closest region.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SourceEndpointRegion")
    public String sourceEndpointRegion;

    public static DescribeDTSIPRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDTSIPRequest self = new DescribeDTSIPRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDTSIPRequest setDestinationEndpointRegion(String destinationEndpointRegion) {
        this.destinationEndpointRegion = destinationEndpointRegion;
        return this;
    }
    public String getDestinationEndpointRegion() {
        return this.destinationEndpointRegion;
    }

    public DescribeDTSIPRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDTSIPRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeDTSIPRequest setSourceEndpointRegion(String sourceEndpointRegion) {
        this.sourceEndpointRegion = sourceEndpointRegion;
        return this;
    }
    public String getSourceEndpointRegion() {
        return this.sourceEndpointRegion;
    }

}
