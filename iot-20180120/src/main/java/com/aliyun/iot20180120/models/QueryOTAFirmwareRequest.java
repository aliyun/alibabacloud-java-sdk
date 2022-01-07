// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryOTAFirmwareRequest extends TeaModel {
    @NameInMap("FirmwareId")
    public String firmwareId;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    public static QueryOTAFirmwareRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryOTAFirmwareRequest self = new QueryOTAFirmwareRequest();
        return TeaModel.build(map, self);
    }

    public QueryOTAFirmwareRequest setFirmwareId(String firmwareId) {
        this.firmwareId = firmwareId;
        return this;
    }
    public String getFirmwareId() {
        return this.firmwareId;
    }

    public QueryOTAFirmwareRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

}
