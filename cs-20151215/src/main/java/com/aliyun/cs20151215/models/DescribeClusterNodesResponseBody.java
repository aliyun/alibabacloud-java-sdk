// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClusterNodesResponseBody extends TeaModel {
    @NameInMap("nodes")
    @Validation(required = true)
    public java.util.List<DescribeClusterNodesResponseBodyNodes> nodes;

    @NameInMap("page")
    @Validation(required = true)
    public DescribeClusterNodesResponseBodyPage page;

    public static DescribeClusterNodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterNodesResponseBody self = new DescribeClusterNodesResponseBody();
        return TeaModel.build(map, self);
    }

    public static class DescribeClusterNodesResponseBodyNodes extends TeaModel {
        @NameInMap("instance_type")
        @Validation(required = true)
        public String instanceType;

        @NameInMap("instance_role")
        @Validation(required = true)
        public String instanceRole;

        @NameInMap("expired_time")
        @Validation(required = true)
        public String expiredTime;

        @NameInMap("state")
        @Validation(required = true)
        public String state;

        @NameInMap("instance_name")
        @Validation(required = true)
        public String instanceName;

        @NameInMap("is_aliyun_node")
        @Validation(required = true)
        public Boolean isAliyunNode;

        @NameInMap("host_name")
        @Validation(required = true)
        public String hostName;

        @NameInMap("image_id")
        @Validation(required = true)
        public String imageId;

        @NameInMap("instance_status")
        @Validation(required = true)
        public String instanceStatus;

        @NameInMap("instance_charge_type")
        @Validation(required = true)
        public String instanceChargeType;

        @NameInMap("source")
        @Validation(required = true)
        public String source;

        @NameInMap("error_message")
        @Validation(required = true)
        public String errorMessage;

        @NameInMap("node_status")
        @Validation(required = true)
        public String nodeStatus;

        @NameInMap("creation_time")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("node_name")
        @Validation(required = true)
        public String nodeName;

        @NameInMap("instance_type_family")
        @Validation(required = true)
        public String instanceTypeFamily;

        @NameInMap("nodepool_id")
        @Validation(required = true)
        public String nodepoolId;

        @NameInMap("instance_id")
        @Validation(required = true)
        public String instanceId;

        @NameInMap("ip_address")
        @Validation(required = true)
        public java.util.List<String> ipAddress;

        public static DescribeClusterNodesResponseBodyNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterNodesResponseBodyNodes self = new DescribeClusterNodesResponseBodyNodes();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeClusterNodesResponseBodyPage extends TeaModel {
        @NameInMap("page_size")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("page_number")
        @Validation(required = true)
        public Integer pageNumber;

        @NameInMap("total_count")
        @Validation(required = true)
        public Integer totalCount;

        public static DescribeClusterNodesResponseBodyPage build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterNodesResponseBodyPage self = new DescribeClusterNodesResponseBodyPage();
            return TeaModel.build(map, self);
        }

    }

}
