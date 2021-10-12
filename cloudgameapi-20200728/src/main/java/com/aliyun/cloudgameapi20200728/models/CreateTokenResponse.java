// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class CreateTokenResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public CreateTokenResponseData data;

    public static CreateTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTokenResponse self = new CreateTokenResponse();
        return TeaModel.build(map, self);
    }

    public CreateTokenResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateTokenResponse setData(CreateTokenResponseData data) {
        this.data = data;
        return this;
    }
    public CreateTokenResponseData getData() {
        return this.data;
    }

    public static class CreateTokenResponseData extends TeaModel {
        @NameInMap("Token")
        @Validation(required = true)
        public String token;

        public static CreateTokenResponseData build(java.util.Map<String, ?> map) throws Exception {
            CreateTokenResponseData self = new CreateTokenResponseData();
            return TeaModel.build(map, self);
        }

        public CreateTokenResponseData setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

    }

}
