// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class UpdateConnectionPoolAttributeRequest extends TeaModel {
    @NameInMap("Cidrs")
    public java.util.List<String> cidrs;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("ConnectionPoolDescription")
    public String connectionPoolDescription;

    @NameInMap("ConnectionPoolId")
    public String connectionPoolId;

    @NameInMap("ConnectionPoolName")
    public String connectionPoolName;

    @NameInMap("Count")
    public Long count;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("IoTCloudConnectorId")
    public String ioTCloudConnectorId;

    @NameInMap("RegionId")
    public String regionId;

    public static UpdateConnectionPoolAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateConnectionPoolAttributeRequest self = new UpdateConnectionPoolAttributeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateConnectionPoolAttributeRequest setCidrs(java.util.List<String> cidrs) {
        this.cidrs = cidrs;
        return this;
    }
    public java.util.List<String> getCidrs() {
        return this.cidrs;
    }

    public UpdateConnectionPoolAttributeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateConnectionPoolAttributeRequest setConnectionPoolDescription(String connectionPoolDescription) {
        this.connectionPoolDescription = connectionPoolDescription;
        return this;
    }
    public String getConnectionPoolDescription() {
        return this.connectionPoolDescription;
    }

    public UpdateConnectionPoolAttributeRequest setConnectionPoolId(String connectionPoolId) {
        this.connectionPoolId = connectionPoolId;
        return this;
    }
    public String getConnectionPoolId() {
        return this.connectionPoolId;
    }

    public UpdateConnectionPoolAttributeRequest setConnectionPoolName(String connectionPoolName) {
        this.connectionPoolName = connectionPoolName;
        return this;
    }
    public String getConnectionPoolName() {
        return this.connectionPoolName;
    }

    public UpdateConnectionPoolAttributeRequest setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public UpdateConnectionPoolAttributeRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public UpdateConnectionPoolAttributeRequest setIoTCloudConnectorId(String ioTCloudConnectorId) {
        this.ioTCloudConnectorId = ioTCloudConnectorId;
        return this;
    }
    public String getIoTCloudConnectorId() {
        return this.ioTCloudConnectorId;
    }

    public UpdateConnectionPoolAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
