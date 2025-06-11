// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class UpdateUserMFAAuthenticationSettingsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5E6C6049-E9B0-5F6F-A104-6150E3B1F4D7</p>
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
