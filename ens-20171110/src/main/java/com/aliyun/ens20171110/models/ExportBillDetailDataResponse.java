// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ExportBillDetailDataResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("FilePath")
    @Validation(required = true)
    public String filePath;

    public static ExportBillDetailDataResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportBillDetailDataResponse self = new ExportBillDetailDataResponse();
        return TeaModel.build(map, self);
    }

    public ExportBillDetailDataResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExportBillDetailDataResponse setFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }
    public String getFilePath() {
        return this.filePath;
    }

}
