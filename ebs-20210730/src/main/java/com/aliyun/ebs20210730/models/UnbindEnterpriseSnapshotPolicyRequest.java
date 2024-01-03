// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class UnbindEnterpriseSnapshotPolicyRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DiskTargets")
    public java.util.List<String> diskTargets;

    @NameInMap("PolicyId")
    public String policyId;

    @NameInMap("RegionId")
    public String regionId;

    public static UnbindEnterpriseSnapshotPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        UnbindEnterpriseSnapshotPolicyRequest self = new UnbindEnterpriseSnapshotPolicyRequest();
        return TeaModel.build(map, self);
    }

    public UnbindEnterpriseSnapshotPolicyRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UnbindEnterpriseSnapshotPolicyRequest setDiskTargets(java.util.List<String> diskTargets) {
        this.diskTargets = diskTargets;
        return this;
    }
    public java.util.List<String> getDiskTargets() {
        return this.diskTargets;
    }

    public UnbindEnterpriseSnapshotPolicyRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

    public UnbindEnterpriseSnapshotPolicyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
