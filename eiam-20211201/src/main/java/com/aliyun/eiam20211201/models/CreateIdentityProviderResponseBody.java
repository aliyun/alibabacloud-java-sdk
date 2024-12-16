// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class CreateIdentityProviderResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>idp_mwpcwnhrimlr2horxXXXX</p>
     */
    @NameInMap("IdentityProviderId")
    public String identityProviderId;

    /**
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateIdentityProviderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateIdentityProviderResponseBody self = new CreateIdentityProviderResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateIdentityProviderResponseBody setIdentityProviderId(String identityProviderId) {
        this.identityProviderId = identityProviderId;
        return this;
    }
    public String getIdentityProviderId() {
        return this.identityProviderId;
    }

    public CreateIdentityProviderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
