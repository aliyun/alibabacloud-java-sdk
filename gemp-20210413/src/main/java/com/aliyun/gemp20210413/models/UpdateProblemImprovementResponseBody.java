// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class UpdateProblemImprovementResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    public static UpdateProblemImprovementResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateProblemImprovementResponseBody self = new UpdateProblemImprovementResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateProblemImprovementResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
