// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class QuerySearchIndexRequest extends TeaModel {
    /**
     * <p>The category of the index. Valid values:</p>
     * <ul>
     * <li>mm: large visual model.</li>
     * <li>face: face recognition.</li>
     * <li>aiLabel: smart tagging.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mm</p>
     */
    @NameInMap("IndexType")
    public String indexType;

    /**
     * <p>The name of the search library.</p>
     * <ul>
     * <li>If you leave this parameter empty, the search index is created in the default search library of Intelligent Media Service (IMS). Default value: ims-default-search-lib.</li>
     * <li>To query information about an existing search library, call the <a href="https://help.aliyun.com/document_detail/2584455.html">QuerySearchLib</a> API operation.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>test1</p>
     */
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
