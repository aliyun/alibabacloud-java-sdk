// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class SetTrafficControlApisRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("TrafficControlId")
    public String trafficControlId;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("ApiIds")
    public String apiIds;

    @NameInMap("StageName")
    public String stageName;

    public static SetTrafficControlApisRequest build(java.util.Map<String, ?> map) throws Exception {
        SetTrafficControlApisRequest self = new SetTrafficControlApisRequest();
        return TeaModel.build(map, self);
    }

    public SetTrafficControlApisRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public SetTrafficControlApisRequest setTrafficControlId(String trafficControlId) {
        this.trafficControlId = trafficControlId;
        return this;
    }
    public String getTrafficControlId() {
        return this.trafficControlId;
    }

    public SetTrafficControlApisRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public SetTrafficControlApisRequest setApiIds(String apiIds) {
        this.apiIds = apiIds;
        return this;
    }
    public String getApiIds() {
        return this.apiIds;
    }

    public SetTrafficControlApisRequest setStageName(String stageName) {
        this.stageName = stageName;
        return this;
    }
    public String getStageName() {
        return this.stageName;
    }

}
