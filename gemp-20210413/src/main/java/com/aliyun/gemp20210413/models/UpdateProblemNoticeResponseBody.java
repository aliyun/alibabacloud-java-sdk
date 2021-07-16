// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class UpdateProblemNoticeResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    public static UpdateProblemNoticeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateProblemNoticeResponseBody self = new UpdateProblemNoticeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateProblemNoticeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
