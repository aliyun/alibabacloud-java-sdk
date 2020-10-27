// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ReplaceSystemDiskResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DiskId")
    @Validation(required = true)
    public String diskId;

    public static ReplaceSystemDiskResponse build(java.util.Map<String, ?> map) throws Exception {
        ReplaceSystemDiskResponse self = new ReplaceSystemDiskResponse();
        return TeaModel.build(map, self);
    }

    public ReplaceSystemDiskResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ReplaceSystemDiskResponse setDiskId(String diskId) {
        this.diskId = diskId;
        return this;
    }
    public String getDiskId() {
        return this.diskId;
    }

}
