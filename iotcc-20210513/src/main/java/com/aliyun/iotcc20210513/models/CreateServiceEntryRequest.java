// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class CreateServiceEntryRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("IoTCloudConnectorId")
    public String ioTCloudConnectorId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ServiceEntryDescription")
    public String serviceEntryDescription;

    @NameInMap("ServiceEntryName")
    public String serviceEntryName;

    @NameInMap("ServiceId")
    public String serviceId;

    @NameInMap("Target")
    public String target;

    @NameInMap("TargetType")
    public String targetType;

    public static CreateServiceEntryRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceEntryRequest self = new CreateServiceEntryRequest();
        return TeaModel.build(map, self);
    }

    public CreateServiceEntryRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateServiceEntryRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateServiceEntryRequest setIoTCloudConnectorId(String ioTCloudConnectorId) {
        this.ioTCloudConnectorId = ioTCloudConnectorId;
        return this;
    }
    public String getIoTCloudConnectorId() {
        return this.ioTCloudConnectorId;
    }

    public CreateServiceEntryRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateServiceEntryRequest setServiceEntryDescription(String serviceEntryDescription) {
        this.serviceEntryDescription = serviceEntryDescription;
        return this;
    }
    public String getServiceEntryDescription() {
        return this.serviceEntryDescription;
    }

    public CreateServiceEntryRequest setServiceEntryName(String serviceEntryName) {
        this.serviceEntryName = serviceEntryName;
        return this;
    }
    public String getServiceEntryName() {
        return this.serviceEntryName;
    }

    public CreateServiceEntryRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public CreateServiceEntryRequest setTarget(String target) {
        this.target = target;
        return this;
    }
    public String getTarget() {
        return this.target;
    }

    public CreateServiceEntryRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

}
