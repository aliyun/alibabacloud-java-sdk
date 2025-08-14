// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.expressconnectrouter20230901.models;

import com.aliyun.tea.*;

public class ModifyExpressConnectRouterAssociationRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ecr-assoc-9p2qxx5phpca2m****</p>
     */
    @NameInMap("AssociationId")
    public String associationId;

    /**
     * <strong>example:</strong>
     * <p>02fb3da4-130e-11e9-8e44-00****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ecr-mezk2idmsd0vx2****</p>
     */
    @NameInMap("EcrId")
    public String ecrId;

    public static ModifyExpressConnectRouterAssociationRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyExpressConnectRouterAssociationRequest self = new ModifyExpressConnectRouterAssociationRequest();
        return TeaModel.build(map, self);
    }

    public ModifyExpressConnectRouterAssociationRequest setAssociationId(String associationId) {
        this.associationId = associationId;
        return this;
    }
    public String getAssociationId() {
        return this.associationId;
    }

    public ModifyExpressConnectRouterAssociationRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyExpressConnectRouterAssociationRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyExpressConnectRouterAssociationRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public ModifyExpressConnectRouterAssociationRequest setEcrId(String ecrId) {
        this.ecrId = ecrId;
        return this;
    }
    public String getEcrId() {
        return this.ecrId;
    }

}
