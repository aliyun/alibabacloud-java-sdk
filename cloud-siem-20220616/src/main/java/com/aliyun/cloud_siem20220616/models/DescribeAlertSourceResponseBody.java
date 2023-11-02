// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeAlertSourceResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public java.util.List<DescribeAlertSourceResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeAlertSourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlertSourceResponseBody self = new DescribeAlertSourceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAlertSourceResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeAlertSourceResponseBody setData(java.util.List<DescribeAlertSourceResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeAlertSourceResponseBodyData> getData() {
        return this.data;
    }

    public DescribeAlertSourceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAlertSourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAlertSourceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeAlertSourceResponseBodyData extends TeaModel {
        @NameInMap("Source")
        public String source;

        @NameInMap("SourceName")
        public String sourceName;

        public static DescribeAlertSourceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlertSourceResponseBodyData self = new DescribeAlertSourceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeAlertSourceResponseBodyData setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public DescribeAlertSourceResponseBodyData setSourceName(String sourceName) {
            this.sourceName = sourceName;
            return this;
        }
        public String getSourceName() {
            return this.sourceName;
        }

    }

}
