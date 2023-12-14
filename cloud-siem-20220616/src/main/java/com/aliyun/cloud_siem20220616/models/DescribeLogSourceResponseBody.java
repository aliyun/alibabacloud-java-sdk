// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeLogSourceResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public java.util.List<DescribeLogSourceResponseBodyData> data;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeLogSourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLogSourceResponseBody self = new DescribeLogSourceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLogSourceResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeLogSourceResponseBody setData(java.util.List<DescribeLogSourceResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeLogSourceResponseBodyData> getData() {
        return this.data;
    }

    public DescribeLogSourceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeLogSourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLogSourceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeLogSourceResponseBodyData extends TeaModel {
        /**
         * <p>The log source of the rule.</p>
         */
        @NameInMap("LogSource")
        public String logSource;

        /**
         * <p>The internal code of the log source.</p>
         */
        @NameInMap("LogSourceName")
        public String logSourceName;

        public static DescribeLogSourceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeLogSourceResponseBodyData self = new DescribeLogSourceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeLogSourceResponseBodyData setLogSource(String logSource) {
            this.logSource = logSource;
            return this;
        }
        public String getLogSource() {
            return this.logSource;
        }

        public DescribeLogSourceResponseBodyData setLogSourceName(String logSourceName) {
            this.logSourceName = logSourceName;
            return this;
        }
        public String getLogSourceName() {
            return this.logSourceName;
        }

    }

}
