// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class QuerySearchLibRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SearchLibName")
    public String searchLibName;

    public static QuerySearchLibRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySearchLibRequest self = new QuerySearchLibRequest();
        return TeaModel.build(map, self);
    }

    public QuerySearchLibRequest setSearchLibName(String searchLibName) {
        this.searchLibName = searchLibName;
        return this;
    }
    public String getSearchLibName() {
        return this.searchLibName;
    }

}
