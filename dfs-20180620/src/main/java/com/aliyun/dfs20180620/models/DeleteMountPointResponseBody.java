// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class DeleteMountPointResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteMountPointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteMountPointResponseBody self = new DeleteMountPointResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteMountPointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
