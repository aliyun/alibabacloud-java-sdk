// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class DeleteProblemTimelineResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    public static DeleteProblemTimelineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteProblemTimelineResponseBody self = new DeleteProblemTimelineResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteProblemTimelineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
