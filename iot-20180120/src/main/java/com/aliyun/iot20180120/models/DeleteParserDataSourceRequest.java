// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class DeleteParserDataSourceRequest extends TeaModel {
    @NameInMap("DataSourceId")
    public Long dataSourceId;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    public static DeleteParserDataSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteParserDataSourceRequest self = new DeleteParserDataSourceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteParserDataSourceRequest setDataSourceId(Long dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public Long getDataSourceId() {
        return this.dataSourceId;
    }

    public DeleteParserDataSourceRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

}
