// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class UpdatePartitionColumnStatisticsRequest extends TeaModel {
    @NameInMap("UpdateTablePartitionColumnStatisticsRequest")
    public UpdateTablePartitionColumnStatisticsRequest updateTablePartitionColumnStatisticsRequest;

    public static UpdatePartitionColumnStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePartitionColumnStatisticsRequest self = new UpdatePartitionColumnStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePartitionColumnStatisticsRequest setUpdateTablePartitionColumnStatisticsRequest(UpdateTablePartitionColumnStatisticsRequest updateTablePartitionColumnStatisticsRequest) {
        this.updateTablePartitionColumnStatisticsRequest = updateTablePartitionColumnStatisticsRequest;
        return this;
    }
    public UpdateTablePartitionColumnStatisticsRequest getUpdateTablePartitionColumnStatisticsRequest() {
        return this.updateTablePartitionColumnStatisticsRequest;
    }

}
