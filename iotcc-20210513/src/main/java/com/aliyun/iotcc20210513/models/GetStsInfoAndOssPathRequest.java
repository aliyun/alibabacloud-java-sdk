// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class GetStsInfoAndOssPathRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("ConnectionPoolId")
    public String connectionPoolId;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("FileName")
    public String fileName;

    @NameInMap("IoTCloudConnectorId")
    public String ioTCloudConnectorId;

    @NameInMap("RegionId")
    public String regionId;

    public static GetStsInfoAndOssPathRequest build(java.util.Map<String, ?> map) throws Exception {
        GetStsInfoAndOssPathRequest self = new GetStsInfoAndOssPathRequest();
        return TeaModel.build(map, self);
    }

    public GetStsInfoAndOssPathRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public GetStsInfoAndOssPathRequest setConnectionPoolId(String connectionPoolId) {
        this.connectionPoolId = connectionPoolId;
        return this;
    }
    public String getConnectionPoolId() {
        return this.connectionPoolId;
    }

    public GetStsInfoAndOssPathRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public GetStsInfoAndOssPathRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public GetStsInfoAndOssPathRequest setIoTCloudConnectorId(String ioTCloudConnectorId) {
        this.ioTCloudConnectorId = ioTCloudConnectorId;
        return this;
    }
    public String getIoTCloudConnectorId() {
        return this.ioTCloudConnectorId;
    }

    public GetStsInfoAndOssPathRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
