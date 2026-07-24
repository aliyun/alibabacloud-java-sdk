// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class ConfirmAiAppScanResponseBody extends TeaModel {
    /**
     * <p>The response data.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Data")
    public Boolean data;

    /**
     * <p>The ID assigned by the backend to uniquely identify the request. You can use this ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ConfirmAiAppScanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ConfirmAiAppScanResponseBody self = new ConfirmAiAppScanResponseBody();
        return TeaModel.build(map, self);
    }

    public ConfirmAiAppScanResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public ConfirmAiAppScanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
