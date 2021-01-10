// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class UpdateAppVersionStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateAppVersionStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppVersionStatusResponseBody self = new UpdateAppVersionStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAppVersionStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
