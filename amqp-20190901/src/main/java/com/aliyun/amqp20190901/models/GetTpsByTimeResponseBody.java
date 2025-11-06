// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class GetTpsByTimeResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public GetTpsByTimeResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetTpsByTimeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTpsByTimeResponseBody self = new GetTpsByTimeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTpsByTimeResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetTpsByTimeResponseBody setData(GetTpsByTimeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetTpsByTimeResponseBodyData getData() {
        return this.data;
    }

    public GetTpsByTimeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTpsByTimeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTpsByTimeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetTpsByTimeResponseBodyData extends TeaModel {
        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("MaxTps")
        public Integer maxTps;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("tpsList")
        public java.util.List<Integer> tpsList;

        public static GetTpsByTimeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTpsByTimeResponseBodyData self = new GetTpsByTimeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTpsByTimeResponseBodyData setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetTpsByTimeResponseBodyData setMaxTps(Integer maxTps) {
            this.maxTps = maxTps;
            return this;
        }
        public Integer getMaxTps() {
            return this.maxTps;
        }

        public GetTpsByTimeResponseBodyData setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public GetTpsByTimeResponseBodyData setTpsList(java.util.List<Integer> tpsList) {
            this.tpsList = tpsList;
            return this;
        }
        public java.util.List<Integer> getTpsList() {
            return this.tpsList;
        }

    }

}
