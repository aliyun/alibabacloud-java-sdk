// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avatar20220130.models;

import com.aliyun.tea.*;

public class QueryRunningInstanceRequest extends TeaModel {
    @NameInMap("App")
    public QueryRunningInstanceRequestApp app;

    @NameInMap("SessionId")
    public String sessionId;

    @NameInMap("TenantId")
    public Long tenantId;

    public static QueryRunningInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRunningInstanceRequest self = new QueryRunningInstanceRequest();
        return TeaModel.build(map, self);
    }

    public QueryRunningInstanceRequest setApp(QueryRunningInstanceRequestApp app) {
        this.app = app;
        return this;
    }
    public QueryRunningInstanceRequestApp getApp() {
        return this.app;
    }

    public QueryRunningInstanceRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public QueryRunningInstanceRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

    public static class QueryRunningInstanceRequestApp extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        public static QueryRunningInstanceRequestApp build(java.util.Map<String, ?> map) throws Exception {
            QueryRunningInstanceRequestApp self = new QueryRunningInstanceRequestApp();
            return TeaModel.build(map, self);
        }

        public QueryRunningInstanceRequestApp setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

    }

}
