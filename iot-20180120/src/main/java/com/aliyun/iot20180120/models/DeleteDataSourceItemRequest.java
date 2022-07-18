// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class DeleteDataSourceItemRequest extends TeaModel {
    @NameInMap("DataSourceId")
    public Long dataSourceId;

    @NameInMap("DataSourceItemId")
    public Long dataSourceItemId;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    public static DeleteDataSourceItemRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataSourceItemRequest self = new DeleteDataSourceItemRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDataSourceItemRequest setDataSourceId(Long dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public Long getDataSourceId() {
        return this.dataSourceId;
    }

    public DeleteDataSourceItemRequest setDataSourceItemId(Long dataSourceItemId) {
        this.dataSourceItemId = dataSourceItemId;
        return this;
    }
    public Long getDataSourceItemId() {
        return this.dataSourceItemId;
    }

    public DeleteDataSourceItemRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

}
