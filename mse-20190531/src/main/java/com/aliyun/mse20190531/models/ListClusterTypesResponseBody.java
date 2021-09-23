// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListClusterTypesResponseBody extends TeaModel {
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("Data")
    public java.util.List<ListClusterTypesResponseBodyData> data;

    public static ListClusterTypesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClusterTypesResponseBody self = new ListClusterTypesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListClusterTypesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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

    public ListClusterTypesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListClusterTypesResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListClusterTypesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListClusterTypesResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public ListClusterTypesResponseBody setData(java.util.List<ListClusterTypesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListClusterTypesResponseBodyData> getData() {
        return this.data;
    }

    public static class ListClusterTypesResponseBodyData extends TeaModel {
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
