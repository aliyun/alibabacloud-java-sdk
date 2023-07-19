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
     * <p>The ID of the region where the destination instance resides. For more information, see [List of supported regions](~~141033~~).</p>
     * <br>
     * <p>> </p>
     * <p>*   If the destination instance is a self-managed database with a public IP address or a third-party cloud database, you can set the parameter to **cn-hangzhou** or the ID of the closest region.</p>
     * <p>*   If the DTS task is a data migration or data synchronization task, you must specify this parameter.</p>
     */
    @NameInMap("Region")
    public String region;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the region where the source instance resides. For more information, see [List of supported regions](~~141033~~).</p>
     * <br>
     * <p>>  If the source instance is a self-managed database with a public IP address or a third-party cloud database, you can set the parameter to **cn-hangzhou** or the ID of the closest region.</p>
     */
    @NameInMap("Type")
    public String type;

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

    public WhiteIpListRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
