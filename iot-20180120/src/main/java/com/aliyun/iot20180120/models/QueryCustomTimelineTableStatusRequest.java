// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryCustomTimelineTableStatusRequest extends TeaModel {
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("TableName")
    public String tableName;

    public static QueryCustomTimelineTableStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCustomTimelineTableStatusRequest self = new QueryCustomTimelineTableStatusRequest();
        return TeaModel.build(map, self);
    }

    public QueryCustomTimelineTableStatusRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public QueryCustomTimelineTableStatusRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

}
