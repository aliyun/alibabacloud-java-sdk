// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateDataSourceItemRequest extends TeaModel {
    @NameInMap("DataSourceId")
    public Long dataSourceId;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("Topic")
    public String topic;

    public static CreateDataSourceItemRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDataSourceItemRequest self = new CreateDataSourceItemRequest();
        return TeaModel.build(map, self);
    }

    public CreateDataSourceItemRequest setDataSourceId(Long dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public Long getDataSourceId() {
        return this.dataSourceId;
    }

    public CreateDataSourceItemRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public CreateDataSourceItemRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

}
