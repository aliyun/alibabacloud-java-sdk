// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class QueryClusterDiskSpecificationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Message")
    public String message;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Data")
    public QueryClusterDiskSpecificationResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("Code")
    public Integer code;

    @NameInMap("Success")
    public Boolean success;

    public static QueryClusterDiskSpecificationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryClusterDiskSpecificationResponseBody self = new QueryClusterDiskSpecificationResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryClusterDiskSpecificationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryClusterDiskSpecificationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryClusterDiskSpecificationResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public QueryClusterDiskSpecificationResponseBody setData(QueryClusterDiskSpecificationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryClusterDiskSpecificationResponseBodyData getData() {
        return this.data;
    }

    public QueryClusterDiskSpecificationResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public QueryClusterDiskSpecificationResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public QueryClusterDiskSpecificationResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public QueryClusterDiskSpecificationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryClusterDiskSpecificationResponseBodyData extends TeaModel {
        @NameInMap("Step")
        public Integer step;

        @NameInMap("Max")
        public Integer max;

        @NameInMap("Min")
        public Integer min;

        public static QueryClusterDiskSpecificationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryClusterDiskSpecificationResponseBodyData self = new QueryClusterDiskSpecificationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryClusterDiskSpecificationResponseBodyData setStep(Integer step) {
            this.step = step;
            return this;
        }
        public Integer getStep() {
            return this.step;
        }

        public QueryClusterDiskSpecificationResponseBodyData setMax(Integer max) {
            this.max = max;
            return this;
        }
        public Integer getMax() {
            return this.max;
        }

        public QueryClusterDiskSpecificationResponseBodyData setMin(Integer min) {
            this.min = min;
            return this;
        }
        public Integer getMin() {
            return this.min;
        }

    }

}
