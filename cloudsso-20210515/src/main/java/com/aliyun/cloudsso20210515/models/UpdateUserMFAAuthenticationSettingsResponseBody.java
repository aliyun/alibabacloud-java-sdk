// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class UpdateUserMFAAuthenticationSettingsResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateUserMFAAuthenticationSettingsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserMFAAuthenticationSettingsResponseBody self = new UpdateUserMFAAuthenticationSettingsResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateUserMFAAuthenticationSettingsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
