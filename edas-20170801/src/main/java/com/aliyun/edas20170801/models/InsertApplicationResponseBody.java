// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class InsertApplicationResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ApplicationInfo")
    public InsertApplicationResponseBodyApplicationInfo applicationInfo;

    @NameInMap("Code")
    public Integer code;

    public static InsertApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InsertApplicationResponseBody self = new InsertApplicationResponseBody();
        return TeaModel.build(map, self);
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

    public static class InsertApplicationResponseBodyApplicationInfo extends TeaModel {
        @NameInMap("ChangeOrderId")
        public String changeOrderId;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("Owner")
        public String owner;

        @NameInMap("Dockerize")
        public Boolean dockerize;

        @NameInMap("RegionName")
        public String regionName;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("Port")
        public Integer port;

        public static InsertApplicationResponseBodyApplicationInfo build(java.util.Map<String, ?> map) throws Exception {
            InsertApplicationResponseBodyApplicationInfo self = new InsertApplicationResponseBodyApplicationInfo();
            return TeaModel.build(map, self);
        }

        public InsertApplicationResponseBodyApplicationInfo setChangeOrderId(String changeOrderId) {
            this.changeOrderId = changeOrderId;
            return this;
        }
        public String getChangeOrderId() {
            return this.changeOrderId;
        }

        public InsertApplicationResponseBodyApplicationInfo setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public InsertApplicationResponseBodyApplicationInfo setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public InsertApplicationResponseBodyApplicationInfo setDockerize(Boolean dockerize) {
            this.dockerize = dockerize;
            return this;
        }
        public Boolean getDockerize() {
            return this.dockerize;
        }

        public InsertApplicationResponseBodyApplicationInfo setRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }
        public String getRegionName() {
            return this.regionName;
        }

        public InsertApplicationResponseBodyApplicationInfo setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public InsertApplicationResponseBodyApplicationInfo setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public InsertApplicationResponseBodyApplicationInfo setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

    }

}
