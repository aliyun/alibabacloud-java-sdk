// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DeleteBlackholeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteBlackholeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteBlackholeResponseBody self = new DeleteBlackholeResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteBlackholeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
