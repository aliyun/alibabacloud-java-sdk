// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutHybridMonitorMetricDataRequest extends TeaModel {
    /**
     * <p>The list of monitoring data.</p>
     * <p>Valid values of N: 1 to 100.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("MetricList")
    public java.util.List<PutHybridMonitorMetricDataRequestMetricList> metricList;

    /**
     * <p>The name of the metric namespace.</p>
     * <p>For more information about how to obtain the name of a metric namespace, see <a href="https://help.aliyun.com/document_detail/428880.html">DescribeHybridMonitorNamespaceList</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>default-aliyun</p>
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
         * <p>The label key of the metric.</p>
         * <p>Valid values of N: 1 to 100.</p>
         * <p>Format: The key can contain uppercase letters, lowercase letters, digits, and underscores (_). It must start with an uppercase letter, a lowercase letter, or an underscore.</p>
         * <blockquote>
         * <p>You must specify both Key and Value.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>IP</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The label value of the metric.</p>
         * <p>Valid values of N: 1 to 100.</p>
         * <blockquote>
         * <p>You must specify both Key and Value.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
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
         * <p>The list of labels for the metric.</p>
         * <p>Valid values of N: 1 to 100.</p>
         * <p>Identifiers such as app, ip, and hostName.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;Key&quot;:&quot;IP&quot;,&quot;Value&quot;:&quot;192.168.XX.XX&quot;}]</p>
         */
        @NameInMap("Labels")
        public java.util.List<PutHybridMonitorMetricDataRequestMetricListLabels> labels;

        /**
         * <p>The name of the metric.</p>
         * <p>Valid values of N: 1 to 100.</p>
         * <p>Format: The name can contain uppercase letters, lowercase letters, digits, and underscores (_). It must start with an uppercase or lowercase letter.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CPU_Usage</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The timestamp when the monitoring data is reported.</p>
         * <p>Valid values of N: 1 to 100.</p>
         * <p>Unit: milliseconds. Default value: the current time.</p>
         * 
         * <strong>example:</strong>
         * <p>1640776119473</p>
         */
        @NameInMap("TS")
        public Long TS;

        /**
         * <p>The value of the metric.</p>
         * <p>Valid values of N: 1 to 100.</p>
         * <p>Format: integer or floating-point number.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>90</p>
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
