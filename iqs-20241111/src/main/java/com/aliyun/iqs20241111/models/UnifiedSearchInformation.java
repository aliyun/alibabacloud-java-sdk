// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241111.models;

import com.aliyun.tea.*;

public class UnifiedSearchInformation extends TeaModel {
    @NameInMap("searchTime")
    public Long searchTime;

    public static UnifiedSearchInformation build(java.util.Map<String, ?> map) throws Exception {
        UnifiedSearchInformation self = new UnifiedSearchInformation();
        return TeaModel.build(map, self);
    }

    public UnifiedSearchInformation setSearchTime(Long searchTime) {
        this.searchTime = searchTime;
        return this;
    }
    public Long getSearchTime() {
        return this.searchTime;
    }

}
