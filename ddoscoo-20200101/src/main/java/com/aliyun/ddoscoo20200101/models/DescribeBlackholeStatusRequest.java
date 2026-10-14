// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeBlackholeStatusRequest extends TeaModel {
    /**
     * <p>The ID of the Anti-DDoS Proxy instance.</p>
     * <blockquote>
     * <p>You can call <a href="https://help.aliyun.com/document_detail/157459.html">DescribeInstanceIds</a> to query the IDs of all Anti-DDoS Pro or Anti-DDoS Premium instances.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ddoscoo-cn-mp91j1ao****</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    public static DescribeBlackholeStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBlackholeStatusRequest self = new DescribeBlackholeStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBlackholeStatusRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

}
