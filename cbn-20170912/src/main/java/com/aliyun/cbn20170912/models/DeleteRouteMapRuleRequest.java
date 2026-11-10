// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DeleteRouteMapRuleRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can generate a parameter value on your client to ensure that the value is unique across different requests. The ClientToken parameter supports only ASCII characters.</p>
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
     * <p>Specifies whether to perform a dry run on the request. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: performs a dry run and does not delete the route map rule. The system checks whether required parameters are specified, the request format is valid, and service limits are met. If the check fails, the system returns an error. If the check succeeds, the system returns the error code <code>DryRunOperation</code>.</li>
     * <li><strong>false</strong> (default): sends a regular request and deletes the route map rule if the dry run succeeds.</li>
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
