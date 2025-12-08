// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class GetRealPersonVerificationResultResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetRealPersonVerificationResultResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>10FC953D-7C0C-4915-8949-34E3246E5B79</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetRealPersonVerificationResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRealPersonVerificationResultResponseBody self = new GetRealPersonVerificationResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRealPersonVerificationResultResponseBody setData(GetRealPersonVerificationResultResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetRealPersonVerificationResultResponseBodyData getData() {
        return this.data;
    }

    public GetRealPersonVerificationResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetRealPersonVerificationResultResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Passed")
        public Boolean passed;

        public static GetRealPersonVerificationResultResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetRealPersonVerificationResultResponseBodyData self = new GetRealPersonVerificationResultResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetRealPersonVerificationResultResponseBodyData setPassed(Boolean passed) {
            this.passed = passed;
            return this;
        }
        public Boolean getPassed() {
            return this.passed;
        }

    }

}
