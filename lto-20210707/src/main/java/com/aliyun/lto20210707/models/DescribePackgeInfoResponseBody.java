// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class DescribePackgeInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribePackgeInfoResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribePackgeInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePackgeInfoResponseBody self = new DescribePackgeInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePackgeInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribePackgeInfoResponseBody setData(DescribePackgeInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribePackgeInfoResponseBodyData getData() {
        return this.data;
    }

    public DescribePackgeInfoResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribePackgeInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribePackgeInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePackgeInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribePackgeInfoResponseBodyData extends TeaModel {
        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("StartTime")
        public Long startTime;

        public static DescribePackgeInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribePackgeInfoResponseBodyData self = new DescribePackgeInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribePackgeInfoResponseBodyData setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribePackgeInfoResponseBodyData setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

    }

}
