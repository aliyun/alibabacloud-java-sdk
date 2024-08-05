// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeApiSignaturesResponseBody extends TeaModel {
    /**
     * <p>The returned signature key information. It is an array consisting of ApiSignatureItem data.</p>
     */
    @NameInMap("ApiSignatures")
    public DescribeApiSignaturesResponseBodyApiSignatures apiSignatures;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>CEF72CEB-54B6-4AE8-B225-F876FF7BZ004</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of returned entries.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
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
        /**
         * <p>The ID of the API.</p>
         * 
         * <strong>example:</strong>
         * <p>46fbb52840d146f186e38e8e70fc8c90</p>
         */
        @NameInMap("ApiId")
        public String apiId;

        /**
         * <p>The name of the API.</p>
         * 
         * <strong>example:</strong>
         * <p>testapi</p>
         */
        @NameInMap("ApiName")
        public String apiName;

        /**
         * <p>The time when the backend signature key was bound.</p>
         * 
         * <strong>example:</strong>
         * <p>2016-07-23T08:28:48Z</p>
         */
        @NameInMap("BoundTime")
        public String boundTime;

        /**
         * <p>The ID of the backend signature key.</p>
         * 
         * <strong>example:</strong>
         * <p>dd05f1c54d6749eda95f9fa6d491449a</p>
         */
        @NameInMap("SignatureId")
        public String signatureId;

        /**
         * <p>The name of the backend signature key.</p>
         * 
         * <strong>example:</strong>
         * <p>backendsignature</p>
         */
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
