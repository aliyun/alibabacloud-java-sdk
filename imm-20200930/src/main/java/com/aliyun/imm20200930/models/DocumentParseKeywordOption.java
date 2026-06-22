// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class DocumentParseKeywordOption extends TeaModel {
    /**
     * <p>The number of keywords to extract. The value must be an integer from 0 to 10.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>Specifies whether to extract keywords.</p>
     */
    @NameInMap("Extract")
    public Boolean extract;

    public static DocumentParseKeywordOption build(java.util.Map<String, ?> map) throws Exception {
        DocumentParseKeywordOption self = new DocumentParseKeywordOption();
        return TeaModel.build(map, self);
    }

    public DocumentParseKeywordOption setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public DocumentParseKeywordOption setExtract(Boolean extract) {
        this.extract = extract;
        return this;
    }
    public Boolean getExtract() {
        return this.extract;
    }

}
