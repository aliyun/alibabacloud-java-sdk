// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class GenerateAuthTokenResponseBody extends TeaModel {
    @NameInMap("Data")
    public GenerateAuthTokenResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static GenerateAuthTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateAuthTokenResponseBody self = new GenerateAuthTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateAuthTokenResponseBody setData(GenerateAuthTokenResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GenerateAuthTokenResponseBodyData getData() {
        return this.data;
    }

    public GenerateAuthTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GenerateAuthTokenResponseBodyData extends TeaModel {
        @NameInMap("JwtToken")
        public String jwtToken;

        public static GenerateAuthTokenResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GenerateAuthTokenResponseBodyData self = new GenerateAuthTokenResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GenerateAuthTokenResponseBodyData setJwtToken(String jwtToken) {
            this.jwtToken = jwtToken;
            return this;
        }
        public String getJwtToken() {
            return this.jwtToken;
        }

    }

}
