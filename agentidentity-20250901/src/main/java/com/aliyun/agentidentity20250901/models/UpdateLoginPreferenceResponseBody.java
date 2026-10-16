// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class UpdateLoginPreferenceResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>AABD6E03-4B3A-5687-88FF-72232670ED0C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateLoginPreferenceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateLoginPreferenceResponseBody self = new UpdateLoginPreferenceResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateLoginPreferenceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
