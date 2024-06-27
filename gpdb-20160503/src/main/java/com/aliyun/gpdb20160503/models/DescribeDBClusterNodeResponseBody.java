// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDBClusterNodeResponseBody extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-bp***************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The name of the node.</p>
     */
    @NameInMap("Nodes")
    public java.util.List<DescribeDBClusterNodeResponseBodyNodes> nodes;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>87E44B48-B306-4AD3-A63B-C8**********</p>
     */
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
        /**
         * <p>The name of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>master-10*******</p>
         */
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
