// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.carbonfootprint20230711.models;

import com.aliyun.tea.*;

public class VerifyResponseBody extends TeaModel {
    @NameInMap("Data")
    public VerifyResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static VerifyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VerifyResponseBody self = new VerifyResponseBody();
        return TeaModel.build(map, self);
    }

    public VerifyResponseBody setData(VerifyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public VerifyResponseBodyData getData() {
        return this.data;
    }

    public VerifyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class VerifyResponseBodyData extends TeaModel {
        @NameInMap("AllowedUids")
        public java.util.List<String> allowedUids;

        public static VerifyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            VerifyResponseBodyData self = new VerifyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public VerifyResponseBodyData setAllowedUids(java.util.List<String> allowedUids) {
            this.allowedUids = allowedUids;
            return this;
        }
        public java.util.List<String> getAllowedUids() {
            return this.allowedUids;
        }

    }

}
