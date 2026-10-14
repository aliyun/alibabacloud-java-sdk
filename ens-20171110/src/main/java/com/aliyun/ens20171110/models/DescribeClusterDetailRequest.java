// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeClusterDetailRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <p>Only ECK cluster IDs with the eck- prefix are accepted. Legacy short hexadecimal cluster IDs are not supported. Call DescribeClustersV1 to obtain the ID. When listing clusters, pass in the Name parameter.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eck-11111111</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    public static DescribeClusterDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterDetailRequest self = new DescribeClusterDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeClusterDetailRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}
