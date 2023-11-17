// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DataSessionStatDbStatsValue extends TeaModel {
    /**
     * <p>The number of active namespaces.</p>
     */
    @NameInMap("ActiveCount")
    public Long activeCount;

    /**
     * <p>The total number of namespaces.</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DataSessionStatDbStatsValue build(java.util.Map<String, ?> map) throws Exception {
        DataSessionStatDbStatsValue self = new DataSessionStatDbStatsValue();
        return TeaModel.build(map, self);
    }

    public DataSessionStatDbStatsValue setActiveCount(Long activeCount) {
        this.activeCount = activeCount;
        return this;
    }
    public Long getActiveCount() {
        return this.activeCount;
    }

    public DataSessionStatDbStatsValue setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
