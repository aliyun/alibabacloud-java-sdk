// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class ModifyPolicyShrinkRequest extends TeaModel {
    /**
     * <p>The action type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>11</p>
     */
    @NameInMap("ActionType")
    public Integer actionType;

    /**
     * <p>The policy content.</p>
     */
    @NameInMap("Content")
    public String contentShrink;

    /**
     * <p>The policy ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c52c2fa6-fdac-40c4-8753-be7c********</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The policy name.</p>
     * 
     * <strong>example:</strong>
     * <p>demo**</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The version of the port-specific mitigation policy. Valid values:</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("PortVersion")
    public String portVersion;

    public static ModifyPolicyShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyPolicyShrinkRequest self = new ModifyPolicyShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyPolicyShrinkRequest setActionType(Integer actionType) {
        this.actionType = actionType;
        return this;
    }
    public Integer getActionType() {
        return this.actionType;
    }

    public ModifyPolicyShrinkRequest setContentShrink(String contentShrink) {
        this.contentShrink = contentShrink;
        return this;
    }
    public String getContentShrink() {
        return this.contentShrink;
    }

    public ModifyPolicyShrinkRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ModifyPolicyShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyPolicyShrinkRequest setPortVersion(String portVersion) {
        this.portVersion = portVersion;
        return this;
    }
    public String getPortVersion() {
        return this.portVersion;
    }

}
