// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160701.models;

import com.aliyun.tea.*;

public class DescribeRaceWorkForInnerRequest extends TeaModel {
    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DescribeRaceWorkForInnerRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRaceWorkForInnerRequest self = new DescribeRaceWorkForInnerRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRaceWorkForInnerRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeRaceWorkForInnerRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
