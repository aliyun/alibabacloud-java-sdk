// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateBundleRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ImageId")
    public String imageId;

    @NameInMap("DesktopType")
    public String desktopType;

    @NameInMap("RootDiskSizeGib")
    public Integer rootDiskSizeGib;

    @NameInMap("BundleName")
    public String bundleName;

    @NameInMap("Description")
    public String description;

    @NameInMap("UserDiskSizeGib")
    public java.util.List<Integer> userDiskSizeGib;

    public static CreateBundleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBundleRequest self = new CreateBundleRequest();
        return TeaModel.build(map, self);
    }

    public CreateBundleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateBundleRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public CreateBundleRequest setDesktopType(String desktopType) {
        this.desktopType = desktopType;
        return this;
    }
    public String getDesktopType() {
        return this.desktopType;
    }

    public CreateBundleRequest setRootDiskSizeGib(Integer rootDiskSizeGib) {
        this.rootDiskSizeGib = rootDiskSizeGib;
        return this;
    }
    public Integer getRootDiskSizeGib() {
        return this.rootDiskSizeGib;
    }

    public CreateBundleRequest setBundleName(String bundleName) {
        this.bundleName = bundleName;
        return this;
    }
    public String getBundleName() {
        return this.bundleName;
    }

    public CreateBundleRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateBundleRequest setUserDiskSizeGib(java.util.List<Integer> userDiskSizeGib) {
        this.userDiskSizeGib = userDiskSizeGib;
        return this;
    }
    public java.util.List<Integer> getUserDiskSizeGib() {
        return this.userDiskSizeGib;
    }

}
