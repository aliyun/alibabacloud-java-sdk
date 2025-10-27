// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class DeleteEndpointRequest extends TeaModel {
    @NameInMap("ComputingGroupId")
    public String computingGroupId;

    /**
     * <p>The prefix of the endpoint, which indicates the prefix of the value of the ConnectionString parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>cc-bp100p4q1g9z3****-clickhouse.clickhouseserver.rds.aliyuncs.com</p>
     */
    @NameInMap("ConnectionString")
    public String connectionString;

    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cc-bp100p4q1g9z3****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("DBInstanceNetType")
    public String DBInstanceNetType;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DeleteEndpointRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteEndpointRequest self = new DeleteEndpointRequest();
        return TeaModel.build(map, self);
    }

    public DeleteEndpointRequest setComputingGroupId(String computingGroupId) {
        this.computingGroupId = computingGroupId;
        return this;
    }
    public String getComputingGroupId() {
        return this.computingGroupId;
    }

    public DeleteEndpointRequest setConnectionString(String connectionString) {
        this.connectionString = connectionString;
        return this;
    }
    public String getConnectionString() {
        return this.connectionString;
    }

    public DeleteEndpointRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DeleteEndpointRequest setDBInstanceNetType(String DBInstanceNetType) {
        this.DBInstanceNetType = DBInstanceNetType;
        return this;
    }
    public String getDBInstanceNetType() {
        return this.DBInstanceNetType;
    }

    public DeleteEndpointRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
