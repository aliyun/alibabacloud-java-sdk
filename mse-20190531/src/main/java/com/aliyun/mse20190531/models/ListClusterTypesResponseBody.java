// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListClusterTypesResponseBody extends TeaModel {
    // The return value.
    @NameInMap("Code")
    public Integer code;

    // The returned data.
    @NameInMap("Data")
    public java.util.List<ListClusterTypesResponseBodyData> data;

    // The dynamic part in the error message. This parameter is used to replace the \*\*%s\*\* variable in the **ErrMessage** parameter.
    // 
    // >  If the return value of the **ErrMessage** parameter is **The Value of Input Parameter %s is not valid** and the return value of the **DynamicMessage** parameter is **DtsJobId**, the specified **DtsJobId** parameter is invalid.
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    // The error code.
    @NameInMap("ErrorCode")
    public String errorCode;

    // The HTTP status code.
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    // The returned message.
    @NameInMap("Message")
    public String message;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // Indicates whether the request was successful. Valid values:
    // 
    // *   `true`: The request was successful.
    // *   `false`: The request failed.
    @NameInMap("Success")
    public Boolean success;

    public static ListClusterTypesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClusterTypesResponseBody self = new ListClusterTypesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListClusterTypesResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListClusterTypesResponseBody setData(java.util.List<ListClusterTypesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListClusterTypesResponseBodyData> getData() {
        return this.data;
    }

    public ListClusterTypesResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public ListClusterTypesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListClusterTypesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListClusterTypesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListClusterTypesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListClusterTypesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListClusterTypesResponseBodyData extends TeaModel {
        // The type of the MSE engine that can be activated.
        @NameInMap("ShowName")
        public String showName;

        public static ListClusterTypesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListClusterTypesResponseBodyData self = new ListClusterTypesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListClusterTypesResponseBodyData setShowName(String showName) {
            this.showName = showName;
            return this;
        }
        public String getShowName() {
            return this.showName;
        }

    }

}
