// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphone20201230.models;

import com.aliyun.tea.*;

public class ListKeyPairsResponseBody extends TeaModel {
    @NameInMap("KeyPairs")
    public ListKeyPairsResponseBodyKeyPairs keyPairs;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListKeyPairsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListKeyPairsResponseBody self = new ListKeyPairsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListKeyPairsResponseBody setKeyPairs(ListKeyPairsResponseBodyKeyPairs keyPairs) {
        this.keyPairs = keyPairs;
        return this;
    }
    public ListKeyPairsResponseBodyKeyPairs getKeyPairs() {
        return this.keyPairs;
    }

    public ListKeyPairsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListKeyPairsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListKeyPairsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListKeyPairsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListKeyPairsResponseBodyKeyPairsKeyPair extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("KeyPairFingerPrint")
        public String keyPairFingerPrint;

        @NameInMap("KeyPairName")
        public String keyPairName;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        public static ListKeyPairsResponseBodyKeyPairsKeyPair build(java.util.Map<String, ?> map) throws Exception {
            ListKeyPairsResponseBodyKeyPairsKeyPair self = new ListKeyPairsResponseBodyKeyPairsKeyPair();
            return TeaModel.build(map, self);
        }

        public ListKeyPairsResponseBodyKeyPairsKeyPair setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ListKeyPairsResponseBodyKeyPairsKeyPair setKeyPairFingerPrint(String keyPairFingerPrint) {
            this.keyPairFingerPrint = keyPairFingerPrint;
            return this;
        }
        public String getKeyPairFingerPrint() {
            return this.keyPairFingerPrint;
        }

        public ListKeyPairsResponseBodyKeyPairsKeyPair setKeyPairName(String keyPairName) {
            this.keyPairName = keyPairName;
            return this;
        }
        public String getKeyPairName() {
            return this.keyPairName;
        }

        public ListKeyPairsResponseBodyKeyPairsKeyPair setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

    }

    public static class ListKeyPairsResponseBodyKeyPairs extends TeaModel {
        @NameInMap("KeyPair")
        public java.util.List<ListKeyPairsResponseBodyKeyPairsKeyPair> keyPair;

        public static ListKeyPairsResponseBodyKeyPairs build(java.util.Map<String, ?> map) throws Exception {
            ListKeyPairsResponseBodyKeyPairs self = new ListKeyPairsResponseBodyKeyPairs();
            return TeaModel.build(map, self);
        }

        public ListKeyPairsResponseBodyKeyPairs setKeyPair(java.util.List<ListKeyPairsResponseBodyKeyPairsKeyPair> keyPair) {
            this.keyPair = keyPair;
            return this;
        }
        public java.util.List<ListKeyPairsResponseBodyKeyPairsKeyPair> getKeyPair() {
            return this.keyPair;
        }

    }

}
