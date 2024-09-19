// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateFunctionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>12123960-CB2C-5086-868E-C6C1D024XXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UpdateFunctionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateFunctionResponseBody self = new UpdateFunctionResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateFunctionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateFunctionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
