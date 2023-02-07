// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetHotlineMessageLogResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetHotlineMessageLogResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetHotlineMessageLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHotlineMessageLogResponseBody self = new GetHotlineMessageLogResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHotlineMessageLogResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetHotlineMessageLogResponseBody setData(java.util.List<GetHotlineMessageLogResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetHotlineMessageLogResponseBodyData> getData() {
        return this.data;
    }

    public GetHotlineMessageLogResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetHotlineMessageLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetHotlineMessageLogResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetHotlineMessageLogResponseBodyData extends TeaModel {
        @NameInMap("Acid")
        public String acid;

        @NameInMap("Content")
        public String content;

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("Mid")
        public String mid;

        @NameInMap("SenderType")
        public Integer senderType;

        @NameInMap("StartTime")
        public Long startTime;

        public static GetHotlineMessageLogResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetHotlineMessageLogResponseBodyData self = new GetHotlineMessageLogResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetHotlineMessageLogResponseBodyData setAcid(String acid) {
            this.acid = acid;
            return this;
        }
        public String getAcid() {
            return this.acid;
        }

        public GetHotlineMessageLogResponseBodyData setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetHotlineMessageLogResponseBodyData setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public GetHotlineMessageLogResponseBodyData setMid(String mid) {
            this.mid = mid;
            return this;
        }
        public String getMid() {
            return this.mid;
        }

        public GetHotlineMessageLogResponseBodyData setSenderType(Integer senderType) {
            this.senderType = senderType;
            return this;
        }
        public Integer getSenderType() {
            return this.senderType;
        }

        public GetHotlineMessageLogResponseBodyData setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

    }

}
