// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DeployApiRequest extends TeaModel {
    /**
     * <p>The publishing remarks.</p>
     */
    @NameInMap("ApiId")
    public String apiId;

    /**
     * <p>*   This operation is intended for API providers. Only the API that you have defined and published to a runtime environment can be called.</p>
     * <p>*   An API is published to a cluster in less than 5 seconds.</p>
     * <p>*   The QPS limit on this operation is 50 per user.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the runtime environment. Valid values:</p>
     * <br>
     * <p>*   **RELEASE**</p>
     * <p>*   **PRE: the pre-release environment**</p>
     * <p>*   **TEST: the test environment**</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("StageName")
    public String stageName;

    public static DeployApiRequest build(java.util.Map<String, ?> map) throws Exception {
        DeployApiRequest self = new DeployApiRequest();
        return TeaModel.build(map, self);
    }

    public DeployApiRequest setApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }
    public String getApiId() {
        return this.apiId;
    }

    public DeployApiRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DeployApiRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DeployApiRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DeployApiRequest setStageName(String stageName) {
        this.stageName = stageName;
        return this;
    }
    public String getStageName() {
        return this.stageName;
    }

}
