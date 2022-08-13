// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class QueryOfflineTaskProgressRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("VersionId")
    public String versionId;

    public static QueryOfflineTaskProgressRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryOfflineTaskProgressRequest self = new QueryOfflineTaskProgressRequest();
        return TeaModel.build(map, self);
    }

    public QueryOfflineTaskProgressRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public QueryOfflineTaskProgressRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

}
