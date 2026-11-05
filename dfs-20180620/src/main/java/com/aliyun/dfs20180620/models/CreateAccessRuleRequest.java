// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class CreateAccessRuleRequest extends TeaModel {
    /**
     * <p>The ID of the access group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>acg-e3755fb0-358d-4286-9942-8d461048****</p>
     */
    @NameInMap("AccessGroupId")
    public String accessGroupId;

    /**
     * <p>The description of the access group rule. The description can be up to 32 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>CIDR block of log upload servers</p>
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
     * <p>The IP address or CIDR block of the authorized object.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>192.0.2.0/24</p>
     */
    @NameInMap("NetworkSegment")
    public String networkSegment;

    /**
     * <p>The priority of the access group rule. When an authorized object matches multiple rules, the rule with the highest priority takes effect. Valid values: 1 to 100. A value of 1 indicates the highest priority.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    /**
     * <p>The read and write permissions of the authorized object on the file system. Valid values:</p>
     * <ul>
     * <li>RDWR: Read and write.</li>
     * <li>RDONLY: Read-only.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>RDWR</p>
     */
    @NameInMap("RWAccessType")
    public String RWAccessType;

    public static CreateAccessRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAccessRuleRequest self = new CreateAccessRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateAccessRuleRequest setAccessGroupId(String accessGroupId) {
        this.accessGroupId = accessGroupId;
        return this;
    }
    public String getAccessGroupId() {
        return this.accessGroupId;
    }

    public CreateAccessRuleRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateAccessRuleRequest setInputRegionId(String inputRegionId) {
        this.inputRegionId = inputRegionId;
        return this;
    }
    public String getInputRegionId() {
        return this.inputRegionId;
    }

    public CreateAccessRuleRequest setNetworkSegment(String networkSegment) {
        this.networkSegment = networkSegment;
        return this;
    }
    public String getNetworkSegment() {
        return this.networkSegment;
    }

    public CreateAccessRuleRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public CreateAccessRuleRequest setRWAccessType(String RWAccessType) {
        this.RWAccessType = RWAccessType;
        return this;
    }
    public String getRWAccessType() {
        return this.RWAccessType;
    }

}
