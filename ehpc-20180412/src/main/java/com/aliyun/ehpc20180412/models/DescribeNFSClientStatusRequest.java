// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class DescribeNFSClientStatusRequest extends TeaModel {
    /**
     * <p>The ID of the visualization instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static DescribeNFSClientStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeNFSClientStatusRequest self = new DescribeNFSClientStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeNFSClientStatusRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
