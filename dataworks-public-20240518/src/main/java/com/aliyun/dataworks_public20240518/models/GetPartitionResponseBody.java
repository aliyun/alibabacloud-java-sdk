// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetPartitionResponseBody extends TeaModel {
    @NameInMap("Partition")
    public Partition partition;

    /**
     * <strong>example:</strong>
     * <p>D1E2E5BC-xxxx-xxxx-xxxx-xxxxxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetPartitionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPartitionResponseBody self = new GetPartitionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPartitionResponseBody setPartition(Partition partition) {
        this.partition = partition;
        return this;
    }
    public Partition getPartition() {
        return this.partition;
    }

    public GetPartitionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPartitionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
