// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeSignaturesResponseBody extends TeaModel {
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
     * <p>The returned signature information. It is an array consisting of SignatureInfo data.</p>
     */
    @NameInMap("SignatureInfos")
    public DescribeSignaturesResponseBodySignatureInfos signatureInfos;

    /**
     * <p>The total number of returned entries.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeSignaturesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSignaturesResponseBody self = new DescribeSignaturesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSignaturesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSignaturesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSignaturesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSignaturesResponseBody setSignatureInfos(DescribeSignaturesResponseBodySignatureInfos signatureInfos) {
        this.signatureInfos = signatureInfos;
        return this;
    }
    public DescribeSignaturesResponseBodySignatureInfos getSignatureInfos() {
        return this.signatureInfos;
    }

    public DescribeSignaturesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeSignaturesResponseBodySignatureInfosSignatureInfo extends TeaModel {
        /**
         * <p>The creation time of the key.</p>
         * 
         * <strong>example:</strong>
         * <p>2016-07-23T08:28:48Z</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <p>The last modification time of the key.</p>
         * 
         * <strong>example:</strong>
         * <p>2016-07-24T08:28:48Z</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <p>The region where the key is located.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-qingdao</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the backend signature key.</p>
         * 
         * <strong>example:</strong>
         * <p>dd05f1c54d6749eda95f9fa6d491449a</p>
         */
        @NameInMap("SignatureId")
        public String signatureId;

        /**
         * <p>The Key value of the backend signature key.</p>
         * 
         * <strong>example:</strong>
         * <p>qwertyuiop</p>
         */
        @NameInMap("SignatureKey")
        public String signatureKey;

        /**
         * <p>The name of the backend signature key.</p>
         * 
         * <strong>example:</strong>
         * <p>backendsignature</p>
         */
        @NameInMap("SignatureName")
        public String signatureName;

        /**
         * <p>The Secret value of the backend signature key.</p>
         * 
         * <strong>example:</strong>
         * <p>asdfghjkl</p>
         */
        @NameInMap("SignatureSecret")
        public String signatureSecret;

        public static DescribeSignaturesResponseBodySignatureInfosSignatureInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeSignaturesResponseBodySignatureInfosSignatureInfo self = new DescribeSignaturesResponseBodySignatureInfosSignatureInfo();
            return TeaModel.build(map, self);
        }

        public DescribeSignaturesResponseBodySignatureInfosSignatureInfo setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public DescribeSignaturesResponseBodySignatureInfosSignatureInfo setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public DescribeSignaturesResponseBodySignatureInfosSignatureInfo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeSignaturesResponseBodySignatureInfosSignatureInfo setSignatureId(String signatureId) {
            this.signatureId = signatureId;
            return this;
        }
        public String getSignatureId() {
            return this.signatureId;
        }

        public DescribeSignaturesResponseBodySignatureInfosSignatureInfo setSignatureKey(String signatureKey) {
            this.signatureKey = signatureKey;
            return this;
        }
        public String getSignatureKey() {
            return this.signatureKey;
        }

        public DescribeSignaturesResponseBodySignatureInfosSignatureInfo setSignatureName(String signatureName) {
            this.signatureName = signatureName;
            return this;
        }
        public String getSignatureName() {
            return this.signatureName;
        }

        public DescribeSignaturesResponseBodySignatureInfosSignatureInfo setSignatureSecret(String signatureSecret) {
            this.signatureSecret = signatureSecret;
            return this;
        }
        public String getSignatureSecret() {
            return this.signatureSecret;
        }

    }

    public static class DescribeSignaturesResponseBodySignatureInfos extends TeaModel {
        @NameInMap("SignatureInfo")
        public java.util.List<DescribeSignaturesResponseBodySignatureInfosSignatureInfo> signatureInfo;

        public static DescribeSignaturesResponseBodySignatureInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeSignaturesResponseBodySignatureInfos self = new DescribeSignaturesResponseBodySignatureInfos();
            return TeaModel.build(map, self);
        }

        public DescribeSignaturesResponseBodySignatureInfos setSignatureInfo(java.util.List<DescribeSignaturesResponseBodySignatureInfosSignatureInfo> signatureInfo) {
            this.signatureInfo = signatureInfo;
            return this;
        }
        public java.util.List<DescribeSignaturesResponseBodySignatureInfosSignatureInfo> getSignatureInfo() {
            return this.signatureInfo;
        }

    }

}
