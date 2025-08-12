// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class GetAlipayUrlResponseBody extends TeaModel {
    @NameInMap("data")
    public GetAlipayUrlResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>6a71f2d9-f1c9-913b-818b-11402910xxxx</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetAlipayUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAlipayUrlResponseBody self = new GetAlipayUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAlipayUrlResponseBody setData(GetAlipayUrlResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAlipayUrlResponseBodyData getData() {
        return this.data;
    }

    public GetAlipayUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAlipayUrlResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxsdfasfw</p>
         */
        @NameInMap("code")
        public String code;

        @NameInMap("qrUrl")
        public String qrUrl;

        public static GetAlipayUrlResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAlipayUrlResponseBodyData self = new GetAlipayUrlResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAlipayUrlResponseBodyData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetAlipayUrlResponseBodyData setQrUrl(String qrUrl) {
            this.qrUrl = qrUrl;
            return this;
        }
        public String getQrUrl() {
            return this.qrUrl;
        }

    }

}
