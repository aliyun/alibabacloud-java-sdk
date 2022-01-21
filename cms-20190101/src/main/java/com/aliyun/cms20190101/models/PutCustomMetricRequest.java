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
        @NameInMap("Dimensions")
        public String dimensions;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("MetricName")
        public String metricName;

        @NameInMap("Period")
        public String period;

        @NameInMap("Time")
        public String time;

        @NameInMap("Type")
        public String type;

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
