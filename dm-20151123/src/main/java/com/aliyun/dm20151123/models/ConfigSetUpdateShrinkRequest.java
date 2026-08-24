// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class ConfigSetUpdateShrinkRequest extends TeaModel {
    /**
     * <p>The description. Maximum length: 50 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>XXX</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The configuration set ID. This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>XXX</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The associated IP pool ID. This parameter is optional.</p>
     * 
     * <strong>example:</strong>
     * <p>XXX</p>
     */
    @NameInMap("IpPoolId")
    public String ipPoolId;

    @NameInMap("IsPublicChannelBackoff")
    public Boolean isPublicChannelBackoff;

    /**
     * <p>The configuration name. This parameter is required. Maximum length: 50 characters. The name must be unique.</p>
     * 
     * <strong>example:</strong>
     * <p>XXX</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("ValidationOption")
    public String validationOptionShrink;

    public static ConfigSetUpdateShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfigSetUpdateShrinkRequest self = new ConfigSetUpdateShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ConfigSetUpdateShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ConfigSetUpdateShrinkRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ConfigSetUpdateShrinkRequest setIpPoolId(String ipPoolId) {
        this.ipPoolId = ipPoolId;
        return this;
    }
    public String getIpPoolId() {
        return this.ipPoolId;
    }

    public ConfigSetUpdateShrinkRequest setIsPublicChannelBackoff(Boolean isPublicChannelBackoff) {
        this.isPublicChannelBackoff = isPublicChannelBackoff;
        return this;
    }
    public Boolean getIsPublicChannelBackoff() {
        return this.isPublicChannelBackoff;
    }

    public ConfigSetUpdateShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ConfigSetUpdateShrinkRequest setValidationOptionShrink(String validationOptionShrink) {
        this.validationOptionShrink = validationOptionShrink;
        return this;
    }
    public String getValidationOptionShrink() {
        return this.validationOptionShrink;
    }

}
