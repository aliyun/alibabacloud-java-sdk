// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class GrantRoleToUsersRequest extends TeaModel {
    /**
     * <p>The Alibaba Cloud Resource Name (ARN) of the role.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:emr::w-975bcfda9625****:role/Owner</p>
     */
    @NameInMap("roleArn")
    public String roleArn;

    @NameInMap("userArns")
    public java.util.List<String> userArns;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regionId")
    public String regionId;

    public static GrantRoleToUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        GrantRoleToUsersRequest self = new GrantRoleToUsersRequest();
        return TeaModel.build(map, self);
    }

    public GrantRoleToUsersRequest setRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }
    public String getRoleArn() {
        return this.roleArn;
    }

    public GrantRoleToUsersRequest setUserArns(java.util.List<String> userArns) {
        this.userArns = userArns;
        return this;
    }
    public java.util.List<String> getUserArns() {
        return this.userArns;
    }

    public GrantRoleToUsersRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
