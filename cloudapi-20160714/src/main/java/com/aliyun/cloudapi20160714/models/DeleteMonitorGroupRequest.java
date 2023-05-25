// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DeleteMonitorGroupRequest extends TeaModel {
    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("RawMonitorGroupId")
    public Long rawMonitorGroupId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DeleteMonitorGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMonitorGroupRequest self = new DeleteMonitorGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMonitorGroupRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DeleteMonitorGroupRequest setRawMonitorGroupId(Long rawMonitorGroupId) {
        this.rawMonitorGroupId = rawMonitorGroupId;
        return this;
    }
    public Long getRawMonitorGroupId() {
        return this.rawMonitorGroupId;
    }

    public DeleteMonitorGroupRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
