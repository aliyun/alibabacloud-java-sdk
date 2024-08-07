// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class UpdateWhiteRuleListRequest extends TeaModel {
    /**
     * <p>The alert whitelist rule. The value is a JSON object.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[
     *       {
     *             &quot;alertName&quot;: &quot;webshell&quot;,
     *             &quot;alertNameId&quot;: &quot;webshell&quot;,
     *             &quot;alertType&quot;: &quot;command&quot;,
     *             &quot;alertTypeId&quot;: &quot;command&quot;,
     *             &quot;expression&quot;: {
     *                   &quot;status&quot;: 1,
     *                   &quot;conditions&quot;: [
     *                         {
     *                               &quot;isNot&quot;: false,
     *                               &quot;left&quot;: {
     *                                     &quot;value&quot;: &quot;file_path&quot;
     *                               },
     *                               &quot;operator&quot;: &quot;gt&quot;,
     *                               &quot;right&quot;: {
     *                                     &quot;value&quot;: &quot;cp&quot;
     *                               }
     *                         }
     *                   ]
     *             }
     *       }
     * ]</p>
     */
    @NameInMap("Expression")
    public String expression;

    /**
     * <p>The UUID of the event.</p>
     * 
     * <strong>example:</strong>
     * <p>85ea4241-798f-4684-a876-65d4f0c3****</p>
     */
    @NameInMap("IncidentUuid")
    public String incidentUuid;

    /**
     * <p>The region in which the data management center of the threat analysis feature resides. Specify this parameter based on the regions in which your assets reside. Valid values:</p>
     * <ul>
     * <li>cn-hangzhou: Your assets reside in regions in China.</li>
     * <li>ap-southeast-1: Your assets reside in regions outside China.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RoleFor")
    public Long roleFor;

    @NameInMap("RoleType")
    public Integer roleType;

    /**
     * <p>The unique ID of the whitelist rule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456789</p>
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
