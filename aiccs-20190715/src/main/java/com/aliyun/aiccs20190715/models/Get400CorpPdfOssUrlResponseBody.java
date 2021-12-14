// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20190715.models;

import com.aliyun.tea.*;

public class Get400CorpPdfOssUrlResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public String data;

    @NameInMap("RequestId")
    public String requestId;

    public static Get400CorpPdfOssUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        Get400CorpPdfOssUrlResponseBody self = new Get400CorpPdfOssUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public Get400CorpPdfOssUrlResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public Get400CorpPdfOssUrlResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public Get400CorpPdfOssUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
