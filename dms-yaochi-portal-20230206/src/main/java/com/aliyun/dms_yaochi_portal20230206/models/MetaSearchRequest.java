// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_yaochi_portal20230206.models;

import com.aliyun.tea.*;

public class MetaSearchRequest extends TeaModel {
    @NameInMap("Limit")
    public Long limit;

    @NameInMap("SearchKey")
    public String searchKey;

    @NameInMap("Start")
    public Long start;

    public static MetaSearchRequest build(java.util.Map<String, ?> map) throws Exception {
        MetaSearchRequest self = new MetaSearchRequest();
        return TeaModel.build(map, self);
    }

    public MetaSearchRequest setLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    public Long getLimit() {
        return this.limit;
    }

    public MetaSearchRequest setSearchKey(String searchKey) {
        this.searchKey = searchKey;
        return this;
    }
    public String getSearchKey() {
        return this.searchKey;
    }

    public MetaSearchRequest setStart(Long start) {
        this.start = start;
        return this;
    }
    public Long getStart() {
        return this.start;
    }

}
