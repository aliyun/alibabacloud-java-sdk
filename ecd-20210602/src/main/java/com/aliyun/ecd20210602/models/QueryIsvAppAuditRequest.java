// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class QueryIsvAppAuditRequest extends TeaModel {
    @NameInMap("AppId")
    public Integer appId;

    @NameInMap("AppVersion")
    public String appVersion;

    public static QueryIsvAppAuditRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryIsvAppAuditRequest self = new QueryIsvAppAuditRequest();
        return TeaModel.build(map, self);
    }

    public QueryIsvAppAuditRequest setAppId(Integer appId) {
        this.appId = appId;
        return this;
    }
    public Integer getAppId() {
        return this.appId;
    }

    public QueryIsvAppAuditRequest setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public String getAppVersion() {
        return this.appVersion;
    }

}
