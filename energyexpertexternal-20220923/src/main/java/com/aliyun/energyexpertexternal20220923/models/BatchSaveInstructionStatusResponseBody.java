// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class BatchSaveInstructionStatusResponseBody extends TeaModel {
    @NameInMap("data")
    public Boolean data;

    @NameInMap("requestId")
    public String requestId;

    public static BatchSaveInstructionStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchSaveInstructionStatusResponseBody self = new BatchSaveInstructionStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchSaveInstructionStatusResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public BatchSaveInstructionStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
