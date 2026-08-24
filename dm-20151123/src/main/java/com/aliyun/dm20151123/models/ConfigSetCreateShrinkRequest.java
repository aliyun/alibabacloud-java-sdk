// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class ConfigSetCreateShrinkRequest extends TeaModel {
    /**
     * <p>The description. The description can be up to 50 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>XXX</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the associated IP pool. This parameter is optional.</p>
     * 
     * <strong>example:</strong>
     * <p>XXX</p>
     */
    @NameInMap("IpPoolId")
    public String ipPoolId;

    @NameInMap("IsPublicChannelBackoff")
    public Boolean isPublicChannelBackoff;

    /**
     * <p>The configuration name. This parameter is required. The name can be up to 50 characters in length and must be unique.</p>
     * 
     * <strong>example:</strong>
     * <p>XXX</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("ValidationOption")
    public String validationOptionShrink;

    public static ConfigSetCreateShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfigSetCreateShrinkRequest self = new ConfigSetCreateShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ConfigSetCreateShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ConfigSetCreateShrinkRequest setIpPoolId(String ipPoolId) {
        this.ipPoolId = ipPoolId;
        return this;
    }
    public String getIpPoolId() {
        return this.ipPoolId;
    }

    public ConfigSetCreateShrinkRequest setIsPublicChannelBackoff(Boolean isPublicChannelBackoff) {
        this.isPublicChannelBackoff = isPublicChannelBackoff;
        return this;
    }
    public Boolean getIsPublicChannelBackoff() {
        return this.isPublicChannelBackoff;
    }

    public ConfigSetCreateShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ConfigSetCreateShrinkRequest setValidationOptionShrink(String validationOptionShrink) {
        this.validationOptionShrink = validationOptionShrink;
        return this;
    }
    public String getValidationOptionShrink() {
        return this.validationOptionShrink;
    }

}
