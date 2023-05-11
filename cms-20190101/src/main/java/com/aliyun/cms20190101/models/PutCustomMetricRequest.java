// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutCustomMetricRequest extends TeaModel {
    @NameInMap("MetricList")
    public java.util.List<PutCustomMetricRequestMetricList> metricList;

    @NameInMap("RegionId")
    public String regionId;

    public static PutCustomMetricRequest build(java.util.Map<String, ?> map) throws Exception {
        PutCustomMetricRequest self = new PutCustomMetricRequest();
        return TeaModel.build(map, self);
    }

    public PutCustomMetricRequest setMetricList(java.util.List<PutCustomMetricRequestMetricList> metricList) {
        this.metricList = metricList;
        return this;
    }
    public java.util.List<PutCustomMetricRequestMetricList> getMetricList() {
        return this.metricList;
    }

    public PutCustomMetricRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class PutCustomMetricRequestMetricList extends TeaModel {
        /**
         * <p>The operation that you want to perform. Set the value to **PutCustomMetric**.</p>
         */
        @NameInMap("Dimensions")
        public String dimensions;

        /**
         * <p>The HTTP status code.</p>
         * <br>
         * <p>>  The status code 200 indicates that the call was successful.</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The type of the reported data. Valid values of N: 1 to 21. Valid values:</p>
         * <br>
         * <p>*   0: reports raw data</p>
         * <p>*   1: reports aggregate data</p>
         * <br>
         * <p>>  We recommend that you report aggregate data in both the aggregation periods of 60s and 300s. Otherwise, you cannot query monitoring data in a time span that is more than seven days.</p>
         */
        @NameInMap("MetricName")
        public String metricName;

        /**
         * <p>The aggregation period. Valid values of N: 1 to 21. Unit: seconds. Valid values: 60 and 300.</p>
         * <br>
         * <p>>  If the MetricList.N.Type parameter is set to 1, the MetricList.N.Period parameter is required.</p>
         */
        @NameInMap("Period")
        public String period;

        /**
         * <p>The collection of metric values. Valid values of N: 1 to 21.</p>
         * <br>
         * <p>>  If the MetricList.N.Type parameter is set to 0, the keys in this parameter must be set to the specified value. CloudMonitor aggregates raw data in each aggregation period to generate multiple statistical values, such as the maximum value, the count, and the total value.</p>
         */
        @NameInMap("Time")
        public String time;

        /**
         * <p>The timestamp when the metric data is generated. Valid values of N: 1 to 21. The timestamp can be in one of the following formats:</p>
         * <br>
         * <p>*   The UTC timestamp that is in the YYYY-MM-DDThh:mm:ssZ format. Example: 20171012T132456.888+0800.</p>
         * <p>*   The UNIX timestamp of the LONG type. Example: 1508136760000.</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The ID of the request.</p>
         */
        @NameInMap("Values")
        public String values;

        public static PutCustomMetricRequestMetricList build(java.util.Map<String, ?> map) throws Exception {
            PutCustomMetricRequestMetricList self = new PutCustomMetricRequestMetricList();
            return TeaModel.build(map, self);
        }

        public PutCustomMetricRequestMetricList setDimensions(String dimensions) {
            this.dimensions = dimensions;
            return this;
        }
        public String getDimensions() {
            return this.dimensions;
        }

        public PutCustomMetricRequestMetricList setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public PutCustomMetricRequestMetricList setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public PutCustomMetricRequestMetricList setPeriod(String period) {
            this.period = period;
            return this;
        }
        public String getPeriod() {
            return this.period;
        }

        public PutCustomMetricRequestMetricList setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public PutCustomMetricRequestMetricList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public PutCustomMetricRequestMetricList setValues(String values) {
            this.values = values;
            return this;
        }
        public String getValues() {
            return this.values;
        }

    }

}
