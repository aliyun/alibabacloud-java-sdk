// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeApiSignaturesResponseBody extends TeaModel {
    @NameInMap("ApiSignatures")
    public DescribeApiSignaturesResponseBodyApiSignatures apiSignatures;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeApiSignaturesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApiSignaturesResponseBody self = new DescribeApiSignaturesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApiSignaturesResponseBody setApiSignatures(DescribeApiSignaturesResponseBodyApiSignatures apiSignatures) {
        this.apiSignatures = apiSignatures;
        return this;
    }
    public DescribeApiSignaturesResponseBodyApiSignatures getApiSignatures() {
        return this.apiSignatures;
    }

    public DescribeApiSignaturesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeApiSignaturesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeApiSignaturesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeApiSignaturesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeApiSignaturesResponseBodyApiSignaturesApiSignatureItem extends TeaModel {
        @NameInMap("ApiId")
        public String apiId;

        @NameInMap("ApiName")
        public String apiName;

        @NameInMap("BoundTime")
        public String boundTime;

        @NameInMap("SignatureId")
        public String signatureId;

        @NameInMap("SignatureName")
        public String signatureName;

        public static DescribeApiSignaturesResponseBodyApiSignaturesApiSignatureItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiSignaturesResponseBodyApiSignaturesApiSignatureItem self = new DescribeApiSignaturesResponseBodyApiSignaturesApiSignatureItem();
            return TeaModel.build(map, self);
        }

        public DescribeApiSignaturesResponseBodyApiSignaturesApiSignatureItem setApiId(String apiId) {
            this.apiId = apiId;
            return this;
        }
        public String getApiId() {
            return this.apiId;
        }

        public DescribeApiSignaturesResponseBodyApiSignaturesApiSignatureItem setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public DescribeApiSignaturesResponseBodyApiSignaturesApiSignatureItem setBoundTime(String boundTime) {
            this.boundTime = boundTime;
            return this;
        }
        public String getBoundTime() {
            return this.boundTime;
        }

        public DescribeApiSignaturesResponseBodyApiSignaturesApiSignatureItem setSignatureId(String signatureId) {
            this.signatureId = signatureId;
            return this;
        }
        public String getSignatureId() {
            return this.signatureId;
        }

        public DescribeApiSignaturesResponseBodyApiSignaturesApiSignatureItem setSignatureName(String signatureName) {
            this.signatureName = signatureName;
            return this;
        }
        public String getSignatureName() {
            return this.signatureName;
        }

    }

    public static class DescribeApiSignaturesResponseBodyApiSignatures extends TeaModel {
        @NameInMap("ApiSignatureItem")
        public java.util.List<DescribeApiSignaturesResponseBodyApiSignaturesApiSignatureItem> apiSignatureItem;

        public static DescribeApiSignaturesResponseBodyApiSignatures build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiSignaturesResponseBodyApiSignatures self = new DescribeApiSignaturesResponseBodyApiSignatures();
            return TeaModel.build(map, self);
        }

        public DescribeApiSignaturesResponseBodyApiSignatures setApiSignatureItem(java.util.List<DescribeApiSignaturesResponseBodyApiSignaturesApiSignatureItem> apiSignatureItem) {
            this.apiSignatureItem = apiSignatureItem;
            return this;
        }
        public java.util.List<DescribeApiSignaturesResponseBodyApiSignaturesApiSignatureItem> getApiSignatureItem() {
            return this.apiSignatureItem;
        }

    }

}
