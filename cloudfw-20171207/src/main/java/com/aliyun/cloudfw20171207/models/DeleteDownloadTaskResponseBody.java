// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DeleteDownloadTaskResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>064022A8-F415-572C-B3C1-657152833F11</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDownloadTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDownloadTaskResponseBody self = new DeleteDownloadTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDownloadTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
