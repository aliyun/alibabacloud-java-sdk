// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20230701.models;

import com.aliyun.tea.*;

public class AddImageShrinkRequest extends TeaModel {
    @NameInMap("ContainerImageSpec")
    public String containerImageSpecShrink;

    @NameInMap("Description")
    public String description;

    @NameInMap("Name")
    public String name;

    @NameInMap("VMImageSpec")
    public String VMImageSpecShrink;

    @NameInMap("Version")
    public String version;

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

    public AddImageShrinkRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
