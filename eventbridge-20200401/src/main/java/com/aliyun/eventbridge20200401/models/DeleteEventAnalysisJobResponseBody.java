// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class DeleteEventAnalysisJobResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>34AD682D-5B91-5773-8132-AA38C130****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteEventAnalysisJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteEventAnalysisJobResponseBody self = new DeleteEventAnalysisJobResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteEventAnalysisJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
