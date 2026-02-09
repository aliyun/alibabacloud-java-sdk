// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241111.models;

import com.aliyun.tea.*;

public class MultimodalSearchBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{
     *     &quot;excludeSites&quot;: &quot;<a href="http://www.360doc.com,weibo.com">www.360doc.com,weibo.com</a>&quot;
     *   }</p>
     */
    @NameInMap("advancedParams")
    public java.util.Map<String, ?> advancedParams;

    @NameInMap("query")
    public String query;

    public static MultimodalSearchBody build(java.util.Map<String, ?> map) throws Exception {
        MultimodalSearchBody self = new MultimodalSearchBody();
        return TeaModel.build(map, self);
    }

    public MultimodalSearchBody setAdvancedParams(java.util.Map<String, ?> advancedParams) {
        this.advancedParams = advancedParams;
        return this;
    }
    public java.util.Map<String, ?> getAdvancedParams() {
        return this.advancedParams;
    }

    public MultimodalSearchBody setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

}
