// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class PublishUpgradeTaskResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static PublishUpgradeTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PublishUpgradeTaskResponseBody self = new PublishUpgradeTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public PublishUpgradeTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
