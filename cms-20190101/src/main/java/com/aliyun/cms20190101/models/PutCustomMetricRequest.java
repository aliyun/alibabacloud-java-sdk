// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutCustomMetricRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
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
         * <p>The dimensions that specify the resources whose monitoring data you want to query. Valid values of N: 1 to 21.</p>
         * <p>Set the value to a collection of key-value pairs. Format:<code>{&quot;Key&quot;:&quot;Value&quot;}</code>.</p>
         * <p>The key or value must be 1 to 64 bytes in length. Excessive characters are truncated.</p>
         * <p>The key or value can contain letters, digits, periods (.), hyphens (-), underscores (_), forward slashes (/), and backslashes (\\).</p>
         * <blockquote>
         * <p> Dimensions must be formatted as a JSON string in a specified order.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;sampleName1&quot;:&quot;value1&quot;,&quot;sampleName2&quot;:&quot;value2&quot;}</p>
         */
        @NameInMap("Dimensions")
        public String dimensions;

        /**
         * <p>The ID of the application group. Valid values of N: 1 to 21.</p>
         * <blockquote>
         * <p> If the metric does not belong to any application group, enter 0.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The name of the metric. Valid values of N: 1 to 21. For more information, see <a href="https://help.aliyun.com/document_detail/163515.html">Appendix 1: Metrics</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cpu_total</p>
         */
        @NameInMap("MetricName")
        public String metricName;

        /**
         * <p>The aggregation period. Valid values of N: 1 to 21. Unit: seconds. Valid values: 60 and 300.</p>
         * <blockquote>
         * <p> If the MetricList.N.Type parameter is set to 1, the MetricList.N.Period parameter is required.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("Period")
        public String period;

        /**
         * <p>The timestamp when the metric data is generated. Valid values of N: 1 to 21. The timestamp can be in one of the following formats:</p>
         * <ul>
         * <li>The UTC timestamp that is in the YYYY-MM-DDThh:mm:ssZ format. Example: 20171012T132456.888+0800.</li>
         * <li>The UNIX timestamp of the LONG type. Example: 1508136760000.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1508136760000</p>
         */
        @NameInMap("Time")
        public String time;

        /**
         * <p>The type of the reported data. Valid values of N: 1 to 21. Valid values:</p>
         * <ul>
         * <li>0: reports raw data</li>
         * <li>1: reports aggregate data</li>
         * </ul>
         * <blockquote>
         * <p> We recommend that you report aggregate data in both the aggregation periods of 60s and 300s. Otherwise, you cannot query monitoring data in a time span that is more than seven days.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The collection of metric values. Valid values of N: 1 to 21.</p>
         * <blockquote>
         * <p> If the MetricList.N.Type parameter is set to 0, the keys in this parameter must be set to the specified value. CloudMonitor aggregates raw data in each aggregation period to generate multiple statistical values, such as the maximum value, the count, and the total value.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;value&quot;:10.5}</p>
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
