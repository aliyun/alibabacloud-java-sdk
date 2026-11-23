// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.expressconnectrouter20230901.models;

import com.aliyun.tea.*;

public class UpdateRouteMapAssociationRequest extends TeaModel {
    /**
     * <p>The ID of the routing policy association.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ecr-routemap-assoc-qdoeneegffq4yv****</p>
     */
    @NameInMap("AssociationId")
    public String associationId;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can generate the parameter value on your client to ensure that it is unique across different requests. The client token only supports ASCII characters.</p>
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
     * <p>Specifies whether to perform a dry run on the request. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Performs a dry run and does not modify service resources.</p>
     * </li>
     * <li><p><strong>false</strong> (default): Sends a normal request.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The instance ID of the Express Connect Router (ECR).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ecr-mezk2idmsd0vx2****</p>
     */
    @NameInMap("EcrId")
    public String ecrId;

    /**
     * <p>The list of region IDs where the routing policy is delivered and takes effect for the Express Connect Router (ECR).</p>
     * <blockquote>
     * <p>If this parameter is left empty, the routing policy is not delivered to any region.</p>
     * </blockquote>
     */
    @NameInMap("RegionIdList")
    public java.util.List<String> regionIdList;

    @NameInMap("Version")
    public String version;

    public static UpdateRouteMapAssociationRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRouteMapAssociationRequest self = new UpdateRouteMapAssociationRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRouteMapAssociationRequest setAssociationId(String associationId) {
        this.associationId = associationId;
        return this;
    }
    public String getAssociationId() {
        return this.associationId;
    }

    public UpdateRouteMapAssociationRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateRouteMapAssociationRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public UpdateRouteMapAssociationRequest setEcrId(String ecrId) {
        this.ecrId = ecrId;
        return this;
    }
    public String getEcrId() {
        return this.ecrId;
    }

    public UpdateRouteMapAssociationRequest setRegionIdList(java.util.List<String> regionIdList) {
        this.regionIdList = regionIdList;
        return this;
    }
    public java.util.List<String> getRegionIdList() {
        return this.regionIdList;
    }

    public UpdateRouteMapAssociationRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
