// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetGatewayAuthConsumerDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public GetGatewayAuthConsumerDetailResponseBodyData data;

    @NameInMap("DynamicCode")
    public String dynamicCode;

    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetGatewayAuthConsumerDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetGatewayAuthConsumerDetailResponseBody self = new GetGatewayAuthConsumerDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetGatewayAuthConsumerDetailResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetGatewayAuthConsumerDetailResponseBody setData(GetGatewayAuthConsumerDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetGatewayAuthConsumerDetailResponseBodyData getData() {
        return this.data;
    }

    public GetGatewayAuthConsumerDetailResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public GetGatewayAuthConsumerDetailResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public GetGatewayAuthConsumerDetailResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetGatewayAuthConsumerDetailResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetGatewayAuthConsumerDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetGatewayAuthConsumerDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetGatewayAuthConsumerDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetGatewayAuthConsumerDetailResponseBodyDataResourceList extends TeaModel {
        @NameInMap("ConsumerId")
        public Long consumerId;

        @NameInMap("GatewayUniqueId")
        public String gatewayUniqueId;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("ResourceStatus")
        public Boolean resourceStatus;

        @NameInMap("RouteId")
        public Long routeId;

        @NameInMap("RouteName")
        public String routeName;

        public static GetGatewayAuthConsumerDetailResponseBodyDataResourceList build(java.util.Map<String, ?> map) throws Exception {
            GetGatewayAuthConsumerDetailResponseBodyDataResourceList self = new GetGatewayAuthConsumerDetailResponseBodyDataResourceList();
            return TeaModel.build(map, self);
        }

        public GetGatewayAuthConsumerDetailResponseBodyDataResourceList setConsumerId(Long consumerId) {
            this.consumerId = consumerId;
            return this;
        }
        public Long getConsumerId() {
            return this.consumerId;
        }

        public GetGatewayAuthConsumerDetailResponseBodyDataResourceList setGatewayUniqueId(String gatewayUniqueId) {
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }
        public String getGatewayUniqueId() {
            return this.gatewayUniqueId;
        }

        public GetGatewayAuthConsumerDetailResponseBodyDataResourceList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetGatewayAuthConsumerDetailResponseBodyDataResourceList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetGatewayAuthConsumerDetailResponseBodyDataResourceList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetGatewayAuthConsumerDetailResponseBodyDataResourceList setResourceStatus(Boolean resourceStatus) {
            this.resourceStatus = resourceStatus;
            return this;
        }
        public Boolean getResourceStatus() {
            return this.resourceStatus;
        }

        public GetGatewayAuthConsumerDetailResponseBodyDataResourceList setRouteId(Long routeId) {
            this.routeId = routeId;
            return this;
        }
        public Long getRouteId() {
            return this.routeId;
        }

        public GetGatewayAuthConsumerDetailResponseBodyDataResourceList setRouteName(String routeName) {
            this.routeName = routeName;
            return this;
        }
        public String getRouteName() {
            return this.routeName;
        }

    }

    public static class GetGatewayAuthConsumerDetailResponseBodyData extends TeaModel {
        @NameInMap("ConsumerStatus")
        public Boolean consumerStatus;

        @NameInMap("Description")
        public String description;

        @NameInMap("EncodeType")
        public String encodeType;

        @NameInMap("GatewayUniqueId")
        public String gatewayUniqueId;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Jwks")
        public String jwks;

        @NameInMap("KeyName")
        public String keyName;

        @NameInMap("KeyValue")
        public String keyValue;

        @NameInMap("Name")
        public String name;

        @NameInMap("PrimaryUser")
        public String primaryUser;

        @NameInMap("ResourceList")
        public java.util.List<GetGatewayAuthConsumerDetailResponseBodyDataResourceList> resourceList;

        @NameInMap("TokenName")
        public String tokenName;

        @NameInMap("TokenPass")
        public Boolean tokenPass;

        @NameInMap("TokenPosition")
        public String tokenPosition;

        @NameInMap("TokenPrefix")
        public String tokenPrefix;

        @NameInMap("Type")
        public String type;

        public static GetGatewayAuthConsumerDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetGatewayAuthConsumerDetailResponseBodyData self = new GetGatewayAuthConsumerDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetGatewayAuthConsumerDetailResponseBodyData setConsumerStatus(Boolean consumerStatus) {
            this.consumerStatus = consumerStatus;
            return this;
        }
        public Boolean getConsumerStatus() {
            return this.consumerStatus;
        }

        public GetGatewayAuthConsumerDetailResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetGatewayAuthConsumerDetailResponseBodyData setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public GetGatewayAuthConsumerDetailResponseBodyData setGatewayUniqueId(String gatewayUniqueId) {
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }
        public String getGatewayUniqueId() {
            return this.gatewayUniqueId;
        }

        public GetGatewayAuthConsumerDetailResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetGatewayAuthConsumerDetailResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetGatewayAuthConsumerDetailResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetGatewayAuthConsumerDetailResponseBodyData setJwks(String jwks) {
            this.jwks = jwks;
            return this;
        }
        public String getJwks() {
            return this.jwks;
        }

        public GetGatewayAuthConsumerDetailResponseBodyData setKeyName(String keyName) {
            this.keyName = keyName;
            return this;
        }
        public String getKeyName() {
            return this.keyName;
        }

        public GetGatewayAuthConsumerDetailResponseBodyData setKeyValue(String keyValue) {
            this.keyValue = keyValue;
            return this;
        }
        public String getKeyValue() {
            return this.keyValue;
        }

        public GetGatewayAuthConsumerDetailResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetGatewayAuthConsumerDetailResponseBodyData setPrimaryUser(String primaryUser) {
            this.primaryUser = primaryUser;
            return this;
        }
        public String getPrimaryUser() {
            return this.primaryUser;
        }

        public GetGatewayAuthConsumerDetailResponseBodyData setResourceList(java.util.List<GetGatewayAuthConsumerDetailResponseBodyDataResourceList> resourceList) {
            this.resourceList = resourceList;
            return this;
        }
        public java.util.List<GetGatewayAuthConsumerDetailResponseBodyDataResourceList> getResourceList() {
            return this.resourceList;
        }

        public GetGatewayAuthConsumerDetailResponseBodyData setTokenName(String tokenName) {
            this.tokenName = tokenName;
            return this;
        }
        public String getTokenName() {
            return this.tokenName;
        }

        public GetGatewayAuthConsumerDetailResponseBodyData setTokenPass(Boolean tokenPass) {
            this.tokenPass = tokenPass;
            return this;
        }
        public Boolean getTokenPass() {
            return this.tokenPass;
        }

        public GetGatewayAuthConsumerDetailResponseBodyData setTokenPosition(String tokenPosition) {
            this.tokenPosition = tokenPosition;
            return this;
        }
        public String getTokenPosition() {
            return this.tokenPosition;
        }

        public GetGatewayAuthConsumerDetailResponseBodyData setTokenPrefix(String tokenPrefix) {
            this.tokenPrefix = tokenPrefix;
            return this;
        }
        public String getTokenPrefix() {
            return this.tokenPrefix;
        }

        public GetGatewayAuthConsumerDetailResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
