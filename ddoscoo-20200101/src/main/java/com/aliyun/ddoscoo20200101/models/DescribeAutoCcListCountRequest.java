// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeAutoCcListCountRequest extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     * <blockquote>
     * <p>You can call the <strong>DescribeInstanceIds</strong> operation to query the IDs of all instances.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ddoscoo-cn-mp91j1ao****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The mode of how an IP address is added to the whitelist or blacklist. Valid values:</p>
     * <ul>
     * <li><strong>manual</strong>: manually added</li>
     * <li><strong>auto</strong>: automatically added</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>manual</p>
     */
    @NameInMap("QueryType")
    public String queryType;

    public static DescribeAutoCcListCountRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAutoCcListCountRequest self = new DescribeAutoCcListCountRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAutoCcListCountRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeAutoCcListCountRequest setQueryType(String queryType) {
        this.queryType = queryType;
        return this;
    }
    public String getQueryType() {
        return this.queryType;
    }

}
