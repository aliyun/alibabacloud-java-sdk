// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class AddMembersRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("memberArns")
    public java.util.List<String> memberArns;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("workspaceId")
    public String workspaceId;

    @NameInMap("regionId")
    public String regionId;

    public static AddMembersRequest build(java.util.Map<String, ?> map) throws Exception {
        AddMembersRequest self = new AddMembersRequest();
        return TeaModel.build(map, self);
    }

    public AddMembersRequest setMemberArns(java.util.List<String> memberArns) {
        this.memberArns = memberArns;
        return this;
    }
    public java.util.List<String> getMemberArns() {
        return this.memberArns;
    }

    public AddMembersRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public AddMembersRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
