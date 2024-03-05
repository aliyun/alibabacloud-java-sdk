// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class GetCommonImageRequest extends TeaModel {
    /**
     * <p>The ID of the cluster to which you want to store the image.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The image type.</p>
     */
    @NameInMap("ContainType")
    public String containType;

    /**
     * <p>The name of the image that you want to obtain.</p>
     */
    @NameInMap("ImageName")
    public String imageName;

    /**
     * <p>The region ID of the cluster. You can call the [DescribeRegions](~~36063~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static GetCommonImageRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCommonImageRequest self = new GetCommonImageRequest();
        return TeaModel.build(map, self);
    }

    public GetCommonImageRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public GetCommonImageRequest setContainType(String containType) {
        this.containType = containType;
        return this;
    }
    public String getContainType() {
        return this.containType;
    }

    public GetCommonImageRequest setImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }
    public String getImageName() {
        return this.imageName;
    }

    public GetCommonImageRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
