// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListClusterVersionsResponseBody extends TeaModel {
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
    public java.util.List<ListClusterVersionsResponseBodyData> data;

    public static ListClusterVersionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClusterVersionsResponseBody self = new ListClusterVersionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListClusterVersionsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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

    public ListClusterVersionsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListClusterVersionsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListClusterVersionsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListClusterVersionsResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public ListClusterVersionsResponseBody setData(java.util.List<ListClusterVersionsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListClusterVersionsResponseBodyData> getData() {
        return this.data;
    }

    public static class ListClusterVersionsResponseBodyData extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("ShowName")
        public String showName;

        @NameInMap("ClusterType")
        public String clusterType;

        public static ListClusterVersionsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListClusterVersionsResponseBodyData self = new ListClusterVersionsResponseBodyData();
            return TeaModel.build(map, self);
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

        public ListClusterVersionsResponseBodyData setClusterType(String clusterType) {
            this.clusterType = clusterType;
            return this;
        }
        public String getClusterType() {
            return this.clusterType;
        }

    }

}
