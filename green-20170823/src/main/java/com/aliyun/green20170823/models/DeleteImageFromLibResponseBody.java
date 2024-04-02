// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DeleteImageFromLibResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteImageFromLibResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteImageFromLibResponseBody self = new DeleteImageFromLibResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteImageFromLibResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
