// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class AbolishApiRequest extends TeaModel {
    /**
     * <p>The ID of the specified API.</p>
     */
    @NameInMap("ApiId")
    public String apiId;

    /**
     * <p>The ID of the API group.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

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

    public static AbolishApiRequest build(java.util.Map<String, ?> map) throws Exception {
        AbolishApiRequest self = new AbolishApiRequest();
        return TeaModel.build(map, self);
    }

    public AbolishApiRequest setApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }
    public String getApiId() {
        return this.apiId;
    }

    public AbolishApiRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public AbolishApiRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public AbolishApiRequest setStageName(String stageName) {
        this.stageName = stageName;
        return this;
    }
    public String getStageName() {
        return this.stageName;
    }

}
