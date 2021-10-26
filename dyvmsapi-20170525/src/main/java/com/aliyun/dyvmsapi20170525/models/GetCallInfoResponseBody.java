// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class GetCallInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetCallInfoResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GetCallInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCallInfoResponseBody self = new GetCallInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCallInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetCallInfoResponseBody setData(GetCallInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetCallInfoResponseBodyData getData() {
        return this.data;
    }

    public GetCallInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetCallInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetCallInfoResponseBodyData extends TeaModel {
        @NameInMap("ChannelId")
        public String channelId;

        @NameInMap("Status")
        public String status;

        public static GetCallInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetCallInfoResponseBodyData self = new GetCallInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetCallInfoResponseBodyData setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public GetCallInfoResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
