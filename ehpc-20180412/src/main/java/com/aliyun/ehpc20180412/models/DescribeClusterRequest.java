// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class DescribeClusterRequest extends TeaModel {
    /**
     * <p>The type of the image. Valid values:</p>
     * <br>
     * <p>*   system: public image</p>
     * <p>*   self: custom image</p>
     * <p>*   others: shared image</p>
     * <p>*   marketplace: Alibaba Cloud Marketplace image</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    public static DescribeClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterRequest self = new DescribeClusterRequest();
        return TeaModel.build(map, self);
    }

    public DescribeClusterRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}
