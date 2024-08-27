// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class SwitchApiRequest extends TeaModel {
    /**
     * <p>The API ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>d6f679aeb3be4b91b3688e887ca1fe16</p>
     */
    @NameInMap("ApiId")
    public String apiId;

    /**
     * <p>The description. The description can be up to 200 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>for_demo</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The API group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The historical version number of the API.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20160705104552292</p>
     */
    @NameInMap("HistoryVersion")
    public String historyVersion;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The environment. Valid values:</p>
     * <ul>
     * <li><strong>RELEASE</strong>: the production environment</li>
     * <li><strong>PRE</strong>: the staging environment</li>
     * <li><strong>TEST</strong>: the test environment</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>RELEASE</p>
     */
    @NameInMap("StageName")
    public String stageName;

    public static SwitchApiRequest build(java.util.Map<String, ?> map) throws Exception {
        SwitchApiRequest self = new SwitchApiRequest();
        return TeaModel.build(map, self);
    }

    public SwitchApiRequest setApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }
    public String getApiId() {
        return this.apiId;
    }

    public SwitchApiRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SwitchApiRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public SwitchApiRequest setHistoryVersion(String historyVersion) {
        this.historyVersion = historyVersion;
        return this;
    }
    public String getHistoryVersion() {
        return this.historyVersion;
    }

    public SwitchApiRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public SwitchApiRequest setStageName(String stageName) {
        this.stageName = stageName;
        return this;
    }
    public String getStageName() {
        return this.stageName;
    }

}
