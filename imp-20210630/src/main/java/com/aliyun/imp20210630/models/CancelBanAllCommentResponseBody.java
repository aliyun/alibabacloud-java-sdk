// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class CancelBanAllCommentResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 操作成功标识
    @NameInMap("Result")
    public Boolean result;

    public static CancelBanAllCommentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CancelBanAllCommentResponseBody self = new CancelBanAllCommentResponseBody();
        return TeaModel.build(map, self);
    }

    public CancelBanAllCommentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CancelBanAllCommentResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
