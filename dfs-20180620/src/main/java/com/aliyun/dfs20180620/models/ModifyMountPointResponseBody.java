// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class ModifyMountPointResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyMountPointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyMountPointResponseBody self = new ModifyMountPointResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyMountPointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
