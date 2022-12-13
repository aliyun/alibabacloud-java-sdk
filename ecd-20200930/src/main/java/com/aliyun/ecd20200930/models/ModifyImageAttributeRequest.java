// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyImageAttributeRequest extends TeaModel {
    // The description of the image.
    @NameInMap("Description")
    public String description;

    // The ID of the image.
    @NameInMap("ImageId")
    public String imageId;

    // The name of the image.
    @NameInMap("Name")
    public String name;

    // The region ID of the image.
    @NameInMap("RegionId")
    public String regionId;

    public static ModifyImageAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyImageAttributeRequest self = new ModifyImageAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyImageAttributeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyImageAttributeRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public ModifyImageAttributeRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyImageAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
