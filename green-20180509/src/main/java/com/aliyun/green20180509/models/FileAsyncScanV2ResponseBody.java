// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class FileAsyncScanV2ResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>DA36A1DA-C466-538D-AD52-E64D75597750</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static FileAsyncScanV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FileAsyncScanV2ResponseBody self = new FileAsyncScanV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public FileAsyncScanV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
