// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class AlterSearchIndexResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AlterSearchIndexResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AlterSearchIndexResponseBody self = new AlterSearchIndexResponseBody();
        return TeaModel.build(map, self);
    }

    public AlterSearchIndexResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
