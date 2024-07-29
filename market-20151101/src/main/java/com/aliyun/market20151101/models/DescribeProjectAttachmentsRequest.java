// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class DescribeProjectAttachmentsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4****89</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static DescribeProjectAttachmentsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeProjectAttachmentsRequest self = new DescribeProjectAttachmentsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeProjectAttachmentsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
