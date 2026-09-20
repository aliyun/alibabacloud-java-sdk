// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeIpWhitelistRequest extends TeaModel {
    /**
     * <p>The ID of the instance that you want to query. You can call <a href="https://help.aliyun.com/document_detail/144595.html">DescribeInstances</a> to obtain the instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ld-bp150tns0sjxs****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    public static DescribeIpWhitelistRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeIpWhitelistRequest self = new DescribeIpWhitelistRequest();
        return TeaModel.build(map, self);
    }

    public DescribeIpWhitelistRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}
