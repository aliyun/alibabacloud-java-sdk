// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class DisableProjectExtensionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DisableProjectExtensionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableProjectExtensionResponseBody self = new DisableProjectExtensionResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableProjectExtensionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DisableProjectExtensionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
