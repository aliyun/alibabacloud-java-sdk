// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryRecordByRecordIdRequest extends TeaModel {
    @NameInMap("IotId")
    @Validation(required = true)
    public String iotId;

    @NameInMap("RecordId")
    @Validation(required = true)
    public String recordId;

    public static QueryRecordByRecordIdRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRecordByRecordIdRequest self = new QueryRecordByRecordIdRequest();
        return TeaModel.build(map, self);
    }

    public QueryRecordByRecordIdRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public QueryRecordByRecordIdRequest setRecordId(String recordId) {
        this.recordId = recordId;
        return this;
    }
    public String getRecordId() {
        return this.recordId;
    }

}
