// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryOTAFirmwareRequest extends TeaModel {
    /**
     * <p>The unique ID of the OTA update package.</p>
     * <br>
     * <p>An update package ID is returned when you call the [CreateOTAFirmware](~~147311~~) operation to create the update package.</p>
     * <br>
     * <p>You can call the [ListOTAFirmware](~~147450~~) operation and view the update package ID in the response.</p>
     */
    @NameInMap("FirmwareId")
    public String firmwareId;

    /**
     * <p>The ID of the instance. You can view the instance **ID** on the **Overview** page in the IoT Platform console.</p>
     * <br>
     * <p>>*   If your instance has an ID, you must configure this parameter. If you do not set this parameter, the call fails.</p>
     * <p>>*   If your instance has no **Overview** page or ID, you do not need to set this parameter.</p>
     * <br>
     * <p>For more information, see [Overview](~~356505~~).</p>
     */
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
