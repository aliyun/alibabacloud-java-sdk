// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateMediaLiveInputShrinkRequest extends TeaModel {
    /**
     * <p>The ID of the input.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SEGK5KA6KYKAWQQH</p>
     */
    @NameInMap("InputId")
    public String inputId;

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

    public static UpdateMediaLiveInputShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMediaLiveInputShrinkRequest self = new UpdateMediaLiveInputShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMediaLiveInputShrinkRequest setInputId(String inputId) {
        this.inputId = inputId;
        return this;
    }
    public String getInputId() {
        return this.inputId;
    }

    public UpdateMediaLiveInputShrinkRequest setInputSettingsShrink(String inputSettingsShrink) {
        this.inputSettingsShrink = inputSettingsShrink;
        return this;
    }
    public String getInputSettingsShrink() {
        return this.inputSettingsShrink;
    }

    public UpdateMediaLiveInputShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateMediaLiveInputShrinkRequest setSecurityGroupIdsShrink(String securityGroupIdsShrink) {
        this.securityGroupIdsShrink = securityGroupIdsShrink;
        return this;
    }
    public String getSecurityGroupIdsShrink() {
        return this.securityGroupIdsShrink;
    }

}
