// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.expressconnectrouter20230901.models;

import com.aliyun.tea.*;

public class DeleteExpressConnectRouterAssociationRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AssociationId")
    public String associationId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DeleteAttachment")
    public Boolean deleteAttachment;

    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("EcrId")
    public String ecrId;

    public static DeleteExpressConnectRouterAssociationRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteExpressConnectRouterAssociationRequest self = new DeleteExpressConnectRouterAssociationRequest();
        return TeaModel.build(map, self);
    }

    public DeleteExpressConnectRouterAssociationRequest setAssociationId(String associationId) {
        this.associationId = associationId;
        return this;
    }
    public String getAssociationId() {
        return this.associationId;
    }

    public DeleteExpressConnectRouterAssociationRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeleteExpressConnectRouterAssociationRequest setDeleteAttachment(Boolean deleteAttachment) {
        this.deleteAttachment = deleteAttachment;
        return this;
    }
    public Boolean getDeleteAttachment() {
        return this.deleteAttachment;
    }

    public DeleteExpressConnectRouterAssociationRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public DeleteExpressConnectRouterAssociationRequest setEcrId(String ecrId) {
        this.ecrId = ecrId;
        return this;
    }
    public String getEcrId() {
        return this.ecrId;
    }

}
