// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class ModifyAccessGroupRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>acg-e3755fb0-358d-4286-9942-8d461048****</p>
     */
    @NameInMap("AccessGroupId")
    public String accessGroupId;

    /**
     * <strong>example:</strong>
     * <p>my-online-cluster-policy</p>
     */
    @NameInMap("AccessGroupName")
    public String accessGroupName;

    @NameInMap("Description")
    public String description;

    /**
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
