// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class ConfirmIoTCloudConnectorRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("ConfirmStatus")
    public String confirmStatus;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("IoTCloudConnectorId")
    public String ioTCloudConnectorId;

    @NameInMap("RegionId")
    public String regionId;

    public static ConfirmIoTCloudConnectorRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfirmIoTCloudConnectorRequest self = new ConfirmIoTCloudConnectorRequest();
        return TeaModel.build(map, self);
    }

    public ConfirmIoTCloudConnectorRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ConfirmIoTCloudConnectorRequest setConfirmStatus(String confirmStatus) {
        this.confirmStatus = confirmStatus;
        return this;
    }
    public String getConfirmStatus() {
        return this.confirmStatus;
    }

    public ConfirmIoTCloudConnectorRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public ConfirmIoTCloudConnectorRequest setIoTCloudConnectorId(String ioTCloudConnectorId) {
        this.ioTCloudConnectorId = ioTCloudConnectorId;
        return this;
    }
    public String getIoTCloudConnectorId() {
        return this.ioTCloudConnectorId;
    }

    public ConfirmIoTCloudConnectorRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
