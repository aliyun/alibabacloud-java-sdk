// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class RecoveryApiDefineFromHistoricalRequest extends TeaModel {
    @NameInMap("ApiId")
    public String apiId;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("HistoryVersion")
    public String historyVersion;

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

    public RecoveryApiDefineFromHistoricalRequest setStageName(String stageName) {
        this.stageName = stageName;
        return this;
    }
    public String getStageName() {
        return this.stageName;
    }

}
