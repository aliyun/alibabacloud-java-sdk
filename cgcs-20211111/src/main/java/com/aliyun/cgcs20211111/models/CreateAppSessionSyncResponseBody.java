// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class CreateAppSessionSyncResponseBody extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("AppVersion")
    public String appVersion;

    @NameInMap("BizInfo")
    public CreateAppSessionSyncResponseBodyBizInfo bizInfo;

    @NameInMap("CustomSessionId")
    public String customSessionId;

    @NameInMap("PlatformSessionId")
    public String platformSessionId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateAppSessionSyncResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAppSessionSyncResponseBody self = new CreateAppSessionSyncResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAppSessionSyncResponseBody setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateAppSessionSyncResponseBody setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public String getAppVersion() {
        return this.appVersion;
    }

    public CreateAppSessionSyncResponseBody setBizInfo(CreateAppSessionSyncResponseBodyBizInfo bizInfo) {
        this.bizInfo = bizInfo;
        return this;
    }
    public CreateAppSessionSyncResponseBodyBizInfo getBizInfo() {
        return this.bizInfo;
    }

    public CreateAppSessionSyncResponseBody setCustomSessionId(String customSessionId) {
        this.customSessionId = customSessionId;
        return this;
    }
    public String getCustomSessionId() {
        return this.customSessionId;
    }

    public CreateAppSessionSyncResponseBody setPlatformSessionId(String platformSessionId) {
        this.platformSessionId = platformSessionId;
        return this;
    }
    public String getPlatformSessionId() {
        return this.platformSessionId;
    }

    public CreateAppSessionSyncResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateAppSessionSyncResponseBodyBizInfoEndpoints extends TeaModel {
        @NameInMap("AccessHost")
        public String accessHost;

        @NameInMap("AccessPort")
        public String accessPort;

        @NameInMap("DistrictId")
        public String districtId;

        @NameInMap("Isp")
        public String isp;

        @NameInMap("Name")
        public String name;

        @NameInMap("Type")
        public String type;

        public static CreateAppSessionSyncResponseBodyBizInfoEndpoints build(java.util.Map<String, ?> map) throws Exception {
            CreateAppSessionSyncResponseBodyBizInfoEndpoints self = new CreateAppSessionSyncResponseBodyBizInfoEndpoints();
            return TeaModel.build(map, self);
        }

        public CreateAppSessionSyncResponseBodyBizInfoEndpoints setAccessHost(String accessHost) {
            this.accessHost = accessHost;
            return this;
        }
        public String getAccessHost() {
            return this.accessHost;
        }

        public CreateAppSessionSyncResponseBodyBizInfoEndpoints setAccessPort(String accessPort) {
            this.accessPort = accessPort;
            return this;
        }
        public String getAccessPort() {
            return this.accessPort;
        }

        public CreateAppSessionSyncResponseBodyBizInfoEndpoints setDistrictId(String districtId) {
            this.districtId = districtId;
            return this;
        }
        public String getDistrictId() {
            return this.districtId;
        }

        public CreateAppSessionSyncResponseBodyBizInfoEndpoints setIsp(String isp) {
            this.isp = isp;
            return this;
        }
        public String getIsp() {
            return this.isp;
        }

        public CreateAppSessionSyncResponseBodyBizInfoEndpoints setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateAppSessionSyncResponseBodyBizInfoEndpoints setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateAppSessionSyncResponseBodyBizInfo extends TeaModel {
        @NameInMap("Biz")
        public java.util.Map<String, ?> biz;

        @NameInMap("Endpoints")
        public java.util.List<CreateAppSessionSyncResponseBodyBizInfoEndpoints> endpoints;

        public static CreateAppSessionSyncResponseBodyBizInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateAppSessionSyncResponseBodyBizInfo self = new CreateAppSessionSyncResponseBodyBizInfo();
            return TeaModel.build(map, self);
        }

        public CreateAppSessionSyncResponseBodyBizInfo setBiz(java.util.Map<String, ?> biz) {
            this.biz = biz;
            return this;
        }
        public java.util.Map<String, ?> getBiz() {
            return this.biz;
        }

        public CreateAppSessionSyncResponseBodyBizInfo setEndpoints(java.util.List<CreateAppSessionSyncResponseBodyBizInfoEndpoints> endpoints) {
            this.endpoints = endpoints;
            return this;
        }
        public java.util.List<CreateAppSessionSyncResponseBodyBizInfoEndpoints> getEndpoints() {
            return this.endpoints;
        }

    }

}
