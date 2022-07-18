// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class DetachParserDataSourceRequest extends TeaModel {
    @NameInMap("DataSourceId")
    public Long dataSourceId;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("ParserId")
    public Long parserId;

    public static DetachParserDataSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        DetachParserDataSourceRequest self = new DetachParserDataSourceRequest();
        return TeaModel.build(map, self);
    }

    public DetachParserDataSourceRequest setDataSourceId(Long dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public Long getDataSourceId() {
        return this.dataSourceId;
    }

    public DetachParserDataSourceRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public DetachParserDataSourceRequest setParserId(Long parserId) {
        this.parserId = parserId;
        return this;
    }
    public Long getParserId() {
        return this.parserId;
    }

}
