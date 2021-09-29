// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class GetSessionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public GetSessionResponseBodyData data;

    public static GetSessionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSessionResponseBody self = new GetSessionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSessionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSessionResponseBody setData(GetSessionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSessionResponseBodyData getData() {
        return this.data;
    }

    public static class GetSessionResponseBodyData extends TeaModel {
        @NameInMap("Session")
        public String session;

        public static GetSessionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSessionResponseBodyData self = new GetSessionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSessionResponseBodyData setSession(String session) {
            this.session = session;
            return this;
        }
        public String getSession() {
            return this.session;
        }

    }

}
