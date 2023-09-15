// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class CreateEndpointRequest extends TeaModel {
    @NameInMap("ConnectionPrefix")
    public String connectionPrefix;

    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("DBInstanceNetType")
    public String DBInstanceNetType;

    @NameInMap("RegionId")
    public String regionId;

    public static CreateEndpointRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEndpointRequest self = new CreateEndpointRequest();
        return TeaModel.build(map, self);
    }

    public CreateEndpointRequest setConnectionPrefix(String connectionPrefix) {
        this.connectionPrefix = connectionPrefix;
        return this;
    }
    public String getConnectionPrefix() {
        return this.connectionPrefix;
    }

    public CreateEndpointRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public CreateEndpointRequest setDBInstanceNetType(String DBInstanceNetType) {
        this.DBInstanceNetType = DBInstanceNetType;
        return this;
    }
    public String getDBInstanceNetType() {
        return this.DBInstanceNetType;
    }

    public CreateEndpointRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
