// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class UpdateWhiteRuleListRequest extends TeaModel {
    /**
     * <p>The alert whitelist rule. This is a JSON object.</p>
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
     * <p>The global unique ID of the event.</p>
     * 
     * <strong>example:</strong>
     * <p>85ea4241-798f-4684-a876-65d4f0c3****</p>
     */
    @NameInMap("IncidentUuid")
    public String incidentUuid;

    /**
     * <p>The region of the Data Management center for threat analysis. Select a region for the Data Management center based on the region of your assets. Valid values:</p>
     * <ul>
     * <li><p>cn-hangzhou: Your assets are in the Chinese mainland or China (Hong Kong).</p>
     * </li>
     * <li><p>ap-southeast-1: Your assets are outside China.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The user ID of the member. This parameter is used when an administrator switches to the perspective of a member.</p>
     * 
     * <strong>example:</strong>
     * <p>113091674488****</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    /**
     * <p>The view type.</p>
     * <ul>
     * <li><p>0: The view of the current Alibaba Cloud account.</p>
     * </li>
     * <li><p>1: The view of all accounts that belong to the enterprise.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
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
