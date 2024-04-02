// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DeleteKeywordLibResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteKeywordLibResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteKeywordLibResponseBody self = new DeleteKeywordLibResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteKeywordLibResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
