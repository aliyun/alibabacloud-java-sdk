// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210519.models;

import com.aliyun.tea.*;

public class QueryDatasetRequest extends TeaModel {
    @NameInMap("DatasetId")
    public Long datasetId;

    @NameInMap("IntervalInSec")
    public Integer intervalInSec;

    @NameInMap("DateStr")
    public String dateStr;

    @NameInMap("MinTime")
    public Long minTime;

    @NameInMap("MaxTime")
    public Long maxTime;

    @NameInMap("IsDrillDown")
    public Boolean isDrillDown;

    @NameInMap("OrderByKey")
    public String orderByKey;

    @NameInMap("Limit")
    public Integer limit;

    @NameInMap("ReduceTail")
    public Boolean reduceTail;

    @NameInMap("HungryMode")
    public Boolean hungryMode;

    @NameInMap("ProxyUserId")
    public String proxyUserId;

    @NameInMap("Measures")
    public java.util.List<String> measures;

    @NameInMap("Dimensions")
    public java.util.List<QueryDatasetRequestDimensions> dimensions;

    @NameInMap("RequiredDims")
    public java.util.List<QueryDatasetRequestRequiredDims> requiredDims;

    @NameInMap("OptionalDims")
    public java.util.List<QueryDatasetRequestOptionalDims> optionalDims;

    public static QueryDatasetRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDatasetRequest self = new QueryDatasetRequest();
        return TeaModel.build(map, self);
    }

    public QueryDatasetRequest setDatasetId(Long datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    public Long getDatasetId() {
        return this.datasetId;
    }

    public QueryDatasetRequest setIntervalInSec(Integer intervalInSec) {
        this.intervalInSec = intervalInSec;
        return this;
    }
    public Integer getIntervalInSec() {
        return this.intervalInSec;
    }

    public QueryDatasetRequest setDateStr(String dateStr) {
        this.dateStr = dateStr;
        return this;
    }
    public String getDateStr() {
        return this.dateStr;
    }

    public QueryDatasetRequest setMinTime(Long minTime) {
        this.minTime = minTime;
        return this;
    }
    public Long getMinTime() {
        return this.minTime;
    }

    public QueryDatasetRequest setMaxTime(Long maxTime) {
        this.maxTime = maxTime;
        return this;
    }
    public Long getMaxTime() {
        return this.maxTime;
    }

    public QueryDatasetRequest setIsDrillDown(Boolean isDrillDown) {
        this.isDrillDown = isDrillDown;
        return this;
    }
    public Boolean getIsDrillDown() {
        return this.isDrillDown;
    }

    public QueryDatasetRequest setOrderByKey(String orderByKey) {
        this.orderByKey = orderByKey;
        return this;
    }
    public String getOrderByKey() {
        return this.orderByKey;
    }

    public QueryDatasetRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public QueryDatasetRequest setReduceTail(Boolean reduceTail) {
        this.reduceTail = reduceTail;
        return this;
    }
    public Boolean getReduceTail() {
        return this.reduceTail;
    }

    public QueryDatasetRequest setHungryMode(Boolean hungryMode) {
        this.hungryMode = hungryMode;
        return this;
    }
    public Boolean getHungryMode() {
        return this.hungryMode;
    }

    public QueryDatasetRequest setProxyUserId(String proxyUserId) {
        this.proxyUserId = proxyUserId;
        return this;
    }
    public String getProxyUserId() {
        return this.proxyUserId;
    }

    public QueryDatasetRequest setMeasures(java.util.List<String> measures) {
        this.measures = measures;
        return this;
    }
    public java.util.List<String> getMeasures() {
        return this.measures;
    }

    public QueryDatasetRequest setDimensions(java.util.List<QueryDatasetRequestDimensions> dimensions) {
        this.dimensions = dimensions;
        return this;
    }
    public java.util.List<QueryDatasetRequestDimensions> getDimensions() {
        return this.dimensions;
    }

    public QueryDatasetRequest setRequiredDims(java.util.List<QueryDatasetRequestRequiredDims> requiredDims) {
        this.requiredDims = requiredDims;
        return this;
    }
    public java.util.List<QueryDatasetRequestRequiredDims> getRequiredDims() {
        return this.requiredDims;
    }

    public QueryDatasetRequest setOptionalDims(java.util.List<QueryDatasetRequestOptionalDims> optionalDims) {
        this.optionalDims = optionalDims;
        return this;
    }
    public java.util.List<QueryDatasetRequestOptionalDims> getOptionalDims() {
        return this.optionalDims;
    }

    public static class QueryDatasetRequestDimensions extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public String value;

        public static QueryDatasetRequestDimensions build(java.util.Map<String, ?> map) throws Exception {
            QueryDatasetRequestDimensions self = new QueryDatasetRequestDimensions();
            return TeaModel.build(map, self);
        }

        public QueryDatasetRequestDimensions setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public QueryDatasetRequestDimensions setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryDatasetRequestDimensions setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryDatasetRequestRequiredDims extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public String value;

        public static QueryDatasetRequestRequiredDims build(java.util.Map<String, ?> map) throws Exception {
            QueryDatasetRequestRequiredDims self = new QueryDatasetRequestRequiredDims();
            return TeaModel.build(map, self);
        }

        public QueryDatasetRequestRequiredDims setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public QueryDatasetRequestRequiredDims setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryDatasetRequestRequiredDims setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryDatasetRequestOptionalDims extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public String value;

        public static QueryDatasetRequestOptionalDims build(java.util.Map<String, ?> map) throws Exception {
            QueryDatasetRequestOptionalDims self = new QueryDatasetRequestOptionalDims();
            return TeaModel.build(map, self);
        }

        public QueryDatasetRequestOptionalDims setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public QueryDatasetRequestOptionalDims setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryDatasetRequestOptionalDims setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
