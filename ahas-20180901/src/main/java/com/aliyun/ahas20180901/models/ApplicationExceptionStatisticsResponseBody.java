// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class ApplicationExceptionStatisticsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ApplicationExceptionStatisticsResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ApplicationExceptionStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ApplicationExceptionStatisticsResponseBody self = new ApplicationExceptionStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public ApplicationExceptionStatisticsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ApplicationExceptionStatisticsResponseBody setData(java.util.List<ApplicationExceptionStatisticsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ApplicationExceptionStatisticsResponseBodyData> getData() {
        return this.data;
    }

    public ApplicationExceptionStatisticsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ApplicationExceptionStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ApplicationExceptionStatisticsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ApplicationExceptionStatisticsResponseBodyData extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("Timestamp")
        public Long timestamp;

        public static ApplicationExceptionStatisticsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ApplicationExceptionStatisticsResponseBodyData self = new ApplicationExceptionStatisticsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ApplicationExceptionStatisticsResponseBodyData setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public ApplicationExceptionStatisticsResponseBodyData setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

    }

}
