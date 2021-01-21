// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceEventPictureRequest extends TeaModel {
    @NameInMap("IotId")
    @Validation(required = true)
    public String iotId;

    @NameInMap("EventId")
    @Validation(required = true)
    public String eventId;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    public static QueryDeviceEventPictureRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceEventPictureRequest self = new QueryDeviceEventPictureRequest();
        return TeaModel.build(map, self);
    }

    public QueryDeviceEventPictureRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public QueryDeviceEventPictureRequest setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public QueryDeviceEventPictureRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

}
