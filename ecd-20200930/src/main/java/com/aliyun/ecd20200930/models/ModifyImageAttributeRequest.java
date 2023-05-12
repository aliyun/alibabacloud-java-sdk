// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyImageAttributeRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The operation that you want to perform. Set the value to ModifyImageAttribute.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The description of the image.</p>
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
