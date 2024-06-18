// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class GetClientUserRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>598</p>
     */
    @NameInMap("IdpConfigId")
    public String idpConfigId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Username")
    public String username;

    public static GetClientUserRequest build(java.util.Map<String, ?> map) throws Exception {
        GetClientUserRequest self = new GetClientUserRequest();
        return TeaModel.build(map, self);
    }

    public GetClientUserRequest setIdpConfigId(String idpConfigId) {
        this.idpConfigId = idpConfigId;
        return this;
    }
    public String getIdpConfigId() {
        return this.idpConfigId;
    }

    public GetClientUserRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

}
