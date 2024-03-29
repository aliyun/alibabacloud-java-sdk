// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class CreateVscMountPointResponseBody extends TeaModel {
    @NameInMap("MountPointId")
    public String mountPointId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateVscMountPointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateVscMountPointResponseBody self = new CreateVscMountPointResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateVscMountPointResponseBody setMountPointId(String mountPointId) {
        this.mountPointId = mountPointId;
        return this;
    }
    public String getMountPointId() {
        return this.mountPointId;
    }

    public CreateVscMountPointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
