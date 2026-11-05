// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class ModifyAccessRuleRequest extends TeaModel {
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
     * <p>The ID of the permission group rule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>acr-c38028f0-f313-4385-9456-3501b1f5****</p>
     */
    @NameInMap("AccessRuleId")
    public String accessRuleId;

    /**
     * <p>The description of the permission group rule.</p>
     * <p>The description can be up to 32 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>CIDR block of the log upload server</p>
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

    /**
     * <p>The priority of the permission group rule.</p>
     * <p>Valid values: 1 to 100. A value of 1 indicates the highest priority.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    /**
     * <p>The read and write permissions that the authorized object has on the file system.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>RDWR: read and write</li>
     * <li>RDONLY: read-only</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>RDWR</p>
     */
    @NameInMap("RWAccessType")
    public String RWAccessType;

    public static ModifyAccessRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAccessRuleRequest self = new ModifyAccessRuleRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAccessRuleRequest setAccessGroupId(String accessGroupId) {
        this.accessGroupId = accessGroupId;
        return this;
    }
    public String getAccessGroupId() {
        return this.accessGroupId;
    }

    public ModifyAccessRuleRequest setAccessRuleId(String accessRuleId) {
        this.accessRuleId = accessRuleId;
        return this;
    }
    public String getAccessRuleId() {
        return this.accessRuleId;
    }

    public ModifyAccessRuleRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyAccessRuleRequest setInputRegionId(String inputRegionId) {
        this.inputRegionId = inputRegionId;
        return this;
    }
    public String getInputRegionId() {
        return this.inputRegionId;
    }

    public ModifyAccessRuleRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public ModifyAccessRuleRequest setRWAccessType(String RWAccessType) {
        this.RWAccessType = RWAccessType;
        return this;
    }
    public String getRWAccessType() {
        return this.RWAccessType;
    }

}
