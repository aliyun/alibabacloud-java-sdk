// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class CreateTokenResponseBody extends TeaModel {
    @NameInMap("Data")
    public CreateTokenResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTokenResponseBody self = new CreateTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTokenResponseBody setData(CreateTokenResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateTokenResponseBodyData getData() {
        return this.data;
    }

    public CreateTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateTokenResponseBodyData extends TeaModel {
        @NameInMap("Token")
        public String token;

        public static CreateTokenResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateTokenResponseBodyData self = new CreateTokenResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateTokenResponseBodyData setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

    }

}
