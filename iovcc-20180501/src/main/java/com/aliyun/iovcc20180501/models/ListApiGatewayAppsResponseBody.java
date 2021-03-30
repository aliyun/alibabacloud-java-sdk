// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListApiGatewayAppsResponseBody extends TeaModel {
    @NameInMap("ApiGatewayApps")
    public java.util.List<ListApiGatewayAppsResponseBodyApiGatewayApps> apiGatewayApps;

    @NameInMap("RequestId")
    public String requestId;

    public static ListApiGatewayAppsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListApiGatewayAppsResponseBody self = new ListApiGatewayAppsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListApiGatewayAppsResponseBody setApiGatewayApps(java.util.List<ListApiGatewayAppsResponseBodyApiGatewayApps> apiGatewayApps) {
        this.apiGatewayApps = apiGatewayApps;
        return this;
    }
    public java.util.List<ListApiGatewayAppsResponseBodyApiGatewayApps> getApiGatewayApps() {
        return this.apiGatewayApps;
    }

    public ListApiGatewayAppsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListApiGatewayAppsResponseBodyApiGatewayApps extends TeaModel {
        @NameInMap("GatewayAppKey")
        public String gatewayAppKey;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("GatewayAppSecret")
        public String gatewayAppSecret;

        @NameInMap("GatewayAppId")
        public String gatewayAppId;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("ProjectId")
        public String projectId;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("Id")
        public Long id;

        public static ListApiGatewayAppsResponseBodyApiGatewayApps build(java.util.Map<String, ?> map) throws Exception {
            ListApiGatewayAppsResponseBodyApiGatewayApps self = new ListApiGatewayAppsResponseBodyApiGatewayApps();
            return TeaModel.build(map, self);
        }

        public ListApiGatewayAppsResponseBodyApiGatewayApps setGatewayAppKey(String gatewayAppKey) {
            this.gatewayAppKey = gatewayAppKey;
            return this;
        }
        public String getGatewayAppKey() {
            return this.gatewayAppKey;
        }

        public ListApiGatewayAppsResponseBodyApiGatewayApps setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListApiGatewayAppsResponseBodyApiGatewayApps setGatewayAppSecret(String gatewayAppSecret) {
            this.gatewayAppSecret = gatewayAppSecret;
            return this;
        }
        public String getGatewayAppSecret() {
            return this.gatewayAppSecret;
        }

        public ListApiGatewayAppsResponseBodyApiGatewayApps setGatewayAppId(String gatewayAppId) {
            this.gatewayAppId = gatewayAppId;
            return this;
        }
        public String getGatewayAppId() {
            return this.gatewayAppId;
        }

        public ListApiGatewayAppsResponseBodyApiGatewayApps setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListApiGatewayAppsResponseBodyApiGatewayApps setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public ListApiGatewayAppsResponseBodyApiGatewayApps setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListApiGatewayAppsResponseBodyApiGatewayApps setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ListApiGatewayAppsResponseBodyApiGatewayApps setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
