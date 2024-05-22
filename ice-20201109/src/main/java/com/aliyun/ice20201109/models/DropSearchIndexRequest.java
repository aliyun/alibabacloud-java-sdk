// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DropSearchIndexRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("IndexType")
    public String indexType;

    @NameInMap("SearchLibName")
    public String searchLibName;

    public static DropSearchIndexRequest build(java.util.Map<String, ?> map) throws Exception {
        DropSearchIndexRequest self = new DropSearchIndexRequest();
        return TeaModel.build(map, self);
    }

    public DropSearchIndexRequest setIndexType(String indexType) {
        this.indexType = indexType;
        return this;
    }
    public String getIndexType() {
        return this.indexType;
    }

    public DropSearchIndexRequest setSearchLibName(String searchLibName) {
        this.searchLibName = searchLibName;
        return this;
    }
    public String getSearchLibName() {
        return this.searchLibName;
    }

}
