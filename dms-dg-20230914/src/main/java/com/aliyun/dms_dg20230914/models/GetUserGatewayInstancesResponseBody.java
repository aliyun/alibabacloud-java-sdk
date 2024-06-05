// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_dg20230914.models;

import com.aliyun.tea.*;

public class GetUserGatewayInstancesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("GatewayInstanceList")
    public java.util.List<GetUserGatewayInstancesResponseBodyGatewayInstanceList> gatewayInstanceList;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetUserGatewayInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserGatewayInstancesResponseBody self = new GetUserGatewayInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserGatewayInstancesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetUserGatewayInstancesResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public GetUserGatewayInstancesResponseBody setGatewayInstanceList(java.util.List<GetUserGatewayInstancesResponseBodyGatewayInstanceList> gatewayInstanceList) {
        this.gatewayInstanceList = gatewayInstanceList;
        return this;
    }
    public java.util.List<GetUserGatewayInstancesResponseBodyGatewayInstanceList> getGatewayInstanceList() {
        return this.gatewayInstanceList;
    }

    public GetUserGatewayInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUserGatewayInstancesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetUserGatewayInstancesResponseBodyGatewayInstanceList extends TeaModel {
        /**
         * <p>连接类型</p>
         */
        @NameInMap("ConnectEndpointType")
        public String connectEndpointType;

        /**
         * <p>进程的版本号</p>
         */
        @NameInMap("CurrentDaemonVersion")
        public String currentDaemonVersion;

        /**
         * <p>版本号</p>
         */
        @NameInMap("CurrentVersion")
        public String currentVersion;

        /**
         * <p>端点地址</p>
         */
        @NameInMap("EndPoint")
        public String endPoint;

        /**
         * <p>网关ID</p>
         */
        @NameInMap("GatewayId")
        public String gatewayId;

        /**
         * <p>代表资源一级ID的资源属性字段</p>
         */
        @NameInMap("GatewayInstanceId")
        public String gatewayInstanceId;

        @NameInMap("GatewayInstanceStatus")
        public String gatewayInstanceStatus;

        /**
         * <p>上次更新时间戳</p>
         */
        @NameInMap("LastUpdateTime")
        public Long lastUpdateTime;

        /**
         * <p>本地IP地址</p>
         */
        @NameInMap("LocalIP")
        public String localIP;

        /**
         * <p>提示信息</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>主机</p>
         */
        @NameInMap("OutputIP")
        public String outputIP;

        /**
         * <p>代表region的资源属性字段</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        public static GetUserGatewayInstancesResponseBodyGatewayInstanceList build(java.util.Map<String, ?> map) throws Exception {
            GetUserGatewayInstancesResponseBodyGatewayInstanceList self = new GetUserGatewayInstancesResponseBodyGatewayInstanceList();
            return TeaModel.build(map, self);
        }

        public GetUserGatewayInstancesResponseBodyGatewayInstanceList setConnectEndpointType(String connectEndpointType) {
            this.connectEndpointType = connectEndpointType;
            return this;
        }
        public String getConnectEndpointType() {
            return this.connectEndpointType;
        }

        public GetUserGatewayInstancesResponseBodyGatewayInstanceList setCurrentDaemonVersion(String currentDaemonVersion) {
            this.currentDaemonVersion = currentDaemonVersion;
            return this;
        }
        public String getCurrentDaemonVersion() {
            return this.currentDaemonVersion;
        }

        public GetUserGatewayInstancesResponseBodyGatewayInstanceList setCurrentVersion(String currentVersion) {
            this.currentVersion = currentVersion;
            return this;
        }
        public String getCurrentVersion() {
            return this.currentVersion;
        }

        public GetUserGatewayInstancesResponseBodyGatewayInstanceList setEndPoint(String endPoint) {
            this.endPoint = endPoint;
            return this;
        }
        public String getEndPoint() {
            return this.endPoint;
        }

        public GetUserGatewayInstancesResponseBodyGatewayInstanceList setGatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public String getGatewayId() {
            return this.gatewayId;
        }

        public GetUserGatewayInstancesResponseBodyGatewayInstanceList setGatewayInstanceId(String gatewayInstanceId) {
            this.gatewayInstanceId = gatewayInstanceId;
            return this;
        }
        public String getGatewayInstanceId() {
            return this.gatewayInstanceId;
        }

        public GetUserGatewayInstancesResponseBodyGatewayInstanceList setGatewayInstanceStatus(String gatewayInstanceStatus) {
            this.gatewayInstanceStatus = gatewayInstanceStatus;
            return this;
        }
        public String getGatewayInstanceStatus() {
            return this.gatewayInstanceStatus;
        }

        public GetUserGatewayInstancesResponseBodyGatewayInstanceList setLastUpdateTime(Long lastUpdateTime) {
            this.lastUpdateTime = lastUpdateTime;
            return this;
        }
        public Long getLastUpdateTime() {
            return this.lastUpdateTime;
        }

        public GetUserGatewayInstancesResponseBodyGatewayInstanceList setLocalIP(String localIP) {
            this.localIP = localIP;
            return this;
        }
        public String getLocalIP() {
            return this.localIP;
        }

        public GetUserGatewayInstancesResponseBodyGatewayInstanceList setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetUserGatewayInstancesResponseBodyGatewayInstanceList setOutputIP(String outputIP) {
            this.outputIP = outputIP;
            return this;
        }
        public String getOutputIP() {
            return this.outputIP;
        }

        public GetUserGatewayInstancesResponseBodyGatewayInstanceList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
