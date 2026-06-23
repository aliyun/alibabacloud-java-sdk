// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241111.models;

import com.aliyun.tea.*;

public class UnifiedQueryContext extends TeaModel {
    /**
     * <p>The search engine used.</p>
     * 
     * <strong>example:</strong>
     * <p>Generic</p>
     */
    @NameInMap("engineType")
    public String engineType;

    /**
     * <p>The initial request.</p>
     */
    @NameInMap("originalQuery")
    public UnifiedOriginalQuery originalQuery;

    /**
     * <p>The rewritten result.</p>
     */
    @NameInMap("rewrite")
    public UnifiedRewrite rewrite;

    public static UnifiedQueryContext build(java.util.Map<String, ?> map) throws Exception {
        UnifiedQueryContext self = new UnifiedQueryContext();
        return TeaModel.build(map, self);
    }

    public UnifiedQueryContext setEngineType(String engineType) {
        this.engineType = engineType;
        return this;
    }
    public String getEngineType() {
        return this.engineType;
    }

    public UnifiedQueryContext setOriginalQuery(UnifiedOriginalQuery originalQuery) {
        this.originalQuery = originalQuery;
        return this;
    }
    public UnifiedOriginalQuery getOriginalQuery() {
        return this.originalQuery;
    }

    public UnifiedQueryContext setRewrite(UnifiedRewrite rewrite) {
        this.rewrite = rewrite;
        return this;
    }
    public UnifiedRewrite getRewrite() {
        return this.rewrite;
    }

}
