// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eais20190624.models;

import com.aliyun.tea.*;

public class DeleteEaiAllResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteEaiAllResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteEaiAllResponseBody self = new DeleteEaiAllResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteEaiAllResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
