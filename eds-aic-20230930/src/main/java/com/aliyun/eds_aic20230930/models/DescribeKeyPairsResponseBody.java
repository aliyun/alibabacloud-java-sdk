// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DescribeKeyPairsResponseBody extends TeaModel {
    /**
     * <p>The objects that are returned.</p>
     */
    @NameInMap("Data")
    public java.util.List<DescribeKeyPairsResponseBodyData> data;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results. If NextToken is empty, no next page exists.</p>
     * 
     * <strong>example:</strong>
     * <p>FFbc8N4E1iOlcSxC+8boa0HHH2LKWbggYUinyrZWvtS1oTrMYCg1HuMLGuftj0****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>565FB06A-AE04-5AD0-8A32-5BA92CA5****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeKeyPairsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeKeyPairsResponseBody self = new DescribeKeyPairsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeKeyPairsResponseBody setData(java.util.List<DescribeKeyPairsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeKeyPairsResponseBodyData> getData() {
        return this.data;
    }

    public DescribeKeyPairsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
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

    public static class DescribeKeyPairsResponseBodyData extends TeaModel {
        /**
         * <p>The time when the ADB key pair was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-10-11T08:53:32Z</p>
         */
        @NameInMap("GmtCreated")
        public String gmtCreated;

        /**
         * <p>The ID of the ADB key pair.</p>
         * 
         * <strong>example:</strong>
         * <p>kp-6v2q33ae4tw3a****</p>
         */
        @NameInMap("KeyPairId")
        public String keyPairId;

        /**
         * <p>The name of the ADB key pair.</p>
         * 
         * <strong>example:</strong>
         * <p>testKeyPairName</p>
         */
        @NameInMap("KeyPairName")
        public String keyPairName;

        public static DescribeKeyPairsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeKeyPairsResponseBodyData self = new DescribeKeyPairsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeKeyPairsResponseBodyData setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public DescribeKeyPairsResponseBodyData setKeyPairId(String keyPairId) {
            this.keyPairId = keyPairId;
            return this;
        }
        public String getKeyPairId() {
            return this.keyPairId;
        }

        public DescribeKeyPairsResponseBodyData setKeyPairName(String keyPairName) {
            this.keyPairName = keyPairName;
            return this;
        }
        public String getKeyPairName() {
            return this.keyPairName;
        }

    }

}
