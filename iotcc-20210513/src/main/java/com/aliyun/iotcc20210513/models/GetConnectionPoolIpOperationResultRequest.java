// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class GetConnectionPoolIpOperationResultRequest extends TeaModel {
    @NameInMap("ConnectionPoolId")
    public String connectionPoolId;

    @NameInMap("IoTCloudConnectorId")
    public String ioTCloudConnectorId;

    @NameInMap("QueryRequestId")
    public String queryRequestId;

    @NameInMap("RegionId")
    public String regionId;

    public static GetConnectionPoolIpOperationResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetConnectionPoolIpOperationResultRequest self = new GetConnectionPoolIpOperationResultRequest();
        return TeaModel.build(map, self);
    }

    public GetConnectionPoolIpOperationResultRequest setConnectionPoolId(String connectionPoolId) {
        this.connectionPoolId = connectionPoolId;
        return this;
    }
    public String getConnectionPoolId() {
        return this.connectionPoolId;
    }

    public GetConnectionPoolIpOperationResultRequest setIoTCloudConnectorId(String ioTCloudConnectorId) {
        this.ioTCloudConnectorId = ioTCloudConnectorId;
        return this;
    }
    public String getIoTCloudConnectorId() {
        return this.ioTCloudConnectorId;
    }

    public GetConnectionPoolIpOperationResultRequest setQueryRequestId(String queryRequestId) {
        this.queryRequestId = queryRequestId;
        return this;
    }
    public String getQueryRequestId() {
        return this.queryRequestId;
    }

    public GetConnectionPoolIpOperationResultRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
