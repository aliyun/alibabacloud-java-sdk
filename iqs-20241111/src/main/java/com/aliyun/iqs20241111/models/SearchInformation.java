// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241111.models;

import com.aliyun.tea.*;

public class SearchInformation extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>700</p>
     */
    @NameInMap("searchTime")
    public Long searchTime;

    /**
     * <strong>example:</strong>
     * <p>13</p>
     */
    @NameInMap("total")
    public Long total;

    public static SearchInformation build(java.util.Map<String, ?> map) throws Exception {
        SearchInformation self = new SearchInformation();
        return TeaModel.build(map, self);
    }

    public SearchInformation setSearchTime(Long searchTime) {
        this.searchTime = searchTime;
        return this;
    }
    public Long getSearchTime() {
        return this.searchTime;
    }

    public SearchInformation setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

}
