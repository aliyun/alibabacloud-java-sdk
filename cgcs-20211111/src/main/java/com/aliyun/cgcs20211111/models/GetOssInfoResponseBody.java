// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class GetOssInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetOssInfoResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GetOssInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOssInfoResponseBody self = new GetOssInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOssInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetOssInfoResponseBody setData(GetOssInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetOssInfoResponseBodyData getData() {
        return this.data;
    }

    public GetOssInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetOssInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetOssInfoResponseBodyData extends TeaModel {
        @NameInMap("First")
        public String first;

        @NameInMap("Second")
        public String second;

        public static GetOssInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetOssInfoResponseBodyData self = new GetOssInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetOssInfoResponseBodyData setFirst(String first) {
            this.first = first;
            return this;
        }
        public String getFirst() {
            return this.first;
        }

        public GetOssInfoResponseBodyData setSecond(String second) {
            this.second = second;
            return this;
        }
        public String getSecond() {
            return this.second;
        }

    }

}
