// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeAlertLogCountResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("AlertLogCount")
    public java.util.List<DescribeAlertLogCountResponseBodyAlertLogCount> alertLogCount;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeAlertLogCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlertLogCountResponseBody self = new DescribeAlertLogCountResponseBody();
        return TeaModel.build(map, self);
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

    public DescribeAlertLogCountResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeAlertLogCountResponseBodyAlertLogCountLogs extends TeaModel {
        @NameInMap("Value")
        public String value;

        @NameInMap("Name")
        public String name;

        public static DescribeAlertLogCountResponseBodyAlertLogCountLogs build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlertLogCountResponseBodyAlertLogCountLogs self = new DescribeAlertLogCountResponseBodyAlertLogCountLogs();
            return TeaModel.build(map, self);
        }

        public DescribeAlertLogCountResponseBodyAlertLogCountLogs setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public DescribeAlertLogCountResponseBodyAlertLogCountLogs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeAlertLogCountResponseBodyAlertLogCount extends TeaModel {
        @NameInMap("Logs")
        public java.util.List<DescribeAlertLogCountResponseBodyAlertLogCountLogs> logs;

        @NameInMap("Count")
        public Integer count;

        public static DescribeAlertLogCountResponseBodyAlertLogCount build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlertLogCountResponseBodyAlertLogCount self = new DescribeAlertLogCountResponseBodyAlertLogCount();
            return TeaModel.build(map, self);
        }

        public DescribeAlertLogCountResponseBodyAlertLogCount setLogs(java.util.List<DescribeAlertLogCountResponseBodyAlertLogCountLogs> logs) {
            this.logs = logs;
            return this;
        }
        public java.util.List<DescribeAlertLogCountResponseBodyAlertLogCountLogs> getLogs() {
            return this.logs;
        }

        public DescribeAlertLogCountResponseBodyAlertLogCount setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

    }

}
