// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetSpeechLicenseDeviceStatisticsRequest extends TeaModel {
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    public static GetSpeechLicenseDeviceStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSpeechLicenseDeviceStatisticsRequest self = new GetSpeechLicenseDeviceStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public GetSpeechLicenseDeviceStatisticsRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

}
