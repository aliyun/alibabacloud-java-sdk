// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeQRCodeAccessLogResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeQRCodeAccessLogResponseBodyResult result;

    public static DescribeQRCodeAccessLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeQRCodeAccessLogResponseBody self = new DescribeQRCodeAccessLogResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeQRCodeAccessLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeQRCodeAccessLogResponseBody setResult(DescribeQRCodeAccessLogResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeQRCodeAccessLogResponseBodyResult getResult() {
        return this.result;
    }

    public static class DescribeQRCodeAccessLogResponseBodyResult extends TeaModel {
        @NameInMap("AccessAlipayAccountCount")
        public Long accessAlipayAccountCount;

        @NameInMap("AccessCount")
        public Long accessCount;

        public static DescribeQRCodeAccessLogResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeQRCodeAccessLogResponseBodyResult self = new DescribeQRCodeAccessLogResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeQRCodeAccessLogResponseBodyResult setAccessAlipayAccountCount(Long accessAlipayAccountCount) {
            this.accessAlipayAccountCount = accessAlipayAccountCount;
            return this;
        }
        public Long getAccessAlipayAccountCount() {
            return this.accessAlipayAccountCount;
        }

        public DescribeQRCodeAccessLogResponseBodyResult setAccessCount(Long accessCount) {
            this.accessCount = accessCount;
            return this;
        }
        public Long getAccessCount() {
            return this.accessCount;
        }

    }

}
