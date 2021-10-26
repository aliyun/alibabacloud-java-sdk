// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeSignaturesByApiResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Signatures")
    public DescribeSignaturesByApiResponseBodySignatures signatures;

    public static DescribeSignaturesByApiResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSignaturesByApiResponseBody self = new DescribeSignaturesByApiResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSignaturesByApiResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSignaturesByApiResponseBody setSignatures(DescribeSignaturesByApiResponseBodySignatures signatures) {
        this.signatures = signatures;
        return this;
    }
    public DescribeSignaturesByApiResponseBodySignatures getSignatures() {
        return this.signatures;
    }

    public static class DescribeSignaturesByApiResponseBodySignaturesSignatureItem extends TeaModel {
        @NameInMap("BoundTime")
        public String boundTime;

        @NameInMap("SignatureId")
        public String signatureId;

        @NameInMap("SignatureName")
        public String signatureName;

        public static DescribeSignaturesByApiResponseBodySignaturesSignatureItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeSignaturesByApiResponseBodySignaturesSignatureItem self = new DescribeSignaturesByApiResponseBodySignaturesSignatureItem();
            return TeaModel.build(map, self);
        }

        public DescribeSignaturesByApiResponseBodySignaturesSignatureItem setBoundTime(String boundTime) {
            this.boundTime = boundTime;
            return this;
        }
        public String getBoundTime() {
            return this.boundTime;
        }

        public DescribeSignaturesByApiResponseBodySignaturesSignatureItem setSignatureId(String signatureId) {
            this.signatureId = signatureId;
            return this;
        }
        public String getSignatureId() {
            return this.signatureId;
        }

        public DescribeSignaturesByApiResponseBodySignaturesSignatureItem setSignatureName(String signatureName) {
            this.signatureName = signatureName;
            return this;
        }
        public String getSignatureName() {
            return this.signatureName;
        }

    }

    public static class DescribeSignaturesByApiResponseBodySignatures extends TeaModel {
        @NameInMap("SignatureItem")
        public java.util.List<DescribeSignaturesByApiResponseBodySignaturesSignatureItem> signatureItem;

        public static DescribeSignaturesByApiResponseBodySignatures build(java.util.Map<String, ?> map) throws Exception {
            DescribeSignaturesByApiResponseBodySignatures self = new DescribeSignaturesByApiResponseBodySignatures();
            return TeaModel.build(map, self);
        }

        public DescribeSignaturesByApiResponseBodySignatures setSignatureItem(java.util.List<DescribeSignaturesByApiResponseBodySignaturesSignatureItem> signatureItem) {
            this.signatureItem = signatureItem;
            return this;
        }
        public java.util.List<DescribeSignaturesByApiResponseBodySignaturesSignatureItem> getSignatureItem() {
            return this.signatureItem;
        }

    }

}
