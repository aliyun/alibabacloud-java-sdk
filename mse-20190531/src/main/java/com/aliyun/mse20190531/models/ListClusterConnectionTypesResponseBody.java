// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListClusterConnectionTypesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Message")
    public String message;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Data")
    public java.util.List<ListClusterConnectionTypesResponseBodyData> data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("Code")
    public Integer code;

    @NameInMap("Success")
    public Boolean success;

    public static ListClusterConnectionTypesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClusterConnectionTypesResponseBody self = new ListClusterConnectionTypesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListClusterConnectionTypesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListClusterConnectionTypesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListClusterConnectionTypesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListClusterConnectionTypesResponseBody setData(java.util.List<ListClusterConnectionTypesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListClusterConnectionTypesResponseBodyData> getData() {
        return this.data;
    }

    public ListClusterConnectionTypesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListClusterConnectionTypesResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public ListClusterConnectionTypesResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListClusterConnectionTypesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListClusterConnectionTypesResponseBodyData extends TeaModel {
        @NameInMap("ShowName")
        public String showName;

        public static ListClusterConnectionTypesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListClusterConnectionTypesResponseBodyData self = new ListClusterConnectionTypesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListClusterConnectionTypesResponseBodyData setShowName(String showName) {
            this.showName = showName;
            return this;
        }
        public String getShowName() {
            return this.showName;
        }

    }

}
