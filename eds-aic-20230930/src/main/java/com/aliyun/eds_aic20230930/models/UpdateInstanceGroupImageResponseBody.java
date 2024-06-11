// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class UpdateInstanceGroupImageResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateInstanceGroupImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceGroupImageResponseBody self = new UpdateInstanceGroupImageResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceGroupImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
