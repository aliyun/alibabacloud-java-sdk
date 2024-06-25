// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class AttachToPolicyShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("IpPortProtocolList")
    public String ipPortProtocolListShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cd8b4d70-e4e0-413a-b390-e71d********</p>
     */
    @NameInMap("PolicyId")
    public String policyId;

    public static AttachToPolicyShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachToPolicyShrinkRequest self = new AttachToPolicyShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AttachToPolicyShrinkRequest setIpPortProtocolListShrink(String ipPortProtocolListShrink) {
        this.ipPortProtocolListShrink = ipPortProtocolListShrink;
        return this;
    }
    public String getIpPortProtocolListShrink() {
        return this.ipPortProtocolListShrink;
    }

    public AttachToPolicyShrinkRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

}
