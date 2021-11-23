// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeSignaturesResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SignatureInfos")
    public DescribeSignaturesResponseBodySignatureInfos signatureInfos;

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
        @NameInMap("CreatedTime")
        public String createdTime;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("SignatureId")
        public String signatureId;

        @NameInMap("SignatureKey")
        public String signatureKey;

        @NameInMap("SignatureName")
        public String signatureName;

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
