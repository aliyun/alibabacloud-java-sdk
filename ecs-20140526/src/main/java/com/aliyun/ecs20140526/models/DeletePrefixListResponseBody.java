// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeletePrefixListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeletePrefixListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeletePrefixListResponseBody self = new DeletePrefixListResponseBody();
        return TeaModel.build(map, self);
    }

    public DeletePrefixListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
