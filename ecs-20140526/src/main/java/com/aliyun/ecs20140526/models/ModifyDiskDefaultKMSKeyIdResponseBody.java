// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyDiskDefaultKMSKeyIdResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDiskDefaultKMSKeyIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDiskDefaultKMSKeyIdResponseBody self = new ModifyDiskDefaultKMSKeyIdResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDiskDefaultKMSKeyIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
