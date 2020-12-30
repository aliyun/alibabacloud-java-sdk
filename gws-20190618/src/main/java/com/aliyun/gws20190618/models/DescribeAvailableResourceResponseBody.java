// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gws20190618.models;

import com.aliyun.tea.*;

public class DescribeAvailableResourceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("AvailableResources")
    public java.util.List<DescribeAvailableResourceResponseBodyAvailableResources> availableResources;

    public static DescribeAvailableResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableResourceResponseBody self = new DescribeAvailableResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAvailableResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAvailableResourceResponseBody setAvailableResources(java.util.List<DescribeAvailableResourceResponseBodyAvailableResources> availableResources) {
        this.availableResources = availableResources;
        return this;
    }
    public java.util.List<DescribeAvailableResourceResponseBodyAvailableResources> getAvailableResources() {
        return this.availableResources;
    }

    public static class DescribeAvailableResourceResponseBodyAvailableResources extends TeaModel {
        @NameInMap("ClusterType")
        public String clusterType;

        @NameInMap("Zone")
        public String zone;

        public static DescribeAvailableResourceResponseBodyAvailableResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseBodyAvailableResources self = new DescribeAvailableResourceResponseBodyAvailableResources();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseBodyAvailableResources setClusterType(String clusterType) {
            this.clusterType = clusterType;
            return this;
        }
        public String getClusterType() {
            return this.clusterType;
        }

        public DescribeAvailableResourceResponseBodyAvailableResources setZone(String zone) {
            this.zone = zone;
            return this;
        }
        public String getZone() {
            return this.zone;
        }

    }

}
