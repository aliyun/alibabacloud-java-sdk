// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CompleteBoardRecordResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("OssPath")
    @Validation(required = true)
    public String ossPath;

    public static CompleteBoardRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        CompleteBoardRecordResponse self = new CompleteBoardRecordResponse();
        return TeaModel.build(map, self);
    }

    public CompleteBoardRecordResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CompleteBoardRecordResponse setOssPath(String ossPath) {
        this.ossPath = ossPath;
        return this;
    }
    public String getOssPath() {
        return this.ossPath;
    }

}
