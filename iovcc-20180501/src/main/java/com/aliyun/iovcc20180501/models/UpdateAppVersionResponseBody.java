// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class UpdateAppVersionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateAppVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppVersionResponseBody self = new UpdateAppVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAppVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
