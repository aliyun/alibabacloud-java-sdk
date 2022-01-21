// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutHybridMonitorMetricDataRequest extends TeaModel {
    // 上报的监控数据
    @NameInMap("MetricList")
    public java.util.List<PutHybridMonitorMetricDataRequestMetricList> metricList;

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
        // 只能是英文字母、数字、下划线
        @NameInMap("Key")
        public String key;

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
        // 标签，Key只能是英文字母、数字、下划线
        @NameInMap("Labels")
        public java.util.List<PutHybridMonitorMetricDataRequestMetricListLabels> labels;

        // 指标名，只能是英文字母、数字、下划线
        @NameInMap("Name")
        public String name;

        // 时间戳，unix毫秒数，如果不传会使用服务器时间
        @NameInMap("TS")
        public Long TS;

        // 监控值，浮点或整型
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
