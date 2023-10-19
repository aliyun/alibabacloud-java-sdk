// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class RemoveTrafficControlApisRequest extends TeaModel {
    /**
     * <p>The IDs of the APIs from which you want to unbind a specified throttling policy.</p>
     * <br>
     * <p>*   If this parameter is not specified, the throttling policy is unbound from all the APIs in the specified environment of the API group.</p>
     * <p>*   Separate multiple API IDs with commas (,). A maximum of 100 API IDs can be entered.</p>
     */
    @NameInMap("ApiIds")
    public String apiIds;

    /**
     * <p>The ID of the API group containing the APIs from which you want to unbind a specified throttling policy.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The security token included in the WebSocket request header. The system uses this token to authenticate the request.</p>
     */
    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The name of the runtime environment. Valid values:</p>
     * <br>
     * <p>*   **RELEASE**</p>
     * <p>*   **TEST**</p>
     */
    @NameInMap("StageName")
    public String stageName;

    /**
     * <p>The ID of the throttling policy that you want to unbind from APIs.</p>
     */
    @NameInMap("TrafficControlId")
    public String trafficControlId;

    public static RemoveTrafficControlApisRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveTrafficControlApisRequest self = new RemoveTrafficControlApisRequest();
        return TeaModel.build(map, self);
    }

    public RemoveTrafficControlApisRequest setApiIds(String apiIds) {
        this.apiIds = apiIds;
        return this;
    }
    public String getApiIds() {
        return this.apiIds;
    }

    public RemoveTrafficControlApisRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public RemoveTrafficControlApisRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public RemoveTrafficControlApisRequest setStageName(String stageName) {
        this.stageName = stageName;
        return this;
    }
    public String getStageName() {
        return this.stageName;
    }

    public RemoveTrafficControlApisRequest setTrafficControlId(String trafficControlId) {
        this.trafficControlId = trafficControlId;
        return this;
    }
    public String getTrafficControlId() {
        return this.trafficControlId;
    }

}
