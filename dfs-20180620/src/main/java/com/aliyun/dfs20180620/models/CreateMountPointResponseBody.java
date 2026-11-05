// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class CreateMountPointResponseBody extends TeaModel {
    /**
     * <p>The mount target ID.</p>
     * 
     * <strong>example:</strong>
     * <p>f-37af8f42f****.cn-hangzhou.dfs.aliyuncs.com</p>
     */
    @NameInMap("MountPointId")
    public String mountPointId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>55C5FFD6-BF99-41BD-9C66-FFF39189****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateMountPointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMountPointResponseBody self = new CreateMountPointResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMountPointResponseBody setMountPointId(String mountPointId) {
        this.mountPointId = mountPointId;
        return this;
    }
    public String getMountPointId() {
        return this.mountPointId;
    }

    public CreateMountPointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
