// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateWorkbenchEventResultResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 成功标识
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
