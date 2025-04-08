// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241111.models;

import com.aliyun.tea.*;

public class GlobalSearchInformation extends TeaModel {
    @NameInMap("searchTime")
    public Long searchTime;

    @NameInMap("total")
    public Long total;

    public static GlobalSearchInformation build(java.util.Map<String, ?> map) throws Exception {
        GlobalSearchInformation self = new GlobalSearchInformation();
        return TeaModel.build(map, self);
    }

    public GlobalSearchInformation setSearchTime(Long searchTime) {
        this.searchTime = searchTime;
        return this;
    }
    public Long getSearchTime() {
        return this.searchTime;
    }

    public GlobalSearchInformation setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

}
