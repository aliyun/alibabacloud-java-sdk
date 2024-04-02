// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DeleteKeywordResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteKeywordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteKeywordResponseBody self = new DeleteKeywordResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteKeywordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
