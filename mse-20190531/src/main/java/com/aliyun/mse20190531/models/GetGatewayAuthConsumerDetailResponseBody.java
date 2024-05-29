// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetGatewayAuthConsumerDetailResponseBody extends TeaModel {
    /**
     * <p>The status code. A value of 200 is returned if the request is successful.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public GetGatewayAuthConsumerDetailResponseBodyData data;

    /**
     * <p>The dynamic part in the error message.</p>
     */
    @NameInMap("DynamicCode")
    public String dynamicCode;

    /**
     * <p>The dynamic part in the error message. This parameter is used to replace the \\*\\*%s\\*\\* variable in the **ErrMessage** parameter.</p>
     * <br>
     * <p>>  If the return value of the **ErrMessage** parameter is **The Value of Input Parameter %s is not valid** and the return value of the **DynamicMessage** parameter is **DtsJobId**, the specified **DtsJobId** parameter is invalid.</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    /**
     * <p>The error code that is returned.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   `true`: The request was successful.</p>
     * <p>*   `false`: The request failed.</p>
     */
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
        /**
         * <p>The consumer ID.</p>
         */
        @NameInMap("ConsumerId")
        public Long consumerId;

        /**
         * <p>The unique ID of the gateway.</p>
         */
        @NameInMap("GatewayUniqueId")
        public String gatewayUniqueId;

        /**
         * <p>The time when the resource associated with the consumer authentication record was created.</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the resource associated with the consumer authentication record was modified.</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The ID of the authorized resource for the consumer.</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The resource authorization state. Valid values:</p>
         * <br>
         * <p>*   true: Resource authorization is enabled.</p>
         * <p>*   false: Resource authorization is disabled.</p>
         */
        @NameInMap("ResourceStatus")
        public Boolean resourceStatus;

        /**
         * <p>The ID of the route.</p>
         */
        @NameInMap("RouteId")
        public Long routeId;

        /**
         * <p>The name of the route.</p>
         */
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
        /**
         * <p>The status of the consumer. Valid values:</p>
         * <br>
         * <p>*   true: enabled</p>
         * <p>*   false: disabled</p>
         */
        @NameInMap("ConsumerStatus")
        public Boolean consumerStatus;

        /**
         * <p>The description.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The encryption type. Valid values:</p>
         * <br>
         * <p>*   RSA</p>
         * <p>*   OCT</p>
         */
        @NameInMap("EncodeType")
        public String encodeType;

        /**
         * <p>The unique ID of the gateway.</p>
         */
        @NameInMap("GatewayUniqueId")
        public String gatewayUniqueId;

        /**
         * <p>The time when the consumer authentication record was created.</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the consumer authentication record was modified.</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The ID of the consumer.</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The JWT public key. The JSON format is supported.</p>
         */
        @NameInMap("Jwks")
        public String jwks;

        /**
         * <p>The name of the key used for JWT-based identity authentication.</p>
         */
        @NameInMap("KeyName")
        public String keyName;

        /**
         * <p>The value of the key used for JWT-based identity authentication.</p>
         */
        @NameInMap("KeyValue")
        public String keyValue;

        /**
         * <p>The name of the consumer.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The creator.</p>
         */
        @NameInMap("PrimaryUser")
        public String primaryUser;

        /**
         * <p>The resource list.</p>
         */
        @NameInMap("ResourceList")
        public java.util.List<GetGatewayAuthConsumerDetailResponseBodyDataResourceList> resourceList;

        /**
         * <p>The names of the parameters that are required to verify each token. By default, each token is prefixed with Bearer and stored in the Authorization header, such as `Authorization: Bearer <Content of a token>`.</p>
         */
        @NameInMap("TokenName")
        public String tokenName;

        /**
         * <p>Specifies whether to enable pass-through.</p>
         */
        @NameInMap("TokenPass")
        public Boolean tokenPass;

        /**
         * <p>The positions of the parameters that are required to verify each token. By default, each token is prefixed with Bearer and stored in the Authorization header, such as `Authorization: Bearer <Content of a token>`.</p>
         */
        @NameInMap("TokenPosition")
        public String tokenPosition;

        /**
         * <p>The prefixes of the parameters that are required to verify each token. By default, each token is prefixed with Bearer and stored in the Authorization header, such as `Authorization: Bearer <Content of a token>`.</p>
         */
        @NameInMap("TokenPrefix")
        public String tokenPrefix;

        /**
         * <p>The authentication type. Valid values:</p>
         * <br>
         * <p>*   JWT</p>
         */
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
