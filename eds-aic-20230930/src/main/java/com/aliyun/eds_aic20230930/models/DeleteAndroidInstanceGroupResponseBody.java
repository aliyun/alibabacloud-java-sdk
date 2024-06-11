// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DeleteAndroidInstanceGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteAndroidInstanceGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAndroidInstanceGroupResponseBody self = new DeleteAndroidInstanceGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAndroidInstanceGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
