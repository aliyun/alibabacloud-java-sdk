// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeDBClusterSpaceSummaryResponseBody extends TeaModel {
    /**
     * <p>The queried storage overview information.</p>
     */
    @NameInMap("Data")
    public DescribeDBClusterSpaceSummaryResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDBClusterSpaceSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterSpaceSummaryResponseBody self = new DescribeDBClusterSpaceSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterSpaceSummaryResponseBody setData(DescribeDBClusterSpaceSummaryResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeDBClusterSpaceSummaryResponseBodyData getData() {
        return this.data;
    }

    public DescribeDBClusterSpaceSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDBClusterSpaceSummaryResponseBodyDataColdData extends TeaModel {
        /**
         * <p>The data size of table records. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>1048576</p>
         */
        @NameInMap("DataSize")
        public Long dataSize;

        /**
         * <p>The data size of regular indexes. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>1048576</p>
         */
        @NameInMap("IndexSize")
        public Long indexSize;

        /**
         * <p>The data size of other data. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>1048576</p>
         */
        @NameInMap("OtherSize")
        public Long otherSize;

        /**
         * <p>The data size of primary key indexes. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>1048576</p>
         */
        @NameInMap("PrimaryKeyIndexSize")
        public Long primaryKeyIndexSize;

        /**
         * <p>The cold data size. Unit: bytes.</p>
         * <blockquote>
         * <p> Formula: Cold data size = Data size of table records + Data size of regular indexes + Data size of primary key indexes + Data size of other data.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>4194304</p>
         */
        @NameInMap("TotalSize")
        public Long totalSize;

        public static DescribeDBClusterSpaceSummaryResponseBodyDataColdData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterSpaceSummaryResponseBodyDataColdData self = new DescribeDBClusterSpaceSummaryResponseBodyDataColdData();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterSpaceSummaryResponseBodyDataColdData setDataSize(Long dataSize) {
            this.dataSize = dataSize;
            return this;
        }
        public Long getDataSize() {
            return this.dataSize;
        }

        public DescribeDBClusterSpaceSummaryResponseBodyDataColdData setIndexSize(Long indexSize) {
            this.indexSize = indexSize;
            return this;
        }
        public Long getIndexSize() {
            return this.indexSize;
        }

        public DescribeDBClusterSpaceSummaryResponseBodyDataColdData setOtherSize(Long otherSize) {
            this.otherSize = otherSize;
            return this;
        }
        public Long getOtherSize() {
            return this.otherSize;
        }

        public DescribeDBClusterSpaceSummaryResponseBodyDataColdData setPrimaryKeyIndexSize(Long primaryKeyIndexSize) {
            this.primaryKeyIndexSize = primaryKeyIndexSize;
            return this;
        }
        public Long getPrimaryKeyIndexSize() {
            return this.primaryKeyIndexSize;
        }

        public DescribeDBClusterSpaceSummaryResponseBodyDataColdData setTotalSize(Long totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Long getTotalSize() {
            return this.totalSize;
        }

    }

    public static class DescribeDBClusterSpaceSummaryResponseBodyDataDataGrowth extends TeaModel {
        /**
         * <p>The data growth within the last day. Unit: bytes.</p>
         * <blockquote>
         * <p> Formula: Data growth within the last day = Current data size - Data size one day ago.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1048576</p>
         */
        @NameInMap("DayGrowth")
        public Long dayGrowth;

        /**
         * <p>The daily data growth within the last seven days. Unit: bytes.</p>
         * <blockquote>
         * <p> Formula: Daily data growth within the last seven days = (Current data size - Data size seven days ago)/7.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1048576</p>
         */
        @NameInMap("WeekGrowth")
        public Long weekGrowth;

        public static DescribeDBClusterSpaceSummaryResponseBodyDataDataGrowth build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterSpaceSummaryResponseBodyDataDataGrowth self = new DescribeDBClusterSpaceSummaryResponseBodyDataDataGrowth();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterSpaceSummaryResponseBodyDataDataGrowth setDayGrowth(Long dayGrowth) {
            this.dayGrowth = dayGrowth;
            return this;
        }
        public Long getDayGrowth() {
            return this.dayGrowth;
        }

        public DescribeDBClusterSpaceSummaryResponseBodyDataDataGrowth setWeekGrowth(Long weekGrowth) {
            this.weekGrowth = weekGrowth;
            return this;
        }
        public Long getWeekGrowth() {
            return this.weekGrowth;
        }

    }

    public static class DescribeDBClusterSpaceSummaryResponseBodyDataHotData extends TeaModel {
        /**
         * <p>The data size of table records. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>1048576</p>
         */
        @NameInMap("DataSize")
        public Long dataSize;

        /**
         * <p>The data size of regular indexes. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>1048576</p>
         */
        @NameInMap("IndexSize")
        public Long indexSize;

        /**
         * <p>The data size of other data. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>1048576</p>
         */
        @NameInMap("OtherSize")
        public Long otherSize;

        /**
         * <p>The data size of primary key indexes. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>1048576</p>
         */
        @NameInMap("PrimaryKeyIndexSize")
        public Long primaryKeyIndexSize;

        /**
         * <p>The hot data size. Unit: bytes.</p>
         * <blockquote>
         * <p> Formula: Hot data size = Data size of table records + Data size of regular indexes + Data size of primary key indexes + Data size of other data.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>4194304</p>
         */
        @NameInMap("TotalSize")
        public Long totalSize;

        public static DescribeDBClusterSpaceSummaryResponseBodyDataHotData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterSpaceSummaryResponseBodyDataHotData self = new DescribeDBClusterSpaceSummaryResponseBodyDataHotData();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterSpaceSummaryResponseBodyDataHotData setDataSize(Long dataSize) {
            this.dataSize = dataSize;
            return this;
        }
        public Long getDataSize() {
            return this.dataSize;
        }

        public DescribeDBClusterSpaceSummaryResponseBodyDataHotData setIndexSize(Long indexSize) {
            this.indexSize = indexSize;
            return this;
        }
        public Long getIndexSize() {
            return this.indexSize;
        }

        public DescribeDBClusterSpaceSummaryResponseBodyDataHotData setOtherSize(Long otherSize) {
            this.otherSize = otherSize;
            return this;
        }
        public Long getOtherSize() {
            return this.otherSize;
        }

        public DescribeDBClusterSpaceSummaryResponseBodyDataHotData setPrimaryKeyIndexSize(Long primaryKeyIndexSize) {
            this.primaryKeyIndexSize = primaryKeyIndexSize;
            return this;
        }
        public Long getPrimaryKeyIndexSize() {
            return this.primaryKeyIndexSize;
        }

        public DescribeDBClusterSpaceSummaryResponseBodyDataHotData setTotalSize(Long totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Long getTotalSize() {
            return this.totalSize;
        }

    }

    public static class DescribeDBClusterSpaceSummaryResponseBodyData extends TeaModel {
        /**
         * <p>The cold data.</p>
         */
        @NameInMap("ColdData")
        public DescribeDBClusterSpaceSummaryResponseBodyDataColdData coldData;

        /**
         * <p>The data growth.</p>
         */
        @NameInMap("DataGrowth")
        public DescribeDBClusterSpaceSummaryResponseBodyDataDataGrowth dataGrowth;

        /**
         * <p>The hot data.</p>
         */
        @NameInMap("HotData")
        public DescribeDBClusterSpaceSummaryResponseBodyDataHotData hotData;

        /**
         * <p>The total data size. Unit: bytes.</p>
         * <blockquote>
         * <p> Formula: Total data size = Hot data size+ Cold data size.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>8388608</p>
         */
        @NameInMap("TotalSize")
        public String totalSize;

        public static DescribeDBClusterSpaceSummaryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterSpaceSummaryResponseBodyData self = new DescribeDBClusterSpaceSummaryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterSpaceSummaryResponseBodyData setColdData(DescribeDBClusterSpaceSummaryResponseBodyDataColdData coldData) {
            this.coldData = coldData;
            return this;
        }
        public DescribeDBClusterSpaceSummaryResponseBodyDataColdData getColdData() {
            return this.coldData;
        }

        public DescribeDBClusterSpaceSummaryResponseBodyData setDataGrowth(DescribeDBClusterSpaceSummaryResponseBodyDataDataGrowth dataGrowth) {
            this.dataGrowth = dataGrowth;
            return this;
        }
        public DescribeDBClusterSpaceSummaryResponseBodyDataDataGrowth getDataGrowth() {
            return this.dataGrowth;
        }

        public DescribeDBClusterSpaceSummaryResponseBodyData setHotData(DescribeDBClusterSpaceSummaryResponseBodyDataHotData hotData) {
            this.hotData = hotData;
            return this;
        }
        public DescribeDBClusterSpaceSummaryResponseBodyDataHotData getHotData() {
            return this.hotData;
        }

        public DescribeDBClusterSpaceSummaryResponseBodyData setTotalSize(String totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public String getTotalSize() {
            return this.totalSize;
        }

    }

}
