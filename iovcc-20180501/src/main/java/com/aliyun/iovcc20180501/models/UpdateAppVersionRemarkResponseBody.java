// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class UpdateAppVersionRemarkResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateAppVersionRemarkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppVersionRemarkResponseBody self = new UpdateAppVersionRemarkResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAppVersionRemarkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
