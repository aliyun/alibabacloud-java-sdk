// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateManualDagResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DagId")
    public Long dagId;

    public static CreateManualDagResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateManualDagResponseBody self = new CreateManualDagResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateManualDagResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateManualDagResponseBody setDagId(Long dagId) {
        this.dagId = dagId;
        return this;
    }
    public Long getDagId() {
        return this.dagId;
    }

}
