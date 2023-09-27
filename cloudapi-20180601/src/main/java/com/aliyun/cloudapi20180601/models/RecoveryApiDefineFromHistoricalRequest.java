// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20180601.models;

import com.aliyun.tea.*;

public class RecoveryApiDefineFromHistoricalRequest extends TeaModel {
    @NameInMap("ApiId")
    public String apiId;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("HistoryVersion")
    public String historyVersion;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("StageName")
    public String stageName;

    public static RecoveryApiDefineFromHistoricalRequest build(java.util.Map<String, ?> map) throws Exception {
        RecoveryApiDefineFromHistoricalRequest self = new RecoveryApiDefineFromHistoricalRequest();
        return TeaModel.build(map, self);
    }

    public RecoveryApiDefineFromHistoricalRequest setApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }
    public String getApiId() {
        return this.apiId;
    }

    public RecoveryApiDefineFromHistoricalRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public RecoveryApiDefineFromHistoricalRequest setHistoryVersion(String historyVersion) {
        this.historyVersion = historyVersion;
        return this;
    }
    public String getHistoryVersion() {
        return this.historyVersion;
    }

    public RecoveryApiDefineFromHistoricalRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public RecoveryApiDefineFromHistoricalRequest setStageName(String stageName) {
        this.stageName = stageName;
        return this;
    }
    public String getStageName() {
        return this.stageName;
    }

}
