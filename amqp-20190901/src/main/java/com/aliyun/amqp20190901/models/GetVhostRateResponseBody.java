// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class GetVhostRateResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public java.util.List<GetVhostRateResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetVhostRateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVhostRateResponseBody self = new GetVhostRateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetVhostRateResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetVhostRateResponseBody setData(java.util.List<GetVhostRateResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetVhostRateResponseBodyData> getData() {
        return this.data;
    }

    public GetVhostRateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetVhostRateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetVhostRateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetVhostRateResponseBodyData extends TeaModel {
        @NameInMap("ChannelNum")
        public Integer channelNum;

        @NameInMap("ConnectionNum")
        public Integer connectionNum;

        @NameInMap("InQps")
        public Long inQps;

        @NameInMap("OutQps")
        public Long outQps;

        @NameInMap("VhostName")
        public String vhostName;

        public static GetVhostRateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetVhostRateResponseBodyData self = new GetVhostRateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetVhostRateResponseBodyData setChannelNum(Integer channelNum) {
            this.channelNum = channelNum;
            return this;
        }
        public Integer getChannelNum() {
            return this.channelNum;
        }

        public GetVhostRateResponseBodyData setConnectionNum(Integer connectionNum) {
            this.connectionNum = connectionNum;
            return this;
        }
        public Integer getConnectionNum() {
            return this.connectionNum;
        }

        public GetVhostRateResponseBodyData setInQps(Long inQps) {
            this.inQps = inQps;
            return this;
        }
        public Long getInQps() {
            return this.inQps;
        }

        public GetVhostRateResponseBodyData setOutQps(Long outQps) {
            this.outQps = outQps;
            return this;
        }
        public Long getOutQps() {
            return this.outQps;
        }

        public GetVhostRateResponseBodyData setVhostName(String vhostName) {
            this.vhostName = vhostName;
            return this;
        }
        public String getVhostName() {
            return this.vhostName;
        }

    }

}
