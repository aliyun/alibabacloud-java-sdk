// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class AllNodeExceptionStatisticsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<AllNodeExceptionStatisticsResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static AllNodeExceptionStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AllNodeExceptionStatisticsResponseBody self = new AllNodeExceptionStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public AllNodeExceptionStatisticsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AllNodeExceptionStatisticsResponseBody setData(java.util.List<AllNodeExceptionStatisticsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<AllNodeExceptionStatisticsResponseBodyData> getData() {
        return this.data;
    }

    public AllNodeExceptionStatisticsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AllNodeExceptionStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AllNodeExceptionStatisticsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class AllNodeExceptionStatisticsResponseBodyData extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("Timestamp")
        public Long timestamp;

        public static AllNodeExceptionStatisticsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AllNodeExceptionStatisticsResponseBodyData self = new AllNodeExceptionStatisticsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AllNodeExceptionStatisticsResponseBodyData setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public AllNodeExceptionStatisticsResponseBodyData setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

    }

}
