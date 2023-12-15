// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudcallcenter20200701.models;

import com.aliyun.tea.*;

public class GetAccessChannelOfStagingResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetAccessChannelOfStagingResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GetAccessChannelOfStagingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAccessChannelOfStagingResponseBody self = new GetAccessChannelOfStagingResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAccessChannelOfStagingResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAccessChannelOfStagingResponseBody setData(GetAccessChannelOfStagingResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAccessChannelOfStagingResponseBodyData getData() {
        return this.data;
    }

    public GetAccessChannelOfStagingResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetAccessChannelOfStagingResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAccessChannelOfStagingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAccessChannelOfStagingResponseBodyData extends TeaModel {
        @NameInMap("Token")
        public String token;

        public static GetAccessChannelOfStagingResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAccessChannelOfStagingResponseBodyData self = new GetAccessChannelOfStagingResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAccessChannelOfStagingResponseBodyData setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

    }

}
