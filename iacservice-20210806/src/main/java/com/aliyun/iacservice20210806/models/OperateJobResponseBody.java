// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class OperateJobResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    public static OperateJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OperateJobResponseBody self = new OperateJobResponseBody();
        return TeaModel.build(map, self);
    }

    public OperateJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
