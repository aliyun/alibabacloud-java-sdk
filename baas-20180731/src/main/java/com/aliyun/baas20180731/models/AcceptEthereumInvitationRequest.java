// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class AcceptEthereumInvitationRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Token")
    public String token;

    public static AcceptEthereumInvitationRequest build(java.util.Map<String, ?> map) throws Exception {
        AcceptEthereumInvitationRequest self = new AcceptEthereumInvitationRequest();
        return TeaModel.build(map, self);
    }

    public AcceptEthereumInvitationRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AcceptEthereumInvitationRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
