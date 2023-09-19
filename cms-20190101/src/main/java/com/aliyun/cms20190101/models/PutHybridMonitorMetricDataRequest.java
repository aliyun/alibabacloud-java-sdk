// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutHybridMonitorMetricDataRequest extends TeaModel {
    /**
     * <p>The monitoring data.</p>
     * <br>
     * <p>Valid values of N: 1 to 100.</p>
     */
    @NameInMap("MetricList")
    public java.util.List<PutHybridMonitorMetricDataRequestMetricList> metricList;

    /**
     * <p>The name of the namespace.</p>
     * <br>
     * <p>For information about how to obtain the name of a namespace, see [DescribeHybridMonitorNamespaceList](~~428880~~).</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("RegionId")
    public String regionId;

    public static PutHybridMonitorMetricDataRequest build(java.util.Map<String, ?> map) throws Exception {
        PutHybridMonitorMetricDataRequest self = new PutHybridMonitorMetricDataRequest();
        return TeaModel.build(map, self);
    }

    public PutHybridMonitorMetricDataRequest setMetricList(java.util.List<PutHybridMonitorMetricDataRequestMetricList> metricList) {
        this.metricList = metricList;
        return this;
    }
    public java.util.List<PutHybridMonitorMetricDataRequestMetricList> getMetricList() {
        return this.metricList;
    }

    public PutHybridMonitorMetricDataRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public PutHybridMonitorMetricDataRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class PutHybridMonitorMetricDataRequestMetricListLabels extends TeaModel {
        /**
         * <p>The tag key of the metric.</p>
         * <br>
         * <p>Valid values of N: 1 to 100.</p>
         * <br>
         * <p>The key can contain letters, digits, and underscores (*). The key must start with a letter or an underscore (*).</p>
         * <br>
         * <p>>  You must specify both the Key and Value parameters.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the metric.</p>
         * <br>
         * <p>Valid values of N: 1 to 100.</p>
         * <br>
         * <p>>  You must specify both the Key and Value parameters.</p>
         */
        @NameInMap("Value")
        public String value;

        public static PutHybridMonitorMetricDataRequestMetricListLabels build(java.util.Map<String, ?> map) throws Exception {
            PutHybridMonitorMetricDataRequestMetricListLabels self = new PutHybridMonitorMetricDataRequestMetricListLabels();
            return TeaModel.build(map, self);
        }

        public PutHybridMonitorMetricDataRequestMetricListLabels setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public PutHybridMonitorMetricDataRequestMetricListLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class PutHybridMonitorMetricDataRequestMetricList extends TeaModel {
        /**
         * <p>The tags of the metric.</p>
         * <br>
         * <p>Valid values of N: 1 to 100.</p>
         */
        @NameInMap("Labels")
        public java.util.List<PutHybridMonitorMetricDataRequestMetricListLabels> labels;

        /**
         * <p>The metric name.</p>
         * <br>
         * <p>Valid values of N: 1 to 100.</p>
         * <br>
         * <p>The name can contain letters, digits, and underscores (\_). The name must start with a letter.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The timestamp when the monitoring data is imported.</p>
         * <br>
         * <p>Valid values of N: 1 to 100.</p>
         * <br>
         * <p>Unit: milliseconds. By default, the current timestamp is used.</p>
         */
        @NameInMap("TS")
        public Long TS;

        /**
         * <p>The value of the metric.</p>
         * <br>
         * <p>Valid values of N: 1 to 100.</p>
         * <br>
         * <p>The value must be an integer or a floating-point number.</p>
         */
        @NameInMap("Value")
        public String value;

        public static PutHybridMonitorMetricDataRequestMetricList build(java.util.Map<String, ?> map) throws Exception {
            PutHybridMonitorMetricDataRequestMetricList self = new PutHybridMonitorMetricDataRequestMetricList();
            return TeaModel.build(map, self);
        }

        public PutHybridMonitorMetricDataRequestMetricList setLabels(java.util.List<PutHybridMonitorMetricDataRequestMetricListLabels> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<PutHybridMonitorMetricDataRequestMetricListLabels> getLabels() {
            return this.labels;
        }

        public PutHybridMonitorMetricDataRequestMetricList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public PutHybridMonitorMetricDataRequestMetricList setTS(Long TS) {
            this.TS = TS;
            return this;
        }
        public Long getTS() {
            return this.TS;
        }

        public PutHybridMonitorMetricDataRequestMetricList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
