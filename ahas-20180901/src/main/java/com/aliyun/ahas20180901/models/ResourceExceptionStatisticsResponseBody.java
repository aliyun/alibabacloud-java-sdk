// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class ResourceExceptionStatisticsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ResourceExceptionStatisticsResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ResourceExceptionStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResourceExceptionStatisticsResponseBody self = new ResourceExceptionStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public ResourceExceptionStatisticsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ResourceExceptionStatisticsResponseBody setData(java.util.List<ResourceExceptionStatisticsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ResourceExceptionStatisticsResponseBodyData> getData() {
        return this.data;
    }

    public ResourceExceptionStatisticsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ResourceExceptionStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ResourceExceptionStatisticsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ResourceExceptionStatisticsResponseBodyData extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("Timestamp")
        public Long timestamp;

        public static ResourceExceptionStatisticsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ResourceExceptionStatisticsResponseBodyData self = new ResourceExceptionStatisticsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ResourceExceptionStatisticsResponseBodyData setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public ResourceExceptionStatisticsResponseBodyData setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

    }

}
