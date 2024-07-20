// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DescribeIpSetRequest extends TeaModel {
    /**
     * <p>The ID of the acceleration region.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/2253273.html">ListIpSets</a> operation to query the IDs of acceleration regions of a specific GA instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ips-bp11ilwqjdkjeg9r7****</p>
     */
    @NameInMap("IpSetId")
    public String ipSetId;

    /**
     * <p>The ID of the region where the Global Accelerator (GA) instance is deployed. Set the value to <strong>cn-hangzhou</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeIpSetRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeIpSetRequest self = new DescribeIpSetRequest();
        return TeaModel.build(map, self);
    }

    public DescribeIpSetRequest setIpSetId(String ipSetId) {
        this.ipSetId = ipSetId;
        return this;
    }
    public String getIpSetId() {
        return this.ipSetId;
    }

    public DescribeIpSetRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
