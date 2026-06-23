// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241111.models;

import com.aliyun.tea.*;

public class UnifiedSearchInformation extends TeaModel {
    /**
     * <p>The search duration, in ms.</p>
     * 
     * <strong>example:</strong>
     * <p>1028</p>
     */
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
