// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ExportBillDetailDataResponseBody extends TeaModel {
    /**
     * <p>The download path of the exported file.</p>
     */
    @NameInMap("FilePath")
    public String filePath;

    /**
     * <p>The ID of the request. This parameter is a common parameter. Each request has a unique ID. You can use the ID to troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ExportBillDetailDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExportBillDetailDataResponseBody self = new ExportBillDetailDataResponseBody();
        return TeaModel.build(map, self);
    }

    public ExportBillDetailDataResponseBody setFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }
    public String getFilePath() {
        return this.filePath;
    }

    public ExportBillDetailDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
