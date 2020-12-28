// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class ColumnStatisticsDesc extends TeaModel {
    // optional
    @NameInMap("LastAnalyzedTime")
    public Long lastAnalyzedTime;

    // required
    @NameInMap("PartitionName")
    public String partitionName;

    public static ColumnStatisticsDesc build(java.util.Map<String, ?> map) throws Exception {
        ColumnStatisticsDesc self = new ColumnStatisticsDesc();
        return TeaModel.build(map, self);
    }

    public ColumnStatisticsDesc setLastAnalyzedTime(Long lastAnalyzedTime) {
        this.lastAnalyzedTime = lastAnalyzedTime;
        return this;
    }
    public Long getLastAnalyzedTime() {
        return this.lastAnalyzedTime;
    }

    public ColumnStatisticsDesc setPartitionName(String partitionName) {
        this.partitionName = partitionName;
        return this;
    }
    public String getPartitionName() {
        return this.partitionName;
    }

}
