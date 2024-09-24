// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CancelRecycleBinJobResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>98696EF0-1607-4E9D-B01D-F20930B6****</p>
     */
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
