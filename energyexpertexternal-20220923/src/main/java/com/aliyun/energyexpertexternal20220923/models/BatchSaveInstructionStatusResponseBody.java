// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class BatchSaveInstructionStatusResponseBody extends TeaModel {
    /**
     * <p>true</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("data")
    public Boolean data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>83A5A7DD-8974-5769-952E-590A97BEA34E</p>
     */
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
