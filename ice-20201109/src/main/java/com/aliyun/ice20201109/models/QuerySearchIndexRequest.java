// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class QuerySearchIndexRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("IndexType")
    public String indexType;

    @NameInMap("SearchLibName")
    public String searchLibName;

    public static QuerySearchIndexRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySearchIndexRequest self = new QuerySearchIndexRequest();
        return TeaModel.build(map, self);
    }

    public QuerySearchIndexRequest setIndexType(String indexType) {
        this.indexType = indexType;
        return this;
    }
    public String getIndexType() {
        return this.indexType;
    }

    public QuerySearchIndexRequest setSearchLibName(String searchLibName) {
        this.searchLibName = searchLibName;
        return this;
    }
    public String getSearchLibName() {
        return this.searchLibName;
    }

}
