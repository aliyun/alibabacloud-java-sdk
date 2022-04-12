// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class InsertApplicationResponseBody extends TeaModel {
    @NameInMap("ApplicationInfo")
    public InsertApplicationResponseBodyApplicationInfo applicationInfo;

    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static InsertApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InsertApplicationResponseBody self = new InsertApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public InsertApplicationResponseBody setApplicationInfo(InsertApplicationResponseBodyApplicationInfo applicationInfo) {
        this.applicationInfo = applicationInfo;
        return this;
    }
    public InsertApplicationResponseBodyApplicationInfo getApplicationInfo() {
        return this.applicationInfo;
    }

    public InsertApplicationResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public InsertApplicationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public InsertApplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class InsertApplicationResponseBodyApplicationInfo extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("ChangeOrderId")
        public String changeOrderId;

        @NameInMap("Dockerize")
        public Boolean dockerize;

        @NameInMap("Owner")
        public String owner;

        @NameInMap("Port")
        public Integer port;

        @NameInMap("RegionName")
        public String regionName;

        @NameInMap("UserId")
        public String userId;

        public static InsertApplicationResponseBodyApplicationInfo build(java.util.Map<String, ?> map) throws Exception {
            InsertApplicationResponseBodyApplicationInfo self = new InsertApplicationResponseBodyApplicationInfo();
            return TeaModel.build(map, self);
        }

        public InsertApplicationResponseBodyApplicationInfo setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public InsertApplicationResponseBodyApplicationInfo setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public InsertApplicationResponseBodyApplicationInfo setChangeOrderId(String changeOrderId) {
            this.changeOrderId = changeOrderId;
            return this;
        }
        public String getChangeOrderId() {
            return this.changeOrderId;
        }

        public InsertApplicationResponseBodyApplicationInfo setDockerize(Boolean dockerize) {
            this.dockerize = dockerize;
            return this;
        }
        public Boolean getDockerize() {
            return this.dockerize;
        }

        public InsertApplicationResponseBodyApplicationInfo setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public InsertApplicationResponseBodyApplicationInfo setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public InsertApplicationResponseBodyApplicationInfo setRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }
        public String getRegionName() {
            return this.regionName;
        }

        public InsertApplicationResponseBodyApplicationInfo setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
