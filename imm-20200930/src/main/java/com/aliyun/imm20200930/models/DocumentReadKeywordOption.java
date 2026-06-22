// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class DocumentReadKeywordOption extends TeaModel {
    /**
     * <p>The maximum number of keywords to return.</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>Whether to extract keywords from the document.</p>
     */
    @NameInMap("Extract")
    public Boolean extract;

    public static DocumentReadKeywordOption build(java.util.Map<String, ?> map) throws Exception {
        DocumentReadKeywordOption self = new DocumentReadKeywordOption();
        return TeaModel.build(map, self);
    }

    public DocumentReadKeywordOption setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public DocumentReadKeywordOption setExtract(Boolean extract) {
        this.extract = extract;
        return this;
    }
    public Boolean getExtract() {
        return this.extract;
    }

}
