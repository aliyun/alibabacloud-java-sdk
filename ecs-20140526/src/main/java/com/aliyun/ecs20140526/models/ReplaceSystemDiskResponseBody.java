// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ReplaceSystemDiskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DiskId")
    public String diskId;

    public static ReplaceSystemDiskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReplaceSystemDiskResponseBody self = new ReplaceSystemDiskResponseBody();
        return TeaModel.build(map, self);
    }

    public ReplaceSystemDiskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ReplaceSystemDiskResponseBody setDiskId(String diskId) {
        this.diskId = diskId;
        return this;
    }
    public String getDiskId() {
        return this.diskId;
    }

}
