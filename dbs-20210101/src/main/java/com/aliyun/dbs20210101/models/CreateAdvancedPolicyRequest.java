// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20210101.models;

import com.aliyun.tea.*;

public class CreateAdvancedPolicyRequest extends TeaModel {
    /**
     * <p>The ID of the PolarDB instance.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-2ze3nrr64c5****</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The region in which backup sets reside.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionCode")
    public String regionCode;

    public static CreateAdvancedPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAdvancedPolicyRequest self = new CreateAdvancedPolicyRequest();
        return TeaModel.build(map, self);
    }

    public CreateAdvancedPolicyRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public CreateAdvancedPolicyRequest setRegionCode(String regionCode) {
        this.regionCode = regionCode;
        return this;
    }
    public String getRegionCode() {
        return this.regionCode;
    }

}
