// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateWorkbenchEventResultResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UpdateWorkbenchEventResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkbenchEventResultResponseBody self = new UpdateWorkbenchEventResultResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateWorkbenchEventResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateWorkbenchEventResultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
