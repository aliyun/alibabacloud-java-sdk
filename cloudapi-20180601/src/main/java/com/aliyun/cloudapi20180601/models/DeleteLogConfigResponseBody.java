// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20180601.models;

import com.aliyun.tea.*;

public class DeleteLogConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteLogConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteLogConfigResponseBody self = new DeleteLogConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteLogConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
