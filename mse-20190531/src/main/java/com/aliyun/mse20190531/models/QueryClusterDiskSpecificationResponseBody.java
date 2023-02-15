// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class QueryClusterDiskSpecificationResponseBody extends TeaModel {
    /**
     * <p>The return value.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The details of the data.</p>
     */
    @NameInMap("Data")
    public QueryClusterDiskSpecificationResponseBodyData data;

    /**
     * <p>The dynamic part in the error message. This parameter is used to replace the \*\*%s\*\* variable in the **ErrMessage** parameter.</p>
     * <br>
     * <p>>  If the return value of the **ErrMessage** parameter is **The Value of Input Parameter %s is not valid** and the return value of the **DynamicMessage** parameter is **DtsJobId**, the specified **DtsJobId** parameter is invalid.</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    /**
     * <p>The error code returned if the request failed.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The message returned.</p>
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
        /**
         * <p>The maximum disk capacity. Unit: GB.</p>
         */
        @NameInMap("Max")
        public Integer max;

        /**
         * <p>The minimum disk capacity. Unit: GB.</p>
         */
        @NameInMap("Min")
        public Integer min;

        /**
         * <p>The step size of the disk capacity.</p>
         */
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
