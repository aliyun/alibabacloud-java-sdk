// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DetachFromPolicyShrinkRequest extends TeaModel {
    /**
     * <p>The protected objects.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("IpPortProtocolList")
    public String ipPortProtocolListShrink;

    /**
     * <p>The type of the policy. Valid values:</p>
     * <ul>
     * <li><strong>default</strong>: the default mitigation policies.</li>
     * <li><strong>l3</strong>: IP-specific mitigation policies.</li>
     * <li><strong>l4</strong>: port-specific mitigation policies.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>l3</p>
     */
    @NameInMap("PolicyType")
    public String policyType;

    public static DetachFromPolicyShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DetachFromPolicyShrinkRequest self = new DetachFromPolicyShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DetachFromPolicyShrinkRequest setIpPortProtocolListShrink(String ipPortProtocolListShrink) {
        this.ipPortProtocolListShrink = ipPortProtocolListShrink;
        return this;
    }
    public String getIpPortProtocolListShrink() {
        return this.ipPortProtocolListShrink;
    }

    public DetachFromPolicyShrinkRequest setPolicyType(String policyType) {
        this.policyType = policyType;
        return this;
    }
    public String getPolicyType() {
        return this.policyType;
    }

}
