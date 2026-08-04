// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class DetachPolicy2ApprovalProcessRequest extends TeaModel {
    /**
     * <p>Business policy ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ladp-27a4fedf5e73****</p>
     */
    @NameInMap("PolicyId")
    public String policyId;

    /**
     * <p>Policy type. Valid values:</p>
     * <ul>
     * <li><p><strong>DomainBlacklist</strong>: Domain blacklist.</p>
     * </li>
     * <li><p><strong>DomainWhitelist</strong>: Domain whitelist.</p>
     * </li>
     * <li><p><strong>SoftwareBlock</strong>: Software disable.</p>
     * </li>
     * <li><p><strong>AppUninstall</strong>: Terminal uninstall.</p>
     * </li>
     * <li><p><strong>DlpSend</strong>: File outbound transfer.</p>
     * </li>
     * <li><p><strong>PeripheralBlock</strong>: Peripheral control.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PeripheralBlock</p>
     */
    @NameInMap("PolicyType")
    public String policyType;

    /**
     * <p>Approval process ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>approval-process-2677fcf063f5****</p>
     */
    @NameInMap("ProcessId")
    public String processId;

    public static DetachPolicy2ApprovalProcessRequest build(java.util.Map<String, ?> map) throws Exception {
        DetachPolicy2ApprovalProcessRequest self = new DetachPolicy2ApprovalProcessRequest();
        return TeaModel.build(map, self);
    }

    public DetachPolicy2ApprovalProcessRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

    public DetachPolicy2ApprovalProcessRequest setPolicyType(String policyType) {
        this.policyType = policyType;
        return this;
    }
    public String getPolicyType() {
        return this.policyType;
    }

    public DetachPolicy2ApprovalProcessRequest setProcessId(String processId) {
        this.processId = processId;
        return this;
    }
    public String getProcessId() {
        return this.processId;
    }

}
