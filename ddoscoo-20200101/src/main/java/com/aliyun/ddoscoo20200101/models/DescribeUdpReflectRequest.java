// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeUdpReflectRequest extends TeaModel {
    /**
     * <p>The ID of the instance to query.</p>
     * <br>
     * <p>> You can call the [DescribeInstanceIds](https://help.aliyun.com/document_detail/157459.html) operation to query the IDs of all instances.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region ID of the instance. Valid values:</p>
     * <br>
     * <p>*   **cn-hangzhou**: Chinese mainland, which indicates an Anti-DDoS Pro instance. This is the default value.</p>
     * <p>*   **ap-southeast-1**: outside the Chinese mainland, which indicates an Anti-DDoS Premium instance.</p>
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
