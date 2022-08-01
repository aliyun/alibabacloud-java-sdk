// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class SubmitFlowJobResponseBody extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("RequestId")
    public String requestId;

    public static SubmitFlowJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitFlowJobResponseBody self = new SubmitFlowJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitFlowJobResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public SubmitFlowJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
