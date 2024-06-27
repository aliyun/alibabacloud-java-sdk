// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeSQLLogCountResponseBody extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-xxxxxxxx</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The end time of the query.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-12-14T11:22Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The name of the instance.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeSQLLogCountResponseBodyItems> items;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7565770E-7C45-462D-BA4A-8A**********</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The start time of the query.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-12-12T11:22Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeSQLLogCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSQLLogCountResponseBody self = new DescribeSQLLogCountResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSQLLogCountResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeSQLLogCountResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeSQLLogCountResponseBody setItems(java.util.List<DescribeSQLLogCountResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeSQLLogCountResponseBodyItems> getItems() {
        return this.items;
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

    public static class DescribeSQLLogCountResponseBodyItemsSeriesValues extends TeaModel {
        /**
         * <p>The time when the audit logs were generated and the number of the audit logs.</p>
         */
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
        /**
         * <p>Details of the audit logs.</p>
         */
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
        /**
         * <p>The name of the table.</p>
         * 
         * <strong>example:</strong>
         * <p>gp-xxxxxxxx</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Details of the audit logs.</p>
         */
        @NameInMap("Series")
        public java.util.List<DescribeSQLLogCountResponseBodyItemsSeries> series;

        public static DescribeSQLLogCountResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeSQLLogCountResponseBodyItems self = new DescribeSQLLogCountResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeSQLLogCountResponseBodyItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeSQLLogCountResponseBodyItems setSeries(java.util.List<DescribeSQLLogCountResponseBodyItemsSeries> series) {
            this.series = series;
            return this;
        }
        public java.util.List<DescribeSQLLogCountResponseBodyItemsSeries> getSeries() {
            return this.series;
        }

    }

}
