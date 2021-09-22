// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class BatchDeleteWebHostingFilesResponseBody extends TeaModel {
    @NameInMap("Data")
    public Boolean data;

    @NameInMap("RequestId")
    public String requestId;

    public static BatchDeleteWebHostingFilesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteWebHostingFilesResponseBody self = new BatchDeleteWebHostingFilesResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchDeleteWebHostingFilesResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public BatchDeleteWebHostingFilesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
