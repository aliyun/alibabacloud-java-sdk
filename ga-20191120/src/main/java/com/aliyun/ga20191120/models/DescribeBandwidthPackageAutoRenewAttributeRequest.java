// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DescribeBandwidthPackageAutoRenewAttributeRequest extends TeaModel {
    /**
     * <p>The ID of the bandwidth plan.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gbwp-bp1iquvlp8khla5emb3ia</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the region where the Global Accelerator (GA) instance is deployed. Set the value to cn-hangzhou.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeBandwidthPackageAutoRenewAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBandwidthPackageAutoRenewAttributeRequest self = new DescribeBandwidthPackageAutoRenewAttributeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBandwidthPackageAutoRenewAttributeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeBandwidthPackageAutoRenewAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
