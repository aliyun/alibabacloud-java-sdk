// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class RestartDBInstanceRequest extends TeaModel {
    /**
     * <p>The compute group ID. This parameter is required when NodeList is specified. If only ComputingGroupId is specified without NodeList, the entire compute group is restarted. If neither is specified, the entire instance is restarted.</p>
     * 
     * <strong>example:</strong>
     * <p>cc-2zek7uow3827*****-clickhouse</p>
     */
    @NameInMap("ComputingGroupId")
    public String computingGroupId;

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
     * <p>The list of node IDs to restart. The elements are the NodeId values returned by DescribeDBInstanceNodes. The parameter format is NodeList.N. If this parameter is not specified or is empty, the entire instance or compute group is restarted based on the original logic. If this parameter is not empty, ComputingGroupId is required, and a maximum of 50 nodes can be specified at a time.</p>
     */
    @NameInMap("NodeList")
    public java.util.List<String> nodeList;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static RestartDBInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RestartDBInstanceRequest self = new RestartDBInstanceRequest();
        return TeaModel.build(map, self);
    }

    public RestartDBInstanceRequest setComputingGroupId(String computingGroupId) {
        this.computingGroupId = computingGroupId;
        return this;
    }
    public String getComputingGroupId() {
        return this.computingGroupId;
    }

    public RestartDBInstanceRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public RestartDBInstanceRequest setNodeList(java.util.List<String> nodeList) {
        this.nodeList = nodeList;
        return this;
    }
    public java.util.List<String> getNodeList() {
        return this.nodeList;
    }

    public RestartDBInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
