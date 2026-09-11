// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdateDeviceGroupShrinkRequest extends TeaModel {
    /**
     * <p>The description of the device label. Set this parameter to an empty string to clear the description. The description can contain letters, digits, Chinese characters, spaces, periods (.), underscores (_), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>Test device group description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the device label.</p>
     * 
     * <strong>example:</strong>
     * <p>device-group-5191cf830a5e****</p>
     */
    @NameInMap("DeviceGroupId")
    public String deviceGroupId;

    /**
     * <p>The operator of the dynamic device group rule.</p>
     * 
     * <strong>example:</strong>
     * <p>AND</p>
     */
    @NameInMap("DynamicOperator")
    @Deprecated
    public String dynamicOperator;

    /**
     * <p>The matching rule of the dynamic device label.</p>
     */
    @NameInMap("DynamicRule")
    public String dynamicRuleShrink;

    /**
     * <p>The name of the device label. The name must be 1 to 128 characters in length and can contain letters, digits, Chinese characters, periods (.), underscores (_), and hyphens (-). Spaces are not supported.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("Name")
    public String name;

    public static UpdateDeviceGroupShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDeviceGroupShrinkRequest self = new UpdateDeviceGroupShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDeviceGroupShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateDeviceGroupShrinkRequest setDeviceGroupId(String deviceGroupId) {
        this.deviceGroupId = deviceGroupId;
        return this;
    }
    public String getDeviceGroupId() {
        return this.deviceGroupId;
    }

    @Deprecated
    public UpdateDeviceGroupShrinkRequest setDynamicOperator(String dynamicOperator) {
        this.dynamicOperator = dynamicOperator;
        return this;
    }
    public String getDynamicOperator() {
        return this.dynamicOperator;
    }

    public UpdateDeviceGroupShrinkRequest setDynamicRuleShrink(String dynamicRuleShrink) {
        this.dynamicRuleShrink = dynamicRuleShrink;
        return this;
    }
    public String getDynamicRuleShrink() {
        return this.dynamicRuleShrink;
    }

    public UpdateDeviceGroupShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
