// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreatePrivateAccessApplicationShrinkRequest extends TeaModel {
    @NameInMap("Addresses")
    public String addressesShrink;

    @NameInMap("Description")
    public String description;

    @NameInMap("Name")
    public String name;

    @NameInMap("PortRanges")
    public String portRangesShrink;

    @NameInMap("Protocol")
    public String protocol;

    @NameInMap("Status")
    public String status;

    @NameInMap("TagIds")
    public String tagIdsShrink;

    public static CreatePrivateAccessApplicationShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePrivateAccessApplicationShrinkRequest self = new CreatePrivateAccessApplicationShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreatePrivateAccessApplicationShrinkRequest setAddressesShrink(String addressesShrink) {
        this.addressesShrink = addressesShrink;
        return this;
    }
    public String getAddressesShrink() {
        return this.addressesShrink;
    }

    public CreatePrivateAccessApplicationShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreatePrivateAccessApplicationShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreatePrivateAccessApplicationShrinkRequest setPortRangesShrink(String portRangesShrink) {
        this.portRangesShrink = portRangesShrink;
        return this;
    }
    public String getPortRangesShrink() {
        return this.portRangesShrink;
    }

    public CreatePrivateAccessApplicationShrinkRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public CreatePrivateAccessApplicationShrinkRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CreatePrivateAccessApplicationShrinkRequest setTagIdsShrink(String tagIdsShrink) {
        this.tagIdsShrink = tagIdsShrink;
        return this;
    }
    public String getTagIdsShrink() {
        return this.tagIdsShrink;
    }

}
