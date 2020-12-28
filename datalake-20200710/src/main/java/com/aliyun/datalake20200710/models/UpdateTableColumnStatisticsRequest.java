// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class UpdateTableColumnStatisticsRequest extends TeaModel {
    @NameInMap("UpdateTablePartitionColumnStatisticsRequest")
    public UpdateTablePartitionColumnStatisticsRequest updateTablePartitionColumnStatisticsRequest;

    public static UpdateTableColumnStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTableColumnStatisticsRequest self = new UpdateTableColumnStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTableColumnStatisticsRequest setUpdateTablePartitionColumnStatisticsRequest(UpdateTablePartitionColumnStatisticsRequest updateTablePartitionColumnStatisticsRequest) {
        this.updateTablePartitionColumnStatisticsRequest = updateTablePartitionColumnStatisticsRequest;
        return this;
    }
    public UpdateTablePartitionColumnStatisticsRequest getUpdateTablePartitionColumnStatisticsRequest() {
        return this.updateTablePartitionColumnStatisticsRequest;
    }

}
