// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CancelRecycleBinJobResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static CancelRecycleBinJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CancelRecycleBinJobResponseBody self = new CancelRecycleBinJobResponseBody();
        return TeaModel.build(map, self);
    }

    public CancelRecycleBinJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
