// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220729.models;

import com.aliyun.tea.*;

public class ReClassifyTradeDocumentExtractShrinkRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("PageUpdateInfoModels")
    public String pageUpdateInfoModelsShrink;

    public static ReClassifyTradeDocumentExtractShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ReClassifyTradeDocumentExtractShrinkRequest self = new ReClassifyTradeDocumentExtractShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ReClassifyTradeDocumentExtractShrinkRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public ReClassifyTradeDocumentExtractShrinkRequest setPageUpdateInfoModelsShrink(String pageUpdateInfoModelsShrink) {
        this.pageUpdateInfoModelsShrink = pageUpdateInfoModelsShrink;
        return this;
    }
    public String getPageUpdateInfoModelsShrink() {
        return this.pageUpdateInfoModelsShrink;
    }

}
