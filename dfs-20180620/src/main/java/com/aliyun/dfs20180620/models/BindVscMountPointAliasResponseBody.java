// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class BindVscMountPointAliasResponseBody extends TeaModel {
    @NameInMap("MountPointAlias")
    public String mountPointAlias;

    @NameInMap("RequestId")
    public String requestId;

    public static BindVscMountPointAliasResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BindVscMountPointAliasResponseBody self = new BindVscMountPointAliasResponseBody();
        return TeaModel.build(map, self);
    }

    public BindVscMountPointAliasResponseBody setMountPointAlias(String mountPointAlias) {
        this.mountPointAlias = mountPointAlias;
        return this;
    }
    public String getMountPointAlias() {
        return this.mountPointAlias;
    }

    public BindVscMountPointAliasResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
