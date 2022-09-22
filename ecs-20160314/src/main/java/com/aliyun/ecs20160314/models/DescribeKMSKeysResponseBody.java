// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeKMSKeysResponseBody extends TeaModel {
    @NameInMap("KMSKeyIds")
    public KMSKeyIds KMSKeyIds;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeKMSKeysResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeKMSKeysResponseBody self = new DescribeKMSKeysResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeKMSKeysResponseBody setKMSKeyIds(KMSKeyIds KMSKeyIds) {
        this.KMSKeyIds = KMSKeyIds;
        return this;
    }
    public KMSKeyIds getKMSKeyIds() {
        return this.KMSKeyIds;
    }

    public DescribeKMSKeysResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeKMSKeysResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeKMSKeysResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeKMSKeysResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class KMSKeyIds extends TeaModel {
        @NameInMap("kmsKeyId")
        public java.util.List<String> kmsKeyId;

        public static KMSKeyIds build(java.util.Map<String, ?> map) throws Exception {
            KMSKeyIds self = new KMSKeyIds();
            return TeaModel.build(map, self);
        }

        public KMSKeyIds setKmsKeyId(java.util.List<String> kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }
        public java.util.List<String> getKmsKeyId() {
            return this.kmsKeyId;
        }

    }

}
