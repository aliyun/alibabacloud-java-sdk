// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class CreateApplicationFederatedCredentialResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>afc_asd123daxxxx</p>
     */
    @NameInMap("ApplicationFederatedCredentialId")
    public String applicationFederatedCredentialId;

    /**
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateApplicationFederatedCredentialResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateApplicationFederatedCredentialResponseBody self = new CreateApplicationFederatedCredentialResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateApplicationFederatedCredentialResponseBody setApplicationFederatedCredentialId(String applicationFederatedCredentialId) {
        this.applicationFederatedCredentialId = applicationFederatedCredentialId;
        return this;
    }
    public String getApplicationFederatedCredentialId() {
        return this.applicationFederatedCredentialId;
    }

    public CreateApplicationFederatedCredentialResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
