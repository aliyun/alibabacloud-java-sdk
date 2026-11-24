// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreateDeviceGroupRequest extends TeaModel {
    /**
     * <p>The description of the device tag. The description can contain Chinese characters, uppercase and lowercase letters, digits, spaces, periods (.), underscores (_), and hyphens (-). This parameter can be left empty.</p>
     * 
     * <strong>example:</strong>
     * <p>Test device group description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The operator for dynamic device group rules.</p>
     * 
     * <strong>example:</strong>
     * <p>AND</p>
     */
    @NameInMap("DynamicOperator")
    @Deprecated
    public String dynamicOperator;

    /**
     * <p>The matching rule for the dynamic device tag.</p>
     */
    @NameInMap("DynamicRule")
    public Rule dynamicRule;

    /**
     * <p>The type of the device tag. Valid values:</p>
     * <ul>
     * <li><strong>static</strong>: static device tag. After the tag is created, you can manually add terminal devices by calling the <a href="~~AddDeviceGroupMatchDevices~~">AddDeviceGroupMatchDevices</a> operation.</li>
     * <li><strong>dynamic</strong>: dynamic device tag. Members are automatically matched based on the DynamicRule matching rule.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>static</p>
     */
    @NameInMap("GroupType")
    public String groupType;

    /**
     * <p>The name of the device tag. The name must be 1 to 128 characters in length and can contain Chinese characters, uppercase and lowercase letters, digits, periods (.), underscores (_), and hyphens (-). Spaces are not allowed.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("Name")
    public String name;

    public static CreateDeviceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDeviceGroupRequest self = new CreateDeviceGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateDeviceGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    @Deprecated
    public CreateDeviceGroupRequest setDynamicOperator(String dynamicOperator) {
        this.dynamicOperator = dynamicOperator;
        return this;
    }
    public String getDynamicOperator() {
        return this.dynamicOperator;
    }

    public CreateDeviceGroupRequest setDynamicRule(Rule dynamicRule) {
        this.dynamicRule = dynamicRule;
        return this;
    }
    public Rule getDynamicRule() {
        return this.dynamicRule;
    }

    public CreateDeviceGroupRequest setGroupType(String groupType) {
        this.groupType = groupType;
        return this;
    }
    public String getGroupType() {
        return this.groupType;
    }

    public CreateDeviceGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
