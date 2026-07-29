// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DetachFromPolicyShrinkRequest extends TeaModel {
    /**
     * <p>The list of protected objects.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("IpPortProtocolList")
    public String ipPortProtocolListShrink;

    /**
     * <p>The policy type. Valid values:</p>
     * <ul>
     * <li><strong>default</strong>: default mitigation policy.</li>
     * <li><strong>l3</strong>: IP-specific mitigation policy.</li>
     * <li><strong>l4</strong>: port-specific mitigation policy.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>l3</p>
     */
    @NameInMap("PolicyType")
    public String policyType;

    /**
     * <p>The version of the port-specific mitigation policy. Valid values:</p>
     * <ul>
     * <li><strong>Not specified</strong>: dissociates the default surf anti-DDoS engine policy.</li>
     * <li><strong>2</strong>: dissociates the new stream anti-DDoS engine policy.<blockquote>
     * <p>Only port-specific mitigation policies support this parameter.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("PortVersion")
    public String portVersion;

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

    public DetachFromPolicyShrinkRequest setPortVersion(String portVersion) {
        this.portVersion = portVersion;
        return this;
    }
    public String getPortVersion() {
        return this.portVersion;
    }

}
