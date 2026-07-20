// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class ListPartitionsByNamesResponseBody extends TeaModel {
    /**
     * <p>The partitions.</p>
     */
    @NameInMap("partitions")
    public java.util.List<Partition> partitions;

    public static ListPartitionsByNamesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPartitionsByNamesResponseBody self = new ListPartitionsByNamesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPartitionsByNamesResponseBody setPartitions(java.util.List<Partition> partitions) {
        this.partitions = partitions;
        return this;
    }
    public java.util.List<Partition> getPartitions() {
        return this.partitions;
    }

}
