// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DeleteDcdnSpecificStagingConfigResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDcdnSpecificStagingConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDcdnSpecificStagingConfigResponseBody self = new DeleteDcdnSpecificStagingConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDcdnSpecificStagingConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
