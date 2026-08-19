// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreateDeviceGroupShrinkRequest extends TeaModel {
    /**
     * <p>The description of the device label. The description can contain letters, digits, Chinese characters, spaces, periods (.), underscores (_), and hyphens (-). This parameter can be left empty.</p>
     * 
     * <strong>example:</strong>
     * <p>Test device group description</p>
     */
    @NameInMap("Description")
    public String description;

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
     * <p>The type of the device label. Valid values:</p>
     * <ul>
     * <li><strong>static</strong>: static device label. After creation, manually add terminal devices by calling <a href="~~AddDeviceGroupMatchDevices~~">AddDeviceGroupMatchDevices</a>.</li>
     * <li><strong>dynamic</strong>: dynamic device label. Members are automatically matched by the DynamicRule matching rule.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>static</p>
     */
    @NameInMap("GroupType")
    public String groupType;

    /**
     * <p>The name of the device label. The name must be 1 to 128 characters in length and can contain letters, digits, Chinese characters, periods (.), underscores (_), and hyphens (-). Spaces are not supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("Name")
    public String name;

    public static CreateDeviceGroupShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDeviceGroupShrinkRequest self = new CreateDeviceGroupShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateDeviceGroupShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    @Deprecated
    public CreateDeviceGroupShrinkRequest setDynamicOperator(String dynamicOperator) {
        this.dynamicOperator = dynamicOperator;
        return this;
    }
    public String getDynamicOperator() {
        return this.dynamicOperator;
    }

    public CreateDeviceGroupShrinkRequest setDynamicRuleShrink(String dynamicRuleShrink) {
        this.dynamicRuleShrink = dynamicRuleShrink;
        return this;
    }
    public String getDynamicRuleShrink() {
        return this.dynamicRuleShrink;
    }

    public CreateDeviceGroupShrinkRequest setGroupType(String groupType) {
        this.groupType = groupType;
        return this;
    }
    public String getGroupType() {
        return this.groupType;
    }

    public CreateDeviceGroupShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
