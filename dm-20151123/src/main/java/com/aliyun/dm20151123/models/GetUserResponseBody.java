// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class GetUserResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetUserResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static GetUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserResponseBody self = new GetUserResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserResponseBody setData(GetUserResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetUserResponseBodyData getData() {
        return this.data;
    }

    public GetUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetUserResponseBodyData extends TeaModel {
        @NameInMap("EnableEventbridge")
        public Boolean enableEventbridge;

        public static GetUserResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetUserResponseBodyData self = new GetUserResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetUserResponseBodyData setEnableEventbridge(Boolean enableEventbridge) {
            this.enableEventbridge = enableEventbridge;
            return this;
        }
        public Boolean getEnableEventbridge() {
            return this.enableEventbridge;
        }

    }

}
