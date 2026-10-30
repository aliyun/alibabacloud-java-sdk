// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateRouteMapRuleShrinkRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can generate the parameter value on your client. Make sure that the token is unique across different requests. The client token supports only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> of each API request may be different.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>02fb3da4-130e-11e9-8e44-001****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The detailed description of the rule. The description can be empty or 1 to 256 characters in length, and cannot start with http:// or https://.</p>
     * 
     * <strong>example:</strong>
     * <p>Matches production prefixes from on-prem and sets a higher local preference.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to only precheck the request. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Prechecks the request without creating the route map rule. The system checks whether required parameters are specified, the request format, and service limits. If the request fails the precheck, the corresponding error is returned. If the request passes the precheck, the <code>DryRunOperation</code> error code is returned.</li>
     * <li><strong>false</strong> (default): Sends the request. After the request passes the precheck, the route map rule is created.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The match conditions of the route map rule. The system executes the actions defined in <strong>SetActions</strong> only when a route meets all the match conditions defined in this parameter.</p>
     */
    @NameInMap("MatchConditions")
    public String matchConditionsShrink;

    /**
     * <p>The name of the rule for easy identification. The name can be empty or 1 to 128 characters in length, and cannot start with http:// or https://.</p>
     * 
     * <strong>example:</strong>
     * <p>Permit-Prod-Prefixes-Set-LP</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The priority of the rule. A smaller value indicates a higher priority.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    /**
     * <p>The ID of the route map.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-0a1b2c3d4e5f6a7b8</p>
     */
    @NameInMap("RouteMapId")
    public String routeMapId;

    /**
     * <p>The actions to execute for the route map rule. After a route meets all the match conditions defined in <strong>MatchConditions</strong>, the system processes the route based on the actions defined in this parameter.</p>
     */
    @NameInMap("SetActions")
    public String setActionsShrink;

    public static CreateRouteMapRuleShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRouteMapRuleShrinkRequest self = new CreateRouteMapRuleShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateRouteMapRuleShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateRouteMapRuleShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateRouteMapRuleShrinkRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateRouteMapRuleShrinkRequest setMatchConditionsShrink(String matchConditionsShrink) {
        this.matchConditionsShrink = matchConditionsShrink;
        return this;
    }
    public String getMatchConditionsShrink() {
        return this.matchConditionsShrink;
    }

    public CreateRouteMapRuleShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateRouteMapRuleShrinkRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public CreateRouteMapRuleShrinkRequest setRouteMapId(String routeMapId) {
        this.routeMapId = routeMapId;
        return this;
    }
    public String getRouteMapId() {
        return this.routeMapId;
    }

    public CreateRouteMapRuleShrinkRequest setSetActionsShrink(String setActionsShrink) {
        this.setActionsShrink = setActionsShrink;
        return this;
    }
    public String getSetActionsShrink() {
        return this.setActionsShrink;
    }

}
