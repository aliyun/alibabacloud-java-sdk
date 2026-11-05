// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class ModifyAccessGroupRequest extends TeaModel {
    /**
     * <p>The ID of the permission group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>acg-e3755fb0-358d-4286-9942-8d461048****</p>
     */
    @NameInMap("AccessGroupId")
    public String accessGroupId;

    /**
     * <p>The name of the permission group. The naming rules are as follows:</p>
     * <ul>
     * <li><p>The name must be 6 to 64 characters in length.</p>
     * </li>
     * <li><p>The name must be globally unique and cannot be an empty string.</p>
     * </li>
     * <li><p>The name can contain letters, digits, underscores (_), and hyphens (-).</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>my-online-cluster-policy</p>
     */
    @NameInMap("AccessGroupName")
    public String accessGroupName;

    /**
     * <p>The description of the permission group.</p>
     * 
     * <strong>example:</strong>
     * <p>Dedicated policy for production cluster CIDR blocks</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("InputRegionId")
    public String inputRegionId;

    public static ModifyAccessGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAccessGroupRequest self = new ModifyAccessGroupRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAccessGroupRequest setAccessGroupId(String accessGroupId) {
        this.accessGroupId = accessGroupId;
        return this;
    }
    public String getAccessGroupId() {
        return this.accessGroupId;
    }

    public ModifyAccessGroupRequest setAccessGroupName(String accessGroupName) {
        this.accessGroupName = accessGroupName;
        return this;
    }
    public String getAccessGroupName() {
        return this.accessGroupName;
    }

    public ModifyAccessGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyAccessGroupRequest setInputRegionId(String inputRegionId) {
        this.inputRegionId = inputRegionId;
        return this;
    }
    public String getInputRegionId() {
        return this.inputRegionId;
    }

}
