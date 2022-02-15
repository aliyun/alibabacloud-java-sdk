// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDBClusterNodesResponseBody extends TeaModel {
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("Nodes")
    public java.util.List<DescribeDBClusterNodesResponseBodyNodes> nodes;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDBClusterNodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterNodesResponseBody self = new DescribeDBClusterNodesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterNodesResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeDBClusterNodesResponseBody setNodes(java.util.List<DescribeDBClusterNodesResponseBodyNodes> nodes) {
        this.nodes = nodes;
        return this;
    }
    public java.util.List<DescribeDBClusterNodesResponseBodyNodes> getNodes() {
        return this.nodes;
    }

    public DescribeDBClusterNodesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDBClusterNodesResponseBodyNodes extends TeaModel {
        @NameInMap("Name")
        public String name;

        public static DescribeDBClusterNodesResponseBodyNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterNodesResponseBodyNodes self = new DescribeDBClusterNodesResponseBodyNodes();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterNodesResponseBodyNodes setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
