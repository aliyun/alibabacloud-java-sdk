// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DeleteSpecificStagingConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteSpecificStagingConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSpecificStagingConfigResponseBody self = new DeleteSpecificStagingConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSpecificStagingConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
