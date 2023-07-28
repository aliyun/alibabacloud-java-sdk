// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeTableDetailResponseBody extends TeaModel {
    /**
     * <p>The average number of rows in partitions.</p>
     */
    @NameInMap("AvgSize")
    public Long avgSize;

    /**
     * <p>The list of partitions.</p>
     */
    @NameInMap("Items")
    public DescribeTableDetailResponseBodyItems items;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeTableDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTableDetailResponseBody self = new DescribeTableDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTableDetailResponseBody setAvgSize(Long avgSize) {
        this.avgSize = avgSize;
        return this;
    }
    public Long getAvgSize() {
        return this.avgSize;
    }

    public DescribeTableDetailResponseBody setItems(DescribeTableDetailResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeTableDetailResponseBodyItems getItems() {
        return this.items;
    }

    public DescribeTableDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeTableDetailResponseBodyItemsShard extends TeaModel {
        /**
         * <p>The ID of the partition. Only the numeric part of the partition name is returned.</p>
         */
        @NameInMap("Id")
        public Integer id;

        /**
         * <p>The number of rows in the table.</p>
         */
        @NameInMap("Size")
        public Long size;

        public static DescribeTableDetailResponseBodyItemsShard build(java.util.Map<String, ?> map) throws Exception {
            DescribeTableDetailResponseBodyItemsShard self = new DescribeTableDetailResponseBodyItemsShard();
            return TeaModel.build(map, self);
        }

        public DescribeTableDetailResponseBodyItemsShard setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public DescribeTableDetailResponseBodyItemsShard setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

    }

    public static class DescribeTableDetailResponseBodyItems extends TeaModel {
        @NameInMap("Shard")
        public java.util.List<DescribeTableDetailResponseBodyItemsShard> shard;

        public static DescribeTableDetailResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeTableDetailResponseBodyItems self = new DescribeTableDetailResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeTableDetailResponseBodyItems setShard(java.util.List<DescribeTableDetailResponseBodyItemsShard> shard) {
            this.shard = shard;
            return this;
        }
        public java.util.List<DescribeTableDetailResponseBodyItemsShard> getShard() {
            return this.shard;
        }

    }

}
