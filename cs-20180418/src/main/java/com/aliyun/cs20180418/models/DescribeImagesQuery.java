// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20180418.models;

import com.aliyun.tea.*;

public class DescribeImagesQuery extends TeaModel {
    @NameInMap("RegionID")
    public String regionID;

    @NameInMap("DockerVersion")
    public String dockerVersion;

    @NameInMap("ImageName")
    public String imageName;

    public static DescribeImagesQuery build(java.util.Map<String, ?> map) throws Exception {
        DescribeImagesQuery self = new DescribeImagesQuery();
        return TeaModel.build(map, self);
    }

    public DescribeImagesQuery setRegionID(String regionID) {
        this.regionID = regionID;
        return this;
    }
    public String getRegionID() {
        return this.regionID;
    }

    public DescribeImagesQuery setDockerVersion(String dockerVersion) {
        this.dockerVersion = dockerVersion;
        return this;
    }
    public String getDockerVersion() {
        return this.dockerVersion;
    }

    public DescribeImagesQuery setImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }
    public String getImageName() {
        return this.imageName;
    }

}
