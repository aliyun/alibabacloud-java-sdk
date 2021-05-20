// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateNodeRunModeResponseBody extends TeaModel {
    @NameInMap("Success")
    public Boolean success;

    @NameInMap("RequestId")
    public String requestId;

    public static UpdateNodeRunModeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateNodeRunModeResponseBody self = new UpdateNodeRunModeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateNodeRunModeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public UpdateNodeRunModeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
