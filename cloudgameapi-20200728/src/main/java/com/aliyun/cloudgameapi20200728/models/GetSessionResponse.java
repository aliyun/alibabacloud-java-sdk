// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class GetSessionResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public GetSessionResponseData data;

    public static GetSessionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSessionResponse self = new GetSessionResponse();
        return TeaModel.build(map, self);
    }

    public GetSessionResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSessionResponse setData(GetSessionResponseData data) {
        this.data = data;
        return this;
    }
    public GetSessionResponseData getData() {
        return this.data;
    }

    public static class GetSessionResponseData extends TeaModel {
        @NameInMap("Session")
        @Validation(required = true)
        public String session;

        public static GetSessionResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetSessionResponseData self = new GetSessionResponseData();
            return TeaModel.build(map, self);
        }

        public GetSessionResponseData setSession(String session) {
            this.session = session;
            return this;
        }
        public String getSession() {
            return this.session;
        }

    }

}
