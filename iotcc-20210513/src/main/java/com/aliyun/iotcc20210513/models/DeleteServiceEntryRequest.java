// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class DeleteServiceEntryRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("IoTCloudConnectorId")
    public String ioTCloudConnectorId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ServiceEntryId")
    public String serviceEntryId;

    @NameInMap("ServiceId")
    public String serviceId;

    public static DeleteServiceEntryRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteServiceEntryRequest self = new DeleteServiceEntryRequest();
        return TeaModel.build(map, self);
    }

    public DeleteServiceEntryRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeleteServiceEntryRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public DeleteServiceEntryRequest setIoTCloudConnectorId(String ioTCloudConnectorId) {
        this.ioTCloudConnectorId = ioTCloudConnectorId;
        return this;
    }
    public String getIoTCloudConnectorId() {
        return this.ioTCloudConnectorId;
    }

    public DeleteServiceEntryRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteServiceEntryRequest setServiceEntryId(String serviceEntryId) {
        this.serviceEntryId = serviceEntryId;
        return this;
    }
    public String getServiceEntryId() {
        return this.serviceEntryId;
    }

    public DeleteServiceEntryRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

}
