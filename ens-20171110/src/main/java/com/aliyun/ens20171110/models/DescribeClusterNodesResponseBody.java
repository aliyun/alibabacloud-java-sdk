// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeClusterNodesResponseBody extends TeaModel {
    @NameInMap("Nodes")
    public java.util.List<DescribeClusterNodesResponseBodyNodes> nodes;

    @NameInMap("Page")
    public DescribeClusterNodesResponseBodyPage page;

    /**
     * <strong>example:</strong>
     * <p>CEF72CEB-54B6-4AE8-B225-F876FF7BA984</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeClusterNodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterNodesResponseBody self = new DescribeClusterNodesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeClusterNodesResponseBody setNodes(java.util.List<DescribeClusterNodesResponseBodyNodes> nodes) {
        this.nodes = nodes;
        return this;
    }
    public java.util.List<DescribeClusterNodesResponseBodyNodes> getNodes() {
        return this.nodes;
    }

    public DescribeClusterNodesResponseBody setPage(DescribeClusterNodesResponseBodyPage page) {
        this.page = page;
        return this;
    }
    public DescribeClusterNodesResponseBodyPage getPage() {
        return this.page;
    }

    public DescribeClusterNodesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeClusterNodesResponseBodyNodes extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>eck-xxxxxxxx</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <strong>example:</strong>
         * <p>cn-fuzhou-23</p>
         */
        @NameInMap("EnsRegionId")
        public String ensRegionId;

        /**
         * <strong>example:</strong>
         * <p>m-680cki2ruj1q2bm0mz1k9tnbz</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <strong>example:</strong>
         * <p>i-51mctytg7tv4yw4amu3oczxsx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("IpAddress")
        public java.util.List<String> ipAddress;

        /**
         * <strong>example:</strong>
         * <p>np861febb748f84f5f9f1c76819eff7f56</p>
         */
        @NameInMap("NodepoolId")
        public String nodepoolId;

        /**
         * <strong>example:</strong>
         * <p>PrePaid</p>
         */
        @NameInMap("PayType")
        public String payType;

        /**
         * <strong>example:</strong>
         * <p>initial</p>
         */
        @NameInMap("State")
        public String state;

        public static DescribeClusterNodesResponseBodyNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterNodesResponseBodyNodes self = new DescribeClusterNodesResponseBodyNodes();
            return TeaModel.build(map, self);
        }

        public DescribeClusterNodesResponseBodyNodes setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public DescribeClusterNodesResponseBodyNodes setEnsRegionId(String ensRegionId) {
            this.ensRegionId = ensRegionId;
            return this;
        }
        public String getEnsRegionId() {
            return this.ensRegionId;
        }

        public DescribeClusterNodesResponseBodyNodes setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeClusterNodesResponseBodyNodes setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeClusterNodesResponseBodyNodes setIpAddress(java.util.List<String> ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public java.util.List<String> getIpAddress() {
            return this.ipAddress;
        }

        public DescribeClusterNodesResponseBodyNodes setNodepoolId(String nodepoolId) {
            this.nodepoolId = nodepoolId;
            return this;
        }
        public String getNodepoolId() {
            return this.nodepoolId;
        }

        public DescribeClusterNodesResponseBodyNodes setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeClusterNodesResponseBodyNodes setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

    public static class DescribeClusterNodesResponseBodyPage extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeClusterNodesResponseBodyPage build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterNodesResponseBodyPage self = new DescribeClusterNodesResponseBodyPage();
            return TeaModel.build(map, self);
        }

        public DescribeClusterNodesResponseBodyPage setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public DescribeClusterNodesResponseBodyPage setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeClusterNodesResponseBodyPage setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
