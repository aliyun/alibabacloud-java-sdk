// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListClusterDetailFeatureResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListClusterDetailFeatureResponseBodyData> data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("HttpCode")
    public String httpCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListClusterDetailFeatureResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClusterDetailFeatureResponseBody self = new ListClusterDetailFeatureResponseBody();
        return TeaModel.build(map, self);
    }

    public ListClusterDetailFeatureResponseBody setData(java.util.List<ListClusterDetailFeatureResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListClusterDetailFeatureResponseBodyData> getData() {
        return this.data;
    }

    public ListClusterDetailFeatureResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListClusterDetailFeatureResponseBody setHttpCode(String httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public String getHttpCode() {
        return this.httpCode;
    }

    public ListClusterDetailFeatureResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListClusterDetailFeatureResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListClusterDetailFeatureResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListClusterDetailFeatureResponseBodyData extends TeaModel {
        @NameInMap("Extend")
        public java.util.Map<String, ?> extend;

        @NameInMap("FeatureId")
        public String featureId;

        @NameInMap("Message")
        public String message;

        @NameInMap("OrderNum")
        public String orderNum;

        @NameInMap("Status")
        public String status;

        public static ListClusterDetailFeatureResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListClusterDetailFeatureResponseBodyData self = new ListClusterDetailFeatureResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListClusterDetailFeatureResponseBodyData setExtend(java.util.Map<String, ?> extend) {
            this.extend = extend;
            return this;
        }
        public java.util.Map<String, ?> getExtend() {
            return this.extend;
        }

        public ListClusterDetailFeatureResponseBodyData setFeatureId(String featureId) {
            this.featureId = featureId;
            return this;
        }
        public String getFeatureId() {
            return this.featureId;
        }

        public ListClusterDetailFeatureResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListClusterDetailFeatureResponseBodyData setOrderNum(String orderNum) {
            this.orderNum = orderNum;
            return this;
        }
        public String getOrderNum() {
            return this.orderNum;
        }

        public ListClusterDetailFeatureResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
