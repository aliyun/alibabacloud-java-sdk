// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class UpdateServiceEntryAttributeRequest extends TeaModel {
    @NameInMap("ServiceId")
    public String serviceId;

    @NameInMap("IoTCloudConnectorId")
    public String ioTCloudConnectorId;

    @NameInMap("ServiceEntryId")
    public String serviceEntryId;

    @NameInMap("ServiceEntryName")
    public String serviceEntryName;

    @NameInMap("ServiceEntryDescription")
    public String serviceEntryDescription;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("RegionId")
    public String regionId;

    public static UpdateServiceEntryAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceEntryAttributeRequest self = new UpdateServiceEntryAttributeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateServiceEntryAttributeRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public UpdateServiceEntryAttributeRequest setIoTCloudConnectorId(String ioTCloudConnectorId) {
        this.ioTCloudConnectorId = ioTCloudConnectorId;
        return this;
    }
    public String getIoTCloudConnectorId() {
        return this.ioTCloudConnectorId;
    }

    public UpdateServiceEntryAttributeRequest setServiceEntryId(String serviceEntryId) {
        this.serviceEntryId = serviceEntryId;
        return this;
    }
    public String getServiceEntryId() {
        return this.serviceEntryId;
    }

    public UpdateServiceEntryAttributeRequest setServiceEntryName(String serviceEntryName) {
        this.serviceEntryName = serviceEntryName;
        return this;
    }
    public String getServiceEntryName() {
        return this.serviceEntryName;
    }

    public UpdateServiceEntryAttributeRequest setServiceEntryDescription(String serviceEntryDescription) {
        this.serviceEntryDescription = serviceEntryDescription;
        return this;
    }
    public String getServiceEntryDescription() {
        return this.serviceEntryDescription;
    }

    public UpdateServiceEntryAttributeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateServiceEntryAttributeRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public UpdateServiceEntryAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
