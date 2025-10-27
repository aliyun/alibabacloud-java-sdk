// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class CreateEndpointRequest extends TeaModel {
    @NameInMap("ComputingGroupId")
    public String computingGroupId;

    /**
     * <p>The prefix of the new endpoint. The prefix of the ConnectionString parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>cc-bp100p4q1g9z3****-clickhouse.clickhouseserver.rds.aliyuncs.com</p>
     */
    @NameInMap("ConnectionPrefix")
    public String connectionPrefix;

    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cc-bp100p4q1g9z3****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The network type.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>Public</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Public</p>
     */
    @NameInMap("DBInstanceNetType")
    public String DBInstanceNetType;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static CreateEndpointRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEndpointRequest self = new CreateEndpointRequest();
        return TeaModel.build(map, self);
    }

    public CreateEndpointRequest setComputingGroupId(String computingGroupId) {
        this.computingGroupId = computingGroupId;
        return this;
    }
    public String getComputingGroupId() {
        return this.computingGroupId;
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
