// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeEndpointsRequest extends TeaModel {
    /**
     * <p>The ID of the instance that you want to query. You can call the <a href="https://help.aliyun.com/document_detail/144595.html">DescribeInstances</a> operation to obtain the instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ld-bp150tns0sjxs****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    public static DescribeEndpointsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEndpointsRequest self = new DescribeEndpointsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEndpointsRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}
