// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class UpdateMFAAuthenticationSettingsResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateMFAAuthenticationSettingsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateMFAAuthenticationSettingsResponseBody self = new UpdateMFAAuthenticationSettingsResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateMFAAuthenticationSettingsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
