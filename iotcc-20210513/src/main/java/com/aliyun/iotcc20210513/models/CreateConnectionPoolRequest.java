// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class CreateConnectionPoolRequest extends TeaModel {
    @NameInMap("IoTCloudConnectorId")
    public String ioTCloudConnectorId;

    @NameInMap("Count")
    public Long count;

    @NameInMap("ConnectionPoolName")
    public String connectionPoolName;

    @NameInMap("ConnectionPoolDescription")
    public String connectionPoolDescription;

    @NameInMap("Cidrs")
    public java.util.List<String> cidrs;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("RegionId")
    public String regionId;

    public static CreateConnectionPoolRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateConnectionPoolRequest self = new CreateConnectionPoolRequest();
        return TeaModel.build(map, self);
    }

    public CreateConnectionPoolRequest setIoTCloudConnectorId(String ioTCloudConnectorId) {
        this.ioTCloudConnectorId = ioTCloudConnectorId;
        return this;
    }
    public String getIoTCloudConnectorId() {
        return this.ioTCloudConnectorId;
    }

    public CreateConnectionPoolRequest setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public CreateConnectionPoolRequest setConnectionPoolName(String connectionPoolName) {
        this.connectionPoolName = connectionPoolName;
        return this;
    }
    public String getConnectionPoolName() {
        return this.connectionPoolName;
    }

    public CreateConnectionPoolRequest setConnectionPoolDescription(String connectionPoolDescription) {
        this.connectionPoolDescription = connectionPoolDescription;
        return this;
    }
    public String getConnectionPoolDescription() {
        return this.connectionPoolDescription;
    }

    public CreateConnectionPoolRequest setCidrs(java.util.List<String> cidrs) {
        this.cidrs = cidrs;
        return this;
    }
    public java.util.List<String> getCidrs() {
        return this.cidrs;
    }

    public CreateConnectionPoolRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateConnectionPoolRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateConnectionPoolRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
