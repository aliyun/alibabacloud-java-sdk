// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class StopTriggeredRecordRequest extends TeaModel {
    @NameInMap("IotId")
    @Validation(required = true)
    public String iotId;

    @NameInMap("RecordId")
    @Validation(required = true)
    public String recordId;

    public static StopTriggeredRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        StopTriggeredRecordRequest self = new StopTriggeredRecordRequest();
        return TeaModel.build(map, self);
    }

    public StopTriggeredRecordRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public StopTriggeredRecordRequest setRecordId(String recordId) {
        this.recordId = recordId;
        return this;
    }
    public String getRecordId() {
        return this.recordId;
    }

}
