// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeSlowLogTrendResponseBody extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The end time of the query. The end time must be later than the start time. The maximum time range that can be specified is seven days. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The information about the trend of slow query logs.</p>
     */
    @NameInMap("Items")
    public DescribeSlowLogTrendResponseBodyItems items;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The start time of the query. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeSlowLogTrendResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlowLogTrendResponseBody self = new DescribeSlowLogTrendResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSlowLogTrendResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeSlowLogTrendResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeSlowLogTrendResponseBody setItems(DescribeSlowLogTrendResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeSlowLogTrendResponseBodyItems getItems() {
        return this.items;
    }

    public DescribeSlowLogTrendResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSlowLogTrendResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class DescribeSlowLogTrendResponseBodyItemsSlowLogTrendItemSeriesSeriesItem extends TeaModel {
        /**
         * <p>The name of the performance metric.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The values of the performance metric.</p>
         */
        @NameInMap("Values")
        public String values;

        public static DescribeSlowLogTrendResponseBodyItemsSlowLogTrendItemSeriesSeriesItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeSlowLogTrendResponseBodyItemsSlowLogTrendItemSeriesSeriesItem self = new DescribeSlowLogTrendResponseBodyItemsSlowLogTrendItemSeriesSeriesItem();
            return TeaModel.build(map, self);
        }

        public DescribeSlowLogTrendResponseBodyItemsSlowLogTrendItemSeriesSeriesItem setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeSlowLogTrendResponseBodyItemsSlowLogTrendItemSeriesSeriesItem setValues(String values) {
            this.values = values;
            return this;
        }
        public String getValues() {
            return this.values;
        }

    }

    public static class DescribeSlowLogTrendResponseBodyItemsSlowLogTrendItemSeries extends TeaModel {
        @NameInMap("SeriesItem")
        public java.util.List<DescribeSlowLogTrendResponseBodyItemsSlowLogTrendItemSeriesSeriesItem> seriesItem;

        public static DescribeSlowLogTrendResponseBodyItemsSlowLogTrendItemSeries build(java.util.Map<String, ?> map) throws Exception {
            DescribeSlowLogTrendResponseBodyItemsSlowLogTrendItemSeries self = new DescribeSlowLogTrendResponseBodyItemsSlowLogTrendItemSeries();
            return TeaModel.build(map, self);
        }

        public DescribeSlowLogTrendResponseBodyItemsSlowLogTrendItemSeries setSeriesItem(java.util.List<DescribeSlowLogTrendResponseBodyItemsSlowLogTrendItemSeriesSeriesItem> seriesItem) {
            this.seriesItem = seriesItem;
            return this;
        }
        public java.util.List<DescribeSlowLogTrendResponseBodyItemsSlowLogTrendItemSeriesSeriesItem> getSeriesItem() {
            return this.seriesItem;
        }

    }

    public static class DescribeSlowLogTrendResponseBodyItemsSlowLogTrendItem extends TeaModel {
        /**
         * <p>The trend of slow query logs. The value is AnalyticDB_SlowLogTrend.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The performance metrics.</p>
         */
        @NameInMap("Series")
        public DescribeSlowLogTrendResponseBodyItemsSlowLogTrendItemSeries series;

        /**
         * <p>The unit of performance metrics.</p>
         */
        @NameInMap("Unit")
        public String unit;

        public static DescribeSlowLogTrendResponseBodyItemsSlowLogTrendItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeSlowLogTrendResponseBodyItemsSlowLogTrendItem self = new DescribeSlowLogTrendResponseBodyItemsSlowLogTrendItem();
            return TeaModel.build(map, self);
        }

        public DescribeSlowLogTrendResponseBodyItemsSlowLogTrendItem setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeSlowLogTrendResponseBodyItemsSlowLogTrendItem setSeries(DescribeSlowLogTrendResponseBodyItemsSlowLogTrendItemSeries series) {
            this.series = series;
            return this;
        }
        public DescribeSlowLogTrendResponseBodyItemsSlowLogTrendItemSeries getSeries() {
            return this.series;
        }

        public DescribeSlowLogTrendResponseBodyItemsSlowLogTrendItem setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

    }

    public static class DescribeSlowLogTrendResponseBodyItems extends TeaModel {
        @NameInMap("SlowLogTrendItem")
        public java.util.List<DescribeSlowLogTrendResponseBodyItemsSlowLogTrendItem> slowLogTrendItem;

        public static DescribeSlowLogTrendResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeSlowLogTrendResponseBodyItems self = new DescribeSlowLogTrendResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeSlowLogTrendResponseBodyItems setSlowLogTrendItem(java.util.List<DescribeSlowLogTrendResponseBodyItemsSlowLogTrendItem> slowLogTrendItem) {
            this.slowLogTrendItem = slowLogTrendItem;
            return this;
        }
        public java.util.List<DescribeSlowLogTrendResponseBodyItemsSlowLogTrendItem> getSlowLogTrendItem() {
            return this.slowLogTrendItem;
        }

    }

}
