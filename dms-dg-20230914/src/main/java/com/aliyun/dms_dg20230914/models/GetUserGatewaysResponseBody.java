// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_dg20230914.models;

import com.aliyun.tea.*;

public class GetUserGatewaysResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Count")
    public Integer count;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("GatewayList")
    public GetUserGatewaysResponseBodyGatewayList gatewayList;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetUserGatewaysResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserGatewaysResponseBody self = new GetUserGatewaysResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserGatewaysResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetUserGatewaysResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public GetUserGatewaysResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public GetUserGatewaysResponseBody setGatewayList(GetUserGatewaysResponseBodyGatewayList gatewayList) {
        this.gatewayList = gatewayList;
        return this;
    }
    public GetUserGatewaysResponseBodyGatewayList getGatewayList() {
        return this.gatewayList;
    }

    public GetUserGatewaysResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUserGatewaysResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetUserGatewaysResponseBodyGatewayListGateway extends TeaModel {
        /**
         * <p>创建用户id</p>
         */
        @NameInMap("CreatorId")
        public String creatorId;

        /**
         * <p>网关版本</p>
         */
        @NameInMap("DgVersion")
        public String dgVersion;

        /**
         * <p>网关异常信息</p>
         */
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

        /**
         * <p>异常实例数量</p>
         */
        @NameInMap("NumOfExceptionInstance")
        public Integer numOfExceptionInstance;

        /**
         * <p>运行中实例数量</p>
         */
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

        public static GetUserGatewaysResponseBodyGatewayListGateway build(java.util.Map<String, ?> map) throws Exception {
            GetUserGatewaysResponseBodyGatewayListGateway self = new GetUserGatewaysResponseBodyGatewayListGateway();
            return TeaModel.build(map, self);
        }

        public GetUserGatewaysResponseBodyGatewayListGateway setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public GetUserGatewaysResponseBodyGatewayListGateway setDgVersion(String dgVersion) {
            this.dgVersion = dgVersion;
            return this;
        }
        public String getDgVersion() {
            return this.dgVersion;
        }

        public GetUserGatewaysResponseBodyGatewayListGateway setExceptionMsg(String exceptionMsg) {
            this.exceptionMsg = exceptionMsg;
            return this;
        }
        public String getExceptionMsg() {
            return this.exceptionMsg;
        }

        public GetUserGatewaysResponseBodyGatewayListGateway setGatewayDesc(String gatewayDesc) {
            this.gatewayDesc = gatewayDesc;
            return this;
        }
        public String getGatewayDesc() {
            return this.gatewayDesc;
        }

        public GetUserGatewaysResponseBodyGatewayListGateway setGatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public String getGatewayId() {
            return this.gatewayId;
        }

        public GetUserGatewaysResponseBodyGatewayListGateway setGatewayName(String gatewayName) {
            this.gatewayName = gatewayName;
            return this;
        }
        public String getGatewayName() {
            return this.gatewayName;
        }

        public GetUserGatewaysResponseBodyGatewayListGateway setNumOfExceptionInstance(Integer numOfExceptionInstance) {
            this.numOfExceptionInstance = numOfExceptionInstance;
            return this;
        }
        public Integer getNumOfExceptionInstance() {
            return this.numOfExceptionInstance;
        }

        public GetUserGatewaysResponseBodyGatewayListGateway setNumOfRunningInstance(Integer numOfRunningInstance) {
            this.numOfRunningInstance = numOfRunningInstance;
            return this;
        }
        public Integer getNumOfRunningInstance() {
            return this.numOfRunningInstance;
        }

        public GetUserGatewaysResponseBodyGatewayListGateway setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetUserGatewaysResponseBodyGatewayListGateway setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetUserGatewaysResponseBodyGatewayListGateway setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class GetUserGatewaysResponseBodyGatewayList extends TeaModel {
        @NameInMap("Gateway")
        public java.util.List<GetUserGatewaysResponseBodyGatewayListGateway> gateway;

        public static GetUserGatewaysResponseBodyGatewayList build(java.util.Map<String, ?> map) throws Exception {
            GetUserGatewaysResponseBodyGatewayList self = new GetUserGatewaysResponseBodyGatewayList();
            return TeaModel.build(map, self);
        }

        public GetUserGatewaysResponseBodyGatewayList setGateway(java.util.List<GetUserGatewaysResponseBodyGatewayListGateway> gateway) {
            this.gateway = gateway;
            return this;
        }
        public java.util.List<GetUserGatewaysResponseBodyGatewayListGateway> getGateway() {
            return this.gateway;
        }

    }

}
