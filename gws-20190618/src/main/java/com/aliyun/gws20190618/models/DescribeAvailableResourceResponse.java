// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gws20190618.models;

import com.aliyun.tea.*;

public class DescribeAvailableResourceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("AvailableResources")
    @Validation(required = true)
    public java.util.List<DescribeAvailableResourceResponseAvailableResources> availableResources;

    public static DescribeAvailableResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableResourceResponse self = new DescribeAvailableResourceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAvailableResourceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAvailableResourceResponse setAvailableResources(java.util.List<DescribeAvailableResourceResponseAvailableResources> availableResources) {
        this.availableResources = availableResources;
        return this;
    }
    public java.util.List<DescribeAvailableResourceResponseAvailableResources> getAvailableResources() {
        return this.availableResources;
    }

    public static class DescribeAvailableResourceResponseAvailableResources extends TeaModel {
        @NameInMap("ClusterType")
        @Validation(required = true)
        public String clusterType;

        @NameInMap("Zone")
        @Validation(required = true)
        public String zone;

        public static DescribeAvailableResourceResponseAvailableResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseAvailableResources self = new DescribeAvailableResourceResponseAvailableResources();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseAvailableResources setClusterType(String clusterType) {
            this.clusterType = clusterType;
            return this;
        }
        public String getClusterType() {
            return this.clusterType;
        }

        public DescribeAvailableResourceResponseAvailableResources setZone(String zone) {
            this.zone = zone;
            return this;
        }
        public String getZone() {
            return this.zone;
        }

    }

}
