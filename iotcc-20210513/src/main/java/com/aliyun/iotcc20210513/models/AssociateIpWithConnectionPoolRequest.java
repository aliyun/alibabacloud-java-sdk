// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class AssociateIpWithConnectionPoolRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("ConnectionPoolId")
    public String connectionPoolId;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("IoTCloudConnectorId")
    public String ioTCloudConnectorId;

    @NameInMap("Ips")
    public java.util.List<String> ips;

    @NameInMap("IpsFilePath")
    public String ipsFilePath;

    @NameInMap("RegionId")
    public String regionId;

    public static AssociateIpWithConnectionPoolRequest build(java.util.Map<String, ?> map) throws Exception {
        AssociateIpWithConnectionPoolRequest self = new AssociateIpWithConnectionPoolRequest();
        return TeaModel.build(map, self);
    }

    public AssociateIpWithConnectionPoolRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AssociateIpWithConnectionPoolRequest setConnectionPoolId(String connectionPoolId) {
        this.connectionPoolId = connectionPoolId;
        return this;
    }
    public String getConnectionPoolId() {
        return this.connectionPoolId;
    }

    public AssociateIpWithConnectionPoolRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public AssociateIpWithConnectionPoolRequest setIoTCloudConnectorId(String ioTCloudConnectorId) {
        this.ioTCloudConnectorId = ioTCloudConnectorId;
        return this;
    }
    public String getIoTCloudConnectorId() {
        return this.ioTCloudConnectorId;
    }

    public AssociateIpWithConnectionPoolRequest setIps(java.util.List<String> ips) {
        this.ips = ips;
        return this;
    }
    public java.util.List<String> getIps() {
        return this.ips;
    }

    public AssociateIpWithConnectionPoolRequest setIpsFilePath(String ipsFilePath) {
        this.ipsFilePath = ipsFilePath;
        return this;
    }
    public String getIpsFilePath() {
        return this.ipsFilePath;
    }

    public AssociateIpWithConnectionPoolRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
