// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyConfigGroupRequest extends TeaModel {
    /**
     * <p>The description of the configuration group.</p>
     * 
     * <strong>example:</strong>
     * <p>ScheduledTask</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the configuration group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cg-i1ruuudp92qpj****</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The name of the configuration group.</p>
     * 
     * <strong>example:</strong>
     * <p>ScheduledTask</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the region. Set the value to <code>cn-shanghai</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ModifyConfigGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyConfigGroupRequest self = new ModifyConfigGroupRequest();
        return TeaModel.build(map, self);
    }

    public ModifyConfigGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyConfigGroupRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public ModifyConfigGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyConfigGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
