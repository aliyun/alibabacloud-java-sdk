// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyImageAttributeRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("ImageId")
    @Validation(required = true)
    public String imageId;

    @NameInMap("ImageName")
    public String imageName;

    @NameInMap("Status")
    public String status;

    @NameInMap("ImageFamily")
    public String imageFamily;

    @NameInMap("BootMode")
    public String bootMode;

    @NameInMap("Description")
    public String description;

    public static ModifyImageAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyImageAttributeRequest self = new ModifyImageAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyImageAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyImageAttributeRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public ModifyImageAttributeRequest setImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }
    public String getImageName() {
        return this.imageName;
    }

    public ModifyImageAttributeRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ModifyImageAttributeRequest setImageFamily(String imageFamily) {
        this.imageFamily = imageFamily;
        return this;
    }
    public String getImageFamily() {
        return this.imageFamily;
    }

    public ModifyImageAttributeRequest setBootMode(String bootMode) {
        this.bootMode = bootMode;
        return this;
    }
    public String getBootMode() {
        return this.bootMode;
    }

    public ModifyImageAttributeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
