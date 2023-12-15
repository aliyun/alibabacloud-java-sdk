// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20181219.models;

import com.aliyun.tea.*;

public class ARMSQueryDataSetRequest extends TeaModel {
    @NameInMap("DatasetId")
    public Long datasetId;

    @NameInMap("DateStr")
    public String dateStr;

    @NameInMap("Dimensions")
    public java.util.List<ARMSQueryDataSetRequestDimensions> dimensions;

    @NameInMap("HungryMode")
    public Boolean hungryMode;

    @NameInMap("IntervalInSec")
    public Integer intervalInSec;

    @NameInMap("IsDrillDown")
    public Boolean isDrillDown;

    @NameInMap("Limit")
    public Integer limit;

    @NameInMap("MaxTime")
    public Long maxTime;

    @NameInMap("Measures")
    public java.util.List<String> measures;

    @NameInMap("MinTime")
    public Long minTime;

    @NameInMap("OptionalDims")
    public java.util.List<ARMSQueryDataSetRequestOptionalDims> optionalDims;

    @NameInMap("OrderByKey")
    public String orderByKey;

    @NameInMap("ReduceTail")
    public Boolean reduceTail;

    @NameInMap("RequiredDims")
    public java.util.List<ARMSQueryDataSetRequestRequiredDims> requiredDims;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static ARMSQueryDataSetRequest build(java.util.Map<String, ?> map) throws Exception {
        ARMSQueryDataSetRequest self = new ARMSQueryDataSetRequest();
        return TeaModel.build(map, self);
    }

    public ARMSQueryDataSetRequest setDatasetId(Long datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    public Long getDatasetId() {
        return this.datasetId;
    }

    public ARMSQueryDataSetRequest setDateStr(String dateStr) {
        this.dateStr = dateStr;
        return this;
    }
    public String getDateStr() {
        return this.dateStr;
    }

    public ARMSQueryDataSetRequest setDimensions(java.util.List<ARMSQueryDataSetRequestDimensions> dimensions) {
        this.dimensions = dimensions;
        return this;
    }
    public java.util.List<ARMSQueryDataSetRequestDimensions> getDimensions() {
        return this.dimensions;
    }

    public ARMSQueryDataSetRequest setHungryMode(Boolean hungryMode) {
        this.hungryMode = hungryMode;
        return this;
    }
    public Boolean getHungryMode() {
        return this.hungryMode;
    }

    public ARMSQueryDataSetRequest setIntervalInSec(Integer intervalInSec) {
        this.intervalInSec = intervalInSec;
        return this;
    }
    public Integer getIntervalInSec() {
        return this.intervalInSec;
    }

    public ARMSQueryDataSetRequest setIsDrillDown(Boolean isDrillDown) {
        this.isDrillDown = isDrillDown;
        return this;
    }
    public Boolean getIsDrillDown() {
        return this.isDrillDown;
    }

    public ARMSQueryDataSetRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public ARMSQueryDataSetRequest setMaxTime(Long maxTime) {
        this.maxTime = maxTime;
        return this;
    }
    public Long getMaxTime() {
        return this.maxTime;
    }

    public ARMSQueryDataSetRequest setMeasures(java.util.List<String> measures) {
        this.measures = measures;
        return this;
    }
    public java.util.List<String> getMeasures() {
        return this.measures;
    }

    public ARMSQueryDataSetRequest setMinTime(Long minTime) {
        this.minTime = minTime;
        return this;
    }
    public Long getMinTime() {
        return this.minTime;
    }

    public ARMSQueryDataSetRequest setOptionalDims(java.util.List<ARMSQueryDataSetRequestOptionalDims> optionalDims) {
        this.optionalDims = optionalDims;
        return this;
    }
    public java.util.List<ARMSQueryDataSetRequestOptionalDims> getOptionalDims() {
        return this.optionalDims;
    }

    public ARMSQueryDataSetRequest setOrderByKey(String orderByKey) {
        this.orderByKey = orderByKey;
        return this;
    }
    public String getOrderByKey() {
        return this.orderByKey;
    }

    public ARMSQueryDataSetRequest setReduceTail(Boolean reduceTail) {
        this.reduceTail = reduceTail;
        return this;
    }
    public Boolean getReduceTail() {
        return this.reduceTail;
    }

    public ARMSQueryDataSetRequest setRequiredDims(java.util.List<ARMSQueryDataSetRequestRequiredDims> requiredDims) {
        this.requiredDims = requiredDims;
        return this;
    }
    public java.util.List<ARMSQueryDataSetRequestRequiredDims> getRequiredDims() {
        return this.requiredDims;
    }

    public ARMSQueryDataSetRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static class ARMSQueryDataSetRequestDimensions extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public String value;

        public static ARMSQueryDataSetRequestDimensions build(java.util.Map<String, ?> map) throws Exception {
            ARMSQueryDataSetRequestDimensions self = new ARMSQueryDataSetRequestDimensions();
            return TeaModel.build(map, self);
        }

        public ARMSQueryDataSetRequestDimensions setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ARMSQueryDataSetRequestDimensions setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ARMSQueryDataSetRequestDimensions setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ARMSQueryDataSetRequestOptionalDims extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public String value;

        public static ARMSQueryDataSetRequestOptionalDims build(java.util.Map<String, ?> map) throws Exception {
            ARMSQueryDataSetRequestOptionalDims self = new ARMSQueryDataSetRequestOptionalDims();
            return TeaModel.build(map, self);
        }

        public ARMSQueryDataSetRequestOptionalDims setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ARMSQueryDataSetRequestOptionalDims setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ARMSQueryDataSetRequestOptionalDims setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ARMSQueryDataSetRequestRequiredDims extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public String value;

        public static ARMSQueryDataSetRequestRequiredDims build(java.util.Map<String, ?> map) throws Exception {
            ARMSQueryDataSetRequestRequiredDims self = new ARMSQueryDataSetRequestRequiredDims();
            return TeaModel.build(map, self);
        }

        public ARMSQueryDataSetRequestRequiredDims setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ARMSQueryDataSetRequestRequiredDims setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ARMSQueryDataSetRequestRequiredDims setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
