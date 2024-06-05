// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_dg20230914.models;

import com.aliyun.tea.*;

public class FindUserGatewayByIdResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("Gateway")
    public FindUserGatewayByIdResponseBodyGateway gateway;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static FindUserGatewayByIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FindUserGatewayByIdResponseBody self = new FindUserGatewayByIdResponseBody();
        return TeaModel.build(map, self);
    }

    public FindUserGatewayByIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public FindUserGatewayByIdResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public FindUserGatewayByIdResponseBody setGateway(FindUserGatewayByIdResponseBodyGateway gateway) {
        this.gateway = gateway;
        return this;
    }
    public FindUserGatewayByIdResponseBodyGateway getGateway() {
        return this.gateway;
    }

    public FindUserGatewayByIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FindUserGatewayByIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class FindUserGatewayByIdResponseBodyGateway extends TeaModel {
        @NameInMap("CreatorId")
        public String creatorId;

        @NameInMap("DgVersion")
        public String dgVersion;

        @NameInMap("ExceptionMsg")
        public String exceptionMsg;

        /**
         * <p>网关的描述</p>
         */
        @NameInMap("GatewayDesc")
        public String gatewayDesc;

        /**
         * <p>网关的编号</p>
         */
        @NameInMap("GatewayId")
        public String gatewayId;

        /**
         * <p>网关的名称</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("GatewayName")
        public String gatewayName;

        @NameInMap("NumOfExceptionInstance")
        public Integer numOfExceptionInstance;

        @NameInMap("NumOfRunningInstance")
        public Integer numOfRunningInstance;

        /**
         * <p>地域的编号</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>网关的状态</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>用户的编号</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static FindUserGatewayByIdResponseBodyGateway build(java.util.Map<String, ?> map) throws Exception {
            FindUserGatewayByIdResponseBodyGateway self = new FindUserGatewayByIdResponseBodyGateway();
            return TeaModel.build(map, self);
        }

        public FindUserGatewayByIdResponseBodyGateway setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public FindUserGatewayByIdResponseBodyGateway setDgVersion(String dgVersion) {
            this.dgVersion = dgVersion;
            return this;
        }
        public String getDgVersion() {
            return this.dgVersion;
        }

        public FindUserGatewayByIdResponseBodyGateway setExceptionMsg(String exceptionMsg) {
            this.exceptionMsg = exceptionMsg;
            return this;
        }
        public String getExceptionMsg() {
            return this.exceptionMsg;
        }

        public FindUserGatewayByIdResponseBodyGateway setGatewayDesc(String gatewayDesc) {
            this.gatewayDesc = gatewayDesc;
            return this;
        }
        public String getGatewayDesc() {
            return this.gatewayDesc;
        }

        public FindUserGatewayByIdResponseBodyGateway setGatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public String getGatewayId() {
            return this.gatewayId;
        }

        public FindUserGatewayByIdResponseBodyGateway setGatewayName(String gatewayName) {
            this.gatewayName = gatewayName;
            return this;
        }
        public String getGatewayName() {
            return this.gatewayName;
        }

        public FindUserGatewayByIdResponseBodyGateway setNumOfExceptionInstance(Integer numOfExceptionInstance) {
            this.numOfExceptionInstance = numOfExceptionInstance;
            return this;
        }
        public Integer getNumOfExceptionInstance() {
            return this.numOfExceptionInstance;
        }

        public FindUserGatewayByIdResponseBodyGateway setNumOfRunningInstance(Integer numOfRunningInstance) {
            this.numOfRunningInstance = numOfRunningInstance;
            return this;
        }
        public Integer getNumOfRunningInstance() {
            return this.numOfRunningInstance;
        }

        public FindUserGatewayByIdResponseBodyGateway setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public FindUserGatewayByIdResponseBodyGateway setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public FindUserGatewayByIdResponseBodyGateway setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
