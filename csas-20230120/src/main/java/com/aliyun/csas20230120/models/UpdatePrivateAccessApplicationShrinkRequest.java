// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdatePrivateAccessApplicationShrinkRequest extends TeaModel {
    @NameInMap("Addresses")
    public String addressesShrink;

    @NameInMap("ApplicationId")
    public String applicationId;

    @NameInMap("Description")
    public String description;

    @NameInMap("ModifyType")
    public String modifyType;

    @NameInMap("PortRanges")
    public String portRangesShrink;

    @NameInMap("Protocol")
    public String protocol;

    @NameInMap("Status")
    public String status;

    @NameInMap("TagIds")
    public String tagIdsShrink;

    public static UpdatePrivateAccessApplicationShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePrivateAccessApplicationShrinkRequest self = new UpdatePrivateAccessApplicationShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePrivateAccessApplicationShrinkRequest setAddressesShrink(String addressesShrink) {
        this.addressesShrink = addressesShrink;
        return this;
    }
    public String getAddressesShrink() {
        return this.addressesShrink;
    }

    public UpdatePrivateAccessApplicationShrinkRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public UpdatePrivateAccessApplicationShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdatePrivateAccessApplicationShrinkRequest setModifyType(String modifyType) {
        this.modifyType = modifyType;
        return this;
    }
    public String getModifyType() {
        return this.modifyType;
    }

    public UpdatePrivateAccessApplicationShrinkRequest setPortRangesShrink(String portRangesShrink) {
        this.portRangesShrink = portRangesShrink;
        return this;
    }
    public String getPortRangesShrink() {
        return this.portRangesShrink;
    }

    public UpdatePrivateAccessApplicationShrinkRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public UpdatePrivateAccessApplicationShrinkRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UpdatePrivateAccessApplicationShrinkRequest setTagIdsShrink(String tagIdsShrink) {
        this.tagIdsShrink = tagIdsShrink;
        return this;
    }
    public String getTagIdsShrink() {
        return this.tagIdsShrink;
    }

}
