// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hcs_mgw20240626.models;

import com.aliyun.tea.*;

public class LastModifyFilterItem extends TeaModel {
    @NameInMap("TimeFilter")
    public java.util.List<TimeFilter> timeFilter;

    public static LastModifyFilterItem build(java.util.Map<String, ?> map) throws Exception {
        LastModifyFilterItem self = new LastModifyFilterItem();
        return TeaModel.build(map, self);
    }

    public LastModifyFilterItem setTimeFilter(java.util.List<TimeFilter> timeFilter) {
        this.timeFilter = timeFilter;
        return this;
    }
    public java.util.List<TimeFilter> getTimeFilter() {
        return this.timeFilter;
    }

}
