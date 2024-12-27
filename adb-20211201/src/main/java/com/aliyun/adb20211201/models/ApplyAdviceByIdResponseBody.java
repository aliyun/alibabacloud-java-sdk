// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ApplyAdviceByIdResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>5DC10091-348D-12B1-906D-AB49D658012E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ApplyAdviceByIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ApplyAdviceByIdResponseBody self = new ApplyAdviceByIdResponseBody();
        return TeaModel.build(map, self);
    }

    public ApplyAdviceByIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
