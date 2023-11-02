// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class GetHistogramsResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public GetHistogramsResponseBodyData data;

    @NameInMap("DyCode")
    public String dyCode;

    @NameInMap("DyMessage")
    public String dyMessage;

    @NameInMap("ErrCode")
    public String errCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetHistogramsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHistogramsResponseBody self = new GetHistogramsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHistogramsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetHistogramsResponseBody setData(GetHistogramsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetHistogramsResponseBodyData getData() {
        return this.data;
    }

    public GetHistogramsResponseBody setDyCode(String dyCode) {
        this.dyCode = dyCode;
        return this;
    }
    public String getDyCode() {
        return this.dyCode;
    }

    public GetHistogramsResponseBody setDyMessage(String dyMessage) {
        this.dyMessage = dyMessage;
        return this;
    }
    public String getDyMessage() {
        return this.dyMessage;
    }

    public GetHistogramsResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public GetHistogramsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetHistogramsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetHistogramsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetHistogramsResponseBodyDataHistograms extends TeaModel {
        @NameInMap("CompletedOrNot")
        public Boolean completedOrNot;

        @NameInMap("Count")
        public Long count;

        @NameInMap("From")
        public Integer from;

        @NameInMap("To")
        public Integer to;

        public static GetHistogramsResponseBodyDataHistograms build(java.util.Map<String, ?> map) throws Exception {
            GetHistogramsResponseBodyDataHistograms self = new GetHistogramsResponseBodyDataHistograms();
            return TeaModel.build(map, self);
        }

        public GetHistogramsResponseBodyDataHistograms setCompletedOrNot(Boolean completedOrNot) {
            this.completedOrNot = completedOrNot;
            return this;
        }
        public Boolean getCompletedOrNot() {
            return this.completedOrNot;
        }

        public GetHistogramsResponseBodyDataHistograms setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public GetHistogramsResponseBodyDataHistograms setFrom(Integer from) {
            this.from = from;
            return this;
        }
        public Integer getFrom() {
            return this.from;
        }

        public GetHistogramsResponseBodyDataHistograms setTo(Integer to) {
            this.to = to;
            return this;
        }
        public Integer getTo() {
            return this.to;
        }

    }

    public static class GetHistogramsResponseBodyData extends TeaModel {
        @NameInMap("Histograms")
        public java.util.List<GetHistogramsResponseBodyDataHistograms> histograms;

        @NameInMap("Server")
        public String server;

        @NameInMap("TotalCount")
        public Long totalCount;

        public static GetHistogramsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetHistogramsResponseBodyData self = new GetHistogramsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetHistogramsResponseBodyData setHistograms(java.util.List<GetHistogramsResponseBodyDataHistograms> histograms) {
            this.histograms = histograms;
            return this;
        }
        public java.util.List<GetHistogramsResponseBodyDataHistograms> getHistograms() {
            return this.histograms;
        }

        public GetHistogramsResponseBodyData setServer(String server) {
            this.server = server;
            return this;
        }
        public String getServer() {
            return this.server;
        }

        public GetHistogramsResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
