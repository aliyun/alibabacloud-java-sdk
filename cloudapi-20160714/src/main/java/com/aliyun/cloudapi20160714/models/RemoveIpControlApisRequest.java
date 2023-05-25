// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class RemoveIpControlApisRequest extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("ApiIds")
    public String apiIds;

    /**
     * <p>The name of the runtime environment. Valid values:</p>
     * <br>
     * <p>*   **RELEASE**</p>
     * <p>*   **TEST**</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The ID of the API to be managed.</p>
     * <br>
     * <p>*   If this parameter is not specified, all APIs of the API group are unbound in the specified environment by default.</p>
     * <p>*   The IDs of the APIs that you want to query. Separate multiple IDs with commas (,). A maximum of 100 IDs can be entered.</p>
     */
    @NameInMap("IpControlId")
    public String ipControlId;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>*   This API is intended for API providers.</p>
     * <p>*   The unbinding takes effect immediately. After the API is unbound from the ACL, the corresponding environment does not have any IP address access control in place for the API.</p>
     */
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
