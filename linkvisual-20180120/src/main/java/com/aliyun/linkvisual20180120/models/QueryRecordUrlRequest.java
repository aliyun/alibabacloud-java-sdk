// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryRecordUrlRequest extends TeaModel {
    @NameInMap("IotId")
    @Validation(required = true)
    public String iotId;

    @NameInMap("FileName")
    @Validation(required = true)
    public String fileName;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    public static QueryRecordUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRecordUrlRequest self = new QueryRecordUrlRequest();
        return TeaModel.build(map, self);
    }

    public QueryRecordUrlRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public QueryRecordUrlRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public QueryRecordUrlRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

}
