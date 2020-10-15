// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeKeyPairsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("KeyPairs")
    @Validation(required = true)
    public DescribeKeyPairsResponseKeyPairs keyPairs;

    public static DescribeKeyPairsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeKeyPairsResponse self = new DescribeKeyPairsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeKeyPairsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeKeyPairsResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeKeyPairsResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeKeyPairsResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeKeyPairsResponse setKeyPairs(DescribeKeyPairsResponseKeyPairs keyPairs) {
        this.keyPairs = keyPairs;
        return this;
    }
    public DescribeKeyPairsResponseKeyPairs getKeyPairs() {
        return this.keyPairs;
    }

    public static class DescribeKeyPairsResponseKeyPairsKeyPair extends TeaModel {
        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("KeyPairName")
        @Validation(required = true)
        public String keyPairName;

        @NameInMap("KeyPairFingerPrint")
        @Validation(required = true)
        public String keyPairFingerPrint;

        public static DescribeKeyPairsResponseKeyPairsKeyPair build(java.util.Map<String, ?> map) throws Exception {
            DescribeKeyPairsResponseKeyPairsKeyPair self = new DescribeKeyPairsResponseKeyPairsKeyPair();
            return TeaModel.build(map, self);
        }

        public DescribeKeyPairsResponseKeyPairsKeyPair setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeKeyPairsResponseKeyPairsKeyPair setKeyPairName(String keyPairName) {
            this.keyPairName = keyPairName;
            return this;
        }
        public String getKeyPairName() {
            return this.keyPairName;
        }

        public DescribeKeyPairsResponseKeyPairsKeyPair setKeyPairFingerPrint(String keyPairFingerPrint) {
            this.keyPairFingerPrint = keyPairFingerPrint;
            return this;
        }
        public String getKeyPairFingerPrint() {
            return this.keyPairFingerPrint;
        }

    }

    public static class DescribeKeyPairsResponseKeyPairs extends TeaModel {
        @NameInMap("KeyPair")
        @Validation(required = true)
        public java.util.List<DescribeKeyPairsResponseKeyPairsKeyPair> keyPair;

        public static DescribeKeyPairsResponseKeyPairs build(java.util.Map<String, ?> map) throws Exception {
            DescribeKeyPairsResponseKeyPairs self = new DescribeKeyPairsResponseKeyPairs();
            return TeaModel.build(map, self);
        }

        public DescribeKeyPairsResponseKeyPairs setKeyPair(java.util.List<DescribeKeyPairsResponseKeyPairsKeyPair> keyPair) {
            this.keyPair = keyPair;
            return this;
        }
        public java.util.List<DescribeKeyPairsResponseKeyPairsKeyPair> getKeyPair() {
            return this.keyPair;
        }

    }

}
