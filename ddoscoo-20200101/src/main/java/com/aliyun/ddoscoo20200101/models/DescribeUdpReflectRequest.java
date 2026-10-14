// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeUdpReflectRequest extends TeaModel {
    /**
     * <p>The ID of the instance to query.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/157459.html">DescribeInstanceIds</a> operation to query the IDs of all instances.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ddoscoo-cn-i7m25564****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region ID of the instance. Valid values:</p>
     * <ul>
     * <li><strong>cn-hangzhou</strong>: indicates an Anti-DDoS Proxy (Chinese Mainland) instance. This is the default value.</li>
     * <li><strong>ap-southeast-1</strong>: indicates an Anti-DDoS Proxy (Outside Chinese Mainland) instance.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeUdpReflectRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUdpReflectRequest self = new DescribeUdpReflectRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUdpReflectRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeUdpReflectRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
