// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class CloneFlowJobResponseBody extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("RequestId")
    public String requestId;

    public static CloneFlowJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CloneFlowJobResponseBody self = new CloneFlowJobResponseBody();
        return TeaModel.build(map, self);
    }

    public CloneFlowJobResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CloneFlowJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
