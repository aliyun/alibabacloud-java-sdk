// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeAlertLogCountResponseBody extends TeaModel {
    /**
     * <p>The alert history statistics.</p>
     */
    @NameInMap("AlertLogCount")
    public java.util.List<DescribeAlertLogCountResponseBodyAlertLogCount> alertLogCount;

    /**
     * <p>The status code.</p>
     * <blockquote>
     * <p>The value 200 indicates success.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>The specified resource is not found.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1C4A3709-BF52-42EE-87B5-7435F0929585</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the operation was successful. Valid values:</p>
     * <ul>
     * <li><p>true: Successful.</p>
     * </li>
     * <li><p>false: Failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeAlertLogCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlertLogCountResponseBody self = new DescribeAlertLogCountResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAlertLogCountResponseBody setAlertLogCount(java.util.List<DescribeAlertLogCountResponseBodyAlertLogCount> alertLogCount) {
        this.alertLogCount = alertLogCount;
        return this;
    }
    public java.util.List<DescribeAlertLogCountResponseBodyAlertLogCount> getAlertLogCount() {
        return this.alertLogCount;
    }

    public DescribeAlertLogCountResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeAlertLogCountResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAlertLogCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAlertLogCountResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeAlertLogCountResponseBodyAlertLogCountLogs extends TeaModel {
        /**
         * <p>The field name of the alert history statistics.</p>
         * 
         * <strong>example:</strong>
         * <p>product</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The field value of the alert history statistics.</p>
         * 
         * <strong>example:</strong>
         * <p>ECS</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeAlertLogCountResponseBodyAlertLogCountLogs build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlertLogCountResponseBodyAlertLogCountLogs self = new DescribeAlertLogCountResponseBodyAlertLogCountLogs();
            return TeaModel.build(map, self);
        }

        public DescribeAlertLogCountResponseBodyAlertLogCountLogs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeAlertLogCountResponseBodyAlertLogCountLogs setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeAlertLogCountResponseBodyAlertLogCount extends TeaModel {
        /**
         * <p>The number of alert history statistics.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The details of the alert history statistics.</p>
         */
        @NameInMap("Logs")
        public java.util.List<DescribeAlertLogCountResponseBodyAlertLogCountLogs> logs;

        public static DescribeAlertLogCountResponseBodyAlertLogCount build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlertLogCountResponseBodyAlertLogCount self = new DescribeAlertLogCountResponseBodyAlertLogCount();
            return TeaModel.build(map, self);
        }

        public DescribeAlertLogCountResponseBodyAlertLogCount setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeAlertLogCountResponseBodyAlertLogCount setLogs(java.util.List<DescribeAlertLogCountResponseBodyAlertLogCountLogs> logs) {
            this.logs = logs;
            return this;
        }
        public java.util.List<DescribeAlertLogCountResponseBodyAlertLogCountLogs> getLogs() {
            return this.logs;
        }

    }

}
