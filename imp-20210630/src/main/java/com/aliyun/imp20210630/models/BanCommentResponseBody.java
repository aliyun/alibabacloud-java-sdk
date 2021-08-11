// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class BanCommentResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 操作是否成功
    @NameInMap("Result")
    public Boolean result;

    public static BanCommentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BanCommentResponseBody self = new BanCommentResponseBody();
        return TeaModel.build(map, self);
    }

    public BanCommentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BanCommentResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
