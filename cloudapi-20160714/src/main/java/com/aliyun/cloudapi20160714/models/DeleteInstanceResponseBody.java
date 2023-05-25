// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DeleteInstanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteInstanceResponseBody self = new DeleteInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
