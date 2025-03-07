// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateMediaLiveInputShrinkRequest extends TeaModel {
    /**
     * <p>The input settings. An input can have up to two sources: primary and backup sources.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InputSettings")
    public String inputSettingsShrink;

    /**
     * <p>The name of the input. Letters, digits, hyphens (-), and underscores (_) are supported. It can be up to 64 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>myinput</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The IDs of the security groups to be associated with the input. This parameter is required for PUSH inputs.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;G6G4X5T4SZYPSTT5&quot;]</p>
     */
    @NameInMap("SecurityGroupIds")
    public String securityGroupIdsShrink;

    /**
     * <p>The input type. Valid values: RTMP_PUSH, RTMP_PULL, SRT_PUSH, and SRT_PULL.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>RTMP_PUSH</p>
     */
    @NameInMap("Type")
    public String type;

    public static CreateMediaLiveInputShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMediaLiveInputShrinkRequest self = new CreateMediaLiveInputShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateMediaLiveInputShrinkRequest setInputSettingsShrink(String inputSettingsShrink) {
        this.inputSettingsShrink = inputSettingsShrink;
        return this;
    }
    public String getInputSettingsShrink() {
        return this.inputSettingsShrink;
    }

    public CreateMediaLiveInputShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateMediaLiveInputShrinkRequest setSecurityGroupIdsShrink(String securityGroupIdsShrink) {
        this.securityGroupIdsShrink = securityGroupIdsShrink;
        return this;
    }
    public String getSecurityGroupIdsShrink() {
        return this.securityGroupIdsShrink;
    }

    public CreateMediaLiveInputShrinkRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
