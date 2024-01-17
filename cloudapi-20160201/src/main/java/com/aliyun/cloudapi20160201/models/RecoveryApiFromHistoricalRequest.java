// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class RecoveryApiFromHistoricalRequest extends TeaModel {
    @NameInMap("ApiId")
    public String apiId;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("HistoryVersion")
    public String historyVersion;

    @NameInMap("StageName")
    public String stageName;

    public static RecoveryApiFromHistoricalRequest build(java.util.Map<String, ?> map) throws Exception {
        RecoveryApiFromHistoricalRequest self = new RecoveryApiFromHistoricalRequest();
        return TeaModel.build(map, self);
    }

    public RecoveryApiFromHistoricalRequest setApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }
    public String getApiId() {
        return this.apiId;
    }

    public RecoveryApiFromHistoricalRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public RecoveryApiFromHistoricalRequest setHistoryVersion(String historyVersion) {
        this.historyVersion = historyVersion;
        return this;
    }
    public String getHistoryVersion() {
        return this.historyVersion;
    }

    public RecoveryApiFromHistoricalRequest setStageName(String stageName) {
        this.stageName = stageName;
        return this;
    }
    public String getStageName() {
        return this.stageName;
    }

}
