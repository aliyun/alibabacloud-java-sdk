// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeHadoopClustersInSameNetResponseBody extends TeaModel {
    @NameInMap("Clusters")
    public java.util.List<String> clusters;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B4CAF581-2AC7-41AD-8940-D56DF7AADF5B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeHadoopClustersInSameNetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHadoopClustersInSameNetResponseBody self = new DescribeHadoopClustersInSameNetResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHadoopClustersInSameNetResponseBody setClusters(java.util.List<String> clusters) {
        this.clusters = clusters;
        return this;
    }
    public java.util.List<String> getClusters() {
        return this.clusters;
    }

    public DescribeHadoopClustersInSameNetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
