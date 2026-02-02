// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyQosEntriesRequest extends TeaModel {
    @NameInMap("AuthAndroidId")
    public java.util.List<String> authAndroidId;

    @NameInMap("AuthDesktopId")
    public java.util.List<String> authDesktopId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>qos-5605u0gelk200****</p>
     */
    @NameInMap("QosRuleId")
    public String qosRuleId;

    @NameInMap("RevokeAndroidId")
    public java.util.List<String> revokeAndroidId;

    @NameInMap("RevokeDesktopId")
    public java.util.List<String> revokeDesktopId;

    public static ModifyQosEntriesRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyQosEntriesRequest self = new ModifyQosEntriesRequest();
        return TeaModel.build(map, self);
    }

    public ModifyQosEntriesRequest setAuthAndroidId(java.util.List<String> authAndroidId) {
        this.authAndroidId = authAndroidId;
        return this;
    }
    public java.util.List<String> getAuthAndroidId() {
        return this.authAndroidId;
    }

    public ModifyQosEntriesRequest setAuthDesktopId(java.util.List<String> authDesktopId) {
        this.authDesktopId = authDesktopId;
        return this;
    }
    public java.util.List<String> getAuthDesktopId() {
        return this.authDesktopId;
    }

    public ModifyQosEntriesRequest setQosRuleId(String qosRuleId) {
        this.qosRuleId = qosRuleId;
        return this;
    }
    public String getQosRuleId() {
        return this.qosRuleId;
    }

    public ModifyQosEntriesRequest setRevokeAndroidId(java.util.List<String> revokeAndroidId) {
        this.revokeAndroidId = revokeAndroidId;
        return this;
    }
    public java.util.List<String> getRevokeAndroidId() {
        return this.revokeAndroidId;
    }

    public ModifyQosEntriesRequest setRevokeDesktopId(java.util.List<String> revokeDesktopId) {
        this.revokeDesktopId = revokeDesktopId;
        return this;
    }
    public java.util.List<String> getRevokeDesktopId() {
        return this.revokeDesktopId;
    }

}
