// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class CreateFederatedCredentialProviderResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>fcp_sada123XXXX</p>
     */
    @NameInMap("FederatedCredentialProviderId")
    public String federatedCredentialProviderId;

    /**
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateFederatedCredentialProviderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateFederatedCredentialProviderResponseBody self = new CreateFederatedCredentialProviderResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateFederatedCredentialProviderResponseBody setFederatedCredentialProviderId(String federatedCredentialProviderId) {
        this.federatedCredentialProviderId = federatedCredentialProviderId;
        return this;
    }
    public String getFederatedCredentialProviderId() {
        return this.federatedCredentialProviderId;
    }

    public CreateFederatedCredentialProviderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
