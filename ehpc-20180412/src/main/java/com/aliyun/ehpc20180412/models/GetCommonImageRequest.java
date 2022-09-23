// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class GetCommonImageRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("ContainType")
    public String containType;

    @NameInMap("ImageName")
    public String imageName;

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
