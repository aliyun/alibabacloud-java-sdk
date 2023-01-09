// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListClusterVersionsResponseBody extends TeaModel {
    // The response code returned.
    @NameInMap("Code")
    public Integer code;

    // The details of the data.
    @NameInMap("Data")
    public java.util.List<ListClusterVersionsResponseBodyData> data;

    // The dynamic part in the error message.
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    // The error code returned if the request failed.
    @NameInMap("ErrorCode")
    public String errorCode;

    // The HTTP status code returned.
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    // The message returned.
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

    public static ListClusterVersionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClusterVersionsResponseBody self = new ListClusterVersionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListClusterVersionsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListClusterVersionsResponseBody setData(java.util.List<ListClusterVersionsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListClusterVersionsResponseBodyData> getData() {
        return this.data;
    }

    public ListClusterVersionsResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public ListClusterVersionsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListClusterVersionsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListClusterVersionsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListClusterVersionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListClusterVersionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListClusterVersionsResponseBodyData extends TeaModel {
        // The type of the instance.
        @NameInMap("ClusterType")
        public String clusterType;

        // The code of the instance type.
        @NameInMap("Code")
        public String code;

        // The type of the instance.
        @NameInMap("ShowName")
        public String showName;

        public static ListClusterVersionsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListClusterVersionsResponseBodyData self = new ListClusterVersionsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListClusterVersionsResponseBodyData setClusterType(String clusterType) {
            this.clusterType = clusterType;
            return this;
        }
        public String getClusterType() {
            return this.clusterType;
        }

        public ListClusterVersionsResponseBodyData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListClusterVersionsResponseBodyData setShowName(String showName) {
            this.showName = showName;
            return this;
        }
        public String getShowName() {
            return this.showName;
        }

    }

}
