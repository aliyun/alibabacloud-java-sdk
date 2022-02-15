// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDBClusterPerformanceRequest extends TeaModel {
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("Key")
    public String key;

    @NameInMap("NodeType")
    public String nodeType;

    @NameInMap("Nodes")
    public String nodes;

    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDBClusterPerformanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterPerformanceRequest self = new DescribeDBClusterPerformanceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterPerformanceRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeDBClusterPerformanceRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDBClusterPerformanceRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public DescribeDBClusterPerformanceRequest setNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }
    public String getNodeType() {
        return this.nodeType;
    }

    public DescribeDBClusterPerformanceRequest setNodes(String nodes) {
        this.nodes = nodes;
        return this;
    }
    public String getNodes() {
        return this.nodes;
    }

    public DescribeDBClusterPerformanceRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
