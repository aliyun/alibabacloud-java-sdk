// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class CreateIdentityProviderStatusCheckJobResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>async_000xxxx</p>
     */
    @NameInMap("IdentityProviderStatusCheckJobId")
    public String identityProviderStatusCheckJobId;

    /**
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateIdentityProviderStatusCheckJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateIdentityProviderStatusCheckJobResponseBody self = new CreateIdentityProviderStatusCheckJobResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateIdentityProviderStatusCheckJobResponseBody setIdentityProviderStatusCheckJobId(String identityProviderStatusCheckJobId) {
        this.identityProviderStatusCheckJobId = identityProviderStatusCheckJobId;
        return this;
    }
    public String getIdentityProviderStatusCheckJobId() {
        return this.identityProviderStatusCheckJobId;
    }

    public CreateIdentityProviderStatusCheckJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
