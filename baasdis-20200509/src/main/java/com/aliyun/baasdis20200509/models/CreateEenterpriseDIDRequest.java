// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baasdis20200509.models;

import com.aliyun.tea.*;

public class CreateEenterpriseDIDRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>01357967-61d1-42a9-8a90-f0dd8a161411</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>F76iBtCdYuE0DHC33a5amzv3ioUfAqjuBxgek3RwjxBZ2cGP0HDxZy0k8Hs7yNtZRmM3h3KmRn4liSH4gLOOK4P41l</p>
     */
    @NameInMap("OwnerUniqueID")
    public String ownerUniqueID;

    public static CreateEenterpriseDIDRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEenterpriseDIDRequest self = new CreateEenterpriseDIDRequest();
        return TeaModel.build(map, self);
    }

    public CreateEenterpriseDIDRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateEenterpriseDIDRequest setOwnerUniqueID(String ownerUniqueID) {
        this.ownerUniqueID = ownerUniqueID;
        return this;
    }
    public String getOwnerUniqueID() {
        return this.ownerUniqueID;
    }

}
