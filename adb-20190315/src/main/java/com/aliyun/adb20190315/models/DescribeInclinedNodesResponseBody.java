// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeInclinedNodesResponseBody extends TeaModel {
    /**
     * <p>The queried storage nodes.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeInclinedNodesResponseBodyItems> items;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8C1A419E-5A79-51A9-B533-FCCB98AD8FD5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeInclinedNodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInclinedNodesResponseBody self = new DescribeInclinedNodesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInclinedNodesResponseBody setItems(java.util.List<DescribeInclinedNodesResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeInclinedNodesResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeInclinedNodesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeInclinedNodesResponseBodyItems extends TeaModel {
        /**
         * <p>The disk usage of the storage node. Unit: %.</p>
         * 
         * <strong>example:</strong>
         * <p>90.5</p>
         */
        @NameInMap("DiskUsageRatio")
        public String diskUsageRatio;

        /**
         * <p>The number of the storage node.</p>
         * 
         * <strong>example:</strong>
         * <p>Node1</p>
         */
        @NameInMap("Node")
        public String node;

        public static DescribeInclinedNodesResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeInclinedNodesResponseBodyItems self = new DescribeInclinedNodesResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeInclinedNodesResponseBodyItems setDiskUsageRatio(String diskUsageRatio) {
            this.diskUsageRatio = diskUsageRatio;
            return this;
        }
        public String getDiskUsageRatio() {
            return this.diskUsageRatio;
        }

        public DescribeInclinedNodesResponseBodyItems setNode(String node) {
            this.node = node;
            return this;
        }
        public String getNode() {
            return this.node;
        }

    }

}
