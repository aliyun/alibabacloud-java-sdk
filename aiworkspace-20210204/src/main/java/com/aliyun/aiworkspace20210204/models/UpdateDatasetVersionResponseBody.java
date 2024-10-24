// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class UpdateDatasetVersionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ADF6D849-*****-7E7030F0CE53</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static UpdateDatasetVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDatasetVersionResponseBody self = new UpdateDatasetVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDatasetVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
