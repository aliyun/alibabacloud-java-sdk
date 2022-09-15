// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class UploadPCACertResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UploadPCACertResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UploadPCACertResponseBody self = new UploadPCACertResponseBody();
        return TeaModel.build(map, self);
    }

    public UploadPCACertResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
