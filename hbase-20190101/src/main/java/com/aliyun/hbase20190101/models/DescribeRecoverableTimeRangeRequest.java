// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeRecoverableTimeRangeRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ld-m5eznlga4k5bcxxxx</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    public static DescribeRecoverableTimeRangeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecoverableTimeRangeRequest self = new DescribeRecoverableTimeRangeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRecoverableTimeRangeRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}
