// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class SwitchApiRequest extends TeaModel {
    /**
     * <p>The description of the switch operation.</p>
     */
    @NameInMap("ApiId")
    public String apiId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the runtime environment. Valid values:</p>
     * <br>
     * <p>*   **RELEASE**</p>
     * <p>*   **TEST**</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>*   This API is intended for API providers.</p>
     * <p>*   The historical version can be obtained through the DescribeHistoryApis API.****</p>
     * <p>*   Only APIs that have been published more than once have historical versions to switch to.</p>
     * <p>*   This operation can only be performed on running APIs. Use caution when performing this operation because the operation cannot be undone after it has been completed and takes effect within 5 seconds.</p>
     * <p>*   The switch operation is in essence a publish operation, and the reason for this operation must be provided.</p>
     */
    @NameInMap("HistoryVersion")
    public String historyVersion;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The historical version you want to switch to.</p>
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
