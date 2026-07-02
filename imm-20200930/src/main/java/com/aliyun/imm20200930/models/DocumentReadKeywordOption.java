// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class DocumentReadKeywordOption extends TeaModel {
    /**
     * <p>The number of keywords. Valid values: 0 to 10.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>Specifies whether to extract keywords.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
