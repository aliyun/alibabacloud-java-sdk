// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class BindEnterpriseSnapshotPolicyRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that it is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](~~25693~~).</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The list of disks.</p>
     */
    @NameInMap("DiskTargets")
    public java.util.List<String> diskTargets;

    /**
     * <p>The id of the policy.</p>
     */
    @NameInMap("PolicyId")
    public String policyId;

    /**
     * <p>The region ID . You can call the [DescribeRegions](~~354276~~) operation to query the most recent list of regions in which snapshot policy is supported.</p>
     */
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
