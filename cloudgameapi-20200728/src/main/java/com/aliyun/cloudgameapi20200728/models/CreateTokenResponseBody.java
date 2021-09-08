// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class CreateTokenResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public CreateTokenResponseBodyData data;

    public static CreateTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTokenResponseBody self = new CreateTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateTokenResponseBody setData(CreateTokenResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateTokenResponseBodyData getData() {
        return this.data;
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
