// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeSQLLogCountResponseBody extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("Items")
    public java.util.List<DescribeSQLLogCountResponseBodyItems> items;

    public static DescribeSQLLogCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSQLLogCountResponseBody self = new DescribeSQLLogCountResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSQLLogCountResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeSQLLogCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSQLLogCountResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeSQLLogCountResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeSQLLogCountResponseBody setItems(java.util.List<DescribeSQLLogCountResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeSQLLogCountResponseBodyItems> getItems() {
        return this.items;
    }

    public static class DescribeSQLLogCountResponseBodyItemsSeriesValues extends TeaModel {
        @NameInMap("Point")
        public java.util.List<String> point;

        public static DescribeSQLLogCountResponseBodyItemsSeriesValues build(java.util.Map<String, ?> map) throws Exception {
            DescribeSQLLogCountResponseBodyItemsSeriesValues self = new DescribeSQLLogCountResponseBodyItemsSeriesValues();
            return TeaModel.build(map, self);
        }

        public DescribeSQLLogCountResponseBodyItemsSeriesValues setPoint(java.util.List<String> point) {
            this.point = point;
            return this;
        }
        public java.util.List<String> getPoint() {
            return this.point;
        }

    }

    public static class DescribeSQLLogCountResponseBodyItemsSeries extends TeaModel {
        @NameInMap("Values")
        public java.util.List<DescribeSQLLogCountResponseBodyItemsSeriesValues> values;

        public static DescribeSQLLogCountResponseBodyItemsSeries build(java.util.Map<String, ?> map) throws Exception {
            DescribeSQLLogCountResponseBodyItemsSeries self = new DescribeSQLLogCountResponseBodyItemsSeries();
            return TeaModel.build(map, self);
        }

        public DescribeSQLLogCountResponseBodyItemsSeries setValues(java.util.List<DescribeSQLLogCountResponseBodyItemsSeriesValues> values) {
            this.values = values;
            return this;
        }
        public java.util.List<DescribeSQLLogCountResponseBodyItemsSeriesValues> getValues() {
            return this.values;
        }

    }

    public static class DescribeSQLLogCountResponseBodyItems extends TeaModel {
        @NameInMap("Series")
        public java.util.List<DescribeSQLLogCountResponseBodyItemsSeries> series;

        @NameInMap("Name")
        public String name;

        public static DescribeSQLLogCountResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeSQLLogCountResponseBodyItems self = new DescribeSQLLogCountResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeSQLLogCountResponseBodyItems setSeries(java.util.List<DescribeSQLLogCountResponseBodyItemsSeries> series) {
            this.series = series;
            return this;
        }
        public java.util.List<DescribeSQLLogCountResponseBodyItemsSeries> getSeries() {
            return this.series;
        }

        public DescribeSQLLogCountResponseBodyItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
