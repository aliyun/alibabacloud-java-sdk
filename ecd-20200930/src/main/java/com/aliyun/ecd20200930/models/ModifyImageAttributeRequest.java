// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyImageAttributeRequest extends TeaModel {
    /**
     * <p>The image description. The description must be 2 to 256 characters in length. It cannot start with `http://` or `https://`.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The image ID.</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The name of the image. The name must be 2 to 128 characters in length, and can contain letters, digits, colons (:), underscores (\_), and hyphens (-). It must start with a letter but cannot start with `http://` or `https://`.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The region ID.</p>
     */
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
