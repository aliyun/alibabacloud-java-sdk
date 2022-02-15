// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDBClusterNodeResponseBody extends TeaModel {
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("Nodes")
    public java.util.List<DescribeDBClusterNodeResponseBodyNodes> nodes;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDBClusterNodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterNodeResponseBody self = new DescribeDBClusterNodeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterNodeResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeDBClusterNodeResponseBody setNodes(java.util.List<DescribeDBClusterNodeResponseBodyNodes> nodes) {
        this.nodes = nodes;
        return this;
    }
    public java.util.List<DescribeDBClusterNodeResponseBodyNodes> getNodes() {
        return this.nodes;
    }

    public DescribeDBClusterNodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDBClusterNodeResponseBodyNodes extends TeaModel {
        @NameInMap("Name")
        public String name;

        public static DescribeDBClusterNodeResponseBodyNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterNodeResponseBodyNodes self = new DescribeDBClusterNodeResponseBodyNodes();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterNodeResponseBodyNodes setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
