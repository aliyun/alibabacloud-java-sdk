// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListGatewayZoneResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public java.util.List<ListGatewayZoneResponseBodyData> data;

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

    public static ListGatewayZoneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListGatewayZoneResponseBody self = new ListGatewayZoneResponseBody();
        return TeaModel.build(map, self);
    }

    public ListGatewayZoneResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListGatewayZoneResponseBody setData(java.util.List<ListGatewayZoneResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListGatewayZoneResponseBodyData> getData() {
        return this.data;
    }

    public ListGatewayZoneResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public ListGatewayZoneResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public ListGatewayZoneResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListGatewayZoneResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListGatewayZoneResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListGatewayZoneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListGatewayZoneResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListGatewayZoneResponseBodyData extends TeaModel {
        @NameInMap("LocalName")
        public String localName;

        @NameInMap("ZoneId")
        public String zoneId;

        public static ListGatewayZoneResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayZoneResponseBodyData self = new ListGatewayZoneResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListGatewayZoneResponseBodyData setLocalName(String localName) {
            this.localName = localName;
            return this;
        }
        public String getLocalName() {
            return this.localName;
        }

        public ListGatewayZoneResponseBodyData setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
