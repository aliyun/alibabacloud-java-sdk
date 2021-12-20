// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class UpdateIoTCloudConnectorGroupAttributeRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Description")
    public String description;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("IoTCloudConnectorGroupId")
    public String ioTCloudConnectorGroupId;

    @NameInMap("Name")
    public String name;

    @NameInMap("RegionId")
    public String regionId;

    public static UpdateIoTCloudConnectorGroupAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateIoTCloudConnectorGroupAttributeRequest self = new UpdateIoTCloudConnectorGroupAttributeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateIoTCloudConnectorGroupAttributeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateIoTCloudConnectorGroupAttributeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateIoTCloudConnectorGroupAttributeRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public UpdateIoTCloudConnectorGroupAttributeRequest setIoTCloudConnectorGroupId(String ioTCloudConnectorGroupId) {
        this.ioTCloudConnectorGroupId = ioTCloudConnectorGroupId;
        return this;
    }
    public String getIoTCloudConnectorGroupId() {
        return this.ioTCloudConnectorGroupId;
    }

    public UpdateIoTCloudConnectorGroupAttributeRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateIoTCloudConnectorGroupAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
