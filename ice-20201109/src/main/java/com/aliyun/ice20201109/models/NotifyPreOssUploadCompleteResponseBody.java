// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class NotifyPreOssUploadCompleteResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static NotifyPreOssUploadCompleteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        NotifyPreOssUploadCompleteResponseBody self = new NotifyPreOssUploadCompleteResponseBody();
        return TeaModel.build(map, self);
    }

    public NotifyPreOssUploadCompleteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
