// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceEventRecordRequest extends TeaModel {
    @NameInMap("IotId")
    @Validation(required = true)
    public String iotId;

    @NameInMap("EventId")
    @Validation(required = true)
    public String eventId;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    public static QueryDeviceEventRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceEventRecordRequest self = new QueryDeviceEventRecordRequest();
        return TeaModel.build(map, self);
    }

    public QueryDeviceEventRecordRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public QueryDeviceEventRecordRequest setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public QueryDeviceEventRecordRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

}
