// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateManualDagResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DagId")
    @Validation(required = true)
    public Long dagId;

    public static CreateManualDagResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateManualDagResponse self = new CreateManualDagResponse();
        return TeaModel.build(map, self);
    }

    public CreateManualDagResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateManualDagResponse setDagId(Long dagId) {
        this.dagId = dagId;
        return this;
    }
    public Long getDagId() {
        return this.dagId;
    }

}
