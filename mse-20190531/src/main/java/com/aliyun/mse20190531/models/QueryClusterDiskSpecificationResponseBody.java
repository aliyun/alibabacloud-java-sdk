// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class QueryClusterDiskSpecificationResponseBody extends TeaModel {
    // The return value.
    @NameInMap("Code")
    public Integer code;

    // The details of the data.
    @NameInMap("Data")
    public QueryClusterDiskSpecificationResponseBodyData data;

    // The dynamic part in the error message. This parameter is used to replace the \*\*%s\*\* variable in the **ErrMessage** parameter.
    // 
    // > If the return value of the **ErrMessage** parameter is **The Value of Input Parameter %s is not valid** and the return value of the **DynamicMessage** parameter is **DtsJobId**, the specified **DtsJobId** parameter is invalid.
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

    public static QueryClusterDiskSpecificationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryClusterDiskSpecificationResponseBody self = new QueryClusterDiskSpecificationResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryClusterDiskSpecificationResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public QueryClusterDiskSpecificationResponseBody setData(QueryClusterDiskSpecificationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryClusterDiskSpecificationResponseBodyData getData() {
        return this.data;
    }

    public QueryClusterDiskSpecificationResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public QueryClusterDiskSpecificationResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public QueryClusterDiskSpecificationResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public QueryClusterDiskSpecificationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryClusterDiskSpecificationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryClusterDiskSpecificationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryClusterDiskSpecificationResponseBodyData extends TeaModel {
        // The maximum capacity of the disk.
        @NameInMap("Max")
        public Integer max;

        // The minimum capacity of the disk.
        @NameInMap("Min")
        public Integer min;

        // The step size of the disk capacity.
        @NameInMap("Step")
        public Integer step;

        public static QueryClusterDiskSpecificationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryClusterDiskSpecificationResponseBodyData self = new QueryClusterDiskSpecificationResponseBodyData();
            return TeaModel.build(map, self);
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

        public QueryClusterDiskSpecificationResponseBodyData setStep(Integer step) {
            this.step = step;
            return this;
        }
        public Integer getStep() {
            return this.step;
        }

    }

}
