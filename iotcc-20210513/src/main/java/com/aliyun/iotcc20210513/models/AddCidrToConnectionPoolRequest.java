// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class AddCidrToConnectionPoolRequest extends TeaModel {
    @NameInMap("Cidrs")
    public java.util.List<String> cidrs;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("ConnectionPoolId")
    public String connectionPoolId;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("IoTCloudConnectorId")
    public String ioTCloudConnectorId;

    @NameInMap("RegionId")
    public String regionId;

    public static AddCidrToConnectionPoolRequest build(java.util.Map<String, ?> map) throws Exception {
        AddCidrToConnectionPoolRequest self = new AddCidrToConnectionPoolRequest();
        return TeaModel.build(map, self);
    }

    public AddCidrToConnectionPoolRequest setCidrs(java.util.List<String> cidrs) {
        this.cidrs = cidrs;
        return this;
    }
    public java.util.List<String> getCidrs() {
        return this.cidrs;
    }

    public AddCidrToConnectionPoolRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AddCidrToConnectionPoolRequest setConnectionPoolId(String connectionPoolId) {
        this.connectionPoolId = connectionPoolId;
        return this;
    }
    public String getConnectionPoolId() {
        return this.connectionPoolId;
    }

    public AddCidrToConnectionPoolRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public AddCidrToConnectionPoolRequest setIoTCloudConnectorId(String ioTCloudConnectorId) {
        this.ioTCloudConnectorId = ioTCloudConnectorId;
        return this;
    }
    public String getIoTCloudConnectorId() {
        return this.ioTCloudConnectorId;
    }

    public AddCidrToConnectionPoolRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
