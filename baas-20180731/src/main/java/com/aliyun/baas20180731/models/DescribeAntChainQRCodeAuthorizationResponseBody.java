// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeAntChainQRCodeAuthorizationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeAntChainQRCodeAuthorizationResponseBodyResult result;

    public static DescribeAntChainQRCodeAuthorizationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainQRCodeAuthorizationResponseBody self = new DescribeAntChainQRCodeAuthorizationResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainQRCodeAuthorizationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAntChainQRCodeAuthorizationResponseBody setResult(DescribeAntChainQRCodeAuthorizationResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeAntChainQRCodeAuthorizationResponseBodyResult getResult() {
        return this.result;
    }

    public static class DescribeAntChainQRCodeAuthorizationResponseBodyResult extends TeaModel {
        @NameInMap("AntChainId")
        public String antChainId;

        @NameInMap("AuthorizationType")
        public String authorizationType;

        @NameInMap("QRCodeType")
        public String QRCodeType;

        public static DescribeAntChainQRCodeAuthorizationResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainQRCodeAuthorizationResponseBodyResult self = new DescribeAntChainQRCodeAuthorizationResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainQRCodeAuthorizationResponseBodyResult setAntChainId(String antChainId) {
            this.antChainId = antChainId;
            return this;
        }
        public String getAntChainId() {
            return this.antChainId;
        }

        public DescribeAntChainQRCodeAuthorizationResponseBodyResult setAuthorizationType(String authorizationType) {
            this.authorizationType = authorizationType;
            return this;
        }
        public String getAuthorizationType() {
            return this.authorizationType;
        }

        public DescribeAntChainQRCodeAuthorizationResponseBodyResult setQRCodeType(String QRCodeType) {
            this.QRCodeType = QRCodeType;
            return this;
        }
        public String getQRCodeType() {
            return this.QRCodeType;
        }

    }

}
