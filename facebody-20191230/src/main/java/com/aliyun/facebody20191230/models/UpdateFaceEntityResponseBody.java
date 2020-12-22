// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class UpdateFaceEntityResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateFaceEntityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateFaceEntityResponseBody self = new UpdateFaceEntityResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateFaceEntityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
