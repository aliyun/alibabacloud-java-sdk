// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.expressconnectrouter20230901.models;

import com.aliyun.tea.*;

public class CreateRouteMapAssociationRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can generate the value from your client and ensure that the value is unique across different requests. The client token supports only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> of each API request is unique.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>02fb3da4-130e-11e9-8e44-00****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether it is a dry run only. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: sends a dry run request without modifying EPS resources.</p>
     * </li>
     * <li><p><strong>false</strong> (default): sends a normal request.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The Express Connect Router (ECR) instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ecr-mezk2idmsd0vx2****</p>
     */
    @NameInMap("EcrId")
    public String ecrId;

    /**
     * <p>The list of region IDs of the Express Connect Router (ECR) where the routing policy is distributed and takes effect.</p>
     * <blockquote>
     * <p>If this parameter is left empty, the routing policy is not distributed to any region.</p>
     * </blockquote>
     */
    @NameInMap("RegionIdList")
    public java.util.List<String> regionIdList;

    /**
     * <p>The ID of the route map in the Cloud Enterprise Network (CEN).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-6m58b17417tg5a****</p>
     */
    @NameInMap("RouteMapId")
    public String routeMapId;

    @NameInMap("Version")
    public String version;

    public static CreateRouteMapAssociationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRouteMapAssociationRequest self = new CreateRouteMapAssociationRequest();
        return TeaModel.build(map, self);
    }

    public CreateRouteMapAssociationRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateRouteMapAssociationRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateRouteMapAssociationRequest setEcrId(String ecrId) {
        this.ecrId = ecrId;
        return this;
    }
    public String getEcrId() {
        return this.ecrId;
    }

    public CreateRouteMapAssociationRequest setRegionIdList(java.util.List<String> regionIdList) {
        this.regionIdList = regionIdList;
        return this;
    }
    public java.util.List<String> getRegionIdList() {
        return this.regionIdList;
    }

    public CreateRouteMapAssociationRequest setRouteMapId(String routeMapId) {
        this.routeMapId = routeMapId;
        return this;
    }
    public String getRouteMapId() {
        return this.routeMapId;
    }

    public CreateRouteMapAssociationRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
