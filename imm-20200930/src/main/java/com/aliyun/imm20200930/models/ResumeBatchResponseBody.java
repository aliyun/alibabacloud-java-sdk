// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class ResumeBatchResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>D2C628B8-35DF-473C-8A41-757F30******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ResumeBatchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResumeBatchResponseBody self = new ResumeBatchResponseBody();
        return TeaModel.build(map, self);
    }

    public ResumeBatchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
