// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreateDeviceGroupRequest extends TeaModel {
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
    public Rule dynamicRule;

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
