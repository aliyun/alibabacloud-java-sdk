// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class UpdateDatasetJobConfigResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>D5BFFEE3-6025-443F-8A03-02D619B5C4B9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateDatasetJobConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDatasetJobConfigResponseBody self = new UpdateDatasetJobConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDatasetJobConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
