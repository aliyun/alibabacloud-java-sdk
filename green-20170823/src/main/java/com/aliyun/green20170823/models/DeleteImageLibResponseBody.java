// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DeleteImageLibResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteImageLibResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteImageLibResponseBody self = new DeleteImageLibResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteImageLibResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
