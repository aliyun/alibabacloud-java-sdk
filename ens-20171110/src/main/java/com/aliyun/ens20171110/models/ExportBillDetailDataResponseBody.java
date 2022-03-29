// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ExportBillDetailDataResponseBody extends TeaModel {
    // 文件下载地址
    @NameInMap("FilePath")
    public String filePath;

    // 请求ID，公共字段
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
