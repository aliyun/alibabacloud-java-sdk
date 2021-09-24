// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CheckEngineMetaPartitionRequest extends TeaModel {
    @NameInMap("TableGuid")
    @Validation(required = true)
    public String tableGuid;

    @NameInMap("Partition")
    @Validation(required = true)
    public String partition;

    @NameInMap("DataSourceType")
    @Validation(required = true)
    public String dataSourceType;

    public static CheckEngineMetaPartitionRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckEngineMetaPartitionRequest self = new CheckEngineMetaPartitionRequest();
        return TeaModel.build(map, self);
    }

    public CheckEngineMetaPartitionRequest setTableGuid(String tableGuid) {
        this.tableGuid = tableGuid;
        return this;
    }
    public String getTableGuid() {
        return this.tableGuid;
    }

    public CheckEngineMetaPartitionRequest setPartition(String partition) {
        this.partition = partition;
        return this;
    }
    public String getPartition() {
        return this.partition;
    }

    public CheckEngineMetaPartitionRequest setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    public String getDataSourceType() {
        return this.dataSourceType;
    }

}
