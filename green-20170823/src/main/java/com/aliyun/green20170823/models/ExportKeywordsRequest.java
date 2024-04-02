// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class ExportKeywordsRequest extends TeaModel {
    @NameInMap("KeywordLibId")
    public Long keywordLibId;

    public static ExportKeywordsRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportKeywordsRequest self = new ExportKeywordsRequest();
        return TeaModel.build(map, self);
    }

    public ExportKeywordsRequest setKeywordLibId(Long keywordLibId) {
        this.keywordLibId = keywordLibId;
        return this;
    }
    public Long getKeywordLibId() {
        return this.keywordLibId;
    }

}
