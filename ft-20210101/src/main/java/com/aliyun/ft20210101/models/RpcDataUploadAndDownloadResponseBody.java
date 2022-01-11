// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20210101.models;

import com.aliyun.tea.*;

public class RpcDataUploadAndDownloadResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static RpcDataUploadAndDownloadResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RpcDataUploadAndDownloadResponseBody self = new RpcDataUploadAndDownloadResponseBody();
        return TeaModel.build(map, self);
    }

    public RpcDataUploadAndDownloadResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
