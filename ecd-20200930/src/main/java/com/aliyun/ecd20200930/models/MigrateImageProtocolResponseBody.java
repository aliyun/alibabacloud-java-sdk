// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class MigrateImageProtocolResponseBody extends TeaModel {
    /**
     * <p>The IDs of the images whose protocols failed to be updated.</p>
     */
    @NameInMap("FailedIds")
    public java.util.List<String> failedIds;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static MigrateImageProtocolResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MigrateImageProtocolResponseBody self = new MigrateImageProtocolResponseBody();
        return TeaModel.build(map, self);
    }

    public MigrateImageProtocolResponseBody setFailedIds(java.util.List<String> failedIds) {
        this.failedIds = failedIds;
        return this;
    }
    public java.util.List<String> getFailedIds() {
        return this.failedIds;
    }

    public MigrateImageProtocolResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
