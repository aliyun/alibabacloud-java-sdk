// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class CommitJobResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CommitJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CommitJobResponseBody self = new CommitJobResponseBody();
        return TeaModel.build(map, self);
    }

    public CommitJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
