// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_yaochi_portal20230206.models;

import com.aliyun.tea.*;

public class MetaDatabaseSearchRequest extends TeaModel {
    @NameInMap("Limit")
    public Long limit;

    @NameInMap("SearchKey")
    public String searchKey;

    @NameInMap("Start")
    public Long start;

    public static MetaDatabaseSearchRequest build(java.util.Map<String, ?> map) throws Exception {
        MetaDatabaseSearchRequest self = new MetaDatabaseSearchRequest();
        return TeaModel.build(map, self);
    }

    public MetaDatabaseSearchRequest setLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    public Long getLimit() {
        return this.limit;
    }

    public MetaDatabaseSearchRequest setSearchKey(String searchKey) {
        this.searchKey = searchKey;
        return this;
    }
    public String getSearchKey() {
        return this.searchKey;
    }

    public MetaDatabaseSearchRequest setStart(Long start) {
        this.start = start;
        return this;
    }
    public Long getStart() {
        return this.start;
    }

}
