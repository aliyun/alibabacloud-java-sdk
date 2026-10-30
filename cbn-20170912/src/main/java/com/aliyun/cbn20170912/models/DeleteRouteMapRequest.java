// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DeleteRouteMapRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can generate the value from your client and make sure that the value is unique across different requests. The ClientToken parameter supports only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> of each API request may be different.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>02fb3da4****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to only precheck the request. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The system prechecks the request without deleting the route map. The system checks whether the required parameters are specified, the request format is valid, and the service limits are met. If the request fails the precheck, the system returns an error. If the request passes the precheck, the system returns the DryRunOperation error code.</li>
     * <li><strong>false</strong> (default): The system sends a normal request and deletes the route map after the request passes the precheck.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The ID of the route map.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-w4yf7toozfol3q****</p>
     */
    @NameInMap("RouteMapId")
    public String routeMapId;

    public static DeleteRouteMapRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRouteMapRequest self = new DeleteRouteMapRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRouteMapRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeleteRouteMapRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public DeleteRouteMapRequest setRouteMapId(String routeMapId) {
        this.routeMapId = routeMapId;
        return this;
    }
    public String getRouteMapId() {
        return this.routeMapId;
    }

}
