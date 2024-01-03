// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class BindEnterpriseSnapshotPolicyRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DiskTargets")
    public java.util.List<String> diskTargets;

    @NameInMap("PolicyId")
    public String policyId;

    @NameInMap("RegionId")
    public String regionId;

    public static BindEnterpriseSnapshotPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        BindEnterpriseSnapshotPolicyRequest self = new BindEnterpriseSnapshotPolicyRequest();
        return TeaModel.build(map, self);
    }

    public BindEnterpriseSnapshotPolicyRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public BindEnterpriseSnapshotPolicyRequest setDiskTargets(java.util.List<String> diskTargets) {
        this.diskTargets = diskTargets;
        return this;
    }
    public java.util.List<String> getDiskTargets() {
        return this.diskTargets;
    }

    public BindEnterpriseSnapshotPolicyRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

    public BindEnterpriseSnapshotPolicyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
