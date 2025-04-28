// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeDBClusterShardNumberResponseBody extends TeaModel {
    /**
     * <p>The supported numbers of shards, including the number of current shards and the number of desired shards.</p>
     */
    @NameInMap("AvailableShardNumberList")
    public java.util.List<DescribeDBClusterShardNumberResponseBodyAvailableShardNumberList> availableShardNumberList;

    /**
     * <p>The number of desired shards, excluding the number of current shards.</p>
     */
    @NameInMap("AvailableShardNumbers")
    public java.util.List<Integer> availableShardNumbers;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CBE843D8-964D-5EA3-9D31-822125611B6E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of shards that you want to change during the data migration.</p>
     * 
     * <strong>example:</strong>
     * <p>128</p>
     */
    @NameInMap("ShardNumber")
    public Integer shardNumber;

    public static DescribeDBClusterShardNumberResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterShardNumberResponseBody self = new DescribeDBClusterShardNumberResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterShardNumberResponseBody setAvailableShardNumberList(java.util.List<DescribeDBClusterShardNumberResponseBodyAvailableShardNumberList> availableShardNumberList) {
        this.availableShardNumberList = availableShardNumberList;
        return this;
    }
    public java.util.List<DescribeDBClusterShardNumberResponseBodyAvailableShardNumberList> getAvailableShardNumberList() {
        return this.availableShardNumberList;
    }

    public DescribeDBClusterShardNumberResponseBody setAvailableShardNumbers(java.util.List<Integer> availableShardNumbers) {
        this.availableShardNumbers = availableShardNumbers;
        return this;
    }
    public java.util.List<Integer> getAvailableShardNumbers() {
        return this.availableShardNumbers;
    }

    public DescribeDBClusterShardNumberResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBClusterShardNumberResponseBody setShardNumber(Integer shardNumber) {
        this.shardNumber = shardNumber;
        return this;
    }
    public Integer getShardNumber() {
        return this.shardNumber;
    }

    public static class DescribeDBClusterShardNumberResponseBodyAvailableShardNumberList extends TeaModel {
        /**
         * <p>The number of shards.</p>
         * 
         * <strong>example:</strong>
         * <p>128</p>
         */
        @NameInMap("ShardNumber")
        public Integer shardNumber;

        public static DescribeDBClusterShardNumberResponseBodyAvailableShardNumberList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterShardNumberResponseBodyAvailableShardNumberList self = new DescribeDBClusterShardNumberResponseBodyAvailableShardNumberList();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterShardNumberResponseBodyAvailableShardNumberList setShardNumber(Integer shardNumber) {
            this.shardNumber = shardNumber;
            return this;
        }
        public Integer getShardNumber() {
            return this.shardNumber;
        }

    }

}
