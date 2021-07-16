// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class DeleteProblemMeasureResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    public static DeleteProblemMeasureResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteProblemMeasureResponseBody self = new DeleteProblemMeasureResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteProblemMeasureResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
