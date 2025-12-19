// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class DeleteAPIKeyCredentialProviderResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2A48EB1D-D645-5758-91AF-EDF8E36E257B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteAPIKeyCredentialProviderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAPIKeyCredentialProviderResponseBody self = new DeleteAPIKeyCredentialProviderResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAPIKeyCredentialProviderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
