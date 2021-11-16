// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CheckEngineMetaPartitionRequest extends TeaModel {
    @NameInMap("DataSourceType")
    public String dataSourceType;

    @NameInMap("Partition")
    public String partition;

    @NameInMap("TableGuid")
    public String tableGuid;

    public static CheckEngineMetaPartitionRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckEngineMetaPartitionRequest self = new CheckEngineMetaPartitionRequest();
        return TeaModel.build(map, self);
    }

    public CheckEngineMetaPartitionRequest setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    public CheckEngineMetaPartitionRequest setPartition(String partition) {
        this.partition = partition;
        return this;
    }
    public String getPartition() {
        return this.partition;
    }

    public CheckEngineMetaPartitionRequest setTableGuid(String tableGuid) {
        this.tableGuid = tableGuid;
        return this;
    }
    public String getTableGuid() {
        return this.tableGuid;
    }

}
