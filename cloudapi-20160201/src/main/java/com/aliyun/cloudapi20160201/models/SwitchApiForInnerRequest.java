// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class SwitchApiForInnerRequest extends TeaModel {
    @NameInMap("ApiId")
    public String apiId;

    @NameInMap("Description")
    public String description;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("HistoryVersion")
    public String historyVersion;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("StageName")
    public String stageName;

    public static SwitchApiForInnerRequest build(java.util.Map<String, ?> map) throws Exception {
        SwitchApiForInnerRequest self = new SwitchApiForInnerRequest();
        return TeaModel.build(map, self);
    }

    public SwitchApiForInnerRequest setApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }
    public String getApiId() {
        return this.apiId;
    }

    public SwitchApiForInnerRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SwitchApiForInnerRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public SwitchApiForInnerRequest setHistoryVersion(String historyVersion) {
        this.historyVersion = historyVersion;
        return this;
    }
    public String getHistoryVersion() {
        return this.historyVersion;
    }

    public SwitchApiForInnerRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public SwitchApiForInnerRequest setStageName(String stageName) {
        this.stageName = stageName;
        return this;
    }
    public String getStageName() {
        return this.stageName;
    }

}
