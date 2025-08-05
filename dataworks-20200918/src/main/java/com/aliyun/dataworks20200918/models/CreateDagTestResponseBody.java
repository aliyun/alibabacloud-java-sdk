// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class CreateDagTestResponseBody extends TeaModel {
    @NameInMap("DagId")
    public Long dagId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateDagTestResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDagTestResponseBody self = new CreateDagTestResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDagTestResponseBody setDagId(Long dagId) {
        this.dagId = dagId;
        return this;
    }
    public Long getDagId() {
        return this.dagId;
    }

    public CreateDagTestResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDagTestResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
