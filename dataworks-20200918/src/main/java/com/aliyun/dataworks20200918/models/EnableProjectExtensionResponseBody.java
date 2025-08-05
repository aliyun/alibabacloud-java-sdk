// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class EnableProjectExtensionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static EnableProjectExtensionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableProjectExtensionResponseBody self = new EnableProjectExtensionResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableProjectExtensionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EnableProjectExtensionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
