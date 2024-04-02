// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class UploadImageToLibResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UploadImageToLibResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UploadImageToLibResponseBody self = new UploadImageToLibResponseBody();
        return TeaModel.build(map, self);
    }

    public UploadImageToLibResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
