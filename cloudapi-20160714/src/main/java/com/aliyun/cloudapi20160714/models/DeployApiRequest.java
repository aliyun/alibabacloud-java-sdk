// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DeployApiRequest extends TeaModel {
    /**
     * <p>The ID of the API.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>d6f679aeb3be4b91b3688e887ca1fe16</p>
     */
    @NameInMap("ApiId")
    public String apiId;

    /**
     * <p>The publishing remarks.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>for_test1</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the API group.</p>
     * 
     * <strong>example:</strong>
     * <p>63be9002440b4778a61122f14c2b2bbb</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The name of the runtime environment. Valid values:</p>
     * <ul>
     * <li><strong>RELEASE</strong></li>
     * <li><strong>PRE</strong>: the pre-release environment</li>
     * <li><strong>TEST</strong></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>RELEASE</p>
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
