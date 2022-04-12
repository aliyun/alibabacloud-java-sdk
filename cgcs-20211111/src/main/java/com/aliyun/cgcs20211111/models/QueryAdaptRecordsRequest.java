// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class QueryAdaptRecordsRequest extends TeaModel {
    @NameInMap("AppVersionId")
    public String appVersionId;

    @NameInMap("RequestApp")
    public String requestApp;

    public static QueryAdaptRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAdaptRecordsRequest self = new QueryAdaptRecordsRequest();
        return TeaModel.build(map, self);
    }

    public QueryAdaptRecordsRequest setAppVersionId(String appVersionId) {
        this.appVersionId = appVersionId;
        return this;
    }
    public String getAppVersionId() {
        return this.appVersionId;
    }

    public QueryAdaptRecordsRequest setRequestApp(String requestApp) {
        this.requestApp = requestApp;
        return this;
    }
    public String getRequestApp() {
        return this.requestApp;
    }

}
