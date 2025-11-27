// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class AddImageShrinkRequest extends TeaModel {
    /**
     * <p>The configurations of the container image.</p>
     */
    @NameInMap("ContainerImageSpec")
    public String containerImageSpecShrink;

    /**
     * <p>The description of the image.</p>
     * 
     * <strong>example:</strong>
     * <p>Test image</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The type of the images. Valid values:</p>
     * <ul>
     * <li>VM: virtual machine image.</li>
     * <li>Container: the container image.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>VM</p>
     */
    @NameInMap("ImageType")
    public String imageType;

    /**
     * <p>The version of the image.</p>
     * 
     * <strong>example:</strong>
     * <p>V1.0</p>
     */
    @NameInMap("ImageVersion")
    public String imageVersion;

    /**
     * <p>The name of the custom image.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>app-image</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The image configuration of the virtual machine.</p>
     */
    @NameInMap("VMImageSpec")
    public String VMImageSpecShrink;

    public static AddImageShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AddImageShrinkRequest self = new AddImageShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AddImageShrinkRequest setContainerImageSpecShrink(String containerImageSpecShrink) {
        this.containerImageSpecShrink = containerImageSpecShrink;
        return this;
    }
    public String getContainerImageSpecShrink() {
        return this.containerImageSpecShrink;
    }

    public AddImageShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AddImageShrinkRequest setImageType(String imageType) {
        this.imageType = imageType;
        return this;
    }
    public String getImageType() {
        return this.imageType;
    }

    public AddImageShrinkRequest setImageVersion(String imageVersion) {
        this.imageVersion = imageVersion;
        return this;
    }
    public String getImageVersion() {
        return this.imageVersion;
    }

    public AddImageShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddImageShrinkRequest setVMImageSpecShrink(String VMImageSpecShrink) {
        this.VMImageSpecShrink = VMImageSpecShrink;
        return this;
    }
    public String getVMImageSpecShrink() {
        return this.VMImageSpecShrink;
    }

}
