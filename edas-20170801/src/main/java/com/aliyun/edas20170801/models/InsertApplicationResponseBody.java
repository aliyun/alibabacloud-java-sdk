// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class InsertApplicationResponseBody extends TeaModel {
    /**
     * <p>The information about the created application.</p>
     */
    @NameInMap("ApplicationInfo")
    public InsertApplicationResponseBodyApplicationInfo applicationInfo;

    /**
     * <p>The HTTP status code that is returned.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The message that is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
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
        /**
         * <p>The ID of the application. The ID is the unique identifier of the application in EDAS.</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The name of the application.</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The ID of the change process.</p>
         */
        @NameInMap("ChangeOrderId")
        public String changeOrderId;

        /**
         * <p>Indicates whether the application is a Docker application. Valid values:</p>
         * <br>
         * <p>*   **true**: The application is a Docker application.</p>
         * <p>*   **false**: The application is not a Docker application.</p>
         */
        @NameInMap("Dockerize")
        public Boolean dockerize;

        /**
         * <p>The owner of the application. The owner is the user who created the application.</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The port used by the created application. Default value: 8080. You can call the UpdateContainerConfiguration operation to change the port. For more information, see [UpdateContainerConfiguration](~~149403~~).</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The name of the region.</p>
         */
        @NameInMap("RegionName")
        public String regionName;

        /**
         * <p>The ID of the user who created the application.</p>
         */
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
