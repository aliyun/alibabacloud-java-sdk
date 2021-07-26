// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class DeleteSetupProjectResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteSetupProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSetupProjectResponseBody self = new DeleteSetupProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSetupProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
