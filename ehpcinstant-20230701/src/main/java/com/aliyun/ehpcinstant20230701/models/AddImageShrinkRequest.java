// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class AddImageShrinkRequest extends TeaModel {
    @NameInMap("ContainerImageSpec")
    public String containerImageSpecShrink;

    @NameInMap("Description")
    public String description;

    @NameInMap("ImageVersion")
    public String imageVersion;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Name")
    public String name;

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
