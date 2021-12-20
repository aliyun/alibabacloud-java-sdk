// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class AddIoTCloudConnectorToGroupRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("IoTCloudConnectorGroupId")
    public String ioTCloudConnectorGroupId;

    @NameInMap("IoTCloudConnectorId")
    public java.util.List<String> ioTCloudConnectorId;

    @NameInMap("RegionId")
    public String regionId;

    public static AddIoTCloudConnectorToGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        AddIoTCloudConnectorToGroupRequest self = new AddIoTCloudConnectorToGroupRequest();
        return TeaModel.build(map, self);
    }

    public AddIoTCloudConnectorToGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AddIoTCloudConnectorToGroupRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public AddIoTCloudConnectorToGroupRequest setIoTCloudConnectorGroupId(String ioTCloudConnectorGroupId) {
        this.ioTCloudConnectorGroupId = ioTCloudConnectorGroupId;
        return this;
    }
    public String getIoTCloudConnectorGroupId() {
        return this.ioTCloudConnectorGroupId;
    }

    public AddIoTCloudConnectorToGroupRequest setIoTCloudConnectorId(java.util.List<String> ioTCloudConnectorId) {
        this.ioTCloudConnectorId = ioTCloudConnectorId;
        return this;
    }
    public java.util.List<String> getIoTCloudConnectorId() {
        return this.ioTCloudConnectorId;
    }

    public AddIoTCloudConnectorToGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
