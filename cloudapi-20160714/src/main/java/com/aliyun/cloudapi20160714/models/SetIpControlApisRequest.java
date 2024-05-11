// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class SetIpControlApisRequest extends TeaModel {
    /**
     * <p>The API IDs. Separate multiple API IDs with commas (,). A maximum of 100 API IDs can be entered.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ApiIds")
    public String apiIds;

    /**
     * <p>The ID of the API group.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The ID of the ACL.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("IpControlId")
    public String ipControlId;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The name of the runtime environment. Valid values:</p>
     * <br>
     * <p>*   **RELEASE**</p>
     * <p>*   **PRE**</p>
     * <p>*   **TEST**</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("StageName")
    public String stageName;

    public static SetIpControlApisRequest build(java.util.Map<String, ?> map) throws Exception {
        SetIpControlApisRequest self = new SetIpControlApisRequest();
        return TeaModel.build(map, self);
    }

    public SetIpControlApisRequest setApiIds(String apiIds) {
        this.apiIds = apiIds;
        return this;
    }
    public String getApiIds() {
        return this.apiIds;
    }

    public SetIpControlApisRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public SetIpControlApisRequest setIpControlId(String ipControlId) {
        this.ipControlId = ipControlId;
        return this;
    }
    public String getIpControlId() {
        return this.ipControlId;
    }

    public SetIpControlApisRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public SetIpControlApisRequest setStageName(String stageName) {
        this.stageName = stageName;
        return this;
    }
    public String getStageName() {
        return this.stageName;
    }

}
