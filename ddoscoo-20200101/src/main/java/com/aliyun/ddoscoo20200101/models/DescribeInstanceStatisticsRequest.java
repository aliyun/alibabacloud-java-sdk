// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeInstanceStatisticsRequest extends TeaModel {
    /**
     * <p>The ID of the instance that you want to query.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/157459.html">DescribeInstanceIds</a> operation to query the IDs of all instances.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ddoscoo-cn-mp91j1ao****</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    public static DescribeInstanceStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceStatisticsRequest self = new DescribeInstanceStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceStatisticsRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

}
