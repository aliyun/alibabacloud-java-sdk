// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateCnameFlatteningResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>CB1A380B-09F0-41BB-280B-72F8FD6DA2FE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateCnameFlatteningResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateCnameFlatteningResponseBody self = new UpdateCnameFlatteningResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateCnameFlatteningResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
