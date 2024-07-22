// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateAdminPasswordResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0FA05123-745C-42FD-A69B-AFF48EF9****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Result")
    public Boolean result;

    public static UpdateAdminPasswordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAdminPasswordResponseBody self = new UpdateAdminPasswordResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAdminPasswordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateAdminPasswordResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
