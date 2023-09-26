// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160701.models;

import com.aliyun.tea.*;

public class RemoveIpControlApisRequest extends TeaModel {
    @NameInMap("ApiIds")
    public String apiIds;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("IpControlId")
    public String ipControlId;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("StageName")
    public String stageName;

    public static RemoveIpControlApisRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveIpControlApisRequest self = new RemoveIpControlApisRequest();
        return TeaModel.build(map, self);
    }

    public RemoveIpControlApisRequest setApiIds(String apiIds) {
        this.apiIds = apiIds;
        return this;
    }
    public String getApiIds() {
        return this.apiIds;
    }

    public RemoveIpControlApisRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public RemoveIpControlApisRequest setIpControlId(String ipControlId) {
        this.ipControlId = ipControlId;
        return this;
    }
    public String getIpControlId() {
        return this.ipControlId;
    }

    public RemoveIpControlApisRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public RemoveIpControlApisRequest setStageName(String stageName) {
        this.stageName = stageName;
        return this;
    }
    public String getStageName() {
        return this.stageName;
    }

}
