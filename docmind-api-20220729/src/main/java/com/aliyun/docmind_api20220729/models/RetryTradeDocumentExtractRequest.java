// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220729.models;

import com.aliyun.tea.*;

public class RetryTradeDocumentExtractRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    public static RetryTradeDocumentExtractRequest build(java.util.Map<String, ?> map) throws Exception {
        RetryTradeDocumentExtractRequest self = new RetryTradeDocumentExtractRequest();
        return TeaModel.build(map, self);
    }

    public RetryTradeDocumentExtractRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

}
