// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypls20170830.models;

import com.aliyun.tea.*;

public class GetSecretAsrInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetSecretAsrInfoResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GetSecretAsrInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSecretAsrInfoResponseBody self = new GetSecretAsrInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSecretAsrInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSecretAsrInfoResponseBody setData(java.util.List<GetSecretAsrInfoResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetSecretAsrInfoResponseBodyData> getData() {
        return this.data;
    }

    public GetSecretAsrInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSecretAsrInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetSecretAsrInfoResponseBodyData extends TeaModel {
        @NameInMap("Channel")
        public String channel;

        @NameInMap("Text")
        public String text;

        public static GetSecretAsrInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSecretAsrInfoResponseBodyData self = new GetSecretAsrInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSecretAsrInfoResponseBodyData setChannel(String channel) {
            this.channel = channel;
            return this;
        }
        public String getChannel() {
            return this.channel;
        }

        public GetSecretAsrInfoResponseBodyData setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

}
