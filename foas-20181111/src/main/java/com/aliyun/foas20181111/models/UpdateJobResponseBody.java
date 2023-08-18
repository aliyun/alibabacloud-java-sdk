// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class UpdateJobResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateJobResponseBody self = new UpdateJobResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
