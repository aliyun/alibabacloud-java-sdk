// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DataSessionStatClientStatsValue extends TeaModel {
    /**
     * <p>The number of clients whose IP addresses are active.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ActiveCount")
    public Long activeCount;

    /**
     * <p>The total number of IP addresses of clients.</p>
     * 
     * <strong>example:</strong>
     * <p>11</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DataSessionStatClientStatsValue build(java.util.Map<String, ?> map) throws Exception {
        DataSessionStatClientStatsValue self = new DataSessionStatClientStatsValue();
        return TeaModel.build(map, self);
    }

    public DataSessionStatClientStatsValue setActiveCount(Long activeCount) {
        this.activeCount = activeCount;
        return this;
    }
    public Long getActiveCount() {
        return this.activeCount;
    }

    public DataSessionStatClientStatsValue setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
