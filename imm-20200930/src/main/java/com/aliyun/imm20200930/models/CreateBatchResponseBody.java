// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateBatchResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>batch-4eb9223f-3e88-42d3-a578-3f2852******</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <strong>example:</strong>
     * <p>EC564A9A-BA5C-4499-A087-D9B9E76E*****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateBatchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateBatchResponseBody self = new CreateBatchResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateBatchResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CreateBatchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
