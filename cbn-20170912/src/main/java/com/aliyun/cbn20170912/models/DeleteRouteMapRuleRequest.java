// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DeleteRouteMapRuleRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can generate the parameter value from your client to ensure that the value is unique across different requests. The ClientToken parameter supports only ASCII characters.</p>
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
     * <p>Specifies whether to only precheck the request. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: sends a check request and does not delete the route map rule. The system checks whether required parameters are specified, the request format, and service limits. If the request fails the check, the corresponding error is returned. If the request passes the check, the DryRunOperation error code is returned.</li>
     * <li><strong>false</strong> (default): sends a regular request and directly deletes the route map rule after the request passes the check.</li>
     * </ul>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The ID of the route map rule to delete.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rmr-0a1b2c3d4e5f6a7b8</p>
     */
    @NameInMap("RouteMapRuleId")
    public String routeMapRuleId;

    public static DeleteRouteMapRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRouteMapRuleRequest self = new DeleteRouteMapRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRouteMapRuleRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeleteRouteMapRuleRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public DeleteRouteMapRuleRequest setRouteMapRuleId(String routeMapRuleId) {
        this.routeMapRuleId = routeMapRuleId;
        return this;
    }
    public String getRouteMapRuleId() {
        return this.routeMapRuleId;
    }

}
