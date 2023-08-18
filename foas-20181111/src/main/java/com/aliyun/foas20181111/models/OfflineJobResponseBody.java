// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class OfflineJobResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static OfflineJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OfflineJobResponseBody self = new OfflineJobResponseBody();
        return TeaModel.build(map, self);
    }

    public OfflineJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
