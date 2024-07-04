// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeInstanceAutoRenewAttributeRequest extends TeaModel {
    /**
     * <p>The ID of an instance. Separate multiple IDs with semicolons (;).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i-5ci7l7k1m9m2zmhp4iw3o****</p>
     */
    @NameInMap("InstanceIds")
    public String instanceIds;

    @NameInMap("OwnerId")
    public Long ownerId;

    public static DescribeInstanceAutoRenewAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceAutoRenewAttributeRequest self = new DescribeInstanceAutoRenewAttributeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceAutoRenewAttributeRequest setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public String getInstanceIds() {
        return this.instanceIds;
    }

    public DescribeInstanceAutoRenewAttributeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
