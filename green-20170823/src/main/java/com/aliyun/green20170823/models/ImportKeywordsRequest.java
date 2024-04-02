// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class ImportKeywordsRequest extends TeaModel {
    @NameInMap("KeywordLibId")
    public Integer keywordLibId;

    @NameInMap("KeywordsObject")
    public String keywordsObject;

    public static ImportKeywordsRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportKeywordsRequest self = new ImportKeywordsRequest();
        return TeaModel.build(map, self);
    }

    public ImportKeywordsRequest setKeywordLibId(Integer keywordLibId) {
        this.keywordLibId = keywordLibId;
        return this;
    }
    public Integer getKeywordLibId() {
        return this.keywordLibId;
    }

    public ImportKeywordsRequest setKeywordsObject(String keywordsObject) {
        this.keywordsObject = keywordsObject;
        return this;
    }
    public String getKeywordsObject() {
        return this.keywordsObject;
    }

}
