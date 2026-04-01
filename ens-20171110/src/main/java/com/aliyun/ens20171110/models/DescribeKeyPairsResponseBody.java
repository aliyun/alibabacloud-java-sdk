// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeKeyPairsResponseBody extends TeaModel {
    @NameInMap("KeyPairs")
    public DescribeKeyPairsResponseBodyKeyPairs keyPairs;

    /**
     * <p>The page number.</p>
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
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>37B52F33-6879-49D0-A39B-22966B01449E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of key pairs.</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeKeyPairsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeKeyPairsResponseBody self = new DescribeKeyPairsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeKeyPairsResponseBody setKeyPairs(DescribeKeyPairsResponseBodyKeyPairs keyPairs) {
        this.keyPairs = keyPairs;
        return this;
    }
    public DescribeKeyPairsResponseBodyKeyPairs getKeyPairs() {
        return this.keyPairs;
    }

    public DescribeKeyPairsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeKeyPairsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeKeyPairsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeKeyPairsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeKeyPairsResponseBodyKeyPairsKeyPair extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("KeyPairFingerPrint")
        public String keyPairFingerPrint;

        @NameInMap("KeyPairId")
        public String keyPairId;

        @NameInMap("KeyPairName")
        public String keyPairName;

        public static DescribeKeyPairsResponseBodyKeyPairsKeyPair build(java.util.Map<String, ?> map) throws Exception {
            DescribeKeyPairsResponseBodyKeyPairsKeyPair self = new DescribeKeyPairsResponseBodyKeyPairsKeyPair();
            return TeaModel.build(map, self);
        }

        public DescribeKeyPairsResponseBodyKeyPairsKeyPair setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeKeyPairsResponseBodyKeyPairsKeyPair setKeyPairFingerPrint(String keyPairFingerPrint) {
            this.keyPairFingerPrint = keyPairFingerPrint;
            return this;
        }
        public String getKeyPairFingerPrint() {
            return this.keyPairFingerPrint;
        }

        public DescribeKeyPairsResponseBodyKeyPairsKeyPair setKeyPairId(String keyPairId) {
            this.keyPairId = keyPairId;
            return this;
        }
        public String getKeyPairId() {
            return this.keyPairId;
        }

        public DescribeKeyPairsResponseBodyKeyPairsKeyPair setKeyPairName(String keyPairName) {
            this.keyPairName = keyPairName;
            return this;
        }
        public String getKeyPairName() {
            return this.keyPairName;
        }

    }

    public static class DescribeKeyPairsResponseBodyKeyPairs extends TeaModel {
        @NameInMap("KeyPair")
        public java.util.List<DescribeKeyPairsResponseBodyKeyPairsKeyPair> keyPair;

        public static DescribeKeyPairsResponseBodyKeyPairs build(java.util.Map<String, ?> map) throws Exception {
            DescribeKeyPairsResponseBodyKeyPairs self = new DescribeKeyPairsResponseBodyKeyPairs();
            return TeaModel.build(map, self);
        }

        public DescribeKeyPairsResponseBodyKeyPairs setKeyPair(java.util.List<DescribeKeyPairsResponseBodyKeyPairsKeyPair> keyPair) {
            this.keyPair = keyPair;
            return this;
        }
        public java.util.List<DescribeKeyPairsResponseBodyKeyPairsKeyPair> getKeyPair() {
            return this.keyPair;
        }

    }

}
