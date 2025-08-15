// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class DescribeScenesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ak</p>
     */
    @NameInMap("SearchCode")
    public String searchCode;

    public static DescribeScenesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeScenesRequest self = new DescribeScenesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeScenesRequest setSearchCode(String searchCode) {
        this.searchCode = searchCode;
        return this;
    }
    public String getSearchCode() {
        return this.searchCode;
    }

}
