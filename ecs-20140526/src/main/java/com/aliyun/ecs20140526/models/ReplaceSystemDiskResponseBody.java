// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ReplaceSystemDiskResponseBody extends TeaModel {
    /**
     * <p>The ID of the new system disk.</p>
     */
    @NameInMap("DiskId")
    public String diskId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ReplaceSystemDiskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReplaceSystemDiskResponseBody self = new ReplaceSystemDiskResponseBody();
        return TeaModel.build(map, self);
    }

    public ReplaceSystemDiskResponseBody setDiskId(String diskId) {
        this.diskId = diskId;
        return this;
    }
    public String getDiskId() {
        return this.diskId;
    }

    public ReplaceSystemDiskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
