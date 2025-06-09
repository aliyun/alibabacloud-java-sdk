// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class PartitionSummaries extends TeaModel {
    @NameInMap("nextPageToken")
    public String nextPageToken;

    /**
     * <p>Current page of partition profiles</p>
     */
    @NameInMap("partitions")
    public java.util.List<PartitionSummary> partitions;

    public static PartitionSummaries build(java.util.Map<String, ?> map) throws Exception {
        PartitionSummaries self = new PartitionSummaries();
        return TeaModel.build(map, self);
    }

    public PartitionSummaries setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public PartitionSummaries setPartitions(java.util.List<PartitionSummary> partitions) {
        this.partitions = partitions;
        return this;
    }
    public java.util.List<PartitionSummary> getPartitions() {
        return this.partitions;
    }

}
