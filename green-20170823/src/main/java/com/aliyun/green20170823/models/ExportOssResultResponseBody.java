// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class ExportOssResultResponseBody extends TeaModel {
    @NameInMap("FileUrl")
    public String fileUrl;

    @NameInMap("RequestId")
    public String requestId;

    public static ExportOssResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExportOssResultResponseBody self = new ExportOssResultResponseBody();
        return TeaModel.build(map, self);
    }

    public ExportOssResultResponseBody setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public ExportOssResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
