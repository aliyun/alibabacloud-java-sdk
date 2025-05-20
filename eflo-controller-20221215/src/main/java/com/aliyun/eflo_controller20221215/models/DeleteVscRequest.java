// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class DeleteVscRequest extends TeaModel {
    /**
     * <p>Idempotent parameter</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The VscId to be deleted</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vsc-001</p>
     */
    @NameInMap("VscId")
    public String vscId;

    public static DeleteVscRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteVscRequest self = new DeleteVscRequest();
        return TeaModel.build(map, self);
    }

    public DeleteVscRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeleteVscRequest setVscId(String vscId) {
        this.vscId = vscId;
        return this;
    }
    public String getVscId() {
        return this.vscId;
    }

}
