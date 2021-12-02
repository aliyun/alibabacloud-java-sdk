// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class GenRealPersonVerificationTokenResponseBody extends TeaModel {
    @NameInMap("Data")
    public GenRealPersonVerificationTokenResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static GenRealPersonVerificationTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenRealPersonVerificationTokenResponseBody self = new GenRealPersonVerificationTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public GenRealPersonVerificationTokenResponseBody setData(GenRealPersonVerificationTokenResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GenRealPersonVerificationTokenResponseBodyData getData() {
        return this.data;
    }

    public GenRealPersonVerificationTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GenRealPersonVerificationTokenResponseBodyData extends TeaModel {
        @NameInMap("VerificationToken")
        public String verificationToken;

        public static GenRealPersonVerificationTokenResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GenRealPersonVerificationTokenResponseBodyData self = new GenRealPersonVerificationTokenResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GenRealPersonVerificationTokenResponseBodyData setVerificationToken(String verificationToken) {
            this.verificationToken = verificationToken;
            return this;
        }
        public String getVerificationToken() {
            return this.verificationToken;
        }

    }

}
