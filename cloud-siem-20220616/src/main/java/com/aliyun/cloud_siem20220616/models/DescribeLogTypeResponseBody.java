// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeLogTypeResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public java.util.List<DescribeLogTypeResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeLogTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLogTypeResponseBody self = new DescribeLogTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLogTypeResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeLogTypeResponseBody setData(java.util.List<DescribeLogTypeResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeLogTypeResponseBodyData> getData() {
        return this.data;
    }

    public DescribeLogTypeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeLogTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLogTypeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeLogTypeResponseBodyData extends TeaModel {
        @NameInMap("LogType")
        public String logType;

        @NameInMap("LogTypeName")
        public String logTypeName;

        public static DescribeLogTypeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeLogTypeResponseBodyData self = new DescribeLogTypeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeLogTypeResponseBodyData setLogType(String logType) {
            this.logType = logType;
            return this;
        }
        public String getLogType() {
            return this.logType;
        }

        public DescribeLogTypeResponseBodyData setLogTypeName(String logTypeName) {
            this.logTypeName = logTypeName;
            return this;
        }
        public String getLogTypeName() {
            return this.logTypeName;
        }

    }

}
