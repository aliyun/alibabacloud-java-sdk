// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class UpdateWhiteRuleListRequest extends TeaModel {
    /**
     * <p>The alert whitelist rule. The value is a JSON object.</p>
     */
    @NameInMap("Expression")
    public String expression;

    /**
     * <p>The UUID of the event.</p>
     */
    @NameInMap("IncidentUuid")
    public String incidentUuid;

    /**
     * <p>The region in which the data management center of the threat analysis feature resides. Specify this parameter based on the regions in which your assets reside. Valid values:</p>
     * <br>
     * <p>*   cn-hangzhou: Your assets reside in regions in China.</p>
     * <p>*   ap-southeast-1: Your assets reside in regions outside China.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RoleFor")
    public Long roleFor;

    @NameInMap("RoleType")
    public Integer roleType;

    /**
     * <p>The unique ID of the whitelist rule.</p>
     */
    @NameInMap("WhiteRuleId")
    public Long whiteRuleId;

    public static UpdateWhiteRuleListRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateWhiteRuleListRequest self = new UpdateWhiteRuleListRequest();
        return TeaModel.build(map, self);
    }

    public UpdateWhiteRuleListRequest setExpression(String expression) {
        this.expression = expression;
        return this;
    }
    public String getExpression() {
        return this.expression;
    }

    public UpdateWhiteRuleListRequest setIncidentUuid(String incidentUuid) {
        this.incidentUuid = incidentUuid;
        return this;
    }
    public String getIncidentUuid() {
        return this.incidentUuid;
    }

    public UpdateWhiteRuleListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateWhiteRuleListRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

    public UpdateWhiteRuleListRequest setRoleType(Integer roleType) {
        this.roleType = roleType;
        return this;
    }
    public Integer getRoleType() {
        return this.roleType;
    }

    public UpdateWhiteRuleListRequest setWhiteRuleId(Long whiteRuleId) {
        this.whiteRuleId = whiteRuleId;
        return this;
    }
    public Long getWhiteRuleId() {
        return this.whiteRuleId;
    }

}
