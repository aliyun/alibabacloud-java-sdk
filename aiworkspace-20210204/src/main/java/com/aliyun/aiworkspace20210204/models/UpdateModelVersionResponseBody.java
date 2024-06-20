// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class UpdateModelVersionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>D5BFFEE3-6025-443F-8A03-02D61***C4B9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateModelVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateModelVersionResponseBody self = new UpdateModelVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateModelVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
