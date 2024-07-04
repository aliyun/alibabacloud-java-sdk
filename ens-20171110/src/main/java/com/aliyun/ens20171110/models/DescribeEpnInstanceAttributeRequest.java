// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeEpnInstanceAttributeRequest extends TeaModel {
    /**
     * <p>The ID of the EPN instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>epn-xxxx</p>
     */
    @NameInMap("EPNInstanceId")
    public String EPNInstanceId;

    public static DescribeEpnInstanceAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEpnInstanceAttributeRequest self = new DescribeEpnInstanceAttributeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEpnInstanceAttributeRequest setEPNInstanceId(String EPNInstanceId) {
        this.EPNInstanceId = EPNInstanceId;
        return this;
    }
    public String getEPNInstanceId() {
        return this.EPNInstanceId;
    }

}
