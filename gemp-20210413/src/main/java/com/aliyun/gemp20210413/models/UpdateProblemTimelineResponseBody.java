// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class UpdateProblemTimelineResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    public static UpdateProblemTimelineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateProblemTimelineResponseBody self = new UpdateProblemTimelineResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateProblemTimelineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
