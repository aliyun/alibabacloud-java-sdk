// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ExploreTraceRequest extends TeaModel {
    @NameInMap("Attributes")
    public java.util.List<ExploreTraceRequestAttributes> attributes;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("Kind")
    public String kind;

    @NameInMap("MaxDuration")
    public Long maxDuration;

    @NameInMap("MinDuration")
    public Long minDuration;

    @NameInMap("Page")
    public Integer page;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SelectedField")
    public String selectedField;

    @NameInMap("ServiceIp")
    public String serviceIp;

    @NameInMap("ServiceName")
    public String serviceName;

    @NameInMap("SpanName")
    public String spanName;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("StatusCode")
    public String statusCode;

    @NameInMap("TraceId")
    public String traceId;

    public static ExploreTraceRequest build(java.util.Map<String, ?> map) throws Exception {
        ExploreTraceRequest self = new ExploreTraceRequest();
        return TeaModel.build(map, self);
    }

    public ExploreTraceRequest setAttributes(java.util.List<ExploreTraceRequestAttributes> attributes) {
        this.attributes = attributes;
        return this;
    }
    public java.util.List<ExploreTraceRequestAttributes> getAttributes() {
        return this.attributes;
    }

    public ExploreTraceRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ExploreTraceRequest setKind(String kind) {
        this.kind = kind;
        return this;
    }
    public String getKind() {
        return this.kind;
    }

    public ExploreTraceRequest setMaxDuration(Long maxDuration) {
        this.maxDuration = maxDuration;
        return this;
    }
    public Long getMaxDuration() {
        return this.maxDuration;
    }

    public ExploreTraceRequest setMinDuration(Long minDuration) {
        this.minDuration = minDuration;
        return this;
    }
    public Long getMinDuration() {
        return this.minDuration;
    }

    public ExploreTraceRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public ExploreTraceRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ExploreTraceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ExploreTraceRequest setSelectedField(String selectedField) {
        this.selectedField = selectedField;
        return this;
    }
    public String getSelectedField() {
        return this.selectedField;
    }

    public ExploreTraceRequest setServiceIp(String serviceIp) {
        this.serviceIp = serviceIp;
        return this;
    }
    public String getServiceIp() {
        return this.serviceIp;
    }

    public ExploreTraceRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public ExploreTraceRequest setSpanName(String spanName) {
        this.spanName = spanName;
        return this;
    }
    public String getSpanName() {
        return this.spanName;
    }

    public ExploreTraceRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public ExploreTraceRequest setStatusCode(String statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public String getStatusCode() {
        return this.statusCode;
    }

    public ExploreTraceRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class ExploreTraceRequestAttributes extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("Value")
        public String value;

        public static ExploreTraceRequestAttributes build(java.util.Map<String, ?> map) throws Exception {
            ExploreTraceRequestAttributes self = new ExploreTraceRequestAttributes();
            return TeaModel.build(map, self);
        }

        public ExploreTraceRequestAttributes setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ExploreTraceRequestAttributes setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ExploreTraceRequestAttributes setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
