// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class RevokeAtiRegistrantRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * <p>If you do not specify this parameter, the system automatically uses the value of RequestId as the value of ClientToken. The value of RequestId may be different for each API request.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJhbGciOiJIUzI1NiIsInR5cC.....</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the real-name registrant.</p>
     * 
     * <strong>example:</strong>
     * <p>2072277378616354816</p>
     */
    @NameInMap("RegistrantId")
    public String registrantId;

    public static RevokeAtiRegistrantRequest build(java.util.Map<String, ?> map) throws Exception {
        RevokeAtiRegistrantRequest self = new RevokeAtiRegistrantRequest();
        return TeaModel.build(map, self);
    }

    public RevokeAtiRegistrantRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public RevokeAtiRegistrantRequest setRegistrantId(String registrantId) {
        this.registrantId = registrantId;
        return this;
    }
    public String getRegistrantId() {
        return this.registrantId;
    }

}
