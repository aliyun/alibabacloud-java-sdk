// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class DeleteVscMountPointResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteVscMountPointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteVscMountPointResponseBody self = new DeleteVscMountPointResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteVscMountPointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
