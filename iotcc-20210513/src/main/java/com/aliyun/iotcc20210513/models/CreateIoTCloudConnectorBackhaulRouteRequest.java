// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class CreateIoTCloudConnectorBackhaulRouteRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("IoTCloudConnectorId")
    public String ioTCloudConnectorId;

    @NameInMap("RegionId")
    public String regionId;

    public static CreateIoTCloudConnectorBackhaulRouteRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateIoTCloudConnectorBackhaulRouteRequest self = new CreateIoTCloudConnectorBackhaulRouteRequest();
        return TeaModel.build(map, self);
    }

    public CreateIoTCloudConnectorBackhaulRouteRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateIoTCloudConnectorBackhaulRouteRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateIoTCloudConnectorBackhaulRouteRequest setIoTCloudConnectorId(String ioTCloudConnectorId) {
        this.ioTCloudConnectorId = ioTCloudConnectorId;
        return this;
    }
    public String getIoTCloudConnectorId() {
        return this.ioTCloudConnectorId;
    }

    public CreateIoTCloudConnectorBackhaulRouteRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
