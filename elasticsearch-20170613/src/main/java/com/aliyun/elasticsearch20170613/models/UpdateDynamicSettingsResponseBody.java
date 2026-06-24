// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateDynamicSettingsResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the dynamic settings were successfully updated.</p>
     */
    @NameInMap("Result")
    public Boolean result;

    public static UpdateDynamicSettingsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDynamicSettingsResponseBody self = new UpdateDynamicSettingsResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDynamicSettingsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateDynamicSettingsResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
