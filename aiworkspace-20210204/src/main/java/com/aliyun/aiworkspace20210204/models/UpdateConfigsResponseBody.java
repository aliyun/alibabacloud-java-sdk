// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class UpdateConfigsResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateConfigsResponseBody self = new UpdateConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateConfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
