// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class RevokeUserSessionRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12345678</p>
     */
    @NameInMap("ExternalIds")
    public String externalIds;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idp-cfg9vcrqylo39c39uxnw</p>
     */
    @NameInMap("IdpId")
    public String idpId;

    public static RevokeUserSessionRequest build(java.util.Map<String, ?> map) throws Exception {
        RevokeUserSessionRequest self = new RevokeUserSessionRequest();
        return TeaModel.build(map, self);
    }

    public RevokeUserSessionRequest setExternalIds(String externalIds) {
        this.externalIds = externalIds;
        return this;
    }
    public String getExternalIds() {
        return this.externalIds;
    }

    public RevokeUserSessionRequest setIdpId(String idpId) {
        this.idpId = idpId;
        return this;
    }
    public String getIdpId() {
        return this.idpId;
    }

}
