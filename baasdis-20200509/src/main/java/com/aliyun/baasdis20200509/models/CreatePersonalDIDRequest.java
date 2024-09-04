// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baasdis20200509.models;

import com.aliyun.tea.*;

public class CreatePersonalDIDRequest extends TeaModel {
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
     * <p>73BUce7y51BlPFxHucfjdOLC9cdWNnPqc7pyXXJe05c2twjraDPwDm1KhmD6v1d7tUyxjYoNhXLdX18zzp5rsogU87</p>
     */
    @NameInMap("OwnerUniqueID")
    public String ownerUniqueID;

    public static CreatePersonalDIDRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePersonalDIDRequest self = new CreatePersonalDIDRequest();
        return TeaModel.build(map, self);
    }

    public CreatePersonalDIDRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreatePersonalDIDRequest setOwnerUniqueID(String ownerUniqueID) {
        this.ownerUniqueID = ownerUniqueID;
        return this;
    }
    public String getOwnerUniqueID() {
        return this.ownerUniqueID;
    }

}
