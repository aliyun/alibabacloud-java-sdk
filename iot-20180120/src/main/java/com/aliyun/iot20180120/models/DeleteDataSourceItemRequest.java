// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class DeleteDataSourceItemRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1001</p>
     */
    @NameInMap("DataSourceId")
    public Long dataSourceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>129322</p>
     */
    @NameInMap("DataSourceItemId")
    public Long dataSourceItemId;

    /**
     * <strong>example:</strong>
     * <p>iot-0pp1n8t****</p>
     */
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
