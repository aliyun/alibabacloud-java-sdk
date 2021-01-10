// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CompleteBoardRecordResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("OssPath")
    public String ossPath;

    public static CompleteBoardRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CompleteBoardRecordResponseBody self = new CompleteBoardRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public CompleteBoardRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CompleteBoardRecordResponseBody setOssPath(String ossPath) {
        this.ossPath = ossPath;
        return this;
    }
    public String getOssPath() {
        return this.ossPath;
    }

}
