// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class UpdateFaceConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateFaceConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateFaceConfigResponseBody self = new UpdateFaceConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateFaceConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
