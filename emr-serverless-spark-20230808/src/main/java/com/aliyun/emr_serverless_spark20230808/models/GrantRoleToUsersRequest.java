// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class GrantRoleToUsersRequest extends TeaModel {
    @NameInMap("roleArn")
    public String roleArn;

    @NameInMap("userArns")
    public java.util.List<String> userArns;

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
