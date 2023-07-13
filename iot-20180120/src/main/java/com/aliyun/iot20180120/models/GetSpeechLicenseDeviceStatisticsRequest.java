// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetSpeechLicenseDeviceStatisticsRequest extends TeaModel {
    /**
     * <p>The instance ID. You can view the **ID** of the instance on the **Overview** page in the IoT Platform console.</p>
     * <br>
     * <p>>  If your instance has an ID, you must specify this parameter. Otherwise, the request fails. If no Overview page exists or no instance ID is displayed, you do not need to specify this parameter.</p>
     * <br>
     * <p>For more information, see the [Overview](~~356505~~) topic of IoT instances.</p>
     */
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
