// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241111.models;

import com.aliyun.tea.*;

public class MultimodalSearchBody extends TeaModel {
    /**
     * <p>The additional query items, such as blocked sites.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;excludeSites&quot;: &quot;<a href="http://www.360doc.com,weibo.com">www.360doc.com,weibo.com</a>&quot;
     *   }</p>
     */
    @NameInMap("advancedParams")
    public java.util.Map<String, ?> advancedParams;

    /**
     * <p>The search engine type.</p>
     * 
     * <strong>example:</strong>
     * <p>Generic</p>
     */
    @NameInMap("engineType")
    public String engineType;

    /**
     * <p>The query content.</p>
     * 
     * <strong>example:</strong>
     * <p>Alibaba</p>
     */
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

    public MultimodalSearchBody setEngineType(String engineType) {
        this.engineType = engineType;
        return this;
    }
    public String getEngineType() {
        return this.engineType;
    }

    public MultimodalSearchBody setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

}
