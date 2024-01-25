// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eipanycast20200309.models;

import com.aliyun.tea.*;

public class ReleaseAnycastEipAddressRequest extends TeaModel {
    /**
     * <p>The ID of the Anycast EIP to be released.</p>
     */
    @NameInMap("AnycastId")
    public String anycastId;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    public static ReleaseAnycastEipAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        ReleaseAnycastEipAddressRequest self = new ReleaseAnycastEipAddressRequest();
        return TeaModel.build(map, self);
    }

    public ReleaseAnycastEipAddressRequest setAnycastId(String anycastId) {
        this.anycastId = anycastId;
        return this;
    }
    public String getAnycastId() {
        return this.anycastId;
    }

    public ReleaseAnycastEipAddressRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
