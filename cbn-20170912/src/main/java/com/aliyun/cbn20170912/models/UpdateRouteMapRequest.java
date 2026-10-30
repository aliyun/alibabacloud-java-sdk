// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class UpdateRouteMapRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the value, but you must ensure that it is unique among different requests. The client token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the RequestId of the API request as the client token. The RequestId of each API request may be different.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the route map.</p>
     * <p>The description can be empty or 1 to 256 characters in length. It cannot start with http:// or https://.</p>
     * 
     * <strong>example:</strong>
     * <p>desctest</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to only precheck the request. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: prechecks the request without updating the route map. The system checks whether required parameters are specified, the request format is valid, and the service limits are met. If the request fails the precheck, the corresponding error is returned. If the request passes the precheck, the DryRunOperation error code is returned.</li>
     * <li><strong>false</strong> (default): sends the request. If the request passes the precheck, the route map is updated.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The name of the route map.</p>
     * <p>The name can be empty or 1 to 128 characters in length. It cannot start with http:// or https://.</p>
     * 
     * <strong>example:</strong>
     * <p>nametest</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>Policy priority of the route map. Valid values: <strong>1</strong> to <strong>100</strong>. A smaller value indicates a higher priority.</p>
     * <blockquote>
     * <p>Policy priority of each route map within an Alibaba Cloud account must be unique. When a route map is applied, the system starts to match routes against the rules of the route map that has the highest priority (the smallest priority value) and then proceeds to route maps with lower priorities based on the rule priorities. Therefore, when you specify policy priority of a route map, make sure that policy priority meets your expected matching order.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    /**
     * <p>The ID of the route map.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-abcdedfghij****</p>
     */
    @NameInMap("RouteMapId")
    public String routeMapId;

    public static UpdateRouteMapRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRouteMapRequest self = new UpdateRouteMapRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRouteMapRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateRouteMapRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateRouteMapRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public UpdateRouteMapRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateRouteMapRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public UpdateRouteMapRequest setRouteMapId(String routeMapId) {
        this.routeMapId = routeMapId;
        return this;
    }
    public String getRouteMapId() {
        return this.routeMapId;
    }

}
