// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeAlertSourceWithEventResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public java.util.List<DescribeAlertSourceWithEventResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeAlertSourceWithEventResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlertSourceWithEventResponseBody self = new DescribeAlertSourceWithEventResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAlertSourceWithEventResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeAlertSourceWithEventResponseBody setData(java.util.List<DescribeAlertSourceWithEventResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeAlertSourceWithEventResponseBodyData> getData() {
        return this.data;
    }

    public DescribeAlertSourceWithEventResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAlertSourceWithEventResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAlertSourceWithEventResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeAlertSourceWithEventResponseBodyData extends TeaModel {
        @NameInMap("Source")
        public String source;

        @NameInMap("SourceName")
        public String sourceName;

        public static DescribeAlertSourceWithEventResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlertSourceWithEventResponseBodyData self = new DescribeAlertSourceWithEventResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeAlertSourceWithEventResponseBodyData setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public DescribeAlertSourceWithEventResponseBodyData setSourceName(String sourceName) {
            this.sourceName = sourceName;
            return this;
        }
        public String getSourceName() {
            return this.sourceName;
        }

    }

}
